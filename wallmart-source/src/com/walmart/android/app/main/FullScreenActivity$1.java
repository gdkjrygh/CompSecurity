// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.main:
//            FullScreenActivity

class this._cls0
    implements com.walmart.android.ui.er
{

    final FullScreenActivity this$0;

    public boolean onInterceptPresenterPush(Presenter presenter, boolean flag, boolean flag1)
    {
        return false;
    }

    public void onPresenterPopped(Presenter presenter)
    {
        setHeaderText(presenter.getTitleText());
    }

    public void onPresenterPushed(Presenter presenter)
    {
        setHeaderText(presenter.getTitleText());
    }

    public void onPresenterTitleUpdated(Presenter presenter)
    {
        setHeaderText(presenter.getTitleText());
    }

    ()
    {
        this$0 = FullScreenActivity.this;
        super();
    }
}
