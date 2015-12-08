// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;


// Referenced classes of package com.sessionm.net:
//            RequestQueue, Request

public interface d
{

    public abstract void a(RequestQueue requestqueue, Request request);

    public abstract void a(RequestQueue requestqueue, RequestQueue.RequestQueueNetworkState requestqueuenetworkstate);

    public abstract void a(RequestQueue requestqueue, RequestQueue.RequestQueueSendState requestqueuesendstate);

    public abstract boolean a(RequestQueue requestqueue);

    public abstract void b(RequestQueue requestqueue);

    public abstract void b(RequestQueue requestqueue, Request request);

    public abstract void c(RequestQueue requestqueue);

    public abstract boolean c(RequestQueue requestqueue, Request request);
}
