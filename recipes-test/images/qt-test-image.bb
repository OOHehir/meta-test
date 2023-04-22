DESCRIPTION = "An image that includes Qt6 with a demo application"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"

IMAGE_INSTALL += "\
    qt-test \
    helloworld \
"

inherit packagegroup-qt6-essentials packagegroup-qt6-addons nativesdk-packagegroup-qt6-toolchain-host core-image

TOOLCHAIN_HOST_TASK += "\
    nativesdk-packagegroup-qt6-toolchain-host \
"

TOOLCHAIN_TARGET_TASK += "\
    packagegroup-qt6-modules \
"
