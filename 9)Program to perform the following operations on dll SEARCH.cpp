// Create insert display searc

#include<iostream>
using namespace std;
class node
{
    public:
    int data;
    node* next;
    node* prev;
}*head, *tail, *temp;

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
void search(int var)
{
    temp = head;
    while(temp)
    {
        if(temp->data == var)
        {
            cout<<"element present in list"<<endl;
            break;
        }
        temp= temp->next;
    }
    if(temp == NULL)
    {
        cout<<"element not present in the list"<<endl;
    }
}

int main()
{
    int value,num;
    while(true)
    {
        cout<<"1. Insert"<<endl;
        cout<<"2. Display"<<endl;
        cout<<"3. Search"<<endl;
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
        case 3: cout<<"Enter the value to search"<<endl;
                cin>>num;
                search(num);
                break;
        case 4: std::abort();
            break;
        default:
            break;
        }
    }
    return 0;
}
