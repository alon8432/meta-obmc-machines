#!/bin/sh

echo -n "Setup Web UI handler... "
/usr/local/bin/server.py > /tmp/webui.log 2>&1 &
echo "done."