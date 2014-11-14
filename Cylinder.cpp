
// you may need to remove ""stdafx.h""
#include "stdafx.h"
#include "Cylinder.h"
#include <math.h>

#define M_PI       3.14159265358979323846

Cylinder::Cylinder()
{
	height = 1.0;
	radius = 1.0;
}
Cylinder::Cylinder(double height,double radius)
{
	this->height = height;
	this->radius = radius;
}
double Cylinder::get_height()
{
	return height;
}
double Cylinder::get_radius()
{
	return radius;
}
void Cylinder::get_values(double& h, double& r)
{
	h=height;
	r=radius;
}
double Cylinder::volume()
{
	// you may need using math.h M_PI instead of 3.14
	return M_PI*radius*radius*height;
}
void Cylinder::scale(double s)
{
	height*=s;
	radius*=s;
}
void Cylinder::scale(double sh,double sr)
{
	height*=sh;
	radius*=sr;
}
void Cylinder::print(ostream& out)
{
	out<<"Cylinder height: "<<height<<"   radius: "<<radius<<endl;

}
