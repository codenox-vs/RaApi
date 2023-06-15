/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.2.4
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
)

// RequestOverrides struct for RequestOverrides
type RequestOverrides struct {
	// Override the CSR Subject Distinguished Name with user provided value Supported attributes are (lower or uppercase):   - c (Country)   - dc (Domain Controller)   - l (Locality)   - state (State)   - joil (Jurisdiction of Incorporation, Locality)   - joist (Jurisdiction of Incorporation, State)   - joic (Jurisdiction of Incorporation, Country)   - street (Street Address)   - o (Organization)   - organizationIdentifier (Organization Identifier)   - ou (Organizational Unit)   - uid (UID)   - uniqueIdentifier (Unique Identifier)   - serialnumber (Serial number)   - email (Email)   - title (Title)   - cn (Common Name)   - sn (Surname)   - gn (Given name)   - name (Name)   - initials (Initials)   - pseudonym (Pseudonym)   - postalAddress (Postal Address)   - postalCode (Postal Code)   - generationQualifier (Generation Qualifier) 
	SubjectDN NullableString `json:"subjectDN,omitempty"`
	// Optional certificate validity set if enabled on the Product 
	Validity NullableInt32 `json:"validity,omitempty"`
	RequestExtensions *RequestExtensions `json:"requestExtensions,omitempty"`
}

// NewRequestOverrides instantiates a new RequestOverrides object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRequestOverrides() *RequestOverrides {
	this := RequestOverrides{}
	return &this
}

// NewRequestOverridesWithDefaults instantiates a new RequestOverrides object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRequestOverridesWithDefaults() *RequestOverrides {
	this := RequestOverrides{}
	return &this
}

// GetSubjectDN returns the SubjectDN field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *RequestOverrides) GetSubjectDN() string {
	if o == nil || o.SubjectDN.Get() == nil {
		var ret string
		return ret
	}
	return *o.SubjectDN.Get()
}

// GetSubjectDNOk returns a tuple with the SubjectDN field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *RequestOverrides) GetSubjectDNOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.SubjectDN.Get(), o.SubjectDN.IsSet()
}

// HasSubjectDN returns a boolean if a field has been set.
func (o *RequestOverrides) HasSubjectDN() bool {
	if o != nil && o.SubjectDN.IsSet() {
		return true
	}

	return false
}

// SetSubjectDN gets a reference to the given NullableString and assigns it to the SubjectDN field.
func (o *RequestOverrides) SetSubjectDN(v string) {
	o.SubjectDN.Set(&v)
}
// SetSubjectDNNil sets the value for SubjectDN to be an explicit nil
func (o *RequestOverrides) SetSubjectDNNil() {
	o.SubjectDN.Set(nil)
}

// UnsetSubjectDN ensures that no value is present for SubjectDN, not even an explicit nil
func (o *RequestOverrides) UnsetSubjectDN() {
	o.SubjectDN.Unset()
}

// GetValidity returns the Validity field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *RequestOverrides) GetValidity() int32 {
	if o == nil || o.Validity.Get() == nil {
		var ret int32
		return ret
	}
	return *o.Validity.Get()
}

// GetValidityOk returns a tuple with the Validity field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *RequestOverrides) GetValidityOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.Validity.Get(), o.Validity.IsSet()
}

// HasValidity returns a boolean if a field has been set.
func (o *RequestOverrides) HasValidity() bool {
	if o != nil && o.Validity.IsSet() {
		return true
	}

	return false
}

// SetValidity gets a reference to the given NullableInt32 and assigns it to the Validity field.
func (o *RequestOverrides) SetValidity(v int32) {
	o.Validity.Set(&v)
}
// SetValidityNil sets the value for Validity to be an explicit nil
func (o *RequestOverrides) SetValidityNil() {
	o.Validity.Set(nil)
}

// UnsetValidity ensures that no value is present for Validity, not even an explicit nil
func (o *RequestOverrides) UnsetValidity() {
	o.Validity.Unset()
}

// GetRequestExtensions returns the RequestExtensions field value if set, zero value otherwise.
func (o *RequestOverrides) GetRequestExtensions() RequestExtensions {
	if o == nil || o.RequestExtensions == nil {
		var ret RequestExtensions
		return ret
	}
	return *o.RequestExtensions
}

// GetRequestExtensionsOk returns a tuple with the RequestExtensions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RequestOverrides) GetRequestExtensionsOk() (*RequestExtensions, bool) {
	if o == nil || o.RequestExtensions == nil {
		return nil, false
	}
	return o.RequestExtensions, true
}

// HasRequestExtensions returns a boolean if a field has been set.
func (o *RequestOverrides) HasRequestExtensions() bool {
	if o != nil && o.RequestExtensions != nil {
		return true
	}

	return false
}

// SetRequestExtensions gets a reference to the given RequestExtensions and assigns it to the RequestExtensions field.
func (o *RequestOverrides) SetRequestExtensions(v RequestExtensions) {
	o.RequestExtensions = &v
}

func (o RequestOverrides) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.SubjectDN.IsSet() {
		toSerialize["subjectDN"] = o.SubjectDN.Get()
	}
	if o.Validity.IsSet() {
		toSerialize["validity"] = o.Validity.Get()
	}
	if o.RequestExtensions != nil {
		toSerialize["requestExtensions"] = o.RequestExtensions
	}
	return json.Marshal(toSerialize)
}

type NullableRequestOverrides struct {
	value *RequestOverrides
	isSet bool
}

func (v NullableRequestOverrides) Get() *RequestOverrides {
	return v.value
}

func (v *NullableRequestOverrides) Set(val *RequestOverrides) {
	v.value = val
	v.isSet = true
}

func (v NullableRequestOverrides) IsSet() bool {
	return v.isSet
}

func (v *NullableRequestOverrides) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRequestOverrides(val *RequestOverrides) *NullableRequestOverrides {
	return &NullableRequestOverrides{value: val, isSet: true}
}

func (v NullableRequestOverrides) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRequestOverrides) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


