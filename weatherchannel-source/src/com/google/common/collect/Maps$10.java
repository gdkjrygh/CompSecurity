// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractMapEntry, Maps

static final class MapEntry extends AbstractMapEntry
{

    final java.util.y val$entry;
    final ryTransformer val$transformer;

    public Object getKey()
    {
        return val$entry.getKey();
    }

    public Object getValue()
    {
        return val$transformer.transformEntry(val$entry.getKey(), val$entry.getValue());
    }

    ryTransformer(java.util.y y, ryTransformer rytransformer)
    {
        val$entry = y;
        val$transformer = rytransformer;
        super();
    }
}
