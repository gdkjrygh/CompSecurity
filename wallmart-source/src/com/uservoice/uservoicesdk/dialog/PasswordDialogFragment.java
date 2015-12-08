// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.AccessToken;
import com.uservoice.uservoicesdk.ui.DefaultCallback;
import com.uservoice.uservoicesdk.ui.Utils;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            DialogFragmentBugfixed

public class PasswordDialogFragment extends DialogFragmentBugfixed
{

    private final Runnable callback;

    public PasswordDialogFragment(Runnable runnable)
    {
        callback = runnable;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setTitle(com.uservoice.uservoicesdk.R.string.uv_password_dialog_title);
        if (!Utils.isDarkTheme(getActivity()))
        {
            bundle.setInverseBackgroundForced(true);
        }
        View view = getActivity().getLayoutInflater().inflate(com.uservoice.uservoicesdk.R.layout.uv_password_dialog, null);
        final EditText password = (EditText)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_password);
        bundle.setView(view);
        bundle.setNegativeButton(com.uservoice.uservoicesdk.R.string.uv_cancel, null);
        bundle.setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final PasswordDialogFragment this$0;
            final EditText val$password;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                AccessToken.authorize(Session.getInstance().getEmail(), password.getText().toString(), new DefaultCallback(getActivity()) {

                    final _cls1 this$1;

                    public void onModel(AccessToken accesstoken)
                    {
                        Session.getInstance().setAccessToken(accesstoken);
                        callback.run();
                    }

                    public volatile void onModel(Object obj)
                    {
                        onModel((AccessToken)obj);
                    }

            
            {
                this$1 = _cls1.this;
                super(context);
            }
                });
            }

            
            {
                this$0 = PasswordDialogFragment.this;
                password = edittext;
                super();
            }
        });
        bundle = bundle.create();
        bundle.getWindow().setSoftInputMode(5);
        return bundle;
    }

}
