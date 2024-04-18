/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.5.6
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
)

// RequestDNS struct for RequestDNS
type RequestDNS struct {
	Values []DNS `json:"values,omitempty"`
}

// NewRequestDNS instantiates a new RequestDNS object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRequestDNS() *RequestDNS {
	this := RequestDNS{}
	return &this
}

// NewRequestDNSWithDefaults instantiates a new RequestDNS object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRequestDNSWithDefaults() *RequestDNS {
	this := RequestDNS{}
	return &this
}

// GetValues returns the Values field value if set, zero value otherwise.
func (o *RequestDNS) GetValues() []DNS {
	if o == nil || o.Values == nil {
		var ret []DNS
		return ret
	}
	return o.Values
}

// GetValuesOk returns a tuple with the Values field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RequestDNS) GetValuesOk() ([]DNS, bool) {
	if o == nil || o.Values == nil {
		return nil, false
	}
	return o.Values, true
}

// HasValues returns a boolean if a field has been set.
func (o *RequestDNS) HasValues() bool {
	if o != nil && o.Values != nil {
		return true
	}

	return false
}

// SetValues gets a reference to the given []DNS and assigns it to the Values field.
func (o *RequestDNS) SetValues(v []DNS) {
	o.Values = v
}

func (o RequestDNS) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Values != nil {
		toSerialize["values"] = o.Values
	}
	return json.Marshal(toSerialize)
}

type NullableRequestDNS struct {
	value *RequestDNS
	isSet bool
}

func (v NullableRequestDNS) Get() *RequestDNS {
	return v.value
}

func (v *NullableRequestDNS) Set(val *RequestDNS) {
	v.value = val
	v.isSet = true
}

func (v NullableRequestDNS) IsSet() bool {
	return v.isSet
}

func (v *NullableRequestDNS) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRequestDNS(val *RequestDNS) *NullableRequestDNS {
	return &NullableRequestDNS{value: val, isSet: true}
}

func (v NullableRequestDNS) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRequestDNS) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


