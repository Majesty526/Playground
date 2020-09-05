#include<iostream>
int main()
{
int a;
  float b,c,d;
  std::cin>>a>>b;
  if ( b >=13.30)
  {
  	if ( a <= 13)
    {
      std::cout<<"$2.00";
    }
    else
    {
      std::cout<<"$5.00";
    }
  }
  else 
  {
    if ( a > 13)
    {
    	std::cout<<"$8.00";
    }
    else 
    {
      std::cout<<"$4.00";
    }
  }
}