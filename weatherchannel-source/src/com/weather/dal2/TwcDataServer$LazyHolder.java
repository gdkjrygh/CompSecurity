// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2;

import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.ui.UIUtil;

// Referenced classes of package com.weather.dal2:
//            TwcDataServer

private static final class n
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


    private n()
    {
    }
}
