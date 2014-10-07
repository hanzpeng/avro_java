/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package Thermostat.Types.Avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TemperatureSettingChanged extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TemperatureSettingChanged\",\"namespace\":\"Thermostat.Types.Avro\",\"fields\":[{\"name\":\"DeviceId\",\"type\":\"int\"},{\"name\":\"Temperature\",\"type\":\"float\"},{\"name\":\"TimeInTicks\",\"type\":\"long\"},{\"name\":\"Filler\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int DeviceId;
  @Deprecated public float Temperature;
  @Deprecated public long TimeInTicks;
  @Deprecated public java.lang.CharSequence Filler;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public TemperatureSettingChanged() {}

  /**
   * All-args constructor.
   */
  public TemperatureSettingChanged(java.lang.Integer DeviceId, java.lang.Float Temperature, java.lang.Long TimeInTicks, java.lang.CharSequence Filler) {
    this.DeviceId = DeviceId;
    this.Temperature = Temperature;
    this.TimeInTicks = TimeInTicks;
    this.Filler = Filler;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return DeviceId;
    case 1: return Temperature;
    case 2: return TimeInTicks;
    case 3: return Filler;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: DeviceId = (java.lang.Integer)value$; break;
    case 1: Temperature = (java.lang.Float)value$; break;
    case 2: TimeInTicks = (java.lang.Long)value$; break;
    case 3: Filler = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'DeviceId' field.
   */
  public java.lang.Integer getDeviceId() {
    return DeviceId;
  }

  /**
   * Sets the value of the 'DeviceId' field.
   * @param value the value to set.
   */
  public void setDeviceId(java.lang.Integer value) {
    this.DeviceId = value;
  }

  /**
   * Gets the value of the 'Temperature' field.
   */
  public java.lang.Float getTemperature() {
    return Temperature;
  }

  /**
   * Sets the value of the 'Temperature' field.
   * @param value the value to set.
   */
  public void setTemperature(java.lang.Float value) {
    this.Temperature = value;
  }

  /**
   * Gets the value of the 'TimeInTicks' field.
   */
  public java.lang.Long getTimeInTicks() {
    return TimeInTicks;
  }

  /**
   * Sets the value of the 'TimeInTicks' field.
   * @param value the value to set.
   */
  public void setTimeInTicks(java.lang.Long value) {
    this.TimeInTicks = value;
  }

  /**
   * Gets the value of the 'Filler' field.
   */
  public java.lang.CharSequence getFiller() {
    return Filler;
  }

  /**
   * Sets the value of the 'Filler' field.
   * @param value the value to set.
   */
  public void setFiller(java.lang.CharSequence value) {
    this.Filler = value;
  }

  /** Creates a new TemperatureSettingChanged RecordBuilder */
  public static Thermostat.Types.Avro.TemperatureSettingChanged.Builder newBuilder() {
    return new Thermostat.Types.Avro.TemperatureSettingChanged.Builder();
  }
  
  /** Creates a new TemperatureSettingChanged RecordBuilder by copying an existing Builder */
  public static Thermostat.Types.Avro.TemperatureSettingChanged.Builder newBuilder(Thermostat.Types.Avro.TemperatureSettingChanged.Builder other) {
    return new Thermostat.Types.Avro.TemperatureSettingChanged.Builder(other);
  }
  
  /** Creates a new TemperatureSettingChanged RecordBuilder by copying an existing TemperatureSettingChanged instance */
  public static Thermostat.Types.Avro.TemperatureSettingChanged.Builder newBuilder(Thermostat.Types.Avro.TemperatureSettingChanged other) {
    return new Thermostat.Types.Avro.TemperatureSettingChanged.Builder(other);
  }
  
  /**
   * RecordBuilder for TemperatureSettingChanged instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TemperatureSettingChanged>
    implements org.apache.avro.data.RecordBuilder<TemperatureSettingChanged> {

    private int DeviceId;
    private float Temperature;
    private long TimeInTicks;
    private java.lang.CharSequence Filler;

    /** Creates a new Builder */
    private Builder() {
      super(Thermostat.Types.Avro.TemperatureSettingChanged.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Thermostat.Types.Avro.TemperatureSettingChanged.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.DeviceId)) {
        this.DeviceId = data().deepCopy(fields()[0].schema(), other.DeviceId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Temperature)) {
        this.Temperature = data().deepCopy(fields()[1].schema(), other.Temperature);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.TimeInTicks)) {
        this.TimeInTicks = data().deepCopy(fields()[2].schema(), other.TimeInTicks);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Filler)) {
        this.Filler = data().deepCopy(fields()[3].schema(), other.Filler);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing TemperatureSettingChanged instance */
    private Builder(Thermostat.Types.Avro.TemperatureSettingChanged other) {
            super(Thermostat.Types.Avro.TemperatureSettingChanged.SCHEMA$);
      if (isValidValue(fields()[0], other.DeviceId)) {
        this.DeviceId = data().deepCopy(fields()[0].schema(), other.DeviceId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Temperature)) {
        this.Temperature = data().deepCopy(fields()[1].schema(), other.Temperature);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.TimeInTicks)) {
        this.TimeInTicks = data().deepCopy(fields()[2].schema(), other.TimeInTicks);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Filler)) {
        this.Filler = data().deepCopy(fields()[3].schema(), other.Filler);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'DeviceId' field */
    public java.lang.Integer getDeviceId() {
      return DeviceId;
    }
    
    /** Sets the value of the 'DeviceId' field */
    public Thermostat.Types.Avro.TemperatureSettingChanged.Builder setDeviceId(int value) {
      validate(fields()[0], value);
      this.DeviceId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'DeviceId' field has been set */
    public boolean hasDeviceId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'DeviceId' field */
    public Thermostat.Types.Avro.TemperatureSettingChanged.Builder clearDeviceId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'Temperature' field */
    public java.lang.Float getTemperature() {
      return Temperature;
    }
    
    /** Sets the value of the 'Temperature' field */
    public Thermostat.Types.Avro.TemperatureSettingChanged.Builder setTemperature(float value) {
      validate(fields()[1], value);
      this.Temperature = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'Temperature' field has been set */
    public boolean hasTemperature() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'Temperature' field */
    public Thermostat.Types.Avro.TemperatureSettingChanged.Builder clearTemperature() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'TimeInTicks' field */
    public java.lang.Long getTimeInTicks() {
      return TimeInTicks;
    }
    
    /** Sets the value of the 'TimeInTicks' field */
    public Thermostat.Types.Avro.TemperatureSettingChanged.Builder setTimeInTicks(long value) {
      validate(fields()[2], value);
      this.TimeInTicks = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'TimeInTicks' field has been set */
    public boolean hasTimeInTicks() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'TimeInTicks' field */
    public Thermostat.Types.Avro.TemperatureSettingChanged.Builder clearTimeInTicks() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'Filler' field */
    public java.lang.CharSequence getFiller() {
      return Filler;
    }
    
    /** Sets the value of the 'Filler' field */
    public Thermostat.Types.Avro.TemperatureSettingChanged.Builder setFiller(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.Filler = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'Filler' field has been set */
    public boolean hasFiller() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'Filler' field */
    public Thermostat.Types.Avro.TemperatureSettingChanged.Builder clearFiller() {
      Filler = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public TemperatureSettingChanged build() {
      try {
        TemperatureSettingChanged record = new TemperatureSettingChanged();
        record.DeviceId = fieldSetFlags()[0] ? this.DeviceId : (java.lang.Integer) defaultValue(fields()[0]);
        record.Temperature = fieldSetFlags()[1] ? this.Temperature : (java.lang.Float) defaultValue(fields()[1]);
        record.TimeInTicks = fieldSetFlags()[2] ? this.TimeInTicks : (java.lang.Long) defaultValue(fields()[2]);
        record.Filler = fieldSetFlags()[3] ? this.Filler : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}