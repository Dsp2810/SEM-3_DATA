#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
    
void check_pair(vector<int> v,int k)
{
    int n= v.size(),count=0;
    cout<<n;
    vector<int> v1;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if((v[i]+v[j]) % k == 0)
            {
                count++;
                v1.push_back(i);
                v1.push_back(j);
            }
        }
    }

    cout<<"count"<<count<<endl;
    cout<<"n"<<n<<endl;
    cout<<n/2;

    if(count == n/2)
    {
        for(int i=0;i<v1.size();i++)
        {
            cout<<v1[i];
        }
    }
    else {
        cout<<-1;
    }
}
int main() {
        int size,key,x;
    cin>>size;
    vector<int> arr;
    for(int i=0;i<size;i++)
    {
        cin>>x;
        arr.push_back(x);
    }
    cin>>key;
    check_pair(arr,key);
    
    return 0;
}
