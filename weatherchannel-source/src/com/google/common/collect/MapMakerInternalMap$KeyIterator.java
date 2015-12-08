// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

final class  extends 
{

    final MapMakerInternalMap this$0;

    public Object next()
    {
        return nextEntry().getKey();
    }

    Entry()
    {
        this$0 = MapMakerInternalMap.this;
        super(MapMakerInternalMap.this);
    }
}
