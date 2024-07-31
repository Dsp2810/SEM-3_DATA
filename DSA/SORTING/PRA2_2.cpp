#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int *swap(int *Arr, int size)
{
    for (int i = size - 1; i >= 0; i--)
    {
        int j = 0;
        if (Arr[i] < Arr[j])
        {
            int t = Arr[i];
            Arr[i] = Arr[j];
            Arr[j] = t;
        }
        if(i > size-j-1)
        {
            j++;
        }
    }
    return Arr;
}
// 10 20 40 50 30 60

/*

i=5 --> j=0 (60,10)
        j=1; (60,20)
        j=2 (60,40)...
i =4   j=0 (30,50)
        10 20 40 30 50 60
        j=1  

*/
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
    int *array = swap(arr, size);
    for (int i = 0; i < size; i++)
    {
        cout << array[i] << " ";
    }
    return 0;
    cout << endl
         << "23CS060 DHAVAL S PATEL";
}