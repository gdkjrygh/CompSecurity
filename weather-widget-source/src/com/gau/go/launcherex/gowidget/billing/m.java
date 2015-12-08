// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.gau.go.launcherex.gowidget.weather.globalview.c;
import java.util.Locale;

final class m
    implements c
{

    final Activity a;

    m(Activity activity)
    {
        a = activity;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            Object obj = Locale.getDefault();
            obj = new Intent("android.intent.action.VIEW", Uri.parse("http://market.android.com/support/bin/answer.py?answer=1050566&hl=%lang%&dl=%region%".replace("%lang%", ((Locale) (obj)).getLanguage().toLowerCase(Locale.US)).replace("%region%", ((Locale) (obj)).getCountry().toLowerCase(Locale.US))));
            ((Intent) (obj)).addFlags(0x10000000);
            a.startActivity(((Intent) (obj)));
        }
    }
}
