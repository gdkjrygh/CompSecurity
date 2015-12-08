// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.collect.AbstractSequentialIterator;
import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class rator extends AbstractQueue
{

    final ry head = new LocalCache.AbstractReferenceEntry() {

        LocalCache.ReferenceEntry nextAccess;
        LocalCache.ReferenceEntry previousAccess;
        final LocalCache.AccessQueue this$0;

        public long getAccessTime()
        {
            return 0x7fffffffffffffffL;
        }

        public LocalCache.ReferenceEntry getNextInAccessQueue()
        {
            return nextAccess;
        }

        public LocalCache.ReferenceEntry getPreviousInAccessQueue()
        {
            return previousAccess;
        }

        public void setAccessTime(long l)
        {
        }

        public void setNextInAccessQueue(LocalCache.ReferenceEntry referenceentry)
        {
            nextAccess = referenceentry;
        }

        public void setPreviousInAccessQueue(LocalCache.ReferenceEntry referenceentry)
        {
            previousAccess = referenceentry;
        }

            
            {
                this$0 = LocalCache.AccessQueue.this;
                super();
                nextAccess = this;
                previousAccess = this;
            }
    };

    public void clear()
    {
        ry ry1;
        for (ry ry = head.getNextInAccessQueue(); ry != head; ry = ry1)
        {
            ry1 = ry.getNextInAccessQueue();
            LocalCache.nullifyAccessOrder(ry);
        }

        head.setNextInAccessQueue(head);
        head.setPreviousInAccessQueue(head);
    }

    public boolean contains(Object obj)
    {
        return ((ry)obj).getNextInAccessQueue() != STANCE;
    }

    public boolean isEmpty()
    {
        return head.getNextInAccessQueue() == head;
    }

    public Iterator iterator()
    {
        return new AbstractSequentialIterator(peek()) {

            final LocalCache.AccessQueue this$0;

            protected LocalCache.ReferenceEntry computeNext(LocalCache.ReferenceEntry referenceentry)
            {
                LocalCache.ReferenceEntry referenceentry1 = referenceentry.getNextInAccessQueue();
                referenceentry = referenceentry1;
                if (referenceentry1 == head)
                {
                    referenceentry = null;
                }
                return referenceentry;
            }

            protected volatile Object computeNext(Object obj)
            {
                return computeNext((LocalCache.ReferenceEntry)obj);
            }

            
            {
                this$0 = LocalCache.AccessQueue.this;
                super(referenceentry);
            }
        };
    }

    public boolean offer(ry ry)
    {
        LocalCache.connectAccessOrder(ry.getPreviousInAccessQueue(), ry.getNextInAccessQueue());
        LocalCache.connectAccessOrder(head.getPreviousInAccessQueue(), ry);
        LocalCache.connectAccessOrder(ry, head);
        return true;
    }

    public volatile boolean offer(Object obj)
    {
        return offer((ry)obj);
    }

    public ry peek()
    {
        ry ry1 = head.getNextInAccessQueue();
        ry ry = ry1;
        if (ry1 == head)
        {
            ry = null;
        }
        return ry;
    }

    public volatile Object peek()
    {
        return peek();
    }

    public ry poll()
    {
        ry ry = head.getNextInAccessQueue();
        if (ry == head)
        {
            return null;
        } else
        {
            remove(ry);
            return ry;
        }
    }

    public volatile Object poll()
    {
        return poll();
    }

    public boolean remove(Object obj)
    {
        obj = (ry)obj;
        ry ry = ((ry) (obj)).getPreviousInAccessQueue();
        ry ry1 = ((ry) (obj)).getNextInAccessQueue();
        LocalCache.connectAccessOrder(ry, ry1);
        LocalCache.nullifyAccessOrder(((ry) (obj)));
        return ry1 != STANCE;
    }

    public int size()
    {
        int i = 0;
        for (ry ry = head.getNextInAccessQueue(); ry != head; ry = ry.getNextInAccessQueue())
        {
            i++;
        }

        return i;
    }

    rator()
    {
    }
}
