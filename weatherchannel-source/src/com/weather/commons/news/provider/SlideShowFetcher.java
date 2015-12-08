// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import android.net.Uri;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.dal2.exceptions.DalException;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.config.ConfigException;

public class SlideShowFetcher
{

    private static final String SLIDESHOW_URL = "https://dsx.weather.com/cms/assets/slideshow";

    public SlideShowFetcher()
    {
    }

    private static String makeUrl(String s)
    {
        String s1 = "https://dsx.weather.com/cms/assets/slideshow";
        String s2 = ConfigurationManagers.getInstance().getFlagshipConfig().newsArticleSlideshowUrl;
        s1 = s2;
_L2:
        return Uri.parse(s1).buildUpon().appendPath(s).build().toString();
        ConfigException configexception;
        configexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void asyncFetch(String s, Receiver receiver)
    {
        (new SimpleHttpGetRequest()).asyncFetch(makeUrl(s), false, null, receiver);
    }

    public void fetch(String s)
    {
        try
        {
            (new SimpleHttpGetRequest()).fetch(makeUrl(s), false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }
}
