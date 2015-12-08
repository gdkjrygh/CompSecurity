// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.uservoice.uservoicesdk.activity.ContactActivity;
import com.uservoice.uservoicesdk.ui.Utils;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            DialogFragmentBugfixed

public class UnhelpfulDialogFragment extends DialogFragmentBugfixed
{

    public UnhelpfulDialogFragment()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        if (!Utils.isDarkTheme(getActivity()))
        {
            bundle.setInverseBackgroundForced(true);
        }
        bundle.setTitle(com.uservoice.uservoicesdk.R.string.uv_unhelpful_article_message_question);
        bundle.setNegativeButton(com.uservoice.uservoicesdk.R.string.uv_no, new android.content.DialogInterface.OnClickListener() {

            final UnhelpfulDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

            
            {
                this$0 = UnhelpfulDialogFragment.this;
                super();
            }
        });
        bundle.setPositiveButton(com.uservoice.uservoicesdk.R.string.uv_yes, new android.content.DialogInterface.OnClickListener() {

            final UnhelpfulDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                getActivity().startActivity(new Intent(getActivity(), com/uservoice/uservoicesdk/activity/ContactActivity));
                dialoginterface.cancel();
            }

            
            {
                this$0 = UnhelpfulDialogFragment.this;
                super();
            }
        });
        return bundle.create();
    }
}
