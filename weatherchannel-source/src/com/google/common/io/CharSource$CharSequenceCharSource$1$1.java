// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

// Referenced classes of package com.google.common.io:
//            CharSource

class is._cls0 extends AbstractIterator
{

    Iterator lines;
    final endOfData this$1;

    protected volatile Object computeNext()
    {
        return computeNext();
    }

    protected String computeNext()
    {
        if (lines.hasNext())
        {
            String s = (String)lines.next();
            if (lines.hasNext() || !s.isEmpty())
            {
                return s;
            }
        }
        return (String)endOfData();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
        lines = ss._mth200().split(ss._mth100(_fld0)).iterator();
    }

    // Unreferenced inner class com/google/common/io/CharSource$CharSequenceCharSource$1

/* anonymous class */
    class CharSource.CharSequenceCharSource._cls1
        implements Iterable
    {

        final CharSource.CharSequenceCharSource this$0;

        public Iterator iterator()
        {
            return new CharSource.CharSequenceCharSource._cls1._cls1();
        }

            
            {
                this$0 = CharSource.CharSequenceCharSource.this;
                super();
            }
    }

}
