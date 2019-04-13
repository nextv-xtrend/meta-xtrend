KV = "4.10.6"
SRCDATE = "20180412"

SRC_URI = "https://www.dropbox.com/s/raw/5w0ygrkz9lhbed5/et4x00-drivers-4.10.6-20180412.zip"

require et-dvb-modules.inc

SRC_URI[md5sum] = "d2b3255b616ff3b611a6f0624e6fdf8c"
SRC_URI[sha256sum] = "480f5c5e98dd3e1225fa26d36c80166e95646598b13b18f58789ee01b0200507"

COMPATIBLE_MACHINE = "et4.00"
