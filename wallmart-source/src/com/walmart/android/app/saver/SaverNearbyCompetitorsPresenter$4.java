// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.support.v4.app.FragmentActivity;
import com.walmart.android.util.SaverUtils;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverNearbyCompetitorsPresenter, SaverMerchandiseController

class this._cls0
    implements com.walmart.android.wmservice.this._cls0
{

    final SaverNearbyCompetitorsPresenter this$0;

    public void onFailure(int i)
    {
label0:
        {
            if (isTop())
            {
                if (4 != i)
                {
                    break label0;
                }
                SaverNearbyCompetitorsPresenter.access$400(SaverNearbyCompetitorsPresenter.this).startActivityForResult(SaverUtils.createSignInIntent(SaverNearbyCompetitorsPresenter.access$400(SaverNearbyCompetitorsPresenter.this)), 1);
                SaverNearbyCompetitorsPresenter.access$400(SaverNearbyCompetitorsPresenter.this).overridePendingTransition(0x7f05002c, 0x7f050033);
            }
            return;
        }
        SaverNearbyCompetitorsPresenter.access$500(SaverNearbyCompetitorsPresenter.this, 101);
    }

    public void onSuccess()
    {
        if (!isPopped())
        {
            SaverNearbyCompetitorsPresenter.access$200(SaverNearbyCompetitorsPresenter.this);
            syncReceipts();
            SaverNearbyCompetitorsPresenter.access$300(SaverNearbyCompetitorsPresenter.this).loadMerchandise();
        }
    }

    ()
    {
        this$0 = SaverNearbyCompetitorsPresenter.this;
        super();
    }
}
