// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;


// Referenced classes of package com.walmart.android.ui:
//            PresenterStack, Presenter

class val.previousTop
    implements ransitionListener
{

    final PresenterStack this$0;
    final Presenter val$presenter;
    final Presenter val$previousTop;

    public void onTransitionDone()
    {
        val$presenter.onPushed();
        PresenterStack.access$000(PresenterStack.this, val$presenter);
        if (val$previousTop != null)
        {
            Presenter presenter1 = peek();
            if (val$previousTop != presenter1)
            {
                val$previousTop.onNewTop();
            }
        }
    }

    ransitionListener()
    {
        this$0 = final_presenterstack;
        val$presenter = presenter1;
        val$previousTop = Presenter.this;
        super();
    }
}
