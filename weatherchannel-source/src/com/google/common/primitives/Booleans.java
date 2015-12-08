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

public final class Booleans
{
    private static class BooleanArrayAsList extends AbstractList
        implements RandomAccess, Serializable
    {

        private static final long serialVersionUID = 0L;
        final boolean array[];
        final int end;
        final int start;

        public boolean contains(Object obj)
        {
            return (obj instanceof Boolean) && Booleans.indexOf(array, ((Boolean)obj).booleanValue(), start, end) != -1;
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof BooleanArrayAsList)
                {
                    obj = (BooleanArrayAsList)obj;
                    int j = size();
                    if (((BooleanArrayAsList) (obj)).size() != j)
                    {
                        return false;
                    }
                    int i = 0;
                    while (i < j) 
                    {
                        if (array[start + i] != ((BooleanArrayAsList) (obj)).array[((BooleanArrayAsList) (obj)).start + i])
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

        public Boolean get(int i)
        {
            Preconditions.checkElementIndex(i, size());
            return Boolean.valueOf(array[start + i]);
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
                j = j * 31 + Booleans.hashCode(array[i]);
            }

            return j;
        }

        public int indexOf(Object obj)
        {
            if (obj instanceof Boolean)
            {
                int i = Booleans.indexOf(array, ((Boolean)obj).booleanValue(), start, end);
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
            if (obj instanceof Boolean)
            {
                int i = Booleans.lastIndexOf(array, ((Boolean)obj).booleanValue(), start, end);
                if (i >= 0)
                {
                    return i - start;
                }
            }
            return -1;
        }

        public Boolean set(int i, Boolean boolean1)
        {
            Preconditions.checkElementIndex(i, size());
            boolean flag = array[start + i];
            array[start + i] = ((Boolean)Preconditions.checkNotNull(boolean1)).booleanValue();
            return Boolean.valueOf(flag);
        }

        public volatile Object set(int i, Object obj)
        {
            return set(i, (Boolean)obj);
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
                return new BooleanArrayAsList(array, start + i, start + j);
            }
        }

        boolean[] toBooleanArray()
        {
            int i = size();
            boolean aflag[] = new boolean[i];
            System.arraycopy(array, start, aflag, 0, i);
            return aflag;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(size() * 7);
            String s;
            int i;
            if (array[start])
            {
                s = "[true";
            } else
            {
                s = "[false";
            }
            stringbuilder.append(s);
            i = start + 1;
            while (i < end) 
            {
                if (array[i])
                {
                    s = ", true";
                } else
                {
                    s = ", false";
                }
                stringbuilder.append(s);
                i++;
            }
            return stringbuilder.append(']').toString();
        }

        BooleanArrayAsList(boolean aflag[])
        {
            this(aflag, 0, aflag.length);
        }

        BooleanArrayAsList(boolean aflag[], int i, int j)
        {
            array = aflag;
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
            return (LexicographicalComparator)Enum.valueOf(com/google/common/primitives/Booleans$LexicographicalComparator, s);
        }

        public static LexicographicalComparator[] values()
        {
            return (LexicographicalComparator[])$VALUES.clone();
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((boolean[])obj, (boolean[])obj1);
        }

        public int compare(boolean aflag[], boolean aflag1[])
        {
            int j = Math.min(aflag.length, aflag1.length);
            for (int i = 0; i < j; i++)
            {
                int k = Booleans.compare(aflag[i], aflag1[i]);
                if (k != 0)
                {
                    return k;
                }
            }

            return aflag.length - aflag1.length;
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


    private Booleans()
    {
    }

    public static transient List asList(boolean aflag[])
    {
        if (aflag.length == 0)
        {
            return Collections.emptyList();
        } else
        {
            return new BooleanArrayAsList(aflag);
        }
    }

    public static int compare(boolean flag, boolean flag1)
    {
        if (flag == flag1)
        {
            return 0;
        }
        return !flag ? -1 : 1;
    }

    public static transient boolean[] concat(boolean aflag[][])
    {
        int k = 0;
        int l = aflag.length;
        for (int i = 0; i < l; i++)
        {
            k += aflag[i].length;
        }

        boolean aflag1[] = new boolean[k];
        k = 0;
        l = aflag.length;
        for (int j = 0; j < l; j++)
        {
            boolean aflag2[] = aflag[j];
            System.arraycopy(aflag2, 0, aflag1, k, aflag2.length);
            k += aflag2.length;
        }

        return aflag1;
    }

    public static boolean contains(boolean aflag[], boolean flag)
    {
        int j = aflag.length;
        for (int i = 0; i < j; i++)
        {
            if (aflag[i] == flag)
            {
                return true;
            }
        }

        return false;
    }

    private static boolean[] copyOf(boolean aflag[], int i)
    {
        boolean aflag1[] = new boolean[i];
        System.arraycopy(aflag, 0, aflag1, 0, Math.min(aflag.length, i));
        return aflag1;
    }

    public static transient int countTrue(boolean aflag[])
    {
        int j = 0;
        int l = aflag.length;
        for (int i = 0; i < l;)
        {
            int k = j;
            if (aflag[i])
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        return j;
    }

    public static boolean[] ensureCapacity(boolean aflag[], int i, int j)
    {
        boolean aflag1[];
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
        aflag1 = aflag;
        if (aflag.length < i)
        {
            aflag1 = copyOf(aflag, i + j);
        }
        return aflag1;
    }

    public static int hashCode(boolean flag)
    {
        return !flag ? 1237 : 1231;
    }

    public static int indexOf(boolean aflag[], boolean flag)
    {
        return indexOf(aflag, flag, 0, aflag.length);
    }

    private static int indexOf(boolean aflag[], boolean flag, int i, int j)
    {
        for (; i < j; i++)
        {
            if (aflag[i] == flag)
            {
                return i;
            }
        }

        return -1;
    }

    public static int indexOf(boolean aflag[], boolean aflag1[])
    {
        Preconditions.checkNotNull(aflag, "array");
        Preconditions.checkNotNull(aflag1, "target");
        if (aflag1.length != 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i;
        int k;
        for (i = 0; i >= (aflag.length - aflag1.length) + 1;)
        {
            break MISSING_BLOCK_LABEL_77;
        }

        k = 0;
_L5:
        j = i;
        if (k >= aflag1.length) goto _L4; else goto _L3
_L3:
label0:
        {
            if (aflag[i + k] == aflag1[k])
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

    public static transient String join(String s, boolean aflag[])
    {
        Preconditions.checkNotNull(s);
        if (aflag.length == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(aflag.length * 7);
        stringbuilder.append(aflag[0]);
        for (int i = 1; i < aflag.length; i++)
        {
            stringbuilder.append(s).append(aflag[i]);
        }

        return stringbuilder.toString();
    }

    public static int lastIndexOf(boolean aflag[], boolean flag)
    {
        return lastIndexOf(aflag, flag, 0, aflag.length);
    }

    private static int lastIndexOf(boolean aflag[], boolean flag, int i, int j)
    {
        for (j--; j >= i; j--)
        {
            if (aflag[j] == flag)
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

    public static boolean[] toArray(Collection collection)
    {
        if (!(collection instanceof BooleanArrayAsList)) goto _L2; else goto _L1
_L1:
        collection = ((BooleanArrayAsList)collection).toBooleanArray();
_L4:
        return collection;
_L2:
        Object aobj[] = collection.toArray();
        int j = aobj.length;
        boolean aflag[] = new boolean[j];
        int i = 0;
        do
        {
            collection = aflag;
            if (i >= j)
            {
                continue;
            }
            aflag[i] = ((Boolean)Preconditions.checkNotNull(aobj[i])).booleanValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }


}
