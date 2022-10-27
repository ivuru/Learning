package main

import (
    "fmt"
    "sort"
)

// People is the slice of Person
type People []Person

// Person is the struct
type Person struct {
    Name string
    Age  int
}

func main() {
    var data People = []Person{
        {"taro", 3},
        {"jiro", 1},
        {"saburo", 2},
    }
    sort.Sort(data)
    fmt.Println(data) // [{jiro 1} {saburo 2} {taro 3}]
}

// People構造体にInterfaceを実装する。
func (p People) Len() int           { return len(p) }
func (p People) Less(i, j int) bool { return p[i].Age < p[j].Age }
func (p People) Swap(i, j int)      { p[i], p[j] = p[j], p[i] }
