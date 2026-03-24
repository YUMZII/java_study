package day7;

public class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1, 2, 3);
		System.out.println(p3.getLocation());
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point {
	int z;
	Point3D(int x, int y, int z) {
		super(x,y);//조상이 갖고 있는 걸 가져올 떄, super를 사용해서 가져와야됨
		this.z = z; // z는 없기 때문에 this사용하면 됨
	}
	String getLocation() { // 오버라이딩
		return super.getLocation() + ", z :" + z;
	}
}
//x :1, y :2, z :3
