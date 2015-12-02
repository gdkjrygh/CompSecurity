// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ubercab.client.feature.mobilemessage.MobileMessageModuleContentView;

public final class efd extends WebViewClient
{

    final MobileMessageModuleContentView a;

    private efd(MobileMessageModuleContentView mobilemessagemodulecontentview)
    {
        a = mobilemessagemodulecontentview;
        super();
    }

    public efd(MobileMessageModuleContentView mobilemessagemodulecontentview, byte byte0)
    {
        this(mobilemessagemodulecontentview);
    }

    public final void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (MobileMessageModuleContentView.a(a) != null)
        {
            MobileMessageModuleContentView.a(a).a(MobileMessageModuleContentView.b(a));
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        while (TextUtils.isEmpty(s) || MobileMessageModuleContentView.a(a) == null) 
        {
            return true;
        }
        MobileMessageModuleContentView.a(a).a(s);
        return true;
    }
}
