// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;
import android.view.View;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.saver.RecommendationResponse;
import java.util.List;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverMerchandiseController

class this._cls0 extends AsyncCallbackOnThread
{

    final SaverMerchandiseController this$0;

    public void onFailureSameThread(Integer integer, RecommendationResponse recommendationresponse)
    {
        SaverMerchandiseController.access$200(SaverMerchandiseController.this).setVisibility(8);
        SaverMerchandiseController.access$300(SaverMerchandiseController.this).setVisibility(0);
        SaverMerchandiseController.access$500(SaverMerchandiseController.this, SaverMerchandiseController.access$400(SaverMerchandiseController.this));
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (RecommendationResponse)obj1);
    }

    public void onSuccessSameThread(RecommendationResponse recommendationresponse)
    {
        List list = recommendationresponse.getItems();
        if (list.isEmpty())
        {
            onFailureSameThread(Integer.valueOf(0x15f91), recommendationresponse);
            return;
        }
        SaverMerchandiseController.access$600(SaverMerchandiseController.this).setDataSource(list);
        if (SaverMerchandiseController.access$600(SaverMerchandiseController.this).getItemCount() <= 0)
        {
            onFailureSameThread(Integer.valueOf(0x15f90), recommendationresponse);
            return;
        } else
        {
            SaverMerchandiseController.access$200(SaverMerchandiseController.this).setVisibility(0);
            SaverMerchandiseController.access$300(SaverMerchandiseController.this).setVisibility(8);
            SaverMerchandiseController.access$700(SaverMerchandiseController.this).setVisibility(8);
            SaverMerchandiseController.access$802(SaverMerchandiseController.this, recommendationresponse.athBeacon);
            SaverMerchandiseController.access$900(SaverMerchandiseController.this);
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((RecommendationResponse)obj);
    }

    commendedItemsAdapter(Handler handler)
    {
        this$0 = SaverMerchandiseController.this;
        super(handler);
    }
}
