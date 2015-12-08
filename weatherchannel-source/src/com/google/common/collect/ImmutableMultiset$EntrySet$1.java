// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableAsList, ImmutableMultiset, ImmutableCollection

class this._cls1 extends ImmutableAsList
{

    final get this$1;

    ImmutableCollection delegateCollection()
    {
        return this._cls1.this;
    }

    public this._cls1 get(int i)
    {
        return getEntry(i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
