// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            SigninDialogFragment

class this._cls1
    implements android.view.inDialogFragment._cls4._cls1
{

    final is._cls0 this$1;

    public void onClick(View view)
    {
        SigninDialogFragment.access$400(_fld0);
    }

    l.dialog()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/uservoice/uservoicesdk/dialog/SigninDialogFragment$4

/* anonymous class */
    class SigninDialogFragment._cls4
        implements android.content.DialogInterface.OnShowListener
    {

        final SigninDialogFragment this$0;
        final AlertDialog val$dialog;

        public void onShow(DialogInterface dialoginterface)
        {
            dialog.getButton(-1).setOnClickListener(new SigninDialogFragment._cls4._cls1());
            ((InputMethodManager)getActivity().getSystemService("input_method")).showSoftInput(SigninDialogFragment.access$200(SigninDialogFragment.this), 1);
        }

            
            {
                this$0 = final_signindialogfragment;
                dialog = AlertDialog.this;
                super();
            }
    }

}
