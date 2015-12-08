// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupUpdateProfileFragment

class this._cls0
    implements com.contextlogic.wish.api.service.llback
{

    final SignupUpdateProfileFragment this$0;

    public void onServiceFailed(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = s;
            if (getActivity() != null)
            {
                s1 = getActivity().getString(0x7f06014a);
            }
        }
        SignupUpdateProfileFragment.access$400(SignupUpdateProfileFragment.this);
        SignupUpdateProfileFragment.access$700(SignupUpdateProfileFragment.this, s1);
    }

    ()
    {
        this$0 = SignupUpdateProfileFragment.this;
        super();
    }
}
