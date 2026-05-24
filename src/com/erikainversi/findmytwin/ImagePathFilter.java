package com.erikainversi.findmytwin;

import java.nio.file.Path;

public class ImagePathFilter implements PathFilter {

	@Override
	public boolean accept(Path path) {

		Path fileName = path.getFileName();

		String name = fileName.toString();

		if (name.endsWith(".png") || name.endsWith(".jpg")) {

		}

		return true;
	}

}
