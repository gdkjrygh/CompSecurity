// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.view.View;
import android.widget.EditText;
import com.uservoice.uservoicesdk.model.User;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestResult;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            SigninDialogFragment

class this._cls0 extends Callback
{

    final SigninDialogFragment this$0;

    public void onError(RestResult restresult)
    {
        SigninDialogFragment.access$500(SigninDialogFragment.this).setVisibility(8);
        SigninDialogFragment.access$600(SigninDialogFragment.this).setVisibility(0);
        SigninDialogFragment.access$600(SigninDialogFragment.this).requestFocus();
    }

    public void onModel(User user)
    {
        SigninDialogFragment.access$500(SigninDialogFragment.this).setVisibility(0);
        SigninDialogFragment.access$600(SigninDialogFragment.this).setVisibility(8);
        SigninDialogFragment.access$700(SigninDialogFragment.this).requestFocus();
    }

    public volatile void onModel(Object obj)
    {
        onModel((User)obj);
    }

    ()
    {
        this$0 = SigninDialogFragment.this;
        super();
    }
}
