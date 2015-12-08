// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Comparator;
import sun.misc.Unsafe;

// Referenced classes of package com.google.common.primitives:
//            UnsignedLongs

public final class UnsignedBytes
{
    static class LexicographicalComparatorHolder
    {

        static final Comparator BEST_COMPARATOR = getBestComparator();
        static final String UNSAFE_COMPARATOR_NAME = String.valueOf(com/google/common/primitives/UnsignedBytes$LexicographicalComparatorHolder.getName()).concat("$UnsafeComparator");

        static Comparator getBestComparator()
        {
            Comparator comparator;
            try
            {
                comparator = (Comparator)Class.forName(UNSAFE_COMPARATOR_NAME).getEnumConstants()[0];
            }
            catch (Throwable throwable)
            {
                return UnsignedBytes.lexicographicalComparatorJavaImpl();
            }
            return comparator;
        }


        LexicographicalComparatorHolder()
        {
        }
    }

    static final class LexicographicalComparatorHolder.PureJavaComparator extends Enum
        implements Comparator
    {

        private static final LexicographicalComparatorHolder.PureJavaComparator $VALUES[];
        public static final LexicographicalComparatorHolder.PureJavaComparator INSTANCE;

        public static LexicographicalComparatorHolder.PureJavaComparator valueOf(String s)
        {
            return (LexicographicalComparatorHolder.PureJavaComparator)Enum.valueOf(com/google/common/primitives/UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator, s);
        }

        public static LexicographicalComparatorHolder.PureJavaComparator[] values()
        {
            return (LexicographicalComparatorHolder.PureJavaComparator[])$VALUES.clone();
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
                int k = UnsignedBytes.compare(abyte0[i], abyte1[i]);
                if (k != 0)
                {
                    return k;
                }
            }

            return abyte0.length - abyte1.length;
        }

        static 
        {
            INSTANCE = new LexicographicalComparatorHolder.PureJavaComparator("INSTANCE", 0);
            $VALUES = (new LexicographicalComparatorHolder.PureJavaComparator[] {
                INSTANCE
            });
        }

