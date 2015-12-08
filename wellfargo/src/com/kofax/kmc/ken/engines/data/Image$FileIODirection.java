// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


final class  extends Enum
{

    private static final FILE_IO_WRITE $VALUES[];
    public static final FILE_IO_WRITE FILE_IO_READ;
    public static final FILE_IO_WRITE FILE_IO_WRITE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$FileIODirection, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FILE_IO_READ = new <init>("FILE_IO_READ", 0);
        FILE_IO_WRITE = new <init>("FILE_IO_WRITE", 1);
        $VALUES = (new .VALUES[] {
            FILE_IO_READ, FILE_IO_WRITE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
