// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.escape;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.escape:
//            Escaper, Platform

public abstract class CharEscaper extends Escaper
{

    private static final int DEST_PAD_MULTIPLIER = 2;

    protected CharEscaper()
    {
    }

    private static char[] growBuffer(char ac[], int i, int j)
    {
        char ac1[] = new char[j];
        if (i > 0)
        {
            System.arraycopy(ac, 0, ac1, 0, i);
        }
        return ac1;
    }

    public String escape(String s)
    {
        Preconditions.checkNotNull(s);
        int j = s.length();
        int i = 0;
        do
        {
label0:
            {
                String s1 = s;
                if (i < j)
                {
                    if (escape(s.charAt(i)) == null)
                    {
                        break label0;
                    }
                    s1 = escapeSlow(s, i);
                }
                return s1;
            }
            i++;
        } while (true);
    }

    protected abstract char[] escape(char c);

    protected final String escapeSlow(String s, int i)
    {
        int j1 = s.length();
        char ac[] = Platform.charBufferFromThreadLocal();
        int j = ac.length;
        int k = 0;
        int i1 = 0;
        int l = i;
        i = k;
        while (l < j1) 
        {
            char ac3[] = escape(s.charAt(l));
            if (ac3 != null)
            {
                int k1 = ac3.length;
                int l1 = l - i1;
                int i2 = i + l1 + k1;
                char ac1[] = ac;
                k = j;
                if (j < i2)
                {
                    k = i2 + (j1 - l) * 2;
                    ac1 = growBuffer(ac, i, k);
                }
                j = i;
                if (l1 > 0)
                {
                    s.getChars(i1, l, ac1, i);
                    j = i + l1;
                }
                i = j;
                if (k1 > 0)
                {
                    System.arraycopy(ac3, 0, ac1, j, k1);
                    i = j + k1;
                }
                i1 = l + 1;
                ac = ac1;
                j = k;
            }
            l++;
        }
        l = j1 - i1;
        char ac2[] = ac;
        k = i;
        if (l > 0)
        {
            k = i + l;
            ac2 = ac;
            if (j < k)
            {
                ac2 = growBuffer(ac, i, k);
            }
            s.getChars(i1, j1, ac2, i);
        }
        return new String(ac2, 0, k);
    }
}
