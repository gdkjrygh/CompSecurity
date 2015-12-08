// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.escape;

import com.google.common.base.Preconditions;
import java.util.Map;

// Referenced classes of package com.google.common.escape:
//            UnicodeEscaper, ArrayBasedEscaperMap

public abstract class ArrayBasedUnicodeEscaper extends UnicodeEscaper
{

    private final char replacements[][];
    private final int replacementsLength;
    private final int safeMax;
    private final char safeMaxChar;
    private final int safeMin;
    private final char safeMinChar;

    protected ArrayBasedUnicodeEscaper(ArrayBasedEscaperMap arraybasedescapermap, int i, int j, String s)
    {
        Preconditions.checkNotNull(arraybasedescapermap);
        replacements = arraybasedescapermap.getReplacementArray();
        replacementsLength = replacements.length;
        int l = i;
        int k = j;
        if (j < i)
        {
            k = -1;
            l = 0x7fffffff;
        }
        safeMin = l;
        safeMax = k;
        if (l >= 55296)
        {
            safeMinChar = '\uFFFF';
            safeMaxChar = '\0';
            return;
        } else
        {
            safeMinChar = (char)l;
            safeMaxChar = (char)Math.min(k, 55295);
            return;
        }
    }

    protected ArrayBasedUnicodeEscaper(Map map, int i, int j, String s)
    {
        this(ArrayBasedEscaperMap.create(map), i, j, s);
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
                    if ((c >= replacementsLength || replacements[c] == null) && c <= safeMaxChar && c >= safeMinChar)
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

    protected final char[] escape(int i)
    {
        if (i < replacementsLength)
        {
            char ac[] = replacements[i];
            if (ac != null)
            {
                return ac;
            }
        }
        if (i >= safeMin && i <= safeMax)
        {
            return null;
        } else
        {
            return escapeUnsafe(i);
        }
    }

    protected abstract char[] escapeUnsafe(int i);

    protected final int nextEscapeIndex(CharSequence charsequence, int i, int j)
    {
        do
        {
label0:
            {
                if (i < j)
                {
                    char c = charsequence.charAt(i);
                    if ((c >= replacementsLength || replacements[c] == null) && c <= safeMaxChar && c >= safeMinChar)
                    {
                        break label0;
                    }
                }
                return i;
            }
            i++;
        } while (true);
    }
}
