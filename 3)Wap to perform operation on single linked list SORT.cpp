//create insert display sort

#include<iostream>
using namespace std;
class node
{
    public:
    int data;
    node* next;
}*head, *tail, *temp, *current;
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
void sort()
{
    int temp_var;
    current = head;
    if(head == NULL)
    {
        cout<<"List is empty";
    }
    while(current)
    {
        temp = current->next;
        while(temp)
        {
            if(current->data > temp->data)
            {
                temp_var = temp->data;
                temp->data = current->data;
                current->data = temp_var;
            }
            temp = temp->next;
        }
        current = current->next;
    }
}
int main()
{
    int value,num;
    while(true)
    {
        cout<<"1. Insert"<<endl;
        cout<<"2. Display"<<endl;
        cout<<"3. Sort"<<endl;
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
        case 3: cout<<"Before sort"<<endl;
                display();
                cout<<endl;
                cout<<"After sort"<<endl;
                sort();
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
