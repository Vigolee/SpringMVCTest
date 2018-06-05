package cn.cqupt.controller;

import java.util.List;

/**
 * Created by Vigo on 17/7/12.
 */
public class Vigo {

    String name;

    List<Integer> list;

    public String getName() {
        return name;
    }

    public Vigo setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Vigo{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    public List<Integer> getList() {
        return list;
    }

    public Vigo setList(List<Integer> list) {
        this.list = list;
        return this;
    }
}