        private LexicographicalComparatorHolder.PureJavaComparator(String s, int i)
        {
            super(s, i);
        }
    }

    static final class LexicographicalComparatorHolder.UnsafeComparator extends Enum
        implements Comparator
    {

        private static final LexicographicalComparatorHolder.UnsafeComparator $VALUES[];
        static final boolean BIG_ENDIAN;
        static final int BYTE_ARRAY_BASE_OFFSET;
        public static final LexicographicalComparatorHolder.UnsafeComparator INSTANCE;
        static final Unsafe theUnsafe;

        private static Unsafe getUnsafe()
        {
            Unsafe unsafe;
            try
            {
                unsafe = Unsafe.getUnsafe();
            }
            catch (SecurityException securityexception)
            {
                Unsafe unsafe1;
                try
                {
                    unsafe1 = (Unsafe)AccessController.doPrivileged(new PrivilegedExceptionAction() {

                        public volatile Object run()
                            throws Exception
                        {
                            return run();
                        }

                        public Unsafe run()
                            throws Exception
                        {
                            Field afield[] = sun/misc/Unsafe.getDeclaredFields();
                            int j = afield.length;
                            for (int i = 0; i < j; i++)
                            {
                                Object obj = afield[i];
                                ((Field) (obj)).setAccessible(true);
                                obj = ((Field) (obj)).get(null);
                                if (sun/misc/Unsafe.isInstance(obj))
                                {
                                    return (Unsafe)sun/misc/Unsafe.cast(obj);
                                }
                            }

                            throw new NoSuchFieldError("the Unsafe");
                        }

                    });
                }
                catch (PrivilegedActionException privilegedactionexception)
                {
                    throw new RuntimeException("Could not initialize intrinsics", privilegedactionexception.getCause());
                }
                return unsafe1;
            }
            return unsafe;
        }

        public static LexicographicalComparatorHolder.UnsafeComparator valueOf(String s)
        {
            return (LexicographicalComparatorHolder.UnsafeComparator)Enum.valueOf(com/google/common/primitives/UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator, s);
        }

        public static LexicographicalComparatorHolder.UnsafeComparator[] values()
        {
            return (LexicographicalComparatorHolder.UnsafeComparator[])$VALUES.clone();
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((byte[])obj, (byte[])obj1);
        }

        public int compare(byte abyte0[], byte abyte1[])
        {
            int i;
            int j;
            int l;
            l = Math.min(abyte0.length, abyte1.length);
            j = l / 8;
            i = 0;
_L10:
            if (i >= j * 8) goto _L2; else goto _L1
_L1:
            long l1;
            long l2;
            l1 = theUnsafe.getLong(abyte0, (long)BYTE_ARRAY_BASE_OFFSET + (long)i);
            l2 = theUnsafe.getLong(abyte1, (long)BYTE_ARRAY_BASE_OFFSET + (long)i);
            if (l1 == l2) goto _L4; else goto _L3
_L3:
            if (!BIG_ENDIAN) goto _L6; else goto _L5
_L5:
            i = UnsignedLongs.compare(l1, l2);
_L8:
            return i;
_L6:
            i = Long.numberOfTrailingZeros(l1 ^ l2) & -8;
            return (int)((l1 >>> i & 255L) - (l2 >>> i & 255L));
_L4:
            i += 8;
            continue; /* Loop/switch isn't completed */
_L2:
            j *= 8;
label0:
            do
            {
label1:
                {
                    if (j >= l)
                    {
                        break label1;
                    }
                    int k = UnsignedBytes.compare(abyte0[j], abyte1[j]);
                    i = k;
                    if (k != 0)
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
            if (true) goto _L8; else goto _L7
_L7:
            return abyte0.length - abyte1.length;
            if (true) goto _L10; else goto _L9
_L9:
        }

        static 
        {
            INSTANCE = new LexicographicalComparatorHolder.UnsafeComparator("INSTANCE", 0);
            $VALUES = (new LexicographicalComparatorHolder.UnsafeComparator[] {
                INSTANCE
            });
            BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
            theUnsafe = getUnsafe();
            BYTE_ARRAY_BASE_OFFSET = theUnsafe.arrayBaseOffset([B);
            if (theUnsafe.arrayIndexScale([B) != 1)
            {
                throw new AssertionError();
            }
        }

        private LexicographicalComparatorHolder.UnsafeComparator(String s, int i)
        {
            super(s, i);
        }
    }


    public static final byte MAX_POWER_OF_TWO = -128;
    public static final byte MAX_VALUE = -1;
    private static final int UNSIGNED_MASK = 255;

    private UnsignedBytes()
    {
    }

    public static byte checkedCast(long l)
    {
        if (l >> 8 != 0L)
        {
            throw new IllegalArgumentException((new StringBuilder(34)).append("Out of range: ").append(l).toString());
        } else
        {
            return (byte)(int)l;
        }
    }

    public static int compare(byte byte0, byte byte1)
    {
        return toInt(byte0) - toInt(byte1);
    }

    public static transient String join(String s, byte abyte0[])
    {
        Preconditions.checkNotNull(s);
        if (abyte0.length == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * (s.length() + 3));
        stringbuilder.append(toInt(abyte0[0]));
        for (int i = 1; i < abyte0.length; i++)
        {
            stringbuilder.append(s).append(toString(abyte0[i]));
        }

        return stringbuilder.toString();
    }

    public static Comparator lexicographicalComparator()
    {
        return LexicographicalComparatorHolder.BEST_COMPARATOR;
    }

    static Comparator lexicographicalComparatorJavaImpl()
    {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    public static transient byte max(byte abyte0[])
    {
        int j;
        boolean flag;
        if (abyte0.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        j = toInt(abyte0[0]);
        for (int i = 1; i < abyte0.length;)
        {
            int l = toInt(abyte0[i]);
            int k = j;
            if (l > j)
            {
                k = l;
            }
            i++;
            j = k;
        }

        return (byte)j;
    }

    public static transient byte min(byte abyte0[])
    {
        int j;
        boolean flag;
        if (abyte0.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        j = toInt(abyte0[0]);
        for (int i = 1; i < abyte0.length;)
        {
            int l = toInt(abyte0[i]);
            int k = j;
            if (l < j)
            {
                k = l;
            }
            i++;
            j = k;
        }

        return (byte)j;
    }

    public static byte parseUnsignedByte(String s)
    {
        return parseUnsignedByte(s, 10);
    }

    public static byte parseUnsignedByte(String s, int i)
    {
        i = Integer.parseInt((String)Preconditions.checkNotNull(s), i);
        if (i >> 8 == 0)
        {
            return (byte)i;
        } else
        {
            throw new NumberFormatException((new StringBuilder(25)).append("out of range: ").append(i).toString());
        }
    }

    public static byte saturatedCast(long l)
    {
        if (l > (long)toInt((byte)-1))
        {
            return -1;
        }
        if (l < 0L)
        {
            return 0;
        } else
        {
            return (byte)(int)l;
        }
    }

    public static int toInt(byte byte0)
    {
        return byte0 & 0xff;
    }

    public static String toString(byte byte0)
    {
        return toString(byte0, 10);
    }

    public static String toString(byte byte0, int i)
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
        return Integer.toString(toInt(byte0), i);
    }
}
