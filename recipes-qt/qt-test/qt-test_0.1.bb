SUMMARY = "QT Test Recipe"
LICENSE = "CLOSED"

SRC_URI = "file://qt-test.pro \
           file://qt-test.cpp"

DEPENDS += "qtbase"
RDEPENDS_${PN} += "qtwayland"

S = "${WORKDIR}"

do_install_append() {
    install -d ${D}${bindir}
    install -m 0755 qt-test ${D}${bindir}
}

FILES_${PN} += "${D}${bindir}/qt-test"

# inherit qmake5
inherit qt6-qmake
