// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;


// Referenced classes of package com.google.common.io:
//            GwtWorkarounds

static final class index
    implements arInput
{

    int index;
    final CharSequence val$chars;

    public void close()
    {
        index = val$chars.length();
    }

    public int read()
    {
        if (index < val$chars.length())
        {
            CharSequence charsequence = val$chars;
            int i = index;
            index = i + 1;
            return charsequence.charAt(i);
        } else
        {
            return -1;
        }
    }

    arInput(CharSequence charsequence)
    {
        val$chars = charsequence;
        super();
        index = 0;
    }
}
