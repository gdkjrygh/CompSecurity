// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.otto;

import java.util.Map;

// Referenced classes of package com.squareup.otto:
//            AnnotatedHandlerFinder

interface HandlerFinder
{

    public static final HandlerFinder ANNOTATED = new HandlerFinder() {

        public Map findAllProducers(Object obj)
        {
            return AnnotatedHandlerFinder.findAllProducers(obj);
        }

        public Map findAllSubscribers(Object obj)
        {
            return AnnotatedHandlerFinder.findAllSubscribers(obj);
        }

    };

    public abstract Map findAllProducers(Object obj);

    public abstract Map findAllSubscribers(Object obj);

}
