// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.math.BigInteger;
import java.util.Comparator;

// Referenced classes of package com.google.common.primitives:
//            Longs, ParseRequest

public final class UnsignedLongs
{
    static final class LexicographicalComparator extends Enum
        implements Comparator
    {

        private static final LexicographicalComparator $VALUES[];
        public static final LexicographicalComparator INSTANCE;

        public static LexicographicalComparator valueOf(String s)
        {
            return (LexicographicalComparator)Enum.valueOf(com/google/common/primitives/UnsignedLongs$LexicographicalComparator, s);
        }

        public static LexicographicalComparator[] values()
        {
            return (LexicographicalComparator[])$VALUES.clone();
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((long[])obj, (long[])obj1);
        }

        public int compare(long al[], long al1[])
        {
            int j = Math.min(al.length, al1.length);
            for (int i = 0; i < j; i++)
            {
                if (al[i] != al1[i])
                {
                    return UnsignedLongs.compare(al[i], al1[i]);
                }
            }

            return al.length - al1.length;
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


    public static final long MAX_VALUE = -1L;
    private static final int maxSafeDigits[];
    private static final long maxValueDivs[];
    private static final int maxValueMods[];

    private UnsignedLongs()
    {
    }

    public static int compare(long l, long l1)
    {
        return Longs.compare(flip(l), flip(l1));
    }

    public static long decode(String s)
    {
        ParseRequest parserequest = ParseRequest.fromString(s);
        long l;
        try
        {
            l = parseUnsignedLong(parserequest.rawValue, parserequest.radix);
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
        return l;
    }

    public static long divide(long l, long l1)
    {
        int i = 1;
        if (l1 < 0L)
        {
            return compare(l, l1) >= 0 ? 1L : 0L;
        }
        if (l >= 0L)
        {
            return l / l1;
        }
        long l2 = (l >>> 1) / l1 << 1;
        if (compare(l - l2 * l1, l1) < 0)
        {
            i = 0;
        }
        return (long)i + l2;
    }

    private static long flip(long l)
    {
        return 0x8000000000000000L ^ l;
    }

    public static transient String join(String s, long al[])
    {
        Preconditions.checkNotNull(s);
        if (al.length == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(al.length * 5);
        stringbuilder.append(toString(al[0]));
        for (int i = 1; i < al.length; i++)
        {
            stringbuilder.append(s).append(toString(al[i]));
        }

        return stringbuilder.toString();
    }

    public static Comparator lexicographicalComparator()
    {
        return LexicographicalComparator.INSTANCE;
    }

    public static transient long max(long al[])
    {
        long l;
        boolean flag;
        if (al.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        l = flip(al[0]);
        for (int i = 1; i < al.length;)
        {
            long l2 = flip(al[i]);
            long l1 = l;
            if (l2 > l)
            {
                l1 = l2;
            }
            i++;
            l = l1;
        }

        return flip(l);
    }

    public static transient long min(long al[])
    {
        long l;
        boolean flag;
        if (al.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        l = flip(al[0]);
        for (int i = 1; i < al.length;)
        {
            long l2 = flip(al[i]);
            long l1 = l;
            if (l2 < l)
            {
                l1 = l2;
            }
            i++;
            l = l1;
        }

        return flip(l);
    }

    private static boolean overflowInParse(long l, int i, int j)
    {
        boolean flag1 = true;
        boolean flag = flag1;
        if (l >= 0L)
        {
            if (l < maxValueDivs[j])
            {
                flag = false;
            } else
            {
                flag = flag1;
                if (l <= maxValueDivs[j])
                {
                    flag = flag1;
                    if (i <= maxValueMods[j])
                    {
                        return false;
                    }
                }
            }
        }
        return flag;
    }

    public static long parseUnsignedLong(String s)
    {
        return parseUnsignedLong(s, 10);
    }

    public static long parseUnsignedLong(String s, int i)
    {
        Preconditions.checkNotNull(s);
        if (s.length() == 0)
        {
            throw new NumberFormatException("empty string");
        }
        if (i < 2 || i > 36)
        {
            throw new NumberFormatException((new StringBuilder(26)).append("illegal radix: ").append(i).toString());
        }
        int k = maxSafeDigits[i];
        long l1 = 0L;
        for (int j = 0; j < s.length(); j++)
        {
            int l = Character.digit(s.charAt(j), i);
            if (l == -1)
            {
                throw new NumberFormatException(s);
            }
            if (j > k - 1 && overflowInParse(l1, l, i))
            {
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "Too large for unsigned long: ".concat(s);
                } else
                {
                    s = new String("Too large for unsigned long: ");
                }
                throw new NumberFormatException(s);
            }
            l1 = (long)i * l1 + (long)l;
        }

        return l1;
    }

    public static long remainder(long l, long l1)
    {
        if (l1 < 0L)
        {
            if (compare(l, l1) < 0)
            {
                return l;
            } else
            {
                return l - l1;
            }
        }
        if (l >= 0L)
        {
            return l % l1;
        }
        l -= ((l >>> 1) / l1 << 1) * l1;
        if (compare(l, l1) < 0)
        {
            l1 = 0L;
        }
        return l - l1;
    }

    public static String toString(long l)
    {
        return toString(l, 10);
    }

    public static String toString(long l, int i)
    {
        boolean flag;
        if (i >= 2 && i <= 36)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", new Object[] {
            Integer.valueOf(i)
        });
        if (l == 0L)
        {
            return "0";
        }
        char ac[] = new char[64];
        int k = ac.length;
        int j = k;
        long l1 = l;
        if (l < 0L)
        {
            l1 = divide(l, i);
            long l2 = i;
            j = k - 1;
            ac[j] = Character.forDigit((int)(l - l2 * l1), i);
        }
        for (; l1 > 0L; l1 /= i)
        {
            j--;
            ac[j] = Character.forDigit((int)(l1 % (long)i), i);
        }

        return new String(ac, j, ac.length - j);
    }

    static 
    {
        maxValueDivs = new long[37];
        maxValueMods = new int[37];
        maxSafeDigits = new int[37];
        BigInteger biginteger = new BigInteger("10000000000000000", 16);
        for (int i = 2; i <= 36; i++)
        {
            maxValueDivs[i] = divide(-1L, i);
            maxValueMods[i] = (int)remainder(-1L, i);
            maxSafeDigits[i] = biginteger.toString(i).length() - 1;
        }

    }
}
