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
	"time"
)

// RevocationStatus struct for RevocationStatus
type RevocationStatus struct {
	// Revocation date in UTC
	RevokedOn time.Time `json:"revokedOn"`
	Reason RevocationReason `json:"reason"`
	// email of the person who revoked the certificate
	RevokedBy string `json:"revokedBy"`
}

// NewRevocationStatus instantiates a new RevocationStatus object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRevocationStatus(revokedOn time.Time, reason RevocationReason, revokedBy string) *RevocationStatus {
	this := RevocationStatus{}
	this.RevokedOn = revokedOn
	this.Reason = reason
	this.RevokedBy = revokedBy
	return &this
}

// NewRevocationStatusWithDefaults instantiates a new RevocationStatus object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRevocationStatusWithDefaults() *RevocationStatus {
	this := RevocationStatus{}
	return &this
}

// GetRevokedOn returns the RevokedOn field value
func (o *RevocationStatus) GetRevokedOn() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.RevokedOn
}

// GetRevokedOnOk returns a tuple with the RevokedOn field value
// and a boolean to check if the value has been set.
func (o *RevocationStatus) GetRevokedOnOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RevokedOn, true
}

// SetRevokedOn sets field value
func (o *RevocationStatus) SetRevokedOn(v time.Time) {
	o.RevokedOn = v
}

// GetReason returns the Reason field value
func (o *RevocationStatus) GetReason() RevocationReason {
	if o == nil {
		var ret RevocationReason
		return ret
	}

	return o.Reason
}

// GetReasonOk returns a tuple with the Reason field value
// and a boolean to check if the value has been set.
func (o *RevocationStatus) GetReasonOk() (*RevocationReason, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Reason, true
}

// SetReason sets field value
func (o *RevocationStatus) SetReason(v RevocationReason) {
	o.Reason = v
}

// GetRevokedBy returns the RevokedBy field value
func (o *RevocationStatus) GetRevokedBy() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RevokedBy
}

// GetRevokedByOk returns a tuple with the RevokedBy field value
// and a boolean to check if the value has been set.
func (o *RevocationStatus) GetRevokedByOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RevokedBy, true
}

// SetRevokedBy sets field value
func (o *RevocationStatus) SetRevokedBy(v string) {
	o.RevokedBy = v
}

func (o RevocationStatus) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["revokedOn"] = o.RevokedOn
	}
	if true {
		toSerialize["reason"] = o.Reason
	}
	if true {
		toSerialize["revokedBy"] = o.RevokedBy
	}
	return json.Marshal(toSerialize)
}

type NullableRevocationStatus struct {
	value *RevocationStatus
	isSet bool
}

func (v NullableRevocationStatus) Get() *RevocationStatus {
	return v.value
}

func (v *NullableRevocationStatus) Set(val *RevocationStatus) {
	v.value = val
	v.isSet = true
}

func (v NullableRevocationStatus) IsSet() bool {
	return v.isSet
}

func (v *NullableRevocationStatus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRevocationStatus(val *RevocationStatus) *NullableRevocationStatus {
	return &NullableRevocationStatus{value: val, isSet: true}
}

func (v NullableRevocationStatus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRevocationStatus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


