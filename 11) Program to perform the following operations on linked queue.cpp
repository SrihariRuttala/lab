// 11) Program to perform the following operations on linked queue

#include<iostream>
using namespace std;
class node
{
    public:
    int data;
    node* next;
}*front, *rear, *temp;
void enqueue(int var)
{
    temp = new node;
    temp->data = var;
    temp->next = NULL;
    if(front==NULL)
    {
        front = temp;
        rear = temp;
    }
    else
    {
        rear->next = temp;
        rear = temp;
    }
}
void display()
{
    temp = front;
    while(temp)
    {
        cout<<temp->data<<"-->";
        temp = temp->next;
    }
}
void dequeue()
{
    if(front == NULL)
    {
        cout<<"queue is empty"<<endl;
    }
    else
    {
        cout<<"Removed element : "<<front->data;
        front = front->next;
    }
}
int main()
{
    int value,num;
    while(true)
    {
        cout<<"1. Enquee"<<endl;
        cout<<"2. Display"<<endl;
        cout<<"3. Dequeue"<<endl;
        cout<<"4. Exit"<<endl;
        cin>>value;
        switch (value)
        {
        case 1: cout<<"enter the value"<<endl;
                cin>>num;
                enqueue(num);
            break;
        case 2: display();
                cout<<endl;
            break;
        case 3: dequeue();
            break;
        case 4: std::abort();
            break;
        default:
            break;
        }
    }
    return 0;
}
