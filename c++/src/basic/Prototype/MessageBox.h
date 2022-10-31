#include<string.h>
#include <unordered_map>
#include "Prototype.h"

using namespace std;

class MessageBox :public Prototype
{
public:
    MessageBox(char emoji) :
        Prototype(emoji)
    {}

    void Use(const string message)const override {
        int length = message.length();
        Line(length);

        cout << Emoji << " " << message << " " << Emoji << endl;

        Line(length);
    }

    Prototype* Clone()const override { return new MessageBox(*this); }

private:
    void Line(const int length)const {
        int space = 4;
        for (int i = 0; i < length + space; i++)
        {
            cout << Emoji;
        }
        cout << endl;
    }

};