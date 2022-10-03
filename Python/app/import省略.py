## 00-startup.py

class LazyImporter:
    def __init__(self, name: str, alias: str = None):
        self._name = name
        self._alias = alias or name

    def __repr__(self):
        return repr(self._mod)

    def __str__(self):
        return str(self._mod)

    def __getattr__(self, name):
        return getattr(self._mod, name)

    @property
    def _mod(self):
        from IPython import get_ipython
        import importlib
        mod = importlib.import_module(self._name)
        shell = get_ipython()
        shell.push({self._alias: mod})  # update namespace
        return mod