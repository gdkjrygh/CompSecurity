// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.database.Cursor;
import android.os.AsyncTask;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverProvider

class ultCallback extends AsyncTask
{

    final SaverManager this$0;
    final ultCallback val$callback;

    protected transient Integer doInBackground(Void avoid[])
    {
        Cursor cursor = SaverManager.access$600(SaverManager.this).getUnseenReceipts(SaverManager.access$500(SaverManager.this));
        if (cursor == null) goto _L2; else goto _L1
_L1:
        int i = cursor.getCount();
        Integer integer = Integer.valueOf(i);
        avoid = integer;
        if (cursor != null)
        {
            cursor.close();
            avoid = integer;
        }
_L4:
        return avoid;
_L2:
        Integer integer1;
        integer1 = Integer.valueOf(0);
        avoid = integer1;
        if (cursor == null) goto _L4; else goto _L3
_L3:
        cursor.close();
        return integer1;
        avoid;
        if (cursor != null)
        {
            cursor.close();
        }
        throw avoid;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Integer integer)
    {
        val$callback.onResult(integer);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Integer)obj);
    }

    ultCallback()
    {
        this$0 = final_savermanager;
        val$callback = ultCallback.this;
        super();
    }
}
