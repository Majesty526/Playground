#include<iostream>
using namespace std;
int main()
{
  int a,count = 0;
  std::cin>>a;
 if(a==0)
 {
   count = 1;
 }
  while( a!=0)
{ 
  a =a/10;
  count++;
}
  std::cout<<count;
}
    