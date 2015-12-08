// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;

import android.content.DialogInterface;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            i

class j
    implements android.content.DialogInterface.OnClickListener
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int k)
    {
        WFApp.f();
        i.a(a).loadURL("/deposit/depositCancel.action?");
    }
}
