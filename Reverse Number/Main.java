#include <iostream>
int main() 
{
int n,rem,rev;
  std::cin>>n;
  while ( n != 0)
  {
      rem = n % 10;
      n = n / 10;
      std::cout<<rem;
   } 
  return 0;
}