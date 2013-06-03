@echo off

set APPDIR="%CD%\.application"
cd "%APPDIR%"

start /min /realtime java -jar JSelect.jar
exit
