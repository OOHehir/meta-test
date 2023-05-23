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

inherit qt6-cmake
