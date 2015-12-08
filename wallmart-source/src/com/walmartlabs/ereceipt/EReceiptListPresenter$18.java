// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter

class val.slideInAnimation
    implements android.view.resenter._cls18
{

    final EReceiptListPresenter this$0;
    final ViewGroup val$scanContainer;
    final Animation val$slideInAnimation;
    final Animation val$slideOutAnimation;
    final float val$threshold;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 252
    //                   2 49;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        EReceiptListPresenter.access$2002(EReceiptListPresenter.this, motionevent.getY());
        continue; /* Loop/switch isn't completed */
_L4:
        float f = motionevent.getY();
        float f1 = f - EReceiptListPresenter.access$2000(EReceiptListPresenter.this);
        if (f1 < 0.0F)
        {
            if (f1 < EReceiptListPresenter.access$2100(EReceiptListPresenter.this))
            {
                if (f1 < -val$threshold && EReceiptListPresenter.access$1900(EReceiptListPresenter.this) == 0)
                {
                    EReceiptListPresenter.access$1902(EReceiptListPresenter.this, 2);
                    val$scanContainer.startAnimation(val$slideOutAnimation);
                }
                EReceiptListPresenter.access$2102(EReceiptListPresenter.this, f1);
            } else
            {
                EReceiptListPresenter.access$2002(EReceiptListPresenter.this, f);
                EReceiptListPresenter.access$2102(EReceiptListPresenter.this, 0.0F);
            }
        }
        if (f1 > 0.0F)
        {
            if (f1 > EReceiptListPresenter.access$2100(EReceiptListPresenter.this))
            {
                if (f1 > val$threshold && EReceiptListPresenter.access$1900(EReceiptListPresenter.this) == 1)
                {
                    EReceiptListPresenter.access$1902(EReceiptListPresenter.this, 2);
                    val$scanContainer.startAnimation(val$slideInAnimation);
                }
                EReceiptListPresenter.access$2102(EReceiptListPresenter.this, f1);
            } else
            {
                EReceiptListPresenter.access$2002(EReceiptListPresenter.this, f);
                EReceiptListPresenter.access$2102(EReceiptListPresenter.this, 0.0F);
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        EReceiptListPresenter.access$2102(EReceiptListPresenter.this, 0.0F);
        if (true) goto _L1; else goto _L5
_L5:
    }

    ()
    {
        this$0 = final_ereceiptlistpresenter;
        val$threshold = f;
        val$scanContainer = viewgroup;
        val$slideOutAnimation = animation;
        val$slideInAnimation = Animation.this;
        super();
    }
}
