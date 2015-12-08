// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.content.Context;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.RequestToken;
import com.uservoice.uservoicesdk.ui.DefaultCallback;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            SigninDialogFragment

class this._cls0 extends DefaultCallback
{

    final SigninDialogFragment this$0;

    public void onModel(RequestToken requesttoken)
    {
        Session.getInstance().setRequestToken(requesttoken);
        if (SigninDialogFragment.access$000(SigninDialogFragment.this) != null)
        {
            SigninDialogFragment.access$000(SigninDialogFragment.this).run();
        }
    }

    public volatile void onModel(Object obj)
    {
        onModel((RequestToken)obj);
    }

    (Context context)
    {
        this$0 = SigninDialogFragment.this;
        super(context);
    }
}
