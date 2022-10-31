#include<string.h>
#include <unordered_map>
#include "Prototype.h"

using namespace std;

class UnderLinePen :public Prototype
{
public:
    UnderLinePen(char emoji) :
        Prototype(emoji)
    {}

    void Use(const string message)const override {
        int length = message.length();
        cout << message << endl;
        Line(length);
    }

    Prototype* Clone()const override { return new UnderLinePen(*this); }

private:
    void Line(const int length)const {
        for (int i = 0; i < length ; i++){
            cout << Emoji;
        }
    }

};