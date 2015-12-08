// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            ForwardingNavigableMap, CollectPreconditions

protected class this._cls0 extends this._cls0
{

    final ForwardingNavigableMap this$0;

    protected Iterator entryIterator()
    {
        return new Iterator() {

            private java.util.Map.Entry nextOrNull;
            final ForwardingNavigableMap.StandardDescendingMap this$1;
            private java.util.Map.Entry toRemove;

            public boolean hasNext()
            {
                return nextOrNull != null;
            }

            public volatile Object next()
            {
                return next();
            }

            public java.util.Map.Entry next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                }
                java.util.Map.Entry entry = nextOrNull;
                toRemove = nextOrNull;
                nextOrNull = forward().lowerEntry(nextOrNull.getKey());
                return entry;
                Exception exception;
                exception;
                toRemove = nextOrNull;
                nextOrNull = forward().lowerEntry(nextOrNull.getKey());
                throw exception;
            }

            public void remove()
            {
                boolean flag;
                if (toRemove != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                CollectPreconditions.checkRemove(flag);
                forward().remove(toRemove.getKey());
                toRemove = null;
            }

            
            {
                this$1 = ForwardingNavigableMap.StandardDescendingMap.this;
                super();
                toRemove = null;
                nextOrNull = forward().lastEntry();
            }
        };
    }

    NavigableMap forward()
    {
        return ForwardingNavigableMap.this;
    }

    public forward()
    {
        this$0 = ForwardingNavigableMap.this;
        super();
    }
}
