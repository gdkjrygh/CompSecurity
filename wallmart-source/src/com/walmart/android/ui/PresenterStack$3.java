// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;


// Referenced classes of package com.walmart.android.ui:
//            PresenterStack, Presenter

class val.presenter
    implements ransitionListener
{

    final PresenterStack this$0;
    final Presenter val$presenter;

    public void onTransitionDone()
    {
        val$presenter.onAfterPop();
    }

    ransitionListener()
    {
        this$0 = final_presenterstack;
        val$presenter = Presenter.this;
        super();
    }
}
