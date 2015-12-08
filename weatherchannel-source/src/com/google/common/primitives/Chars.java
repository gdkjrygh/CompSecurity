// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

public final class Chars
{
    private static class CharArrayAsList extends AbstractList
        implements RandomAccess, Serializable
    {

        private static final long serialVersionUID = 0L;
        final char array[];
        final int end;
        final int start;

        public boolean contains(Object obj)
        {
            return (obj instanceof Character) && Chars.indexOf(array, ((Character)obj).charValue(), start, end) != -1;
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof CharArrayAsList)
                {
                    obj = (CharArrayAsList)obj;
                    int j = size();
                    if (((CharArrayAsList) (obj)).size() != j)
                    {
                        return false;
                    }
                    int i = 0;
                    while (i < j) 
                    {
                        if (array[start + i] != ((CharArrayAsList) (obj)).array[((CharArrayAsList) (obj)).start + i])
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

        public Character get(int i)
        {
            Preconditions.checkElementIndex(i, size());
            return Character.valueOf(array[start + i]);
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
                j = j * 31 + Chars.hashCode(array[i]);
            }

            return j;
        }

        public int indexOf(Object obj)
        {
            if (obj instanceof Character)
            {
                int i = Chars.indexOf(array, ((Character)obj).charValue(), start, end);
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
            if (obj instanceof Character)
            {
                int i = Chars.lastIndexOf(array, ((Character)obj).charValue(), start, end);
                if (i >= 0)
                {
                    return i - start;
                }
            }
            return -1;
        }

        public Character set(int i, Character character)
        {
            Preconditions.checkElementIndex(i, size());
            char c = array[start + i];
            array[start + i] = ((Character)Preconditions.checkNotNull(character)).charValue();
            return Character.valueOf(c);
        }

        public volatile Object set(int i, Object obj)
        {
            return set(i, (Character)obj);
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
                return new CharArrayAsList(array, start + i, start + j);
            }
        }

        char[] toCharArray()
        {
            int i = size();
            char ac[] = new char[i];
            System.arraycopy(array, start, ac, 0, i);
            return ac;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(size() * 3);
            stringbuilder.append('[').append(array[start]);
            for (int i = start + 1; i < end; i++)
            {
                stringbuilder.append(", ").append(array[i]);
            }

            return stringbuilder.append(']').toString();
        }

        CharArrayAsList(char ac[])
        {
            this(ac, 0, ac.length);
        }

        CharArrayAsList(char ac[], int i, int j)
        {
            array = ac;
            start = i;
            end = j;
        }
    }

    private static final class LexicographicalComparator extends Enum
        implements Comparator
    {

        private static final LexicographicalComparator $VALUES[];
        public static final LexicographicalComparator INSTANCE;

        public static LexicographicalComparator valueOf(String s)
        {
            return (LexicographicalComparator)Enum.valueOf(com/google/common/primitives/Chars$LexicographicalComparator, s);
        }

        public static LexicographicalComparator[] values()
        {
            return (LexicographicalComparator[])$VALUES.clone();
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((char[])obj, (char[])obj1);
        }

        public int compare(char ac[], char ac1[])
        {
            int j = Math.min(ac.length, ac1.length);
            for (int i = 0; i < j; i++)
            {
                int k = Chars.compare(ac[i], ac1[i]);
                if (k != 0)
                {
                    return k;
                }
            }

            return ac.length - ac1.length;
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


    public static final int BYTES = 2;

    private Chars()
    {
    }

    public static transient List asList(char ac[])
    {
        if (ac.length == 0)
        {
            return Collections.emptyList();
        } else
        {
            return new CharArrayAsList(ac);
        }
    }

    public static char checkedCast(long l)
    {
        char c = (char)(int)l;
        if ((long)c != l)
        {
            throw new IllegalArgumentException((new StringBuilder(34)).append("Out of range: ").append(l).toString());
        } else
        {
            return c;
        }
    }

    public static int compare(char c, char c1)
    {
        return c - c1;
    }

    public static transient char[] concat(char ac[][])
    {
        int k = 0;
        int l = ac.length;
        for (int i = 0; i < l; i++)
        {
            k += ac[i].length;
        }

        char ac1[] = new char[k];
        k = 0;
        l = ac.length;
        for (int j = 0; j < l; j++)
        {
            char ac2[] = ac[j];
            System.arraycopy(ac2, 0, ac1, k, ac2.length);
            k += ac2.length;
        }

        return ac1;
    }

    public static boolean contains(char ac[], char c)
    {
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            if (ac[i] == c)
            {
                return true;
            }
        }

        return false;
    }

    private static char[] copyOf(char ac[], int i)
    {
        char ac1[] = new char[i];
        System.arraycopy(ac, 0, ac1, 0, Math.min(ac.length, i));
        return ac1;
    }

    public static char[] ensureCapacity(char ac[], int i, int j)
    {
        char ac1[];
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
        ac1 = ac;
        if (ac.length < i)
        {
            ac1 = copyOf(ac, i + j);
        }
        return ac1;
    }

    public static char fromByteArray(byte abyte0[])
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

    public static char fromBytes(byte byte0, byte byte1)
    {
        return (char)(byte0 << 8 | byte1 & 0xff);
    }

    public static int hashCode(char c)
    {
        return c;
    }

    public static int indexOf(char ac[], char c)
    {
        return indexOf(ac, c, 0, ac.length);
    }

    private static int indexOf(char ac[], char c, int i, int j)
    {
        for (; i < j; i++)
        {
            if (ac[i] == c)
            {
                return i;
            }
        }

        return -1;
    }

    public static int indexOf(char ac[], char ac1[])
    {
        Preconditions.checkNotNull(ac, "array");
        Preconditions.checkNotNull(ac1, "target");
        if (ac1.length != 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i;
        int k;
        for (i = 0; i >= (ac.length - ac1.length) + 1;)
        {
            break MISSING_BLOCK_LABEL_77;
        }

        k = 0;
_L5:
        j = i;
        if (k >= ac1.length) goto _L4; else goto _L3
_L3:
label0:
        {
            if (ac[i + k] == ac1[k])
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

    public static transient String join(String s, char ac[])
    {
        Preconditions.checkNotNull(s);
        int j = ac.length;
        if (j == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(s.length() * (j - 1) + j);
        stringbuilder.append(ac[0]);
        for (int i = 1; i < j; i++)
        {
            stringbuilder.append(s).append(ac[i]);
        }

        return stringbuilder.toString();
    }

    public static int lastIndexOf(char ac[], char c)
    {
        return lastIndexOf(ac, c, 0, ac.length);
    }

    private static int lastIndexOf(char ac[], char c, int i, int j)
    {
        for (j--; j >= i; j--)
        {
            if (ac[j] == c)
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

    public static transient char max(char ac[])
    {
        char c;
        boolean flag;
        if (ac.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        c = ac[0];
        for (int i = 1; i < ac.length;)
        {
            char c1 = c;
            if (ac[i] > c)
            {
                c1 = ac[i];
            }
            i++;
            c = c1;
        }

        return c;
    }

    public static transient char min(char ac[])
    {
        char c;
        boolean flag;
        if (ac.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        c = ac[0];
        for (int i = 1; i < ac.length;)
        {
            char c1 = c;
            if (ac[i] < c)
            {
                c1 = ac[i];
            }
            i++;
            c = c1;
        }

        return c;
    }

    public static char saturatedCast(long l)
    {
        if (l > 65535L)
        {
            return '\uFFFF';
        }
        if (l < 0L)
        {
            return '\0';
        } else
        {
            return (char)(int)l;
        }
    }

    public static char[] toArray(Collection collection)
    {
        if (!(collection instanceof CharArrayAsList)) goto _L2; else goto _L1
_L1:
        collection = ((CharArrayAsList)collection).toCharArray();
_L4:
        return collection;
_L2:
        Object aobj[] = collection.toArray();
        int j = aobj.length;
        char ac[] = new char[j];
        int i = 0;
        do
        {
            collection = ac;
            if (i >= j)
            {
                continue;
            }
            ac[i] = ((Character)Preconditions.checkNotNull(aobj[i])).charValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] toByteArray(char c)
    {
        return (new byte[] {
            (byte)(c >> 8), (byte)c
        });
    }


}
