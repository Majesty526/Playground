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
 for (int i = 0;i<col;i++)
  {
    for (int j = 0;j<row;j++)
    {
      std::cout<<arr[j][i]<<" ";
    }
   std::cout<<"\n";
  }

}