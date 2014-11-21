// CylinderClass.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include "Cylinder.h"
#include <iostream>
using namespace std;

int _tmain(int argc, _TCHAR* argv[])
{
/*	Cylinder c1, c2(2.0, 4.0), c3(1.0, 8.0);
	double h, r;
	cout << "c1: ";
	c1.print(cout);
	cout << "c2: ";
	c2.print(cout);
	cout << "c3: ";
	c3.print(cout);
	cout << "c1 height and radius: " << c1.get_height()
	<< ", " << c1.get_radius() << endl;
	cout << "c3 volume: " << c3.volume() << endl;
	c2.scale(3.22);
	c3.scale(3.55);
	cout << "Scaled c2 height and radius: " << c2.get_height()
	<< ", " << c2.get_radius() << endl;
	c3.get_values(h, r);
	cout << "Scaled c3 height and radius: " << h << ", " << r << endl;
	c3.scale(2.15, 2.00);
	cout << "Scaled c3 volume: " << c3.volume() << endl;*/	

	//those for HW05 B
	Cylinder c1, c2(2.234, 5.185), c3(1.0, 10.0), c4;
	cout << "Output Check c1 : " << c1;
	cout << "Output Check c2, c3 :\n" << " " << c2 << " " << c3;
	c4 = c1 + c2;
	cout << "Addition Check c4 : " << c4;
	cout << "Addition Check c1 + c3 : " << c1 + c3;
	c4 *= 2.0;
	cout << "Multiplication Check c4 : " << c4;
	c3 *= 4.0;
	c4 *= 3.75;
	cout << "Multiplication Checks c3, c4 :\n" << " " << c3 << " " << c4;

	// for your refer http://www.cnblogs.com/CaiNiaoZJ/archive/2011/08/13/2137033.html
	//http://www.cnblogs.com/CaiNiaoZJ/archive/2011/08/12/2136598.html

	// you may delete this
	int i;
	cin>>i;


	return 0;
}

