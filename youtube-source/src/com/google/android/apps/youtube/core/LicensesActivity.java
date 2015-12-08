// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import com.google.android.apps.youtube.common.L;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.core:
//            ay

public class LicensesActivity extends Activity
{

    public LicensesActivity()
    {
    }

    public static Intent a(Context context)
    {
        return (new Intent(context, com/google/android/apps/youtube/core/LicensesActivity)).putExtra("licensesUrl", "file:///android_asset/licenses.html");
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(l.ag);
        getWindow().setLayout(-1, -1);
        bundle = getIntent().getStringExtra("licensesUrl");
        if (bundle == null)
        {
            L.c("LicensesActivity missing licenses URL, finishing.");
            finish();
            return;
        } else
        {
            WebView webview = (WebView)findViewById(j.cd);
            webview.setOnKeyListener(new ay(this));
            webview.loadUrl(bundle);
            return;
        }
    }
}
