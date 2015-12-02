// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.Menu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuItemImpl, MenuPresenter, SubMenuBuilder

public class MenuBuilder
    implements Menu
{

    public static int a;
    private static final int sCategoryToOrder[];
    private static final String z[];
    private ArrayList mActionItems;
    private Callback mCallback;
    private final Context mContext;
    private android.view.ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction;
    private MenuItemImpl mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    private ArrayList mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private ArrayList mNonActionItems;
    private boolean mOptionalIconsVisible;
    private CopyOnWriteArrayList mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private ArrayList mTempShortcutItemList;
    private ArrayList mVisibleItems;

    public MenuBuilder(Context context)
    {
        int i = a;
        super();
        mDefaultShowAsAction = 0;
        mPreventDispatchingItemsChanged = false;
        mItemsChangedWhileDispatchPrevented = false;
        mOptionalIconsVisible = false;
        mIsClosing = false;
        mTempShortcutItemList = new ArrayList();
        mPresenters = new CopyOnWriteArrayList();
        mContext = context;
        mResources = context.getResources();
        mItems = new ArrayList();
        mVisibleItems = new ArrayList();
        mIsVisibleItemsStale = true;
        mActionItems = new ArrayList();
        mNonActionItems = new ArrayList();
        mIsActionItemsStale = true;
        setShortcutsVisibleInner(true);
        if (SherlockActivity.a)
        {
            a = i + 1;
        }
    }

    private com.actionbarsherlock.view.MenuItem addInternal(int i, int j, int k, CharSequence charsequence)
    {
        int l = getOrdering(k);
        charsequence = new MenuItemImpl(this, i, j, k, l, charsequence, mDefaultShowAsAction);
        try
        {
            if (mCurrentMenuInfo != null)
            {
                charsequence.setMenuInfo(mCurrentMenuInfo);
            }
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        mItems.add(findInsertIndex(mItems, l), charsequence);
        onItemsChanged(true);
        return charsequence;
    }

    private void dispatchPresenterUpdate(boolean flag)
    {
        Iterator iterator;
        int i;
        i = a;
        boolean flag1;
        try
        {
            flag1 = mPresenters.isEmpty();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (flag1)
        {
            return;
        }
        stopDispatchingItemsChanged();
        iterator = mPresenters.iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        WeakReference weakreference = (WeakReference)iterator.next();
        MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
        if (menupresenter == null)
        {
            try
            {
                mPresenters.remove(weakreference);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (i == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        menupresenter.updateMenuView(flag);
        if (i == 0) goto _L2; else goto _L1
_L1:
        startDispatchingItemsChanged();
        return;
    }

    private boolean dispatchSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        int i;
        boolean flag2;
        flag2 = false;
        i = a;
        boolean flag;
        try
        {
            flag = mPresenters.isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (SubMenuBuilder submenubuilder)
        {
            throw submenubuilder;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return flag2;
_L2:
        Iterator iterator;
        boolean flag1;
        iterator = mPresenters.iterator();
        flag1 = false;
_L5:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
label0:
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                try
                {
                    mPresenters.remove(weakreference);
                }
                // Misplaced declaration of an exception variable
                catch (SubMenuBuilder submenubuilder)
                {
                    throw submenubuilder;
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            if (!flag1)
            {
                flag1 = menupresenter.onSubMenuSelected(submenubuilder);
            }
        }
        flag2 = flag1;
        if (i != 0) goto _L1; else goto _L5
_L4:
        return flag1;
    }

    private static int findInsertIndex(ArrayList arraylist, int i)
    {
        int k = a;
        int j = arraylist.size() - 1;
        do
        {
label0:
            {
                if (j >= 0)
                {
                    MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(j);
                    int l;
                    try
                    {
                        l = menuitemimpl.getOrdering();
                    }
                    // Misplaced declaration of an exception variable
                    catch (ArrayList arraylist)
                    {
                        throw arraylist;
                    }
                    if (l <= i)
                    {
                        return j + 1;
                    }
                    if (k == 0)
                    {
                        break label0;
                    }
                }
                return 0;
            }
            j--;
        } while (true);
    }

    private static int getOrdering(int i)
    {
        int j;
        j = (0xffff0000 & i) >> 16;
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        if (j < sCategoryToOrder.length)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        throw new IllegalArgumentException(z[3]);
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        return sCategoryToOrder[j] << 16 | 0xffff & i;
    }

    private void setHeaderInternal(int i, CharSequence charsequence, int j, Drawable drawable, View view)
    {
        Resources resources;
        int k;
        k = a;
        resources = getResources();
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        mHeaderView = view;
        mHeaderTitle = null;
        mHeaderIcon = null;
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        mHeaderTitle = resources.getText(i);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (charsequence != null)
        {
            try
            {
                mHeaderTitle = charsequence;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
        }
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        mHeaderIcon = resources.getDrawable(j);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (drawable != null)
        {
            try
            {
                mHeaderIcon = drawable;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
        }
        mHeaderView = null;
        onItemsChanged(false);
        return;
        charsequence;
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        throw charsequence;
        charsequence;
        throw charsequence;
    }

    private void setShortcutsVisibleInner(boolean flag)
    {
        boolean flag1 = true;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i = mResources.getConfiguration().keyboard;
        if (i == 1) goto _L2; else goto _L3
_L3:
        IllegalArgumentException illegalargumentexception;
        try
        {
            flag = mResources.getBoolean(com.actionbarsherlock.R.bool.abs__config_showMenuShortcutsWhenKeyboardPresent);
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (!flag) goto _L2; else goto _L4
_L4:
        flag = flag1;
_L6:
        mShortcutsVisible = flag;
        return;
        illegalargumentexception;
        throw illegalargumentexception;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public com.actionbarsherlock.view.MenuItem add(int i, int j, int k, int l)
    {
        return addInternal(i, j, k, mResources.getString(l));
    }

    public com.actionbarsherlock.view.MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
        return addInternal(i, j, k, charsequence);
    }

    public com.actionbarsherlock.view.MenuItem add(CharSequence charsequence)
    {
        return addInternal(0, 0, 0, charsequence);
    }

    public void addMenuPresenter(MenuPresenter menupresenter)
    {
        mPresenters.add(new WeakReference(menupresenter));
        menupresenter.initForMenu(mContext, this);
        mIsActionItemsStale = true;
    }

    public com.actionbarsherlock.view.SubMenu addSubMenu(int i, int j, int k, int l)
    {
        return addSubMenu(i, j, k, ((CharSequence) (mResources.getString(l))));
    }

    public com.actionbarsherlock.view.SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        charsequence = (MenuItemImpl)addInternal(i, j, k, charsequence);
        SubMenuBuilder submenubuilder = new SubMenuBuilder(mContext, this, charsequence);
        charsequence.setSubMenu(submenubuilder);
        return submenubuilder;
    }

    public boolean bindNativeOverflow(android.view.Menu menu, android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener, HashMap hashmap)
    {
        ArrayList arraylist;
        int i;
        boolean flag1;
        flag1 = true;
        i = a;
        arraylist = getNonActionItems();
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        int j;
        boolean flag;
        try
        {
            j = arraylist.size();
        }
        // Misplaced declaration of an exception variable
        catch (android.view.Menu menu)
        {
            throw menu;
        }
        if (j != 0) goto _L3; else goto _L2
_L2:
        flag = false;
_L5:
        return flag;
_L3:
        menu.clear();
        Iterator iterator = arraylist.iterator();
        flag = false;
        do
        {
label0:
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break MISSING_BLOCK_LABEL_560;
                    }
                    MenuItemImpl menuitemimpl = (MenuItemImpl)iterator.next();
                    Object obj;
                    Iterator iterator1;
                    MenuItemImpl menuitemimpl1;
                    MenuItem menuitem;
                    boolean flag2;
                    try
                    {
                        flag2 = menuitemimpl.isVisible();
                    }
                    // Misplaced declaration of an exception variable
                    catch (android.view.Menu menu)
                    {
                        throw menu;
                    }
                } while (!flag2 && i == 0);
                if (menuitemimpl.hasSubMenu())
                {
                    obj = menu.addSubMenu(menuitemimpl.getGroupId(), menuitemimpl.getItemId(), menuitemimpl.getOrder(), menuitemimpl.getTitle());
                    iterator1 = ((SubMenuBuilder)menuitemimpl.getSubMenu()).getVisibleItems().iterator();
                    do
                    {
                        if (!iterator1.hasNext())
                        {
                            break;
                        }
                        menuitemimpl1 = (MenuItemImpl)iterator1.next();
                        menuitem = ((SubMenu) (obj)).add(menuitemimpl1.getGroupId(), menuitemimpl1.getItemId(), menuitemimpl1.getOrder(), menuitemimpl1.getTitle());
                        try
                        {
                            menuitem.setIcon(menuitemimpl1.getIcon());
                            menuitem.setOnMenuItemClickListener(onmenuitemclicklistener);
                            menuitem.setEnabled(menuitemimpl1.isEnabled());
                            menuitem.setIntent(menuitemimpl1.getIntent());
                            menuitem.setNumericShortcut(menuitemimpl1.getNumericShortcut());
                            menuitem.setAlphabeticShortcut(menuitemimpl1.getAlphabeticShortcut());
                            menuitem.setTitleCondensed(menuitemimpl1.getTitleCondensed());
                            menuitem.setCheckable(menuitemimpl1.isCheckable());
                            menuitem.setChecked(menuitemimpl1.isChecked());
                            if (menuitemimpl1.isExclusiveCheckable())
                            {
                                ((SubMenu) (obj)).setGroupCheckable(menuitemimpl1.getGroupId(), true, true);
                            }
                        }
                        // Misplaced declaration of an exception variable
                        catch (android.view.Menu menu)
                        {
                            throw menu;
                        }
                        hashmap.put(menuitem, menuitemimpl1);
                    } while (i == 0);
                    obj = ((SubMenu) (obj)).getItem();
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                obj = menu.add(menuitemimpl.getGroupId(), menuitemimpl.getItemId(), menuitemimpl.getOrder(), menuitemimpl.getTitle());
            }
            try
            {
                ((MenuItem) (obj)).setIcon(menuitemimpl.getIcon());
                ((MenuItem) (obj)).setOnMenuItemClickListener(onmenuitemclicklistener);
                ((MenuItem) (obj)).setEnabled(menuitemimpl.isEnabled());
                ((MenuItem) (obj)).setIntent(menuitemimpl.getIntent());
                ((MenuItem) (obj)).setNumericShortcut(menuitemimpl.getNumericShortcut());
                ((MenuItem) (obj)).setAlphabeticShortcut(menuitemimpl.getAlphabeticShortcut());
                ((MenuItem) (obj)).setTitleCondensed(menuitemimpl.getTitleCondensed());
                ((MenuItem) (obj)).setCheckable(menuitemimpl.isCheckable());
                ((MenuItem) (obj)).setChecked(menuitemimpl.isChecked());
                if (menuitemimpl.isExclusiveCheckable())
                {
                    menu.setGroupCheckable(menuitemimpl.getGroupId(), true, true);
                }
            }
            // Misplaced declaration of an exception variable
            catch (android.view.Menu menu)
            {
                throw menu;
            }
            hashmap.put(obj, menuitemimpl);
            flag = flag1;
            if (i != 0)
            {
                continue;
            }
            flag = true;
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
        return flag;
    }

    public void changeMenuMode()
    {
        try
        {
            if (mCallback != null)
            {
                mCallback.onMenuModeChange(this);
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    public void clear()
    {
        try
        {
            if (mExpandedItem != null)
            {
                collapseItemActionView(mExpandedItem);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        mItems.clear();
        onItemsChanged(true);
    }

    public void clearHeader()
    {
        mHeaderIcon = null;
        mHeaderTitle = null;
        mHeaderView = null;
        onItemsChanged(false);
    }

    public void close()
    {
        close(true);
    }

    final void close(boolean flag)
    {
        Iterator iterator;
        int i;
        i = a;
        boolean flag1;
        try
        {
            flag1 = mIsClosing;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (flag1)
        {
            return;
        }
        mIsClosing = true;
        iterator = mPresenters.iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        WeakReference weakreference = (WeakReference)iterator.next();
        MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
        if (menupresenter == null)
        {
            try
            {
                mPresenters.remove(weakreference);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (i == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        menupresenter.onCloseMenu(this, flag);
        if (i == 0) goto _L2; else goto _L1
_L1:
        mIsClosing = false;
        return;
    }

    public boolean collapseItemActionView(MenuItemImpl menuitemimpl)
    {
        int i;
        boolean flag2;
        flag2 = false;
        i = a;
        boolean flag;
        try
        {
            flag = mPresenters.isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItemImpl menuitemimpl)
        {
            try
            {
                throw menuitemimpl;
            }
            // Misplaced declaration of an exception variable
            catch (MenuItemImpl menuitemimpl)
            {
                throw menuitemimpl;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        if (mExpandedItem != menuitemimpl)
        {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator iterator = mPresenters.iterator();
        boolean flag1 = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                try
                {
                    mPresenters.remove(weakreference);
                }
                // Misplaced declaration of an exception variable
                catch (MenuItemImpl menuitemimpl)
                {
                    throw menuitemimpl;
                }
                if (i == 0)
                {
                    continue;
                }
            }
            flag2 = menupresenter.collapseItemActionView(this, menuitemimpl);
            flag1 = flag2;
            if (!flag2)
            {
                continue;
            }
            flag1 = flag2;
            if (i == 0)
            {
                break;
            }
            flag1 = flag2;
        } while (i == 0);
        try
        {
            startDispatchingItemsChanged();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItemImpl menuitemimpl)
        {
            throw menuitemimpl;
        }
        flag2 = flag1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        mExpandedItem = null;
        return flag1;
        return flag2;
    }

    boolean dispatchMenuItemSelected(MenuBuilder menubuilder, com.actionbarsherlock.view.MenuItem menuitem)
    {
        Callback callback;
        try
        {
            callback = mCallback;
        }
        // Misplaced declaration of an exception variable
        catch (MenuBuilder menubuilder)
        {
            try
            {
                throw menubuilder;
            }
            // Misplaced declaration of an exception variable
            catch (MenuBuilder menubuilder)
            {
                throw menubuilder;
            }
        }
        if (callback == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (mCallback.onMenuItemSelected(menubuilder, menuitem))
        {
            return true;
        }
        return false;
    }

    public boolean expandItemActionView(MenuItemImpl menuitemimpl)
    {
        int i;
        boolean flag2;
        flag2 = false;
        i = a;
        boolean flag;
        try
        {
            flag = mPresenters.isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItemImpl menuitemimpl)
        {
            throw menuitemimpl;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return flag2;
_L2:
        stopDispatchingItemsChanged();
        Iterator iterator = mPresenters.iterator();
        boolean flag1 = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                try
                {
                    mPresenters.remove(weakreference);
                }
                // Misplaced declaration of an exception variable
                catch (MenuItemImpl menuitemimpl)
                {
                    throw menuitemimpl;
                }
                if (i == 0)
                {
                    continue;
                }
            }
            flag2 = menupresenter.expandItemActionView(this, menuitemimpl);
            flag1 = flag2;
            if (!flag2)
            {
                continue;
            }
            flag1 = flag2;
            if (i == 0)
            {
                break;
            }
            flag1 = flag2;
        } while (i == 0);
        try
        {
            startDispatchingItemsChanged();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItemImpl menuitemimpl)
        {
            throw menuitemimpl;
        }
        flag2 = flag1;
        if (!flag1) goto _L1; else goto _L3
_L3:
        mExpandedItem = menuitemimpl;
        return flag1;
    }

    public com.actionbarsherlock.view.MenuItem findItem(int i)
    {
        int j;
        int k;
        int l;
        k = a;
        l = size();
        j = 0;
_L5:
        Object obj;
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj = (MenuItemImpl)mItems.get(j);
        int i1;
        try
        {
            i1 = ((MenuItemImpl) (obj)).getItemId();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i1 != i) goto _L2; else goto _L1
_L1:
        return ((com.actionbarsherlock.view.MenuItem) (obj));
_L2:
        com.actionbarsherlock.view.MenuItem menuitem;
        if (!((MenuItemImpl) (obj)).hasSubMenu())
        {
            break; /* Loop/switch isn't completed */
        }
        menuitem = ((MenuItemImpl) (obj)).getSubMenu().findItem(i);
        obj = menuitem;
        if (menuitem != null) goto _L1; else goto _L3
_L3:
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        return null;
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void flagActionItems()
    {
        int i;
        int j = a;
        boolean flag;
        try
        {
            flag = mIsActionItemsStale;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (!flag)
        {
            return;
        }
        Iterator iterator = mPresenters.iterator();
        i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)((WeakReference) (obj)).get();
            if (menupresenter == null)
            {
                ArrayList arraylist;
                int k;
                boolean flag1;
                try
                {
                    mPresenters.remove(obj);
                }
                catch (IllegalArgumentException illegalargumentexception1)
                {
                    throw illegalargumentexception1;
                }
                if (j == 0)
                {
                    continue;
                }
            }
            i = menupresenter.flagActionItems() | i;
        } while (j == 0);
        if (!i) goto _L2; else goto _L1
_L1:
        mActionItems.clear();
        mNonActionItems.clear();
        arraylist = getVisibleItems();
        k = arraylist.size();
        i = 0;
_L7:
        if (i >= k) goto _L4; else goto _L3
_L3:
        obj = (MenuItemImpl)arraylist.get(i);
        flag1 = ((MenuItemImpl) (obj)).isActionButton();
        if (flag1)
        {
            IllegalArgumentException illegalargumentexception2;
            try
            {
                mActionItems.add(obj);
            }
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_176;
            }
        }
        mNonActionItems.add(obj);
        if (j == 0) goto _L5; else goto _L4
_L4:
        mIsActionItemsStale = false;
        return;
        illegalargumentexception2;
        throw illegalargumentexception2;
_L2:
        mActionItems.clear();
        mNonActionItems.clear();
        mNonActionItems.addAll(getVisibleItems());
        if (true) goto _L4; else goto _L5
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    ArrayList getActionItems()
    {
        flagActionItems();
        return mActionItems;
    }

    protected String getActionViewStatesKey()
    {
        return z[0];
    }

    public Context getContext()
    {
        return mContext;
    }

    public MenuItemImpl getExpandedItem()
    {
        return mExpandedItem;
    }

    public com.actionbarsherlock.view.MenuItem getItem(int i)
    {
        return (com.actionbarsherlock.view.MenuItem)mItems.get(i);
    }

    ArrayList getNonActionItems()
    {
        flagActionItems();
        return mNonActionItems;
    }

    boolean getOptionalIconsVisible()
    {
        return mOptionalIconsVisible;
    }

    Resources getResources()
    {
        return mResources;
    }

    public MenuBuilder getRootMenu()
    {
        return this;
    }

    ArrayList getVisibleItems()
    {
        int j;
label0:
        {
            j = a;
            ArrayList arraylist;
            try
            {
                if (mIsVisibleItemsStale)
                {
                    break label0;
                }
                arraylist = mVisibleItems;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return arraylist;
        }
        mVisibleItems.clear();
        int k = mItems.size();
        int i = 0;
        do
        {
label1:
            {
                if (i < k)
                {
                    MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(i);
                    try
                    {
                        if (menuitemimpl.isVisible())
                        {
                            mVisibleItems.add(menuitemimpl);
                        }
                    }
                    catch (IllegalArgumentException illegalargumentexception1)
                    {
                        throw illegalargumentexception1;
                    }
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                mIsVisibleItemsStale = false;
                mIsActionItemsStale = true;
                return mVisibleItems;
            }
            i++;
        } while (true);
    }

    public boolean hasVisibleItems()
    {
        int j = a;
        int k = size();
        int i = 0;
        do
        {
label0:
            {
                if (i < k)
                {
                    MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(i);
                    boolean flag;
                    try
                    {
                        flag = menuitemimpl.isVisible();
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        throw illegalargumentexception;
                    }
                    if (flag)
                    {
                        return true;
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return false;
            }
            i++;
        } while (true);
    }

    boolean isQwertyMode()
    {
        return mQwertyMode;
    }

    public boolean isShortcutsVisible()
    {
        return mShortcutsVisible;
    }

    void onItemActionRequestChanged(MenuItemImpl menuitemimpl)
    {
        mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    void onItemVisibleChanged(MenuItemImpl menuitemimpl)
    {
        mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    void onItemsChanged(boolean flag)
    {
        boolean flag1 = mPreventDispatchingItemsChanged;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        IllegalArgumentException illegalargumentexception;
        if (flag)
        {
            try
            {
                mIsVisibleItemsStale = true;
                mIsActionItemsStale = true;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        dispatchPresenterUpdate(flag);
        if (a == 0)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        mItemsChangedWhileDispatchPrevented = true;
        return;
        illegalargumentexception;
        throw illegalargumentexception;
        IllegalArgumentException illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
    }

    public boolean performItemAction(com.actionbarsherlock.view.MenuItem menuitem, int i)
    {
        Object obj;
        int j;
        j = a;
        obj = (MenuItemImpl)menuitem;
        if (obj == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            flag = ((MenuItemImpl) (obj)).isEnabled();
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.view.MenuItem menuitem)
        {
            throw menuitem;
        }
        if (flag) goto _L3; else goto _L2
_L2:
        flag = false;
_L5:
        return flag;
_L3:
        boolean flag1;
        flag1 = ((MenuItemImpl) (obj)).invoke();
        flag = flag1;
        if (((MenuItemImpl) (obj)).hasCollapsibleActionView())
        {
            flag1 = ((MenuItemImpl) (obj)).expandActionView() | flag1;
            flag = flag1;
            if (!flag1)
            {
                continue; /* Loop/switch isn't completed */
            }
            try
            {
                close(true);
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.MenuItem menuitem)
            {
                throw menuitem;
            }
            flag = flag1;
            if (j == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = flag1;
        }
        flag1 = menuitem.hasSubMenu();
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        close(false);
        obj = (SubMenuBuilder)menuitem.getSubMenu();
        menuitem = menuitem.getActionProvider();
        if (menuitem != null)
        {
            try
            {
                if (menuitem.hasSubMenu())
                {
                    menuitem.onPrepareSubMenu(((com.actionbarsherlock.view.SubMenu) (obj)));
                }
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.MenuItem menuitem)
            {
                throw menuitem;
            }
        }
        flag1 = dispatchSubMenuSelected(((SubMenuBuilder) (obj))) | flag;
        if (!flag1)
        {
            try
            {
                close(true);
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.MenuItem menuitem)
            {
                throw menuitem;
            }
        }
        flag = flag1;
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        flag = flag1;
        if ((i & 1) == 0)
        {
            try
            {
                close(true);
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.MenuItem menuitem)
            {
                throw menuitem;
            }
            return flag1;
        }
        if (true) goto _L5; else goto _L4
_L4:
        flag1 = flag;
          goto _L6
        if (true) goto _L5; else goto _L7
_L7:
    }

    public void removeMenuPresenter(MenuPresenter menupresenter)
    {
        int i = a;
        Iterator iterator = mPresenters.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter1 = (MenuPresenter)weakreference.get();
            if (menupresenter1 == null || menupresenter1 == menupresenter)
            {
                try
                {
                    mPresenters.remove(weakreference);
                }
                // Misplaced declaration of an exception variable
                catch (MenuPresenter menupresenter)
                {
                    throw menupresenter;
                }
            }
        } while (i == 0);
    }

    public void restoreActionViewStates(Bundle bundle)
    {
        int j = a;
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        SparseArray sparsearray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        com.actionbarsherlock.view.MenuItem menuitem;
        View view;
        int k;
        try
        {
            i = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            try
            {
                throw bundle;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        if (i < 11 && sparsearray == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = size();
        i = 0;
_L4:
label0:
        {
            if (i < k)
            {
                menuitem = getItem(i);
                view = menuitem.getActionView();
                if (view != null)
                {
                    try
                    {
                        if (view.getId() != -1)
                        {
                            view.restoreHierarchyState(sparsearray);
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (Bundle bundle)
                    {
                        throw bundle;
                    }
                }
                if (menuitem.hasSubMenu())
                {
                    ((SubMenuBuilder)menuitem.getSubMenu()).restoreActionViewStates(bundle);
                }
                if (j == 0)
                {
                    break label0;
                }
            }
            i = bundle.getInt(z[2]);
            if (i > 0)
            {
                bundle = findItem(i);
                if (bundle != null)
                {
                    try
                    {
                        bundle.expandActionView();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Bundle bundle)
                    {
                        throw bundle;
                    }
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        i++;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void saveActionViewStates(Bundle bundle)
    {
        SparseArray sparsearray;
        int i;
        int j;
        int k;
        j = a;
        k = size();
        i = 0;
        sparsearray = null;
_L10:
        if (i >= k) goto _L2; else goto _L1
_L1:
        SparseArray sparsearray2;
        com.actionbarsherlock.view.MenuItem menuitem;
        View view;
        menuitem = getItem(i);
        view = menuitem.getActionView();
        sparsearray2 = sparsearray;
        if (view == null) goto _L4; else goto _L3
_L3:
        SparseArray sparsearray1;
        int l;
        try
        {
            l = view.getId();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        sparsearray2 = sparsearray;
        if (l == -1) goto _L4; else goto _L5
_L5:
        sparsearray1 = sparsearray;
        if (sparsearray == null)
        {
            sparsearray1 = new SparseArray();
        }
        try
        {
            view.saveHierarchyState(sparsearray1);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        sparsearray2 = sparsearray1;
        if (!menuitem.isActionViewExpanded()) goto _L4; else goto _L6
_L6:
        bundle.putInt(z[1], menuitem.getItemId());
        sparsearray = sparsearray1;
_L8:
        if (menuitem.hasSubMenu())
        {
            ((SubMenuBuilder)menuitem.getSubMenu()).saveActionViewStates(bundle);
        }
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        if (sparsearray == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        bundle.putSparseParcelableArray(getActionViewStatesKey(), sparsearray);
        return;
        bundle;
        throw bundle;
_L4:
        sparsearray = sparsearray2;
        if (true) goto _L8; else goto _L7
_L7:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void setCallback(Callback callback)
    {
        mCallback = callback;
    }

    public MenuBuilder setDefaultShowAsAction(int i)
    {
        mDefaultShowAsAction = i;
        return this;
    }

    void setExclusiveItemChecked(com.actionbarsherlock.view.MenuItem menuitem)
    {
        int i;
        int j;
        int k;
        int l;
        j = a;
        k = menuitem.getGroupId();
        l = mItems.size();
        i = 0;
_L5:
        if (i >= l) goto _L2; else goto _L1
_L1:
        MenuItemImpl menuitemimpl;
        menuitemimpl = (MenuItemImpl)mItems.get(i);
        int i1;
        try
        {
            i1 = menuitemimpl.getGroupId();
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.view.MenuItem menuitem)
        {
            try
            {
                throw menuitem;
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.MenuItem menuitem)
            {
                throw menuitem;
            }
        }
        if (i1 != k) goto _L4; else goto _L3
_L3:
        if (menuitemimpl.isExclusiveCheckable())
        {
            boolean flag;
            try
            {
                flag = menuitemimpl.isCheckable();
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.MenuItem menuitem)
            {
                throw menuitem;
            }
            if (flag)
            {
                boolean flag1;
                if (menuitemimpl == menuitem)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                menuitemimpl.setCheckedInt(flag1);
            }
        }
          goto _L4
_L6:
        i++;
          goto _L5
_L4:
        if (j == 0) goto _L6; else goto _L2
_L2:
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        int k = a;
        int l = mItems.size();
        int j = 0;
        do
        {
label0:
            {
                if (j < l)
                {
                    MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
                    try
                    {
                        if (menuitemimpl.getGroupId() == i)
                        {
                            menuitemimpl.setExclusiveCheckable(flag1);
                            menuitemimpl.setCheckable(flag);
                        }
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        throw illegalargumentexception;
                    }
                    if (k == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            j++;
        } while (true);
    }

    public void setGroupVisible(int i, boolean flag)
    {
        boolean flag1;
        int j;
        int k;
        int l;
        k = a;
        l = mItems.size();
        j = 0;
        flag1 = false;
_L2:
label0:
        {
label1:
            {
                if (j >= l)
                {
                    break label0;
                }
                MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
                boolean flag2;
                try
                {
                    if (menuitemimpl.getGroupId() != i)
                    {
                        break label1;
                    }
                    flag2 = menuitemimpl.setVisibleInt(flag);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
                if (flag2)
                {
                    flag1 = true;
                }
            }
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_85;
            }
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        onItemsChanged(true);
        return;
        IllegalArgumentException illegalargumentexception1;
        illegalargumentexception1;
        throw illegalargumentexception1;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected MenuBuilder setHeaderTitleInt(CharSequence charsequence)
    {
        setHeaderInternal(0, charsequence, 0, null, null);
        return this;
    }

    public void setQwertyMode(boolean flag)
    {
        mQwertyMode = flag;
        onItemsChanged(false);
    }

    public int size()
    {
        return mItems.size();
    }

    public void startDispatchingItemsChanged()
    {
        try
        {
            mPreventDispatchingItemsChanged = false;
            if (mItemsChangedWhileDispatchPrevented)
            {
                mItemsChangedWhileDispatchPrevented = false;
                onItemsChanged(true);
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    public void stopDispatchingItemsChanged()
    {
        try
        {
            if (!mPreventDispatchingItemsChanged)
            {
                mPreventDispatchingItemsChanged = true;
                mItemsChangedWhileDispatchPrevented = false;
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "L\bx)\nD\002&6\000C\023&:\006Y\017s5\023D\003k(\021L\022y(";
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
                obj = "L\bx)\nD\002&6\000C\023&>\035]\007r?\000I\007\177/\fB\bj2\000Z";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "L\bx)\nD\002&6\000C\023&>\035]\007r?\000I\007\177/\fB\bj2\000Z";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "B\024x>\027\r\002s>\026\r\bs/EN\tr/\004D\b<:E[\007p2\001\r\005}/\000J\tn\"K";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                sCategoryToOrder = (new int[] {
                    1, 4, 5, 3, 2, 0
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 208
    //                   0 229
    //                   1 235
    //                   2 241
    //                   3 247;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_247;
_L3:
        byte byte0 = 101;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 45;
          goto _L9
_L5:
        byte0 = 102;
          goto _L9
_L6:
        byte0 = 28;
          goto _L9
        byte0 = 91;
          goto _L9
    }

    private class Callback
    {

        public abstract boolean onMenuItemSelected(MenuBuilder menubuilder, com.actionbarsherlock.view.MenuItem menuitem);

        public abstract void onMenuModeChange(MenuBuilder menubuilder);
    }

}
