// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;


public interface IAccessFlags
{

    public static final int ACC_ABSTRACT = 1024;
    public static final int ACC_BRIDGE = 64;
    public static final int ACC_FINAL = 16;
    public static final int ACC_INTERFACE = 512;
    public static final int ACC_NATIVE = 256;
    public static final int ACC_PRIVATE = 2;
    public static final int ACC_PROTECTED = 4;
    public static final int ACC_PUBLIC = 1;
    public static final int ACC_STATIC = 8;
    public static final int ACC_SUPER = 32;
    public static final int ACC_SYNCHRONIZED = 32;
    public static final int ACC_TRANSIENT = 128;
    public static final int ACC_VOLATILE = 64;
    public static final int ALL_ACC[] = {
        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 
        1024
    };
    public static final String ALL_ACC_NAMES[] = {
        "public", "private", "protected", "static", "final", "synchronized", "volatile", "transient", "native", "interface", 
        "abstract"
    };

    public abstract int getAccessFlags();

    public abstract void setAccessFlags(int i);

}
