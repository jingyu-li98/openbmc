KBRANCH = "aspeed-dev-v5.4"
LINUX_VERSION ?= "5.4.62"

SRCREV = "${AUTOREV}"

require linux-aspeed.inc

DEPENDS += "lzop-native"