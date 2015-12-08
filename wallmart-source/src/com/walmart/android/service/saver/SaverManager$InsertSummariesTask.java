// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.AsyncTask;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverProvider

private class <init> extends AsyncTask
{

    private final Integer mError;
    final SaverManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((ArrayList[])aobj);
    }

    protected transient Void doInBackground(ArrayList aarraylist[])
    {
        if (!isCancelled())
        {
            SaverManager.access$600(SaverManager.this).resetSaverData();
            if (aarraylist != null && aarraylist[0] != null)
            {
                SaverManager.access$600(SaverManager.this).insertSummaries(aarraylist[0]);
            }
        }
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        if (!isCancelled() && SaverManager.access$1400(SaverManager.this) != null)
        {
            sk.access._mth1800(SaverManager.access$1400(SaverManager.this), mError);
        }
    }

    private sk(Integer integer)
    {
        this$0 = SaverManager.this;
        super();
        mError = integer;
    }

    mError(Integer integer, mError merror)
    {
        this(integer);
    }
}
