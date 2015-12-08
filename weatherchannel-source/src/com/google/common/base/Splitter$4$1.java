// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Iterator;

// Referenced classes of package com.google.common.base:
//            Splitter

class ttingIterator extends ttingIterator
{

    final toSplit this$0;

    public int separatorEnd(int i)
    {
        return i;
    }

    public int separatorStart(int i)
    {
        i += length;
        if (i < toSplit.length())
        {
            return i;
        } else
        {
            return -1;
        }
    }

    l.length(Splitter splitter, CharSequence charsequence)
    {
        this$0 = this._cls0.this;
        super(splitter, charsequence);
    }

    // Unreferenced inner class com/google/common/base/Splitter$4

/* anonymous class */
    static final class Splitter._cls4
        implements Splitter.Strategy
    {

        final int val$length;

        public Splitter.SplittingIterator iterator(Splitter splitter, CharSequence charsequence)
        {
            return new Splitter._cls4._cls1(splitter, charsequence);
        }

        public volatile Iterator iterator(Splitter splitter, CharSequence charsequence)
        {
            return iterator(splitter, charsequence);
        }

            
            {
                length = i;
                super();
            }
    }

}
