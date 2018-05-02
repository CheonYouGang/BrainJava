/**
 * 2018. 5. 2. Dev By Cheon You Gang
   
   Circle.java
 */

/**
 * @author kosea112
 *
 */
public class Circle {
	
	public int radius;
	public String name;
	
	public Circle() {//�Ű����� ���� ���� ������
		radius = 1;
		name = ""; 
	}
	
	public Circle(int r, String n) { // �Ű� ������ ���� ������
		radius = r;
		name = n;
	}
	
	public double getArea() {//�޼ҵ�
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {//���θ޼ҵ�

		Circle pizza = new Circle(10, "�ڹ�����"); // Circle ��ü ����, ������ 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);

		Circle donut = new Circle(); // Circle ��ü ����, ������ 1
		donut.name = "��������";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);

	}

}
