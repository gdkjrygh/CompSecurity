// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignupFragment

class this._cls0
    implements android.widget.ActionListener
{

    final SignupFragment this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            SignupFragment.access$100(SignupFragment.this);
            SignupFragment.access$200(SignupFragment.this);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = SignupFragment.this;
        super();
    }
}
