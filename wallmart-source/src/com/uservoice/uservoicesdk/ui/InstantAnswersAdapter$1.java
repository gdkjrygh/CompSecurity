// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.view.View;
import android.widget.Button;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            InstantAnswersAdapter

class val.button
    implements android.view.AnswersAdapter._cls1
{

    final InstantAnswersAdapter this$0;
    final Button val$button;

    public void onClick(View view)
    {
        onButtonTapped(val$button);
    }

    ()
    {
        this$0 = final_instantanswersadapter;
        val$button = Button.this;
        super();
    }
}
