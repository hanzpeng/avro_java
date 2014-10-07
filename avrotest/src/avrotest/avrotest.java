package avrotest;

import java.io.File;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import Contoso.Cars.Messages.DiscreteSensor;
import AvroTests.MyDataType;
import Thermostat.Types.Avro.TemperatureSettingChanged;

public class avrotest {
	static String fileName = "aaa.avro";

	public static void main(String[] args) {
		createMyDataType();
//		DeviceId, Temperature, TimeInTicks, Filler
		appendMyDataType(1,1.11F,111111L,"aaa");
		appendMyDataType(2,2.22F,222222L,"bbb");
		appendMyDataType(3,3.33F,333333L,"ccc");
		appendMyDataType(4,4.44F,444444L,"ddd");
		
//		appendMyDataType(1,"aaa");
//		appendMyDataType(2,"bbb");
//		appendMyDataType(3,"ccc");
//		appendMyDataType(4,"ddd");
//		appendMyDataType(5,"eee");
		readAndPrintMyDataType();
		
//		createDiscreteSensorFile();
//		append("aaa", true, true, true, true, true);
//		append("bbb", false, false, false, false, false);
//		append("ccc", false, true, false, true, false);
//		append("ddd", true, true, false, true, false);
//		append("eee", true, true, false, true, true);
//		readAndPrint();
	}

	static void createDiscreteSensorFile() {
		DiscreteSensor sensor = new DiscreteSensor();
		try {
			DatumWriter<DiscreteSensor> datumWriter = new SpecificDatumWriter<DiscreteSensor>(DiscreteSensor.class);
			DataFileWriter<DiscreteSensor> dataFileWriter = new DataFileWriter<DiscreteSensor>(datumWriter);
			dataFileWriter.create(sensor.getSchema(), new File(fileName));
			dataFileWriter.close();
		} catch (Exception ex) {

		}
	}

	static void createMyDataType() {

		TemperatureSettingChanged tc = new TemperatureSettingChanged();
		try {
			DatumWriter<TemperatureSettingChanged> datumWriter = new SpecificDatumWriter<TemperatureSettingChanged>(TemperatureSettingChanged.class);
			DataFileWriter<TemperatureSettingChanged> dataFileWriter = new DataFileWriter<TemperatureSettingChanged>(datumWriter);
			dataFileWriter.create(tc.getSchema(), new File(fileName));
			dataFileWriter.close();
		} catch (Exception ex) {

		}
		
//		MyDataType sensor = new MyDataType();
//		try {
//			DatumWriter<MyDataType> datumWriter = new SpecificDatumWriter<MyDataType>(MyDataType.class);
//			DataFileWriter<MyDataType> dataFileWriter = new DataFileWriter<MyDataType>(datumWriter);
//			dataFileWriter.create(sensor.getSchema(), new File(fileName));
//			dataFileWriter.close();
//		} catch (Exception ex) {
//
//		}
	}
	static void appendMyDataType(java.lang.Integer DeviceId, java.lang.Float Temperature, java.lang.Long TimeInTicks, java.lang.CharSequence Filler) {
		DatumWriter<TemperatureSettingChanged> datumWriter = new SpecificDatumWriter<TemperatureSettingChanged>(TemperatureSettingChanged.class);
		DataFileWriter<TemperatureSettingChanged> dataFileWriter = new DataFileWriter<TemperatureSettingChanged>(datumWriter);
		TemperatureSettingChanged sensor = new TemperatureSettingChanged(DeviceId, Temperature, TimeInTicks, Filler);
	
			  
		try {
			dataFileWriter.appendTo(new File(fileName));
			dataFileWriter.append(sensor);
			dataFileWriter.close();
		} catch (Exception ex) {

		}
		// Append additional rows to existing file
//		DatumWriter<MyDataType> datumWriter = new SpecificDatumWriter<MyDataType>(MyDataType.class);
//		DataFileWriter<MyDataType> dataFileWriter = new DataFileWriter<MyDataType>(datumWriter);
//		MyDataType sensor = new MyDataType(someNumber,someString);
//		try {
//			dataFileWriter.appendTo(new File(fileName));
//			dataFileWriter.append(sensor);
//			dataFileWriter.close();
//		} catch (Exception ex) {
//
//		}
	}


	static void append(String eventType, boolean lowFuel, boolean doorAjar, boolean engineRunning,
			boolean lowOilPressure, boolean doorLocked) {

		// Append additional rows to existing file
		DatumWriter<DiscreteSensor> datumWriter = new SpecificDatumWriter<DiscreteSensor>(DiscreteSensor.class);
		DataFileWriter<DiscreteSensor> dataFileWriter = new DataFileWriter<DiscreteSensor>(datumWriter);
		DiscreteSensor sensor = new DiscreteSensor(eventType, lowFuel, doorAjar, engineRunning, lowOilPressure,
				doorLocked);
		try {
			dataFileWriter.appendTo(new File(fileName));
			dataFileWriter.append(sensor);
			dataFileWriter.close();
		} catch (Exception ex) {

		}
	}

	static void readAndPrint() {
		System.out.println("Reading from " + fileName + " and print out records:");
		System.out.println();
		try {
			// Deserialize from disk
			DatumReader<DiscreteSensor> userDatumReader = new SpecificDatumReader<DiscreteSensor>(DiscreteSensor.class);
			File file = new File(fileName);
			DataFileReader<DiscreteSensor> dataFileReader = new DataFileReader<DiscreteSensor>(file, userDatumReader);
			DiscreteSensor sensor = null;
			while (dataFileReader.hasNext()) {
				// Reuse object by passing it to next(). This saves us from
				// allocating and garbage collecting many objects for files with
				// many items.
				sensor = dataFileReader.next(sensor);
				System.out.println(sensor);
			}
		} catch (Exception ex1) {

		}
		System.out.println();
		System.out.println("Done Reading from " + fileName);
		System.out.println();
	}
	static void readAndPrintMyDataType() {
		System.out.println("Reading from " + fileName + " and print out records:");
		System.out.println();
		try {
			// Deserialize from disk
			DatumReader<MyDataType> userDatumReader = new SpecificDatumReader<MyDataType>(MyDataType.class);
			File file = new File(fileName);
			DataFileReader<MyDataType> dataFileReader = new DataFileReader<MyDataType>(file, userDatumReader);
			MyDataType sensor = null;
			while (dataFileReader.hasNext()) {
				// Reuse object by passing it to next(). This saves us from
				// allocating and garbage collecting many objects for files with
				// many items.
				sensor = dataFileReader.next(sensor);
				System.out.println(sensor);
			}
		} catch (Exception ex1) {

		}
		System.out.println();
		System.out.println("Done Reading from " + fileName);
		System.out.println();
	}

}
