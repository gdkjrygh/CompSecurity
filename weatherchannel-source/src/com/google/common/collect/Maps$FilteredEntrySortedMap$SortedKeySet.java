// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Maps

class this._cls0 extends this._cls0
    implements SortedSet
{

    final this._cls0 this$0;

    public Comparator comparator()
    {
        return _mth0().comparator();
    }

    public Object first()
    {
        return _mth0();
    }

    public SortedSet headSet(Object obj)
    {
        return (SortedSet)_mth0(obj).keySet();
    }

    public Object last()
    {
        return _mth0();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return (SortedSet)_mth0(obj, obj1).keySet();
    }

    public SortedSet tailSet(Object obj)
    {
        return (SortedSet)_mth0(obj).keySet();
    }

    ()
    {
        this$0 = this._cls0.this;
        super(this._cls0.this);
    }
}
