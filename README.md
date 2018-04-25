# meta-obmc-machines

Step:

git clone git://git.yoctoproject.org/poky
cd poky
git clone git://git.openembedded.org/meta-openembedded
git clone git://git.yoctoproject.org/meta-raspberrypi
git clone https://github.com/alon8432/meta-obmc-machines.git


export TEMPLATECONF=meta-obmc-machines/meta-evb/meta-evb-raspberrypi/conf
source oe-init-build-env rpi-build/
bitbake core-image-base

