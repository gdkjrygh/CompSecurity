// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.ImmutableList;

// Referenced classes of package com.google.common.eventbus:
//            AnnotatedSubscriberFinder

static final class  extends CacheLoader
{

    public ImmutableList load(Class class1)
        throws Exception
    {
        return AnnotatedSubscriberFinder.access$000(class1);
    }

    public volatile Object load(Object obj)
        throws Exception
    {
        return load((Class)obj);
    }

    ()
    {
    }
}
