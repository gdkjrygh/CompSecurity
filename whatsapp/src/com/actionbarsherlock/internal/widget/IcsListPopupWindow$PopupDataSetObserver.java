// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.database.DataSetObserver;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsListPopupWindow

class <init> extends DataSetObserver
{

    final IcsListPopupWindow this$0;

    public void onChanged()
    {
        if (isShowing())
        {
            show();
        }
    }

    public void onInvalidated()
    {
        dismiss();
    }

    private ()
    {
        this$0 = IcsListPopupWindow.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
