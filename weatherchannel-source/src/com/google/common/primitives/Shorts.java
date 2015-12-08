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

public final class Shorts
{
    private static final class LexicographicalComparator extends Enum
        implements Comparator
    {

        private static final LexicographicalComparator $VALUES[];
        public static final LexicographicalComparator INSTANCE;

        public static LexicographicalComparator valueOf(String s)
        {
            return (LexicographicalComparator)Enum.valueOf(com/google/common/primitives/Shorts$LexicographicalComparator, s);
        }

        public static LexicographicalComparator[] values()
        {
            return (LexicographicalComparator[])$VALUES.clone();
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((short[])obj, (short[])obj1);
        }

        public int compare(short aword0[], short aword1[])
        {
            int j = Math.min(aword0.length, aword1.length);
            for (int i = 0; i < j; i++)
            {
                int k = Shorts.compare(aword0[i], aword1[i]);
                if (k != 0)
                {
                    return k;
                }
            }

            return aword0.length - aword1.length;
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

    private static class ShortArrayAsList extends AbstractList
        implements RandomAccess, Serializable
    {

        private static final long serialVersionUID = 0L;
        final short array[];
        final int end;
        final int start;

        public boolean contains(Object obj)
        {
            return (obj instanceof Short) && Shorts.indexOf(array, ((Short)obj).shortValue(), start, end) != -1;
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof ShortArrayAsList)
                {
                    obj = (ShortArrayAsList)obj;
                    int j = size();
                    if (((ShortArrayAsList) (obj)).size() != j)
                    {
                        return false;
                    }
                    int i = 0;
                    while (i < j) 
                    {
                        if (array[start + i] != ((ShortArrayAsList) (obj)).array[((ShortArrayAsList) (obj)).start + i])
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

        public volatile Object get(int i)
        {
            return get(i);
        }

        public Short get(int i)
        {
            Preconditions.checkElementIndex(i, size());
            return Short.valueOf(array[start + i]);
        }

        public int hashCode()
        {
            int j = 1;
            for (int i = start; i < end; i++)
            {
                j = j * 31 + Shorts.hashCode(array[i]);
            }

            return j;
        }

        public int indexOf(Object obj)
        {
            if (obj instanceof Short)
            {
                int i = Shorts.indexOf(array, ((Short)obj).shortValue(), start, end);
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
            if (obj instanceof Short)
            {
                int i = Shorts.lastIndexOf(array, ((Short)obj).shortValue(), start, end);
                if (i >= 0)
                {
                    return i - start;
                }
            }
            return -1;
        }

        public volatile Object set(int i, Object obj)
        {
            return set(i, (Short)obj);
        }

        public Short set(int i, Short short1)
        {
            Preconditions.checkElementIndex(i, size());
            short word0 = array[start + i];
            array[start + i] = ((Short)Preconditions.checkNotNull(short1)).shortValue();
            return Short.valueOf(word0);
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
                return new ShortArrayAsList(array, start + i, start + j);
            }
        }

        short[] toShortArray()
        {
            int i = size();
            short aword0[] = new short[i];
            System.arraycopy(array, start, aword0, 0, i);
            return aword0;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(size() * 6);
            stringbuilder.append('[').append(array[start]);
            for (int i = start + 1; i < end; i++)
            {
                stringbuilder.append(", ").append(array[i]);
            }

            return stringbuilder.append(']').toString();
        }

        ShortArrayAsList(short aword0[])
        {
            this(aword0, 0, aword0.length);
        }

        ShortArrayAsList(short aword0[], int i, int j)
        {
            array = aword0;
            start = i;
            end = j;
        }
    }

    private static final class ShortConverter extends Converter
        implements Serializable
    {

        static final ShortConverter INSTANCE = new ShortConverter();
        private static final long serialVersionUID = 1L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        protected volatile Object doBackward(Object obj)
        {
            return doBackward((Short)obj);
        }

        protected String doBackward(Short short1)
        {
            return short1.toString();
        }

        protected volatile Object doForward(Object obj)
        {
            return doForward((String)obj);
        }

        protected Short doForward(String s)
        {
            return Short.decode(s);
        }

        public String toString()
        {
            return "Shorts.stringConverter()";
        }


        private ShortConverter()
        {
        }
    }


    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    private Shorts()
    {
    }

    public static transient List asList(short aword0[])
    {
        if (aword0.length == 0)
        {
            return Collections.emptyList();
        } else
        {
            return new ShortArrayAsList(aword0);
        }
    }

    public static short checkedCast(long l)
    {
        short word0 = (short)(int)l;
        if ((long)word0 != l)
        {
            throw new IllegalArgumentException((new StringBuilder(34)).append("Out of range: ").append(l).toString());
        } else
        {
            return word0;
        }
    }

    public static int compare(short word0, short word1)
    {
        return word0 - word1;
    }

    public static transient short[] concat(short aword0[][])
    {
        int k = 0;
        int l = aword0.length;
        for (int i = 0; i < l; i++)
        {
            k += aword0[i].length;
        }

        short aword1[] = new short[k];
        k = 0;
        l = aword0.length;
        for (int j = 0; j < l; j++)
        {
            short aword2[] = aword0[j];
            System.arraycopy(aword2, 0, aword1, k, aword2.length);
            k += aword2.length;
        }

        return aword1;
    }

    public static boolean contains(short aword0[], short word0)
    {
        int j = aword0.length;
        for (int i = 0; i < j; i++)
        {
            if (aword0[i] == word0)
            {
                return true;
            }
        }

        return false;
    }

    private static short[] copyOf(short aword0[], int i)
    {
        short aword1[] = new short[i];
        System.arraycopy(aword0, 0, aword1, 0, Math.min(aword0.length, i));
        return aword1;
    }

    public static short[] ensureCapacity(short aword0[], int i, int j)
    {
        short aword1[];
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
        aword1 = aword0;
        if (aword0.length < i)
        {
            aword1 = copyOf(aword0, i + j);
        }
        return aword1;
    }

    public static short fromByteArray(byte abyte0[])
    {
        boolean flag;
        if (abyte0.length >= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "array too small: %s < %s", new Object[] {
            Integer.valueOf(abyte0.length), Integer.valueOf(2)
        });
        return fromBytes(abyte0[0], abyte0[1]);
    }

    public static short fromBytes(byte byte0, byte byte1)
    {
        return (short)(byte0 << 8 | byte1 & 0xff);
    }

    public static int hashCode(short word0)
    {
        return word0;
    }

    public static int indexOf(short aword0[], short word0)
    {
        return indexOf(aword0, word0, 0, aword0.length);
    }

    private static int indexOf(short aword0[], short word0, int i, int j)
    {
        for (; i < j; i++)
        {
            if (aword0[i] == word0)
            {
                return i;
            }
        }

        return -1;
    }

    public static int indexOf(short aword0[], short aword1[])
    {
        Preconditions.checkNotNull(aword0, "array");
        Preconditions.checkNotNull(aword1, "target");
        if (aword1.length != 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i;
        int k;
        for (i = 0; i >= (aword0.length - aword1.length) + 1;)
        {
            break MISSING_BLOCK_LABEL_77;
        }

        k = 0;
_L5:
        j = i;
        if (k >= aword1.length) goto _L4; else goto _L3
_L3:
label0:
        {
            if (aword0[i + k] == aword1[k])
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

    public static transient String join(String s, short aword0[])
    {
        Preconditions.checkNotNull(s);
        if (aword0.length == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(aword0.length * 6);
        stringbuilder.append(aword0[0]);
        for (int i = 1; i < aword0.length; i++)
        {
            stringbuilder.append(s).append(aword0[i]);
        }

        return stringbuilder.toString();
    }

    public static int lastIndexOf(short aword0[], short word0)
    {
        return lastIndexOf(aword0, word0, 0, aword0.length);
    }

    private static int lastIndexOf(short aword0[], short word0, int i, int j)
    {
        for (j--; j >= i; j--)
        {
            if (aword0[j] == word0)
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

    public static transient short max(short aword0[])
    {
        short word0;
        boolean flag;
        if (aword0.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        word0 = aword0[0];
        for (int i = 1; i < aword0.length;)
        {
            short word1 = word0;
            if (aword0[i] > word0)
            {
                word1 = aword0[i];
            }
            i++;
            word0 = word1;
        }

        return word0;
    }

    public static transient short min(short aword0[])
    {
        short word0;
        boolean flag;
        if (aword0.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        word0 = aword0[0];
        for (int i = 1; i < aword0.length;)
        {
            short word1 = word0;
            if (aword0[i] < word0)
            {
                word1 = aword0[i];
            }
            i++;
            word0 = word1;
        }

        return word0;
    }

    public static short saturatedCast(long l)
    {
        if (l > 32767L)
        {
            return 32767;
        }
        if (l < -32768L)
        {
            return -32768;
        } else
        {
            return (short)(int)l;
        }
    }

    public static Converter stringConverter()
    {
        return ShortConverter.INSTANCE;
    }

    public static short[] toArray(Collection collection)
    {
        if (!(collection instanceof ShortArrayAsList)) goto _L2; else goto _L1
_L1:
        collection = ((ShortArrayAsList)collection).toShortArray();
_L4:
        return collection;
_L2:
        Object aobj[] = collection.toArray();
        int j = aobj.length;
        short aword0[] = new short[j];
        int i = 0;
        do
        {
            collection = aword0;
            if (i >= j)
            {
                continue;
            }
            aword0[i] = ((Number)Preconditions.checkNotNull(aobj[i])).shortValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] toByteArray(short word0)
    {
        return (new byte[] {
            (byte)(word0 >> 8), (byte)word0
        });
    }


}
