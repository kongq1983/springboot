#!/bin/bash

MANAGER_PID=$( ps -ef  | grep '[m]anager/bin/startup.sh' | awk '{print $2}' )

echo $MANAGER_PID
if [ -n "$MANAGER_PID" ]; then
	kill -9 ${MANAGER_PID}
fi

MANAGER_PID=$( ps -ef  | grep '[c]om.zyxk.shr.web.manager.ApplicationManager' | awk '{print $2}' )

echo $MANAGER_PID
if [ -n "$MANAGER_PID" ]; then
	kill -9 ${MANAGER_PID}
fi



#!/bin/bash

MANAGER_PID=$( ps -ef  | grep '[s]pringboot-1.0.jar' | awk '{print $2}' )

echo $MANAGER_PID
if [ -n "$MANAGER_PID" ]; then
        # kill -9 ${MANAGER_PID}
  echo "pid=$MANAGER_PID"
fi
