// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import android.app.Activity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignInFragment

class this._cls0
    implements com.contextlogic.wish.googleplus..LoginCallback
{

    final SignInFragment this$0;

    public Activity getActivityForErrorResolution()
    {
        return getActivity();
    }

    public void onFailure()
    {
        SignInFragment.access$400(SignInFragment.this, false, true, null);
    }

    public void onSilentFailure()
    {
        SignInFragment.access$502(SignInFragment.this, false);
        SignInFragment.access$600(SignInFragment.this);
    }

    public void onSuccess()
    {
        SignInFragment.access$300(SignInFragment.this);
    }

    allback()
    {
        this$0 = SignInFragment.this;
        super();
    }
}
