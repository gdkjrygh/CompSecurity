// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.AccessToken;
import com.uservoice.uservoicesdk.ui.DefaultCallback;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            PasswordDialogFragment

class val.password
    implements android.content.stener
{

    final PasswordDialogFragment this$0;
    final EditText val$password;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        AccessToken.authorize(Session.getInstance().getEmail(), val$password.getText().toString(), new DefaultCallback(getActivity()) {

            final PasswordDialogFragment._cls1 this$1;

            public void onModel(AccessToken accesstoken)
            {
                Session.getInstance().setAccessToken(accesstoken);
                PasswordDialogFragment.access$000(this$0).run();
            }

            public volatile void onModel(Object obj)
            {
                onModel((AccessToken)obj);
            }

            
            {
                this$1 = PasswordDialogFragment._cls1.this;
                super(context);
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = final_passworddialogfragment;
        val$password = EditText.this;
        super();
    }
}
