#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void counting_sort(int *arr, int size, int expression)
{
    int *final = new int[size];
    int array[10] = {0};
    for (int i = 0; i < size; i++)
    {
        array[(arr[i] / expression) % 10]++;
    }
    for (int i = 1; i < 10; i++)
    {
        array[i] += array[i - 1];
    }
    for (int i = size - 1; i >= 0; i--)
    {
        final[array[(arr[i] / expression) % 10] - 1] = arr[i];
        array[(arr[i] / expression) % 10]--;
    }
    for (int i = 0; i < size; i++)
    {
        arr[i] = final[i];
    }
    delete[] final;
}
void radix_sort(int *ar, int n)
{
    int max = ar[0];
    for (int i = 1; i < n; i++)
    {
        if (max < ar[i])
        {
            max = ar[i];
        }
    }
    for (int pass = 1; (max / pass) > 0; pass *= 10)
    {
        counting_sort(ar, n, pass);
    }
    cout << "SORTED ARRAY IS:" << endl;
    for (int i = 0; i < n; i++)
    {
        cout << ar[i] << " ";
    }
}

using namespace std;

int main()
{
    int size;
    cout << "ENTER THE SIZE OF THE ARRAY:" << endl;
    cin >> size;
    int *arr = new int[size];
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }
    radix_sort(arr, size);
    return 0;
    cout << endl
         << "23CS060 DHAVAL S PATEL";
}