// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.os.Handler;
import android.util.Log;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.app.qr:
//            QRDataHandler, SMILParser

class Thread extends AsyncCallbackOnThread
{

    final QRDataHandler this$0;

    public void onFailureSameThread(Integer integer, String s)
    {
        Log.e(QRDataHandler.TAG, "Failed to retrieve SMIL data");
        QRDataHandler.access$400(QRDataHandler.this).onInitDone(1, null);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (String)obj1);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((String)obj);
    }

    public void onSuccessSameThread(String s)
    {
        s = new SMILParser(s);
        QRDataHandler.access$502(QRDataHandler.this, s.getAppropriateMediaURL(QRDataHandler.access$600(QRDataHandler.this)));
        if (QRDataHandler.access$700(QRDataHandler.this) != null)
        {
            QRDataHandler.access$400(QRDataHandler.this).onInitDone(1, null);
            return;
        } else
        {
            QRDataHandler.access$400(QRDataHandler.this).onInitDone(2, null);
            return;
        }
    }

    llback(Handler handler)
    {
        this$0 = QRDataHandler.this;
        super(handler);
    }
}
