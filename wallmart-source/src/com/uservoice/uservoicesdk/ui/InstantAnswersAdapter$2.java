// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            InstantAnswersAdapter

class this._cls0
    implements TextWatcher
{

    final InstantAnswersAdapter this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (state != ate.INIT)
        {
            state = ate.INIT;
            notifyDataSetChanged();
        }
    }

    ate()
    {
        this$0 = InstantAnswersAdapter.this;
        super();
    }
}
