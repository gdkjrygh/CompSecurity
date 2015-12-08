// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.ui.activity.root.RootActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupUpdateProfileFragment

class this._cls0
    implements Runnable
{

    final SignupUpdateProfileFragment this$0;

    public void run()
    {
        RootActivity rootactivity = (RootActivity)getActivity();
        if (rootactivity != null)
        {
            rootactivity.showFreeGiftSignupFlow(SignupUpdateProfileFragment.access$000(SignupUpdateProfileFragment.this));
        }
    }

    ()
    {
        this$0 = SignupUpdateProfileFragment.this;
        super();
    }
}
