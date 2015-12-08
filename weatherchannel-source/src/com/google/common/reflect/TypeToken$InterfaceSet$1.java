// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Predicate;

// Referenced classes of package com.google.common.reflect:
//            TypeToken

class this._cls1
    implements Predicate
{

    final apply this$1;

    public boolean apply(Class class1)
    {
        return class1.isInterface();
    }

    public volatile boolean apply(Object obj)
    {
        return apply((Class)obj);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
