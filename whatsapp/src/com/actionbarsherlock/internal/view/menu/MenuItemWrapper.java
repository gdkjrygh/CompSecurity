// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.actionbarsherlock.internal.view.ActionProviderWrapper;
import com.actionbarsherlock.internal.widget.CollapsibleActionViewWrapper;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.CollapsibleActionView;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            SubMenuWrapper

public class MenuItemWrapper
    implements MenuItem, android.view.MenuItem.OnMenuItemClickListener
{

    private static final String z;
    private com.actionbarsherlock.view.MenuItem.OnActionExpandListener mActionExpandListener;
    private com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener mMenuItemClickListener;
    private android.view.MenuItem.OnActionExpandListener mNativeActionExpandListener;
    private final android.view.MenuItem mNativeItem;
    private SubMenu mSubMenu;

    public MenuItemWrapper(android.view.MenuItem menuitem)
    {
        mSubMenu = null;
        mMenuItemClickListener = null;
        mActionExpandListener = null;
        mNativeActionExpandListener = null;
        if (menuitem == null)
        {
            throw new IllegalStateException(z);
        } else
        {
            mNativeItem = menuitem;
            return;
        }
    }

    public boolean collapseActionView()
    {
        return mNativeItem.collapseActionView();
    }

    public boolean expandActionView()
    {
        return mNativeItem.expandActionView();
    }

    public ActionProvider getActionProvider()
    {
label0:
        {
            Object obj = mNativeItem.getActionProvider();
            if (obj == null)
            {
                break label0;
            }
            try
            {
                if (!(obj instanceof ActionProviderWrapper))
                {
                    break label0;
                }
                obj = ((ActionProviderWrapper)obj).unwrap();
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            return ((ActionProvider) (obj));
        }
        return null;
    }

    public View getActionView()
    {
        View view1 = mNativeItem.getActionView();
        View view = view1;
        try
        {
            if (view1 instanceof CollapsibleActionViewWrapper)
            {
                view = ((CollapsibleActionViewWrapper)view1).unwrap();
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return view;
    }

    public int getGroupId()
    {
        return mNativeItem.getGroupId();
    }

    public Drawable getIcon()
    {
        return mNativeItem.getIcon();
    }

    public int getItemId()
    {
        return mNativeItem.getItemId();
    }

    public SubMenu getSubMenu()
    {
        boolean flag = hasSubMenu();
        IllegalStateException illegalstateexception;
        if (flag)
        {
            try
            {
                if (mSubMenu == null)
                {
                    mSubMenu = new SubMenuWrapper(mNativeItem.getSubMenu());
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        return mSubMenu;
        illegalstateexception;
        throw illegalstateexception;
    }

    public boolean hasSubMenu()
    {
        return mNativeItem.hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return mNativeItem.isActionViewExpanded();
    }

    public boolean isVisible()
    {
        return mNativeItem.isVisible();
    }

    public boolean onMenuItemClick(android.view.MenuItem menuitem)
    {
label0:
        {
            boolean flag;
            try
            {
                if (mMenuItemClickListener == null)
                {
                    break label0;
                }
                flag = mMenuItemClickListener.onMenuItemClick(this);
            }
            // Misplaced declaration of an exception variable
            catch (android.view.MenuItem menuitem)
            {
                throw menuitem;
            }
            return flag;
        }
        return false;
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        mNativeItem.setActionProvider(new ActionProviderWrapper(actionprovider));
        return this;
    }

    public MenuItem setActionView(int i)
    {
        mNativeItem.setActionView(i);
        if (i != 0)
        {
            View view = mNativeItem.getActionView();
            try
            {
                if (view instanceof CollapsibleActionView)
                {
                    mNativeItem.setActionView(new CollapsibleActionViewWrapper(view));
                }
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
        }
        return this;
    }

    public MenuItem setActionView(View view)
    {
        Object obj = view;
        if (view != null)
        {
            boolean flag;
            try
            {
                flag = view instanceof CollapsibleActionView;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            obj = view;
            if (flag)
            {
                obj = new CollapsibleActionViewWrapper(view);
            }
        }
        mNativeItem.setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
        mNativeItem.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        mNativeItem.setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        mNativeItem.setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        mNativeItem.setEnabled(flag);
        return this;
    }

    public MenuItem setIcon(int i)
    {
        mNativeItem.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        mNativeItem.setIcon(drawable);
        return this;
    }

    public MenuItem setNumericShortcut(char c)
    {
        mNativeItem.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(com.actionbarsherlock.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        try
        {
            mActionExpandListener = onactionexpandlistener;
            if (mNativeActionExpandListener == null)
            {
                mNativeActionExpandListener = new _cls1();
                mNativeItem.setOnActionExpandListener(mNativeActionExpandListener);
            }
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.view.MenuItem.OnActionExpandListener onactionexpandlistener)
        {
            throw onactionexpandlistener;
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        mMenuItemClickListener = onmenuitemclicklistener;
        mNativeItem.setOnMenuItemClickListener(this);
        return this;
    }

    public void setShowAsAction(int i)
    {
        mNativeItem.setShowAsAction(i);
    }

    public MenuItem setTitle(int i)
    {
        mNativeItem.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        mNativeItem.setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        mNativeItem.setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        mNativeItem.setVisible(flag);
        return this;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "keh\004\023Ys)\031\006Rb)\035\027Yz)\027\002Ryf\000C^r)\032\026P{'".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 99;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 60;
          goto _L8
_L3:
        byte0 = 23;
          goto _L8
_L4:
        byte0 = 9;
          goto _L8
        byte0 = 116;
          goto _L8
    }


    private class _cls1
        implements android.view.MenuItem.OnActionExpandListener
    {

        final MenuItemWrapper this$0;

        public boolean onMenuItemActionCollapse(android.view.MenuItem menuitem)
        {
            if (mActionExpandListener != null)
            {
                return mActionExpandListener.onMenuItemActionCollapse(MenuItemWrapper.this);
            } else
            {
                return false;
            }
        }

        public boolean onMenuItemActionExpand(android.view.MenuItem menuitem)
        {
            if (mActionExpandListener != null)
            {
                return mActionExpandListener.onMenuItemActionExpand(MenuItemWrapper.this);
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = MenuItemWrapper.this;
            super();
        }
    }

}
