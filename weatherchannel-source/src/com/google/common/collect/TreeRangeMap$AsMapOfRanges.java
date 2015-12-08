// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            TreeRangeMap, Range

private final class <init> extends AbstractMap
{

    final TreeRangeMap this$0;

    public boolean containsKey(Object obj)
    {
        return get(obj) != null;
    }

    public Set entrySet()
    {
        return new AbstractSet() {

            final TreeRangeMap.AsMapOfRanges this$1;

            public Iterator iterator()
            {
                return TreeRangeMap.access$100(this$0).values().iterator();
            }

            public int size()
            {
                return TreeRangeMap.access$100(this$0).size();
            }

            
            {
                this$1 = TreeRangeMap.AsMapOfRanges.this;
                super();
            }
        };
    }

    public Object get(Object obj)
    {
        if (obj instanceof Range)
        {
            obj = (Range)obj;
            this._cls0 _lcls0 = (this._cls0)TreeRangeMap.access$100(TreeRangeMap.this).get(((Range) (obj)).lowerBound);
            if (_lcls0 != null && _lcls0.getKey().equals(obj))
            {
                return _lcls0.getValue();
            }
        }
        return null;
    }

    private _cls1.this._cls1()
    {
        this$0 = TreeRangeMap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
