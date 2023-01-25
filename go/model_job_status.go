/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.0.230
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
	"fmt"
)

// JobStatus Status of the certificate Order Task
type JobStatus string

// List of JobStatus
const (
	WAITING JobStatus = "waiting"
	PENDING JobStatus = "pending"
	PROCESSING JobStatus = "processing"
	SUCCESS JobStatus = "success"
	FAILED JobStatus = "failed"
	SCHEDULE_REQUEST JobStatus = "schedule_request"
	SCHEDULE_RESPONSE JobStatus = "schedule_response"
	RETRY JobStatus = "retry"
	CONNECTION_OR_CHANNEL_CLOSED JobStatus = "connection_or_channel_closed"
	UNKNOWN JobStatus = "unknown"
)

// All allowed values of JobStatus enum
var AllowedJobStatusEnumValues = []JobStatus{
	"waiting",
	"pending",
	"processing",
	"success",
	"failed",
	"schedule_request",
	"schedule_response",
	"retry",
	"connection_or_channel_closed",
	"unknown",
}

func (v *JobStatus) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := JobStatus(value)
	for _, existing := range AllowedJobStatusEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid JobStatus", value)
}

// NewJobStatusFromValue returns a pointer to a valid JobStatus
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewJobStatusFromValue(v string) (*JobStatus, error) {
	ev := JobStatus(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for JobStatus: valid values are %v", v, AllowedJobStatusEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v JobStatus) IsValid() bool {
	for _, existing := range AllowedJobStatusEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to JobStatus value
func (v JobStatus) Ptr() *JobStatus {
	return &v
}

type NullableJobStatus struct {
	value *JobStatus
	isSet bool
}

func (v NullableJobStatus) Get() *JobStatus {
	return v.value
}

func (v *NullableJobStatus) Set(val *JobStatus) {
	v.value = val
	v.isSet = true
}

func (v NullableJobStatus) IsSet() bool {
	return v.isSet
}

func (v *NullableJobStatus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableJobStatus(val *JobStatus) *NullableJobStatus {
	return &NullableJobStatus{value: val, isSet: true}
}

func (v NullableJobStatus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableJobStatus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

