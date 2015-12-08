// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal;

import com.contextlogic.wish.ui.activity.root.RootActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal:
//            CheckoutCartManager

class this._cls0
    implements com.contextlogic.wish.api.service.back
{

    final CheckoutCartManager this$0;

    public void onServiceFailed()
    {
        hideLoadingSpinner();
        showErrorMessage(CheckoutCartManager.access$100(CheckoutCartManager.this).getString(0x7f060175));
    }

    ()
    {
        this$0 = CheckoutCartManager.this;
        super();
    }
}
