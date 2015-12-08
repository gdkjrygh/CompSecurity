// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.net;


public interface Receiver
{

    public abstract void onCompletion(Object obj, Object obj1);

    public abstract void onError(Throwable throwable, Object obj);
}
