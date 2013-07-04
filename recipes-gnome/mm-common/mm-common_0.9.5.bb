SUMMARY = "Common macros for building GNOME libraries"
DESCRIPTION = "The mm-common module provides the build infrastructure and utilities \
shared among the GNOME C++ binding libraries."
SECTION = "gnome"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = ""

SRC_URI = "http://ftp.gnome.org/pub/GNOME/sources/mm-common/0.9/mm-common-0.9.5.tar.gz;name=archive"

SRC_URI[archive.md5sum] = "ba006b7ed4728be98a195b2c6e3b58dd"
SRC_URI[archive.sha256sum] = "4fb2b9827ba7570a67656552f87284b8d29969e813149963c5ce947088c2b990"

S = "${WORKDIR}/mm-common-${PV}"

inherit autotools

FILES_${PN} += "${datadir}/aclocal"
FILES_${PN}-dev = ""

BBCLASSEXTEND = "native"
