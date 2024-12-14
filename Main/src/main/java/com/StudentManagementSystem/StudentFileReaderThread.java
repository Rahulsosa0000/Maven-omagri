package com.StudentManagementSystem;

public class StudentFileReaderThread extends Thread {
    private StudentDataManager manager;
    private String filePath;

    public StudentFileReaderThread(StudentDataManager manager, String filePath) {
        this.manager = manager;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        manager.loadStudentsFromFile(filePath);
    }
}
