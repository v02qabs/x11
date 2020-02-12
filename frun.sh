#!/bin/sh
lftp << END

open -u takos:sg01St! ftp://pro.chobi.net

get Main.tar
