/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.0.223
 * Contact: ssc@swisssign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.APIError;
import org.openapitools.client.model.CertificateOrder;
import org.openapitools.client.model.CertificateOrderStatus;
import org.openapitools.client.model.CertificateOrderTask;
import org.openapitools.client.model.Client;
import org.openapitools.client.model.ClientDNS;
import org.openapitools.client.model.RevocationRequest;
import org.openapitools.client.model.SearchCertificateOrder;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiRegistrationApi
 */
@Disabled
public class ApiRegistrationApiTest {

    private final ApiRegistrationApi api = new ApiRegistrationApi();

    /**
     * Register new prevalidated domains for the selected client given its reference Id
     *
     * Create and issue domains pre validation tokens for the selected client 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createClientPrevalidatedDomainsTest() throws ApiException {
        String clientReference = null;
        List<String> requestBody = null;
        List<ClientDNS> response = api.createClientPrevalidatedDomains(clientReference, requestBody);
        // TODO: test validations
    }

    /**
     * Delete prevalidated domain for the selected reference Id
     *
     * Delete pre validated domain 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteClientPrevalidatedDomainTest() throws ApiException {
        String prevalidatedDomainReference = null;
        api.deleteClientPrevalidatedDomain(prevalidatedDomainReference);
        // TODO: test validations
    }

    /**
     * Delete prevalidated domain token for the selected reference Id
     *
     * Delete pre validated domain token 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteClientPrevalidatedDomainTokenTest() throws ApiException {
        String prevalidatedDomainReference = null;
        ClientDNS response = api.deleteClientPrevalidatedDomainToken(prevalidatedDomainReference);
        // TODO: test validations
    }

    /**
     * Retrieve the certificate chain for the given Order reference
     *
     * Retrieve the certificate chain base64 encoded text. First element in list is leaf certificate, last element is Root certificate. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCertificateChainTest() throws ApiException {
        String orderReference = null;
        List<String> response = api.getCertificateChain(orderReference);
        // TODO: test validations
    }

    /**
     * Retrieve a Certificate Order given the Order reference
     *
     * Retrieve a certificate order given the order reference identifier. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCertificateOrderTest() throws ApiException {
        String orderReference = null;
        CertificateOrder response = api.getCertificateOrder(orderReference);
        // TODO: test validations
    }

    /**
     * Retrieve a Certificate Order status given the Order reference
     *
     * Retrieve a certificate order status given the order reference identifier. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCertificateOrderStatusTest() throws ApiException {
        String orderReference = null;
        CertificateOrderStatus response = api.getCertificateOrderStatus(orderReference);
        // TODO: test validations
    }

    /**
     * Retrieve a Certificate Order Tasks given the Order reference
     *
     * Retrieve a certificate order tasks given the order reference identifier. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCertificateOrderTasksTest() throws ApiException {
        String orderReference = null;
        List<CertificateOrderTask> response = api.getCertificateOrderTasks(orderReference);
        // TODO: test validations
    }

    /**
     * Search Certificate Orders
     *
     * Search for Certificate Orders given search parameters 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCertificateOrdersTest() throws ApiException {
        SearchCertificateOrder searchCertificateOrder = null;
        List<CertificateOrder> response = api.getCertificateOrders(searchCertificateOrder);
        // TODO: test validations
    }

    /**
     * Get a client given its reference Id
     *
     * Get a client given its reference UUID 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getClientTest() throws ApiException {
        String clientReference = null;
        Client response = api.getClient(clientReference);
        // TODO: test validations
    }

    /**
     * Get prevalidated domains for the selected domain reference Id
     *
     * Get pre validatied domain token for the selected identifier 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getClientPrevalidatedDomainTest() throws ApiException {
        String prevalidatedDomainReference = null;
        ClientDNS response = api.getClientPrevalidatedDomain(prevalidatedDomainReference);
        // TODO: test validations
    }

    /**
     * Get the list of prevalidated domains for the selected client given its reference Id
     *
     * Retrieve the list of pre validated domains and their status for the selected client 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getClientPrevalidatedDomainsTest() throws ApiException {
        String clientReference = null;
        List<ClientDNS> response = api.getClientPrevalidatedDomains(clientReference);
        // TODO: test validations
    }

    /**
     * Issue certificate using CSR
     *
     * Issue a certificate based on the Product reference (CSR) 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void issueCertificateTest() throws ApiException {
        String productReference = null;
        String body = null;
        CertificateOrder response = api.issueCertificate(productReference, body);
        // TODO: test validations
    }

    /**
     * Produce a user JWT
     *
     * Helper service to generate a JWT derived from you login username and API Key --- * Use the generated JWT in the header of __each__ HTTP request to the service  &#x60;Authorization: Bearer &lt;encoded JWT&gt;&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void jwtTest() throws ApiException {
        String userName = null;
        String userSecret = null;
        String response = api.jwt(userName, userSecret);
        // TODO: test validations
    }

    /**
     * Reset prevalidated domain token for the selected reference Id
     *
     * Reset pre validated domain token 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetClientPrevalidatedDomainTest() throws ApiException {
        String prevalidatedDomainReference = null;
        ClientDNS response = api.resetClientPrevalidatedDomain(prevalidatedDomainReference);
        // TODO: test validations
    }

    /**
     * Revoke certificates
     *
     * Revoke one or more certificates 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeCertificatesTest() throws ApiException {
        List<RevocationRequest> revocationRequest = null;
        api.revokeCertificates(revocationRequest);
        // TODO: test validations
    }

    /**
     * Search Clients available to the RA Operator
     *
     * Search for clients for which the RA Operator can issue, revoke or pre validate DNS entries. The Client information includes the list of assigned certificate products. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchClientsTest() throws ApiException {
        String search = null;
        List<Client> response = api.searchClients(search);
        // TODO: test validations
    }

    /**
     * Prevalidate domain for the selected domain reference Id
     *
     * Pre validate domain token for the selected identifier 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateClientPrevalidatedDomainTest() throws ApiException {
        String prevalidatedDomainReference = null;
        ClientDNS response = api.validateClientPrevalidatedDomain(prevalidatedDomainReference);
        // TODO: test validations
    }

}
