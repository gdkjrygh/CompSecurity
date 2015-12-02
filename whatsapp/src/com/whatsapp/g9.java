// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import com.whatsapp.util.x;

// Referenced classes of package com.whatsapp:
//            afb

class g9
    implements android.content.DialogInterface.OnClickListener
{

    final ConversationsFragment.DeleteAllMessagesDialogFragment a;

    g9(ConversationsFragment.DeleteAllMessagesDialogFragment deleteallmessagesdialogfragment)
    {
        a = deleteallmessagesdialogfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new DialogToastFragmentActivity.ProgressDialogFragment();
        dialoginterface.show(a.getFragmentManager(), null);
        x.a(new afb(this, dialoginterface));
    }
}
