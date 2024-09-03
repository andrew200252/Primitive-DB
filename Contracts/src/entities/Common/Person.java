package entities.Common;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private int id;
    private String fio;
    private String birthday;
    private String sex;
    private String passport;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

//    public int getAge() {
//        if (birthday == null){
//            throw new IllegalStateException("Birth date is not set");
//        }
//        LocalDate currentDate = LocalDate.now();
//        return Period.between(birthday, currentDate).getYears();
//    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "{ id=" + id +
                ", fio='" + fio + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", passport='" + passport + '\'' +
                ", age=" + age + " }";
    }


}
