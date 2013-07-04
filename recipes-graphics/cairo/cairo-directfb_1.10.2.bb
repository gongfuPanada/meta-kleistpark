SUMMARY		= "The Cairo 2D vector graphics library"
DESCRIPTION	= "Cairo is a multi-platform library providing anti-aliased \
vector-based rendering for multiple target backends. Paths consist \
of line segments and cubic splines and can be rendered at any width \
with various join and cap styles. All colors may be specified with \
optional translucence (opacity/alpha) and combined using the \
extended Porter/Duff compositing algebra as found in the X Render \
Extension."
HOMEPAGE	= "http://cairographics.org"
BUGTRACKER	= "http://bugs.freedesktop.org"
SECTION		= "libs"

LICENSE		= "MPL-1 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=e73e999e0c72b5ac9012424fa157ad77"

PR = "r0"

SRC_URI = "http://cairographics.org/releases/cairo-${PV}.tar.gz \
           file://001-directfb-surface-get-surface.patch;patch=1"

S 	= "${WORKDIR}/cairo-${PV}"

SRC_URI[md5sum] = "f101a9e88b783337b20b2e26dfd26d5f"
SRC_URI[sha256sum] = "32018c7998358eebc2ad578ff8d8559d34fc80252095f110a572ed23d989fc41"

DEPENDS = "libpng fontconfig pixman directfb"

EXTRA_OECONF += "--enable-freetype=yes \
		--disable-win32 \
		--enable-xlib-xrender=no \
		--enable-pthread \
		--disable-gobject \
		--disable-script \
		--disable-xlib \
		--without-x \
		--enable-directfb \
"

FILES_${PN} = "${libdir}/libcairo.so.*"
