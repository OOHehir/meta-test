SUMMARY = "QT QML Test Recipe"
LICENSE = "CLOSED"
PR = "202362"

# SRCREV="${AUTOREV}"

SRC_URI = "file://CMakeLists.txt	     \
           file://main.cpp              \
           file://Main.qml              "

DEPENDS += " qtbase \
             qtdeclarative \
             qtquick3d \
             qttools \
               "
# qttools for QuickControls

# RDEPENDS_${PN} += "qtwayland"

S = "${WORKDIR}"

# Manually add this file, must be a better way!
do_install:append() {
    install -d ${D}${bindir}
    install -m 0644 ${S}/Main.qml ${D}${bindir}
}

inherit qt6-cmake
