// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.uservoice.uservoicesdk.activity.ContactActivity;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            UnhelpfulDialogFragment

class this._cls0
    implements android.content.tener
{

    final UnhelpfulDialogFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        getActivity().startActivity(new Intent(getActivity(), com/uservoice/uservoicesdk/activity/ContactActivity));
        dialoginterface.cancel();
    }

    A()
    {
        this$0 = UnhelpfulDialogFragment.this;
        super();
    }
}
