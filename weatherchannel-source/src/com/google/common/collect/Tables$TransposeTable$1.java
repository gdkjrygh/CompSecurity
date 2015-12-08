// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.collect:
//            Tables

static final class 
    implements Function
{

    public  apply( )
    {
        return Tables.immutableCell(.(), .(), .());
    }

    public volatile Object apply(Object obj)
    {
        return apply((apply)obj);
    }

    ()
    {
    }
}
