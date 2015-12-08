// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

public final class Longs
{
    private static final class LexicographicalComparator extends Enum
        implements Comparator
    {

        private static final LexicographicalComparator $VALUES[];
        public static final LexicographicalComparator INSTANCE;

        public static LexicographicalComparator valueOf(String s)
        {
            return (LexicographicalComparator)Enum.valueOf(com/google/common/primitives/Longs$LexicographicalComparator, s);
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
                int k = Longs.compare(al[i], al1[i]);
                if (k != 0)
                {
                    return k;
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

    private static class LongArrayAsList extends AbstractList
        implements RandomAccess, Serializable
    {

        private static final long serialVersionUID = 0L;
        final long array[];
        final int end;
        final int start;

        public boolean contains(Object obj)
        {
            return (obj instanceof Long) && Longs.indexOf(array, ((Long)obj).longValue(), start, end) != -1;
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof LongArrayAsList)
                {
                    obj = (LongArrayAsList)obj;
                    int j = size();
                    if (((LongArrayAsList) (obj)).size() != j)
                    {
                        return false;
                    }
                    int i = 0;
                    while (i < j) 
                    {
                        if (array[start + i] != ((LongArrayAsList) (obj)).array[((LongArrayAsList) (obj)).start + i])
                        {
                            return false;
                        }
                        i++;
                    }
                } else
                {
                    return super.equals(obj);
                }
            }
            return true;
        }

        public Long get(int i)
        {
            Preconditions.checkElementIndex(i, size());
            return Long.valueOf(array[start + i]);
        }

        public volatile Object get(int i)
        {
            return get(i);
        }

        public int hashCode()
        {
            int j = 1;
            for (int i = start; i < end; i++)
            {
                j = j * 31 + Longs.hashCode(array[i]);
            }

            return j;
        }

        public int indexOf(Object obj)
        {
            if (obj instanceof Long)
            {
                int i = Longs.indexOf(array, ((Long)obj).longValue(), start, end);
                if (i >= 0)
                {
                    return i - start;
                }
            }
            return -1;
        }

        public boolean isEmpty()
        {
            return false;
        }

        public int lastIndexOf(Object obj)
        {
            if (obj instanceof Long)
            {
                int i = Longs.lastIndexOf(array, ((Long)obj).longValue(), start, end);
                if (i >= 0)
                {
                    return i - start;
                }
            }
            return -1;
        }

        public Long set(int i, Long long1)
        {
            Preconditions.checkElementIndex(i, size());
            long l = array[start + i];
            array[start + i] = ((Long)Preconditions.checkNotNull(long1)).longValue();
            return Long.valueOf(l);
        }

        public volatile Object set(int i, Object obj)
        {
            return set(i, (Long)obj);
        }

        public int size()
        {
            return end - start;
        }

        public List subList(int i, int j)
        {
            Preconditions.checkPositionIndexes(i, j, size());
            if (i == j)
            {
                return Collections.emptyList();
            } else
            {
                return new LongArrayAsList(array, start + i, start + j);
            }
        }

        long[] toLongArray()
        {
            int i = size();
            long al[] = new long[i];
            System.arraycopy(array, start, al, 0, i);
            return al;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(size() * 10);
            stringbuilder.append('[').append(array[start]);
            for (int i = start + 1; i < end; i++)
            {
                stringbuilder.append(", ").append(array[i]);
            }

            return stringbuilder.append(']').toString();
        }

        LongArrayAsList(long al[])
        {
            this(al, 0, al.length);
        }

        LongArrayAsList(long al[], int i, int j)
        {
            array = al;
            start = i;
            end = j;
        }
    }

    private static final class LongConverter extends Converter
        implements Serializable
    {

        static final LongConverter INSTANCE = new LongConverter();
        private static final long serialVersionUID = 1L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        protected volatile Object doBackward(Object obj)
        {
            return doBackward((Long)obj);
        }

        protected String doBackward(Long long1)
        {
            return long1.toString();
        }

        protected Long doForward(String s)
        {
            return Long.decode(s);
        }

        protected volatile Object doForward(Object obj)
        {
            return doForward((String)obj);
        }

        public String toString()
        {
            return "Longs.stringConverter()";
        }


        private LongConverter()
        {
        }
    }


    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 0x4000000000000000L;

    private Longs()
    {
    }

    public static transient List asList(long al[])
    {
        if (al.length == 0)
        {
            return Collections.emptyList();
        } else
        {
            return new LongArrayAsList(al);
        }
    }

    public static int compare(long l, long l1)
    {
        if (l < l1)
        {
            return -1;
        }
        return l <= l1 ? 0 : 1;
    }

    public static transient long[] concat(long al[][])
    {
        int k = 0;
        int l = al.length;
        for (int i = 0; i < l; i++)
        {
            k += al[i].length;
        }

        long al1[] = new long[k];
        k = 0;
        l = al.length;
        for (int j = 0; j < l; j++)
        {
            long al2[] = al[j];
            System.arraycopy(al2, 0, al1, k, al2.length);
            k += al2.length;
        }

        return al1;
    }

    public static boolean contains(long al[], long l)
    {
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            if (al[i] == l)
            {
                return true;
            }
        }

        return false;
    }

    private static long[] copyOf(long al[], int i)
    {
        long al1[] = new long[i];
        System.arraycopy(al, 0, al1, 0, Math.min(al.length, i));
        return al1;
    }

