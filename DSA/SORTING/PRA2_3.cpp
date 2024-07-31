#include<bits/stdc++.h>
using namespace std;
int* wavesort(int* a,int n){
    for (int i = 0; i < n; i+=2)
    {
        if (i>0 && a[i-1] < a[i] ){
            int temp=a[i];
            a[i]=a[i-1];
            a[i-1]=temp;
        }
        if (i<n-1 && a[i] > a[i+1] ){
              int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
    }
    return a;
}
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        int a[n];
        for(int j=0;j<n;j++){
            cin>>a[j];
        }
        int* result = wavesort(a,n);
        for(int i=0;i<n;i++){
            cout<<result[i]<<" ";
        }
        cout<<endl;
    }
}