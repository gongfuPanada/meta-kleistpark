require directfb.inc

PR = "r0"
PV = "1.7-0"

SRC_URI	= "git://git.directfb.org/git/directfb/core/DirectFB.git \
	file://remove-configure-cc-workaround.patch"
SRCREV 	= "${AUTOREV}"
S 	= "${WORKDIR}/git"

DEPENDS += "flux-native linux-fusion"
PROVIDES = "fusiondale fusionsound sawman"

EXTRA_OECONF = "\
	--enable-multi \
	--enable-network \
	--enable-voodoo \
	--enable-one \
	--enable-fusiondale \
	--enable-fusionsound \
	--enable-sawman \
	--disable-osx \
	--disable-x11 \
	--disable-mmx \
	--disable-sse \
	--enable-fbdev \
	--disable-sdl \
	--disable-vnc \
	--enable-sysfs \
	--with-inputdrivers=linuxinput \
	--with-gfxdrivers=none \
	--with-tests \
	--with-tools \
"

FILES_${PN} += "${libdir}/directfb-${RV}/snddrivers/*.so"
FILES_${PN}-dev += "${libdir}/directfb-${RV}/snddrivers/*.la"

