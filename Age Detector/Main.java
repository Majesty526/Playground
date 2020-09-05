#include<iostream>
int main ()
{
  int a,b,c;
  std::cin>>a>>b;
  if ( a<=b )   
  {
    c = b-a;
    std::cout<<c; 
  }
  else 
  {
    c = (100 + b) - a;
    std::cout<<c;
  }
    return 0;
}
