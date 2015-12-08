// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface;

import android.content.DialogInterface;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.a.a;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface:
//            c, a

class e
    implements android.content.DialogInterface.OnClickListener
{

    final c a;

    e(c c1)
    {
        a = c1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (WFApp.d())
        {
            com.wf.wellsfargomobile.webview.javascriptinterface.a.a(a.a).signOff((new StringBuilder()).append(com.wf.wellsfargomobile.a.a.c()).append("/auth/logout").toString());
            return;
        } else
        {
            com.wf.wellsfargomobile.webview.javascriptinterface.a.a(a.a).signOff();
            return;
        }
    }
}
