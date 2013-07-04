SUMMARY 	= "SaWMan - window and application manager framework for DirectFB"
DESCRIPTION 	= "SaWMan is a new window manager module for use with DirectFB.\
Its main difference to the default module is that it allows one process \
to be an application and window manager, implementing all kinds of \
diversity, while SaWMan is only the working horse."
HOMEPAGE 	= "http://www.directfb.org"
SECTION 	= "libs"
PR 		= "r0"
RV 		= "1.6-0"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=dcf3c825659e82539645da41a7908589"

DEPENDS = "directfb"

SRC_URI = "git://git.directfb.org/git/directfb/extras/SaWMan.git;tag=sawman-1.6.x"
SRCREV 	= "${AUTOREV}"
S 	= "${WORKDIR}/git"

inherit autotools binconfig pkgconfig

FILES_${PN}-dbg += "\
  ${libdir}/directfb-1.6-0/wm/.debug/*.so \
"

FILES_${PN}-dev += "\
  ${libdir}/*.la \
  ${libdir}/directfb-1.6-0/wm/*.la \
  ${includedir}/* \
  ${libdir}/pkgconfig/* \
"

FILES_${PN} += "\
  ${bindir}/* \
  ${libdir}/*.so.0.0.0 \
  ${libdir}/directfb-1.6-0/wm/*.so \
"	
