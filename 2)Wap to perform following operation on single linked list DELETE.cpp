// 2)Program to perform the following operations on sll:
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
}*head, *tail, *temp, *temp_node; 
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
    cout<<endl;
}
void deletee(int var)
{
    temp = head;
    temp_node = new node();
    if(temp->data == var)
    {
        head = head->next;
        cout<<"Element not present in the list";
    }
    else
    {
        temp_node = head;
        temp = temp->next;
        while(temp)
        {
            cout<<temp->data;
            if(temp->data == var)
            {
                temp_node->next = temp->next;
                cout<<"Element removed";
                break;
            }
            temp_node = temp;
            temp = temp->next;
        }
    }
    if(temp == NULL)
    {
        cout<<"Element not present in the list"<<endl;
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
            break;
        case 3: cout<<"enter the value to delete"; 
                cin>>num;
            deletee(num);
            break;
        case 4: std::abort();
            break;
        default:
            abort();
            break;
        }
    }
    return 0;
}
