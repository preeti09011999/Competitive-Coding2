#include<iostream>
using namespace std;
template<class bubble>
bubble sort(bubble a[], int n)
{
    int i, j;
    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                bubble element;
                element = a[i];
                a[i] = a[j];
                a[j] = element;
            }
        }
    }
}

int main()
{
    int a[4]={76,90,88,34};
    char b[4]={'p','t','d','a'};
    cout<<"                                                  Preeti";
    sort(a,4);
    cout<<"\n  Sorted Order Integers: ";
    for(int i=0;i<4;i++)
        cout<<a[i]<<"\t";
    sort(b,4);
    cout<<"\n\n  Sorted Order Characters: ";
    for(int j=0;j<4;j++)
        cout<<b[j]<<"\t";
    cout<<"\n  Roll no. =37\n";
    return 0;
}
