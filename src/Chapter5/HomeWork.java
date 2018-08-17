package Chapter5;

import java.util.regex.*;

/**
 * 第五章的作业
 */


// 编写并测试一个 Address 类, 地址由 国家,省份, 城市,街道, 邮编
class Q1 {

    public static void show() {
        Q1 q1 = new Q1();
    }

    class Address {

        private String country;
        private String province;
        private String city;
        private String street;
        private String postcode;

        public String getAddress() {
            return country + province + city + street  + ", 邮编"+ postcode;
        }

        public Address(String country, String province, String city, String street, String postcode) {
            this.country = country;
            this.province = province;
            this.city = city;
            this.street = street;
            this.postcode = postcode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }
    }

    private Q1() {
        Address a1 = new Address("中华人民共和国", "四川省", "成都市", "莲新街道", "610000");
        System.out.println(a1.getAddress());
    }
}


class Q2 {

    public static void show() {
        Q2 q2 = new Q2();
    }

    class Employee {

        private String num;
        private String name;
        private double baseSalary;
        private double addSalary;

        public Employee(String number, String name, double baseSalary, double addSalary) {
            this.num = number;
            this.name = name;
            this.baseSalary = baseSalary;
            this.addSalary = addSalary;
        }

        // 计算得到增长的金额
        public double getAddSalaryMoney() {
            return baseSalary * addSalary / 100;
        }

        // 计算总工资
        public double getSalary() {
            return baseSalary + this.getAddSalaryMoney();
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        public void setBaseSalary(double baseSalary) {
            this.baseSalary = baseSalary;
        }

        public double getAddSalary() {
            return addSalary;
        }

        public void setAddSalary(double addSalary) {
            this.addSalary = addSalary;
        }
    }

    private Q2() {
        Employee e = new Employee("Nc001", "hcy", 8000, 20);
        System.out.println("get Employee salary: " + e.getSalary());
    }
}

class Q3 {

    public static void show() {
        Q3 q3 = new Q3();
    }

    public static void statisticsLetter(String inputStr, char[] arg) {
        char[] strArr = inputStr.toCharArray();
        int[] countArr = new int[arg.length];

        for (int i = 0 ; i < strArr.length; i++) {
            for (int j = 0; j < countArr.length; j++) {
                if (strArr[i] == arg[j]) {
                    countArr[j] ++;
                }
            }
        }
        for (int i = 0; i < countArr.length; i++) {
            System.out.println("字符 " + arg[i] + " 出现了" + countArr[i] + "次");
        }
    }

    public Q3() {
        char[] chars = {'n', 'o'};
        Q3.statisticsLetter("want you to know one thing", chars);
    }
}

class Q6 {
    public static void show() {
        Q6.q1();
        Q6.q2();
        Q6.q34();
        Q6.q5();
        Q6.q6("513479198603241275");
    }

    public static void q1() {
        String str = "Java技术学习班20070326";
        String reg = "\\d+";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println("取出日期: " + m.group());
        }
    }

    public static void q2() {
        String str = "MLDN JAVA";
        str = str.replace("JAVA", "J2EE");
        System.out.println("替换后的结果: " + str);
    }

    public static void q34() {
        String str = "Java技术学习班20070326";
        System.out.println("取出第8个字符是:" + str.toCharArray()[7]);
        str = str.replaceAll("0", "");
        System.out.println("清除所有0后:" + str);
    }

    public static void q5() {
        String str = "Java技术学习班20070326 LMDN 老师";
        str = str.replaceAll(" ", "");
        System.out.println("清除所有空格后: " + str);
    }

    public static void q6(String idNumber) {
        if (idNumber.length() != 18) {
            System.out.println("身份证号输入错误!");
            return;
        }

        String birth = idNumber.substring(6, 14);
        System.out.println("您身份证上的出生日期是: " + birth);
    }
}


public class HomeWork {
    public static void main(String[] args) {
        Q1.show();
        Q2.show();
        Q3.show();
        Q6.show();
    }
}
