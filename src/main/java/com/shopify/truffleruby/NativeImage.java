package com.shopify.truffleruby;

import org.graalvm.nativeimage.IsolateThread;
import org.graalvm.nativeimage.c.function.CEntryPoint;
import org.graalvm.polyglot.Context;

public class NativeImage {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    @CEntryPoint
    public static int getNumber(IsolateThread thread) {
        try (Context context = Context.newBuilder("js").build()) {
            return 8;
        }
    }
}
