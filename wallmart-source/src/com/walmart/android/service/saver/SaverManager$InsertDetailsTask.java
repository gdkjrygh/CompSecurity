// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.AsyncTask;
import com.squareup.otto.Bus;
import com.walmart.android.events.SaverDetailsUpdateEvent;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverProvider

private class mCallback extends AsyncTask
{

    private final AsyncCallbackOnThread mCallback;
    final SaverManager this$0;

    protected transient mCallback doInBackground(mCallback amcallback[])
    {
        amcallback = amcallback[0];
        SaverManager.access$600(SaverManager.this).insertDetails(((this._cls0) (amcallback)).Nbr, ((Nbr) (amcallback)).calDate, ((etails) (amcallback)).ocessedDetails);
        return amcallback;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((doInBackground[])aobj);
    }

    protected void onPostExecute(doInBackground doinbackground)
    {
        mCallback.onSuccessSameThread(doinbackground);
        MessageBus.getBus().post(new SaverDetailsUpdateEvent(doinbackground.Nbr, doinbackground.ocessedDetails));
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((onPostExecute)obj);
    }

    public (AsyncCallbackOnThread asynccallbackonthread)
    {
        this$0 = SaverManager.this;
        super();
        mCallback = asynccallbackonthread;
    }
}
