#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int matrix_binary(int **arr, int row, int collum, int target)
{
    int r = row * collum - 1;
    int l = 0, mid, mid_value;
    while (l <= r)
    {
        mid = l + (r - l) / 2;
        mid_value = arr[mid / collum][mid % collum];
        if (mid_value == target)
        {
            return mid;
        }
        else if (mid_value < target)
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
    int row, colum;
    cout << "ENTER THE ROW OF MATRIX:";
    cin >> row;
    cout << endl
         << "ENTER THE COLLUM OF MATRIX: ";
    cin >> colum;
    int** arr = new int*[row];
    for (int i = 0; i < row; ++i) {
        arr[i] = new int[colum];
    }

    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < colum; j++)
        {
            cout << "A[" << i + 1 << "][" << j + 1 << "]=";
            cin >> arr[i][j];
        }
    }
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < colum; j++)
        {
            cout << arr[i][j] << "    ";
        }
        cout << endl;
    }
    int target;
    cout << "ENTER THE TARGET:" << endl;
    cin >> target;
    int result = matrix_binary(arr, row, colum, target);
    if (target != -1)
    {
        cout << "ELEMENT FOUND:AT INDEX OF[" << result / colum << "][" << result % colum << "]" << endl;
    }

    return 0;
    cout << endl
         << "23CS060 DHAVAL S PATEL";
}