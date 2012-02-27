/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetricsRecord implements org.apache.thrift.TBase<MetricsRecord, MetricsRecord._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MetricsRecord");

  private static final org.apache.thrift.protocol.TField TAGS_FIELD_DESC = new org.apache.thrift.protocol.TField("tags", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField METRICS_FIELD_DESC = new org.apache.thrift.protocol.TField("metrics", org.apache.thrift.protocol.TType.MAP, (short)3);

  public Map<String,String> tags; // required
  public Map<String,Long> metrics; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TAGS((short)2, "tags"),
    METRICS((short)3, "metrics");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 2: // TAGS
          return TAGS;
        case 3: // METRICS
          return METRICS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TAGS, new org.apache.thrift.meta_data.FieldMetaData("tags", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.METRICS, new org.apache.thrift.meta_data.FieldMetaData("metrics", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MetricsRecord.class, metaDataMap);
  }

  public MetricsRecord() {
  }

  public MetricsRecord(
    Map<String,String> tags,
    Map<String,Long> metrics)
  {
    this();
    this.tags = tags;
    this.metrics = metrics;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetricsRecord(MetricsRecord other) {
    if (other.isSetTags()) {
      Map<String,String> __this__tags = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.tags.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__tags_copy_key = other_element_key;

        String __this__tags_copy_value = other_element_value;

        __this__tags.put(__this__tags_copy_key, __this__tags_copy_value);
      }
      this.tags = __this__tags;
    }
    if (other.isSetMetrics()) {
      Map<String,Long> __this__metrics = new HashMap<String,Long>();
      for (Map.Entry<String, Long> other_element : other.metrics.entrySet()) {

        String other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        String __this__metrics_copy_key = other_element_key;

        Long __this__metrics_copy_value = other_element_value;

        __this__metrics.put(__this__metrics_copy_key, __this__metrics_copy_value);
      }
      this.metrics = __this__metrics;
    }
  }

  public MetricsRecord deepCopy() {
    return new MetricsRecord(this);
  }

  @Override
  public void clear() {
    this.tags = null;
    this.metrics = null;
  }

  public int getTagsSize() {
    return (this.tags == null) ? 0 : this.tags.size();
  }

  public void putToTags(String key, String val) {
    if (this.tags == null) {
      this.tags = new HashMap<String,String>();
    }
    this.tags.put(key, val);
  }

  public Map<String,String> getTags() {
    return this.tags;
  }

  public MetricsRecord setTags(Map<String,String> tags) {
    this.tags = tags;
    return this;
  }

  public void unsetTags() {
    this.tags = null;
  }

  /** Returns true if field tags is set (has been assigned a value) and false otherwise */
  public boolean isSetTags() {
    return this.tags != null;
  }

  public void setTagsIsSet(boolean value) {
    if (!value) {
      this.tags = null;
    }
  }

  public int getMetricsSize() {
    return (this.metrics == null) ? 0 : this.metrics.size();
  }

  public void putToMetrics(String key, long val) {
    if (this.metrics == null) {
      this.metrics = new HashMap<String,Long>();
    }
    this.metrics.put(key, val);
  }

  public Map<String,Long> getMetrics() {
    return this.metrics;
  }

  public MetricsRecord setMetrics(Map<String,Long> metrics) {
    this.metrics = metrics;
    return this;
  }

  public void unsetMetrics() {
    this.metrics = null;
  }

  /** Returns true if field metrics is set (has been assigned a value) and false otherwise */
  public boolean isSetMetrics() {
    return this.metrics != null;
  }

  public void setMetricsIsSet(boolean value) {
    if (!value) {
      this.metrics = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TAGS:
      if (value == null) {
        unsetTags();
      } else {
        setTags((Map<String,String>)value);
      }
      break;

    case METRICS:
      if (value == null) {
        unsetMetrics();
      } else {
        setMetrics((Map<String,Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TAGS:
      return getTags();

    case METRICS:
      return getMetrics();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TAGS:
      return isSetTags();
    case METRICS:
      return isSetMetrics();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetricsRecord)
      return this.equals((MetricsRecord)that);
    return false;
  }

  public boolean equals(MetricsRecord that) {
    if (that == null)
      return false;

    boolean this_present_tags = true && this.isSetTags();
    boolean that_present_tags = true && that.isSetTags();
    if (this_present_tags || that_present_tags) {
      if (!(this_present_tags && that_present_tags))
        return false;
      if (!this.tags.equals(that.tags))
        return false;
    }

    boolean this_present_metrics = true && this.isSetMetrics();
    boolean that_present_metrics = true && that.isSetMetrics();
    if (this_present_metrics || that_present_metrics) {
      if (!(this_present_metrics && that_present_metrics))
        return false;
      if (!this.metrics.equals(that.metrics))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(MetricsRecord other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MetricsRecord typedOther = (MetricsRecord)other;

    lastComparison = Boolean.valueOf(isSetTags()).compareTo(typedOther.isSetTags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTags()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tags, typedOther.tags);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetrics()).compareTo(typedOther.isSetMetrics());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetrics()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metrics, typedOther.metrics);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 2: // TAGS
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map9 = iprot.readMapBegin();
              this.tags = new HashMap<String,String>(2*_map9.size);
              for (int _i10 = 0; _i10 < _map9.size; ++_i10)
              {
                String _key11; // required
                String _val12; // required
                _key11 = iprot.readString();
                _val12 = iprot.readString();
                this.tags.put(_key11, _val12);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // METRICS
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map13 = iprot.readMapBegin();
              this.metrics = new HashMap<String,Long>(2*_map13.size);
              for (int _i14 = 0; _i14 < _map13.size; ++_i14)
              {
                String _key15; // required
                long _val16; // required
                _key15 = iprot.readString();
                _val16 = iprot.readI64();
                this.metrics.put(_key15, _val16);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.tags != null) {
      oprot.writeFieldBegin(TAGS_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, this.tags.size()));
        for (Map.Entry<String, String> _iter17 : this.tags.entrySet())
        {
          oprot.writeString(_iter17.getKey());
          oprot.writeString(_iter17.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.metrics != null) {
      oprot.writeFieldBegin(METRICS_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, this.metrics.size()));
        for (Map.Entry<String, Long> _iter18 : this.metrics.entrySet())
        {
          oprot.writeString(_iter18.getKey());
          oprot.writeI64(_iter18.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MetricsRecord(");
    boolean first = true;

    sb.append("tags:");
    if (this.tags == null) {
      sb.append("null");
    } else {
      sb.append(this.tags);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("metrics:");
    if (this.metrics == null) {
      sb.append("null");
    } else {
      sb.append(this.metrics);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

