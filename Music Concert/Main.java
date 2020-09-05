#include<iostream>
#include<cstdlib>
int main()
{
int *a;
  int n;
  int odd =0;
  int even = 0;
  std::cin>>n;
  a = (int*) malloc (n*sizeof(int));
  for(int i = 0;i<n;i++)
  {
    std::cin>>*(a+i);
    if((*(a+i))%2==0 )
    { 
      even++;
    }
    else
    {
      odd++;
  	}
  }
  std::cout<<odd<<"\n";
  std::cout<<even;
  return 0;
}