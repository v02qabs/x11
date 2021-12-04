#include <GL/glut.h>

void display(void)
{}


int main(int argc, char *argv[])
{
	glutInit(&argc, argv);
	glutCreateWindow("Hello");
	glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}

