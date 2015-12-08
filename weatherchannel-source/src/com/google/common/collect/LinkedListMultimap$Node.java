// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractMapEntry, LinkedListMultimap

private static final class value extends AbstractMapEntry
{

    final Object key;
    value next;
    value nextSibling;
    value previous;
    value previousSibling;
    Object value;

    public Object getKey()
    {
        return key;
    }

    public Object getValue()
    {
        return value;
    }

    public Object setValue(Object obj)
    {
        Object obj1 = value;
        value = obj;
        return obj1;
    }

    (Object obj, Object obj1)
    {
        key = obj;
        value = obj1;
    }
}
