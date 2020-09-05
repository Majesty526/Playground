#include<iostream>
using namespace std;
int main()
{
int a,b,c,d,e,f,g,h,i,j,k,l;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  j = a-(a*b)/100 + c;
  k = d-(d*e)/100 + f;
  l = g-(g*h)/100 + i;
  std::cout<<"In Flipkart Rs."<<j<<"\n";
  std::cout<<"In Snapdeal Rs."<<k<<"\n";
  std::cout<<"In Amazon Rs."<<l<<"\n";
  if (j<=k && j<=l)
    std::cout<<"He will prefer Flipkart";
  else if (k<j && k<l)
    std::cout<<"He will prefer Snapdeal";
  else 
    std::cout<<"He will prefer Amazon";


    
}