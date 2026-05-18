package com.erikainversi.findmytwin;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LocalFileScanner {

	public List<Path> scanDirectory(Path startPath) {

		if (Files.notExists(startPath)) {
			return Collections.emptyList();
		}

		if (!Files.isDirectory(startPath)) {
			return Collections.emptyList();
		}

		List<Path> result = new ArrayList<>();

		try (DirectoryStream<Path> stream = Files.newDirectoryStream(startPath)) {

			for (Path p : stream) {
				result.add(p);
			}

		} catch (IOException e) {
			return Collections.emptyList();
		}

		return result;
	}
}