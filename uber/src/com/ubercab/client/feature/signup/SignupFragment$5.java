// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.view.KeyEvent;
import android.widget.TextView;
import chp;
import n;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupFragment

final class a
    implements android.widget.ActionListener
{

    final SignupFragment a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        a.c.a(n.ge);
        SignupFragment.d(a);
        return true;
    }

    (SignupFragment signupfragment)
    {
        a = signupfragment;
        super();
    }
}
