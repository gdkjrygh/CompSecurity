// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;


// Referenced classes of package com.walmart.android.app.bridge:
//            HybridPresenter

class this._cls0
    implements Runnable
{

    final HybridPresenter this$0;

    public void run()
    {
        if (HybridPresenter.access$000(HybridPresenter.this) && (!HybridPresenter.access$100(HybridPresenter.this) || !HybridPresenter.access$200(HybridPresenter.this)))
        {
            dismissDialog(1);
        }
    }

    ()
    {
        this$0 = HybridPresenter.this;
        super();
    }
}
