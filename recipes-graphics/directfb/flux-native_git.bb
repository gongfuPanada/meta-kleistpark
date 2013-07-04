SUMMARY 	= "flux is an interface description language used by DirectFB."
DESCRIPTION 	= "You need this package when compiling DirectFB from git."
HOMEPAGE 	= "http://www.directfb.org"
SECTION 	= "libs"
PR 		= "r0"
RV 		= "1.6-0"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/fluxcomp.cpp;beginline=1;endline=33;md5=180a17aaed9b823e65fafd5a8f84dc8d"

SRC_URI = "git://git.directfb.org/git/directfb/core/flux.git"
SRCREV 	= "${AUTOREV}"
S 	= "${WORKDIR}/git"

inherit native autotools binconfig pkgconfig

