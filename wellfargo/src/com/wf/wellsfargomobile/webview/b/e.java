// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.b;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.webview.b:
//            d

class e
    implements DownloadListener
{

    final BaseWebViewActivity a;
    final d b;

    e(d d, BaseWebViewActivity basewebviewactivity)
    {
        b = d;
        a = basewebviewactivity;
        super();
    }

    public void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        if (WFApp.a(a))
        {
            s1 = new android.app.DownloadManager.Request(Uri.parse(s));
            s1.setTitle(a.getString(0x7f08005a));
            s1.addRequestHeader("Cookie", WFApp.z().getCookie(s));
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                s1.allowScanningByMediaScanner();
                s1.setNotificationVisibility(0);
            }
            s = new StringBuilder();
            s.append(a.getString(0x7f08005b));
            s.append(MimeTypeMap.getSingleton().getExtensionFromMimeType(s3));
            s1.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, s.toString());
            s = (DownloadManager)a.getSystemService("download");
            Toast.makeText(a, 0x7f08005e, 0).show();
            s.enqueue(s1);
        }
    }
}
