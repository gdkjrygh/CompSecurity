// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import com.walmart.android.utils.ViewUtil;
import java.util.Date;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverRewardPresenter

class this._cls0
    implements com.walmart.android.service.saver.back
{

    final SaverRewardPresenter this$0;

    public volatile void onResult(Object obj)
    {
        onResult((Date)obj);
    }

    public void onResult(Date date)
    {
        if (!isPopped())
        {
            SaverRewardPresenter.access$202(SaverRewardPresenter.this, date);
            SaverRewardPresenter.access$300(SaverRewardPresenter.this);
            ViewUtil.findViewById(SaverRewardPresenter.access$400(SaverRewardPresenter.this), 0x7f10010f).setVisibility(8);
            SaverRewardPresenter.access$500(SaverRewardPresenter.this);
        }
    }

    Callback()
    {
        this$0 = SaverRewardPresenter.this;
        super();
    }
}
