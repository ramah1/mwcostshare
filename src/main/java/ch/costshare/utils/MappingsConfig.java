package ch.costshare.utils;

import java.util.HashMap;
import java.util.Map;

public class MappingsConfig {
	// Maps a domain class name with the corresponding table name in the database
	public static final Map<String, String> TABLE_NAMES = new HashMap<>();
	static {
		TABLE_NAMES.put("User", "costshare.benutzer");
		TABLE_NAMES.put("Group", "costshare.gruppe");
	}
}