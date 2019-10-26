package pkgInterface;

import pkgCore.Computer;

@FunctionalInterface
public interface InterfaceComputer {
	Computer create();
}