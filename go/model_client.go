/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.0.209
Contact: opensource@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
)

// Client struct for Client
type Client struct {
	// Client UUID reference
	Uuid string `json:"uuid"`
	// Client name
	Name string `json:"name"`
	// Client description
	Description NullableString `json:"description,omitempty"`
	// List of available certificate products
	Products []Product `json:"products,omitempty"`
}

// NewClient instantiates a new Client object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewClient(uuid string, name string) *Client {
	this := Client{}
	this.Uuid = uuid
	this.Name = name
	return &this
}

// NewClientWithDefaults instantiates a new Client object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewClientWithDefaults() *Client {
	this := Client{}
	return &this
}

// GetUuid returns the Uuid field value
func (o *Client) GetUuid() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Uuid
}

// GetUuidOk returns a tuple with the Uuid field value
// and a boolean to check if the value has been set.
func (o *Client) GetUuidOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Uuid, true
}

// SetUuid sets field value
func (o *Client) SetUuid(v string) {
	o.Uuid = v
}

// GetName returns the Name field value
func (o *Client) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *Client) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *Client) SetName(v string) {
	o.Name = v
}

// GetDescription returns the Description field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Client) GetDescription() string {
	if o == nil || o.Description.Get() == nil {
		var ret string
		return ret
	}
	return *o.Description.Get()
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Client) GetDescriptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Description.Get(), o.Description.IsSet()
}

// HasDescription returns a boolean if a field has been set.
func (o *Client) HasDescription() bool {
	if o != nil && o.Description.IsSet() {
		return true
	}

	return false
}

// SetDescription gets a reference to the given NullableString and assigns it to the Description field.
func (o *Client) SetDescription(v string) {
	o.Description.Set(&v)
}
// SetDescriptionNil sets the value for Description to be an explicit nil
func (o *Client) SetDescriptionNil() {
	o.Description.Set(nil)
}

// UnsetDescription ensures that no value is present for Description, not even an explicit nil
func (o *Client) UnsetDescription() {
	o.Description.Unset()
}

// GetProducts returns the Products field value if set, zero value otherwise.
func (o *Client) GetProducts() []Product {
	if o == nil || o.Products == nil {
		var ret []Product
		return ret
	}
	return o.Products
}

// GetProductsOk returns a tuple with the Products field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Client) GetProductsOk() ([]Product, bool) {
	if o == nil || o.Products == nil {
		return nil, false
	}
	return o.Products, true
}

// HasProducts returns a boolean if a field has been set.
func (o *Client) HasProducts() bool {
	if o != nil && o.Products != nil {
		return true
	}

	return false
}

// SetProducts gets a reference to the given []Product and assigns it to the Products field.
func (o *Client) SetProducts(v []Product) {
	o.Products = v
}

func (o Client) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["uuid"] = o.Uuid
	}
	if true {
		toSerialize["name"] = o.Name
	}
	if o.Description.IsSet() {
		toSerialize["description"] = o.Description.Get()
	}
	if o.Products != nil {
		toSerialize["products"] = o.Products
	}
	return json.Marshal(toSerialize)
}

type NullableClient struct {
	value *Client
	isSet bool
}

func (v NullableClient) Get() *Client {
	return v.value
}

func (v *NullableClient) Set(val *Client) {
	v.value = val
	v.isSet = true
}

func (v NullableClient) IsSet() bool {
	return v.isSet
}

func (v *NullableClient) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableClient(val *Client) *NullableClient {
	return &NullableClient{value: val, isSet: true}
}

func (v NullableClient) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableClient) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


