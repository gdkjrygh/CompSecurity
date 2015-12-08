// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignInFragment

class val.dialog
    implements android.view.er
{

    final SignInFragment this$0;
    final Dialog val$dialog;

    public void onClick(View view)
    {
        SignInFragment.access$800(SignInFragment.this);
        val$dialog.dismiss();
    }

    ()
    {
        this$0 = final_signinfragment;
        val$dialog = Dialog.this;
        super();
    }
}
