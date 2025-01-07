# Copyright (C) 2024, Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

inherit auto-patch

inherit local-git

SRCREV = "fa5bf8dce12ca3e383800afe32cfe165788a6cca"

SRC_URI = " \
	git://github.com/mdrjr/linux.git;protocol=https;nobranch=1;branch=linux-6.1-stan-rkr4; \
"

S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
