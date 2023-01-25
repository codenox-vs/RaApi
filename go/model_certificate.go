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

// Certificate struct for Certificate
type Certificate struct {
	// Certificate Subject Distinguished Name
	Subject string `json:"subject"`
	// Certificate Issuer Distinguished Name
	Issuer string `json:"issuer"`
	// Certificate serial number (Big Integer HEX encoded)
	Serial string `json:"serial"`
	// Certificate start validity in UTC
	StartValidity time.Time `json:"startValidity"`
	// Certificate start validity in UTC
	EndValidity time.Time `json:"endValidity"`
	// base64 encoded DER certificate
	Certificate string `json:"certificate"`
	RevocationStatus *RevocationStatus `json:"revocationStatus,omitempty"`
}

// NewCertificate instantiates a new Certificate object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCertificate(subject string, issuer string, serial string, startValidity time.Time, endValidity time.Time, certificate string) *Certificate {
	this := Certificate{}
	this.Subject = subject
	this.Issuer = issuer
	this.Serial = serial
	this.StartValidity = startValidity
	this.EndValidity = endValidity
	this.Certificate = certificate
	return &this
}

// NewCertificateWithDefaults instantiates a new Certificate object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCertificateWithDefaults() *Certificate {
	this := Certificate{}
	return &this
}

// GetSubject returns the Subject field value
func (o *Certificate) GetSubject() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Subject
}

// GetSubjectOk returns a tuple with the Subject field value
// and a boolean to check if the value has been set.
func (o *Certificate) GetSubjectOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Subject, true
}

// SetSubject sets field value
func (o *Certificate) SetSubject(v string) {
	o.Subject = v
}

// GetIssuer returns the Issuer field value
func (o *Certificate) GetIssuer() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Issuer
}

// GetIssuerOk returns a tuple with the Issuer field value
// and a boolean to check if the value has been set.
func (o *Certificate) GetIssuerOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Issuer, true
}

// SetIssuer sets field value
func (o *Certificate) SetIssuer(v string) {
	o.Issuer = v
}

// GetSerial returns the Serial field value
func (o *Certificate) GetSerial() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Serial
}

// GetSerialOk returns a tuple with the Serial field value
// and a boolean to check if the value has been set.
func (o *Certificate) GetSerialOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Serial, true
}

// SetSerial sets field value
func (o *Certificate) SetSerial(v string) {
	o.Serial = v
}

// GetStartValidity returns the StartValidity field value
func (o *Certificate) GetStartValidity() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.StartValidity
}

// GetStartValidityOk returns a tuple with the StartValidity field value
// and a boolean to check if the value has been set.
func (o *Certificate) GetStartValidityOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.StartValidity, true
}

// SetStartValidity sets field value
func (o *Certificate) SetStartValidity(v time.Time) {
	o.StartValidity = v
}

// GetEndValidity returns the EndValidity field value
func (o *Certificate) GetEndValidity() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.EndValidity
}

// GetEndValidityOk returns a tuple with the EndValidity field value
// and a boolean to check if the value has been set.
func (o *Certificate) GetEndValidityOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.EndValidity, true
}

// SetEndValidity sets field value
func (o *Certificate) SetEndValidity(v time.Time) {
	o.EndValidity = v
}

// GetCertificate returns the Certificate field value
func (o *Certificate) GetCertificate() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Certificate
}

// GetCertificateOk returns a tuple with the Certificate field value
// and a boolean to check if the value has been set.
func (o *Certificate) GetCertificateOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Certificate, true
}

// SetCertificate sets field value
func (o *Certificate) SetCertificate(v string) {
	o.Certificate = v
}

// GetRevocationStatus returns the RevocationStatus field value if set, zero value otherwise.
func (o *Certificate) GetRevocationStatus() RevocationStatus {
	if o == nil || o.RevocationStatus == nil {
		var ret RevocationStatus
		return ret
	}
	return *o.RevocationStatus
}

// GetRevocationStatusOk returns a tuple with the RevocationStatus field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Certificate) GetRevocationStatusOk() (*RevocationStatus, bool) {
	if o == nil || o.RevocationStatus == nil {
		return nil, false
	}
	return o.RevocationStatus, true
}

// HasRevocationStatus returns a boolean if a field has been set.
func (o *Certificate) HasRevocationStatus() bool {
	if o != nil && o.RevocationStatus != nil {
		return true
	}

	return false
}

// SetRevocationStatus gets a reference to the given RevocationStatus and assigns it to the RevocationStatus field.
func (o *Certificate) SetRevocationStatus(v RevocationStatus) {
	o.RevocationStatus = &v
}

func (o Certificate) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["subject"] = o.Subject
	}
	if true {
		toSerialize["issuer"] = o.Issuer
	}
	if true {
		toSerialize["serial"] = o.Serial
	}
	if true {
		toSerialize["startValidity"] = o.StartValidity
	}
	if true {
		toSerialize["endValidity"] = o.EndValidity
	}
	if true {
		toSerialize["certificate"] = o.Certificate
	}
	if o.RevocationStatus != nil {
		toSerialize["revocationStatus"] = o.RevocationStatus
	}
	return json.Marshal(toSerialize)
}

type NullableCertificate struct {
	value *Certificate
	isSet bool
}

func (v NullableCertificate) Get() *Certificate {
	return v.value
}

func (v *NullableCertificate) Set(val *Certificate) {
	v.value = val
	v.isSet = true
}

func (v NullableCertificate) IsSet() bool {
	return v.isSet
}

func (v *NullableCertificate) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCertificate(val *Certificate) *NullableCertificate {
	return &NullableCertificate{value: val, isSet: true}
}

func (v NullableCertificate) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCertificate) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


