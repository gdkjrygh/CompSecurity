// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui;

import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui:
//            GoogleWalletHelper

class angeListener
    implements com.contextlogic.wish.googleplus.letClientCallback
{

    final GoogleWalletHelper this$0;
    final angeListener val$changeListener;

    public void onWalletClientLoadFailed(int i)
    {
        GoogleWalletHelper.access$100(GoogleWalletHelper.this).hideLoadingSpinner();
        GoogleWalletHelper.access$100(GoogleWalletHelper.this).showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(i, null));
        val$changeListener.onChangeFailed();
    }

    public void onWalletClientLoaded(GoogleApiClient googleapiclient)
    {
        GoogleWalletHelper.access$000(GoogleWalletHelper.this, googleapiclient, val$changeListener);
    }

    angeListener()
    {
        this$0 = final_googlewallethelper;
        val$changeListener = angeListener.this;
        super();
    }
}
