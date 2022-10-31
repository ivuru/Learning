#include <string>
#include <iostream>
using namespace std;

class Prototype
{
protected:
    string Message;
    char Emoji;

public:
    Prototype(char emoji):
        Emoji(emoji),
        Message()
    {};

    virtual ~Prototype() {};

    virtual Prototype* Clone() const = 0;

    virtual void Use(string)const = 0;

};