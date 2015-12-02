// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuBuilder, SubMenuBuilder

public final class MenuItemImpl
    implements MenuItem
{

    private static String sDeleteShortcutLabel;
    private static String sEnterShortcutLabel;
    private static String sPrependShortcutLabel;
    private static String sSpaceShortcutLabel;
    private static final String z[];
    private ActionProvider mActionProvider;
    private View mActionView;
    private final int mCategoryOrder;
    private com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener mClickListener;
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
    private com.actionbarsherlock.view.MenuItem.OnActionExpandListener mOnActionExpandListener;
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

    public boolean collapseActionView()
    {
        int i;
        try
        {
            i = mShowAsAction;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if ((i & 8) != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        try
        {
            obj = mActionView;
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        if (obj == null)
        {
            return true;
        }
        try
        {
            activitynotfoundexception1 = mOnActionExpandListener;
        }
        catch (ActivityNotFoundException activitynotfoundexception2)
        {
            try
            {
                throw activitynotfoundexception2;
            }
            catch (ActivityNotFoundException activitynotfoundexception3)
            {
                throw activitynotfoundexception3;
            }
        }
        if (activitynotfoundexception1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!mOnActionExpandListener.onMenuItemActionCollapse(this)) goto _L1; else goto _L3
_L3:
        return mMenu.collapseItemActionView(this);
    }

    public boolean expandActionView()
    {
        int i;
        try
        {
            i = mShowAsAction;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            try
            {
                throw activitynotfoundexception;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
        }
        if ((i & 8) == 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (mActionView == null)
        {
            return false;
        }
        com.actionbarsherlock.view.MenuItem.OnActionExpandListener onactionexpandlistener;
        try
        {
            onactionexpandlistener = mOnActionExpandListener;
        }
        catch (ActivityNotFoundException activitynotfoundexception2)
        {
            try
            {
                throw activitynotfoundexception2;
            }
            catch (ActivityNotFoundException activitynotfoundexception3)
            {
                throw activitynotfoundexception3;
            }
        }
        if (onactionexpandlistener == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (!mOnActionExpandListener.onMenuItemActionExpand(this))
        {
            break MISSING_BLOCK_LABEL_64;
        }
        return mMenu.expandItemActionView(this);
        return false;
    }

    public ActionProvider getActionProvider()
    {
        return mActionProvider;
    }

    public View getActionView()
    {
label0:
        {
            View view;
            try
            {
                if (mActionView == null)
                {
                    break label0;
                }
                view = mActionView;
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                throw activitynotfoundexception;
            }
            return view;
        }
label1:
        {
            View view1;
            try
            {
                if (mActionProvider == null)
                {
                    break label1;
                }
                mActionView = mActionProvider.onCreateActionView();
                view1 = mActionView;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
            return view1;
        }
        return null;
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
label0:
        {
            Drawable drawable;
            try
            {
                if (mIconDrawable == null)
                {
                    break label0;
                }
                drawable = mIconDrawable;
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                throw activitynotfoundexception;
            }
            return drawable;
        }
label1:
        {
            Drawable drawable1;
            try
            {
                if (mIconResId == 0)
                {
                    break label1;
                }
                drawable1 = mMenu.getResources().getDrawable(mIconResId);
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
            return drawable1;
        }
        return null;
    }

    public Intent getIntent()
    {
        return mIntent;
    }

    public int getItemId()
    {
        return mId;
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
label0:
        {
            char c;
            try
            {
                if (!mMenu.isQwertyMode())
                {
                    break label0;
                }
                c = mShortcutAlphabeticChar;
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                throw activitynotfoundexception;
            }
            return c;
        }
        return mShortcutNumericChar;
    }

    String getShortcutLabel()
    {
        char c;
        StringBuilder stringbuilder;
        int i;
        i = MenuBuilder.a;
        c = getShortcut();
        if (c == 0)
        {
            return "";
        }
        stringbuilder = new StringBuilder(sPrependShortcutLabel);
        c;
        JVM INSTR lookupswitch 3: default 64
    //                   8: 87
    //                   10: 75
    //                   32: 99;
           goto _L1 _L2 _L3 _L4
_L1:
        ActivityNotFoundException activitynotfoundexception;
        try
        {
            stringbuilder.append(c);
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
_L5:
        return stringbuilder.toString();
_L3:
        stringbuilder.append(sEnterShortcutLabel);
        if (i == 0) goto _L5; else goto _L2
_L2:
        stringbuilder.append(sDeleteShortcutLabel);
        if (i == 0) goto _L5; else goto _L4
_L4:
        stringbuilder.append(sSpaceShortcutLabel);
        if (i == 0) goto _L5; else goto _L1
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    public SubMenu getSubMenu()
    {
        return mSubMenu;
    }

    public CharSequence getTitle()
    {
        return mTitle;
    }

    public CharSequence getTitleCondensed()
    {
label0:
        {
            CharSequence charsequence;
            try
            {
                if (mTitleCondensed == null)
                {
                    break label0;
                }
                charsequence = mTitleCondensed;
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                throw activitynotfoundexception;
            }
            return charsequence;
        }
        return mTitle;
    }

    CharSequence getTitleForItemView(MenuView.ItemView itemview)
    {
label0:
        {
            if (itemview == null)
            {
                break label0;
            }
            try
            {
                if (!itemview.prefersCondensedTitle())
                {
                    break label0;
                }
                itemview = getTitleCondensed();
            }
            // Misplaced declaration of an exception variable
            catch (MenuView.ItemView itemview)
            {
                throw itemview;
            }
            return itemview;
        }
        return getTitle();
    }

    public boolean hasCollapsibleActionView()
    {
        int i;
        try
        {
            i = mShowAsAction;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            try
            {
                throw activitynotfoundexception;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
        }
        if ((i & 8) == 0)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (mActionView != null)
        {
            return true;
        }
        return false;
    }

    public boolean hasSubMenu()
    {
        SubMenuBuilder submenubuilder;
        try
        {
            submenubuilder = mSubMenu;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        return submenubuilder != null;
    }

    public boolean invoke()
    {
        if (mClickListener == null) goto _L2; else goto _L1
_L1:
        boolean flag = mClickListener.onMenuItemClick(this);
        if (!flag) goto _L2; else goto _L3
_L3:
        return true;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        try
        {
            throw activitynotfoundexception;
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
_L2:
        try
        {
            flag = mMenu.dispatchMenuItemSelected(mMenu.getRootMenu(), this);
        }
        catch (ActivityNotFoundException activitynotfoundexception3)
        {
            throw activitynotfoundexception3;
        }
        if (flag) goto _L3; else goto _L4
_L4:
        try
        {
            if (mItemCallback == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            mItemCallback.run();
        }
        catch (ActivityNotFoundException activitynotfoundexception2)
        {
            throw activitynotfoundexception2;
        }
        return true;
        Object obj;
        ActivityNotFoundException activitynotfoundexception4;
        boolean flag1;
        try
        {
            obj = mIntent;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        mMenu.getContext().startActivity(mIntent);
        return true;
        activitynotfoundexception4;
        Log.e(z[0], z[1], activitynotfoundexception4);
        activitynotfoundexception4 = mActionProvider;
        if (activitynotfoundexception4 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ActivityNotFoundException activitynotfoundexception5;
        try
        {
            flag1 = mActionProvider.onPerformDefaultAction();
        }
        catch (ActivityNotFoundException activitynotfoundexception6)
        {
            throw activitynotfoundexception6;
        }
        if (flag1) goto _L3; else goto _L5
_L5:
        return false;
        activitynotfoundexception5;
        throw activitynotfoundexception5;
    }

    public boolean isActionButton()
    {
        int i;
        try
        {
            i = mFlags;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        return (i & 0x20) == 32;
    }

    public boolean isActionViewExpanded()
    {
        return mIsActionViewExpanded;
    }

    public boolean isCheckable()
    {
        int i;
        try
        {
            i = mFlags;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        return (i & 1) == 1;
    }

    public boolean isChecked()
    {
        int i;
        try
        {
            i = mFlags;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        return (i & 2) == 2;
    }

    public boolean isEnabled()
    {
        int i;
        try
        {
            i = mFlags;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        return (i & 0x10) != 0;
    }

    public boolean isExclusiveCheckable()
    {
        int i;
        try
        {
            i = mFlags;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        return (i & 4) != 0;
    }

    public boolean isVisible()
    {
        int i;
        try
        {
            i = mFlags;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        return (i & 8) == 0;
    }

    public boolean requestsActionButton()
    {
        int i;
        try
        {
            i = mShowAsAction;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        return (i & 1) == 1;
    }

    public boolean requiresActionButton()
    {
        int i;
        try
        {
            i = mShowAsAction;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        return (i & 2) == 2;
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        mActionView = null;
        mActionProvider = actionprovider;
        mMenu.onItemsChanged(true);
        return this;
    }

    public MenuItem setActionView(int i)
    {
        Context context = mMenu.getContext();
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public MenuItem setActionView(View view)
    {
        mActionView = view;
        mActionProvider = null;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        int i = view.getId();
        if (i == -1)
        {
            try
            {
                if (mId > 0)
                {
                    view.setId(mId);
                }
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        mMenu.onItemActionRequestChanged(this);
        return this;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
    }

    public void setActionViewExpanded(boolean flag)
    {
        mIsActionViewExpanded = flag;
        mMenu.onItemsChanged(false);
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
        char c1;
        try
        {
            c1 = mShortcutAlphabeticChar;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (c1 == c)
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
        boolean flag1 = false;
        int i = mFlags;
        int j;
        try
        {
            j = mFlags;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (flag)
        {
            flag1 = true;
        }
        try
        {
            mFlags = flag1 | j & -2;
            if (i != mFlags)
            {
                mMenu.onItemsChanged(false);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        int i;
        try
        {
            i = mFlags;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            try
            {
                throw activitynotfoundexception;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
        }
        if ((i & 4) == 0)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        mMenu.setExclusiveItemChecked(this);
        if (MenuBuilder.a == 0)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        setCheckedInt(flag);
        return this;
        return this;
    }

    void setCheckedInt(boolean flag)
    {
        byte byte0 = 0;
        int i = mFlags;
        int j;
        try
        {
            j = mFlags;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (flag)
        {
            byte0 = 2;
        }
        try
        {
            mFlags = byte0 | j & -3;
            if (i != mFlags)
            {
                mMenu.onItemsChanged(false);
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
    }

    public MenuItem setEnabled(boolean flag)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        mFlags = mFlags | 0x10;
        if (MenuBuilder.a == 0)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        mFlags = mFlags & 0xffffffef;
        mMenu.onItemsChanged(false);
        return this;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    public void setExclusiveCheckable(boolean flag)
    {
        byte byte0;
        int i;
        try
        {
            i = mFlags;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
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

    public void setIsActionButton(boolean flag)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        mFlags = mFlags | 0x20;
        if (MenuBuilder.a == 0)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        mFlags = mFlags & 0xffffffdf;
        return;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    void setMenuInfo(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        mMenuInfo = contextmenuinfo;
    }

    public MenuItem setNumericShortcut(char c)
    {
        char c1;
        try
        {
            c1 = mShortcutNumericChar;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (c1 == c)
        {
            return this;
        } else
        {
            mShortcutNumericChar = c;
            mMenu.onItemsChanged(false);
            return this;
        }
    }

    public MenuItem setOnActionExpandListener(com.actionbarsherlock.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        mOnActionExpandListener = onactionexpandlistener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        mClickListener = onmenuitemclicklistener;
        return this;
    }

    public void setShowAsAction(int i)
    {
        i & 3;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 44
    //                   1 44
    //                   2 44;
           goto _L1 _L2 _L2 _L2
_L1:
        int j;
        try
        {
            throw new IllegalArgumentException(z[2]);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
_L2:
        if ((j = MenuBuilder.a) != 0) goto _L1; else goto _L3
_L3:
        mShowAsAction = i;
        mMenu.onItemActionRequestChanged(this);
        return;
    }

    void setSubMenu(SubMenuBuilder submenubuilder)
    {
        mSubMenu = submenubuilder;
        submenubuilder.setHeaderTitle(getTitle());
    }

    public MenuItem setTitle(int i)
    {
        return setTitle(((CharSequence) (mMenu.getContext().getString(i))));
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        try
        {
            mTitle = charsequence;
            mMenu.onItemsChanged(false);
            if (mSubMenu != null)
            {
                mSubMenu.setHeaderTitle(charsequence);
            }
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
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
        try
        {
            if (setVisibleInt(flag))
            {
                mMenu.onItemVisibleChanged(this);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        return this;
    }

    boolean setVisibleInt(boolean flag)
    {
        boolean flag1 = false;
        int j = mFlags;
        int i;
        int k;
        try
        {
            k = mFlags;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        try
        {
            mFlags = i | k & -9;
            i = mFlags;
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        flag = flag1;
        if (j != i)
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
        boolean flag;
        try
        {
            flag = mMenu.isShortcutsVisible();
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            try
            {
                throw activitynotfoundexception;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (getShortcut() != 0)
        {
            return true;
        }
        return false;
    }

    public boolean showsTextAsAction()
    {
        int i;
        try
        {
            i = mShowAsAction;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        return (i & 4) == 4;
    }

    public String toString()
    {
        return mTitle.toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "r6z\013\nK6y7.O?";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "|2zY7\0375}\020'\0372w\n*I:`\007cK<4\026\"Q7x\033cV=`\033-Kh4\027$Q<f\027-X";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "l\033[)\034~\000K?\000k\032[0\034~\037C?\032l\1774-\013p\004K?\020`\022W*\np\035K7\005`\001[1\016\023su\020'\037\000\\1\024`\022G!\002|\007]1\r`\035Q(\006msu\f&\037>a\n6^?x\007cZ+w\0226L:b\033m";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 67;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 63;
          goto _L9
_L5:
        byte0 = 83;
          goto _L9
_L6:
        byte0 = 20;
          goto _L9
        byte0 = 126;
          goto _L9
    }
}
