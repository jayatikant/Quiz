package collections.equality;

import java.util.HashMap;
import java.util.Map;

public class MapKeys {

	private int id;
	private String name;

	public MapKeys(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		Map<MapKeys, String> map = new HashMap<MapKeys, String>();
		map.put(new MapKeys(0, "jayati"), "Hello");
		map.put(new MapKeys(1, "skf"), "Hello");
		System.out.println(map.size());
	}

}
