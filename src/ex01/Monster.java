package ex01;

public class Monster {
	
	private int id;
	private String name;
	private String grade;
	private int level;
	private int exp;
	private String element;
	
	// 생성자 만들기
	public Monster(int id, String name, String grade, int level, int exp, String element) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.level = level;
		this.exp = exp;
		this.element = element;
	}
	// getter/setter 메소드 만들기
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public int getLevel() {
		return level;
	}
	public int getExp() {
		return exp;
	}
	public String getElement() {
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
