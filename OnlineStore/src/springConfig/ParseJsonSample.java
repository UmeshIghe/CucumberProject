package springConfig;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParseJsonSample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		String params[] = { "HotelListResponse", "HotelList", "HotelSummary" ,"RoomRateDetailsList","RoomRateDetails"};
		String updateKey = "roomTypeCode";
		try {

			Object obj = parser
					.parse(new FileReader(
							"C:\\Users\\Umesh\\git\\OnlineStore\\OnlineStore\\resources\\JsonFile\\bigData.json"));

			JSONObject jsonObject = (JSONObject) obj;
			System.out.println(jsonObject);
			int size = params.length;
			Map jData = null;
			LinkedList<JSONObject> tempJdata = new LinkedList<>();
			tempJdata.add(jsonObject);
			for (int i = 0; i < size; i++) {
				jData = (Map) jsonObject.get(params[i]);

				if (size - 1 == i) {
					jData.put(updateKey, "007");
					jsonObject = (JSONObject) jData;
				} else {
					jsonObject = (JSONObject) jData;
				}
				tempJdata.add(jsonObject);
			}
			System.out
					.println("##########################################################################################################################################################################");
			System.out.println(tempJdata.get(0));
			// Collections.reverse(tempJdata);

			// for(int i=0;i<tempJdata.size();i++){
			//
			// JSONObject newobj = tempJdata.get(i);
			// System.out.println(newobj);
			// }

			// System.out.println(jData);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
