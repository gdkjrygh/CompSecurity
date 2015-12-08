// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap, AbstractSequentialIterator

static final class _cls2.this._cls0 extends AbstractQueue
{

    final etNextExpirable head = new MapMakerInternalMap.AbstractReferenceEntry() {

        MapMakerInternalMap.ReferenceEntry nextExpirable;
        MapMakerInternalMap.ReferenceEntry previousExpirable;
        final MapMakerInternalMap.ExpirationQueue this$0;

        public long getExpirationTime()
        {
            return 0x7fffffffffffffffL;
        }

        public MapMakerInternalMap.ReferenceEntry getNextExpirable()
        {
            return nextExpirable;
        }

        public MapMakerInternalMap.ReferenceEntry getPreviousExpirable()
        {
            return previousExpirable;
        }

        public void setExpirationTime(long l)
        {
        }

        public void setNextExpirable(MapMakerInternalMap.ReferenceEntry referenceentry)
        {
            nextExpirable = referenceentry;
        }

        public void setPreviousExpirable(MapMakerInternalMap.ReferenceEntry referenceentry)
        {
            previousExpirable = referenceentry;
        }

            
            {
                this$0 = MapMakerInternalMap.ExpirationQueue.this;
                super();
                nextExpirable = this;
                previousExpirable = this;
            }
    };

    public void clear()
    {
        _cls2.this._cls0 _lcls0_1;
        for (_cls2.this._cls0 _lcls0 = head.etNextExpirable(); _lcls0 != head; _lcls0 = _lcls0_1)
        {
            _lcls0_1 = _lcls0.etNextExpirable();
            MapMakerInternalMap.nullifyExpirable(_lcls0);
        }

        head.etNextExpirable(head);
        head.etPreviousExpirable(head);
    }

    public boolean contains(Object obj)
    {
        return ((head)obj).etNextExpirable() != CE;
    }

    public boolean isEmpty()
    {
        return head.etNextExpirable() == head;
    }

    public Iterator iterator()
    {
        return new AbstractSequentialIterator(peek()) {

            final MapMakerInternalMap.ExpirationQueue this$0;

            protected MapMakerInternalMap.ReferenceEntry computeNext(MapMakerInternalMap.ReferenceEntry referenceentry)
            {
                MapMakerInternalMap.ReferenceEntry referenceentry1 = referenceentry.getNextExpirable();
                referenceentry = referenceentry1;
                if (referenceentry1 == head)
                {
                    referenceentry = null;
                }
                return referenceentry;
            }

            protected volatile Object computeNext(Object obj)
            {
                return computeNext((MapMakerInternalMap.ReferenceEntry)obj);
            }

            
            {
                this$0 = MapMakerInternalMap.ExpirationQueue.this;
                super(referenceentry);
            }
        };
    }

    public boolean offer(_cls2.computeNext computenext)
    {
        MapMakerInternalMap.connectExpirables(computenext.etPreviousExpirable(), computenext.etNextExpirable());
        MapMakerInternalMap.connectExpirables(head.etPreviousExpirable(), computenext);
        MapMakerInternalMap.connectExpirables(computenext, head);
        return true;
    }

    public volatile boolean offer(Object obj)
    {
        return offer((offer)obj);
    }

    public offer peek()
    {
        offer offer2 = head.etNextExpirable();
        offer offer1 = offer2;
        if (offer2 == head)
        {
            offer1 = null;
        }
        return offer1;
    }

    public volatile Object peek()
    {
        return peek();
    }

    public peek poll()
    {
        peek peek1 = head.etNextExpirable();
        if (peek1 == head)
        {
            return null;
        } else
        {
            remove(peek1);
            return peek1;
        }
    }

    public volatile Object poll()
    {
        return poll();
    }

    public boolean remove(Object obj)
    {
        obj = (poll)obj;
        poll poll1 = ((poll) (obj)).etPreviousExpirable();
        poll poll2 = ((etPreviousExpirable) (obj)).etNextExpirable();
        MapMakerInternalMap.connectExpirables(poll1, poll2);
        MapMakerInternalMap.nullifyExpirable((() (obj)));
        return poll2 != CE;
    }

    public int size()
    {
        int i = 0;
        for (CE ce = head.etNextExpirable(); ce != head; ce = ce.etNextExpirable())
        {
            i++;
        }

        return i;
    }

    _cls2.this._cls0()
    {
    }
}
