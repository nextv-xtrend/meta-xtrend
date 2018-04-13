require conf/machine/include/et.inc

PREFERRED_PROVIDER_virtual/kernel = "linux-etxx00"
PREFERRED_VERSION_linux-etxx00 = "4.10.6"

PREFERRED_PROVIDER_virtual/blindscan-dvbc = "et-blindscan-dvbc-utils-${MACHINE}"

MKUBIFS_ARGS = "-m 2048 -e 126976 -c 8192"
UBINIZE_ARGS = "-m 2048 -p 128KiB"

IMAGE_CMD_ubi_prepend = " \
	rm -Rf ${IMAGE_ROOTFS}/tmp/*; \
	"

MACHINE_FEATURES += "extrakernelwifi"

MACHINE_KERNEL_PR = "r0"
