SUMMARY 	= "Application framework for DirectFB"
DESCRIPTION 	= "ilixi is a lightweight UI toolkit written in C++."
HOMEPAGE 	= "http://www.ilixi.org"
SECTION 	= "libs"
PR 		= "r0"
RV 		= "1.0.0"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

DEPENDS = "directfb libxml2 libsigc++ fontconfig"
RRECOMMENDS_${PN} = "fusiondale fusionsound sawman"
PREFERRED_PROVIDER_fusiondale	= "directfb"
PREFERRED_PROVIDER_fusionsound	= "directfb"
PREFERRED_PROVIDER_sawman	= "directfb"

SRC_URI = "git://git.directfb.org/git/directfb/libs/ilixi"
SRCREV 	= "${AUTOREV}"
S 	= "${WORKDIR}/git"

inherit autotools pkgconfig

EXTRA_OECONF = "--enable-fusiondale \
		--enable-fusionsound \
		--enable-sawman \
		--with-examples \
"

FILES_${PN}-dev += "\
  ${libdir}/* \
  ${includedir}/* \
  ${libdir}/pkgconfig/* \
"

FILES_${PN} += "\
  ${bindir}/* \
  ${libdir}/ilixi-${RV}/*.so* \
  ${datadir}/ilixi-${RV}/* \
"
