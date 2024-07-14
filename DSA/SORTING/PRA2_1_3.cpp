#include<bits/stdc++.h>


using namespace std;

int* insertion_sort(int *arr,int size)
{
    int j;
    for(int i=0;i<size;i++)
    {
        int key =arr[i];
        j= i-1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1] =arr[j];
            j = j-1;
        }
        arr[j+1]=key;   
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
    int *sorted = insertion_sort(arr, size);
    cout << "SORTED ARRAY IS:" << endl;
    for (int i = 0; i < size; i++)
    {
        cout << sorted[i] << " ";
    }
    return 0;
    cout << endl
         << "23CS060 DHAVAL S PATEL";
}