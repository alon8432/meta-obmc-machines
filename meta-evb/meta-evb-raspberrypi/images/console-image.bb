SUMMARY = "A console development image with some C/C++ dev tools"

IMAGE_FEATURES += "package-management splash"
IMAGE_LINGUAS = "en-us"

inherit image

DEPENDS += "bcm2835-bootfiles"

CORE_OS = " \
    kernel-modules \
    openssh openssh-keygen openssh-sftp-server \
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
    binutils \
    binutils-symlinks \
    coreutils \
    cpp \
    cpp-symlinks \
    diffutils \
    file \
    g++ \
    g++-symlinks \
    gcc \
    gcc-symlinks \
    gdb \
    gdbserver \
    gettext \
    git \
    ldd \
    libstdc++ \
    libstdc++-dev \
    libtool \
    make \
    pkgconfig \
    python \
    python-modules \
    python3 \
    python3-modules \
    python3-git \
"

DEV_EXTRAS = " \
"

EXTRA_TOOLS_INSTALL = " \
    ethtool \
    findutils \
    i2c-tools \
    less \
    vim \
    procps \
    sysfsutils \
    unzip \
    util-linux \
    wget \
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
export IMAGE_BASENAME = "console-image"

