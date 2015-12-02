// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

public class ActionMenuItem
    implements MenuItem
{

    private com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener mClickListener;
    private Context mContext;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private final int mId;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;

    public ActionMenuItem(Context context, int i, int j, int k, int l, CharSequence charsequence)
    {
        mFlags = 16;
        mContext = context;
        mId = j;
        mGroup = i;
        mOrdering = l;
        mTitle = charsequence;
    }

    public boolean collapseActionView()
    {
        return false;
    }

    public boolean expandActionView()
    {
        return false;
    }

    public ActionProvider getActionProvider()
    {
        return null;
    }

    public View getActionView()
    {
        return null;
    }

    public int getGroupId()
    {
        return mGroup;
    }

    public Drawable getIcon()
    {
        return mIconDrawable;
    }

    public int getItemId()
    {
        return mId;
    }

    public SubMenu getSubMenu()
    {
        return null;
    }

    public boolean hasSubMenu()
    {
        return false;
    }

    public boolean isActionViewExpanded()
    {
        return false;
    }

    public boolean isVisible()
    {
        int i;
        try
        {
            i = mFlags;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        return (i & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(int i)
    {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(View view)
    {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
        mShortcutAlphabeticChar = c;
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        boolean flag1;
        int i;
        try
        {
            i = mFlags;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mFlags = flag1 | i & -2;
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        byte byte0;
        int i;
        try
        {
            i = mFlags;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        mFlags = byte0 | i & -3;
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        byte byte0;
        int i;
        try
        {
            i = mFlags;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        if (flag)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        mFlags = byte0 | i & 0xffffffef;
        return this;
    }

    public MenuItem setIcon(int i)
    {
        mIconDrawable = mContext.getResources().getDrawable(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        mIconDrawable = drawable;
        return this;
    }

    public MenuItem setNumericShortcut(char c)
    {
        mShortcutNumericChar = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(com.actionbarsherlock.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        return this;
    }

    public MenuItem setOnMenuItemClickListener(com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        mClickListener = onmenuitemclicklistener;
        return this;
    }

    public void setShowAsAction(int i)
    {
    }

    public MenuItem setTitle(int i)
    {
        mTitle = mContext.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        mTitleCondensed = charsequence;
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        byte byte0;
        int i;
        try
        {
            i = mFlags;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        mFlags = byte0 | i & 8;
        return this;
    }
}
