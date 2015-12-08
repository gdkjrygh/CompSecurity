// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter, ListPopupWindow

class  extends 
{

    final is._cls0 this$1;
    final ActionMenuPresenter val$this$0;

    public ListPopupWindow getPopup()
    {
        if (ActionMenuPresenter.access$200(_fld0) == null)
        {
            return null;
        } else
        {
            return ActionMenuPresenter.access$200(_fld0).p();
        }
    }

    public boolean onForwardingStarted()
    {
        showOverflowMenu();
        return true;
    }

    public boolean onForwardingStopped()
    {
        if (ActionMenuPresenter.access$300(_fld0) != null)
        {
            return false;
        } else
        {
            hideOverflowMenu();
            return true;
        }
    }

    (ActionMenuPresenter actionmenupresenter)
    {
        this$1 = final_;
        val$this$0 = actionmenupresenter;
        super(View.this);
    }
}
