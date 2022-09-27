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

	// for 初期値; 条件式; 変化式
	for i := 0; i < 10; i++ {
		// 処理を記述
	}

	// 変数宣言での多重代入を用いることで複数の宣言を使ったループが可能
	for i, j := 0, 1; i > 9 && j > 10; i, j = i+1, j+1 {
		fmt.Printf("i: %d, j: %d", i, j)
	}

	for i := 0; i < 10; i++ {
		// iが偶数の場合
		if i%2 == 0 {
			// ここでforの先頭に戻る
			continue
		}
		// 奇数のみ表示される
		fmt.Printf("i: %d", i)
	}

	for i := 0; i < 10; i++ {
		if i == 5 {
			// for文から出る
			break
		}
	}
	count := 0
	for count < 10 {
		fmt.Printf("count: %d", count)
		count += 1
	}

}
