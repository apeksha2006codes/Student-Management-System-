package edu.ccrm.service;

import edu.ccrm.domain.Course;


import java.util.*;
import java.util.stream.Collectors;

public class CourseService {
	private Map<String, Course> courses = new HashMap<>();
	
	public void addCourse(Course course) {
		courses.put(course.getCode(), course);
	}
	
	public List<Course> listCourses(){
		return new ArrayList<>(courses.values());
		
	}
	public List<Course> searchByInstructor(String instructorName){
		return courses.values().stream()
				.filter(c -> c.getInstructor() != null &&
				             c.getInstructor().getFullName().equalsIgnoreCase(instructorName))
				.collect(Collectors.toList());
		
	}
	public List<Course> searchByDepartment(String department){
		return courses.values().stream()
				.filter(c -> c.getDepartment().equalsIgnoreCase(department))
				.collect(Collectors.toList());
	}

}
