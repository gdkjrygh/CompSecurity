// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;


// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            CheckoutSignupCartManager

class this._cls0
    implements com.contextlogic.wish.api.service.ailureCallback
{

    final CheckoutSignupCartManager this$0;

    public void onServiceFailed(String s)
    {
        hideLoadingSpinner();
        CheckoutSignupCartManager.access$300(CheckoutSignupCartManager.this, s);
    }

    allback()
    {
        this$0 = CheckoutSignupCartManager.this;
        super();
    }
}
