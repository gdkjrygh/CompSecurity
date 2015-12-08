// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.escape;

import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.escape:
//            Escaper, CharEscaper

public final class CharEscaperBuilder
{
    private static class CharArrayDecorator extends CharEscaper
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

        CharArrayDecorator(char ac[][])
        {
            replacements = ac;
            replaceLength = ac.length;
        }
    }


    private final Map map = new HashMap();
    private int max;

    public CharEscaperBuilder()
    {
        max = -1;
    }

    public CharEscaperBuilder addEscape(char c, String s)
    {
        map.put(Character.valueOf(c), Preconditions.checkNotNull(s));
        if (c > max)
        {
            max = c;
        }
        return this;
    }

    public CharEscaperBuilder addEscapes(char ac[], String s)
    {
        Preconditions.checkNotNull(s);
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            addEscape(ac[i], s);
        }

        return this;
    }

    public char[][] toArray()
    {
        char ac[][] = new char[max + 1][];
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            ac[((Character)entry.getKey()).charValue()] = ((String)entry.getValue()).toCharArray();
        }

        return ac;
    }

    public Escaper toEscaper()
    {
        return new CharArrayDecorator(toArray());
    }
}
