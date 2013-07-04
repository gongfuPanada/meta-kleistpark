SUMMARY		= "fusion kernel driver for DirectFB multi-application core"
DESCRIPTION	= "Fusion is an Inter-Process-Communication (IPC) kernel module with a high level of abstraction for DirectFB"
HOMEPAGE	= "http://www.directfb.org"
SECTION		= "kernel/modules"
PR		= "r0"

LICENSE	= "GPLv2"
LIC_FILES_CHKSUM = "file://linux/include/linux/fusion.h;beginline=9;endline=12;md5=5507d6bdbe75dfd82817ce2ce942259e"

DEPENDS = "virtual/kernel"

SRC_URI = "git://git.directfb.org/git/directfb/core/linux-fusion.git;protocol=git \
           file://40-fusion.rules\
	   file://40-one.rules"
SRCREV 	= "${AUTOREV}"
S 	= "${WORKDIR}/git"

inherit module

EXTRA_OEMAKE="KERNELDIR=${STAGING_KERNEL_DIR}"

do_install() {
	# install module
	install -d ${D}${base_libdir}/modules/${KERNEL_VERSION}/drivers/char/fusion
	install -m 0644 ${S}/linux/drivers/char/fusion/fusion*${KERNEL_OBJECT_SUFFIX} ${D}${base_libdir}/modules/${KERNEL_VERSION}/drivers/char/fusion
	install -m 0644 ${S}/one/linux-one*${KERNEL_OBJECT_SUFFIX} ${D}${base_libdir}/modules/${KERNEL_VERSION}/drivers/char/fusion
	# install header
	install -d ${D}${includedir}/linux
	install -m 644 ${S}/linux/include/linux/fusion.h ${D}${includedir}/linux
	install -m 644 ${S}/include/linux/one.h ${D}${includedir}/linux
	# add udev rule
	install -d ${D}${sysconfdir}/udev/rules.d
	install -m 0644 ${WORKDIR}/40-fusion.rules ${D}${sysconfdir}/udev/rules.d/40-fusion.rules
	install -m 0644 ${WORKDIR}/40-one.rules ${D}${sysconfdir}/udev/rules.d/40-one.rules
}

MAKE_TARGETS = "KERNEL_BUILD=${STAGING_KERNEL_DIR} MAKE='make -e'"
