// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import com.wf.wellsfargomobile.d.a;
import com.wf.wellsfargomobile.d.c;

// Referenced classes of package com.wf.wellsfargomobile:
//            QRCodeScanActivity

class al extends Thread
{

    final String a;
    final QRCodeScanActivity b;

    al(QRCodeScanActivity qrcodescanactivity, String s)
    {
        b = qrcodescanactivity;
        a = s;
        super();
    }

    public void run()
    {
        (new a(c.a, (new StringBuilder()).append(a).append("?errcode=").append("timeout_error").toString(), null, null, b)).b().toString();
    }
}
