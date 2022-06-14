// 7)Program to perform the following operations on dll :
// 1 create
// 2 diff categories of insert
// 3 diff categories of delete
// 4 display 

#include<iostream>
using namespace std;
class node
{
    public:
    int data;
    node* next;
    node* prev;
}*head, *tail, *temp, *prev_temp;

void insert(int var)
{
    temp = new node;
    temp->data = var;
    temp->next = NULL;
    temp->prev = NULL;
    if(head==NULL)
    {
        head = temp;
        tail = temp;
    }
    else
    {
        tail->next = temp;
        temp->prev = tail;
        tail = temp;
    }
}
void display()
{
    temp = head;
    int val;
    cout<<"1. Enter 1 to display from front"<<endl;
    cout<<"2. Enter 2 to display from reverse"<<endl;
    cin>>val;
    if(val == 1)
    {
        temp = head;
        while(temp)
        {
            cout<<temp->data<<"-->";
            temp = temp->next;
        }
    }
    else
    {
        temp = tail;
        while(temp)
        {
            cout<<temp->data<<"-->";
            temp = temp->prev;
        }
    }
    
}
void deletee(int var)
{
    temp = head;
    prev_temp = new node();
    if(head->data == var)
    {
        head = head->next;
        head->prev = NULL;
    }
    else
    {
        while(temp)
        {
            if(temp->data == var)
            {
                prev_temp->next = temp->next;
            }
            prev_temp = temp;
            temp = temp->next;
        }
    }
}
int main()
{
    int value,num;
    while(true)
    {
        cout<<"1. Insert"<<endl;
        cout<<"2. Display"<<endl;
        cout<<"3. Delete"<<endl;
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
        case 3: cout<<"enter the value to delete"<<endl;
                cin>>num;
                deletee(num);
                break;
        case 4: std::abort();
            break;
        default:
            break;
        }
    }
    return 0;
}
