// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.a;

import android.content.Intent;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.b.a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.wf.wellsfargomobile.webview.a:
//            c, b

public class h extends c
{

    public h()
    {
    }

    public int a()
    {
        return 60;
    }

    public b a(int i, int j, Intent intent, BaseWebViewActivity basewebviewactivity)
    {
        b b1 = new b();
        switch (j)
        {
        default:
            return b1;

        case 32: // ' '
            b1.a(false);
            a(intent.getStringExtra("scan_string"), basewebviewactivity);
            // fall through

        case 31: // '\037'
            b1.a(false);
            a(intent.getBooleanExtra("error", false), basewebviewactivity);
            return b1;
        }
    }

    public void a(String s, BaseWebViewActivity basewebviewactivity)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new BasicNameValuePair("qrcode", s));
        s = null;
        if (basewebviewactivity.mbaNativeRequestManager != null)
        {
            s = basewebviewactivity.mbaNativeRequestManager.c();
        }
        try
        {
            obj = new UrlEncodedFormEntity(((List) (obj)));
            basewebviewactivity.webview.postUrl((new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append(s).toString(), EntityUtils.toByteArray(((org.apache.http.HttpEntity) (obj))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void a(boolean flag, BaseWebViewActivity basewebviewactivity)
    {
        String s = null;
        String s1;
        if (basewebviewactivity.mbaNativeRequestManager != null)
        {
            s1 = basewebviewactivity.mbaNativeRequestManager.a();
            s = basewebviewactivity.mbaNativeRequestManager.b();
        } else
        {
            s1 = null;
        }
        if (s1 != null && !s1.trim().isEmpty())
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(s1);
            stringbuilder.append("(");
            stringbuilder.append(flag);
            stringbuilder.append(", '");
            stringbuilder.append(s);
            stringbuilder.append("');");
            if (basewebviewactivity.webview != null)
            {
                basewebviewactivity.loadJavaScript(stringbuilder.toString());
            }
        }
    }

    public int[] b()
    {
        return (new int[] {
            32, 31
        });
    }

    public int[] c()
    {
        return new int[0];
    }
}
