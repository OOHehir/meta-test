SUMMARY = "QT Test Recipe"
LICENSE = "CLOSED"

# PR service enabled in local.conf
SRC_URI = "git://git@github.com/OOHehir/meta-test/tree/main/recipes-qt/qt-test/files;protocol=ssh;branch=main"
SRCREV="${AUTOREV}"

# SRC_URI = "file://qt-test.pro \
#           file://qt-test.cpp"

DEPENDS += "qtbase"
RDEPENDS_${PN} += "qtwayland"

S = "${WORKDIR}"

do_install_append() {
    install -d ${D}${bindir}
    install -m 0755 qt-test ${D}${bindir}
}

# FILES_${PN} += "${D}${bindir}/qt-test"

# inherit qmake5
inherit qt6-qmake
