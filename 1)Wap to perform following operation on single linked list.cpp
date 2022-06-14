// 1)Program to perform the following operations on sll:
// 1 create
// 2 diff categories of insert
// 3 display 


#include<iostream>
using namespace std;
class node
{
    public:
    int data;
    node* next;
}*head, *tail, *temp;

void insert(int var)
{
    temp = new node;
    temp->data = var;
    temp->next = NULL;
    if(head==NULL)
    {
        head = temp;
        tail = temp;
    }
    else
    {
        tail->next = temp;
        tail = temp;
    }
}
void display()
{
    temp = head;
    while(temp)
    {
        cout<<temp->data<<"-->";
        temp = temp->next;
    }
}
int main()
{
    int value,num;
    while(true)
    {
        cout<<"1. Insert"<<endl;
        cout<<"2. Display"<<endl;
        cout<<"3. Exit"<<endl;
        cin>>value;
        switch (value)
        {
        case 1: cout<<"enter the value"<<endl;
                cin>>num;
                insert(num);
            break;
        case 2: display();
            break;
        case 3: 
            std::abort();
            break;
        default:
            break;
        }
    }
    return 0;
}
