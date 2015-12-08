// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

public final class Ints
{
    private static class IntArrayAsList extends AbstractList
        implements RandomAccess, Serializable
    {

        private static final long serialVersionUID = 0L;
        final int array[];
        final int end;
        final int start;

        public boolean contains(Object obj)
        {
            return (obj instanceof Integer) && Ints.indexOf(array, ((Integer)obj).intValue(), start, end) != -1;
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof IntArrayAsList)
                {
                    obj = (IntArrayAsList)obj;
                    int j = size();
                    if (((IntArrayAsList) (obj)).size() != j)
                    {
                        return false;
                    }
                    int i = 0;
                    while (i < j) 
                    {
                        if (array[start + i] != ((IntArrayAsList) (obj)).array[((IntArrayAsList) (obj)).start + i])
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

        public Integer get(int i)
        {
            Preconditions.checkElementIndex(i, size());
            return Integer.valueOf(array[start + i]);
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
                j = j * 31 + Ints.hashCode(array[i]);
            }

            return j;
        }

        public int indexOf(Object obj)
        {
            if (obj instanceof Integer)
            {
                int i = Ints.indexOf(array, ((Integer)obj).intValue(), start, end);
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
            if (obj instanceof Integer)
            {
                int i = Ints.lastIndexOf(array, ((Integer)obj).intValue(), start, end);
                if (i >= 0)
                {
                    return i - start;
                }
            }
            return -1;
        }

        public Integer set(int i, Integer integer)
        {
            Preconditions.checkElementIndex(i, size());
            int j = array[start + i];
            array[start + i] = ((Integer)Preconditions.checkNotNull(integer)).intValue();
            return Integer.valueOf(j);
        }

        public volatile Object set(int i, Object obj)
        {
            return set(i, (Integer)obj);
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
                return new IntArrayAsList(array, start + i, start + j);
            }
        }

        int[] toIntArray()
        {
            int i = size();
            int ai[] = new int[i];
            System.arraycopy(array, start, ai, 0, i);
            return ai;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(size() * 5);
            stringbuilder.append('[').append(array[start]);
            for (int i = start + 1; i < end; i++)
            {
                stringbuilder.append(", ").append(array[i]);
            }

            return stringbuilder.append(']').toString();
        }

        IntArrayAsList(int ai[])
        {
            this(ai, 0, ai.length);
        }

        IntArrayAsList(int ai[], int i, int j)
        {
            array = ai;
            start = i;
            end = j;
        }
    }

    private static final class IntConverter extends Converter
        implements Serializable
    {

        static final IntConverter INSTANCE = new IntConverter();
        private static final long serialVersionUID = 1L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        protected volatile Object doBackward(Object obj)
        {
            return doBackward((Integer)obj);
        }

        protected String doBackward(Integer integer)
        {
            return integer.toString();
        }

        protected Integer doForward(String s)
        {
            return Integer.decode(s);
        }

        protected volatile Object doForward(Object obj)
        {
            return doForward((String)obj);
        }

        public String toString()
        {
            return "Ints.stringConverter()";
        }


        private IntConverter()
        {
        }
    }

    private static final class LexicographicalComparator extends Enum
        implements Comparator
    {

        private static final LexicographicalComparator $VALUES[];
        public static final LexicographicalComparator INSTANCE;

        public static LexicographicalComparator valueOf(String s)
        {
            return (LexicographicalComparator)Enum.valueOf(com/google/common/primitives/Ints$LexicographicalComparator, s);
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
                int k = Ints.compare(ai[i], ai1[i]);
                if (k != 0)
                {
                    return k;
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


    public static final int BYTES = 4;
    public static final int MAX_POWER_OF_TWO = 0x40000000;
    private static final byte asciiDigits[];

    private Ints()
    {
    }

    public static transient List asList(int ai[])
    {
        if (ai.length == 0)
        {
            return Collections.emptyList();
        } else
        {
            return new IntArrayAsList(ai);
        }
    }

    public static int checkedCast(long l)
    {
        int i = (int)l;
        if ((long)i != l)
        {
            throw new IllegalArgumentException((new StringBuilder(34)).append("Out of range: ").append(l).toString());
        } else
        {
            return i;
        }
    }

    public static int compare(int i, int j)
    {
        if (i < j)
        {
            return -1;
        }
        return i <= j ? 0 : 1;
    }

    public static transient int[] concat(int ai[][])
    {
        int k = 0;
        int l = ai.length;
        for (int i = 0; i < l; i++)
        {
            k += ai[i].length;
        }

        int ai1[] = new int[k];
        k = 0;
        l = ai.length;
        for (int j = 0; j < l; j++)
        {
            int ai2[] = ai[j];
            System.arraycopy(ai2, 0, ai1, k, ai2.length);
            k += ai2.length;
        }

        return ai1;
    }

    public static boolean contains(int ai[], int i)
    {
        int k = ai.length;
        for (int j = 0; j < k; j++)
        {
            if (ai[j] == i)
            {
                return true;
            }
        }

        return false;
    }

    private static int[] copyOf(int ai[], int i)
    {
        int ai1[] = new int[i];
        System.arraycopy(ai, 0, ai1, 0, Math.min(ai.length, i));
        return ai1;
    }

    private static int digit(char c)
    {
        if (c < '\200')
        {
            return asciiDigits[c];
        } else
        {
            return -1;
        }
    }

    public static int[] ensureCapacity(int ai[], int i, int j)
    {
        int ai1[];
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
        ai1 = ai;
        if (ai.length < i)
        {
            ai1 = copyOf(ai, i + j);
        }
        return ai1;
    }

    public static int fromByteArray(byte abyte0[])
    {
        boolean flag;
        if (abyte0.length >= 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "array too small: %s < %s", new Object[] {
            Integer.valueOf(abyte0.length), Integer.valueOf(4)
        });
        return fromBytes(abyte0[0], abyte0[1], abyte0[2], abyte0[3]);
    }

    public static int fromBytes(byte byte0, byte byte1, byte byte2, byte byte3)
    {
        return byte0 << 24 | (byte1 & 0xff) << 16 | (byte2 & 0xff) << 8 | byte3 & 0xff;
    }

    public static int hashCode(int i)
    {
        return i;
    }

    public static int indexOf(int ai[], int i)
    {
        return indexOf(ai, i, 0, ai.length);
    }

    private static int indexOf(int ai[], int i, int j, int k)
    {
        for (; j < k; j++)
        {
            if (ai[j] == i)
            {
                return j;
            }
        }

        return -1;
    }

    public static int indexOf(int ai[], int ai1[])
    {
        Preconditions.checkNotNull(ai, "array");
        Preconditions.checkNotNull(ai1, "target");
        if (ai1.length != 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i;
        int k;
        for (i = 0; i >= (ai.length - ai1.length) + 1;)
        {
            break MISSING_BLOCK_LABEL_77;
        }

        k = 0;
_L5:
        j = i;
        if (k >= ai1.length) goto _L4; else goto _L3
_L3:
label0:
        {
            if (ai[i + k] == ai1[k])
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

    public static transient String join(String s, int ai[])
    {
        Preconditions.checkNotNull(s);
        if (ai.length == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(ai.length * 5);
        stringbuilder.append(ai[0]);
        for (int i = 1; i < ai.length; i++)
        {
            stringbuilder.append(s).append(ai[i]);
        }

        return stringbuilder.toString();
    }

    public static int lastIndexOf(int ai[], int i)
    {
        return lastIndexOf(ai, i, 0, ai.length);
    }

    private static int lastIndexOf(int ai[], int i, int j, int k)
    {
        for (k--; k >= j; k--)
        {
            if (ai[k] == i)
            {
                return k;
            }
        }

        return -1;
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
        j = ai[0];
        for (int i = 1; i < ai.length;)
        {
            int k = j;
            if (ai[i] > j)
            {
                k = ai[i];
            }
            i++;
            j = k;
        }

        return j;
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
        j = ai[0];
        for (int i = 1; i < ai.length;)
        {
            int k = j;
            if (ai[i] < j)
            {
                k = ai[i];
            }
            i++;
            j = k;
        }

        return j;
    }

    public static int saturatedCast(long l)
    {
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        }
        if (l < 0xffffffff80000000L)
        {
            return 0x80000000;
        } else
        {
            return (int)l;
        }
    }

    public static Converter stringConverter()
    {
        return IntConverter.INSTANCE;
    }

    public static int[] toArray(Collection collection)
    {
        if (!(collection instanceof IntArrayAsList)) goto _L2; else goto _L1
_L1:
        collection = ((IntArrayAsList)collection).toIntArray();
_L4:
        return collection;
_L2:
        Object aobj[] = collection.toArray();
        int j = aobj.length;
        int ai[] = new int[j];
        int i = 0;
        do
        {
            collection = ai;
            if (i >= j)
            {
                continue;
            }
            ai[i] = ((Number)Preconditions.checkNotNull(aobj[i])).intValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] toByteArray(int i)
    {
        return (new byte[] {
            (byte)(i >> 24), (byte)(i >> 16), (byte)(i >> 8), (byte)i
        });
    }

    public static Integer tryParse(String s)
    {
        return tryParse(s, 10);
    }

    static Integer tryParse(String s, int i)
    {
        int j = 1;
        if (((String)Preconditions.checkNotNull(s)).isEmpty())
        {
            return null;
        }
        if (i < 2 || i > 36)
        {
            throw new IllegalArgumentException((new StringBuilder(65)).append("radix must be between MIN_RADIX and MAX_RADIX but was ").append(i).toString());
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
            j = 0;
        }
        if (j == s.length())
        {
            return null;
        }
        int k = digit(s.charAt(j));
        if (k < 0 || k >= i)
        {
            return null;
        }
        k = -k;
        int l = 0x80000000 / i;
        for (j++; j < s.length(); j++)
        {
            int i1 = digit(s.charAt(j));
            if (i1 < 0 || i1 >= i || k < l)
            {
                return null;
            }
            k *= i;
            if (k < 0x80000000 + i1)
            {
                return null;
            }
            k -= i1;
        }

        if (flag)
        {
            return Integer.valueOf(k);
        }
        if (k == 0x80000000)
        {
            return null;
        } else
        {
            return Integer.valueOf(-k);
        }
    }

    static 
    {
        asciiDigits = new byte[128];
        Arrays.fill(asciiDigits, (byte)-1);
        for (int i = 0; i <= 9; i++)
        {
            asciiDigits[i + 48] = (byte)i;
        }

        for (int j = 0; j <= 26; j++)
        {
            asciiDigits[j + 65] = (byte)(j + 10);
            asciiDigits[j + 97] = (byte)(j + 10);
        }

    }


}
