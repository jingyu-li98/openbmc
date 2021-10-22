SUMMARY = "Secure-boot utilities for ASPEED BMC SoCs"
HOMEPAGE = "https://github.com/AspeedTech-BMC/socsec/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d50b901333b4eedfee074ebcd6a6d611"

SRC_URI = "git://github.com/AspeedTech-BMC/socsec.git/;protocol=https;branch=master"

PV = "v01.00.00+git${SRCPV}"
# Tag for v01.00.00
SRCREV = "2787a252988f4811097995ef9e807b1b433bde9f"

S = "${WORKDIR}/git"

inherit python3native setuptools3

RDEPENDS:${PN} += "python3-bitarray"
RDEPENDS:${PN} += "python3-core"
RDEPENDS:${PN} += "python3-hexdump"
RDEPENDS:${PN} += "python3-jsonschema"
RDEPENDS:${PN} += "python3-jstyleson"
RDEPENDS:${PN} += "python3-pycryptodome"
RDEPENDS:${PN} += "python3-ecdsa"

BBCLASSEXTEND = "native nativesdk"
