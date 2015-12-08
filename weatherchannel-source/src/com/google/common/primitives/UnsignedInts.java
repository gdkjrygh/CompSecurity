// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.util.Comparator;

// Referenced classes of package com.google.common.primitives:
//            Ints, ParseRequest

public final class UnsignedInts
{
    static final class LexicographicalComparator extends Enum
        implements Comparator
    {

        private static final LexicographicalComparator $VALUES[];
        public static final LexicographicalComparator INSTANCE;

        public static LexicographicalComparator valueOf(String s)
        {
            return (LexicographicalComparator)Enum.valueOf(com/google/common/primitives/UnsignedInts$LexicographicalComparator, s);
        }

        public static LexicographicalComparator[] values()
        {
            return (LexicographicalComparator[])$VALUES.clone();
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((int[])obj, (int[])obj1);
        }

        public int compare(int ai[], int ai1[])
        {
            int j = Math.min(ai.length, ai1.length);
            for (int i = 0; i < j; i++)
            {
                if (ai[i] != ai1[i])
                {
                    return UnsignedInts.compare(ai[i], ai1[i]);
                }
            }

            return ai.length - ai1.length;
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


    static final long INT_MASK = 0xffffffffL;

    private UnsignedInts()
    {
    }

    public static int compare(int i, int j)
    {
        return Ints.compare(flip(i), flip(j));
    }

    public static int decode(String s)
    {
        ParseRequest parserequest = ParseRequest.fromString(s);
        int i;
        try
        {
            i = parseUnsignedInt(parserequest.rawValue, parserequest.radix);
        }
        catch (NumberFormatException numberformatexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Error parsing value: ".concat(s);
            } else
            {
                s = new String("Error parsing value: ");
            }
            s = new NumberFormatException(s);
            s.initCause(numberformatexception);
            throw s;
        }
        return i;
    }

    public static int divide(int i, int j)
    {
        return (int)(toLong(i) / toLong(j));
    }

    static int flip(int i)
    {
        return 0x80000000 ^ i;
    }

    public static transient String join(String s, int ai[])
    {
        Preconditions.checkNotNull(s);
        if (ai.length == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(ai.length * 5);
        stringbuilder.append(toString(ai[0]));
        for (int i = 1; i < ai.length; i++)
        {
            stringbuilder.append(s).append(toString(ai[i]));
        }

        return stringbuilder.toString();
    }

    public static Comparator lexicographicalComparator()
    {
        return LexicographicalComparator.INSTANCE;
    }

    public static transient int max(int ai[])
    {
        int j;
        boolean flag;
        if (ai.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        j = flip(ai[0]);
        for (int i = 1; i < ai.length;)
        {
            int l = flip(ai[i]);
            int k = j;
            if (l > j)
            {
                k = l;
            }
            i++;
            j = k;
        }

        return flip(j);
    }

    public static transient int min(int ai[])
    {
        int j;
        boolean flag;
        if (ai.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        j = flip(ai[0]);
        for (int i = 1; i < ai.length;)
        {
            int l = flip(ai[i]);
            int k = j;
            if (l < j)
            {
                k = l;
            }
            i++;
            j = k;
        }

        return flip(j);
    }

    public static int parseUnsignedInt(String s)
    {
        return parseUnsignedInt(s, 10);
    }

    public static int parseUnsignedInt(String s, int i)
    {
        Preconditions.checkNotNull(s);
        long l = Long.parseLong(s, i);
        if ((0xffffffffL & l) != l)
        {
            s = String.valueOf(String.valueOf(s));
            throw new NumberFormatException((new StringBuilder(s.length() + 69)).append("Input ").append(s).append(" in base ").append(i).append(" is not in the range of an unsigned integer").toString());
        } else
        {
            return (int)l;
        }
    }

    public static int remainder(int i, int j)
    {
        return (int)(toLong(i) % toLong(j));
    }

    public static long toLong(int i)
    {
        return (long)i & 0xffffffffL;
    }

    public static String toString(int i)
    {
        return toString(i, 10);
    }

    public static String toString(int i, int j)
    {
        return Long.toString((long)i & 0xffffffffL, j);
    }
}
