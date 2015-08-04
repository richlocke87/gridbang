#!/bin/sh

SOURCE=${1}
CLASS=${2}

scalac -d classes ${SOURCE}
cd classes
scala ${CLASS} $3 $4
cd ..