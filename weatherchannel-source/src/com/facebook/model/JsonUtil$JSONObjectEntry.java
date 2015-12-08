// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.model;


// Referenced classes of package com.facebook.model:
//            JsonUtil

private static final class value
    implements java.util.ectEntry
{

    private final String key;
    private final Object value;

    public volatile Object getKey()
    {
        return getKey();
    }

    public String getKey()
    {
        return key;
    }

    public Object getValue()
    {
        return value;
    }

    public Object setValue(Object obj)
    {
        throw new UnsupportedOperationException("JSONObjectEntry is immutable");
    }

    (String s, Object obj)
    {
        key = s;
        value = obj;
    }
}
