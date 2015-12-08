// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static final class previousEvictable extends previousEvictable
    implements previousEvictable
{

    previousEvictable nextEvictable;
    previousEvictable previousEvictable;

    public previousEvictable getNextEvictable()
    {
        return nextEvictable;
    }

    public nextEvictable getPreviousEvictable()
    {
        return previousEvictable;
    }

    public void setNextEvictable(previousEvictable previousevictable)
    {
        nextEvictable = previousevictable;
    }

    public void setPreviousEvictable(nextEvictable nextevictable)
    {
        previousEvictable = nextevictable;
    }

    (Object obj, int i,  )
    {
        super(obj, i, );
        nextEvictable = MapMakerInternalMap.nullEntry();
        previousEvictable = MapMakerInternalMap.nullEntry();
    }
}
