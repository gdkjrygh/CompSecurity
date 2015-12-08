// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.log;


public interface MeridianLogAdapter
{

    public abstract void d(String s, String s1, Throwable throwable);

    public abstract void e(String s, String s1, Throwable throwable);

    public abstract void i(String s, String s1, Throwable throwable);

    public abstract void v(String s, String s1, Throwable throwable);

    public abstract void w(String s, String s1, Throwable throwable);

    public abstract void wtf(String s, String s1, Throwable throwable);
}
