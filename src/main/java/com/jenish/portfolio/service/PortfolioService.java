package com.jenish.portfolio.service;

//Handles data retrieval, processing, and business operations
//This service layer separates business logic from controller

import com.jenish.portfolio.model.Portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.constructor.SafeConstructor;

import javax.print.attribute.HashAttributeSet;
import javax.sound.sampled.Port;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PortfolioService {

    @Autowired
    private Portfolio portfolio;
    //return portfolio object with personal info

    public Portfolio get_portfolio_info()
    {

        portfolio.setName("Jenish Solanki");
        portfolio.setTitle("Java Enthusiast");
        portfolio.setLocation("Ahmedabad","Gujrat");
        portfolio.setAge(19);
        portfolio.setEmail("sjenish247@gmail.com");
        portfolio.setPhone("9898132312");
        portfolio.setGithub("https://github.com/solankijenis2312");
        portfolio.setLinkedin("https://linkedin.com");
        portfolio.setBio("An aspiring Backend Java Developer with passion for building robust and scalable applications");

        return portfolio;
    }

    public String getAboutBio()
    {
        return "Hello, my name is Jenish Solanki, and I am an aspiring Software Developer with a strong passion for Java programming. " +
                "I have a background in Computer Engineering with a Diploma from R.C. Technical Institute (CGPA: 8.36) " +
                "and I am currently pursuing Bachelor's in Computer Science Engineering from Government Engineering College, Patan.\n\n" +
                "I gained practical experience through a 45-day internship in Machine Learning at Infoblabz Pvt. Ltd. " +
                "Although I explored Machine Learning, my core interest lies in Java programming due to its clarity, object-oriented nature, " +
                "and wide application in real-world software development.\n\n" +
                "I am a quick learner, hardworking, and dedicated. I continuously improve myself by learning new technologies and best practices. " +
                "I am committed to contributing my best to the growth and success of the organizations I work with.";
    }

    public String[] getProgrammingLanguages() {
        return new String[]{"Java"};
    }

    /**
     * Get frameworks and libraries
     * @return Array of frameworks
     */
    public String[] getFrameworks() {
        return new String[]{"Spring Boot"};
    }

    /**
     * Get core concepts knowledge
     * @return Array of core concepts
     */
//    public String[] getCoreConcepts() {
//        return new String[]{"OOP", "Exception Handling", "Multithreading", "Data Structures & Algorithms (DSA)"};
//    }

    /**
     * Get database technologies
     * @return Array of databases
     */
//    public String[] getDatabases() {
//        return new String[]{"MySQL", "PostgreSQL"};
//    }

    /**
     * Get tools and technologies
     * @return Array of tools
     */
    public String[] getTools() {
        return new String[]{"IntelliJ IDEA","Postman","VsCode"};
    }

    /**
     * Get all skills organized by category
     * @return Map of skill categories to skills
     */
    public Map<String, String[]> getAllSkills() {
        Map<String, String[]> skills = new HashMap<>();
        skills.put("Programming Languages", getProgrammingLanguages());
        skills.put("Frameworks & Libraries", getFrameworks());
//        skills.put("Core Concepts", getCoreConcepts());
//        skills.put("Databases", getDatabases());
        skills.put("Tools & Technologies", getTools());
        return skills;
    }

    public Map<String, Integer> getProficiencyLevels() {
        Map<String, Integer> proficiency = new HashMap<>();
        proficiency.put("Java Core", 85);
        proficiency.put("Spring Boot", 75);
        proficiency.put("Data Structures & Algorithms", 60);
        //proficiency.put("SQL & Databases", 70);
        //proficiency.put("Web Development (HTML/CSS)", 65);
        //proficiency.put("Git & Version Control", 75);
        return proficiency;
    }

    public String getProficiencyLabel(int percentage)
    {
        if(percentage >= 80)
        {
            return "Advanced";
        }
        else if(percentage >= 60)
        {
            return "Intermediate";
        }
        else {
            return "Beginner";
        }
    }

    //Get education information
    //     * @return List of education records

    public List<Map<String,String>> getEducation()
    {
        List<Map<String ,String>> education = new ArrayList<>();

        //for storing bachelor's degree info
        Map<String,String> bachelor = new HashMap<>();
        bachelor.put("degree","Bachelor of Engineering");
        bachelor.put("institution", "Government Engineering College, Patan");
        bachelor.put("duration", "Aug 2025 - Aug 2028");
        bachelor.put("cgpa", "N/A");
        bachelor.put("description", "Currently pursuing B.E. in Computer Science and Engineering with focus on software development.");
        education.add(bachelor);

        //for storing diploma info
        Map<String, String> diploma = new HashMap<>();
        diploma.put("degree", "Diploma in Computer Engineering");
        diploma.put("institution", "R.C. Technical Institute, Ahmedabad");
        diploma.put("duration", "Aug 2022 - Apr 2025");
        diploma.put("cgpa", "8.36");
        diploma.put("description", "Completed diploma with strong foundation in Java, databases, and software engineering principles. Gained core knowledge through practical projects and internships.");
        education.add(diploma);

        return education;

    }
    public List<Map<String, String>> getExperience() {
        List<Map<String, String>> experience = new ArrayList<>();

        //Internship
        Map<String, String> internship = new HashMap<>();
        internship.put("position", "Machine Learning Intern");
        internship.put("company", "Infoblabz Pvt. Ltd.");
        internship.put("duration", "45-Day Internship (Summer 2024)");
        internship.put("description", "Worked on Machine Learning projects and gained practical experience. Although I explored ML, I discovered my true passion lies in Java development and backend systems.");
        experience.add(internship);

        //Personal Projects
        Map<String, String> projects = new HashMap<>();
        projects.put("position", "Self-Study & Personal Projects");
        projects.put("Learning", "Independent Learning");
        projects.put("duration", "Ongoing");
        projects.put("description", "Actively involved in building small Java applications to practice OOP principles and core Java features. Dedicated to completing the Spring Boot track.");
        experience.add(projects);

        return experience;
    }

    public String[] getKeyQualities()
    {
        return new String[]
                {
                        "Quick Learner - Rapidly acquire new technical skills",
                        "Hardworking - Dedicated to continuous improvement",
                        "Problem Solver - Love tackling complex challenges",
                        "Passionate  - Deep interest in java and best practices."
                };
    }

    //Get strengths with descriptions
    public Map<String,String> getStrengths()
    {
        Map<String, String> strengths = new HashMap<>();

        strengths.put("Quick Learner", "Rapidly acquire new technologies and programming concepts through focused study");
        strengths.put("Collaboration", "Effective team player with excellent communication and collaborative problem-solving skills");
        strengths.put("Continuous Improvement", "Always eager to learn new technologies and improve existing skills for better performance");
        return strengths;
    }

    /*
    Get current learning goals and focus areas
      @return List of learning goals
     */

    public List<Map<String, String>> getLearningGoals()
    {
        List<Map<String,String>> goals= new ArrayList<>();

        Map<String, String> goal1 = new HashMap<>();
        goal1.put("number", "1");
        goal1.put("title", "Spring Boot Microservices");
        goal1.put("description", "Building scalable, cloud-native applications with Spring Cloud and distributed systems");
        goals.add(goal1);

        Map<String, String> goal2 = new HashMap<>();
        goal2.put("number", "4");
        goal2.put("title", "Data Structures & Algorithms Mastery");
        goal2.put("description", "Continuously DSA for competitive programming and interview preparation");
        goals.add(goal2);

        return goals;
    }

    //Get social media and contact links
     //* @return Map of platform to URL

    public Map<String,String> getSocialLinks()
    {
        Map<String, String> links= new HashMap<>();
        links.put("Github" ,"https://github.com/solankijenis2312");
        links.put("LinkedIn", "https://linkedin.com");
        links.put("Email", "sjenish247@gmail.com");

        return links;
    }

}
