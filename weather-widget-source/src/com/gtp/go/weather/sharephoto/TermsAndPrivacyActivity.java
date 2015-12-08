// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.language.b;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.weather.c.c;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            y

public class TermsAndPrivacyActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener
{

    private WebView a;
    private View b;
    private TextView c;
    private ProgressBar d;

    public TermsAndPrivacyActivity()
    {
    }

    static TextView a(TermsAndPrivacyActivity termsandprivacyactivity)
    {
        return termsandprivacyactivity.c;
    }

    private void a()
    {
        new DisplayMetrics();
        float f = e().getDisplayMetrics().density;
        if (f >= 1.5F)
        {
            a.getSettings().setDefaultZoom(android.webkit.WebSettings.ZoomDensity.MEDIUM);
            return;
        }
        if (f >= 2.0F)
        {
            a.getSettings().setDefaultZoom(android.webkit.WebSettings.ZoomDensity.MEDIUM);
            return;
        } else
        {
            a.getSettings().setDefaultZoom(android.webkit.WebSettings.ZoomDensity.FAR);
            return;
        }
    }

    public static void a(Context context)
    {
        context.startActivity(new Intent(context, com/gtp/go/weather/sharephoto/TermsAndPrivacyActivity));
    }

    static ProgressBar b(TermsAndPrivacyActivity termsandprivacyactivity)
    {
        return termsandprivacyactivity.d;
    }

    public void onClick(View view)
    {
        if (view.equals(b))
        {
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03010b);
        a = (WebView)findViewById(0x7f090511);
        a.setWebChromeClient(new y(this));
        a();
        bundle = a.getSettings();
        bundle.setDomStorageEnabled(true);
        bundle.setDefaultTextEncodingName("utf-8");
        b = findViewById(0x7f090513);
        b.setOnClickListener(this);
        c = (TextView)findViewById(0x7f090512);
        d = (ProgressBar)findViewById(0x7f090423);
        bundle = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).c().d();
        com.gtp.a.a.b.c.a("TermsAndPrivacyActivity", (new StringBuilder()).append("curUserLangLocale: ").append(bundle).toString());
        StringBuffer stringbuffer = new StringBuffer("file:///android_asset/share_photo_terms_and_privacy");
        if ("zh_CN".equals(bundle))
        {
            stringbuffer.append("_zh_CN");
        }
        stringbuffer.append(".html");
        a.loadUrl(stringbuffer.toString());
    }
}
