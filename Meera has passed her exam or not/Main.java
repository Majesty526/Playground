#include<iostream>
using namespace std;
int main()
{
int n,b;
  int flag = 0;
  std::cin>>n;
  int arr[n];
  for (int i =0; i<n; i++)
  {
    std::cin>>arr[i];
  }
  std::cin>>b;
  for (int i =0 ; i<n ;i++)
  {
    if ( arr[i]==b)
    {
      flag = 1;
        break;
    }
}
  if(flag ==1)
  { 
    std::cout<<"She passed her exam";
  }
  else 
  { 
    std::cout<<"She failed";
}
}
