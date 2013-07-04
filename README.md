meta-kleistpark
===============

This README file contains information on the contents of the
kleistpark layer.

Please see the corresponding sections below for details.


Dependencies
------------

This layer depends on:

  URI: git://git.yoctoproject.org/poky.git

  branch: dylan


Patches
-------

Please submit any patches against the kleistpark layer to the
DirectFB developers (dev@directfb.org) with subject "[meta-kleistpark]".


Adding the kleistpark layer to your build
--------------------------------------------

In order to use this layer, you need to make the build system aware of
it.

Assuming the kleistpark layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the kleistpark layer to bblayers.conf, along with any
other layers needed. e.g.:

  BBLAYERS ?= " \
    /path/to/yocto/meta \
    /path/to/yocto/meta-yocto \
    /path/to/yocto/meta-yocto-bsp \
    /path/to/yocto/meta-kleistpark \
    "


Available images
----------------
* kleistpark-image
