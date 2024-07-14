#include <bits/stdc++.h>
using namespace std;
bool makepair(int *a, int n, int k)
{
    if (n / 2 == 1)
        return false;
    int count = 0;
    int v[n];
    for (int i = 0; i < n; i++)
    {
        v[i] = -1;
    }
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if ((a[i] + a[j]) % k == 0 && v[i]==-1 && v[j]==-1)
            {
                count++;
                v[i] = 1;
                v[j] = 1;
                cout << "{" << a[i] << "," << a[j] << "}" << endl;
            }
        }
    }
    cout<<"count=="<<count;
    if (count == n / 2)
    {
        return true;
    }
    else
    {
        return false;
    }
}
int main()
{
    int n, k;
    cout << "ENTER THE VALUE OF K=";
    cin >> k;
    cout << "ENTER THE SIZE OF ARRAY=";
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    if (makepair(a, n, k))
    {
        cout << "pair is created" << endl;
    }
    else
    {
        cout << "pair is not created" << endl;
    }
}