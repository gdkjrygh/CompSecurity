// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.util.Comparator;

public final class SignedBytes
{
    private static final class LexicographicalComparator extends Enum
        implements Comparator
    {

        private static final LexicographicalComparator $VALUES[];
        public static final LexicographicalComparator INSTANCE;

        public static LexicographicalComparator valueOf(String s)
        {
            return (LexicographicalComparator)Enum.valueOf(com/google/common/primitives/SignedBytes$LexicographicalComparator, s);
        }

        public static LexicographicalComparator[] values()
        {
            return (LexicographicalComparator[])$VALUES.clone();
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((byte[])obj, (byte[])obj1);
        }

        public int compare(byte abyte0[], byte abyte1[])
        {
            int j = Math.min(abyte0.length, abyte1.length);
            for (int i = 0; i < j; i++)
            {
                int k = SignedBytes.compare(abyte0[i], abyte1[i]);
                if (k != 0)
                {
                    return k;
                }
            }

            return abyte0.length - abyte1.length;
        }

        static 
        {
            INSTANCE = new LexicographicalComparator("INSTANCE", 0);
            $VALUES = (new LexicographicalComparator[] {
                INSTANCE
            });
        }

        private LexicographicalComparator(String s, int i)
        {
            super(s, i);
        }
    }


    public static final byte MAX_POWER_OF_TWO = 64;

    private SignedBytes()
    {
    }

    public static byte checkedCast(long l)
    {
        byte byte0 = (byte)(int)l;
        if ((long)byte0 != l)
        {
            throw new IllegalArgumentException((new StringBuilder(34)).append("Out of range: ").append(l).toString());
        } else
        {
            return byte0;
        }
    }

    public static int compare(byte byte0, byte byte1)
    {
        return byte0 - byte1;
    }

    public static transient String join(String s, byte abyte0[])
    {
        Preconditions.checkNotNull(s);
        if (abyte0.length == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 5);
        stringbuilder.append(abyte0[0]);
        for (int i = 1; i < abyte0.length; i++)
        {
            stringbuilder.append(s).append(abyte0[i]);
        }

        return stringbuilder.toString();
    }

    public static Comparator lexicographicalComparator()
    {
        return LexicographicalComparator.INSTANCE;
    }

    public static transient byte max(byte abyte0[])
    {
        byte byte0;
        boolean flag;
        if (abyte0.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        byte0 = abyte0[0];
        for (int i = 1; i < abyte0.length;)
        {
            byte byte1 = byte0;
            if (abyte0[i] > byte0)
            {
                byte1 = abyte0[i];
            }
            i++;
            byte0 = byte1;
        }

        return byte0;
    }

    public static transient byte min(byte abyte0[])
    {
        byte byte0;
        boolean flag;
        if (abyte0.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        byte0 = abyte0[0];
        for (int i = 1; i < abyte0.length;)
        {
            byte byte1 = byte0;
            if (abyte0[i] < byte0)
            {
                byte1 = abyte0[i];
            }
            i++;
            byte0 = byte1;
        }

        return byte0;
    }

    public static byte saturatedCast(long l)
    {
        if (l > 127L)
        {
            return 127;
        }
        if (l < -128L)
        {
            return -128;
        } else
        {
            return (byte)(int)l;
        }
    }
}
