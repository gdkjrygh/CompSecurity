// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            EnterNumbersPresenter

class this._cls0
    implements android.widget.istener
{

    final EnterNumbersPresenter this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (EnterNumbersPresenter.access$000(EnterNumbersPresenter.this))
        {
            EnterNumbersPresenter.access$100(EnterNumbersPresenter.this);
        }
        return false;
    }

    ()
    {
        this$0 = EnterNumbersPresenter.this;
        super();
    }
}
