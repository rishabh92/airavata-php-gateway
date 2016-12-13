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
#include "airavata_commons_types.h"

#include <algorithm>
#include <ostream>

#include <thrift/TToString.h>

namespace apache { namespace airavata { namespace model { namespace commons {


ErrorModel::~ErrorModel() throw() {
}


void ErrorModel::__set_errorId(const std::string& val) {
  this->errorId = val;
}

void ErrorModel::__set_creationTime(const int64_t val) {
  this->creationTime = val;
__isset.creationTime = true;
}

void ErrorModel::__set_actualErrorMessage(const std::string& val) {
  this->actualErrorMessage = val;
__isset.actualErrorMessage = true;
}

void ErrorModel::__set_userFriendlyMessage(const std::string& val) {
  this->userFriendlyMessage = val;
__isset.userFriendlyMessage = true;
}

void ErrorModel::__set_transientOrPersistent(const bool val) {
  this->transientOrPersistent = val;
__isset.transientOrPersistent = true;
}

void ErrorModel::__set_rootCauseErrorIdList(const std::vector<std::string> & val) {
  this->rootCauseErrorIdList = val;
__isset.rootCauseErrorIdList = true;
}

uint32_t ErrorModel::read(::apache::thrift::protocol::TProtocol* iprot) {

  apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_errorId = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->errorId);
          isset_errorId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->creationTime);
          this->__isset.creationTime = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->actualErrorMessage);
          this->__isset.actualErrorMessage = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->userFriendlyMessage);
          this->__isset.userFriendlyMessage = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->transientOrPersistent);
          this->__isset.transientOrPersistent = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->rootCauseErrorIdList.clear();
            uint32_t _size0;
            ::apache::thrift::protocol::TType _etype3;
            xfer += iprot->readListBegin(_etype3, _size0);
            this->rootCauseErrorIdList.resize(_size0);
            uint32_t _i4;
            for (_i4 = 0; _i4 < _size0; ++_i4)
            {
              xfer += iprot->readString(this->rootCauseErrorIdList[_i4]);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.rootCauseErrorIdList = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_errorId)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t ErrorModel::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("ErrorModel");

  xfer += oprot->writeFieldBegin("errorId", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->errorId);
  xfer += oprot->writeFieldEnd();

  if (this->__isset.creationTime) {
    xfer += oprot->writeFieldBegin("creationTime", ::apache::thrift::protocol::T_I64, 2);
    xfer += oprot->writeI64(this->creationTime);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.actualErrorMessage) {
    xfer += oprot->writeFieldBegin("actualErrorMessage", ::apache::thrift::protocol::T_STRING, 3);
    xfer += oprot->writeString(this->actualErrorMessage);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.userFriendlyMessage) {
    xfer += oprot->writeFieldBegin("userFriendlyMessage", ::apache::thrift::protocol::T_STRING, 4);
    xfer += oprot->writeString(this->userFriendlyMessage);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.transientOrPersistent) {
    xfer += oprot->writeFieldBegin("transientOrPersistent", ::apache::thrift::protocol::T_BOOL, 5);
    xfer += oprot->writeBool(this->transientOrPersistent);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.rootCauseErrorIdList) {
    xfer += oprot->writeFieldBegin("rootCauseErrorIdList", ::apache::thrift::protocol::T_LIST, 6);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRING, static_cast<uint32_t>(this->rootCauseErrorIdList.size()));
      std::vector<std::string> ::const_iterator _iter5;
      for (_iter5 = this->rootCauseErrorIdList.begin(); _iter5 != this->rootCauseErrorIdList.end(); ++_iter5)
      {
        xfer += oprot->writeString((*_iter5));
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(ErrorModel &a, ErrorModel &b) {
  using ::std::swap;
  swap(a.errorId, b.errorId);
  swap(a.creationTime, b.creationTime);
  swap(a.actualErrorMessage, b.actualErrorMessage);
  swap(a.userFriendlyMessage, b.userFriendlyMessage);
  swap(a.transientOrPersistent, b.transientOrPersistent);
  swap(a.rootCauseErrorIdList, b.rootCauseErrorIdList);
  swap(a.__isset, b.__isset);
}

ErrorModel::ErrorModel(const ErrorModel& other6) {
  errorId = other6.errorId;
  creationTime = other6.creationTime;
  actualErrorMessage = other6.actualErrorMessage;
  userFriendlyMessage = other6.userFriendlyMessage;
  transientOrPersistent = other6.transientOrPersistent;
  rootCauseErrorIdList = other6.rootCauseErrorIdList;
  __isset = other6.__isset;
}
ErrorModel& ErrorModel::operator=(const ErrorModel& other7) {
  errorId = other7.errorId;
  creationTime = other7.creationTime;
  actualErrorMessage = other7.actualErrorMessage;
  userFriendlyMessage = other7.userFriendlyMessage;
  transientOrPersistent = other7.transientOrPersistent;
  rootCauseErrorIdList = other7.rootCauseErrorIdList;
  __isset = other7.__isset;
  return *this;
}
void ErrorModel::printTo(std::ostream& out) const {
  using ::apache::thrift::to_string;
  out << "ErrorModel(";
  out << "errorId=" << to_string(errorId);
  out << ", " << "creationTime="; (__isset.creationTime ? (out << to_string(creationTime)) : (out << "<null>"));
  out << ", " << "actualErrorMessage="; (__isset.actualErrorMessage ? (out << to_string(actualErrorMessage)) : (out << "<null>"));
  out << ", " << "userFriendlyMessage="; (__isset.userFriendlyMessage ? (out << to_string(userFriendlyMessage)) : (out << "<null>"));
  out << ", " << "transientOrPersistent="; (__isset.transientOrPersistent ? (out << to_string(transientOrPersistent)) : (out << "<null>"));
  out << ", " << "rootCauseErrorIdList="; (__isset.rootCauseErrorIdList ? (out << to_string(rootCauseErrorIdList)) : (out << "<null>"));
  out << ")";
}


ValidatorResult::~ValidatorResult() throw() {
}


void ValidatorResult::__set_result(const bool val) {
  this->result = val;
}

void ValidatorResult::__set_errorDetails(const std::string& val) {
  this->errorDetails = val;
__isset.errorDetails = true;
}

uint32_t ValidatorResult::read(::apache::thrift::protocol::TProtocol* iprot) {

  apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_result = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->result);
          isset_result = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->errorDetails);
          this->__isset.errorDetails = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_result)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t ValidatorResult::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("ValidatorResult");

  xfer += oprot->writeFieldBegin("result", ::apache::thrift::protocol::T_BOOL, 1);
  xfer += oprot->writeBool(this->result);
  xfer += oprot->writeFieldEnd();

  if (this->__isset.errorDetails) {
    xfer += oprot->writeFieldBegin("errorDetails", ::apache::thrift::protocol::T_STRING, 2);
    xfer += oprot->writeString(this->errorDetails);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(ValidatorResult &a, ValidatorResult &b) {
  using ::std::swap;
  swap(a.result, b.result);
  swap(a.errorDetails, b.errorDetails);
  swap(a.__isset, b.__isset);
}

ValidatorResult::ValidatorResult(const ValidatorResult& other8) {
  result = other8.result;
  errorDetails = other8.errorDetails;
  __isset = other8.__isset;
}
ValidatorResult& ValidatorResult::operator=(const ValidatorResult& other9) {
  result = other9.result;
  errorDetails = other9.errorDetails;
  __isset = other9.__isset;
  return *this;
}
void ValidatorResult::printTo(std::ostream& out) const {
  using ::apache::thrift::to_string;
  out << "ValidatorResult(";
  out << "result=" << to_string(result);
  out << ", " << "errorDetails="; (__isset.errorDetails ? (out << to_string(errorDetails)) : (out << "<null>"));
  out << ")";
}


ValidationResults::~ValidationResults() throw() {
}


void ValidationResults::__set_validationState(const bool val) {
  this->validationState = val;
}

void ValidationResults::__set_validationResultList(const std::vector<ValidatorResult> & val) {
  this->validationResultList = val;
}

uint32_t ValidationResults::read(::apache::thrift::protocol::TProtocol* iprot) {

  apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_validationState = false;
  bool isset_validationResultList = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->validationState);
          isset_validationState = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->validationResultList.clear();
            uint32_t _size10;
            ::apache::thrift::protocol::TType _etype13;
            xfer += iprot->readListBegin(_etype13, _size10);
            this->validationResultList.resize(_size10);
            uint32_t _i14;
            for (_i14 = 0; _i14 < _size10; ++_i14)
            {
              xfer += this->validationResultList[_i14].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          isset_validationResultList = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_validationState)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_validationResultList)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t ValidationResults::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("ValidationResults");

  xfer += oprot->writeFieldBegin("validationState", ::apache::thrift::protocol::T_BOOL, 1);
  xfer += oprot->writeBool(this->validationState);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("validationResultList", ::apache::thrift::protocol::T_LIST, 2);
  {
    xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->validationResultList.size()));
    std::vector<ValidatorResult> ::const_iterator _iter15;
    for (_iter15 = this->validationResultList.begin(); _iter15 != this->validationResultList.end(); ++_iter15)
    {
      xfer += (*_iter15).write(oprot);
    }
    xfer += oprot->writeListEnd();
  }
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(ValidationResults &a, ValidationResults &b) {
  using ::std::swap;
  swap(a.validationState, b.validationState);
  swap(a.validationResultList, b.validationResultList);
}

ValidationResults::ValidationResults(const ValidationResults& other16) {
  validationState = other16.validationState;
  validationResultList = other16.validationResultList;
}
ValidationResults& ValidationResults::operator=(const ValidationResults& other17) {
  validationState = other17.validationState;
  validationResultList = other17.validationResultList;
  return *this;
}
void ValidationResults::printTo(std::ostream& out) const {
  using ::apache::thrift::to_string;
  out << "ValidationResults(";
  out << "validationState=" << to_string(validationState);
  out << ", " << "validationResultList=" << to_string(validationResultList);
  out << ")";
}

}}}} // namespace
