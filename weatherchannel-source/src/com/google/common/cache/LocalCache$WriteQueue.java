// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.collect.AbstractSequentialIterator;
import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class erator extends AbstractQueue
{

    final try head = new LocalCache.AbstractReferenceEntry() {

        LocalCache.ReferenceEntry nextWrite;
        LocalCache.ReferenceEntry previousWrite;
        final LocalCache.WriteQueue this$0;

        public LocalCache.ReferenceEntry getNextInWriteQueue()
        {
            return nextWrite;
        }

        public LocalCache.ReferenceEntry getPreviousInWriteQueue()
        {
            return previousWrite;
        }

        public long getWriteTime()
        {
            return 0x7fffffffffffffffL;
        }

        public void setNextInWriteQueue(LocalCache.ReferenceEntry referenceentry)
        {
            nextWrite = referenceentry;
        }

        public void setPreviousInWriteQueue(LocalCache.ReferenceEntry referenceentry)
        {
            previousWrite = referenceentry;
        }

        public void setWriteTime(long l)
        {
        }

            
            {
                this$0 = LocalCache.WriteQueue.this;
                super();
                nextWrite = this;
                previousWrite = this;
            }
    };

    public void clear()
    {
        try try2;
        for (try try1 = head.getNextInWriteQueue(); try1 != head; try1 = try2)
        {
            try2 = try1.getNextInWriteQueue();
            LocalCache.nullifyWriteOrder(try1);
        }

        head.setNextInWriteQueue(head);
        head.setPreviousInWriteQueue(head);
    }

    public boolean contains(Object obj)
    {
        return ((try)obj).getNextInWriteQueue() != NSTANCE;
    }

    public boolean isEmpty()
    {
        return head.getNextInWriteQueue() == head;
    }

    public Iterator iterator()
    {
        return new AbstractSequentialIterator(peek()) {

            final LocalCache.WriteQueue this$0;

            protected LocalCache.ReferenceEntry computeNext(LocalCache.ReferenceEntry referenceentry)
            {
                LocalCache.ReferenceEntry referenceentry1 = referenceentry.getNextInWriteQueue();
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
                this$0 = LocalCache.WriteQueue.this;
                super(referenceentry);
            }
        };
    }

    public boolean offer(try try1)
    {
        LocalCache.connectWriteOrder(try1.getPreviousInWriteQueue(), try1.getNextInWriteQueue());
        LocalCache.connectWriteOrder(head.getPreviousInWriteQueue(), try1);
        LocalCache.connectWriteOrder(try1, head);
        return true;
    }

    public volatile boolean offer(Object obj)
    {
        return offer((try)obj);
    }

    public try peek()
    {
        try try2 = head.getNextInWriteQueue();
        try try1 = try2;
        if (try2 == head)
        {
            try1 = null;
        }
        return try1;
    }

    public volatile Object peek()
    {
        return peek();
    }

    public try poll()
    {
        try try1 = head.getNextInWriteQueue();
        if (try1 == head)
        {
            return null;
        } else
        {
            remove(try1);
            return try1;
        }
    }

    public volatile Object poll()
    {
        return poll();
    }

    public boolean remove(Object obj)
    {
        obj = (try)obj;
        try try1 = ((try) (obj)).getPreviousInWriteQueue();
        try try2 = ((try) (obj)).getNextInWriteQueue();
        LocalCache.connectWriteOrder(try1, try2);
        LocalCache.nullifyWriteOrder(((try) (obj)));
        return try2 != NSTANCE;
    }

    public int size()
    {
        int i = 0;
        for (try try1 = head.getNextInWriteQueue(); try1 != head; try1 = try1.getNextInWriteQueue())
        {
            i++;
        }

        return i;
    }

    erator()
    {
    }
}
