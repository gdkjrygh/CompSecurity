// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptFragment, SaverFAQPresenter, SaverFeedbackConfirmationPresenter

private class <init>
    implements <init>
{

    final SaverReceiptFragment this$0;

    public void onEligibilityLinkClicked()
    {
        SaverFAQPresenter saverfaqpresenter = new SaverFAQPresenter(getActivity(), "faq", "itemEligibility");
        SaverReceiptFragment.access$1300(SaverReceiptFragment.this).pushPresenter(saverfaqpresenter, true);
    }

    public void onFeedbackSubmitted()
    {
        SaverReceiptFragment.access$1200(SaverReceiptFragment.this).pushAndReplacePresenter(new SaverFeedbackConfirmationPresenter(getActivity()), true);
    }

    private ()
    {
        this$0 = SaverReceiptFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
