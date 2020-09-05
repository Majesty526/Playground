#include <iostream>
void swap (int &a,int &b)
{
  int temp = 0;
  temp = a;
  a = b;
  b = temp;
}
using namespace std;

int main() 
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap (a,b);
  std::cout<<"After swapping a= "<<a<<" and b="<<b;
    return 0;
}