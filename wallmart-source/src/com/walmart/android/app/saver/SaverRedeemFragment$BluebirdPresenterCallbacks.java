// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverRedeemFragment

private class <init>
    implements <init>
{

    final SaverRedeemFragment this$0;

    public void onBrowserLink(Uri uri)
    {
        if (getActivity() != null && !getActivity().isFinishing())
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (intent.resolveActivity(getActivity().getPackageManager()) != null)
            {
                getActivity().startActivity(intent);
            }
        }
    }

    public void onForceClose()
    {
        if (getActivity() != null && !getActivity().isFinishing())
        {
            SaverRedeemFragment.access$1400(SaverRedeemFragment.this).popPresenter();
        }
    }

    private ()
    {
        this$0 = SaverRedeemFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
