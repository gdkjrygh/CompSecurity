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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.common.primitives:
//            Doubles

public final class Floats
{
    private static class FloatArrayAsList extends AbstractList
        implements RandomAccess, Serializable
    {

        private static final long serialVersionUID = 0L;
        final float array[];
        final int end;
        final int start;

        public boolean contains(Object obj)
        {
            return (obj instanceof Float) && Floats.indexOf(array, ((Float)obj).floatValue(), start, end) != -1;
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof FloatArrayAsList)
                {
                    obj = (FloatArrayAsList)obj;
                    int j = size();
                    if (((FloatArrayAsList) (obj)).size() != j)
                    {
                        return false;
                    }
                    int i = 0;
                    while (i < j) 
                    {
                        if (array[start + i] != ((FloatArrayAsList) (obj)).array[((FloatArrayAsList) (obj)).start + i])
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

        public Float get(int i)
        {
            Preconditions.checkElementIndex(i, size());
            return Float.valueOf(array[start + i]);
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
                j = j * 31 + Floats.hashCode(array[i]);
            }

            return j;
        }

        public int indexOf(Object obj)
        {
            if (obj instanceof Float)
            {
                int i = Floats.indexOf(array, ((Float)obj).floatValue(), start, end);
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
            if (obj instanceof Float)
            {
                int i = Floats.lastIndexOf(array, ((Float)obj).floatValue(), start, end);
                if (i >= 0)
                {
                    return i - start;
                }
            }
            return -1;
        }

        public Float set(int i, Float float1)
        {
            Preconditions.checkElementIndex(i, size());
            float f = array[start + i];
            array[start + i] = ((Float)Preconditions.checkNotNull(float1)).floatValue();
            return Float.valueOf(f);
        }

        public volatile Object set(int i, Object obj)
        {
            return set(i, (Float)obj);
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
                return new FloatArrayAsList(array, start + i, start + j);
            }
        }

        float[] toFloatArray()
        {
            int i = size();
            float af[] = new float[i];
            System.arraycopy(array, start, af, 0, i);
            return af;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(size() * 12);
            stringbuilder.append('[').append(array[start]);
            for (int i = start + 1; i < end; i++)
            {
                stringbuilder.append(", ").append(array[i]);
            }

            return stringbuilder.append(']').toString();
        }

        FloatArrayAsList(float af[])
        {
            this(af, 0, af.length);
        }

        FloatArrayAsList(float af[], int i, int j)
        {
            array = af;
            start = i;
            end = j;
        }
    }

    private static final class FloatConverter extends Converter
        implements Serializable
    {

        static final FloatConverter INSTANCE = new FloatConverter();
        private static final long serialVersionUID = 1L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        protected volatile Object doBackward(Object obj)
        {
            return doBackward((Float)obj);
        }

        protected String doBackward(Float float1)
        {
            return float1.toString();
        }

        protected Float doForward(String s)
        {
            return Float.valueOf(s);
        }

        protected volatile Object doForward(Object obj)
        {
            return doForward((String)obj);
        }

        public String toString()
        {
            return "Floats.stringConverter()";
        }


        private FloatConverter()
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
            return (LexicographicalComparator)Enum.valueOf(com/google/common/primitives/Floats$LexicographicalComparator, s);
        }

        public static LexicographicalComparator[] values()
        {
            return (LexicographicalComparator[])$VALUES.clone();
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((float[])obj, (float[])obj1);
        }

        public int compare(float af[], float af1[])
        {
            int j = Math.min(af.length, af1.length);
            for (int i = 0; i < j; i++)
            {
                int k = Float.compare(af[i], af1[i]);
                if (k != 0)
                {
                    return k;
                }
            }

            return af.length - af1.length;
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

    private Floats()
    {
    }

    public static transient List asList(float af[])
    {
        if (af.length == 0)
        {
            return Collections.emptyList();
        } else
        {
            return new FloatArrayAsList(af);
        }
    }

    public static int compare(float f, float f1)
    {
        return Float.compare(f, f1);
    }

    public static transient float[] concat(float af[][])
    {
        int k = 0;
        int l = af.length;
        for (int i = 0; i < l; i++)
        {
            k += af[i].length;
        }

        float af1[] = new float[k];
        k = 0;
        l = af.length;
        for (int j = 0; j < l; j++)
        {
            float af2[] = af[j];
            System.arraycopy(af2, 0, af1, k, af2.length);
            k += af2.length;
        }

        return af1;
    }

    public static boolean contains(float af[], float f)
    {
        int j = af.length;
        for (int i = 0; i < j; i++)
        {
            if (af[i] == f)
            {
                return true;
            }
        }

        return false;
    }

    private static float[] copyOf(float af[], int i)
    {
        float af1[] = new float[i];
        System.arraycopy(af, 0, af1, 0, Math.min(af.length, i));
        return af1;
    }

    public static float[] ensureCapacity(float af[], int i, int j)
    {
        float af1[];
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
        af1 = af;
        if (af.length < i)
        {
            af1 = copyOf(af, i + j);
        }
        return af1;
    }

    public static int hashCode(float f)
    {
        return Float.valueOf(f).hashCode();
    }

    public static int indexOf(float af[], float f)
    {
        return indexOf(af, f, 0, af.length);
    }

    private static int indexOf(float af[], float f, int i, int j)
    {
        for (; i < j; i++)
        {
            if (af[i] == f)
            {
                return i;
            }
        }

        return -1;
    }

    public static int indexOf(float af[], float af1[])
    {
        Preconditions.checkNotNull(af, "array");
        Preconditions.checkNotNull(af1, "target");
        if (af1.length != 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i;
        int k;
        for (i = 0; i >= (af.length - af1.length) + 1;)
        {
            break MISSING_BLOCK_LABEL_78;
        }

        k = 0;
_L5:
        j = i;
        if (k >= af1.length) goto _L4; else goto _L3
_L3:
label0:
        {
            if (af[i + k] == af1[k])
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

    public static boolean isFinite(float f)
    {
        boolean flag1 = true;
        boolean flag;
        if ((-1.0F / 0.0F) < f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f >= (1.0F / 0.0F))
        {
            flag1 = false;
        }
        return flag1 & flag;
    }

    public static transient String join(String s, float af[])
    {
        Preconditions.checkNotNull(s);
        if (af.length == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(af.length * 12);
        stringbuilder.append(af[0]);
        for (int i = 1; i < af.length; i++)
        {
            stringbuilder.append(s).append(af[i]);
        }

        return stringbuilder.toString();
    }

    public static int lastIndexOf(float af[], float f)
    {
        return lastIndexOf(af, f, 0, af.length);
    }

    private static int lastIndexOf(float af[], float f, int i, int j)
    {
        for (j--; j >= i; j--)
        {
            if (af[j] == f)
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

    public static transient float max(float af[])
    {
        float f;
        boolean flag;
        if (af.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        f = af[0];
        for (int i = 1; i < af.length; i++)
        {
            f = Math.max(f, af[i]);
        }

        return f;
    }

    public static transient float min(float af[])
    {
        float f;
        boolean flag;
        if (af.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        f = af[0];
        for (int i = 1; i < af.length; i++)
        {
            f = Math.min(f, af[i]);
        }

        return f;
    }

    public static Converter stringConverter()
    {
        return FloatConverter.INSTANCE;
    }

    public static float[] toArray(Collection collection)
    {
        if (!(collection instanceof FloatArrayAsList)) goto _L2; else goto _L1
_L1:
        collection = ((FloatArrayAsList)collection).toFloatArray();
_L4:
        return collection;
_L2:
        Object aobj[] = collection.toArray();
        int j = aobj.length;
        float af[] = new float[j];
        int i = 0;
        do
        {
            collection = af;
            if (i >= j)
            {
                continue;
            }
            af[i] = ((Number)Preconditions.checkNotNull(aobj[i])).floatValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Float tryParse(String s)
    {
        if (!Doubles.FLOATING_POINT_PATTERN.matcher(s).matches())
        {
            break MISSING_BLOCK_LABEL_24;
        }
        float f = Float.parseFloat(s);
        return Float.valueOf(f);
        s;
        return null;
    }


}
