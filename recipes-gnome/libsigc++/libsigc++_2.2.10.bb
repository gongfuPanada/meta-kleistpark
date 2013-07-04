SUMMARY="typesafe callback system for standard C++"
DESCRIPTION = "It allows you to define signals and to connect those signals to any \
callback function, either global or a member function, regardless of \
whether it is static or virtual."
SECTION = "libs"

LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=d8045f3b8f929c1cb29a1e3fd737b499"

DEPENDS = "mm-common"

SRC_URI = "ftp://ftp.gnome.org/pub/GNOME/sources/libsigc++/2.2/libsigc++-${PV}.tar.bz2;name=archive \
           file://001-no_doc_tests_examples.patch \
	"

SRC_URI[archive.md5sum] = "6d350ae0bc17b8915a06ce6b7e4240e8"
SRC_URI[archive.sha256sum] = "d3d810c2ad469edfb2d4db29643bef189b7613019eadbd4a72823af3c73c959c"

S = "${WORKDIR}/libsigc++-${PV}"

inherit autotools

FILES_${PN}-dev += "${libdir}/sigc++-*/"
FILES_${PN}-doc += "${datadir}/devhelp"

BBCLASSEXTEND = "native"
