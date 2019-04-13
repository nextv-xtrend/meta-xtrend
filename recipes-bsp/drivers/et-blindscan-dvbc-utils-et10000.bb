DESCRIPTION = "Utils for DVB-C blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "https://www.dropbox.com/s/raw/6po3jfdb9fqid1f/et10000-dvbc-blindscan-1.2.zip"

PROVIDES += "virtual/blindscan-dvbc"
RPROVIDES_${PN} += "virtual/blindscan-dvbc"

PV = "1.2"
PR = "r2"

S = "${WORKDIR}"

do_compile() {
}

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
}

INHIBIT_PACKAGE_STRIP = "1"

SRC_URI[md5sum] = "459be6d6e8336d182de1ada4a8dfd3c0"
SRC_URI[sha256sum] = "8f67c7f79d8a4b9d7eea5a1574d1945e8c7c6eea5560cadb0566c4533e01bb12"
