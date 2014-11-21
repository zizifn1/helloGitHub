
//you may need to remove ""stdafx.h""
#include "stdafx.h"
#include <iostream>
using namespace std;

class Cylinder
{
public:
	Cylinder();
	Cylinder(double height,double radius);
	double get_height();
	double get_radius();
	void get_values(double& h, double& r);
	double volume();
	void scale(double s);
	void scale(double sh,double sr);
	void print(ostream& out);
	//those for HW05 B
	void operator*=(double scalar);
	friend std::ostream&  operator<<(std::ostream &out, Cylinder& other);
	friend Cylinder operator+(Cylinder c1,Cylinder c2);
private:
	double height;
	double radius;
};// Don't forget the ";"
