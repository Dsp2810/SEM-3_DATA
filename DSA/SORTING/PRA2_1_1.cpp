#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int *bubble_sort(int arr[], int size)
{
    int swap = 0;
    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < size - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swap = 1;
            }
        }
        if (swap)
        {
        }
        else
        {
            break;
        }
    }
    return arr;
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
    cout << "SORTED ARRAY IS:" << endl;
    int *sorted = bubble_sort(arr, size);
    for (int i = 0; i < size; i++)
    {
        cout << sorted[i] << " ";
    }

    return 0;
    cout << endl
         << "23CS060 DHAVAL S PATEL";
}