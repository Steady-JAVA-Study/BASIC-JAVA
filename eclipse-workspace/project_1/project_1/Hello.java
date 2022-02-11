package project_1;
import bb.*; //�ΰ� �̻��� ��Ű�� ��� ���ؼ� �ٸ� ��Ű������ Score Ŭ���� ����� import

class Person extends Score{//��� inheritance
private String data1;//data1=person name //encapsulation 
Person(){}//����Ʈ ������1
Person(String d1, String d3, int d4) {  //������2
	super(d3, d4); //�θ��� private data�� super�� ���� ������
	data1 = d1;
	}
String getData1() { return data1; } //name�� ������ �Լ�
public int get3() {
	return super.getData3();
}//�θ� ���� ������ ������ get �Լ� 
public String get4() {
	return super.getData4();
}//�θ� ����� ������ ������ get �Լ�
protected void show(){
	System.out.print("name : " + getData1());//�θ��Լ� protected void show() �� �������̵�(polymorphism)
}
void showScore() {
		System.out.print(" | subject name:" + get4()+"  | subject score :"+ get3() + "\n");
}
}
public class Hello {
public static void main(String[] args) {
Person std1 = new Person("Mike","Java",40);
Person std2 = new Person("Mama","Data Structure",100);
Person std3 = new Person("Man","English",90);
System.out.println(); std1.show();
System.out.println(); std1.showScore();
System.out.println(); std2.show();
System.out.println(); std2.showScore();
System.out.println(); std3.show();
System.out.println(); std3.showScore();

}
}
