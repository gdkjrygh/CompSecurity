// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.database.Cursor;
import android.os.AsyncTask;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverProvider

class sultCallback extends AsyncTask
{

    final SaverManager this$0;
    final sultCallback val$callback;

    protected transient Cursor doInBackground(Boolean aboolean[])
    {
        return SaverManager.access$600(SaverManager.this).getAllReceipts(SaverManager.access$500(SaverManager.this), aboolean[0].booleanValue());
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Boolean[])aobj);
    }

    protected void onPostExecute(Cursor cursor)
    {
        val$callback.onResult(cursor);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Cursor)obj);
    }

    sultCallback()
    {
        this$0 = final_savermanager;
        val$callback = sultCallback.this;
        super();
    }
}
