package com.github.jvmgo.instructions.control;

import com.github.jvmgo.instructions.base.NoOperandsInstruction;
import com.github.jvmgo.rtda.Frame;

public class freturn extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0xae;
    }

    @Override
    public void execute(Frame frame) throws Exception {

    }
}
