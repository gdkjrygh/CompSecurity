// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuPopupHelper, ActionMenuPresenter, MenuBuilder

class rCallback extends MenuPopupHelper
{

    final ActionMenuPresenter this$0;

    public void onDismiss()
    {
        super.onDismiss();
        mMenu.close();
        ActionMenuPresenter.access$102(ActionMenuPresenter.this, null);
    }

    public (Context context, MenuBuilder menubuilder, View view, boolean flag)
    {
        this$0 = ActionMenuPresenter.this;
        super(context, menubuilder, view, flag);
        setCallback(mPopupPresenterCallback);
    }
}
