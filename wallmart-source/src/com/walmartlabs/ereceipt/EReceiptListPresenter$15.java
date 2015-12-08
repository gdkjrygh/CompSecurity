// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.view.View;
import android.view.animation.Animation;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.UndoView;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter, EReceiptListAdapter

class this._cls0
    implements android.view.animation.er
{

    final EReceiptListPresenter this$0;

    public void onAnimationEnd(Animation animation)
    {
        EReceiptListPresenter.access$000(EReceiptListPresenter.this);
        if (!isPopped())
        {
            EReceiptListPresenter.access$1700(EReceiptListPresenter.this).setVisibility(8);
            if (EReceiptListPresenter.access$400(EReceiptListPresenter.this).isEmpty())
            {
                ViewUtil.findViewById(EReceiptListPresenter.access$1800(EReceiptListPresenter.this), com.walmartlabs.android.ereceipt.).setVisibility(0);
                return;
            }
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = EReceiptListPresenter.this;
        super();
    }
}
