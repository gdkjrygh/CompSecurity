// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;


public final class FileWriteMode extends Enum
{

    private static final FileWriteMode $VALUES[];
    public static final FileWriteMode APPEND;

    private FileWriteMode(String s, int i)
    {
        super(s, i);
    }

    public static FileWriteMode valueOf(String s)
    {
        return (FileWriteMode)Enum.valueOf(com/google/common/io/FileWriteMode, s);
    }

    public static FileWriteMode[] values()
    {
        return (FileWriteMode[])$VALUES.clone();
    }

    static 
    {
        APPEND = new FileWriteMode("APPEND", 0);
        $VALUES = (new FileWriteMode[] {
            APPEND
        });
    }
}
