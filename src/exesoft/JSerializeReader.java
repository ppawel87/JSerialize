package exesoft;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface JSerializeReader {

	void fromMap(Map<String, Object> map);
	
	Boolean readObject(InputStream input);
}
