package eu.rekawek.coffeegb.cpu.op;

import eu.rekawek.coffeegb.AddressSpace;
import eu.rekawek.coffeegb.cpu.InterruptManager;
import eu.rekawek.coffeegb.cpu.Registers;

public interface Op {

    default boolean readsMemory() {
        return false;
    }

    default boolean writesMemory() {
        return false;
    }

    default int operandLength() {
        return 0;
    }

    default int execute(Registers registers, AddressSpace addressSpace, int[] args, int context) {
        return context;
    }

    default void switchInterrupts(InterruptManager interruptManager) {
    }

    default boolean proceed(Registers registers) {
        return true;
    }
}