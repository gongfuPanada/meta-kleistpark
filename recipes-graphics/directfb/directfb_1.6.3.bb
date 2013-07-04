require directfb.inc

RV = "1.6-3"
PR = "r1"

SRC_URI = "http://www.directfb.org/downloads/Core/DirectFB-1.6/DirectFB-1.6.3.tar.gz"
SRC_URI[md5sum] = "9b2b90b81d7ded2a4a5caa22daeb81ef"
SRC_URI[sha256sum] = "a40e640b53da9b2b155d98bf8cb1d173b01418c04b176768307adebefa0b78a8"

DEPENDS += "linux-fusion"

EXTRA_OECONF = "\
	--enable-multi \
	--enable-network \
	--enable-voodoo \
	--enable-one \
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