    public static long[] ensureCapacity(long al[], int i, int j)
    {
        long al1[];
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid minLength: %s", new Object[] {
            Integer.valueOf(i)
        });
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid padding: %s", new Object[] {
            Integer.valueOf(j)
        });
        al1 = al;
        if (al.length < i)
        {
            al1 = copyOf(al, i + j);
        }
        return al1;
    }

    public static long fromByteArray(byte abyte0[])
    {
        boolean flag;
        if (abyte0.length >= 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "array too small: %s < %s", new Object[] {
            Integer.valueOf(abyte0.length), Integer.valueOf(8)
        });
        return fromBytes(abyte0[0], abyte0[1], abyte0[2], abyte0[3], abyte0[4], abyte0[5], abyte0[6], abyte0[7]);
    }

    public static long fromBytes(byte byte0, byte byte1, byte byte2, byte byte3, byte byte4, byte byte5, byte byte6, byte byte7)
    {
        return ((long)byte0 & 255L) << 56 | ((long)byte1 & 255L) << 48 | ((long)byte2 & 255L) << 40 | ((long)byte3 & 255L) << 32 | ((long)byte4 & 255L) << 24 | ((long)byte5 & 255L) << 16 | ((long)byte6 & 255L) << 8 | (long)byte7 & 255L;
    }

    public static int hashCode(long l)
    {
        return (int)(l >>> 32 ^ l);
    }

    public static int indexOf(long al[], long l)
    {
        return indexOf(al, l, 0, al.length);
    }

    private static int indexOf(long al[], long l, int i, int j)
    {
        for (; i < j; i++)
        {
            if (al[i] == l)
            {
                return i;
            }
        }

        return -1;
    }

    public static int indexOf(long al[], long al1[])
    {
        Preconditions.checkNotNull(al, "array");
        Preconditions.checkNotNull(al1, "target");
        if (al1.length != 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i;
        int k;
        for (i = 0; i >= (al.length - al1.length) + 1;)
        {
            break MISSING_BLOCK_LABEL_78;
        }

        k = 0;
_L5:
        j = i;
        if (k >= al1.length) goto _L4; else goto _L3
_L3:
label0:
        {
            if (al[i + k] == al1[k])
            {
                break label0;
            }
            i++;
        }
          goto _L2
        k++;
          goto _L5
        return -1;
          goto _L2
    }

    public static transient String join(String s, long al[])
    {
        Preconditions.checkNotNull(s);
        if (al.length == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(al.length * 10);
        stringbuilder.append(al[0]);
        for (int i = 1; i < al.length; i++)
        {
            stringbuilder.append(s).append(al[i]);
        }

        return stringbuilder.toString();
    }

    public static int lastIndexOf(long al[], long l)
    {
        return lastIndexOf(al, l, 0, al.length);
    }

    private static int lastIndexOf(long al[], long l, int i, int j)
    {
        for (j--; j >= i; j--)
        {
            if (al[j] == l)
            {
                return j;
            }
        }

        return -1;
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
        l = al[0];
        for (int i = 1; i < al.length;)
        {
            long l1 = l;
            if (al[i] > l)
            {
                l1 = al[i];
            }
            i++;
            l = l1;
        }

        return l;
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
        l = al[0];
        for (int i = 1; i < al.length;)
        {
            long l1 = l;
            if (al[i] < l)
            {
                l1 = al[i];
            }
            i++;
            l = l1;
        }

        return l;
    }

    public static Converter stringConverter()
    {
        return LongConverter.INSTANCE;
    }

    public static long[] toArray(Collection collection)
    {
        if (!(collection instanceof LongArrayAsList)) goto _L2; else goto _L1
_L1:
        collection = ((LongArrayAsList)collection).toLongArray();
_L4:
        return collection;
_L2:
        Object aobj[] = collection.toArray();
        int j = aobj.length;
        long al[] = new long[j];
        int i = 0;
        do
        {
            collection = al;
            if (i >= j)
            {
                continue;
            }
            al[i] = ((Number)Preconditions.checkNotNull(aobj[i])).longValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] toByteArray(long l)
    {
        byte abyte0[] = new byte[8];
        for (int i = 7; i >= 0; i--)
        {
            abyte0[i] = (byte)(int)(255L & l);
            l >>= 8;
        }

        return abyte0;
    }

    public static Long tryParse(String s)
    {
        int i = 1;
        if (((String)Preconditions.checkNotNull(s)).isEmpty())
        {
            return null;
        }
        boolean flag;
        if (s.charAt(0) == '-')
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            i = 0;
        }
        if (i == s.length())
        {
            return null;
        }
        int j = s.charAt(i) - 48;
        if (j < 0 || j > 9)
        {
            return null;
        }
        long l = -j;
        for (i++; i < s.length(); i++)
        {
            int k = s.charAt(i) - 48;
            if (k < 0 || k > 9 || l < 0xf333333333333334L)
            {
                return null;
            }
            l *= 10L;
            if (l < (long)k - 0x8000000000000000L)
            {
                return null;
            }
            l -= k;
        }

        if (flag)
        {
            return Long.valueOf(l);
        }
        if (l == 0x8000000000000000L)
        {
            return null;
        } else
        {
            return Long.valueOf(-l);
        }
    }


}
