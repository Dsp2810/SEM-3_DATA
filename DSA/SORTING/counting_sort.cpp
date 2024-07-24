#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int* counter_sort(int* ar, int size)
{
    int max = ar[0];
    for (int i = 1; i < size; i++)
    {
        if (ar[i] > max)
        {
            max = ar[i];
        }
    }
    int* array = new int[max + 1](); 
    for (int j = 0; j < size; j++)
    {
        array[ar[j]]++;
    }
    for (int i = 1; i <= max; i++)
    {
        array[i] += array[i - 1];
    }
    int* final_array = new int[size];
    for (int i = size - 1; i >= 0; i--)
    {
        final_array[array[ar[i]] - 1] = ar[i];
        array[ar[i]]--;
    }
    return final_array;
}

int main()
{
    int size;
    cout << "ENTER THE SIZE OF THE ARRAY:" << endl;
    cin >> size;
    int* arr = new int[size];
    cout << "ENTER THE ELEMENTS OF THE ARRAY:" << endl;
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }
    int* sorted_array = counter_sort(arr, size);
    cout << "SORTED ARRAY:" << endl;
    for (int i = 0; i < size; i++)
    {
        cout << sorted_array[i] << " ";
    }
    cout << endl;


    return 0;
}
