SUMMARY = "A mini console image with webui support"

require recipes-core/images/rpi-basic-image.bb

CORE_OS = " \
    kernel-modules \
    packagegroup-core-boot \
    os-release \
"

NETWORK_SUPPORT = " \
    crda \
    iw \
    wireless-tools \
    wpa-supplicant \
    dhcp-client \
    ntp \
    ntp-utils \
    ntpdate \
    sntp \
    iproute2 \
    iptables \
"

DEV_SDK_INSTALL = " \
    python \
    python-modules \
    python3 \
    python3-modules \
    python3-git \
    bcm2835-tests \
    wiringpi \
    rpio \
    rpi-gpio \
    pi-blaster \
"

DEV_EXTRAS = " \
"

EXTRA_TOOLS_INSTALL = " \
    ethtool \
    vim \
    tar \
"

EXTRA_UTILS_INSTALL = " \
    webui \
"

RPI_STUFF = " \
    userland \
"

IMAGE_INSTALL += " \
    ${CORE_OS} \
    ${DEV_SDK_INSTALL} \
    ${DEV_EXTRAS} \
    ${EXTRA_TOOLS_INSTALL} \
    ${RPI_STUFF} \
    ${NETWORK_SUPPORT} \
    ${EXTRA_UTILS_INSTALL} \
"
export IMAGE_BASENAME = "mini-console-image"

