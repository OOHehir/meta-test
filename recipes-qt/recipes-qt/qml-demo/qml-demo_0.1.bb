SUMMARY = "QT QML Test Recipe"
LICENSE = "CLOSED"

SRC_URI = "file://CMakeLists.txt	     \
           file://main.cpp              \
           file://Main.qml              "

DEPENDS += " qtbase \
             qtdeclarative-native \
             qtquick3d"

RDEPENDS_${PN} += "qtwayland"

S = "${WORKDIR}"

# Not needed as install is handled by cmake..
#do_install:append() {
#    install -d ${D}${bindir}
#    install -m 0755${WORKDIR}/build/qt-qml-demo ${D}${bindir}
#}

# FILES_${PN} += "${D}${bindir}/qml-demo"

inherit qt6-cmake
