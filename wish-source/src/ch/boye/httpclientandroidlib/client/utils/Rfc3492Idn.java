// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.utils;

import java.util.StringTokenizer;

// Referenced classes of package ch.boye.httpclientandroidlib.client.utils:
//            Idn

public class Rfc3492Idn
    implements Idn
{

    private static final String ACE_PREFIX = "xn--";
    private static final int base = 36;
    private static final int damp = 700;
    private static final char delimiter = 45;
    private static final int initial_bias = 72;
    private static final int initial_n = 128;
    private static final int skew = 38;
    private static final int tmax = 26;
    private static final int tmin = 1;

    public Rfc3492Idn()
    {
    }

    private int adapt(int i, int j, boolean flag)
    {
        if (flag)
        {
            i /= 700;
        } else
        {
            i /= 2;
        }
        j = i + i / j;
        for (i = 0; j > 455; i += 36)
        {
            j /= 35;
        }

        return (j * 36) / (j + 38) + i;
    }

    private int digit(char c)
    {
        if (c >= 'A' && c <= 'Z')
        {
            return c - 65;
        }
        if (c >= 'a' && c <= 'z')
        {
            return c - 97;
        }
        if (c >= '0' && c <= '9')
        {
            return (c - 48) + 26;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal digit: ").append(c).toString());
        }
    }

    protected String decode(String s)
    {
        String s1;
        StringBuilder stringbuilder;
        int i;
        int k;
        int l;
        char c1 = '\200';
        boolean flag = false;
        byte byte0 = 72;
        stringbuilder = new StringBuilder(s.length());
        int k1 = s.lastIndexOf('-');
        k = byte0;
        i = ((flag) ? 1 : 0);
        l = c1;
        s1 = s;
        if (k1 != -1)
        {
            stringbuilder.append(s.subSequence(0, k1));
            s1 = s.substring(k1 + 1);
            l = c1;
            i = ((flag) ? 1 : 0);
            k = byte0;
        }
_L9:
        if (s1.length() <= 0) goto _L2; else goto _L1
_L1:
        int j;
        int i1;
        int j1;
        j1 = 1;
        i1 = 36;
        j = i;
_L7:
        if (s1.length() != 0) goto _L4; else goto _L3
_L3:
        int i2 = j;
_L6:
        j = stringbuilder.length();
        char c;
        int l1;
        int j2;
        boolean flag1;
        if (i == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        k = adapt(i2 - i, j + 1, flag1);
        l += i2 / (stringbuilder.length() + 1);
        i = i2 % (stringbuilder.length() + 1);
        stringbuilder.insert(i, (char)l);
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        c = s1.charAt(0);
        s = s1.substring(1);
        j2 = digit(c);
        l1 = j + j2 * j1;
        if (i1 <= k + 1)
        {
            j = 1;
        } else
        if (i1 >= k + 26)
        {
            j = 26;
        } else
        {
            j = i1 - k;
        }
        i2 = l1;
        s1 = s;
        if (j2 < j) goto _L6; else goto _L5
_L5:
        j1 *= 36 - j;
        i1 += 36;
        j = l1;
        s1 = s;
        if (true) goto _L7; else goto _L2
_L2:
        return stringbuilder.toString();
        if (true) goto _L9; else goto _L8
_L8:
    }

    public String toUnicode(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(s.length());
        for (StringTokenizer stringtokenizer = new StringTokenizer(s, "."); stringtokenizer.hasMoreTokens(); stringbuilder.append(s))
        {
            String s1 = stringtokenizer.nextToken();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append('.');
            }
            s = s1;
            if (s1.startsWith("xn--"))
            {
                s = decode(s1.substring(4));
            }
        }

        return stringbuilder.toString();
    }
}
