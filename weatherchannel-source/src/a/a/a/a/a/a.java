// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a;

import java.util.Comparator;

public class a
{

    private int a;

    public a()
    {
        a = 0;
    }

    public int a()
    {
        return a;
    }

    public a a(byte byte0, byte byte1)
    {
        if (a != 0)
        {
            return this;
        }
        if (byte0 < byte1)
        {
            byte0 = -1;
        } else
        if (byte0 > byte1)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        a = byte0;
        return this;
    }

    public a a(char c, char c1)
    {
        if (a != 0)
        {
            return this;
        }
        if (c < c1)
        {
            c = '\uFFFF';
        } else
        if (c > c1)
        {
            c = '\001';
        } else
        {
            c = '\0';
        }
        a = c;
        return this;
    }

    public a a(double d, double d1)
    {
        if (a != 0)
        {
            return this;
        } else
        {
            a = Double.compare(d, d1);
            return this;
        }
    }

    public a a(float f, float f1)
    {
        if (a != 0)
        {
            return this;
        } else
        {
            a = Float.compare(f, f1);
            return this;
        }
    }

    public a a(int i, int j)
    {
        if (a != 0)
        {
            return this;
        }
        if (i < j)
        {
            i = -1;
        } else
        if (i > j)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        a = i;
        return this;
    }

