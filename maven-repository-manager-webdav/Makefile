
ROOT=$(shell dirname $(realpath $(firstword $(MAKEFILE_LIST))))

all:
	echo "--$(ROOT)--"
	echo "make ( run | clean )"

run:
	env BASEDIR=$(ROOT) httpd -f $(ROOT)/apache2/httpd.conf -X
	
clean:
	rm -rf ./www/repository/*
	rm -f ./apache2/DavLock.*
	rm -f ./apache2/logs/*

# END
