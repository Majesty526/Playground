#include<iostream>
using namespace std;
int main()
{
int a;
  float b,c,d;
  std::cin>>a>>b;
  if ( a <= 2)
  {
    c = b + (b*0.50);
  	std::cout<<c;
  }
  else if ( a == 3)
  {
    d = b + b;
    std::cout<<d;
  } 
  else
  {
    std::cout<<"Number of items is more";
  }
    
}