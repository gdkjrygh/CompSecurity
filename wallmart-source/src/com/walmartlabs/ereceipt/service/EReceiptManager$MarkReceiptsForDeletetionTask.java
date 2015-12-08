// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.AsyncTask;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceipt, EReceiptProvider

private class <init> extends AsyncTask
{

    final EReceiptManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((EReceipt[])aobj);
    }

    protected transient Void doInBackground(EReceipt aereceipt[])
    {
        int j = aereceipt.length;
        for (int i = 0; i < j; i++)
        {
            EReceipt ereceipt = aereceipt[i];
            EReceiptManager.access$300(EReceiptManager.this).markForDeletion(new String[] {
                ereceipt.uuid
            });
        }

        return null;
    }

    private ()
    {
        this$0 = EReceiptManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
