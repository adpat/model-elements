/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * PeMS sensor datum as output by PeMS filter, for a specific
   * station and time. */
public class PeMS extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PeMS\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* PeMS sensor datum as output by PeMS filter, for a specific\\n   * station and time.\",\"fields\":[{\"name\":\"vdsId\",\"type\":\"long\"},{\"name\":\"timeMeasured\",\"type\":{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]}},{\"name\":\"flow\",\"type\":[\"double\",\"null\"]},{\"name\":\"density\",\"type\":[\"double\",\"null\"]},{\"name\":\"densityError\",\"type\":[\"double\",\"null\"]},{\"name\":\"speed\",\"type\":[\"double\",\"null\"]},{\"name\":\"speedError\",\"type\":[\"double\",\"null\"]},{\"name\":\"freeFlowSpeed\",\"type\":[\"double\",\"null\"]},{\"name\":\"funcLoopFact\",\"type\":[\"double\",\"null\"]},{\"name\":\"gFactorLane\",\"type\":{\"type\":\"array\",\"items\":[\"double\",\"null\"]}}]}");
  @Deprecated public long vdsId;
  @Deprecated public edu.berkeley.path.model_elements_base.DateTime timeMeasured;
  @Deprecated public java.lang.Double flow;
  @Deprecated public java.lang.Double density;
  @Deprecated public java.lang.Double densityError;
  @Deprecated public java.lang.Double speed;
  @Deprecated public java.lang.Double speedError;
  @Deprecated public java.lang.Double freeFlowSpeed;
  @Deprecated public java.lang.Double funcLoopFact;
  @Deprecated public java.util.List<java.lang.Double> gFactorLane;

  /**
   * Default constructor.
   */
  public PeMS() {}

  /**
   * All-args constructor.
   */
  public PeMS(java.lang.Long vdsId, edu.berkeley.path.model_elements_base.DateTime timeMeasured, java.lang.Double flow, java.lang.Double density, java.lang.Double densityError, java.lang.Double speed, java.lang.Double speedError, java.lang.Double freeFlowSpeed, java.lang.Double funcLoopFact, java.util.List<java.lang.Double> gFactorLane) {
    this.vdsId = vdsId;
    this.timeMeasured = timeMeasured;
    this.flow = flow;
    this.density = density;
    this.densityError = densityError;
    this.speed = speed;
    this.speedError = speedError;
    this.freeFlowSpeed = freeFlowSpeed;
    this.funcLoopFact = funcLoopFact;
    this.gFactorLane = gFactorLane;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return vdsId;
    case 1: return timeMeasured;
    case 2: return flow;
    case 3: return density;
    case 4: return densityError;
    case 5: return speed;
    case 6: return speedError;
    case 7: return freeFlowSpeed;
    case 8: return funcLoopFact;
    case 9: return gFactorLane;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: vdsId = (java.lang.Long)value$; break;
    case 1: timeMeasured = (edu.berkeley.path.model_elements_base.DateTime)value$; break;
    case 2: flow = (java.lang.Double)value$; break;
    case 3: density = (java.lang.Double)value$; break;
    case 4: densityError = (java.lang.Double)value$; break;
    case 5: speed = (java.lang.Double)value$; break;
    case 6: speedError = (java.lang.Double)value$; break;
    case 7: freeFlowSpeed = (java.lang.Double)value$; break;
    case 8: funcLoopFact = (java.lang.Double)value$; break;
    case 9: gFactorLane = (java.util.List<java.lang.Double>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'vdsId' field.
   */
  public java.lang.Long getVdsId() {
    return vdsId;
  }

  /**
   * Sets the value of the 'vdsId' field.
   * @param value the value to set.
   */
  public void setVdsId(java.lang.Long value) {
    this.vdsId = value;
  }

  /**
   * Gets the value of the 'timeMeasured' field.
   */
  public edu.berkeley.path.model_elements_base.DateTime getTimeMeasured() {
    return timeMeasured;
  }

  /**
   * Sets the value of the 'timeMeasured' field.
   * @param value the value to set.
   */
  public void setTimeMeasured(edu.berkeley.path.model_elements_base.DateTime value) {
    this.timeMeasured = value;
  }

  /**
   * Gets the value of the 'flow' field.
   */
  public java.lang.Double getFlow() {
    return flow;
  }

  /**
   * Sets the value of the 'flow' field.
   * @param value the value to set.
   */
  public void setFlow(java.lang.Double value) {
    this.flow = value;
  }

  /**
   * Gets the value of the 'density' field.
   */
  public java.lang.Double getDensity() {
    return density;
  }

  /**
   * Sets the value of the 'density' field.
   * @param value the value to set.
   */
  public void setDensity(java.lang.Double value) {
    this.density = value;
  }

  /**
   * Gets the value of the 'densityError' field.
   */
  public java.lang.Double getDensityError() {
    return densityError;
  }

  /**
   * Sets the value of the 'densityError' field.
   * @param value the value to set.
   */
  public void setDensityError(java.lang.Double value) {
    this.densityError = value;
  }

  /**
   * Gets the value of the 'speed' field.
   */
  public java.lang.Double getSpeed() {
    return speed;
  }

  /**
   * Sets the value of the 'speed' field.
   * @param value the value to set.
   */
  public void setSpeed(java.lang.Double value) {
    this.speed = value;
  }

  /**
   * Gets the value of the 'speedError' field.
   */
  public java.lang.Double getSpeedError() {
    return speedError;
  }

  /**
   * Sets the value of the 'speedError' field.
   * @param value the value to set.
   */
  public void setSpeedError(java.lang.Double value) {
    this.speedError = value;
  }

  /**
   * Gets the value of the 'freeFlowSpeed' field.
   */
  public java.lang.Double getFreeFlowSpeed() {
    return freeFlowSpeed;
  }

  /**
   * Sets the value of the 'freeFlowSpeed' field.
   * @param value the value to set.
   */
  public void setFreeFlowSpeed(java.lang.Double value) {
    this.freeFlowSpeed = value;
  }

  /**
   * Gets the value of the 'funcLoopFact' field.
   */
  public java.lang.Double getFuncLoopFact() {
    return funcLoopFact;
  }

  /**
   * Sets the value of the 'funcLoopFact' field.
   * @param value the value to set.
   */
  public void setFuncLoopFact(java.lang.Double value) {
    this.funcLoopFact = value;
  }

  /**
   * Gets the value of the 'gFactorLane' field.
   */
  public java.util.List<java.lang.Double> getGFactorLane() {
    return gFactorLane;
  }

  /**
   * Sets the value of the 'gFactorLane' field.
   * @param value the value to set.
   */
  public void setGFactorLane(java.util.List<java.lang.Double> value) {
    this.gFactorLane = value;
  }

  /** Creates a new PeMS RecordBuilder */
  public static edu.berkeley.path.model_elements_base.PeMS.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.PeMS.Builder();
  }
  
  /** Creates a new PeMS RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.PeMS.Builder newBuilder(edu.berkeley.path.model_elements_base.PeMS.Builder other) {
    return new edu.berkeley.path.model_elements_base.PeMS.Builder(other);
  }
  
  /** Creates a new PeMS RecordBuilder by copying an existing PeMS instance */
  public static edu.berkeley.path.model_elements_base.PeMS.Builder newBuilder(edu.berkeley.path.model_elements_base.PeMS other) {
    return new edu.berkeley.path.model_elements_base.PeMS.Builder(other);
  }
  
  /**
   * RecordBuilder for PeMS instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PeMS>
    implements org.apache.avro.data.RecordBuilder<PeMS> {

    private long vdsId;
    private edu.berkeley.path.model_elements_base.DateTime timeMeasured;
    private java.lang.Double flow;
    private java.lang.Double density;
    private java.lang.Double densityError;
    private java.lang.Double speed;
    private java.lang.Double speedError;
    private java.lang.Double freeFlowSpeed;
    private java.lang.Double funcLoopFact;
    private java.util.List<java.lang.Double> gFactorLane;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.PeMS.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.PeMS.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing PeMS instance */
    private Builder(edu.berkeley.path.model_elements_base.PeMS other) {
            super(edu.berkeley.path.model_elements_base.PeMS.SCHEMA$);
      if (isValidValue(fields()[0], other.vdsId)) {
        this.vdsId = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.vdsId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeMeasured)) {
        this.timeMeasured = (edu.berkeley.path.model_elements_base.DateTime) data().deepCopy(fields()[1].schema(), other.timeMeasured);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.flow)) {
        this.flow = (java.lang.Double) data().deepCopy(fields()[2].schema(), other.flow);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.density)) {
        this.density = (java.lang.Double) data().deepCopy(fields()[3].schema(), other.density);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.densityError)) {
        this.densityError = (java.lang.Double) data().deepCopy(fields()[4].schema(), other.densityError);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.speed)) {
        this.speed = (java.lang.Double) data().deepCopy(fields()[5].schema(), other.speed);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.speedError)) {
        this.speedError = (java.lang.Double) data().deepCopy(fields()[6].schema(), other.speedError);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.freeFlowSpeed)) {
        this.freeFlowSpeed = (java.lang.Double) data().deepCopy(fields()[7].schema(), other.freeFlowSpeed);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.funcLoopFact)) {
        this.funcLoopFact = (java.lang.Double) data().deepCopy(fields()[8].schema(), other.funcLoopFact);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.gFactorLane)) {
        this.gFactorLane = (java.util.List<java.lang.Double>) data().deepCopy(fields()[9].schema(), other.gFactorLane);
        fieldSetFlags()[9] = true;
      }
    }

    /** Gets the value of the 'vdsId' field */
    public java.lang.Long getVdsId() {
      return vdsId;
    }
    
    /** Sets the value of the 'vdsId' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder setVdsId(long value) {
      validate(fields()[0], value);
      this.vdsId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'vdsId' field has been set */
    public boolean hasVdsId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'vdsId' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder clearVdsId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timeMeasured' field */
    public edu.berkeley.path.model_elements_base.DateTime getTimeMeasured() {
      return timeMeasured;
    }
    
    /** Sets the value of the 'timeMeasured' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder setTimeMeasured(edu.berkeley.path.model_elements_base.DateTime value) {
      validate(fields()[1], value);
      this.timeMeasured = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timeMeasured' field has been set */
    public boolean hasTimeMeasured() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timeMeasured' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder clearTimeMeasured() {
      timeMeasured = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'flow' field */
    public java.lang.Double getFlow() {
      return flow;
    }
    
    /** Sets the value of the 'flow' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder setFlow(java.lang.Double value) {
      validate(fields()[2], value);
      this.flow = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'flow' field has been set */
    public boolean hasFlow() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'flow' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder clearFlow() {
      flow = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'density' field */
    public java.lang.Double getDensity() {
      return density;
    }
    
    /** Sets the value of the 'density' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder setDensity(java.lang.Double value) {
      validate(fields()[3], value);
      this.density = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'density' field has been set */
    public boolean hasDensity() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'density' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder clearDensity() {
      density = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'densityError' field */
    public java.lang.Double getDensityError() {
      return densityError;
    }
    
    /** Sets the value of the 'densityError' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder setDensityError(java.lang.Double value) {
      validate(fields()[4], value);
      this.densityError = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'densityError' field has been set */
    public boolean hasDensityError() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'densityError' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder clearDensityError() {
      densityError = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'speed' field */
    public java.lang.Double getSpeed() {
      return speed;
    }
    
    /** Sets the value of the 'speed' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder setSpeed(java.lang.Double value) {
      validate(fields()[5], value);
      this.speed = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'speed' field has been set */
    public boolean hasSpeed() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'speed' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder clearSpeed() {
      speed = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'speedError' field */
    public java.lang.Double getSpeedError() {
      return speedError;
    }
    
    /** Sets the value of the 'speedError' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder setSpeedError(java.lang.Double value) {
      validate(fields()[6], value);
      this.speedError = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'speedError' field has been set */
    public boolean hasSpeedError() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'speedError' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder clearSpeedError() {
      speedError = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'freeFlowSpeed' field */
    public java.lang.Double getFreeFlowSpeed() {
      return freeFlowSpeed;
    }
    
    /** Sets the value of the 'freeFlowSpeed' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder setFreeFlowSpeed(java.lang.Double value) {
      validate(fields()[7], value);
      this.freeFlowSpeed = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'freeFlowSpeed' field has been set */
    public boolean hasFreeFlowSpeed() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'freeFlowSpeed' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder clearFreeFlowSpeed() {
      freeFlowSpeed = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'funcLoopFact' field */
    public java.lang.Double getFuncLoopFact() {
      return funcLoopFact;
    }
    
    /** Sets the value of the 'funcLoopFact' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder setFuncLoopFact(java.lang.Double value) {
      validate(fields()[8], value);
      this.funcLoopFact = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'funcLoopFact' field has been set */
    public boolean hasFuncLoopFact() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'funcLoopFact' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder clearFuncLoopFact() {
      funcLoopFact = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'gFactorLane' field */
    public java.util.List<java.lang.Double> getGFactorLane() {
      return gFactorLane;
    }
    
    /** Sets the value of the 'gFactorLane' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder setGFactorLane(java.util.List<java.lang.Double> value) {
      validate(fields()[9], value);
      this.gFactorLane = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'gFactorLane' field has been set */
    public boolean hasGFactorLane() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'gFactorLane' field */
    public edu.berkeley.path.model_elements_base.PeMS.Builder clearGFactorLane() {
      gFactorLane = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public PeMS build() {
      try {
        PeMS record = new PeMS();
        record.vdsId = fieldSetFlags()[0] ? this.vdsId : (java.lang.Long) defaultValue(fields()[0]);
        record.timeMeasured = fieldSetFlags()[1] ? this.timeMeasured : (edu.berkeley.path.model_elements_base.DateTime) defaultValue(fields()[1]);
        record.flow = fieldSetFlags()[2] ? this.flow : (java.lang.Double) defaultValue(fields()[2]);
        record.density = fieldSetFlags()[3] ? this.density : (java.lang.Double) defaultValue(fields()[3]);
        record.densityError = fieldSetFlags()[4] ? this.densityError : (java.lang.Double) defaultValue(fields()[4]);
        record.speed = fieldSetFlags()[5] ? this.speed : (java.lang.Double) defaultValue(fields()[5]);
        record.speedError = fieldSetFlags()[6] ? this.speedError : (java.lang.Double) defaultValue(fields()[6]);
        record.freeFlowSpeed = fieldSetFlags()[7] ? this.freeFlowSpeed : (java.lang.Double) defaultValue(fields()[7]);
        record.funcLoopFact = fieldSetFlags()[8] ? this.funcLoopFact : (java.lang.Double) defaultValue(fields()[8]);
        record.gFactorLane = fieldSetFlags()[9] ? this.gFactorLane : (java.util.List<java.lang.Double>) defaultValue(fields()[9]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
