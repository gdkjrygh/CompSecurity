// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.globalview.c;

// Referenced classes of package com.go.weatherex.setting:
//            ad

class ag
    implements c
{

    final ad a;

    ag(ad ad1)
    {
        a = ad1;
        super();
    }

    public void a(boolean flag)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        a.startActivityForResult(new Intent("android.settings.WIRELESS_SETTINGS"), 0);
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
    }
}
