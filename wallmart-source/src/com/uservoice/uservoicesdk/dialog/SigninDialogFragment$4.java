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

class val.dialog
    implements android.content.istener
{

    final SigninDialogFragment this$0;
    final AlertDialog val$dialog;

    public void onShow(DialogInterface dialoginterface)
    {
        val$dialog.getButton(-1).setOnClickListener(new android.view.View.OnClickListener() {

            final SigninDialogFragment._cls4 this$1;

            public void onClick(View view)
            {
                SigninDialogFragment.access$400(this$0);
            }

            
            {
                this$1 = SigninDialogFragment._cls4.this;
                super();
            }
        });
        ((InputMethodManager)getActivity().getSystemService("input_method")).showSoftInput(SigninDialogFragment.access$200(SigninDialogFragment.this), 1);
    }

    _cls1.this._cls1()
    {
        this$0 = final_signindialogfragment;
        val$dialog = AlertDialog.this;
        super();
    }
}
