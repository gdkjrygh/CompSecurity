// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.h5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.webkit.WebSettings;

// Referenced classes of package com.jiubang.commerce.ad.h5:
//            b, a

public class H5AdActivity extends Activity
{

    private b a;

    public H5AdActivity()
    {
    }

    private void a()
    {
        getWindow().requestFeature(1);
        getWindow().requestFeature(2);
        a = new b(this);
        a.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        a.getSettings().setJavaScriptEnabled(true);
        a.setWebViewClient(new a(this, this));
        setContentView(a);
    }

    public static boolean a(Context context, String s)
    {
        if (context != null && !TextUtils.isEmpty(s))
        {
            Intent intent = new Intent(context, com/jiubang/commerce/ad/h5/H5AdActivity);
            intent.putExtra("ad_url", s);
            intent.addFlags(0x10000000);
            context.startActivity(intent);
            return true;
        } else
        {
            return false;
        }
    }

    private void b()
    {
        String s = getIntent().getStringExtra("ad_url");
        if (TextUtils.isEmpty(s))
        {
            finish();
        }
        a.loadUrl(s);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a();
        b();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        a = null;
    }
}
