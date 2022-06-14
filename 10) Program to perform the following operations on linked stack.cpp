//create PUSH POP

#include<iostream>
using namespace std;
class node
{
    public:
    int data;
    node* next;
}*temp, *top;
void push(int var)
{
    temp = new node();
    temp->data = var;
    temp->next = top;
    top = temp;
}
void display()
{
    temp = top;
    if(top == NULL)
    {
        cout<<"Stack Underflow"<<endl;
    }
    else
    {
        while(temp)
        {
            cout<<temp->data<<"-->";
            temp = temp->next;
        }
    }
}
void pop()
{
    if(top == NULL)
    {
        cout<<"Stack Underflow"<<endl;
    }
    else
    {
        cout<<"Poped element : "<<top->data<<endl;
        top = top->next;
    }
}
int main()
{
    int value,num;
    while(true)
    {
        cout<<"1. Push"<<endl;
        cout<<"2. Display"<<endl;
        cout<<"3. Pop"<<endl;
        cout<<"4. Exit"<<endl;
        cin>>value;
        switch (value)
        {
        case 1: cout<<"enter the value"<<endl;
                cin>>num;
                push(num);
            break;
        case 2: display();
            break;
        case 3: pop();
            break;
        case 4: std::abort();
            break;
        default:
            break;
        }
    }
    return 0;
}
