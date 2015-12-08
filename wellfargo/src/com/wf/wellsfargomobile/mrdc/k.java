// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;

import com.wf.wellsfargomobile.BaseWebViewActivity;

// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            i

class k
    implements Runnable
{

    final i a;

    k(i j)
    {
        a = j;
        super();
    }

    public void run()
    {
        i.a(a).loadURL("/deposit/depositCancel.action?");
    }
}
