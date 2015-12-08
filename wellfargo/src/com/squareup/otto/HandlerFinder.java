// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.otto;

import java.util.Map;

interface HandlerFinder
{

    public static final HandlerFinder ANNOTATED = new _cls1();

    public abstract Map findAllProducers(Object obj);

    public abstract Map findAllSubscribers(Object obj);


    private class _cls1
        implements HandlerFinder
    {

        public Map findAllProducers(Object obj)
        {
            return AnnotatedHandlerFinder.findAllProducers(obj);
        }

        public Map findAllSubscribers(Object obj)
        {
            return AnnotatedHandlerFinder.findAllSubscribers(obj);
        }

        _cls1()
        {
        }
    }

}
