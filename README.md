# meta-obmc-machines

##Prerquisite
- Ubuntu
```
sudo apt-get install -y git build-essential libsdl1.2-dev texinfo gawk chrpath diffstat
```

##How to download:
1. Clone the OpenBMC repository and other open source repositories:
 ```bash
 $ git clone -b rocko https://git.yoctoproject.org/git/poky
 $ cd poky
 $ git clone https://github.com/alon8432/meta-obmc-machines.git -b airplay
 $ mkdir import-layers
 $ cd import-layers
 $ git clone -b rocko https://github.com/openembedded/meta-openembedded.git
 $ git clone -b rocko https://git.yoctoproject.org/git/meta-raspberrypi
 ```
3. Initialize a build directory for the platform to build. In the `root` directory:
 ```bash
 $ export TEMPLATECONF=meta-obmc-machines/meta-evb/meta-evb-raspberrypi/conf
 $ source poky/oe-init-build-env rpi-build
 ```
4. Start the build within the build directory:
 ```bash
 $ bitbake console-image
 ```
 The build process automatically fetches all necessary packages and builds the complete image. The final build results a
re in `rpi-build/tmp/deploy/images/<platform>`. 
