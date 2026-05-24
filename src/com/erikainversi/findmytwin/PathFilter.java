package com.erikainversi.findmytwin;

import java.nio.file.Path;

public interface PathFilter {

	public boolean accept(Path path);

}
