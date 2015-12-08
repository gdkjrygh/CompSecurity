// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverService, CompetitorsResponse

class val.callback
    implements ultCallback
{

    final SaverManager this$0;
    final AsyncCallback val$callback;
    final String val$storeId;

    public void onResult(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            SaverManager.access$400(SaverManager.this).findNearbyCompetitors(val$storeId, new AsyncCallbackOnThread(new Handler()) {

                final SaverManager._cls18 this$1;

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

            
            {
                this$1 = SaverManager._cls18.this;
                super(handler);
            }
            });
        } else
        if (val$callback != null)
        {
            val$callback.onFailure(Integer.valueOf(0x15f91), null);
            return;
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((Boolean)obj);
    }

    <init>()
    {
        this$0 = final_savermanager;
        val$storeId = s;
        val$callback = AsyncCallback.this;
        super();
    }
}
