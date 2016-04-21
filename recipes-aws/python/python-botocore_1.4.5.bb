DESCRIPTION = "Low-level, data-driven core of boto 3."
HOMEPAGE = "https://github.com/boto/botocore"
AUTHOR = "Amazon Web Services"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c2ca72265eb92b3fca5dfb60428bd071"

inherit setuptools

PR = "r1"

RDEPENDS_${PN} = "\
	${PYTHON_PN}-docutils \
	${PYTHON_PN}-dateutil \
	${PYTHON_PN}-jmespath \
	${PYTHON_PN}-six \
	${PYTHON_PN}-shell \
	${PYTHON_PN}-netserver \
	${PYTHON_PN}-email \
	${PYTHON_PN}-json \
	${PYTHON_PN}-numbers \
	${PYTHON_PN}-html\
"

SRC_NAME = "botocore"

SRC_URI = "https://pypi.python.org/packages/source/b/${SRC_NAME}/${SRC_NAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "8ada0254ab3f080a0a7f5035c958403c"
SRC_URI[sha256sum] = "d83d6623d9eba2d2e2474c35b6180809d3f4c36321006a49a8d1dd6f652a93c3"

S = "${WORKDIR}/${SRC_NAME}-${PV}"