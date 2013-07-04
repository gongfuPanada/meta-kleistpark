DESCRIPTION	= "Minimal Kleistpark image"
LICENSE		= "MIT"

inherit core-image

IMAGE_LINGUAS	= " "
IMAGE_INSTALL	= "task-core-boot \
		${ROOTFS_PKGMANAGE_BOOTSTRAP} \
		${CORE_IMAGE_EXTRA_INSTALL} \
		directfb-examples \
		lite \
		dfbterm \
		ilixi \
		"

IMAGE_ROOTFS_SIZE = "8192"

# remove not needed ipkg informations
ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; "
