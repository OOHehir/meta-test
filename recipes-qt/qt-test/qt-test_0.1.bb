SUMMARY = "QT Test Recipe"
LICENSE = "CLOSED"

SRC_URI = "file://qt-test.pro \
           file://qt-test.cpp"

DEPENDS += "qtbase"
RDEPENDS_${PN} += "qtwayland"

S = "${WORKDIR}"

# inherit qmake5

inherit qt6-qmake
