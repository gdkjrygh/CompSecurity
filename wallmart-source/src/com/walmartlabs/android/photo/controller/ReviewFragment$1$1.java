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

class this._cls1
    implements android.content.lickListener
{

    final eed this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        proceed();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/android/photo/controller/ReviewFragment$1

/* anonymous class */
    class ReviewFragment._cls1
        implements com.walmartlabs.android.photo.view.PhotoBaseView.ButtonListener
    {

        final ReviewFragment this$0;

        public void onPrimaryClicked()
        {
            if (OrderUtils.hasLowResWarnings(getOrder()))
            {
                Dialog dialog = DialogFactory.createAlertDialog(com.walmartlabs.android.photo.R.drawable.photo_warning, getString(com.walmartlabs.android.photo.R.string.photo_some_lowres_title), getString(com.walmartlabs.android.photo.R.string.photo_some_lowres_message), getString(com.walmartlabs.android.photo.R.string.photo_yes), new ReviewFragment._cls1._cls1(), getString(com.walmartlabs.android.photo.R.string.photo_no), getActivity());
                dialog.setCancelable(false);
                dialog.show();
                return;
            } else
            {
                proceed();
                return;
            }
        }

            
            {
                this$0 = ReviewFragment.this;
                super();
            }
    }

}