    public a a(long l, long l1)
    {
        if (a != 0)
        {
            return this;
        }
        int i;
        if (l < l1)
        {
            i = -1;
        } else
        if (l > l1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        a = i;
        return this;
    }

    public a a(Object obj, Object obj1)
    {
        return a(obj, obj1, null);
    }

    public a a(Object obj, Object obj1, Comparator comparator)
    {
        while (a != 0 || obj == obj1) 
        {
            return this;
        }
        if (obj == null)
        {
            a = -1;
            return this;
        }
        if (obj1 == null)
        {
            a = 1;
            return this;
        }
        if (obj.getClass().isArray())
        {
            if (obj instanceof long[])
            {
                a((long[])(long[])obj, (long[])(long[])obj1);
                return this;
            }
            if (obj instanceof int[])
            {
                a((int[])(int[])obj, (int[])(int[])obj1);
                return this;
            }
            if (obj instanceof short[])
            {
                a((short[])(short[])obj, (short[])(short[])obj1);
                return this;
            }
            if (obj instanceof char[])
            {
                a((char[])(char[])obj, (char[])(char[])obj1);
                return this;
            }
            if (obj instanceof byte[])
            {
                a((byte[])(byte[])obj, (byte[])(byte[])obj1);
                return this;
            }
            if (obj instanceof double[])
            {
                a((double[])(double[])obj, (double[])(double[])obj1);
                return this;
            }
            if (obj instanceof float[])
            {
                a((float[])(float[])obj, (float[])(float[])obj1);
                return this;
            }
            if (obj instanceof boolean[])
            {
                a((boolean[])(boolean[])obj, (boolean[])(boolean[])obj1);
                return this;
            } else
            {
                a((Object[])(Object[])obj, (Object[])(Object[])obj1, comparator);
                return this;
            }
        }
        if (comparator == null)
        {
            a = ((Comparable)obj).compareTo(obj1);
            return this;
        } else
        {
            a = comparator.compare(obj, obj1);
            return this;
        }
    }

    public a a(short word0, short word1)
    {
        if (a != 0)
        {
            return this;
        }
        if (word0 < word1)
        {
            word0 = -1;
        } else
        if (word0 > word1)
        {
            word0 = 1;
        } else
        {
            word0 = 0;
        }
        a = word0;
        return this;
    }

    public a a(boolean flag, boolean flag1)
    {
        while (a != 0 || flag == flag1) 
        {
            return this;
        }
        if (!flag)
        {
            a = -1;
            return this;
        } else
        {
            a = 1;
            return this;
        }
    }

    public a a(byte abyte0[], byte abyte1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (a == 0 && abyte0 != abyte1)
        {
            if (abyte0 == null)
            {
                a = -1;
                return this;
            }
            if (abyte1 == null)
            {
                a = 1;
                return this;
            }
            if (abyte0.length != abyte1.length)
            {
                if (abyte0.length >= abyte1.length)
                {
                    i = 1;
                }
                a = i;
                return this;
            }
            i = 0;
            while (i < abyte0.length && a == 0) 
            {
                a(abyte0[i], abyte1[i]);
                i++;
            }
        }
        return this;
    }

    public a a(char ac[], char ac1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (a == 0 && ac != ac1)
        {
            if (ac == null)
            {
                a = -1;
                return this;
            }
            if (ac1 == null)
            {
                a = 1;
                return this;
            }
            if (ac.length != ac1.length)
            {
                if (ac.length >= ac1.length)
                {
                    i = 1;
                }
                a = i;
                return this;
            }
            i = 0;
            while (i < ac.length && a == 0) 
            {
                a(ac[i], ac1[i]);
                i++;
            }
        }
        return this;
    }

    public a a(double ad[], double ad1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (a == 0 && ad != ad1)
        {
            if (ad == null)
            {
                a = -1;
                return this;
            }
            if (ad1 == null)
            {
                a = 1;
                return this;
            }
            if (ad.length != ad1.length)
            {
                if (ad.length >= ad1.length)
                {
                    i = 1;
                }
                a = i;
                return this;
            }
            i = 0;
            while (i < ad.length && a == 0) 
            {
                a(ad[i], ad1[i]);
                i++;
            }
        }
        return this;
    }

    public a a(float af[], float af1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (a == 0 && af != af1)
        {
            if (af == null)
            {
                a = -1;
                return this;
            }
            if (af1 == null)
            {
                a = 1;
                return this;
            }
            if (af.length != af1.length)
            {
                if (af.length >= af1.length)
                {
                    i = 1;
                }
                a = i;
                return this;
            }
            i = 0;
            while (i < af.length && a == 0) 
            {
                a(af[i], af1[i]);
                i++;
            }
        }
        return this;
    }

    public a a(int ai[], int ai1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (a == 0 && ai != ai1)
        {
            if (ai == null)
            {
                a = -1;
                return this;
            }
            if (ai1 == null)
            {
                a = 1;
                return this;
            }
            if (ai.length != ai1.length)
            {
                if (ai.length >= ai1.length)
                {
                    i = 1;
                }
                a = i;
                return this;
            }
            i = 0;
            while (i < ai.length && a == 0) 
            {
                a(ai[i], ai1[i]);
                i++;
            }
        }
        return this;
    }

    public a a(long al[], long al1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (a == 0 && al != al1)
        {
            if (al == null)
            {
                a = -1;
                return this;
            }
            if (al1 == null)
            {
                a = 1;
                return this;
            }
            if (al.length != al1.length)
            {
                if (al.length >= al1.length)
                {
                    i = 1;
                }
                a = i;
                return this;
            }
            i = 0;
            while (i < al.length && a == 0) 
            {
                a(al[i], al1[i]);
                i++;
            }
        }
        return this;
    }

    public a a(Object aobj[], Object aobj1[], Comparator comparator)
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_3;
        if (a == 0 && aobj != aobj1)
        {
            if (aobj == null)
            {
                a = -1;
                return this;
            }
            if (aobj1 == null)
            {
                a = 1;
                return this;
            }
            if (aobj.length != aobj1.length)
            {
                if (aobj.length >= aobj1.length)
                {
                    i = 1;
                }
                a = i;
                return this;
            }
            i = 0;
            while (i < aobj.length && a == 0) 
            {
                a(aobj[i], aobj1[i], comparator);
                i++;
            }
        }
        return this;
    }

    public a a(short aword0[], short aword1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (a == 0 && aword0 != aword1)
        {
            if (aword0 == null)
            {
                a = -1;
                return this;
            }
            if (aword1 == null)
            {
                a = 1;
                return this;
            }
            if (aword0.length != aword1.length)
            {
                if (aword0.length >= aword1.length)
                {
                    i = 1;
                }
                a = i;
                return this;
            }
            i = 0;
            while (i < aword0.length && a == 0) 
            {
                a(aword0[i], aword1[i]);
                i++;
            }
        }
        return this;
    }

    public a a(boolean aflag[], boolean aflag1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (a == 0 && aflag != aflag1)
        {
            if (aflag == null)
            {
                a = -1;
                return this;
            }
            if (aflag1 == null)
            {
                a = 1;
                return this;
            }
            if (aflag.length != aflag1.length)
            {
                if (aflag.length >= aflag1.length)
                {
                    i = 1;
                }
                a = i;
                return this;
            }
            i = 0;
            while (i < aflag.length && a == 0) 
            {
                a(aflag[i], aflag1[i]);
                i++;
            }
        }
        return this;
    }
}
