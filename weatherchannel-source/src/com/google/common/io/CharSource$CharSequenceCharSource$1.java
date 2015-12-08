// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

// Referenced classes of package com.google.common.io:
//            CharSource

class this._cls0
    implements Iterable
{

    final _cls1.endOfData this$0;

    public Iterator iterator()
    {
        return new AbstractIterator() {

            Iterator lines;
            final CharSource.CharSequenceCharSource._cls1 this$1;

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

            
            {
                this$1 = CharSource.CharSequenceCharSource._cls1.this;
                super();
                lines = CharSource.CharSequenceCharSource.access$200().split(CharSource.CharSequenceCharSource.access$100(this$0)).iterator();
            }
        };
    }

    this._cls0()
    {
        this$0 = this._cls0.this;
        super();
    }
}
