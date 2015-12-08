// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzt;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.android.gms.internal:
//            zzid, zzie, zzfq

public class zzil extends WebViewClient
{

    private final String zzHE;
    private boolean zzHF;
    private final zzfq zzHG;
    private final zzid zzoA;

    public zzil(zzfq zzfq1, zzid zzid1, String s)
    {
        zzHE = zzaH(s);
        zzHF = false;
        zzoA = zzid1;
        zzHG = zzfq1;
    }

    private String zzaH(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        if (!s.endsWith("/")) goto _L1; else goto _L3
_L3:
        String s1 = s.substring(0, s.length() - 1);
        return s1;
        IndexOutOfBoundsException indexoutofboundsexception;
        indexoutofboundsexception;
        zzb.zzaz(indexoutofboundsexception.getMessage());
        return s;
    }

    public void onLoadResource(WebView webview, String s)
    {
        zzb.zzay((new StringBuilder()).append("JavascriptAdWebViewClient::onLoadResource: ").append(s).toString());
        if (!zzaG(s))
        {
            zzoA.zzgF().onLoadResource(zzoA.getWebView(), s);
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        zzb.zzay((new StringBuilder()).append("JavascriptAdWebViewClient::onPageFinished: ").append(s).toString());
        if (!zzHF)
        {
            zzHG.zzfj();
            zzHF = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        zzb.zzay((new StringBuilder()).append("JavascriptAdWebViewClient::shouldOverrideUrlLoading: ").append(s).toString());
        if (zzaG(s))
        {
            zzb.zzay("shouldOverrideUrlLoading: received passback url");
            return true;
        } else
        {
            return zzoA.zzgF().shouldOverrideUrlLoading(zzoA.getWebView(), s);
        }
    }

    protected boolean zzaG(String s)
    {
        s = zzaH(s);
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s1;
        Object obj;
        Object obj1;
        try
        {
            obj = new URI(s);
            if (!"passback".equals(((URI) (obj)).getScheme()))
            {
                continue; /* Loop/switch isn't completed */
            }
            zzb.zzay("Passback received");
            zzHG.zzfk();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzaz(s.getMessage());
            return false;
        }
        return true;
        if (TextUtils.isEmpty(zzHE)) goto _L1; else goto _L3
_L3:
        obj1 = new URI(zzHE);
        s = ((URI) (obj1)).getHost();
        s1 = ((URI) (obj)).getHost();
        obj1 = ((URI) (obj1)).getPath();
        obj = ((URI) (obj)).getPath();
        if (!zzt.equal(s, s1) || !zzt.equal(obj1, obj)) goto _L1; else goto _L4
_L4:
        zzb.zzay("Passback received");
        zzHG.zzfk();
        return true;
    }
}
