/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Set of sensors residing on links in potentially multiple networks. */
public class SensorSet extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SensorSet\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Set of sensors residing on links in potentially multiple networks.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"sensors\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Sensor\",\"doc\":\"* Sensor that can describe loop detector, magnetic detector, TMC,\\n   * camera, radar, etc.\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"doc\":\"* \\\"Loop\\\", etc. Translated to numeric type in the DB.\"},{\"name\":\"entityId\",\"type\":[\"null\",\"string\"],\"doc\":\"* ID of original detector, e.g. VDS ID\"},{\"name\":\"measurementFeedId\",\"type\":[\"null\",\"string\"],\"doc\":\"* data feed associated with this sensor\"},{\"name\":\"linkId\",\"type\":\"string\"},{\"name\":\"linkOffset\",\"type\":\"double\",\"default\":0},{\"name\":\"laneNum\",\"type\":\"double\",\"default\":1},{\"name\":\"healthStatus\",\"type\":\"double\",\"doc\":\"* healthy by default\",\"default\":1}]}}}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence description;
  @Deprecated public java.lang.CharSequence projectId;
  @Deprecated public java.util.List<edu.berkeley.path.model_elements_base.Sensor> sensors;

  /**
   * Default constructor.
   */
  public SensorSet() {}

  /**
   * All-args constructor.
   */
  public SensorSet(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence description, java.lang.CharSequence projectId, java.util.List<edu.berkeley.path.model_elements_base.Sensor> sensors) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.projectId = projectId;
    this.sensors = sensors;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return description;
    case 3: return projectId;
    case 4: return sensors;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: description = (java.lang.CharSequence)value$; break;
    case 3: projectId = (java.lang.CharSequence)value$; break;
    case 4: sensors = (java.util.List<edu.berkeley.path.model_elements_base.Sensor>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'projectId' field.
   */
  public java.lang.CharSequence getProjectId() {
    return projectId;
  }

  /**
   * Sets the value of the 'projectId' field.
   * @param value the value to set.
   */
  public void setProjectId(java.lang.CharSequence value) {
    this.projectId = value;
  }

  /**
   * Gets the value of the 'sensors' field.
   */
  public java.util.List<edu.berkeley.path.model_elements_base.Sensor> getSensors() {
    return sensors;
  }

  /**
   * Sets the value of the 'sensors' field.
   * @param value the value to set.
   */
  public void setSensors(java.util.List<edu.berkeley.path.model_elements_base.Sensor> value) {
    this.sensors = value;
  }

  /** Creates a new SensorSet RecordBuilder */
  public static edu.berkeley.path.model_elements_base.SensorSet.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.SensorSet.Builder();
  }
  
  /** Creates a new SensorSet RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.SensorSet.Builder newBuilder(edu.berkeley.path.model_elements_base.SensorSet.Builder other) {
    return new edu.berkeley.path.model_elements_base.SensorSet.Builder(other);
  }
  
  /** Creates a new SensorSet RecordBuilder by copying an existing SensorSet instance */
  public static edu.berkeley.path.model_elements_base.SensorSet.Builder newBuilder(edu.berkeley.path.model_elements_base.SensorSet other) {
    return new edu.berkeley.path.model_elements_base.SensorSet.Builder(other);
  }
  
  /**
   * RecordBuilder for SensorSet instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SensorSet>
    implements org.apache.avro.data.RecordBuilder<SensorSet> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence description;
    private java.lang.CharSequence projectId;
    private java.util.List<edu.berkeley.path.model_elements_base.Sensor> sensors;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.SensorSet.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.SensorSet.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing SensorSet instance */
    private Builder(edu.berkeley.path.model_elements_base.SensorSet other) {
            super(edu.berkeley.path.model_elements_base.SensorSet.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.projectId)) {
        this.projectId = (java.lang.CharSequence) data().deepCopy(fields()[3].schema(), other.projectId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.sensors)) {
        this.sensors = (java.util.List<edu.berkeley.path.model_elements_base.Sensor>) data().deepCopy(fields()[4].schema(), other.sensors);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.SensorSet.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.SensorSet.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.SensorSet.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.SensorSet.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.CharSequence getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public edu.berkeley.path.model_elements_base.SensorSet.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'description' field */
    public edu.berkeley.path.model_elements_base.SensorSet.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'projectId' field */
    public java.lang.CharSequence getProjectId() {
      return projectId;
    }
    
    /** Sets the value of the 'projectId' field */
    public edu.berkeley.path.model_elements_base.SensorSet.Builder setProjectId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.projectId = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'projectId' field has been set */
    public boolean hasProjectId() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'projectId' field */
    public edu.berkeley.path.model_elements_base.SensorSet.Builder clearProjectId() {
      projectId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'sensors' field */
    public java.util.List<edu.berkeley.path.model_elements_base.Sensor> getSensors() {
      return sensors;
    }
    
    /** Sets the value of the 'sensors' field */
    public edu.berkeley.path.model_elements_base.SensorSet.Builder setSensors(java.util.List<edu.berkeley.path.model_elements_base.Sensor> value) {
      validate(fields()[4], value);
      this.sensors = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'sensors' field has been set */
    public boolean hasSensors() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'sensors' field */
    public edu.berkeley.path.model_elements_base.SensorSet.Builder clearSensors() {
      sensors = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public SensorSet build() {
      try {
        SensorSet record = new SensorSet();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.projectId = fieldSetFlags()[3] ? this.projectId : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.sensors = fieldSetFlags()[4] ? this.sensors : (java.util.List<edu.berkeley.path.model_elements_base.Sensor>) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
