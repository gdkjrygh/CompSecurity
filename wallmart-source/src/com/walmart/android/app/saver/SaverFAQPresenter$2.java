// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFAQPresenter

class this._cls0
    implements android.widget.istener
{

    final SaverFAQPresenter this$0;

    public void onTabChanged(String s)
    {
        Bus bus = MessageBus.getBus();
        com.walmartlabs.anivia.ilder ilder = new com.walmartlabs.anivia.ilder("pageView");
        if ("howto".equals(s))
        {
            s = "About Saver - How To";
        } else
        {
            s = "About Saver - FAQ";
        }
        bus.post(ilder.putString("name", s).putString("section", "Saver").putString("subCategory", "Savings Catcher"));
    }

    ()
    {
        this$0 = SaverFAQPresenter.this;
        super();
    }
}
