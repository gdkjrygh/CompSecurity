// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFeedbackPresenter

class this._cls0
    implements android.view.dbackPresenter._cls3
{

    final SaverFeedbackPresenter this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            SaverFeedbackPresenter.access$200(SaverFeedbackPresenter.this);
        }
        return false;
    }

    ()
    {
        this$0 = SaverFeedbackPresenter.this;
        super();
    }
}
