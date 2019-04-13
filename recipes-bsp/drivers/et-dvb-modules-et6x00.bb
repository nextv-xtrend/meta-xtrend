KV = "3.8.7"
SRCDATE = "20180412"

RDEPENDS_${PN} += "et-fpupdate-${MACHINE}"

SRC_URI = "https://www.dropbox.com/s/raw/z4eznekbn4xfjz5/et6x00-drivers-3.8.7-20180412.zip"

require et-dvb-modules.inc

SRC_URI[md5sum] = "d7401f2e9d22a4596851ed966fbb1107"
SRC_URI[sha256sum] = "d5548f08e1c8824a093fe44736c8de8f324703c3fe1f17aa0b23656f50d2508e"

COMPATIBLE_MACHINE = "et6.00"
