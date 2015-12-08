// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            OrderActivity

public static class _cls2.this._cls0 extends DialogFragment
{

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new com.walmart.android.ui.dialog.ogFragment(getActivity());
        bundle.getActivity(com.walmartlabs.android.photo.).(com.walmartlabs.android.photo.ge).ge(getString(com.walmartlabs.android.photo.ogFragment.getString), new android.content.DialogInterface.OnClickListener() {

            final OrderActivity.ConfirmCancelDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                ((OrderActivity)getActivity()).onCancelRequested();
            }

            
            {
                this$0 = OrderActivity.ConfirmCancelDialogFragment.this;
                super();
            }
        }).ogFragment(getString(com.walmartlabs.android.photo.ogFragment.getString), new android.content.DialogInterface.OnClickListener() {

            final OrderActivity.ConfirmCancelDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = OrderActivity.ConfirmCancelDialogFragment.this;
                super();
            }
        });
        return bundle.ogFragment();
    }

    public _cls2.this._cls0()
    {
    }
}
