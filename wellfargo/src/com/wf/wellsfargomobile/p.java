// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.RelativeLayout;
import com.wf.wellsfargomobile.d.a;
import com.wf.wellsfargomobile.d.c;
import com.wf.wellsfargomobile.d.e;
import com.wf.wellsfargomobile.util.v;
import java.io.IOException;
import java.net.URL;

// Referenced classes of package com.wf.wellsfargomobile:
//            l, MainActivity, i, WebViewActivity

class p extends AsyncTask
{

    final l a;
    private final String b = "FollowLinkAsyncTask";
    private String c;

    public p(l l1)
    {
        a = l1;
        super();
        c = null;
    }

    protected transient Void a(String as[])
    {
        c = as[0];
        Object obj;
        int j;
        boolean flag;
        try
        {
            as = (new a(c.a, (new StringBuilder()).append(c).append("&WFAppId=").append(com.wf.wellsfargomobile.a.a.i()).toString(), null, null, com.wf.wellsfargomobile.l.a(a), false)).b();
            j = as.a();
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return null;
        }
        if (j != 301 && j != 302) goto _L2; else goto _L1
_L1:
        as = as.a("Location");
        if (as == null) goto _L2; else goto _L3
_L3:
        if (!as.startsWith("tel:")) goto _L5; else goto _L4
_L4:
        obj = com.wf.wellsfargomobile.l.a(a);
        if (obj == null) goto _L5; else goto _L6
_L6:
        com.wf.wellsfargomobile.l.a(a).startActivity(new Intent("android.intent.action.DIAL", Uri.parse(as)));
_L2:
        return null;
_L5:
        obj = (new URL(as)).getQuery();
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((String) (obj)).contains("launchMode=ext"))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = v.b(as);
        if (com.wf.wellsfargomobile.l.a(a) == null) goto _L2; else goto _L7
_L7:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        obj = a.c();
        ((i) (obj)).a(as);
        ((i) (obj)).show(com.wf.wellsfargomobile.l.a(a).getSupportFragmentManager(), "MainOpenBrowserDialog");
        return null;
        com.wf.wellsfargomobile.l.a(a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(as)));
        return null;
        if (com.wf.wellsfargomobile.l.a(a) == null) goto _L2; else goto _L8
_L8:
        obj = new Intent(com.wf.wellsfargomobile.l.a(a), com/wf/wellsfargomobile/WebViewActivity);
        ((Intent) (obj)).putExtra("unauth_browse", true);
        ((Intent) (obj)).putExtra("unauth_browse_goto", as);
        com.wf.wellsfargomobile.l.a(a).startActivityForResult(((Intent) (obj)), 5);
        return null;
        as;
        return null;
    }

    protected void a(Void void1)
    {
        a.a.setVisibility(8);
        super.onPostExecute(void1);
    }

    public transient void b(String as[])
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, as);
            return;
        } else
        {
            execute(as);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        a.a.setVisibility(0);
        super.onPreExecute();
    }
}
