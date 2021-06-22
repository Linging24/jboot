package com.linging.model.dto;

import io.jboot.app.config.annotation.ConfigModel;

import java.io.Serializable;

/**
 * @author Linging
 * @version 1.0.0
 * @since 1.0
 */
@ConfigModel(prefix = "linging")
public class MyConfig implements Serializable {

    private String name;
    private int age;
    private String sex;
    private double sarry;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSarry() {
        return sarry;
    }

    public void setSarry(double sarry) {
        this.sarry = sarry;
    }

    @Override
    public String toString() {
        return "MyMessage{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", sarry=" + sarry +
                '}';
    }
}
