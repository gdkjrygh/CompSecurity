// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import com.wf.wellsfargomobile.d.a;
import com.wf.wellsfargomobile.d.c;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.wf.wellsfargomobile:
//            QRCodeScanActivity

class am extends Thread
{

    final String a;
    final String b;
    final QRCodeScanActivity c;

    am(QRCodeScanActivity qrcodescanactivity, String s, String s1)
    {
        c = qrcodescanactivity;
        a = s;
        b = s1;
        super();
    }

    public void run()
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        linkedhashmap.put("linkName", "QR_PaybyQRCode");
        linkedhashmap.put("referrerPage", a);
        (new a(c.b, b, linkedhashmap, null, c)).b().toString();
    }
}
