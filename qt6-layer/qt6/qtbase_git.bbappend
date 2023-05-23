# Modify qtbase to enable appropriate graphics for Raspberry Pi 4 

# It appears that eglfs_brcm will not be enabled in Qt6: 
# http://bugreports.qt.io/browse/QTBUG-77179

# Therefore based on: http://doc.qt.io/qt-6/configure-linux-device.html need to enable EGLFS platform plugin:
# '... we expect that EGL, OpenGL ES and EGLFS GBM are all reported as yes, otherwise the EGLFS platform plugin and its eglfs_kms backend will not be functional on the device. For getting function mouse, keyboard, and touch input, either evdev or libinput must be enabled.'

PACKAGECONFIG_FONTS_rpi = "fontconfig"
PACKAGECONFIG:remove:rpi = "tests x11 wayland"
PACKAGECONFIG:append:rpi = " examples accessibility eglfs gles2 gbm linuxfb tslib libinput"

# Note only tested on rpi4
