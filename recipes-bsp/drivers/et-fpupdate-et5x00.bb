FPVERSION = "15"

SRC_URI = " \
	https://www.dropbox.com/s/raw/nl3iurzbmk398cy/fpupdate-1.0.zip \
	https://www.dropbox.com/s/raw/7t1j63g078s63sh/avrmain-et5x00-15.zip;name=avrmain \
	"

require et-fpupdate-1.0.inc

SRC_URI[avrmain.md5sum] = "7f0816c2f8fbb5d3407cbc204f1e1927"
SRC_URI[avrmain.sha256sum] = "19ad90cdc776b5a4a71c39500be9d888e0155ba7dc5053eed998ad8252de4352"
