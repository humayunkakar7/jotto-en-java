##==============================================================================
## Jotto
##
## @description: Makefile for Jotto.java
## @author: Humayun Khan
## @version: 1.0 
##==============================================================================

all:
	@echo "Compiling..."
	javac -Xlint:unchecked *.java

run: all
	@echo "Running..."
	java Jotto

.PHONY: clean

clean:
	@echo "Cleaning..."
	find . -name "*.class" -delete
