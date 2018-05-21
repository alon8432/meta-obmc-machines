SUMMARY = "A console development image with some C/C++ dev tools"

IMAGE_FEATURES += "package-management splash"
IMAGE_LINGUAS = "en-us"

inherit image

DEPENDS += "bcm2835-bootfiles"

CORE_OS = " \
    kernel-modules \
    openssh openssh-keygen openssh-sftp-server \
    packagegroup-core-boot \
"

WIFI_SUPPORT = " \
    crda \
    iw \
    wireless-tools \
    wpa-supplicant \
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
    python3-modules \
"

DEV_EXTRAS = " \
    ntp \
    ntp-tickadj \
"

EXTRA_TOOLS_INSTALL = " \
    bzip2 \
    devmem2 \
    dosfstools \
    ethtool \
    fbset \
    findutils \
    i2c-tools \
    iperf3 \
    iproute2 \
    iptables \
    less \
    nano \
    netcat \
    procps \
    sysfsutils \
    tcpdump \
    unzip \
    util-linux \
    wget \
    zip \
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
    ${WIFI_SUPPORT} \
"
export IMAGE_BASENAME = "console-image"

