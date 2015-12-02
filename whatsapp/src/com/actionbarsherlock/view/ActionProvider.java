// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.view;

import android.view.View;

// Referenced classes of package com.actionbarsherlock.view:
//            SubMenu

public abstract class ActionProvider
{

    private SubUiVisibilityListener mSubUiVisibilityListener;

    public boolean hasSubMenu()
    {
        return false;
    }

    public abstract View onCreateActionView();

    public boolean onPerformDefaultAction()
    {
        return false;
    }

    public void onPrepareSubMenu(SubMenu submenu)
    {
    }

    public void setSubUiVisibilityListener(SubUiVisibilityListener subuivisibilitylistener)
    {
        mSubUiVisibilityListener = subuivisibilitylistener;
    }

    public void subUiVisibilityChanged(boolean flag)
    {
        if (mSubUiVisibilityListener != null)
        {
            mSubUiVisibilityListener.onSubUiVisibilityChanged(flag);
        }
    }

    private class SubUiVisibilityListener
    {

        public abstract void onSubUiVisibilityChanged(boolean flag);
    }

}
