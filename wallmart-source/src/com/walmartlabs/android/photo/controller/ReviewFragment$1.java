// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import android.content.DialogInterface;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.android.photo.util.OrderUtils;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            ReviewFragment

class this._cls0
    implements com.walmartlabs.android.photo.view.tonListener
{

    final ReviewFragment this$0;

    public void onPrimaryClicked()
    {
        if (OrderUtils.hasLowResWarnings(getOrder()))
        {
            Dialog dialog = DialogFactory.createAlertDialog(com.walmartlabs.android.photo.warning, getString(com.walmartlabs.android.photo.me_lowres_title), getString(com.walmartlabs.android.photo.me_lowres_message), getString(com.walmartlabs.android.photo.s), new android.content.DialogInterface.OnClickListener() {

                final ReviewFragment._cls1 this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    proceed();
                }

            
            {
                this$1 = ReviewFragment._cls1.this;
                super();
            }
            }, getString(com.walmartlabs.android.photo.), getActivity());
            dialog.setCancelable(false);
            dialog.show();
            return;
        } else
        {
            proceed();
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = ReviewFragment.this;
        super();
    }
}
