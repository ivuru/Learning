import threading

def func():
    while True:
        print("子スレッド")

if __name__ == "__main__":
    thread = threading.Thread(target=func) # 処理を割り当てる

    thread.start() # スレッドを起動する

    print("親スレッド")