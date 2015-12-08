// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.b;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.ba;
import com.wf.wellsfargomobile.be;
import com.wf.wellsfargomobile.webview.c.aa;
import com.wf.wellsfargomobile.webview.c.ad;
import com.wf.wellsfargomobile.webview.c.b;
import com.wf.wellsfargomobile.webview.c.c;
import com.wf.wellsfargomobile.webview.c.d;
import com.wf.wellsfargomobile.webview.c.e;
import com.wf.wellsfargomobile.webview.c.f;
import com.wf.wellsfargomobile.webview.c.g;
import com.wf.wellsfargomobile.webview.c.h;
import com.wf.wellsfargomobile.webview.c.i;
import com.wf.wellsfargomobile.webview.c.j;
import com.wf.wellsfargomobile.webview.c.k;
import com.wf.wellsfargomobile.webview.c.l;
import com.wf.wellsfargomobile.webview.c.m;
import com.wf.wellsfargomobile.webview.c.n;
import com.wf.wellsfargomobile.webview.c.o;
import com.wf.wellsfargomobile.webview.c.p;
import com.wf.wellsfargomobile.webview.c.q;
import com.wf.wellsfargomobile.webview.c.r;
import com.wf.wellsfargomobile.webview.c.s;
import com.wf.wellsfargomobile.webview.c.t;
import com.wf.wellsfargomobile.webview.c.u;
import com.wf.wellsfargomobile.webview.c.v;
import com.wf.wellsfargomobile.webview.c.w;
import com.wf.wellsfargomobile.webview.c.x;
import com.wf.wellsfargomobile.webview.c.y;
import com.wf.wellsfargomobile.webview.c.z;
import java.util.PriorityQueue;

// Referenced classes of package com.wf.wellsfargomobile.webview.b:
//            k, b

public class a extends com.wf.wellsfargomobile.webview.b.k
{

    public a()
    {
    }

    public int a()
    {
        return 0;
    }

    public void a(BaseWebViewActivity basewebviewactivity, WebView webview)
    {
        webview.getSettings().setCacheMode(-1);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            webview.setOverScrollMode(2);
        }
        webview.addJavascriptInterface(new com.wf.wellsfargomobile.webview.javascriptinterface.a(basewebviewactivity), "Common");
        webview.setOnLongClickListener(new com.wf.wellsfargomobile.webview.b.b(this));
        PriorityQueue priorityqueue = new PriorityQueue(50, new ad());
        priorityqueue.add(new com.wf.wellsfargomobile.webview.c.a());
        priorityqueue.add(new b());
        priorityqueue.add(new c());
        priorityqueue.add(new e());
        priorityqueue.add(new f());
        priorityqueue.add(new g());
        priorityqueue.add(new h());
        priorityqueue.add(new i());
        priorityqueue.add(new j());
        priorityqueue.add(new k());
        priorityqueue.add(new m());
        priorityqueue.add(new n());
        priorityqueue.add(new l());
        priorityqueue.add(new o());
        priorityqueue.add(new p());
        priorityqueue.add(new q());
        priorityqueue.add(new r());
        priorityqueue.add(new s());
        priorityqueue.add(new t());
        priorityqueue.add(new u());
        priorityqueue.add(new v());
        priorityqueue.add(new w());
        priorityqueue.add(new x());
        priorityqueue.add(new z());
        priorityqueue.add(new aa());
        priorityqueue.add(new y());
        priorityqueue.add(new d());
        webview.setWebViewClient(new ba(basewebviewactivity, priorityqueue));
        webview.setWebChromeClient(new be(basewebviewactivity));
    }
}
