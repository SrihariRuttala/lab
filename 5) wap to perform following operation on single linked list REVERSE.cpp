// 5)Program to perform the following operations on sll:
// 1 create
// 2 diff categories of insert
// 3 reverse
// 4 display 

#include<iostream>
using namespace std;
class node
{
    public:
    int data;
    node* next;
}*head, *tail, *temp, *current, *previous;
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
void reverse()
{
    current = head;
    previous = NULL;
    temp = NULL;
    while(current)
    {
        temp = current->next;
        current->next = previous;
        previous = current;
        current = temp;
    }
    head = previous;
}
int main()
{
    int value,num;
    while(true)
    {
        cout<<"1. Insert"<<endl;
        cout<<"2. Display"<<endl;
        cout<<"3. Reverse"<<endl;
        cout<<"4. Exit"<<endl;
        cin>>value;
        switch (value)
        {
        case 1: cout<<"enter the value"<<endl;
                cin>>num;
                insert(num);
            break;
        case 2: display();
                cout<<endl;
                break;
        case 3: cout<<"Before reverse"<<endl;
                display();
                cout<<endl;
                cout<<"After reverse"<<endl;
                reverse();
                display();
                cout<<endl;
                break;
        case 4: std::abort();
            break;
        default:
            break;
        }
    }
    return 0;
}