SUMMARY = "Utilities for test"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=eb723b61539feef013de476e68b5c50a"

SRC_URI = " \
    file://COPYING \
    file://test-util.sh \
    "

SCRIPTS = " \
    test-util.sh \
    "

S = "${WORKDIR}"

do_install() {
    pkgdir="/usr/local/packages/utils"
    dstdir="${D}${pkgdir}"
    install -d $dstdir
    localbindir="${D}/usr/local/bin"
    install -d ${localbindir}
    for f in ${SCRIPTS}; do
        install -m 755 $f ${dstdir}/${f}
        ln -s ${pkgdir}/${f} ${localbindir}
    done
}

FILES_${PN} += "/usr/local"