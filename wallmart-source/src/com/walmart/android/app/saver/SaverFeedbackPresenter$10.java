// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.AniviaAnalytics;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.FeedbackRequest;
import com.walmart.android.service.saver.StatusResponse;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFeedbackPresenter

class  extends AsyncCallbackOnThread
{

    final SaverFeedbackPresenter this$0;
    final FeedbackRequest val$request;

    public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
    {
        SaverFeedbackPresenter.access$1600(SaverFeedbackPresenter.this, 0);
        SaverFeedbackPresenter.access$1700(SaverFeedbackPresenter.this, 1);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (StatusResponse)obj1);
    }

    public void onSuccessSameThread(StatusResponse statusresponse)
    {
        SaverFeedbackPresenter.access$1800(SaverFeedbackPresenter.this, 0);
        SaverFeedbackPresenter.access$000(SaverFeedbackPresenter.this).onFeedbackSubmitted();
        statusresponse = (new com.walmartlabs.anivia.<init>("missedCompForm")).putString("itemUPC", SaverFeedbackPresenter.access$2100(SaverFeedbackPresenter.this)).putString("itemName", SaverFeedbackPresenter.access$2000(SaverFeedbackPresenter.this).toString()).putString("itemPrice", SaverFeedbackPresenter.access$1900(SaverFeedbackPresenter.this).replaceAll("\\$", "").replaceAll(",", "")).putString("startDate", AniviaAnalytics.DATE_FORMAT.format(SaverFeedbackPresenter.access$300(SaverFeedbackPresenter.this).getTime())).putString("endDate", AniviaAnalytics.DATE_FORMAT.format(SaverFeedbackPresenter.access$800(SaverFeedbackPresenter.this).getTime()));
        if (val$request.competitorName != null)
        {
            statusresponse.putString("compName", val$request.competitorName);
        }
        MessageBus.getBus().post(statusresponse);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((StatusResponse)obj);
    }

    ionCallbacks(FeedbackRequest feedbackrequest)
    {
        this$0 = final_saverfeedbackpresenter;
        val$request = feedbackrequest;
        super(Handler.this);
    }
}
