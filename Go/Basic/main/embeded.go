type Person struct {
    Name string
    Age  int
}
type Person2 struct {
    Person
    Age int
}

func main() {
    a := Person2{
        Person: Person{
            Age:  1,
            Name: "Tetsuji",
        },
        Age: 2,
    }
    fmt.Println(a.Person.Age) // 1
    fmt.Println(a.Age)        // 2
    fmt.Println(a.Name)       // Tetsuji
}
