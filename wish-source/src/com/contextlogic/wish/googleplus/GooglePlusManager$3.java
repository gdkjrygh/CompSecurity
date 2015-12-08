// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.googleplus;

import android.app.Activity;
import com.braintreepayments.api.Braintree;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.googleplus:
//            GooglePlusManager

class lletClientCallback
    implements com.contextlogic.wish.api.service.kenService.SuccessCallback
{

    final GooglePlusManager this$0;
    final Activity val$activity;
    final lletClientCallback val$callback;
    final CartManager val$cartManager;

    public void onServiceSucceeded(String s)
    {
        Braintree.setup(val$activity, s, new com.braintreepayments.api.Braintree.BraintreeSetupFinishedListener() {

            final GooglePlusManager._cls3 this$1;

            public void onBraintreeSetupFinished(boolean flag, Braintree braintree, String s1, Exception exception)
            {
                if (flag && braintree != null)
                {
                    GooglePlusManager.access$302(this$0, braintree);
                    getWalletClient(cartManager, activity, callback);
                    return;
                }
                if (callback != null)
                {
                    callback.onWalletClientLoadFailed(413);
                }
                clearWalletClientCallback();
            }

            
            {
                this$1 = GooglePlusManager._cls3.this;
                super();
            }
        });
    }

    lletClientCallback()
    {
        this$0 = final_googleplusmanager;
        val$activity = activity1;
        val$cartManager = cartmanager;
        val$callback = lletClientCallback.this;
        super();
    }
}
