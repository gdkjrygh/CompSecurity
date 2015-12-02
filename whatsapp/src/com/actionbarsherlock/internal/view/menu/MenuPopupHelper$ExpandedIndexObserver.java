// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.database.DataSetObserver;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuPopupHelper

class <init> extends DataSetObserver
{

    final MenuPopupHelper this$0;

    public void onChanged()
    {
        MenuPopupHelper.access$500(MenuPopupHelper.this).edIndex();
    }

    private ()
    {
        this$0 = MenuPopupHelper.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
