// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.ModalDialogLargeWebViewActivity;
import com.wf.wellsfargomobile.ModalDialogWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class t extends ae
{

    public t()
    {
    }

    public int a()
    {
        return 110;
    }

    public ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        webview = new ac();
        try
        {
            s = new URL(s);
            if (WFApp.d() && ((basewebviewactivity instanceof ModalDialogWebViewActivity) || (basewebviewactivity instanceof ModalDialogLargeWebViewActivity)) && s.getPath().startsWith(basewebviewactivity.getString(0x7f080172)))
            {
                webview.a(false);
                webview.b(true);
                basewebviewactivity.closeWebViewAsDialog(null);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            webview.a(false);
            webview.b(true);
            basewebviewactivity.returnWithError(basewebviewactivity.getString(0x7f0800b2), basewebviewactivity.getString(0x7f0800ae));
            return webview;
        }
        return webview;
    }
}
