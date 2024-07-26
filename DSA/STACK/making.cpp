#include <iostream>
#include <bits/stdc++.h>

using namespace std;
int arr[7];
int top = -1;
int size = 7;

void pushStack(int *arr)
{
    cout << endl;

    if (top == size - 1)
    {
        cout << "[YOU HAVE REACHED TO THE MAXIMUM SIZE OF THE STACK]...." << endl;
    }
    else
    {
        int x;
        top = top + 1;
        cin >> x;
        arr[top] = x;
    }
    cout << endl;
}
void popStack(int *arr)
{
    cout << endl;
    if (top == -1)
    {
        cout << "[YOU HAVE REACHED TO THE END OF THE STACK AND STACK IS EMPTY]...." << endl;
    }
    else
    {
        cout << arr[top];
        top = top - 1;
    }
    cout << endl;
}
void peakStack(int *arr)
{
    cout << endl;
    if (top == -1)
    {
        cout << "[NO ELEMENTS IN THE STACK]......" << endl;
    }
    else
    {
        cout << "TOP-ELEMENT IS:" << arr[top];
    }
    cout << endl;
}
void displayStack(int *arr)
{
    cout << endl;
    for (int i = top; i >= 0; i--)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}
int main()
{
    int choice;
    while (choice != 5)
    {
        cout << "****************************" << endl
             << "ENTER YOUR CHOISE FOR " << endl
             << "1 . PUSHING ELEMNTS IN STACK" << endl
             << "2. POPING ELEMENTS FROM THE STACK" << endl
             << "3 . PEACK ELEMENT  IN STACK" << endl
             << "4. DISPLAY ELEMENTS FROM THE STACK" << endl    
             << "5. EXIT" << "****************************" << endl;
        cin >> choice;
        switch (choice)
        {
        case 1:
            pushStack(arr);
            break;
        case 2:
            popStack(arr);
            break;
        case 3:
            peakStack(arr);
            break;
        case 4:
            displayStack(arr);
            break;
        default:
            cout << "ENTER THE VALID CHOICE ";
        }
    }

    return 0;
    cout << endl
         << "23CS060 DHAVAL S PATEL";
}