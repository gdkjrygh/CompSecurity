// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.AsyncTask;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverProvider

private class <init> extends AsyncTask
{

    final SaverManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        if (!isCancelled())
        {
            SaverManager.access$600(SaverManager.this).resetSaverData();
        }
        return null;
    }

    private ()
    {
        this$0 = SaverManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
