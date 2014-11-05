#include "stdafx.h"
#include <iostream>
#include <string>

using namespace std;

int _tmain(int argc, _TCHAR* argv[])
{
	string LargerString;
	string pattern;
	int difference=0;
	cout<< "Please input Larger string"<<endl;
	cin >> LargerString;
	cout<< "Comparison string is "<<LargerString<<endl;
	cout<< "Please input pattern string"<<endl;
	cin >> pattern;
	cout<< "pattern string is "<<pattern<<endl;

	if(pattern.length()>LargerString.length())
	{
		cout<< "pattern String should not length than Larger string"<<endl;
		return 0;
	}
	for(int i=0;i<LargerString.length()-pattern.length()+1;i++)
	{
		difference=0;
		string str=LargerString.substr(i,pattern.length());
		if(str==pattern)
			difference=0;
		else
		{
			for(int k=0;k<pattern.length();k++)
			{
				if(str[k]!=pattern[k])
				{
					difference++;
				}
			}
		}

		cout<<"Strting at index "<<i<<" there are "<<difference<<" differences"<<endl;
	}
	int a;
	cin>>a;
	return 0;
}
