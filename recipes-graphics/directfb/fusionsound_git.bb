SUMMARY 	= "FusionSound"
DESCRIPTION 	= "FusionSound provides sound and music support for DirectFB."
HOMEPAGE 	= "http://www.directfb.org"
SECTION 	= "libs"
PR 		= "r0"
RV 		= "1.6-0"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=dcf3c825659e82539645da41a7908589"

DEPENDS = "directfb"

SRC_URI = "git://git.directfb.org/git/directfb/core/FusionSound.git"
SRCREV 	= "${AUTOREV}"
S 	= "${WORKDIR}/git"

EXTRA_OECONF = "--without-lite \
		--disable-debug \
		--disable-trace \
		--without-ffmpeg \
		--without-vorbis \
		--with-drivers=dummy \
"

inherit autotools binconfig pkgconfig

