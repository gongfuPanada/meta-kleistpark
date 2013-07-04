SUMMARY 	= "FusionDale"
DESCRIPTION 	= "FusionDale is an application library using Fusion to provide higher level IPC mechanisms."
HOMEPAGE 	= "http://www.directfb.org"
SECTION 	= "libs"
PR 		= "r0"
RV 		= "1.6-0"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=dcf3c825659e82539645da41a7908589"

DEPENDS = "directfb"

SRC_URI = "git://git.directfb.org/git/directfb/libs/FusionDale.git"
SRCREV 	= "${AUTOREV}"
S 	= "${WORKDIR}/git"

EXTRA_OECONF = "--enable-one"

inherit autotools binconfig pkgconfig

