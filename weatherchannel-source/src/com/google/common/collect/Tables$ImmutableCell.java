// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            Tables

static final class value extends value
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Object columnKey;
    private final Object rowKey;
    private final Object value;

    public Object getColumnKey()
    {
        return columnKey;
    }

    public Object getRowKey()
    {
        return rowKey;
    }

    public Object getValue()
    {
        return value;
    }

    (Object obj, Object obj1, Object obj2)
    {
        rowKey = obj;
        columnKey = obj1;
        value = obj2;
    }
}
