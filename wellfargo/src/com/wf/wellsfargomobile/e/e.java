// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.e;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

final class e
    implements android.view.View.OnClickListener
{

    final Activity a;
    final String b;

    e(Activity activity, String s)
    {
        a = activity;
        b = s;
        super();
    }

    public void onClick(View view)
    {
        String s = a.getApplicationContext().getPackageName();
        view = (new StringBuilder()).append("market://details?id=").append(s).toString();
        if ("Amazon Appstore for Android".equals(b))
        {
            view = (new StringBuilder()).append("amzn://apps/android?p=").append(s).toString();
        }
        try
        {
            a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(view)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("http://play.google.com/store/apps/details?id=").append(s).toString())));
        }
    }
}
