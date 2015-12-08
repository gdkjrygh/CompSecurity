// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class b
    implements MenuItem
{

    private final Context a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Drawable g;
    private int h;
    private boolean i;
    private boolean j;

    public b(Context context, int k, int l, int i1, CharSequence charsequence)
    {
        a = context;
        b = l;
        d = k;
        c = i1;
        e = charsequence;
        i = true;
        j = true;
        h = 0;
    }

    public final boolean collapseActionView()
    {
        return false;
    }

    public final boolean expandActionView()
    {
        return false;
    }

    public final ActionProvider getActionProvider()
    {
        return null;
    }

    public final View getActionView()
    {
        return null;
    }

    public final char getAlphabeticShortcut()
    {
        return '\0';
    }

    public final int getGroupId()
    {
        return d;
    }

    public final Drawable getIcon()
    {
        if (g != null)
        {
            return g;
        }
        if (h != 0)
        {
            g = a.getResources().getDrawable(h);
            return g;
        } else
        {
            return null;
        }
    }

    public final Intent getIntent()
    {
        return null;
    }

    public final int getItemId()
    {
        return b;
    }

    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return null;
    }

    public final char getNumericShortcut()
    {
        return '\0';
    }

    public final int getOrder()
    {
        return c;
    }

    public final SubMenu getSubMenu()
    {
        return null;
    }

    public final CharSequence getTitle()
    {
        return e;
    }

    public final CharSequence getTitleCondensed()
    {
        return f;
    }

    public final boolean hasSubMenu()
    {
        return false;
    }

    public final boolean isActionViewExpanded()
    {
        return false;
    }

    public final boolean isCheckable()
    {
        return false;
    }

    public final boolean isChecked()
    {
        return false;
    }

    public final boolean isEnabled()
    {
        return i;
    }

    public final boolean isVisible()
    {
        return j;
    }

    public final MenuItem setActionProvider(ActionProvider actionprovider)
    {
        return this;
    }

    public final MenuItem setActionView(int k)
    {
        return this;
    }

    public final MenuItem setActionView(View view)
    {
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c1)
    {
        return this;
    }

    public final MenuItem setCheckable(boolean flag)
    {
        return this;
    }

    public final MenuItem setChecked(boolean flag)
    {
        return this;
    }

    public final MenuItem setEnabled(boolean flag)
    {
        i = flag;
        return this;
    }

    public final MenuItem setIcon(int k)
    {
        g = null;
        h = k;
        return this;
    }

    public final MenuItem setIcon(Drawable drawable)
    {
        g = drawable;
        h = 0;
        return this;
    }

    public final MenuItem setIntent(Intent intent)
    {
        return this;
    }

    public final MenuItem setNumericShortcut(char c1)
    {
        return this;
    }

    public final MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        return this;
    }

    public final MenuItem setShortcut(char c1, char c2)
    {
        return this;
    }

    public final void setShowAsAction(int k)
    {
    }

    public final MenuItem setShowAsActionFlags(int k)
    {
        return this;
    }

    public final MenuItem setTitle(int k)
    {
        e = a.getResources().getString(k);
        return this;
    }

    public final MenuItem setTitle(CharSequence charsequence)
    {
        e = charsequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charsequence)
    {
        f = charsequence;
        return this;
    }

    public final MenuItem setVisible(boolean flag)
    {
        j = flag;
        return this;
    }
}
