#include <iostream>
#include "Manager.h"
#include "MessageBox.h"
#include "UnderLinePen.h"

using namespace std;

int main()
{
    Manager* manager = new Manager();
    {
        manager->Register<MessageBox>("Box", '@');
        manager->Register<MessageBox>("line", '*');
        manager->Register<UnderLinePen>("under", '_');
    }

    {
        Prototype* p1 = manager->Create("Box");
        p1->Use("this is p1");
        delete p1;

        Prototype* p2 = manager->Create("line");
        p2->Use("this is p2");
        delete p2;

        Prototype* p3 = manager->Create("under");
        p3->Use("this is p3");
        delete p3;
    }

    delete manager;

    return 0;
}