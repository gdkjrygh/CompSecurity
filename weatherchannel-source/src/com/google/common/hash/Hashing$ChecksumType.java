// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Supplier;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

// Referenced classes of package com.google.common.hash:
//            Hashing

static abstract class <init> extends Enum
    implements Supplier
{

    private static final ADLER_32 $VALUES[];
    public static final ADLER_32 ADLER_32;
    public static final ADLER_32 CRC_32;
    private final int bits;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/hash/Hashing$ChecksumType, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    public volatile Object get()
    {
        return get();
    }

    public abstract Checksum get();

    static 
    {
        CRC_32 = new Hashing.ChecksumType("CRC_32", 0, 32) {

            public volatile Object get()
            {
                return get();
            }

            public Checksum get()
            {
                return new CRC32();
            }

        };
        ADLER_32 = new Hashing.ChecksumType("ADLER_32", 1, 32) {

            public volatile Object get()
            {
                return get();
            }

            public Checksum get()
            {
                return new Adler32();
            }

        };
        $VALUES = (new .VALUES[] {
            CRC_32, ADLER_32
        });
    }


    private _cls2(String s, int i, int j)
    {
        super(s, i);
        bits = j;
    }

    bits(String s, int i, int j, bits bits1)
    {
        this(s, i, j);
    }
}
