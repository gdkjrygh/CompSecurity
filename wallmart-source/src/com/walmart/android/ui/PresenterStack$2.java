// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;


// Referenced classes of package com.walmart.android.ui:
//            PresenterStack, Presenter

class val.replacedToPop
    implements ransitionListener
{

    final PresenterStack this$0;
    final Presenter val$presenter;
    final Presenter val$replacedToPop;

    public void onTransitionDone()
    {
        val$presenter.onPushed();
        PresenterStack.access$000(PresenterStack.this, val$presenter);
        if (val$replacedToPop != null)
        {
            val$replacedToPop.onAfterPop();
        }
    }

    ransitionListener()
    {
        this$0 = final_presenterstack;
        val$presenter = presenter1;
        val$replacedToPop = Presenter.this;
        super();
    }
}
