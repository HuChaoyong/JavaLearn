package Chapter11;

// 实现接口，
class PersonO implements Cloneable {

    private String name = null;

    public PersonO(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonO{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectClone {
    public static void main(String[] args) {
        PersonO p1 = new PersonO("张三");
        PersonO p2 = null;
        try {
            p2 = (PersonO)p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        p2.setName("李四");
        System.out.println("原始对象： " + p1);
        System.out.println("克隆对象： " + p2);

    }
}
