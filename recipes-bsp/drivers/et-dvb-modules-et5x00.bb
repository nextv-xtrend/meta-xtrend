KV = "3.8.7"
SRCDATE = "20180412"

RDEPENDS_${PN} += "et-fpupdate-${MACHINE}"

SRC_URI = "https://www.dropbox.com/s/raw/4wdfmq9uslwud7b/et5x00-drivers-3.8.7-20180412.zip"

require et-dvb-modules.inc

SRC_URI[md5sum] = "4ce3e933a8e863d4cf08b8c3a24904c5"
SRC_URI[sha256sum] = "28c96f80b68184af6eb673eb3150f3e72ca631b4e44844b166e2e789fda54d8f"

COMPATIBLE_MACHINE = "et5.00"
