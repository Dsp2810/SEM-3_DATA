#include <bits/stdc++.h>
#include <iostream>

using namespace std;

int ternary(int arr[], int size, int key)
{
    int left = 0;
    int right = size - 1;
    int mid1, mid2;

    while (left <= right)
    {
        mid1 = left + (right - left) / 3;
        mid2 = right - (right - left) / 3;
        if (arr[mid1] == key)
        {
            return mid1;
        }
        if (arr[mid2] == key)
        {
            return mid2;
        }
        if (key < arr[mid1])
        {
            right = mid1 - 1;
        }
        else if (key > arr[mid2])
        {
            left = mid2 + 1;
        }
        else
        {
            right = mid2 - 1;
            left = mid1 + 1;
        }
    }
    return -1;
}

int main()
{

    int size;
    cout << "ENTER THE SIZE OF ARRAY:" << endl;
    cin >> size;
    int arr[size];
    for (int i = 0; i < size; i++)
    {
        cout << "A[" << i + 1 << "]=";
        cin >> arr[i];
    }
    int target;
    cout << "ENTER THE KEY ELEMENT TO FIND:" << endl;
    cin >> target;
    int r = ternary(arr, size, target);
    if (r == (-1))
    {
        cout << "ELEMENT NOT FOUND" << endl;
    }
    else
    {
        cout << "AT:[" << r << "]";
    }
    cout << endl
         << "23CS060 DHAVAL S PATEL";
    return 0;
}
