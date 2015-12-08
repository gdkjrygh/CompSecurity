// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.view.View;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            InstantAnswersAdapter

class val.view
    implements Runnable
{

    final InstantAnswersAdapter this$0;
    final View val$view;

    public void run()
    {
        val$view.setFocusableInTouchMode(true);
        val$view.setFocusable(true);
    }

    ()
    {
        this$0 = final_instantanswersadapter;
        val$view = View.this;
        super();
    }
}
