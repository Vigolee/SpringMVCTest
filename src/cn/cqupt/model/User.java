package cn.cqupt.model;

/**
 * Created by Vigo on 17/5/9.
 */
public class User {
    public String id;
    public String name;

    public User(){}

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }
}
