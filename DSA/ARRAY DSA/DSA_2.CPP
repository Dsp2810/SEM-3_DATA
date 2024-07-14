#include <bits/stdc++.h>
using namespace std;
int longword(string a)
{
    int count = 0, max = 0, f = 1;
    for (int i = 0; i < a.length(); i++)
    {
        if (a[i] == ' ')
        {
            f = 0;
            if (count > max)
            {
                max = count;
            }
            count = 0;
        }
        else
        {
            count++;
        }
    }
    if (f == 1)
    {
        return count;
    }
    else
    {
        return max;
    }
}
int main()
{
    string s;
    getline(cin, s);
    int x = longword(s);
    cout << "LONGEST WORD OF THIS STRING IS = " << x << endl;
}