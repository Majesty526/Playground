#include<iostream>
  int main()
{
int a,b,c;
  std::cin>>a>>b>>c;
  int d = a*a*a ;

  if ( d >= c)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else 
    std::cout<<"Sorry Doctor! You need more bacteria.";
    
}