SUMMARY = "QT QML Test Recipe"
LICENSE = "CLOSED"

SRC_URI = "file://CMakeLists.txt	    \
           file://CMakeLists.txt.user   \
           file://main.cpp              \
           file://Main.qml              \
          "

DEPENDS += "qtbase qtquick3d"
RDEPENDS_${PN} += "qtwayland"

S = "${WORKDIR}"

do_install:append() {
    install -d ${D}${bindir}
    install -m 0755 qt-qml-demo ${D}${bindir}
}

# FILES_${PN} += "${D}${bindir}/qml-demo"

inherit qt6-cmake packagegroup-qt6-essentials
