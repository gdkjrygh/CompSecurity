// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping;

import android.content.Context;
import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping:
//            CartShippingView

class this._cls0
    implements com.contextlogic.wish.api.service.ervice.FailureCallback
{

    final CartShippingView this$0;

    public void onServiceFailed(String s)
    {
        CartShippingView.access$1100(CartShippingView.this).hideLoadingSpinner();
        HashMap hashmap = new HashMap();
        if (s != null)
        {
            hashmap.put("error_message", s);
        }
        CommerceLogger.logError(com.contextlogic.wish.analytics.on.NATIVE_SAVE_SHIPPING_INFO, com.contextlogic.wish.analytics.lt.API_ERROR, hashmap);
        CartShippingView.access$1200(CartShippingView.this, getWishAnalyticsEventForError());
        CartShippingView.access$1300(CartShippingView.this).showErrorMessage(s, getContext().getString(0x7f060459));
    }

    ()
    {
        this$0 = CartShippingView.this;
        super();
    }
}
