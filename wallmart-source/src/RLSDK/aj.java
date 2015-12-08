// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


public final class aj
{

    public int a[];
    public int b;

    public aj()
    {
        b = 0;
        a = new int[1];
    }

    public aj(int i)
    {
        b = i;
        a = new int[i + 31 >> 5];
    }

    public final void a()
    {
        int ai[] = new int[a.length];
        int j = b;
        for (int i = 0; i < j; i++)
        {
            if (a(j - i - 1))
            {
                int k = i >> 5;
                ai[k] = ai[k] | 1 << (i & 0x1f);
            }
        }

        a = ai;
    }

    public final boolean a(int i)
    {
        return (a[i >> 5] & 1 << (i & 0x1f)) != 0;
    }

    public final boolean a(int i, int j)
    {
        int k;
        int k1;
        int l1;
        int i2;
        if (j < i)
        {
            throw new IllegalArgumentException();
        }
        if (j == i)
        {
            return true;
        }
        l1 = j - 1;
        k1 = i >> 5;
        i2 = l1 >> 5;
        k = k1;
_L6:
        int l;
        int j1;
        if (k > i2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k > k1)
        {
            j = 0;
        } else
        {
            j = i & 0x1f;
        }
        if (k < i2)
        {
            l = 31;
        } else
        {
            l = l1 & 0x1f;
        }
        if (j != 0 || l != 31) goto _L2; else goto _L1
_L1:
        j1 = -1;
_L4:
        if ((j1 & a[k]) != 0)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_144;
_L2:
        j1 = 0;
        int i1 = j;
        j = j1;
        do
        {
            j1 = j;
            if (i1 > l)
            {
                break;
            }
            j |= 1 << i1;
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        k++;
        if (true) goto _L6; else goto _L5
_L5:
        return true;
    }

    public final void b(int i)
    {
        int ai[] = a;
        int j = i >> 5;
        ai[j] = ai[j] | 1 << (i & 0x1f);
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(b);
        int i = 0;
        while (i < b) 
        {
            if ((i & 7) == 0)
            {
                stringbuffer.append(' ');
            }
            char c;
            if (a(i))
            {
                c = 'X';
            } else
            {
                c = '.';
            }
            stringbuffer.append(c);
            i++;
        }
        return stringbuffer.toString();
    }
}
