// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


public final class ak
{

    public final int a;
    public final int b;
    public final int c;
    public final int d[];

    public ak(int i)
    {
        this(i, i);
    }

    public ak(int i, int j)
    {
        if (i <= 0 || j <= 0)
        {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        } else
        {
            a = i;
            b = j;
            c = i + 31 >> 5;
            d = new int[c * j];
            return;
        }
    }

    public final void a(int i, int j, int k, int l)
    {
        int i1;
        if (j < 0 || i < 0)
        {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (l <= 0 || k <= 0)
        {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        i1 = i + k;
        l = j + l;
        if (l > b || i1 > a)
        {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
_L3:
        if (j < l)
        {
            int j1 = c;
            k = i;
            while (k < i1) 
            {
                int ai[] = d;
                int k1 = (k >> 5) + j * j1;
                ai[k1] = ai[k1] | 1 << (k & 0x1f);
                k++;
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        j++;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public final boolean a(int i, int j)
    {
        int k = c;
        return (d[k * j + (i >> 5)] >>> (i & 0x1f) & 1) != 0;
    }

    public final int[] a()
    {
        int i;
        for (i = 0; i < d.length && d[i] == 0; i++) { }
        if (i == d.length)
        {
            return null;
        }
        int k = i / c;
        int l = c;
        int i1 = d[i];
        int j;
        for (j = 0; i1 << 31 - j == 0; j++) { }
        return (new int[] {
            (i % l << 5) + j, k
        });
    }

    public final void b(int i, int j)
    {
        j = c * j + (i >> 5);
        int ai[] = d;
        ai[j] = ai[j] | 1 << (i & 0x1f);
    }

    public final int[] b()
    {
        int i;
        for (i = d.length - 1; i >= 0 && d[i] == 0; i--) { }
        if (i < 0)
        {
            return null;
        }
        int k = i / c;
        int l = c;
        int i1 = d[i];
        int j;
        for (j = 31; i1 >>> j == 0; j--) { }
        return (new int[] {
            (i % l << 5) + j, k
        });
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ak) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (a == ((ak) (obj = (ak)obj)).a && b == ((ak) (obj)).b && c == ((ak) (obj)).c && d.length == ((ak) (obj)).d.length)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= d.length)
                    {
                        break label1;
                    }
                    if (d[i] != ((ak) (obj)).d[i])
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final int hashCode()
    {
        int i = a;
        int k = a;
        int l = b;
        k = c + ((i * 31 + k) * 31 + l) * 31;
        for (int j = 0; j < d.length; j++)
        {
            k = k * 31 + d[j];
        }

        return k;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(b * (a + 1));
        for (int i = 0; i < b; i++)
        {
            int j = 0;
            while (j < a) 
            {
                String s;
                if (a(j, i))
                {
                    s = "X ";
                } else
                {
                    s = "  ";
                }
                stringbuffer.append(s);
                j++;
            }
            stringbuffer.append('\n');
        }

        return stringbuffer.toString();
    }
}
