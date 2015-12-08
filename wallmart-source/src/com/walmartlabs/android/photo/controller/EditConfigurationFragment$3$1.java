// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.walmart.android.ui.DialogFactory;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            EditConfigurationFragment

class this._cls1
    implements android.content.r
{

    final is._cls0 this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        EditConfigurationFragment.access$100(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/android/photo/controller/EditConfigurationFragment$3

/* anonymous class */
    class EditConfigurationFragment._cls3
        implements android.view.View.OnClickListener
    {

        final EditConfigurationFragment this$0;

        public void onClick(View view)
        {
            view = DialogFactory.createAlertDialog(getString(com.walmartlabs.android.photo.R.string.photo_delete_photo_confirm_title), getString(com.walmartlabs.android.photo.R.string.photo_delete_photo_confirm_message), getString(com.walmartlabs.android.photo.R.string.photo_remove), new EditConfigurationFragment._cls3._cls1(), getString(com.walmartlabs.android.photo.R.string.photo_cancel), getActivity());
            view.setCancelable(false);
            view.show();
        }

            
            {
                this$0 = EditConfigurationFragment.this;
                super();
            }
    }

}
