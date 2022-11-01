// 抽象的な枠組み(製品)
abstract class Product {
    public abstract void method();
}
 
// 抽象的な枠組み(製品の作成)
abstract class Creator {
    protected abstract Product factoryMethod(String str);
    public final Product create(String str) {
        Product p = factoryMethod(str);
        return p;
    }
}
 
// 具体的な機能拡張(製品)
class ConcreteProduct extends Product {
    private String str;
    
    public ConcreteProduct(String str) {
        this.str = str;
    }
    
    //@Override
    public void method() {
        System.out.println("Hello " + str + "!");
    }
}
 
// 具体的な機能拡張(製品の作成)
class ConcreteCreator extends Creator {
    //@Override
    protected Product factoryMethod(String str) {
        return new ConcreteProduct(str);
    }
}
 
public class User {
 
    public static void main(String[] args) {
        // 製品の作成者を生成
        Creator creator = new ConcreteCreator();
        
        // 製品の作成
        Product java = creator.create("Java");
        Product cpp = creator.create("C++");
        Product cs = creator.create("C#");
        
        // 処理の呼び出し
        java.method();
        cpp.method();
        cs.method();
    }
 
}
