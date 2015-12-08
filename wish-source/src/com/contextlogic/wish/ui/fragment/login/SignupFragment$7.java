// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import android.app.Activity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignupFragment

class this._cls0
    implements com.contextlogic.wish.googleplus..LoginCallback
{

    final SignupFragment this$0;

    public Activity getActivityForErrorResolution()
    {
        return getActivity();
    }

    public void onFailure()
    {
        SignupFragment.access$600(SignupFragment.this, false, true, null);
    }

    public void onSilentFailure()
    {
        SignupFragment.access$702(SignupFragment.this, false);
        SignupFragment.access$800(SignupFragment.this);
    }

    public void onSuccess()
    {
        SignupFragment.access$500(SignupFragment.this);
    }

    allback()
    {
        this$0 = SignupFragment.this;
        super();
    }
}
