# meta-obmc-machines

##Prerquisite
- Ubuntu
```
sudo apt-get install -y git build-essential libsdl1.2-dev texinfo gawk chrpath diffstat
```

##How to download:
1. Clone the OpenBMC repository and other open source repositories:
 ```bash
 $ git clone git://git.yoctoproject.org/poky
 $ git clone git://git.openembedded.org/meta-openembedded
 $ git clone git://git.yoctoproject.org/meta-raspberrypi
 $ git clone https://github.com/alon8432/meta-obmc-machines.git
 ```
3. Initialize a build directory for the platform to build. In the `openbmc` directory:
 ```bash
 $ export TEMPLATECONF=meta-obmc-machines/meta-evb/meta-evb-raspberrypi/conf
 $ source oe-init-build-env rpi-build/
 ```
4. Start the build within the build directory:
 ```bash
 $ bitbake core-image-base
 ```
 The build process automatically fetches all necessary packages and builds the complete image. The final build results a
re in `rpi-build/tmp/deploy/images/<platform>`. 
