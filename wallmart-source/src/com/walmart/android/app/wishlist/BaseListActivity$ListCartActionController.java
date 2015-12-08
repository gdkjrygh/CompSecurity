// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Activity;
import com.walmart.android.app.main.CartActionController;
import com.walmart.android.events.SwitchFragmentEvent;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseListActivity

class this._cls0 extends CartActionController
{

    final BaseListActivity this$0;

    protected void switchToCart()
    {
        onSwitchFragmentEvent(new SwitchFragmentEvent(com.walmart.android.config.nt, null, true));
    }

    public (Activity activity)
    {
        this$0 = BaseListActivity.this;
        super(activity);
    }
}
