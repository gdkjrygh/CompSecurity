// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.service.saver:
//            CompetitorsResponse, SaverManager, SaverService

class nit> extends AsyncCallbackOnThread
{

    final e this$1;

    public void onFailureSameThread(Integer integer, CompetitorsResponse competitorsresponse)
    {
        if (callback != null)
        {
            callback.onFailure(integer, competitorsresponse);
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (CompetitorsResponse)obj1);
    }

    public void onSuccessSameThread(CompetitorsResponse competitorsresponse)
    {
        if (callback != null)
        {
            callback.onSuccess(competitorsresponse);
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((CompetitorsResponse)obj);
    }

    l.callback(Handler handler)
    {
        this$1 = this._cls1.this;
        super(handler);
    }

    // Unreferenced inner class com/walmart/android/service/saver/SaverManager$18

/* anonymous class */
    class SaverManager._cls18
        implements SaverManager.ResultCallback
    {

        final SaverManager this$0;
        final AsyncCallback val$callback;
        final String val$storeId;

        public void onResult(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                SaverManager.access$400(SaverManager.this).findNearbyCompetitors(storeId, new SaverManager._cls18._cls1(new Handler()));
            } else
            if (callback != null)
            {
                callback.onFailure(Integer.valueOf(0x15f91), null);
                return;
            }
        }

        public volatile void onResult(Object obj)
        {
            onResult((Boolean)obj);
        }

            
            {
                this$0 = final_savermanager;
                storeId = s;
                callback = AsyncCallback.this;
                super();
            }
    }

}
