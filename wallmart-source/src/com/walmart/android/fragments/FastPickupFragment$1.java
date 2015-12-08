// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import com.walmart.android.app.fastpickup.FastPickupStorePresenter;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.Criteria;

// Referenced classes of package com.walmart.android.fragments:
//            FastPickupFragment

class this._cls0
    implements Criteria
{

    final FastPickupFragment this$0;

    public boolean fullfilled(Presenter presenter)
    {
        return presenter.getClass().equals(com/walmart/android/app/fastpickup/FastPickupStorePresenter);
    }

    public volatile boolean fullfilled(Object obj)
    {
        return fullfilled((Presenter)obj);
    }

    resenter()
    {
        this$0 = FastPickupFragment.this;
        super();
    }
}
