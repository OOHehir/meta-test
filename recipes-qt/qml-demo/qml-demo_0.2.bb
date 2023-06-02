SUMMARY = "QT QML Test Recipe"
LICENSE = "CLOSED"
PR = "2032-6-1"

SRCREV="${AUTOREV}"

PV = "0.0.1+git${SRCPV}"

SRC_URI = "file://CMakeLists.txt	     \
           file://main.cpp              \
           file://Main.qml              "

DEPENDS += " qtbase \
             qtdeclarative-native \
             qtquick3d"

# RDEPENDS_${PN} += "qtwayland"

S = "${WORKDIR}"

# Manually add this file, must be a better way!
do_install:append() {
    install -d ${D}${bindir}
    install -m 0644 ${S}/Main.qml ${D}${bindir}
}

inherit qt6-cmake