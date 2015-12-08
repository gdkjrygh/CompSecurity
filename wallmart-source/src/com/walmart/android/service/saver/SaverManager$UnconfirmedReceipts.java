// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.AsyncTask;
import java.util.Map;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager

private class <init> extends AsyncTask
{

    final SaverManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        SaverManager.access$2000(SaverManager.this).clear();
        SaverManager.access$2100(SaverManager.this, null, SaverManager.access$2000(SaverManager.this));
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
