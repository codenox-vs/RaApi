/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.2.8
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
	"time"
)

// CertificateOrderTask struct for CertificateOrderTask
type CertificateOrderTask struct {
	// Certificate Order Task reference
	Uuid string `json:"uuid"`
	// Certificate Order creation date time
	CreatedOn *time.Time `json:"createdOn,omitempty"`
	// Scheduled date time
	TimeScheduled time.Time `json:"timeScheduled"`
	// Started date time
	TimeStarted NullableTime `json:"timeStarted,omitempty"`
	// Finished date time
	TimeFinished NullableTime `json:"timeFinished,omitempty"`
	Status JobStatus `json:"status"`
	Type JobType `json:"type"`
	// Number of executions
	NumberOfExecutions int32 `json:"numberOfExecutions"`
	// Response
	Response NullableString `json:"response,omitempty"`
	// Error message
	Error NullableString `json:"error,omitempty"`
}

// NewCertificateOrderTask instantiates a new CertificateOrderTask object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCertificateOrderTask(uuid string, timeScheduled time.Time, status JobStatus, type_ JobType, numberOfExecutions int32) *CertificateOrderTask {
	this := CertificateOrderTask{}
	this.Uuid = uuid
	this.TimeScheduled = timeScheduled
	this.Status = status
	this.Type = type_
	this.NumberOfExecutions = numberOfExecutions
	return &this
}

// NewCertificateOrderTaskWithDefaults instantiates a new CertificateOrderTask object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCertificateOrderTaskWithDefaults() *CertificateOrderTask {
	this := CertificateOrderTask{}
	return &this
}

// GetUuid returns the Uuid field value
func (o *CertificateOrderTask) GetUuid() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Uuid
}

// GetUuidOk returns a tuple with the Uuid field value
// and a boolean to check if the value has been set.
func (o *CertificateOrderTask) GetUuidOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Uuid, true
}

// SetUuid sets field value
func (o *CertificateOrderTask) SetUuid(v string) {
	o.Uuid = v
}

// GetCreatedOn returns the CreatedOn field value if set, zero value otherwise.
func (o *CertificateOrderTask) GetCreatedOn() time.Time {
	if o == nil || o.CreatedOn == nil {
		var ret time.Time
		return ret
	}
	return *o.CreatedOn
}

// GetCreatedOnOk returns a tuple with the CreatedOn field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CertificateOrderTask) GetCreatedOnOk() (*time.Time, bool) {
	if o == nil || o.CreatedOn == nil {
		return nil, false
	}
	return o.CreatedOn, true
}

// HasCreatedOn returns a boolean if a field has been set.
func (o *CertificateOrderTask) HasCreatedOn() bool {
	if o != nil && o.CreatedOn != nil {
		return true
	}

	return false
}

// SetCreatedOn gets a reference to the given time.Time and assigns it to the CreatedOn field.
func (o *CertificateOrderTask) SetCreatedOn(v time.Time) {
	o.CreatedOn = &v
}

// GetTimeScheduled returns the TimeScheduled field value
func (o *CertificateOrderTask) GetTimeScheduled() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.TimeScheduled
}

// GetTimeScheduledOk returns a tuple with the TimeScheduled field value
// and a boolean to check if the value has been set.
func (o *CertificateOrderTask) GetTimeScheduledOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TimeScheduled, true
}

// SetTimeScheduled sets field value
func (o *CertificateOrderTask) SetTimeScheduled(v time.Time) {
	o.TimeScheduled = v
}

// GetTimeStarted returns the TimeStarted field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CertificateOrderTask) GetTimeStarted() time.Time {
	if o == nil || o.TimeStarted.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.TimeStarted.Get()
}

// GetTimeStartedOk returns a tuple with the TimeStarted field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CertificateOrderTask) GetTimeStartedOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return o.TimeStarted.Get(), o.TimeStarted.IsSet()
}

// HasTimeStarted returns a boolean if a field has been set.
func (o *CertificateOrderTask) HasTimeStarted() bool {
	if o != nil && o.TimeStarted.IsSet() {
		return true
	}

	return false
}

// SetTimeStarted gets a reference to the given NullableTime and assigns it to the TimeStarted field.
func (o *CertificateOrderTask) SetTimeStarted(v time.Time) {
	o.TimeStarted.Set(&v)
}
// SetTimeStartedNil sets the value for TimeStarted to be an explicit nil
func (o *CertificateOrderTask) SetTimeStartedNil() {
	o.TimeStarted.Set(nil)
}

// UnsetTimeStarted ensures that no value is present for TimeStarted, not even an explicit nil
func (o *CertificateOrderTask) UnsetTimeStarted() {
	o.TimeStarted.Unset()
}

// GetTimeFinished returns the TimeFinished field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CertificateOrderTask) GetTimeFinished() time.Time {
	if o == nil || o.TimeFinished.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.TimeFinished.Get()
}

// GetTimeFinishedOk returns a tuple with the TimeFinished field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CertificateOrderTask) GetTimeFinishedOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return o.TimeFinished.Get(), o.TimeFinished.IsSet()
}

// HasTimeFinished returns a boolean if a field has been set.
func (o *CertificateOrderTask) HasTimeFinished() bool {
	if o != nil && o.TimeFinished.IsSet() {
		return true
	}

	return false
}

