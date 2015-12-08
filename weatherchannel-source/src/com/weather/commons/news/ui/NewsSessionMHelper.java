// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.sessionm.SessionMUtils;

public final class NewsSessionMHelper
{

    private static final String TAG = "NewsSessionMHelper";

    private NewsSessionMHelper()
    {
    }

    static void logNewsArticleDetailAppeared()
    {
        LogUtil.d("NewsSessionMHelper", LoggingMetaTags.TWC_SESSION_M, "Log news article read", new Object[0]);
        SessionMUtils.logAction("read_article");
    }
}
