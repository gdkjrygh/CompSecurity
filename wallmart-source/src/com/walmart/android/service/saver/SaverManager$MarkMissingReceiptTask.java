// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.database.Cursor;
import android.os.AsyncTask;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverProvider, SaverReceipt, SaverContractUtil

private class <init> extends AsyncTask
{

    final SaverManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient Void doInBackground(String as[])
    {
        Cursor cursor;
        cursor = SaverManager.access$600(SaverManager.this).getSaverReceipt(as[0], as[1]);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (cursor.moveToFirst())
        {
            SaverReceipt saverreceipt = SaverContractUtil.populateSaverReceipt(cursor, new SaverReceipt());
            if ((saverreceipt.state) || saverreceipt.state == .())
            {
                SaverManager.access$600(SaverManager.this).updateMissingReceipt(as[0], as[1], true);
            }
        }
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
        as;
        if (cursor != null)
        {
            cursor.close();
        }
        throw as;
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
