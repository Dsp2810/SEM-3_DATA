#include <iostream>
#include <bits/stdc++.h>

using namespace std;
int main()
{
    int row, colum;
    cout << "ENTER THE ROW OF MATRIX:";
    cin >> row;
    cout << endl
         << "ENTER THE COLLUM OF MATRIX: ";
    cin >> colum;
    int arr[row][colum];

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

    return 0;
    cout << endl
         << "23CS060 DHAVAL S PATEL";
}