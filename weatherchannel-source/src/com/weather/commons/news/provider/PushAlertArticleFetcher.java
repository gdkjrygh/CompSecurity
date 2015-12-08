// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import android.net.Uri;
import com.weather.dal2.TwcDataServer;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.net.SimpleHttpGetRequest;

public class PushAlertArticleFetcher
{

    public PushAlertArticleFetcher()
    {
    }

    public static String makeUrl(String s)
    {
        return Uri.parse((new StringBuilder()).append(TwcDataServer.getDsxDataUrl()).append("/cms/a").toString()).buildUpon().appendPath(s).appendQueryParameter("api", TwcDataServer.getApiKey()).build().toString();
    }

    public void asyncFetch(String s, Receiver receiver)
    {
        (new SimpleHttpGetRequest()).asyncFetch(makeUrl(s), false, null, receiver);
    }
}
