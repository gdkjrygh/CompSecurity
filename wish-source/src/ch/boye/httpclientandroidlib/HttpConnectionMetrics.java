// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib;


public interface HttpConnectionMetrics
{

    public abstract Object getMetric(String s);

    public abstract long getReceivedBytesCount();

    public abstract long getRequestCount();

    public abstract long getResponseCount();

    public abstract long getSentBytesCount();

    public abstract void reset();
}
