// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


public interface FutureCallback
{

    public abstract void onFailure(Throwable throwable);

    public abstract void onSuccess(Object obj);
}
