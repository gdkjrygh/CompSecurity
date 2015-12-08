// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.uservoice.uservoicesdk.ui.Utils;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            DialogFragmentBugfixed

public class HelpfulDialogFragment extends DialogFragmentBugfixed
{

    public HelpfulDialogFragment()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        if (!Utils.isDarkTheme(getActivity()))
        {
            bundle.setInverseBackgroundForced(true);
        }
        bundle.setMessage(com.uservoice.uservoicesdk.R.string.uv_helpful_article_message_question);
        bundle.setNegativeButton(com.uservoice.uservoicesdk.R.string.uv_no, new android.content.DialogInterface.OnClickListener() {

            final HelpfulDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
                getActivity().finish();
            }

            
            {
                this$0 = HelpfulDialogFragment.this;
                super();
            }
        });
        bundle.setPositiveButton(com.uservoice.uservoicesdk.R.string.uv_yes, null);
        return bundle.create();
    }
}
