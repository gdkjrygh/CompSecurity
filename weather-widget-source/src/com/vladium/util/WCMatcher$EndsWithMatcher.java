// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


// Referenced classes of package com.vladium.util:
//            WCMatcher

private static final class m_suffix extends WCMatcher
{

    private final String m_suffix;
    private final char m_suffixChars[];

    public final boolean matches(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: s");
        } else
        {
            return s.endsWith(m_suffix);
        }
    }

    public final boolean matches(char ac[])
    {
        char ac1[];
        int j;
        int k;
        if (ac == null)
        {
            throw new IllegalArgumentException("null input: chars");
        }
        ac1 = m_suffixChars;
        j = ac1.length - 1;
        k = ac.length;
        if (k >= j) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (ac[k - 1 - i] != ac1[j - i])
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    (char ac[], int i)
    {
        m_suffixChars = ac;
        m_suffix = new String(ac, 1, i - 1);
    }
}
