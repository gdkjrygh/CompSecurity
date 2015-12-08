// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.escape;

import com.google.common.base.Preconditions;
import java.util.Map;

// Referenced classes of package com.google.common.escape:
//            CharEscaper, ArrayBasedEscaperMap

public abstract class ArrayBasedCharEscaper extends CharEscaper
{

    private final char replacements[][];
    private final int replacementsLength;
    private final char safeMax;
    private final char safeMin;

    protected ArrayBasedCharEscaper(ArrayBasedEscaperMap arraybasedescapermap, char c, char c1)
    {
        Preconditions.checkNotNull(arraybasedescapermap);
        replacements = arraybasedescapermap.getReplacementArray();
        replacementsLength = replacements.length;
        int i = c;
        char c2 = c1;
        if (c1 < c)
        {
            c2 = '\0';
            i = 65535;
        }
        safeMin = i;
        safeMax = c2;
    }

    protected ArrayBasedCharEscaper(Map map, char c, char c1)
    {
        this(ArrayBasedEscaperMap.create(map), c, c1);
    }

    public final String escape(String s)
    {
        Preconditions.checkNotNull(s);
        int i = 0;
        do
        {
label0:
            {
                String s1 = s;
                if (i < s.length())
                {
                    char c = s.charAt(i);
                    if ((c >= replacementsLength || replacements[c] == null) && c <= safeMax && c >= safeMin)
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

    protected final char[] escape(char c)
    {
        if (c < replacementsLength)
        {
            char ac[] = replacements[c];
            if (ac != null)
            {
                return ac;
            }
        }
        if (c >= safeMin && c <= safeMax)
        {
            return null;
        } else
        {
            return escapeUnsafe(c);
        }
    }

    protected abstract char[] escapeUnsafe(char c);
}
