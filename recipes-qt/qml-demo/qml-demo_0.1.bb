SUMMARY = "QT Test Recipe"
LICENSE = "CLOSED"

SRC_URI = "git://code.qt.io/cgit/qt/qtdeclarative.git/tree/examples/qml/qml-i18n?h=6.2;protocol=ssh;protocol=https"

DEPENDS += "qtbase"
RDEPENDS_${PN} += "qtwayland"

S = "${WORKDIR}"

do_install:append() {
    install -d ${D}${bindir}
    install -m 0755 qml-demo ${D}${bindir}
}

# FILES_${PN} += "${D}${bindir}/qml-demo"

inherit qt6-cmake
