SUMMARY 	= "DirectFB virtual input extension (DiVine)"
DESCRIPTION 	= "DiVine provides a DirectFB input driver that reads input\
events from a pipe and dispatches them via a virtual input \
device. It also installs the tool 'spooky' that allows to \
send input events to DirectFB applications."
HOMEPAGE 	= "http://www.directfb.org"
SECTION 	= "libs"
PR 		= "r0"
RV 		= "1.6-0"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=dcf3c825659e82539645da41a7908589"

DEPENDS = "directfb"

SRC_URI = "git://git.directfb.org/git/directfb/extras/DiVine.git"
SRCREV 	= "${AUTOREV}"
S 	= "${WORKDIR}/git"

inherit autotools binconfig pkgconfig

