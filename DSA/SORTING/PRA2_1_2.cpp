#include <iostream>

using namespace std;
int *selection_sort(int arr[], int size)
{
    int min;
    for (int i = 0; i < size - 1; i++)
    {
        min = i;
        for (int j = i + 1; j < size; j++)
        {
            if (arr[j] < arr[i])
            {
                min = j;
            }
        }
        if (min != i)
        {
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
    int *sorted = selection_sort(arr, size);
    cout << "SORTED ARRAY IS:" << endl;
    for (int i = 0; i < size; i++)
    {
        cout << sorted[i] << " ";
    }
    return 0;
    cout << endl
         << "23CS060 DHAVAL S PATEL";
}