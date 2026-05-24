package com.erikainversi.findmytwin;

import java.nio.file.Path;
import java.util.Set;

public class ImagePathFilter implements PathFilter {

	private final Set<String> IMAGE_EXTENSIONS = Set.of(".png", ".jpg", ".jpeg", ".gif", ".webp", ".bmp", ".tiff",
			".tif", ".svg", ".ico");

	@Override
	public boolean accept(Path path) {

		if (path == null) {
			return false;
		}

		Path fileName = path.getFileName();

		if (fileName == null) {
			return false;
		}

		String name = fileName.toString();

		int indexLastDot = name.lastIndexOf('.');

		if (indexLastDot == -1) {
			return false;
		}

		String extension = name.substring(indexLastDot);

		return IMAGE_EXTENSIONS.contains(extension);

	}

}
