package com.StudentManagementSystem;

public class Main {
	public static void main(String[] args) {
		StudentDataManager manager = new StudentDataManager();
		manager.addStudent(new Student("Ram", 101, 20));
		manager.addStudent(new Student("Sanjay", 102, 21));
		manager.addStudent(new Student("Rakesh", 103, 22));
		manager.addStudent(new Student("Raju", 104, 25));
		manager.addStudent(new Student("Shyam", 105, 26));
		manager.addStudent(new Student("Baburav", 106, 27));
		manager.addStudent(new Student("Deepak", 107, 28));
		manager.addStudent(new Student("Ashavin", 108, 29));

		// File path for storing data
		String filePath = "C:\\Users\\Admin\\eclipse-workspace\\Main\\src\\main"
				+ "\\java\\com\\StudentManagementSystem\\students.json";

		// Create threads to handle reading and writing concurrently
		StudentFileWriterThread writerThread = new StudentFileWriterThread(manager, filePath);
		StudentFileReaderThread readerThread = new StudentFileReaderThread(manager, filePath);

		// Start threads
		writerThread.start();
		try {
			writerThread.join(); // Ensure writing completes before reading
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		readerThread.start();
		try {
			readerThread.join(); // Wait for reading to complete
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Display students after reading from file
		manager.displayStudents();
	}
}
