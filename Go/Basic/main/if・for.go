// if, else if, else を用いる
package main // mainパッケージであることを宣言

import "fmt" // fmtモジュールをインポート

func main() {

	var hoge int = 10

	if hoge < 0 {
		fmt.Println("hogeは負の値です")
	} else if hoge < 10 {
		fmt.Println("hogeは10未満です")
	} else {
		fmt.Println("hogeは10以上です")
	}

	// ifの中にifを書くことも出来ます
	if hoge < 10 {
		fmt.Println("hogeは10未満です")
		if hoge < 0 {
			fmt.Println("hogeは負の値です")
		}
	}
}
