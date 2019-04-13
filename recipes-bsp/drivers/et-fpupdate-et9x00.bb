FPVERSION = "15"

SRC_URI = " \
	https://www.dropbox.com/s/raw/nl3iurzbmk398cy/fpupdate-1.0.zip \
	https://www.dropbox.com/s/raw/y1pew700zcjlzqt/avrmain-et9x00-15.zip;name=avrmain \
	"

require et-fpupdate-1.0.inc

SRC_URI[avrmain.md5sum] = "56c1e74eaf019d57fa29e64bb7755023"
SRC_URI[avrmain.sha256sum] = "dca85d2d990f9b718e75b9445ee8d2d2a8851733fd59569c2b4b22045ffa9bc9"
