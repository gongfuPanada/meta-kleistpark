SUMMARY = "DFBTerm - A simple terminal emulator for DirectFB"
DESCRIPTION = ""
HOMEPAGE = "http://directfb.org"
SECTION = "programs"
PR = "r0"
RV = "1.6-0"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=0302e6016e4f4be331b6d4d25353393f"

DEPENDS = "lite"

SRC_URI = "git://git.directfb.org/git/directfb/programs/DFBTerm.git"
SRCREV 	= "${AUTOREV}"
S 	= "${WORKDIR}/git"

inherit autotools

FILES_${PN} += "\
  ${bindir}/* \
  ${sbindir}/* \
"
