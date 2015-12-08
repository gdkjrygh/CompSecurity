// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.wf.wellsfargomobile:
//            SignOnFragment

class ar
    implements android.widget.TextView.OnEditorActionListener
{

    final SignOnFragment a;

    ar(SignOnFragment signonfragment)
    {
        a = signonfragment;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if ((i == 2 || i == 0) && (keyevent == null || keyevent.getAction() == 0))
        {
            SignOnFragment.a(a);
            return true;
        } else
        {
            return false;
        }
    }
}
