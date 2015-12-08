// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;


// Referenced classes of package com.walmart.android.app.saver:
//            SaverDashboardPresenter

class this._cls0
    implements com.walmart.android.service.saver.
{

    final SaverDashboardPresenter this$0;

    public void onResult(Integer integer)
    {
        if (!isPopped())
        {
            SaverDashboardPresenter.access$900(SaverDashboardPresenter.this, integer.intValue());
            SaverDashboardPresenter.access$1000(SaverDashboardPresenter.this, integer.intValue());
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((Integer)obj);
    }

    back()
    {
        this$0 = SaverDashboardPresenter.this;
        super();
    }
}
