package Allprogram;

public class TaskParametricConstractor {

int id;
String name;
int salary;
TaskParametricConstractor(int i,String s,int r)
{
	id=i;
	name=s;
	salary=r;
} 
void display()
{
	System.out.println(id+" "+name+" "+salary);
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	TaskParametricConstractor p1 = new TaskParametricConstractor(001,"Ram",30000);
	TaskParametricConstractor p2 = new TaskParametricConstractor(004,"Ramu",40000);
	TaskParametricConstractor p3 = new TaskParametricConstractor(006,"Janu",35000);
	p1.display();
    p2.display();
    p3.display();


	}

}
