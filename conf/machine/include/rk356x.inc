# Copyright (c) 2020, Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

require conf/machine/include/rockchip-arm64-common.inc
require conf/machine/include/mali.inc

RK_SOC_FAMILY := "rk3568"

PREFERRED_VERSION_linux-rockchip := "6.1%"
LINUXLIBCVERSION := "6.1-custom%"

MALI_GPU := "bifrost-g52"
MALI_VERSION := "g24p0"

RK_ISP_VERSION := "2.1"
