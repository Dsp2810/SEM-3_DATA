#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int binarysearch(int *arr, int size, int f_num)
{
    int l = 0, r = size - 1, mid;

    while (l <= r)
    {
        mid = (l + r) / 2;
        if (arr[mid] == f_num)
        {
            return mid;
        }
        if (arr[mid] < f_num)
        {
            l = mid + 1;
        }
        else
        {
            r = mid - 1;
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
    cout << "ENTER THE KEY TO FIND THE ELEMENT;" << endl;
    cin >> key;
    int x = binarysearch(arr, size, key);
    if (x != -1)
    {
        cout << "ELEMENT :" << key << ":FOUND AT THE INDEX NO:[" << x << "]";
    }
    else
    {
        cout << "ELEMNT NOT FOUND";
    }

    return 0;
    cout << endl
         << "23CS060 DHAVAL S PATEL";
}