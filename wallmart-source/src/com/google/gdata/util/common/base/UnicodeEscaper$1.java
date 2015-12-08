// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gdata.util.common.base;

import java.io.IOException;

// Referenced classes of package com.google.gdata.util.common.base:
//            UnicodeEscaper

class decodedChars
    implements Appendable
{

    char decodedChars[];
    int pendingHighSurrogate;
    final UnicodeEscaper this$0;
    final Appendable val$out;

    private void outputChars(char ac[], int i)
        throws IOException
    {
        for (int j = 0; j < i; j++)
        {
            val$out.append(ac[j]);
        }

    }

    public Appendable append(char c)
        throws IOException
    {
        if (pendingHighSurrogate != -1)
        {
            if (!Character.isLowSurrogate(c))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Expected low surrogate character but got '").append(c).append("' with value ").append(c).toString());
            }
            char ac[] = escape(Character.toCodePoint((char)pendingHighSurrogate, c));
            if (ac != null)
            {
                outputChars(ac, ac.length);
            } else
            {
                val$out.append((char)pendingHighSurrogate);
                val$out.append(c);
            }
            pendingHighSurrogate = -1;
            return this;
        }
        if (Character.isHighSurrogate(c))
        {
            pendingHighSurrogate = c;
            return this;
        }
        if (Character.isLowSurrogate(c))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected low surrogate character '").append(c).append("' with value ").append(c).toString());
        }
        char ac1[] = escape(c);
        if (ac1 != null)
        {
            outputChars(ac1, ac1.length);
            return this;
        } else
        {
            val$out.append(c);
            return this;
        }
    }

    public Appendable append(CharSequence charsequence)
        throws IOException
    {
        return append(charsequence, 0, charsequence.length());
    }

    public Appendable append(CharSequence charsequence, int i, int j)
        throws IOException
    {
        if (i >= j) goto _L2; else goto _L1
_L1:
        int k;
        int i1;
        int j1 = i;
        i1 = i;
        k = j1;
        if (pendingHighSurrogate != -1)
        {
            char c = charsequence.charAt(i);
            if (!Character.isLowSurrogate(c))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Expected low surrogate character but got ").append(c).toString());
            }
            char ac[] = escape(Character.toCodePoint((char)pendingHighSurrogate, c));
            if (ac != null)
            {
                outputChars(ac, ac.length);
                k = j1 + 1;
            } else
            {
                val$out.append((char)pendingHighSurrogate);
                k = j1;
            }
            pendingHighSurrogate = -1;
            i1 = i + 1;
        }
_L5:
        i1 = nextEscapeIndex(charsequence, i1, j);
        if (i1 > k)
        {
            val$out.append(charsequence, k, i1);
        }
        if (i1 != j) goto _L3; else goto _L2
_L2:
        return this;
_L3:
        i = UnicodeEscaper.codePointAt(charsequence, i1, j);
        if (i < 0)
        {
            pendingHighSurrogate = -i;
            return this;
        }
        char ac1[] = escape(i);
        if (ac1 != null)
        {
            outputChars(ac1, ac1.length);
        } else
        {
            int l = Character.toChars(i, decodedChars, 0);
            outputChars(decodedChars, l);
        }
        if (Character.isSupplementaryCodePoint(i))
        {
            i = 2;
        } else
        {
            i = 1;
        }
        i1 += i;
        k = i1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    ()
    {
        this$0 = final_unicodeescaper;
        val$out = Appendable.this;
        super();
        pendingHighSurrogate = -1;
        decodedChars = new char[2];
    }
}
