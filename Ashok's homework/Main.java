#include<iostream>
int main()
{
  int row,col,sum[10][10];
  std::cin>>row>>col;
  int arr[10][10];
  for (int i = 0;i<row;i++)
  {
    for (int j = 0;j<col;j++)
    {
      std::cin>>arr[i][j];
    }
  }

  int arra[10][10];
  for (int i = 0;i<row;i++)
  {
    for (int j = 0;j<col;j++)
    {
      std::cin>>arra[i][j];
    }
  }
 for (int i = 0;i<row;i++)
  {
    for (int j = 0;j<col;j++)
    {
      sum[i][j] = arr[i][j]+arra[i][j]; 
      std::cout<<sum[i][j]<<" ";
    }
   std::cout<<"\n";
  }

}