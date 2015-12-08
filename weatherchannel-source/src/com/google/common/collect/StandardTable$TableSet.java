// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            StandardTable

private abstract class <init> extends t
{

    final StandardTable this$0;

    public void clear()
    {
        backingMap.clear();
    }

    public boolean isEmpty()
    {
        return backingMap.isEmpty();
    }

    private t()
    {
        this$0 = StandardTable.this;
        super();
    }

    t(t t)
    {
        this();
    }
}
