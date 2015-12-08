// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            InstantAnswersAdapter

class val.type
    implements android.view.AnswersAdapter._cls4
{

    final InstantAnswersAdapter this$0;
    final int val$type;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (1 == motionevent.getAction())
        {
            InstantAnswersAdapter.access$000(InstantAnswersAdapter.this, val$type);
        }
        return false;
    }

    ()
    {
        this$0 = final_instantanswersadapter;
        val$type = I.this;
        super();
    }
}
