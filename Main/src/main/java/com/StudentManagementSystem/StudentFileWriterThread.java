package com.StudentManagementSystem;


public class StudentFileWriterThread extends Thread {
    private StudentDataManager manager;
    private String filePath;

    public StudentFileWriterThread(StudentDataManager manager, String filePath) {
        this.manager = manager;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        manager.saveStudentsToFile(filePath);
    }
}
