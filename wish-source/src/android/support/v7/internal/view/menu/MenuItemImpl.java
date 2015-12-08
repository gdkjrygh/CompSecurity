// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v7.internal.widget.TintManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuBuilder, SubMenuBuilder

public final class MenuItemImpl
    implements SupportMenuItem
{

    private static String sDeleteShortcutLabel;
    private static String sEnterShortcutLabel;
    private static String sPrependShortcutLabel;
    private static String sSpaceShortcutLabel;
    private ActionProvider mActionProvider;
    private View mActionView;
    private final int mCategoryOrder;
    private android.view.MenuItem.OnMenuItemClickListener mClickListener;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private int mIconResId;
    private final int mId;
    private Intent mIntent;
    private boolean mIsActionViewExpanded;
    private Runnable mItemCallback;
    private MenuBuilder mMenu;
    private android.view.ContextMenu.ContextMenuInfo mMenuInfo;
    private android.support.v4.view.MenuItemCompat.OnActionExpandListener mOnActionExpandListener;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private int mShowAsAction;
    private SubMenuBuilder mSubMenu;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;

    MenuItemImpl(MenuBuilder menubuilder, int i, int j, int k, int l, CharSequence charsequence, int i1)
    {
        mIconResId = 0;
        mFlags = 16;
        mShowAsAction = 0;
        mIsActionViewExpanded = false;
        mMenu = menubuilder;
        mId = j;
        mGroup = i;
        mCategoryOrder = k;
        mOrdering = l;
        mTitle = charsequence;
        mShowAsAction = i1;
    }

    public void actionFormatChanged()
    {
        mMenu.onItemActionRequestChanged(this);
    }

    public boolean collapseActionView()
    {
        if ((mShowAsAction & 8) != 0)
        {
            if (mActionView == null)
            {
                return true;
            }
            if (mOnActionExpandListener == null || mOnActionExpandListener.onMenuItemActionCollapse(this))
            {
                return mMenu.collapseItemActionView(this);
            }
        }
        return false;
    }

    public boolean expandActionView()
    {
        while (!hasCollapsibleActionView() || mOnActionExpandListener != null && !mOnActionExpandListener.onMenuItemActionExpand(this)) 
        {
            return false;
        }
        return mMenu.expandItemActionView(this);
    }

    public android.view.ActionProvider getActionProvider()
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView()
    {
        if (mActionView != null)
        {
            return mActionView;
        }
        if (mActionProvider != null)
        {
            mActionView = mActionProvider.onCreateActionView(this);
            return mActionView;
        } else
        {
            return null;
        }
    }

    public char getAlphabeticShortcut()
    {
        return mShortcutAlphabeticChar;
    }

    public int getGroupId()
    {
        return mGroup;
    }

    public Drawable getIcon()
    {
        if (mIconDrawable != null)
        {
            return mIconDrawable;
        }
        if (mIconResId != 0)
        {
            Drawable drawable = TintManager.getDrawable(mMenu.getContext(), mIconResId);
            mIconResId = 0;
            mIconDrawable = drawable;
            return drawable;
        } else
        {
            return null;
        }
    }

    public Intent getIntent()
    {
        return mIntent;
    }

    public int getItemId()
    {
        return mId;
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return mMenuInfo;
    }

    public char getNumericShortcut()
    {
        return mShortcutNumericChar;
    }

    public int getOrder()
    {
        return mCategoryOrder;
    }

    public int getOrdering()
    {
        return mOrdering;
    }

    char getShortcut()
    {
        if (mMenu.isQwertyMode())
        {
            return mShortcutAlphabeticChar;
        } else
        {
            return mShortcutNumericChar;
        }
    }

    String getShortcutLabel()
    {
        char c;
        StringBuilder stringbuilder;
        c = getShortcut();
        if (c == 0)
        {
            return "";
        }
        stringbuilder = new StringBuilder(sPrependShortcutLabel);
        c;
        JVM INSTR lookupswitch 3: default 60
    //                   8: 82
    //                   10: 71
    //                   32: 93;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append(c);
_L6:
        return stringbuilder.toString();
_L3:
        stringbuilder.append(sEnterShortcutLabel);
        continue; /* Loop/switch isn't completed */
_L2:
        stringbuilder.append(sDeleteShortcutLabel);
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(sSpaceShortcutLabel);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public SubMenu getSubMenu()
    {
        return mSubMenu;
    }

    public ActionProvider getSupportActionProvider()
    {
        return mActionProvider;
    }

    public CharSequence getTitle()
    {
        return mTitle;
    }

    public CharSequence getTitleCondensed()
    {
        CharSequence charsequence;
        Object obj;
        if (mTitleCondensed != null)
        {
            charsequence = mTitleCondensed;
        } else
        {
            charsequence = mTitle;
        }
        obj = charsequence;
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            obj = charsequence;
            if (charsequence != null)
            {
                obj = charsequence;
                if (!(charsequence instanceof String))
                {
                    obj = charsequence.toString();
                }
            }
        }
        return ((CharSequence) (obj));
    }

    CharSequence getTitleForItemView(MenuView.ItemView itemview)
    {
        if (itemview != null && itemview.prefersCondensedTitle())
        {
            return getTitleCondensed();
        } else
        {
            return getTitle();
        }
    }

    public boolean hasCollapsibleActionView()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if ((mShowAsAction & 8) != 0)
        {
            if (mActionView == null && mActionProvider != null)
            {
                mActionView = mActionProvider.onCreateActionView(this);
            }
            flag = flag1;
            if (mActionView != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean hasSubMenu()
    {
        return mSubMenu != null;
    }

    public boolean invoke()
    {
_L2:
        return true;
        if (mClickListener != null && mClickListener.onMenuItemClick(this) || mMenu.dispatchMenuItemSelected(mMenu.getRootMenu(), this)) goto _L2; else goto _L1
_L1:
        if (mItemCallback != null)
        {
            mItemCallback.run();
            return true;
        }
        if (mIntent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        mMenu.getContext().startActivity(mIntent);
        return true;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", activitynotfoundexception);
        if (mActionProvider != null && mActionProvider.onPerformDefaultAction()) goto _L2; else goto _L3
_L3:
        return false;
    }

    public boolean isActionButton()
    {
        return (mFlags & 0x20) == 32;
    }

    public boolean isActionViewExpanded()
    {
        return mIsActionViewExpanded;
    }

    public boolean isCheckable()
    {
        return (mFlags & 1) == 1;
    }

    public boolean isChecked()
    {
        return (mFlags & 2) == 2;
    }

    public boolean isEnabled()
    {
        return (mFlags & 0x10) != 0;
    }

    public boolean isExclusiveCheckable()
    {
        return (mFlags & 4) != 0;
    }

    public boolean isVisible()
    {
        if (mActionProvider == null || !mActionProvider.overridesItemVisibility()) goto _L2; else goto _L1
_L1:
        if ((mFlags & 8) != 0 || !mActionProvider.isVisible()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if ((mFlags & 8) != 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean requestsActionButton()
    {
        return (mShowAsAction & 1) == 1;
    }

    public boolean requiresActionButton()
    {
        return (mShowAsAction & 2) == 2;
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionprovider)
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public SupportMenuItem setActionView(int i)
    {
        Context context = mMenu.getContext();
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public SupportMenuItem setActionView(View view)
    {
        mActionView = view;
        mActionProvider = null;
        if (view != null && view.getId() == -1 && mId > 0)
        {
            view.setId(mId);
        }
        mMenu.onItemActionRequestChanged(this);
        return this;
    }

    public volatile MenuItem setActionView(int i)
    {
        return setActionView(i);
    }

    public volatile MenuItem setActionView(View view)
    {
        return setActionView(view);
    }

    public void setActionViewExpanded(boolean flag)
    {
        mIsActionViewExpanded = flag;
        mMenu.onItemsChanged(false);
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
        if (mShortcutAlphabeticChar == c)
        {
            return this;
        } else
        {
            mShortcutAlphabeticChar = Character.toLowerCase(c);
            mMenu.onItemsChanged(false);
            return this;
        }
    }

    public MenuItem setCheckable(boolean flag)
    {
        int i = mFlags;
        int j = mFlags;
        boolean flag1;
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mFlags = flag1 | j & -2;
        if (i != mFlags)
        {
            mMenu.onItemsChanged(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        if ((mFlags & 4) != 0)
        {
            mMenu.setExclusiveItemChecked(this);
            return this;
        } else
        {
            setCheckedInt(flag);
            return this;
        }
    }

    void setCheckedInt(boolean flag)
    {
        int i = mFlags;
        int j = mFlags;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        mFlags = byte0 | j & -3;
        if (i != mFlags)
        {
            mMenu.onItemsChanged(false);
        }
    }

    public MenuItem setEnabled(boolean flag)
    {
        if (flag)
        {
            mFlags = mFlags | 0x10;
        } else
        {
            mFlags = mFlags & 0xffffffef;
        }
        mMenu.onItemsChanged(false);
        return this;
    }

    public void setExclusiveCheckable(boolean flag)
    {
        int i = mFlags;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        mFlags = byte0 | i & -5;
    }

    public MenuItem setIcon(int i)
    {
        mIconDrawable = null;
        mIconResId = i;
        mMenu.onItemsChanged(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        mIconResId = 0;
        mIconDrawable = drawable;
        mMenu.onItemsChanged(false);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        mIntent = intent;
        return this;
    }

    public void setIsActionButton(boolean flag)
    {
        if (flag)
        {
            mFlags = mFlags | 0x20;
            return;
        } else
        {
            mFlags = mFlags & 0xffffffdf;
            return;
        }
    }

    void setMenuInfo(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        mMenuInfo = contextmenuinfo;
    }

    public MenuItem setNumericShortcut(char c)
    {
        if (mShortcutNumericChar == c)
        {
            return this;
        } else
        {
            mShortcutNumericChar = c;
            mMenu.onItemsChanged(false);
            return this;
        }
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        mClickListener = onmenuitemclicklistener;
        return this;
    }

    public MenuItem setShortcut(char c, char c1)
    {
        mShortcutNumericChar = c;
        mShortcutAlphabeticChar = Character.toLowerCase(c1);
        mMenu.onItemsChanged(false);
        return this;
    }

    public void setShowAsAction(int i)
    {
        switch (i & 3)
        {
        default:
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            mShowAsAction = i;
            break;
        }
        mMenu.onItemActionRequestChanged(this);
    }

    public SupportMenuItem setShowAsActionFlags(int i)
    {
        setShowAsAction(i);
        return this;
    }

    public volatile MenuItem setShowAsActionFlags(int i)
    {
        return setShowAsActionFlags(i);
    }

    void setSubMenu(SubMenuBuilder submenubuilder)
    {
        mSubMenu = submenubuilder;
        submenubuilder.setHeaderTitle(getTitle());
    }

    public SupportMenuItem setSupportActionProvider(ActionProvider actionprovider)
    {
        if (mActionProvider != null)
        {
            mActionProvider.setVisibilityListener(null);
        }
        mActionView = null;
        mActionProvider = actionprovider;
        mMenu.onItemsChanged(true);
        if (mActionProvider != null)
        {
            mActionProvider.setVisibilityListener(new android.support.v4.view.ActionProvider.VisibilityListener() {

                final MenuItemImpl this$0;

                public void onActionProviderVisibilityChanged(boolean flag)
                {
                    mMenu.onItemVisibleChanged(MenuItemImpl.this);
                }

            
            {
                this$0 = MenuItemImpl.this;
                super();
            }
            });
        }
        return this;
    }

    public SupportMenuItem setSupportOnActionExpandListener(android.support.v4.view.MenuItemCompat.OnActionExpandListener onactionexpandlistener)
    {
        mOnActionExpandListener = onactionexpandlistener;
        return this;
    }

    public MenuItem setTitle(int i)
    {
        return setTitle(((CharSequence) (mMenu.getContext().getString(i))));
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        mMenu.onItemsChanged(false);
        if (mSubMenu != null)
        {
            mSubMenu.setHeaderTitle(charsequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        mTitleCondensed = charsequence;
        if (charsequence == null)
        {
            charsequence = mTitle;
        }
        mMenu.onItemsChanged(false);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        if (setVisibleInt(flag))
        {
            mMenu.onItemVisibleChanged(this);
        }
        return this;
    }

    boolean setVisibleInt(boolean flag)
    {
        boolean flag1 = false;
        int i = mFlags;
        int j = mFlags;
        byte byte0;
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        mFlags = byte0 | j & -9;
        flag = flag1;
        if (i != mFlags)
        {
            flag = true;
        }
        return flag;
    }

    public boolean shouldShowIcon()
    {
        return mMenu.getOptionalIconsVisible();
    }

    boolean shouldShowShortcut()
    {
        return mMenu.isShortcutsVisible() && getShortcut() != 0;
    }

    public boolean showsTextAsAction()
    {
        return (mShowAsAction & 4) == 4;
    }

    public String toString()
    {
        return mTitle.toString();
    }

}
