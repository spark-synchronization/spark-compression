package io.sparksync.compression.benchmark.data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class DataObject {
	
	private Random random = new Random();
	
	private static Map<UUID, DataObject> dataMap = new HashMap<UUID, DataObject>();
	
	private String name;
	private UUID uuid;
	private boolean randomBoolean1, randomBoolean2, randomBoolean3, randomBoolean4;
	private ProfileType profileType;
	
	public DataObject(UUID uuid) {
		this.uuid = uuid;
		
		this.randomBoolean1 = random.nextBoolean();
		this.randomBoolean2 = random.nextBoolean();
		this.randomBoolean3 = random.nextBoolean();
		this.randomBoolean4 = random.nextBoolean();
		
		this.profileType = ProfileType.RANDOM_1;
		
		dataMap.put(uuid, this);
	}
	
	private enum ProfileType {
		RANDOM_1,
		RANDOM_2,
		RANDOM_3;
	}
	
	public UUID getUUID() {
		return uuid;
	}
	
    public static DataObject getByUuid(UUID uuid) {
        if (dataMap.containsKey(uuid)) {
            return dataMap.get(uuid);
        }
        return new DataObject(uuid);
    }
	
    public static Map<UUID, DataObject> getDataMap() {
        return dataMap;
    }

    public static Set<DataObject> getDataObjects() {
        return new HashSet<>(dataMap.values());
    }
}
