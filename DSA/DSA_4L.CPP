#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int srnums(int arr[], int size)
{
    int count = 0, final = 0;
    for (int i = 0; i <=size; i++)
    {
        count=0;
        for (int j = 0; j < size; j++)
        {
            if (arr[j] >= i)
            {
                count++;
            }
        }
            if (count == i)
            {
                return i;
            }
    }
    return -1;
}

int main()
{

    int size, key;

    cout << "ENTER THE SIZE OF THE ARRAY..:";
    cin >> size;
    int arr[size];
    cout << "ENTER THE ELEMENT OF ARRAY:" << endl;
    for (int i = 0; i < size; i++)
    {
        cout << "A[" << i + 1 << "]=";
        cin >> arr[i];
    }
    cout << srnums(arr, size);
    return 0;
    cout << endl
         << "23CS060 DHAVAL S PATEL";
}