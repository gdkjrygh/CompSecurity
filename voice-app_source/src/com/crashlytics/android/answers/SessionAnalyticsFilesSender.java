// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.File;
import java.util.Iterator;
import java.util.List;

class SessionAnalyticsFilesSender extends AbstractSpiCall
    implements FilesSender
{

    static final String FILE_CONTENT_TYPE = "application/vnd.crashlytics.android.events";
    static final String FILE_PARAM_NAME = "session_analytics_file_";
    private final String apiKey;

    public SessionAnalyticsFilesSender(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, String s2)
    {
        super(kit, s, s1, httprequestfactory, HttpMethod.POST);
        apiKey = s2;
    }

    public boolean send(List list)
    {
        HttpRequest httprequest = getHttpRequest().header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion()).header("X-CRASHLYTICS-API-KEY", apiKey);
        int i = 0;
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            File file = (File)iterator.next();
            httprequest.part((new StringBuilder()).append("session_analytics_file_").append(i).toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
            i++;
        }

        Fabric.getLogger().d("Answers", (new StringBuilder()).append("Sending ").append(list.size()).append(" analytics files to ").append(getUrl()).toString());
        i = httprequest.code();
        Fabric.getLogger().d("Answers", (new StringBuilder()).append("Response code for analytics file send is ").append(i).toString());
        return ResponseParser.parse(i) == 0;
    }
}
