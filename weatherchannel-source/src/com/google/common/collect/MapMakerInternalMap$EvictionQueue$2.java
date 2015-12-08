// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractSequentialIterator, MapMakerInternalMap

class this._cls0 extends AbstractSequentialIterator
{

    final computeNext this$0;

    protected this._cls0 computeNext(this._cls0 _pcls0)
    {
        this._cls0 _lcls0 = _pcls0.etNextEvictable();
        _pcls0 = _lcls0;
        if (_lcls0 == ad)
        {
            _pcls0 = null;
        }
        return _pcls0;
    }

    protected volatile Object computeNext(Object obj)
    {
        return computeNext((computeNext)obj);
    }

    ( 1)
    {
        this$0 = this._cls0.this;
        super(1);
    }
}
