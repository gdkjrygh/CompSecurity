// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.saver.CompetitorsResponse;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFeedbackPresenter

class > extends AsyncCallbackOnThread
{

    final SaverFeedbackPresenter this$0;

    public void onFailureSameThread(Integer integer, CompetitorsResponse competitorsresponse)
    {
        if (isTop())
        {
            SaverFeedbackPresenter.access$1200(SaverFeedbackPresenter.this, 1);
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (CompetitorsResponse)obj1);
    }

    public void onSuccessSameThread(CompetitorsResponse competitorsresponse)
    {
label0:
        {
            if (!isPopped())
            {
                if (competitorsresponse.payload != null && competitorsresponse.payload.competitors != null && competitorsresponse.payload.competitors.size() != 0)
                {
                    break label0;
                }
                onFailureSameThread(Integer.valueOf(0x15f90), competitorsresponse);
            }
            return;
        }
        HashSet hashset = new HashSet(competitorsresponse.payload.competitors.size());
        for (competitorsresponse = competitorsresponse.payload.competitors.iterator(); competitorsresponse.hasNext(); hashset.add(((com.walmart.android.service.saver.titor)competitorsresponse.next()).name)) { }
        competitorsresponse = new ArrayList(hashset);
        Collections.sort(competitorsresponse, Collator.getInstance());
        SaverFeedbackPresenter.access$1300(SaverFeedbackPresenter.this).clear();
        SaverFeedbackPresenter.access$1300(SaverFeedbackPresenter.this).addAll(competitorsresponse);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((CompetitorsResponse)obj);
    }

    ompetitor(Handler handler)
    {
        this$0 = SaverFeedbackPresenter.this;
        super(handler);
    }
}
