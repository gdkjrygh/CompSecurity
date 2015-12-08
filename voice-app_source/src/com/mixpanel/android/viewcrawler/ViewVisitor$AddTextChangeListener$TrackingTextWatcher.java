// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewVisitor

private class mBoundTo
    implements TextWatcher
{

    private final View mBoundTo;
    final mBoundTo this$1;

    public void afterTextChanged(Editable editable)
    {
        mBoundTo.this.mBoundTo(mBoundTo);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public (View view)
    {
        this$1 = this._cls1.this;
        super();
        mBoundTo = view;
    }
}
