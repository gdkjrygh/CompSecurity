// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2;

import com.weather.dal2.config.DalConfig;
import com.weather.dal2.config.DalConfigManager;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.ui.UIUtil;

public final class TwcDataServer
{
    private static final class LazyHolder
    {

        private static final String API_KEY;

        static 
        {
            String s;
            android.content.Context context;
            s = "c58dba3f-01b0-45a6-bd9b-3a113dec4508";
            context = AbstractTwcApplication.getRootContext();
            if (!UIUtil.isTablet(context)) goto _L2; else goto _L1
_L1:
            if (UIUtil.isAmazon(context))
            {
                s = "b6f047ed-7391-45df-89c1-16f4aea73f2a";
            } else
            {
                s = "01119904-40b2-4f81-94a0-57867d0fd22c";
            }
_L4:
            API_KEY = s;
            return;
_L2:
            if (UIUtil.isAmazonMobile(context))
            {
                s = "5462b9f8-5a6c-453b-a5ed-4b853d58948b";
            }
            if (true) goto _L4; else goto _L3
_L3:
        }


        private LazyHolder()
        {
        }
    }


    public static final String DS2_KEY = "e88d42ec-a740-102c-bafd-001321203584";
    public static final int DSX_VER = 1;
    private static final String FIRE_PHONE_API_KEY = "5462b9f8-5a6c-453b-a5ed-4b853d58948b";
    private static final String KINDLE_API_KEY = "b6f047ed-7391-45df-89c1-16f4aea73f2a";
    private static final String PHONE_API_KEY = "c58dba3f-01b0-45a6-bd9b-3a113dec4508";
    private static final String TABLET_API_KEY = "01119904-40b2-4f81-94a0-57867d0fd22c";

    private TwcDataServer()
    {
    }

    public static String getApiKey()
    {
        return LazyHolder.API_KEY;
    }

    public static String getBrandedBackgroundUrl()
    {
        return DalConfigManager.INSTANCE.getDalConfig().getBrandedBackgroundUrl();
    }

    public static String getDsxDataUrl()
    {
        return DalConfigManager.INSTANCE.getDalConfig().getDsxDataUrl();
    }

    public static String getSecureDsxUrl()
    {
        return DalConfigManager.INSTANCE.getDalConfig().getDsxSecureUrl();
    }
}
