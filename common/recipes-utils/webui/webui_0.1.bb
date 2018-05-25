SUMMARY = "Utilities for webui"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=0cce1e42ef3fb133940946534fcf8896"

DEPENDS_append = " update-rc.d-native"

S = "${WORKDIR}"

SRC_URI = " \
    file://COPYING \
    file://server.py \
    file://hello.py \
    file://setup-webui.sh \
    "

binfiles = "server.py hello.py setup-webui.sh"

pkgdir = "webui"

do_install() {
    dst="${D}/usr/local/rpipackages/${pkgdir}"
    bin="${D}/usr/local/bin"
    install -d $dst
    install -d $bin
    for f in ${binfiles}; do
        install -m 755 $f ${dst}/$f
        ln -snf ../rpipackages/${pkgdir}/$f ${bin}/$f
    done
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rcS.d
    install -m 755 setup-webui.sh ${D}${sysconfdir}/init.d/setup-webui.sh
    update-rc.d -r ${D} setup-webui.sh start 95 5  .
}

FILES_${PN} += "/usr/local"

RPIPACKAGEDIR = "${prefix}/local/rpipackages"

FILES_${PN} = "${RPIPACKAGEDIR}/webui ${prefix}/local/bin ${sysconfdir} "
