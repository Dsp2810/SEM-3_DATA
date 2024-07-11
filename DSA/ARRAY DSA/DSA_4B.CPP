#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int count_ans(int arr[], int size, int mid)
{

    int count = 0;
    for (int i = 0; i < size; i++)
    {
        if (arr[i] >= mid)
        {
            count++;
        }
    }
    return count;
}

int binary(int *arr, int size)
{
    int r = size, l = 0, mid;
    while (l <= r)
    {
        mid = l + (r - l) / 2;
        int ans = count_ans(arr, size, mid);
        if (ans == mid)
        {
            return mid;
        }
        else if (ans > mid)
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
    cout << binary(arr, size);
    return 0;
    cout << endl
         << "23CS060 DHAVAL S PATEL";
}