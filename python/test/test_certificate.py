"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md  # noqa: E501

    The version of the OpenAPI document: 2.2.4
    Contact: ssc@swisssign.com
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import swisssign_ra_api.v2
from swisssign_ra_api.v2.model.revocation_status import RevocationStatus
globals()['RevocationStatus'] = RevocationStatus
from swisssign_ra_api.v2.model.certificate import Certificate


class TestCertificate(unittest.TestCase):
    """Certificate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCertificate(self):
        """Test Certificate"""
        # FIXME: construct object with mandatory attributes with example values
        # model = Certificate()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
