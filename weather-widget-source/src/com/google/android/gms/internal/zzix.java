// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzw;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.android.gms.internal:
//            zzip, zziq, zzfx

public class zzix extends WebViewClient
{

    private final String zzJB;
    private boolean zzJC;
    private final zzfx zzJD;
    private final zzip zzoL;

    public zzix(zzfx zzfx1, zzip zzip1, String s)
    {
        zzJB = zzaM(s);
        zzJC = false;
        zzoL = zzip1;
        zzJD = zzfx1;
    }

    private String zzaM(String s)
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
        zzb.e(indexoutofboundsexception.getMessage());
        return s;
    }

    public void onLoadResource(WebView webview, String s)
    {
        zzb.zzaC((new StringBuilder()).append("JavascriptAdWebViewClient::onLoadResource: ").append(s).toString());
        if (!zzaL(s))
        {
            zzoL.zzgS().onLoadResource(zzoL.getWebView(), s);
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        zzb.zzaC((new StringBuilder()).append("JavascriptAdWebViewClient::onPageFinished: ").append(s).toString());
        if (!zzJC)
        {
            zzJD.zzfl();
            zzJC = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        zzb.zzaC((new StringBuilder()).append("JavascriptAdWebViewClient::shouldOverrideUrlLoading: ").append(s).toString());
        if (zzaL(s))
        {
            zzb.zzaC("shouldOverrideUrlLoading: received passback url");
            return true;
        } else
        {
            return zzoL.zzgS().shouldOverrideUrlLoading(zzoL.getWebView(), s);
        }
    }

    protected boolean zzaL(String s)
    {
        s = zzaM(s);
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
            zzb.zzaC("Passback received");
            zzJD.zzfm();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.e(s.getMessage());
            return false;
        }
        return true;
        if (TextUtils.isEmpty(zzJB)) goto _L1; else goto _L3
_L3:
        obj1 = new URI(zzJB);
        s = ((URI) (obj1)).getHost();
        s1 = ((URI) (obj)).getHost();
        obj1 = ((URI) (obj1)).getPath();
        obj = ((URI) (obj)).getPath();
        if (!zzw.equal(s, s1) || !zzw.equal(obj1, obj)) goto _L1; else goto _L4
_L4:
        zzb.zzaC("Passback received");
        zzJD.zzfm();
        return true;
    }
}
