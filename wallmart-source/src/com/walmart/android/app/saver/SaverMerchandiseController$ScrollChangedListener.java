// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import android.view.ViewTreeObserver;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.HorizontalListRecyclerView;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverMerchandiseController

private class <init>
    implements android.view.lChangedListener
{

    final SaverMerchandiseController this$0;

    public void onScrollChanged()
    {
        if (SaverMerchandiseController.access$700(SaverMerchandiseController.this).getVisibility() == 8 && ViewUtil.viewDrawnInView(SaverMerchandiseController.access$1300(SaverMerchandiseController.this), SaverMerchandiseController.access$400(SaverMerchandiseController.this), 1.0F, SaverMerchandiseController.access$1400(SaverMerchandiseController.this), SaverMerchandiseController.access$1500(SaverMerchandiseController.this)))
        {
            SaverMerchandiseController.access$1300(SaverMerchandiseController.this).getViewTreeObserver().removeOnScrollChangedListener(this);
            SaverMerchandiseController.access$1600(SaverMerchandiseController.this);
        }
    }

    private ()
    {
        this$0 = SaverMerchandiseController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
