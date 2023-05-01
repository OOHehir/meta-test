DESCRIPTION = "An image that includes Qt6 with a demo application & SDK"
LICENSE = "MIT"
PR = "r0"

IMAGE_INSTALL += "\
    qt-test \
    qt-qml-demo \
    helloworld \
"

inherit core-image

# RDEPENDS:${PN} += " \
#    packagegroup-qt6-essentials \
#    packagegroup-qt6-addons \
# "

# IMAGE_INSTALL +=  " \
#    packagegroup-qt6-essentials \
#    packagegroup-qt6-addons \
#"

TOOLCHAIN_HOST_TASK += "\
    nativesdk-packagegroup-qt6-toolchain-host \
"

# TOOLCHAIN_TARGET_TASK += "\
#    packagegroup-qt6-modules \
# "
