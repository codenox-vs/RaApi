"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md  # noqa: E501

    The version of the OpenAPI document: 2.2.8
    Contact: ssc@swisssign.com
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import swisssign_ra_api.v2
from swisssign_ra_api.v2.model.additional_recipient import AdditionalRecipient
from swisssign_ra_api.v2.model.registration_document import RegistrationDocument
from swisssign_ra_api.v2.model.request_overrides import RequestOverrides
globals()['AdditionalRecipient'] = AdditionalRecipient
globals()['RegistrationDocument'] = RegistrationDocument
globals()['RequestOverrides'] = RequestOverrides
from swisssign_ra_api.v2.model.issue_request import IssueRequest


class TestIssueRequest(unittest.TestCase):
    """IssueRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testIssueRequest(self):
        """Test IssueRequest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = IssueRequest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
