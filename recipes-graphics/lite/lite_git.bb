SUMMARY 	= "LiTE - Toolkit engine for DirectFB"
DESCRIPTION	= "LiTE stands for Lightweight Toolkit Enabler. Its role is to \
facilitate the functions of DirectFB so that a toolbox could be written on \
top of DirectFB with less effort."
HOMEPAGE 	= "http://www.directfb.org"
SECTION 	= "libs"
PR 		= "r0"
RV 		= "0.9.1"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=dcf3c825659e82539645da41a7908589"

DEPENDS = "directfb"

SRC_URI = "git://git.directfb.org/git/directfb/libs/LiTE.git"
SRCREV 	= "${AUTOREV}"
S 	= "${WORKDIR}/git"

inherit autotools binconfig pkgconfig

FILES_${PN}-dev += "\
  ${libdir}/* \
  ${includedir}/* \
  ${libdir}/pkgconfig/* \
"

FILES_${PN} += "\
  ${bindir}/* \
  ${libdir}/LiTE/*.so* \
  ${datadir}/LiTE/* \
  ${datadir}/fonts/truetype/* \
"	
