// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;


// Referenced classes of package com.walmart.android.app.qr:
//            QRDataHandler

class val.url
    implements Runnable
{

    final QRDataHandler this$0;
    final String val$url;

    public void run()
    {
        QRDataHandler.access$400(QRDataHandler.this).onInitDone(0, val$url);
    }

    llback()
    {
        this$0 = final_qrdatahandler;
        val$url = String.this;
        super();
    }
}
