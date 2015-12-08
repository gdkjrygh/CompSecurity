// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;


public interface NewsDownloader
{

    public abstract String download(String s)
        throws com.weather.util.net.HttpRequest.HttpRequestException;
}
