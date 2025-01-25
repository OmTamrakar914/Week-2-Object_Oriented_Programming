package com.multilevelinheritance.educationalordermanagement;

public class EducationalCourseHierarchy2 {
    public static void main(String[] args) {
        Course course =new Course("Learning Java",2);
        course.displayCoursedetails();

        OnlineCourse onlineCourse=new OnlineCourse(course.getCourseName(), course.getDuration(), "BridgeLabz", false);
        onlineCourse.displayCoursedetails();

        PaidOnlineCourse paidOnlineCourse=new PaidOnlineCourse(onlineCourse.getCourseName(), onlineCourse.getDuration(), onlineCourse.getPlatform(),
                onlineCourse.isRecorded(), 12500, 5);
        paidOnlineCourse.displayCoursedetails();
    }
}
