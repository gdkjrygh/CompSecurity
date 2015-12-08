// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverRedeemFragment

class this._cls0
    implements android.content.issListener
{

    final SaverRedeemFragment this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        SaverRedeemFragment.access$102(SaverRedeemFragment.this, false);
        if (SaverRedeemFragment.access$200(SaverRedeemFragment.this).peek() == null)
        {
            getActivity().finish();
        }
    }

    _cls9()
    {
        this$0 = SaverRedeemFragment.this;
        super();
    }
}
