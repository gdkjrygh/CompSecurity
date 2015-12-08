// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;


public interface UserIdQuerier
{

    public abstract String getDid();

    public abstract String getFilteredId();

    public abstract String getId();

    public abstract String getObfuscatedId();

    public abstract String getSha1Id();

    public abstract String getShortSha1Id();
}
