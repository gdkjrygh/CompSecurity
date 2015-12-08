// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;

import android.view.View;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.GoogleWalletHelper;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing:
//            CartBillingView

class this._cls0
    implements android.view.r
{

    final CartBillingView this$0;

    public void onClick(View view)
    {
        (new GoogleWalletHelper(CartBillingView.access$1500(CartBillingView.this))).changeMaskedWallet(new com.contextlogic.wish.ui.fragment.cartmodal.ui.GoogleWalletHelper.ChangeListener() {

            final CartBillingView._cls10 this$1;

            public void onChangeCancelled()
            {
            }

            public void onChangeComplete()
            {
                CartBillingView.access$1300(this$0);
            }

            public void onChangeFailed()
            {
            }

            
            {
                this$1 = CartBillingView._cls10.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = CartBillingView.this;
        super();
    }
}
