/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.workspace;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-07-14")
public class Notification implements org.apache.thrift.TBase<Notification, Notification._Fields>, java.io.Serializable, Cloneable, Comparable<Notification> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Notification");

  private static final org.apache.thrift.protocol.TField NOTIFICATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("notificationId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField GATEWAY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("gatewayId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField NOTIFICATION_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("notificationMessage", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CREATION_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("creationTime", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField PUBLISHED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("publishedTime", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField EXPIRATION_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("expirationTime", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField PRIORITY_FIELD_DESC = new org.apache.thrift.protocol.TField("priority", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NotificationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NotificationTupleSchemeFactory());
  }

  private String notificationId; // optional
  private String gatewayId; // required
  private String title; // required
  private String notificationMessage; // required
  private long creationTime; // optional
  private long publishedTime; // optional
  private long expirationTime; // optional
  private NotificationPriority priority; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOTIFICATION_ID((short)1, "notificationId"),
    GATEWAY_ID((short)2, "gatewayId"),
    TITLE((short)3, "title"),
    NOTIFICATION_MESSAGE((short)4, "notificationMessage"),
    CREATION_TIME((short)5, "creationTime"),
    PUBLISHED_TIME((short)6, "publishedTime"),
    EXPIRATION_TIME((short)7, "expirationTime"),
    /**
     * 
     * @see NotificationPriority
     */
    PRIORITY((short)8, "priority");

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
        case 1: // NOTIFICATION_ID
          return NOTIFICATION_ID;
        case 2: // GATEWAY_ID
          return GATEWAY_ID;
        case 3: // TITLE
          return TITLE;
        case 4: // NOTIFICATION_MESSAGE
          return NOTIFICATION_MESSAGE;
        case 5: // CREATION_TIME
          return CREATION_TIME;
        case 6: // PUBLISHED_TIME
          return PUBLISHED_TIME;
        case 7: // EXPIRATION_TIME
          return EXPIRATION_TIME;
        case 8: // PRIORITY
          return PRIORITY;
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
  private static final int __CREATIONTIME_ISSET_ID = 0;
  private static final int __PUBLISHEDTIME_ISSET_ID = 1;
  private static final int __EXPIRATIONTIME_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NOTIFICATION_ID,_Fields.CREATION_TIME,_Fields.PUBLISHED_TIME,_Fields.EXPIRATION_TIME,_Fields.PRIORITY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOTIFICATION_ID, new org.apache.thrift.meta_data.FieldMetaData("notificationId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GATEWAY_ID, new org.apache.thrift.meta_data.FieldMetaData("gatewayId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NOTIFICATION_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("notificationMessage", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATION_TIME, new org.apache.thrift.meta_data.FieldMetaData("creationTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PUBLISHED_TIME, new org.apache.thrift.meta_data.FieldMetaData("publishedTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EXPIRATION_TIME, new org.apache.thrift.meta_data.FieldMetaData("expirationTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PRIORITY, new org.apache.thrift.meta_data.FieldMetaData("priority", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, NotificationPriority.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Notification.class, metaDataMap);
  }

  public Notification() {
  }

  public Notification(
    String gatewayId,
    String title,
    String notificationMessage)
  {
    this();
    this.gatewayId = gatewayId;
    this.title = title;
    this.notificationMessage = notificationMessage;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Notification(Notification other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNotificationId()) {
      this.notificationId = other.notificationId;
    }
    if (other.isSetGatewayId()) {
      this.gatewayId = other.gatewayId;
    }
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetNotificationMessage()) {
      this.notificationMessage = other.notificationMessage;
    }
    this.creationTime = other.creationTime;
    this.publishedTime = other.publishedTime;
    this.expirationTime = other.expirationTime;
    if (other.isSetPriority()) {
      this.priority = other.priority;
    }
  }

  public Notification deepCopy() {
    return new Notification(this);
  }

  @Override
  public void clear() {
    this.notificationId = null;
    this.gatewayId = null;
    this.title = null;
    this.notificationMessage = null;
    setCreationTimeIsSet(false);
    this.creationTime = 0;
    setPublishedTimeIsSet(false);
    this.publishedTime = 0;
    setExpirationTimeIsSet(false);
    this.expirationTime = 0;
    this.priority = null;
  }

  public String getNotificationId() {
    return this.notificationId;
  }

  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }

  public void unsetNotificationId() {
    this.notificationId = null;
  }

  /** Returns true if field notificationId is set (has been assigned a value) and false otherwise */
  public boolean isSetNotificationId() {
    return this.notificationId != null;
  }

  public void setNotificationIdIsSet(boolean value) {
    if (!value) {
      this.notificationId = null;
    }
  }

  public String getGatewayId() {
    return this.gatewayId;
  }

  public void setGatewayId(String gatewayId) {
    this.gatewayId = gatewayId;
  }

  public void unsetGatewayId() {
    this.gatewayId = null;
  }

  /** Returns true if field gatewayId is set (has been assigned a value) and false otherwise */
  public boolean isSetGatewayId() {
    return this.gatewayId != null;
  }

  public void setGatewayIdIsSet(boolean value) {
    if (!value) {
      this.gatewayId = null;
    }
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getNotificationMessage() {
    return this.notificationMessage;
  }

  public void setNotificationMessage(String notificationMessage) {
    this.notificationMessage = notificationMessage;
  }

  public void unsetNotificationMessage() {
    this.notificationMessage = null;
  }

  /** Returns true if field notificationMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetNotificationMessage() {
    return this.notificationMessage != null;
  }

  public void setNotificationMessageIsSet(boolean value) {
    if (!value) {
      this.notificationMessage = null;
    }
  }

  public long getCreationTime() {
    return this.creationTime;
  }

  public void setCreationTime(long creationTime) {
    this.creationTime = creationTime;
    setCreationTimeIsSet(true);
  }

  public void unsetCreationTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATIONTIME_ISSET_ID);
  }

  /** Returns true if field creationTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreationTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATIONTIME_ISSET_ID);
  }

  public void setCreationTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATIONTIME_ISSET_ID, value);
  }

  public long getPublishedTime() {
    return this.publishedTime;
  }

  public void setPublishedTime(long publishedTime) {
    this.publishedTime = publishedTime;
    setPublishedTimeIsSet(true);
  }

  public void unsetPublishedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PUBLISHEDTIME_ISSET_ID);
  }

  /** Returns true if field publishedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetPublishedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __PUBLISHEDTIME_ISSET_ID);
  }

  public void setPublishedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PUBLISHEDTIME_ISSET_ID, value);
  }

  public long getExpirationTime() {
    return this.expirationTime;
  }

  public void setExpirationTime(long expirationTime) {
    this.expirationTime = expirationTime;
    setExpirationTimeIsSet(true);
  }

  public void unsetExpirationTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXPIRATIONTIME_ISSET_ID);
  }

  /** Returns true if field expirationTime is set (has been assigned a value) and false otherwise */
  public boolean isSetExpirationTime() {
    return EncodingUtils.testBit(__isset_bitfield, __EXPIRATIONTIME_ISSET_ID);
  }

  public void setExpirationTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXPIRATIONTIME_ISSET_ID, value);
  }

  /**
   * 
   * @see NotificationPriority
   */
  public NotificationPriority getPriority() {
    return this.priority;
  }

  /**
   * 
   * @see NotificationPriority
   */
  public void setPriority(NotificationPriority priority) {
    this.priority = priority;
  }

  public void unsetPriority() {
    this.priority = null;
  }

  /** Returns true if field priority is set (has been assigned a value) and false otherwise */
  public boolean isSetPriority() {
    return this.priority != null;
  }

  public void setPriorityIsSet(boolean value) {
    if (!value) {
      this.priority = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NOTIFICATION_ID:
      if (value == null) {
        unsetNotificationId();
      } else {
        setNotificationId((String)value);
      }
      break;

    case GATEWAY_ID:
      if (value == null) {
        unsetGatewayId();
      } else {
        setGatewayId((String)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case NOTIFICATION_MESSAGE:
      if (value == null) {
        unsetNotificationMessage();
      } else {
        setNotificationMessage((String)value);
      }
      break;

    case CREATION_TIME:
      if (value == null) {
        unsetCreationTime();
      } else {
        setCreationTime((Long)value);
      }
      break;

    case PUBLISHED_TIME:
      if (value == null) {
        unsetPublishedTime();
      } else {
        setPublishedTime((Long)value);
      }
      break;

    case EXPIRATION_TIME:
      if (value == null) {
        unsetExpirationTime();
      } else {
        setExpirationTime((Long)value);
      }
      break;

    case PRIORITY:
      if (value == null) {
        unsetPriority();
      } else {
        setPriority((NotificationPriority)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NOTIFICATION_ID:
      return getNotificationId();

    case GATEWAY_ID:
      return getGatewayId();

    case TITLE:
      return getTitle();

    case NOTIFICATION_MESSAGE:
      return getNotificationMessage();

    case CREATION_TIME:
      return getCreationTime();

    case PUBLISHED_TIME:
      return getPublishedTime();

    case EXPIRATION_TIME:
      return getExpirationTime();

    case PRIORITY:
      return getPriority();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NOTIFICATION_ID:
      return isSetNotificationId();
    case GATEWAY_ID:
      return isSetGatewayId();
    case TITLE:
      return isSetTitle();
    case NOTIFICATION_MESSAGE:
      return isSetNotificationMessage();
    case CREATION_TIME:
      return isSetCreationTime();
    case PUBLISHED_TIME:
      return isSetPublishedTime();
    case EXPIRATION_TIME:
      return isSetExpirationTime();
    case PRIORITY:
      return isSetPriority();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Notification)
      return this.equals((Notification)that);
    return false;
  }

  public boolean equals(Notification that) {
    if (that == null)
      return false;

    boolean this_present_notificationId = true && this.isSetNotificationId();
    boolean that_present_notificationId = true && that.isSetNotificationId();
    if (this_present_notificationId || that_present_notificationId) {
      if (!(this_present_notificationId && that_present_notificationId))
        return false;
      if (!this.notificationId.equals(that.notificationId))
        return false;
    }

    boolean this_present_gatewayId = true && this.isSetGatewayId();
    boolean that_present_gatewayId = true && that.isSetGatewayId();
    if (this_present_gatewayId || that_present_gatewayId) {
      if (!(this_present_gatewayId && that_present_gatewayId))
        return false;
      if (!this.gatewayId.equals(that.gatewayId))
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_notificationMessage = true && this.isSetNotificationMessage();
    boolean that_present_notificationMessage = true && that.isSetNotificationMessage();
    if (this_present_notificationMessage || that_present_notificationMessage) {
      if (!(this_present_notificationMessage && that_present_notificationMessage))
        return false;
      if (!this.notificationMessage.equals(that.notificationMessage))
        return false;
    }

    boolean this_present_creationTime = true && this.isSetCreationTime();
    boolean that_present_creationTime = true && that.isSetCreationTime();
    if (this_present_creationTime || that_present_creationTime) {
      if (!(this_present_creationTime && that_present_creationTime))
        return false;
      if (this.creationTime != that.creationTime)
        return false;
    }

    boolean this_present_publishedTime = true && this.isSetPublishedTime();
    boolean that_present_publishedTime = true && that.isSetPublishedTime();
    if (this_present_publishedTime || that_present_publishedTime) {
      if (!(this_present_publishedTime && that_present_publishedTime))
        return false;
      if (this.publishedTime != that.publishedTime)
        return false;
    }

    boolean this_present_expirationTime = true && this.isSetExpirationTime();
    boolean that_present_expirationTime = true && that.isSetExpirationTime();
    if (this_present_expirationTime || that_present_expirationTime) {
      if (!(this_present_expirationTime && that_present_expirationTime))
        return false;
      if (this.expirationTime != that.expirationTime)
        return false;
    }

    boolean this_present_priority = true && this.isSetPriority();
    boolean that_present_priority = true && that.isSetPriority();
    if (this_present_priority || that_present_priority) {
      if (!(this_present_priority && that_present_priority))
        return false;
      if (!this.priority.equals(that.priority))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_notificationId = true && (isSetNotificationId());
    list.add(present_notificationId);
    if (present_notificationId)
      list.add(notificationId);

    boolean present_gatewayId = true && (isSetGatewayId());
    list.add(present_gatewayId);
    if (present_gatewayId)
      list.add(gatewayId);

    boolean present_title = true && (isSetTitle());
    list.add(present_title);
    if (present_title)
      list.add(title);

    boolean present_notificationMessage = true && (isSetNotificationMessage());
    list.add(present_notificationMessage);
    if (present_notificationMessage)
      list.add(notificationMessage);

    boolean present_creationTime = true && (isSetCreationTime());
    list.add(present_creationTime);
    if (present_creationTime)
      list.add(creationTime);

    boolean present_publishedTime = true && (isSetPublishedTime());
    list.add(present_publishedTime);
    if (present_publishedTime)
      list.add(publishedTime);

    boolean present_expirationTime = true && (isSetExpirationTime());
    list.add(present_expirationTime);
    if (present_expirationTime)
      list.add(expirationTime);

    boolean present_priority = true && (isSetPriority());
    list.add(present_priority);
    if (present_priority)
      list.add(priority.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(Notification other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNotificationId()).compareTo(other.isSetNotificationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotificationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notificationId, other.notificationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGatewayId()).compareTo(other.isSetGatewayId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGatewayId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gatewayId, other.gatewayId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotificationMessage()).compareTo(other.isSetNotificationMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotificationMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notificationMessage, other.notificationMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreationTime()).compareTo(other.isSetCreationTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreationTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creationTime, other.creationTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPublishedTime()).compareTo(other.isSetPublishedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPublishedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.publishedTime, other.publishedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExpirationTime()).compareTo(other.isSetExpirationTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpirationTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expirationTime, other.expirationTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriority()).compareTo(other.isSetPriority());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriority()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priority, other.priority);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Notification(");
    boolean first = true;

    if (isSetNotificationId()) {
      sb.append("notificationId:");
      if (this.notificationId == null) {
        sb.append("null");
      } else {
        sb.append(this.notificationId);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("gatewayId:");
    if (this.gatewayId == null) {
      sb.append("null");
    } else {
      sb.append(this.gatewayId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("notificationMessage:");
    if (this.notificationMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.notificationMessage);
    }
    first = false;
    if (isSetCreationTime()) {
      if (!first) sb.append(", ");
      sb.append("creationTime:");
      sb.append(this.creationTime);
      first = false;
    }
    if (isSetPublishedTime()) {
      if (!first) sb.append(", ");
      sb.append("publishedTime:");
      sb.append(this.publishedTime);
      first = false;
    }
    if (isSetExpirationTime()) {
      if (!first) sb.append(", ");
      sb.append("expirationTime:");
      sb.append(this.expirationTime);
      first = false;
    }
    if (isSetPriority()) {
      if (!first) sb.append(", ");
      sb.append("priority:");
      if (this.priority == null) {
        sb.append("null");
      } else {
        sb.append(this.priority);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetGatewayId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'gatewayId' is unset! Struct:" + toString());
    }

    if (!isSetTitle()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'title' is unset! Struct:" + toString());
    }

    if (!isSetNotificationMessage()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'notificationMessage' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NotificationStandardSchemeFactory implements SchemeFactory {
    public NotificationStandardScheme getScheme() {
      return new NotificationStandardScheme();
    }
  }

  private static class NotificationStandardScheme extends StandardScheme<Notification> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Notification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOTIFICATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.notificationId = iprot.readString();
              struct.setNotificationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GATEWAY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gatewayId = iprot.readString();
              struct.setGatewayIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NOTIFICATION_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.notificationMessage = iprot.readString();
              struct.setNotificationMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CREATION_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.creationTime = iprot.readI64();
              struct.setCreationTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PUBLISHED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.publishedTime = iprot.readI64();
              struct.setPublishedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // EXPIRATION_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.expirationTime = iprot.readI64();
              struct.setExpirationTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // PRIORITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.priority = org.apache.airavata.model.workspace.NotificationPriority.findByValue(iprot.readI32());
              struct.setPriorityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Notification struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.notificationId != null) {
        if (struct.isSetNotificationId()) {
          oprot.writeFieldBegin(NOTIFICATION_ID_FIELD_DESC);
          oprot.writeString(struct.notificationId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.gatewayId != null) {
        oprot.writeFieldBegin(GATEWAY_ID_FIELD_DESC);
        oprot.writeString(struct.gatewayId);
        oprot.writeFieldEnd();
      }
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.notificationMessage != null) {
        oprot.writeFieldBegin(NOTIFICATION_MESSAGE_FIELD_DESC);
        oprot.writeString(struct.notificationMessage);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCreationTime()) {
        oprot.writeFieldBegin(CREATION_TIME_FIELD_DESC);
        oprot.writeI64(struct.creationTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPublishedTime()) {
        oprot.writeFieldBegin(PUBLISHED_TIME_FIELD_DESC);
        oprot.writeI64(struct.publishedTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetExpirationTime()) {
        oprot.writeFieldBegin(EXPIRATION_TIME_FIELD_DESC);
        oprot.writeI64(struct.expirationTime);
        oprot.writeFieldEnd();
      }
      if (struct.priority != null) {
        if (struct.isSetPriority()) {
          oprot.writeFieldBegin(PRIORITY_FIELD_DESC);
          oprot.writeI32(struct.priority.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NotificationTupleSchemeFactory implements SchemeFactory {
    public NotificationTupleScheme getScheme() {
      return new NotificationTupleScheme();
    }
  }

  private static class NotificationTupleScheme extends TupleScheme<Notification> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Notification struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.gatewayId);
      oprot.writeString(struct.title);
      oprot.writeString(struct.notificationMessage);
      BitSet optionals = new BitSet();
      if (struct.isSetNotificationId()) {
        optionals.set(0);
      }
      if (struct.isSetCreationTime()) {
        optionals.set(1);
      }
      if (struct.isSetPublishedTime()) {
        optionals.set(2);
      }
      if (struct.isSetExpirationTime()) {
        optionals.set(3);
      }
      if (struct.isSetPriority()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetNotificationId()) {
        oprot.writeString(struct.notificationId);
      }
      if (struct.isSetCreationTime()) {
        oprot.writeI64(struct.creationTime);
      }
      if (struct.isSetPublishedTime()) {
        oprot.writeI64(struct.publishedTime);
      }
      if (struct.isSetExpirationTime()) {
        oprot.writeI64(struct.expirationTime);
      }
      if (struct.isSetPriority()) {
        oprot.writeI32(struct.priority.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Notification struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.gatewayId = iprot.readString();
      struct.setGatewayIdIsSet(true);
      struct.title = iprot.readString();
      struct.setTitleIsSet(true);
      struct.notificationMessage = iprot.readString();
      struct.setNotificationMessageIsSet(true);
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.notificationId = iprot.readString();
        struct.setNotificationIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.creationTime = iprot.readI64();
        struct.setCreationTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.publishedTime = iprot.readI64();
        struct.setPublishedTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.expirationTime = iprot.readI64();
        struct.setExpirationTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.priority = org.apache.airavata.model.workspace.NotificationPriority.findByValue(iprot.readI32());
        struct.setPriorityIsSet(true);
      }
    }
  }

}

