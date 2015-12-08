// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


// Referenced classes of package com.vladium.util:
//            WCMatcher

private static final class m_patternLength extends WCMatcher
{

    private final char m_pattern[];
    private final int m_patternLength;

    public final boolean matches(String s)
    {
        char ac[];
        int i;
        int j;
        boolean flag;
        int l;
        int i1;
        if (s == null)
        {
            throw new IllegalArgumentException("null input: s");
        }
        s = s.toCharArray();
        l = s.length;
        ac = m_pattern;
        i1 = m_patternLength;
        i = 0;
        j = 0;
        flag = false;
_L9:
        int k = 0;
_L5:
        if (j + k >= i1) goto _L2; else goto _L1
_L1:
        char c;
        int j1;
        c = ac[j + k];
        if (c == '*')
        {
            i += k;
            j += k + 1;
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        j1 = i + k;
        if (j1 != l) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        if (c != s[j1] && c != '?')
        {
            continue; /* Loop/switch isn't completed */
        }
        k++;
          goto _L5
        if (!flag) goto _L3; else goto _L6
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (i + k == l)
        {
            return true;
        }
        if (!flag) goto _L3; else goto _L7
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean matches(char ac[])
    {
        char ac1[];
        int i;
        int j;
        boolean flag;
        int l;
        int i1;
        if (ac == null)
        {
            throw new IllegalArgumentException("null input: string");
        }
        l = ac.length;
        ac1 = m_pattern;
        i1 = m_patternLength;
        i = 0;
        j = 0;
        flag = false;
_L9:
        int k = 0;
_L5:
        if (j + k >= i1) goto _L2; else goto _L1
_L1:
        char c;
        int j1;
        c = ac1[j + k];
        if (c == '*')
        {
            i += k;
            j += k + 1;
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        j1 = i + k;
        if (j1 != l) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        if (c != ac[j1] && c != '?')
        {
            continue; /* Loop/switch isn't completed */
        }
        k++;
          goto _L5
        if (!flag) goto _L3; else goto _L6
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (i + k == l)
        {
            return true;
        }
        if (!flag) goto _L3; else goto _L7
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    (char ac[], int i)
    {
        m_pattern = ac;
        m_patternLength = i;
    }
}
