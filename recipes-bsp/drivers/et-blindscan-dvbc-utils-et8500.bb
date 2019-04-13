DESCRIPTION = "Utils for DVB-C blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "https://www.dropbox.com/s/raw/8f3wh8ksu8griph/et8500-dvbc-blindscan-1.6.zip"

PROVIDES += "virtual/blindscan-dvbc"
RPROVIDES_${PN} += "virtual/blindscan-dvbc"

PV = "1.6"
PR = "r2"

S = "${WORKDIR}"

do_compile() {
}

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
}

INHIBIT_PACKAGE_STRIP = "1"

SRC_URI[md5sum] = "04475b40f25460cead27285f103a0f50"
SRC_URI[sha256sum] = "2e0c285ee8768e8a342ca8ba97f3b1238e3ebc2dcb1b71c4803c532c94804478"
