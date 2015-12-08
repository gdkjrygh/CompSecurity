// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.database.DataSetObserver;

// Referenced classes of package com.walmart.android.app.saver:
//            BasicFilterAdapter

private class <init> extends DataSetObserver
{

    final BasicFilterAdapter this$0;

    public void onChanged()
    {
        super.onChanged();
        notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        super.onInvalidated();
        notifyDataSetInvalidated();
    }

    private ()
    {
        this$0 = BasicFilterAdapter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
