// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverRedeemPresenter

class this._cls0
    implements com.walmart.android.service.saver.back
{

    final SaverRedeemPresenter this$0;

    public void onResult(Integer integer)
    {
        SaverRedeemPresenter.access$300(SaverRedeemPresenter.this);
        ViewUtil.findViewById(SaverRedeemPresenter.access$400(SaverRedeemPresenter.this), 0x7f10010f).setVisibility(8);
    }

    public volatile void onResult(Object obj)
    {
        onResult((Integer)obj);
    }

    Callback()
    {
        this$0 = SaverRedeemPresenter.this;
        super();
    }
}
