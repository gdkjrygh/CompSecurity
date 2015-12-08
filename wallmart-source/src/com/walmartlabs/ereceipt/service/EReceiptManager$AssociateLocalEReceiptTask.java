// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.AsyncTask;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceiptProvider

private class <init> extends AsyncTask
{

    final EReceiptManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((doInBackground[])aobj);
    }

    protected transient Void doInBackground(doInBackground adoinbackground[])
    {
        String as[] = new String[adoinbackground.length];
        for (int i = 0; i < adoinbackground.length; i++)
        {
            as[i] = adoinbackground[i].doInBackground;
        }

        EReceiptManager.access$300(EReceiptManager.this).associate(EReceiptManager.access$200(EReceiptManager.this), as);
        return null;
    }

    private Q()
    {
        this$0 = EReceiptManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