// SetTimeFinished gets a reference to the given NullableTime and assigns it to the TimeFinished field.
func (o *CertificateOrderTask) SetTimeFinished(v time.Time) {
	o.TimeFinished.Set(&v)
}
// SetTimeFinishedNil sets the value for TimeFinished to be an explicit nil
func (o *CertificateOrderTask) SetTimeFinishedNil() {
	o.TimeFinished.Set(nil)
}

// UnsetTimeFinished ensures that no value is present for TimeFinished, not even an explicit nil
func (o *CertificateOrderTask) UnsetTimeFinished() {
	o.TimeFinished.Unset()
}

// GetStatus returns the Status field value
func (o *CertificateOrderTask) GetStatus() JobStatus {
	if o == nil {
		var ret JobStatus
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *CertificateOrderTask) GetStatusOk() (*JobStatus, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *CertificateOrderTask) SetStatus(v JobStatus) {
	o.Status = v
}

// GetType returns the Type field value
func (o *CertificateOrderTask) GetType() JobType {
	if o == nil {
		var ret JobType
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *CertificateOrderTask) GetTypeOk() (*JobType, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *CertificateOrderTask) SetType(v JobType) {
	o.Type = v
}

// GetNumberOfExecutions returns the NumberOfExecutions field value
func (o *CertificateOrderTask) GetNumberOfExecutions() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.NumberOfExecutions
}

// GetNumberOfExecutionsOk returns a tuple with the NumberOfExecutions field value
// and a boolean to check if the value has been set.
func (o *CertificateOrderTask) GetNumberOfExecutionsOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.NumberOfExecutions, true
}

// SetNumberOfExecutions sets field value
func (o *CertificateOrderTask) SetNumberOfExecutions(v int32) {
	o.NumberOfExecutions = v
}

// GetResponse returns the Response field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CertificateOrderTask) GetResponse() string {
	if o == nil || o.Response.Get() == nil {
		var ret string
		return ret
	}
	return *o.Response.Get()
}

// GetResponseOk returns a tuple with the Response field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CertificateOrderTask) GetResponseOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Response.Get(), o.Response.IsSet()
}

// HasResponse returns a boolean if a field has been set.
func (o *CertificateOrderTask) HasResponse() bool {
	if o != nil && o.Response.IsSet() {
		return true
	}

	return false
}

// SetResponse gets a reference to the given NullableString and assigns it to the Response field.
func (o *CertificateOrderTask) SetResponse(v string) {
	o.Response.Set(&v)
}
// SetResponseNil sets the value for Response to be an explicit nil
func (o *CertificateOrderTask) SetResponseNil() {
	o.Response.Set(nil)
}

// UnsetResponse ensures that no value is present for Response, not even an explicit nil
func (o *CertificateOrderTask) UnsetResponse() {
	o.Response.Unset()
}

// GetError returns the Error field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CertificateOrderTask) GetError() string {
	if o == nil || o.Error.Get() == nil {
		var ret string
		return ret
	}
	return *o.Error.Get()
}

// GetErrorOk returns a tuple with the Error field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CertificateOrderTask) GetErrorOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Error.Get(), o.Error.IsSet()
}

// HasError returns a boolean if a field has been set.
func (o *CertificateOrderTask) HasError() bool {
	if o != nil && o.Error.IsSet() {
		return true
	}

	return false
}

// SetError gets a reference to the given NullableString and assigns it to the Error field.
func (o *CertificateOrderTask) SetError(v string) {
	o.Error.Set(&v)
}
// SetErrorNil sets the value for Error to be an explicit nil
func (o *CertificateOrderTask) SetErrorNil() {
	o.Error.Set(nil)
}

// UnsetError ensures that no value is present for Error, not even an explicit nil
func (o *CertificateOrderTask) UnsetError() {
	o.Error.Unset()
}

func (o CertificateOrderTask) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["uuid"] = o.Uuid
	}
	if o.CreatedOn != nil {
		toSerialize["createdOn"] = o.CreatedOn
	}
	if true {
		toSerialize["timeScheduled"] = o.TimeScheduled
	}
	if o.TimeStarted.IsSet() {
		toSerialize["timeStarted"] = o.TimeStarted.Get()
	}
	if o.TimeFinished.IsSet() {
		toSerialize["timeFinished"] = o.TimeFinished.Get()
	}
	if true {
		toSerialize["status"] = o.Status
	}
	if true {
		toSerialize["type"] = o.Type
	}
	if true {
		toSerialize["numberOfExecutions"] = o.NumberOfExecutions
	}
	if o.Response.IsSet() {
		toSerialize["response"] = o.Response.Get()
	}
	if o.Error.IsSet() {
		toSerialize["error"] = o.Error.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableCertificateOrderTask struct {
	value *CertificateOrderTask
	isSet bool
}

func (v NullableCertificateOrderTask) Get() *CertificateOrderTask {
	return v.value
}

func (v *NullableCertificateOrderTask) Set(val *CertificateOrderTask) {
	v.value = val
	v.isSet = true
}

func (v NullableCertificateOrderTask) IsSet() bool {
	return v.isSet
}

func (v *NullableCertificateOrderTask) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCertificateOrderTask(val *CertificateOrderTask) *NullableCertificateOrderTask {
	return &NullableCertificateOrderTask{value: val, isSet: true}
}

func (v NullableCertificateOrderTask) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCertificateOrderTask) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


