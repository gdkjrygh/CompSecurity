// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            ArrayTable

private class <init> extends <init>
{

    final ArrayTable this$0;

    String getKeyRole()
    {
        return "Column";
    }

    volatile Object getValue(int i)
    {
        return getValue(i);
    }

    Map getValue(int i)
    {
        return new it>(ArrayTable.this, i);
    }

    public volatile Object put(Object obj, Object obj1)
    {
        return put(obj, (Map)obj1);
    }

    public Map put(Object obj, Map map)
    {
        throw new UnsupportedOperationException();
    }

    volatile Object setValue(int i, Object obj)
    {
        return setValue(i, (Map)obj);
    }

    Map setValue(int i, Map map)
    {
        throw new UnsupportedOperationException();
    }

    private ()
    {
        this$0 = ArrayTable.this;
        super(ArrayTable.access$500(ArrayTable.this), null);
    }

    ( )
    {
        this();
    }
}
