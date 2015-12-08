// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import java.util.Date;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverPresenterSyncCallback, SaverRewardPresenter

class ack extends SaverPresenterSyncCallback
{

    final SaverRewardPresenter this$0;

    protected void onSyncResult(Integer integer)
    {
        if (!isPopped())
        {
            SaverManager.get().getActiveSince(new com.walmart.android.service.saver.SaverManager.ResultCallback() {

                final SaverRewardPresenter._cls3 this$1;

                public volatile void onResult(Object obj)
                {
                    onResult((Date)obj);
                }

                public void onResult(Date date)
                {
                    if (!isPopped())
                    {
                        SaverRewardPresenter.access$202(this$0, date);
                        SaverRewardPresenter.access$300(this$0);
                        ViewUtil.findViewById(SaverRewardPresenter.access$400(this$0), 0x7f10010f).setVisibility(8);
                        SaverRewardPresenter.access$500(this$0);
                    }
                }

            
            {
                this$1 = SaverRewardPresenter._cls3.this;
                super();
            }
            });
        }
    }

    protected void showNoNetworkDialog()
    {
        SaverRewardPresenter.access$600(SaverRewardPresenter.this, 0);
    }

    protected void showUnknownErrorDialog()
    {
        SaverRewardPresenter.access$700(SaverRewardPresenter.this, 1);
    }

    _cls1.this._cls1(Presenter presenter)
    {
        this$0 = SaverRewardPresenter.this;
        super(presenter);
    }
}
