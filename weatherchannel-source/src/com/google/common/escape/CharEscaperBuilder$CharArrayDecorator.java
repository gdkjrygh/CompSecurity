// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.escape;


// Referenced classes of package com.google.common.escape:
//            CharEscaper, CharEscaperBuilder

private static class replaceLength extends CharEscaper
{

    private final int replaceLength;
    private final char replacements[][];

    public String escape(String s)
    {
        int j = s.length();
        int i = 0;
        do
        {
label0:
            {
                String s1 = s;
                if (i < j)
                {
                    char c = s.charAt(i);
                    if (c >= replacements.length || replacements[c] == null)
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

    protected char[] escape(char c)
    {
        if (c < replaceLength)
        {
            return replacements[c];
        } else
        {
            return null;
        }
    }

    (char ac[][])
    {
        replacements = ac;
        replaceLength = ac.length;
    }
}
