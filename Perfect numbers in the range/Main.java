#include <iostream>
using namespace std;

int main() 
{
  int n,i,nm,mx,sum;
  std::cin>>nm>>mx;
for( n=nm; n<=mx; n++)
{
    i=1;
    sum = 0;
    while(i<n){
      if(n%i==0)
           sum=sum+i;
          i++;
    }
    if(sum==n)
      std::cout<<n<<" ";
  }
}