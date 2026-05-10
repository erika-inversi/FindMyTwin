package com.erikainversi.findmytwin;

import java.util.Scanner;

public class UserInputHandler {

	public String readFolderPath() {

		System.out.println("Enter folder path, e.g. /Users/username/FolderName");

		Scanner scanner = new Scanner(System.in);
		String folderPath = scanner.nextLine();
		folderPath = folderPath.trim();

		return folderPath;
	}
}
