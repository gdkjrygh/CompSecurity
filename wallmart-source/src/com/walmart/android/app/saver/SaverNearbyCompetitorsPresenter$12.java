// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.saver.CompetitorsResponse;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverNearbyCompetitorsPresenter

class this._cls0 extends AsyncCallbackOnThread
{

    final SaverNearbyCompetitorsPresenter this$0;

    public void onFailureSameThread(Integer integer, CompetitorsResponse competitorsresponse)
    {
        if (isTop())
        {
            SaverNearbyCompetitorsPresenter.access$1200(SaverNearbyCompetitorsPresenter.this, 102);
        }
        if (!isPopped())
        {
            SaverNearbyCompetitorsPresenter.access$1302(SaverNearbyCompetitorsPresenter.this, new petitorPagerAdapter(SaverNearbyCompetitorsPresenter.access$400(SaverNearbyCompetitorsPresenter.this), Collections.emptyList()));
            SaverNearbyCompetitorsPresenter.access$1400(SaverNearbyCompetitorsPresenter.this);
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (CompetitorsResponse)obj1);
    }

    public void onSuccessSameThread(CompetitorsResponse competitorsresponse)
    {
        if (competitorsresponse.payload == null || competitorsresponse.payload.tors == null || competitorsresponse.payload.tors.size() == 0)
        {
            onFailureSameThread(Integer.valueOf(0x15f90), competitorsresponse);
        } else
        if (!isPopped())
        {
            SaverNearbyCompetitorsPresenter.access$1302(SaverNearbyCompetitorsPresenter.this, new petitorPagerAdapter(SaverNearbyCompetitorsPresenter.access$400(SaverNearbyCompetitorsPresenter.this), competitorsresponse.payload.tors));
            SaverNearbyCompetitorsPresenter.access$1400(SaverNearbyCompetitorsPresenter.this);
            SaverNearbyCompetitorsPresenter.access$1500(SaverNearbyCompetitorsPresenter.this);
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((CompetitorsResponse)obj);
    }

    petitorPagerAdapter(Handler handler)
    {
        this$0 = SaverNearbyCompetitorsPresenter.this;
        super(handler);
    }
}
