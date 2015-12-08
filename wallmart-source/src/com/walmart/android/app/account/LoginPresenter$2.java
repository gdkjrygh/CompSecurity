// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.walmart.android.app.account:
//            LoginPresenter

class val.button
    implements android.widget.ActionListener
{

    final LoginPresenter this$0;
    final Button val$button;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            val$button.performClick();
        }
        return false;
    }

    ()
    {
        this$0 = final_loginpresenter;
        val$button = Button.this;
        super();
    }
}
