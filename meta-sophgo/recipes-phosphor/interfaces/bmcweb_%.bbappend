FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

EXTRA_OEMESON:append= " \
    -Dredfish-dbus-log=enabled \
    -Dhttp-body-limit=128 \
    "

SRC_URI:append = " \
    file://0001-virtual-media-websocket-buffer-overflw.patch \
    file://0002-Support-websocket-control-frame-callback.patch \
    file://0003-Modify-Content-Security-Policy-CSP-to-adapt-WebAssem.patch \
    file://0004-sophgo-get-cpld-info-toUI.patch \
    file://0005-sophgo-redfidh.patch \
    file://0006-sophgo-systems.patch \
    file://0007-sophgo-cpld-systems.patch \
    file://0008-sophgo-mask-user-asdbg.patch \
    file://0009-sophgo-identifyLed.patch \
    file://0010-sophgo-systems-add-fanspeed.patch \
    file://0011-sophgo-ethernet.patch \
    file://0012-sophgo-redfish-add-sollog.patch \
    file://0013-sophgo-systems-hpp-add-sollog.patch \
    file://0014-sophgo-systems-add-1684x.patch \
    "
EXTRA_OEMESON:append = " \
    -Drest=enabled \
    "