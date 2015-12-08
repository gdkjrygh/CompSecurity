// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Iterator;

// Referenced classes of package com.google.common.base:
//            AbstractIterator, Preconditions, Optional

class this._cls0 extends AbstractIterator
{

    private final Iterator iterator;
    final endOfData this$0;

    protected Object computeNext()
    {
        while (iterator.hasNext()) 
        {
            Optional optional = (Optional)iterator.next();
            if (optional.isPresent())
            {
                return optional.get();
            }
        }
        return endOfData();
    }

    l.optionals()
    {
        this$0 = this._cls0.this;
        super();
        iterator = (Iterator)Preconditions.checkNotNull(this._cls0.this.optionals.iterator());
    }

    // Unreferenced inner class com/google/common/base/Optional$1

/* anonymous class */
    static final class Optional._cls1
        implements Iterable
    {

        final Iterable val$optionals;

        public Iterator iterator()
        {
            return new Optional._cls1._cls1();
        }

            
            {
                optionals = iterable;
                super();
            }
    }

}
