// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            AbstractService, ServiceManager

private static final class <init> extends AbstractService
{

    protected void doStart()
    {
        notifyStarted();
    }

    protected void doStop()
    {
        notifyStopped();
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
