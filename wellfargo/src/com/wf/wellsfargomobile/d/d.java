// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.d;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.a.a;

public class d
{

    public static String a(Context context)
    {
        if (WFApp.h == null || "".equals(WFApp.h))
        {
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                WFApp.h = WebSettings.getDefaultUserAgent(context);
            } else
            {
                WFApp.h = (new WebView(context)).getSettings().getUserAgentString();
            }
        }
        return (new StringBuilder()).append(WFApp.h).append(" WFAppId/").append(com.wf.wellsfargomobile.a.a.i()).append(" WFexperience/").append(WFApp.e()).append(" WFVersion/").append((new StringBuilder()).append("4.6.108 ").append(com.wf.wellsfargomobile.a.a.g()).toString().replace(' ', '_')).toString();
    }
}
