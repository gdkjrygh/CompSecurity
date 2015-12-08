// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class Bytes
{
    private static class ByteArrayAsList extends AbstractList
        implements RandomAccess, Serializable
    {

        private static final long serialVersionUID = 0L;
        final byte array[];
        final int end;
        final int start;

        public boolean contains(Object obj)
        {
            return (obj instanceof Byte) && Bytes.indexOf(array, ((Byte)obj).byteValue(), start, end) != -1;
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof ByteArrayAsList)
                {
                    obj = (ByteArrayAsList)obj;
                    int j = size();
                    if (((ByteArrayAsList) (obj)).size() != j)
                    {
                        return false;
                    }
                    int i = 0;
                    while (i < j) 
                    {
                        if (array[start + i] != ((ByteArrayAsList) (obj)).array[((ByteArrayAsList) (obj)).start + i])
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

        public Byte get(int i)
        {
            Preconditions.checkElementIndex(i, size());
            return Byte.valueOf(array[start + i]);
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
                j = j * 31 + Bytes.hashCode(array[i]);
            }

            return j;
        }

        public int indexOf(Object obj)
        {
            if (obj instanceof Byte)
            {
                int i = Bytes.indexOf(array, ((Byte)obj).byteValue(), start, end);
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
            if (obj instanceof Byte)
            {
                int i = Bytes.lastIndexOf(array, ((Byte)obj).byteValue(), start, end);
                if (i >= 0)
                {
                    return i - start;
                }
            }
            return -1;
        }

        public Byte set(int i, Byte byte1)
        {
            Preconditions.checkElementIndex(i, size());
            byte byte0 = array[start + i];
            array[start + i] = ((Byte)Preconditions.checkNotNull(byte1)).byteValue();
            return Byte.valueOf(byte0);
        }

        public volatile Object set(int i, Object obj)
        {
            return set(i, (Byte)obj);
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
                return new ByteArrayAsList(array, start + i, start + j);
            }
        }

        byte[] toByteArray()
        {
            int i = size();
            byte abyte0[] = new byte[i];
            System.arraycopy(array, start, abyte0, 0, i);
            return abyte0;
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

        ByteArrayAsList(byte abyte0[])
        {
            this(abyte0, 0, abyte0.length);
        }

        ByteArrayAsList(byte abyte0[], int i, int j)
        {
            array = abyte0;
            start = i;
            end = j;
        }
    }


    private Bytes()
    {
    }

    public static transient List asList(byte abyte0[])
    {
        if (abyte0.length == 0)
        {
            return Collections.emptyList();
        } else
        {
            return new ByteArrayAsList(abyte0);
        }
    }

    public static transient byte[] concat(byte abyte0[][])
    {
        int k = 0;
        int l = abyte0.length;
        for (int i = 0; i < l; i++)
        {
            k += abyte0[i].length;
        }

        byte abyte1[] = new byte[k];
        k = 0;
        l = abyte0.length;
        for (int j = 0; j < l; j++)
        {
            byte abyte2[] = abyte0[j];
            System.arraycopy(abyte2, 0, abyte1, k, abyte2.length);
            k += abyte2.length;
        }

        return abyte1;
    }

    public static boolean contains(byte abyte0[], byte byte0)
    {
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            if (abyte0[i] == byte0)
            {
                return true;
            }
        }

        return false;
    }

    private static byte[] copyOf(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, Math.min(abyte0.length, i));
        return abyte1;
    }

    public static byte[] ensureCapacity(byte abyte0[], int i, int j)
    {
        byte abyte1[];
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
        abyte1 = abyte0;
        if (abyte0.length < i)
        {
            abyte1 = copyOf(abyte0, i + j);
        }
        return abyte1;
    }

    public static int hashCode(byte byte0)
    {
        return byte0;
    }

    public static int indexOf(byte abyte0[], byte byte0)
    {
        return indexOf(abyte0, byte0, 0, abyte0.length);
    }

    private static int indexOf(byte abyte0[], byte byte0, int i, int j)
    {
        for (; i < j; i++)
        {
            if (abyte0[i] == byte0)
            {
                return i;
            }
        }

        return -1;
    }

    public static int indexOf(byte abyte0[], byte abyte1[])
    {
        Preconditions.checkNotNull(abyte0, "array");
        Preconditions.checkNotNull(abyte1, "target");
        if (abyte1.length != 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i;
        int k;
        for (i = 0; i >= (abyte0.length - abyte1.length) + 1;)
        {
            break MISSING_BLOCK_LABEL_77;
        }

        k = 0;
_L5:
        j = i;
        if (k >= abyte1.length) goto _L4; else goto _L3
_L3:
label0:
        {
            if (abyte0[i + k] == abyte1[k])
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

    public static int lastIndexOf(byte abyte0[], byte byte0)
    {
        return lastIndexOf(abyte0, byte0, 0, abyte0.length);
    }

    private static int lastIndexOf(byte abyte0[], byte byte0, int i, int j)
    {
        for (j--; j >= i; j--)
        {
            if (abyte0[j] == byte0)
            {
                return j;
            }
        }

        return -1;
    }

    public static byte[] toArray(Collection collection)
    {
        if (!(collection instanceof ByteArrayAsList)) goto _L2; else goto _L1
_L1:
        collection = ((ByteArrayAsList)collection).toByteArray();
_L4:
        return collection;
_L2:
        Object aobj[] = collection.toArray();
        int j = aobj.length;
        byte abyte0[] = new byte[j];
        int i = 0;
        do
        {
            collection = abyte0;
            if (i >= j)
            {
                continue;
            }
            abyte0[i] = ((Number)Preconditions.checkNotNull(aobj[i])).byteValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }


}
