/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum DatanodeState implements org.apache.thrift.TEnum {
  NORMAL_STATE(1),
  DECOMMISSION_INPROGRESS(2),
  DECOMMISSIONED(3);

  private final int value;

  private DatanodeState(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static DatanodeState findByValue(int value) { 
    switch (value) {
      case 1:
        return NORMAL_STATE;
      case 2:
        return DECOMMISSION_INPROGRESS;
      case 3:
        return DECOMMISSIONED;
      default:
        return null;
    }
  }
}
