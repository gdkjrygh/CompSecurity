// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            EnterPhoneDialogFragment

class this._cls0
    implements android.widget.ener
{

    final EnterPhoneDialogFragment this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            EnterPhoneDialogFragment.access$000(EnterPhoneDialogFragment.this);
            return true;
        } else
        {
            return false;
        }
    }

    I()
    {
        this$0 = EnterPhoneDialogFragment.this;
        super();
    }
}
