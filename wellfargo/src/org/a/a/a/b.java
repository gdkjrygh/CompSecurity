// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;

import java.util.regex.Pattern;

// Referenced classes of package org.a.a.a:
//            a

public class b
{

    private static final Pattern a = Pattern.compile("\\s+");

    public static String a(String s, String s1)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        int i = s.length();
        if (i != 0) goto _L3; else goto _L2
_L2:
        return s;
_L3:
        int j;
        if (s1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        do
        {
            j = i;
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            j = i;
            if (!Character.isWhitespace(s.charAt(i - 1)))
            {
                break MISSING_BLOCK_LABEL_84;
            }
            i--;
        } while (true);
        if (s1.length() == 0) goto _L2; else goto _L4
_L4:
        do
        {
            j = i;
            if (i == 0)
            {
                break;
            }
            j = i;
            if (s1.indexOf(s.charAt(i - 1)) == -1)
            {
                break;
            }
            i--;
        } while (true);
        return s.substring(0, j);
    }

    public static boolean a(CharSequence charsequence)
    {
        return charsequence == null || charsequence.length() == 0;
    }

    public static boolean a(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence == null || charsequence1 == null)
        {
            return charsequence == charsequence1;
        } else
        {
            return org.a.a.a.a.a(charsequence, true, 0, charsequence1, 0, Math.max(charsequence.length(), charsequence1.length()));
        }
    }

    private static boolean a(CharSequence charsequence, CharSequence charsequence1, boolean flag)
    {
        boolean flag2 = false;
        boolean flag1;
        if (charsequence == null || charsequence1 == null)
        {
            flag1 = flag2;
            if (charsequence == null)
            {
                flag1 = flag2;
                if (charsequence1 == null)
                {
                    flag1 = true;
                }
            }
        } else
        {
            flag1 = flag2;
            if (charsequence1.length() <= charsequence.length())
            {
                return org.a.a.a.a.a(charsequence, flag, 0, charsequence1, 0, charsequence1.length());
            }
        }
        return flag1;
    }

    public static boolean b(CharSequence charsequence)
    {
        boolean flag1 = false;
        if (charsequence == null) goto _L2; else goto _L1
_L1:
        int j = charsequence.length();
        if (j != 0) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        return flag;
_L3:
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
                flag = flag1;
                if (!Character.isWhitespace(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
        return true;
    }

    public static boolean b(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence != null && charsequence1 != null)
        {
            int j = charsequence1.length();
            int k = charsequence.length();
            int i = 0;
            while (i <= k - j) 
            {
                if (org.a.a.a.a.a(charsequence, true, i, charsequence1, 0, j))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private static boolean b(CharSequence charsequence, CharSequence charsequence1, boolean flag)
    {
        boolean flag2 = false;
        boolean flag1;
        if (charsequence == null || charsequence1 == null)
        {
            flag1 = flag2;
            if (charsequence == null)
            {
                flag1 = flag2;
                if (charsequence1 == null)
                {
                    flag1 = true;
                }
            }
        } else
        {
            flag1 = flag2;
            if (charsequence1.length() <= charsequence.length())
            {
                return org.a.a.a.a.a(charsequence, flag, charsequence.length() - charsequence1.length(), charsequence1, 0, charsequence1.length());
            }
        }
        return flag1;
    }

    public static boolean c(CharSequence charsequence, CharSequence charsequence1)
    {
        return a(charsequence, charsequence1, false);
    }

    public static boolean d(CharSequence charsequence, CharSequence charsequence1)
    {
        return b(charsequence, charsequence1, true);
    }

}
