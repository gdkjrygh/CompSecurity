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

class this._cls1 extends DefaultCallback
{

    final onModel this$1;

    public void onModel(AccessToken accesstoken)
    {
        Session.getInstance().setAccessToken(accesstoken);
        PasswordDialogFragment.access$000(_fld0).run();
    }

    public volatile void onModel(Object obj)
    {
        onModel((AccessToken)obj);
    }

    l.password(Context context)
    {
        this$1 = this._cls1.this;
        super(context);
    }

    // Unreferenced inner class com/uservoice/uservoicesdk/dialog/PasswordDialogFragment$1

/* anonymous class */
    class PasswordDialogFragment._cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final PasswordDialogFragment this$0;
        final EditText val$password;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            AccessToken.authorize(Session.getInstance().getEmail(), password.getText().toString(), new PasswordDialogFragment._cls1._cls1(getActivity()));
        }

            
            {
                this$0 = final_passworddialogfragment;
                password = EditText.this;
                super();
            }
    }

}
