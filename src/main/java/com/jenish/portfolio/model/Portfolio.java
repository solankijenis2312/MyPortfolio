package com.jenish.portfolio.model;

/**

 * This is a POJO (Plain Old Java Object) used to transfer data
 */
public class Portfolio {

    private String name;
    private String title;
    private String location;
    private Integer age;
    private String email;
    private String phone;
    private String github;
    private String linkedin;
    private String bio;


    /**
     * Default constructor
     */
    public Portfolio() {
    }


    public Portfolio(String name, String title, String location, String email, String phone) {
        this.name = name;
        this.title = title;
        this.location = location;
        this.email = email;
        this.phone = phone;
    }

    /**
     * Constructor with all information
     */
    public Portfolio(String name, String title, String location, Integer age, String email,
                     String phone, String github, String linkedin, String bio) {
        this.name = name;
        this.title = title;
        this.location = location;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.github = github;
        this.linkedin = linkedin;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location, String location1) {
        this.location = location;
        this.location= location1;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }



     //Convert object to string representation

    @Override
    public String toString() {
        return "Portfolio{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }


     //Check equality based on email (unique identifier)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Portfolio portfolio = (Portfolio) o;

        return email != null ? email.equals(portfolio.email) : portfolio.email == null;
    }


     // Generate hash code based on email
    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }
}