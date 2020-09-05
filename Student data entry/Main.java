#include <iostream>
struct student
{
    char a[50];
    int b;
    float c;
};
int main() 
{
  struct student s1;
  char a;
  int b;
  float c;
  std::cin.getline(s1.a,50);
  std::cin>>s1.b;
  std::cin>>s1.c;
  std::cout<<"\n"<<"Student Details"<<"\n";
  std::cout<<"Name: "<<s1.a<<"\n";
  std::cout<<"Roll: "<<s1.b<<"\n";
  std::cout<<"Marks: "<<s1.c<<"\n";
}