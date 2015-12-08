// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            HelpfulDialogFragment

class this._cls0
    implements android.content.istener
{

    final HelpfulDialogFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
        getActivity().finish();
    }

    ()
    {
        this$0 = HelpfulDialogFragment.this;
        super();
    }
}
