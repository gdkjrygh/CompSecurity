// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal;

import android.view.View;
import com.actionbarsherlock.internal.view.menu.MenuWrapper;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;

// Referenced classes of package com.actionbarsherlock.internal:
//            ActionBarSherlockNative

class mActionMode extends ActionMode
{

    private final android.view.ActionMode mActionMode;
    private MenuWrapper mMenu;
    final ActionBarSherlockNative this$0;

    public void finish()
    {
        mActionMode.finish();
    }

    public MenuWrapper getMenu()
    {
        if (mMenu == null)
        {
            mMenu = new MenuWrapper(mActionMode.getMenu());
        }
        return mMenu;
    }

    public Menu getMenu()
    {
        return getMenu();
    }

    public void invalidate()
    {
        mActionMode.invalidate();
    }

    public void setCustomView(View view)
    {
        mActionMode.setCustomView(view);
    }

    public void setTitle(CharSequence charsequence)
    {
        mActionMode.setTitle(charsequence);
    }

    (android.view.ActionMode actionmode)
    {
        this$0 = ActionBarSherlockNative.this;
        super();
        mMenu = null;
        mActionMode = actionmode;
    }
}
