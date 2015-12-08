// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverDashboardPresenter

class this._cls0
    implements android.view.boardPresenter._cls7
{

    private float mInitialY;
    final SaverDashboardPresenter this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 32
    //                   2 44;
           goto _L1 _L2 _L1 _L3
_L1:
        return false;
_L2:
        mInitialY = motionevent.getY();
        return false;
_L3:
        if (motionevent.getY() - mInitialY < 0.0F)
        {
            if (!SaverDashboardPresenter.access$500(SaverDashboardPresenter.this))
            {
                SaverDashboardPresenter.access$600(SaverDashboardPresenter.this);
                ViewUtil.findViewById(SaverDashboardPresenter.access$700(SaverDashboardPresenter.this), 0x7f100498).setVisibility(0);
                SaverDashboardPresenter.access$502(SaverDashboardPresenter.this, true);
            }
            SaverDashboardPresenter.access$700(SaverDashboardPresenter.this).setOnTouchListener(null);
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    ()
    {
        this$0 = SaverDashboardPresenter.this;
        super();
    }
}
