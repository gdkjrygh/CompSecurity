// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.ResourcesCompat;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.MenuItem;
import java.util.ArrayList;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            BaseMenuPresenter, MenuBuilder, ActionMenuView, ActionMenuItemView, 
//            MenuItemImpl, MenuPopupHelper, SubMenuBuilder, MenuView

public class ActionMenuPresenter extends BaseMenuPresenter
    implements com.actionbarsherlock.view.ActionProvider.SubUiVisibilityListener
{

    private final SparseBooleanArray mActionButtonGroups = new SparseBooleanArray();
    private ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    private View mOverflowButton;
    private OverflowPopup mOverflowPopup;
    final PopupPresenterCallback mPopupPresenterCallback = new PopupPresenterCallback(null);
    private OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private View mScrapActionButtonView;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    public ActionMenuPresenter(Context context)
    {
        super(context, com.actionbarsherlock.R.layout.abs__action_menu_layout, com.actionbarsherlock.R.layout.abs__action_menu_item_layout);
    }

    private View findViewForItem(MenuItem menuitem)
    {
        ViewGroup viewgroup;
        int j;
        j = MenuBuilder.a;
        viewgroup = (ViewGroup)mMenuView;
        if (viewgroup != null) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        int k = viewgroup.getChildCount();
        View view1;
        for (int i = 0; i >= k; i++)
        {
            break MISSING_BLOCK_LABEL_75;
        }

        view1 = viewgroup.getChildAt(i);
        if (!(view1 instanceof MenuView.ItemView))
        {
            break; /* Loop/switch isn't completed */
        }
        view = view1;
        if (((MenuView.ItemView)view1).getItemData() == menuitem) goto _L4; else goto _L3
_L3:
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        return null;
    }

    public static boolean reserveOverflow(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (HasPermanentMenuKey.get(context))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void bindItemView(MenuItemImpl menuitemimpl, MenuView.ItemView itemview)
    {
        itemview.initialize(menuitemimpl, 0);
        menuitemimpl = (ActionMenuView)mMenuView;
        ((ActionMenuItemView)itemview).setItemInvoker(menuitemimpl);
    }

    public boolean dismissPopupMenus()
    {
        return hideOverflowMenu() | hideSubMenus();
    }

    public boolean filterLeftoverView(ViewGroup viewgroup, int i)
    {
        if (viewgroup.getChildAt(i) == mOverflowButton)
        {
            return false;
        } else
        {
            return super.filterLeftoverView(viewgroup, i);
        }
    }

    public boolean flagActionItems()
    {
        ArrayList arraylist;
        ViewGroup viewgroup;
        boolean flag;
        int k;
        int l;
        int i1;
        int k1;
        int l1;
        int l2;
        int i3;
        int j3;
        l2 = MenuBuilder.a;
        arraylist = mMenu.getVisibleItems();
        i3 = arraylist.size();
        i1 = mMaxItems;
        l1 = mActionItemWidthLimit;
        j3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        viewgroup = (ViewGroup)mMenuView;
        l = 0;
        k = 0;
        flag = false;
        k1 = 0;
_L31:
        Object obj;
        int j1;
        if (k1 >= i3)
        {
            break MISSING_BLOCK_LABEL_1003;
        }
        obj = (MenuItemImpl)arraylist.get(k1);
        j1 = l;
        if (!((MenuItemImpl) (obj)).requiresActionButton()) goto _L2; else goto _L1
_L1:
        l++;
        if (l2 == 0) goto _L4; else goto _L3
_L3:
        boolean flag1;
        MenuItemImpl menuitemimpl;
        Object obj1;
        int i;
        int i2;
        int k2;
        boolean flag3;
        if (SherlockActivity.a)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        SherlockActivity.a = flag1;
        j1 = l;
_L2:
        if (!((MenuItemImpl) (obj)).requestsActionButton()) goto _L6; else goto _L5
_L5:
        k++;
        if (l2 == 0) goto _L7; else goto _L6
_L6:
        l = j1;
        flag = true;
_L4:
        if (mExpandedActionViewsExclusive && ((MenuItemImpl) (obj)).isActionViewExpanded())
        {
            i1 = 0;
        }
        if (l2 == 0) goto _L9; else goto _L8
_L8:
        j1 = k;
_L32:
        {
label0:
            {
                k = i1;
                if (!mReserveOverflow)
                {
                    break label0;
                }
                if (!flag)
                {
                    k = i1;
                    if (l + j1 <= i1)
                    {
                        break label0;
                    }
                }
                k = i1 - 1;
            }
            obj = mActionButtonGroups;
            ((SparseBooleanArray) (obj)).clear();
            i = 0;
            int j;
            int j2;
            boolean flag2;
            if (mStrictWidthLimit)
            {
                i = l1 / mMinCellSize;
                i1 = mMinCellSize;
                j1 = mMinCellSize;
                k1 = (l1 % i1) / i + j1;
            } else
            {
                k1 = 0;
            }
            k2 = 0;
            i2 = 0;
            i1 = l1;
            j1 = i;
            j = k - l;
            l1 = k2;
            k = i2;
            l = j1;
        }
        if (l1 >= i3) goto _L11; else goto _L10
_L10:
label1:
        {
label2:
            {
                menuitemimpl = (MenuItemImpl)arraylist.get(l1);
                if (!menuitemimpl.requiresActionButton())
                {
                    break label1;
                }
                obj1 = getItemView(menuitemimpl, mScrapActionButtonView, viewgroup);
                if (mScrapActionButtonView == null)
                {
                    mScrapActionButtonView = ((View) (obj1));
                }
                j1 = l;
                if (mStrictWidthLimit)
                {
                    j1 = l - ActionMenuView.measureChildForCells(((View) (obj1)), k1, l, j3, 0);
                    l = j1;
                    if (l2 == 0)
                    {
                        break label2;
                    }
                }
                ((View) (obj1)).measure(j3, j3);
                l = j1;
            }
            i2 = ((View) (obj1)).getMeasuredWidth();
            j1 = i1 - i2;
            if (k == 0)
            {
                k = i2;
            }
            i1 = menuitemimpl.getGroupId();
            if (i1 != 0)
            {
                ((SparseBooleanArray) (obj)).put(i1, true);
            }
            menuitemimpl.setIsActionButton(true);
            if (l2 == 0)
            {
                break MISSING_BLOCK_LABEL_955;
            }
            i1 = j1;
        }
        if (!menuitemimpl.requestsActionButton()) goto _L13; else goto _L12
_L12:
        k2 = menuitemimpl.getGroupId();
        flag3 = ((SparseBooleanArray) (obj)).get(k2);
        if ((j > 0 || flag3) && i1 > 0 && (!mStrictWidthLimit || l > 0))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1) goto _L15; else goto _L14
_L14:
label3:
        {
            obj1 = getItemView(menuitemimpl, mScrapActionButtonView, viewgroup);
            if (mScrapActionButtonView == null)
            {
                mScrapActionButtonView = ((View) (obj1));
            }
            if (mStrictWidthLimit)
            {
                i2 = ActionMenuView.measureChildForCells(((View) (obj1)), k1, l, j3, 0);
                j1 = l - i2;
                if (i2 == 0)
                {
                    flag1 = false;
                }
                flag2 = flag1;
                l = j1;
                if (l2 == 0)
                {
                    break label3;
                }
                l = j1;
            }
            ((View) (obj1)).measure(j3, j3);
            flag2 = flag1;
        }
        i2 = ((View) (obj1)).getMeasuredWidth();
        j1 = i1 - i2;
        i1 = k;
        if (k == 0)
        {
            i1 = i2;
        }
        if (!mStrictWidthLimit) goto _L17; else goto _L16
_L16:
        if (j1 >= 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        flag1 = k & flag2;
        if (l2 == 0) goto _L19; else goto _L18
_L18:
        if (j1 + i1 > 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        flag1 &= k;
        k = l;
        l = j1;
_L29:
        if (!flag1 || k2 == 0) goto _L21; else goto _L20
_L20:
        ((SparseBooleanArray) (obj)).put(k2, true);
        j1 = j;
        if (l2 == 0) goto _L22; else goto _L21
_L21:
        j1 = j;
        if (!flag3) goto _L22; else goto _L23
_L23:
        ((SparseBooleanArray) (obj)).put(k2, false);
        j2 = 0;
_L28:
        if (j2 >= l1) goto _L25; else goto _L24
_L24:
        obj1 = (MenuItemImpl)arraylist.get(j2);
        j1 = j;
        if (((MenuItemImpl) (obj1)).getGroupId() == k2)
        {
            j1 = j;
            if (((MenuItemImpl) (obj1)).isActionButton())
            {
                j1 = j + 1;
            }
            ((MenuItemImpl) (obj1)).setIsActionButton(false);
        }
        if (l2 == 0) goto _L26; else goto _L22
_L22:
        j = j1;
        if (flag1)
        {
            j = j1 - 1;
        }
        menuitemimpl.setIsActionButton(flag1);
        j1 = i1;
        i1 = j;
        j = l;
        l = k;
        k = j1;
_L30:
        if (l2 == 0) goto _L27; else goto _L11
_L11:
        return true;
_L27:
        l1++;
        j1 = i1;
        i1 = j;
        j = j1;
        break MISSING_BLOCK_LABEL_288;
_L26:
        j2++;
        j = j1;
          goto _L28
_L25:
        j1 = j;
          goto _L22
_L19:
        k = l;
        l = j1;
          goto _L29
_L17:
        flag1 = flag2;
          goto _L18
_L15:
        j1 = i1;
        i1 = k;
        k = l;
        l = j1;
          goto _L29
_L13:
        j1 = i1;
        i1 = j;
        j = j1;
          goto _L30
        i1 = j;
        j = j1;
          goto _L30
_L9:
        k1++;
          goto _L31
_L7:
        l = j1;
          goto _L4
        j1 = k;
          goto _L32
    }

    public View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
    {
        View view1 = menuitemimpl.getActionView();
        if (view1 == null || menuitemimpl.hasCollapsibleActionView())
        {
            view1 = view;
            if (!(view instanceof ActionMenuItemView))
            {
                view1 = null;
            }
            view1 = super.getItemView(menuitemimpl, view1, viewgroup);
        }
        byte byte0;
        if (menuitemimpl.isActionViewExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        menuitemimpl = (ActionMenuView)viewgroup;
        view = view1.getLayoutParams();
        if (!menuitemimpl.checkLayoutParams(view))
        {
            view1.setLayoutParams(menuitemimpl.generateLayoutParams(view));
        }
        return view1;
    }

    public MenuView getMenuView(ViewGroup viewgroup)
    {
        viewgroup = super.getMenuView(viewgroup);
        ((ActionMenuView)viewgroup).setPresenter(this);
        return viewgroup;
    }

    public boolean hideOverflowMenu()
    {
        if (mPostedOpenRunnable != null && mMenuView != null)
        {
            ((View)mMenuView).removeCallbacks(mPostedOpenRunnable);
            mPostedOpenRunnable = null;
            return true;
        }
        OverflowPopup overflowpopup = mOverflowPopup;
        if (overflowpopup != null)
        {
            overflowpopup.dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean hideSubMenus()
    {
        if (mActionButtonPopup != null)
        {
            mActionButtonPopup.dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
        int j;
label0:
        {
            super.initForMenu(context, menubuilder);
            menubuilder = context.getResources();
            if (!mReserveOverflowSet)
            {
                mReserveOverflow = reserveOverflow(mContext);
            }
            if (!mWidthLimitSet)
            {
                mWidthLimit = menubuilder.getDisplayMetrics().widthPixels / 2;
            }
            if (!mMaxItemsSet)
            {
                mMaxItems = ResourcesCompat.getResources_getInteger(context, com.actionbarsherlock.R.integer.abs__max_action_buttons);
            }
            j = mWidthLimit;
            int i = j;
            if (mReserveOverflow)
            {
                if (mOverflowButton == null)
                {
                    mOverflowButton = new OverflowMenuButton(mSystemContext);
                    i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    mOverflowButton.measure(i, i);
                }
                i = j - mOverflowButton.getMeasuredWidth();
                j = i;
                if (MenuBuilder.a == 0)
                {
                    break label0;
                }
            }
            mOverflowButton = null;
            j = i;
        }
        mActionItemWidthLimit = j;
        mMinCellSize = (int)(56F * menubuilder.getDisplayMetrics().density);
        mScrapActionButtonView = null;
    }

    public boolean isOverflowMenuShowing()
    {
        return mOverflowPopup != null && mOverflowPopup.isShowing();
    }

    public boolean isOverflowReserved()
    {
        return mReserveOverflow;
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        dismissPopupMenus();
        super.onCloseMenu(menubuilder, flag);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (!mMaxItemsSet)
        {
            mMaxItems = ResourcesCompat.getResources_getInteger(mContext, com.actionbarsherlock.R.integer.abs__max_action_buttons);
            if (mMenu != null)
            {
                mMenu.onItemsChanged(true);
            }
        }
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        int i = MenuBuilder.a;
        if (!submenubuilder.hasVisibleItems())
        {
            return false;
        }
        Object obj = submenubuilder;
        Object obj1;
        do
        {
            obj1 = obj;
            if (((SubMenuBuilder) (obj)).getParentMenu() == mMenu)
            {
                break;
            }
            obj1 = (SubMenuBuilder)((SubMenuBuilder) (obj)).getParentMenu();
            obj = obj1;
        } while (i == 0);
        obj1 = findViewForItem(((SubMenuBuilder) (obj1)).getItem());
        obj = obj1;
        if (obj1 == null)
        {
            if (mOverflowButton == null)
            {
                return false;
            }
            obj = mOverflowButton;
        }
        mOpenSubMenuId = submenubuilder.getItem().getItemId();
        mActionButtonPopup = new ActionButtonSubmenu(mContext, submenubuilder);
        mActionButtonPopup.setAnchorView(((View) (obj)));
        mActionButtonPopup.show();
        super.onSubMenuSelected(submenubuilder);
        return true;
    }

    public void onSubUiVisibilityChanged(boolean flag)
    {
label0:
        {
            if (flag)
            {
                super.onSubMenuSelected(null);
                if (MenuBuilder.a == 0)
                {
                    break label0;
                }
            }
            mMenu.close(false);
        }
    }

    public void setExpandedActionViewsExclusive(boolean flag)
    {
        mExpandedActionViewsExclusive = flag;
    }

    public void setItemLimit(int i)
    {
        mMaxItems = i;
        mMaxItemsSet = true;
    }

    public void setReserveOverflow(boolean flag)
    {
        mReserveOverflow = flag;
        mReserveOverflowSet = true;
    }

    public void setWidthLimit(int i, boolean flag)
    {
        mWidthLimit = i;
        mStrictWidthLimit = flag;
        mWidthLimitSet = true;
    }

    public boolean shouldIncludeItem(int i, MenuItemImpl menuitemimpl)
    {
        return menuitemimpl.isActionButton();
    }

    public boolean showOverflowMenu()
    {
        if (mReserveOverflow && !isOverflowMenuShowing() && mMenu != null && mMenuView != null && mPostedOpenRunnable == null && !mMenu.getNonActionItems().isEmpty())
        {
            mPostedOpenRunnable = new OpenOverflowRunnable(new OverflowPopup(mContext, mMenu, mOverflowButton, true));
            ((View)mMenuView).post(mPostedOpenRunnable);
            super.onSubMenuSelected(null);
            return true;
        } else
        {
            return false;
        }
    }

    public void updateMenuView(boolean flag)
    {
        int j;
        j = MenuBuilder.a;
        super.updateMenuView(flag);
        if (mMenu == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        int k;
        obj = mMenu.getActionItems();
        k = ((ArrayList) (obj)).size();
        i = 0;
_L9:
        if (i >= k) goto _L2; else goto _L3
_L3:
        ActionProvider actionprovider = ((MenuItemImpl)((ArrayList) (obj)).get(i)).getActionProvider();
        if (actionprovider != null)
        {
            actionprovider.setSubUiVisibilityListener(this);
        }
        if (j == 0) goto _L4; else goto _L2
_L2:
        if (mMenu != null)
        {
            obj = mMenu.getNonActionItems();
        } else
        {
            obj = null;
        }
        if (!mReserveOverflow || obj == null) goto _L6; else goto _L5
_L5:
label0:
        {
            int l = ((ArrayList) (obj)).size();
            if (l == 1)
            {
                if (!((MenuItemImpl)((ArrayList) (obj)).get(0)).isActionViewExpanded())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (j == 0)
                {
                    break label0;
                }
            }
            if (l > 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
        }
_L7:
label1:
        {
label2:
            {
label3:
                {
                    if (i == 0)
                    {
                        break label2;
                    }
                    if (mOverflowButton == null)
                    {
                        mOverflowButton = new OverflowMenuButton(mSystemContext);
                    }
                    obj = (ViewGroup)mOverflowButton.getParent();
                    if (obj == mMenuView)
                    {
                        break label3;
                    }
                    if (obj != null)
                    {
                        ((ViewGroup) (obj)).removeView(mOverflowButton);
                    }
                    obj = (ActionMenuView)mMenuView;
                    if (ActionBarSherlock.isRtl)
                    {
                        ((ActionMenuView) (obj)).addView(mOverflowButton, 0, ((ActionMenuView) (obj)).generateOverflowButtonLayoutParams());
                        if (j == 0)
                        {
                            break label3;
                        }
                    }
                    ((ActionMenuView) (obj)).addView(mOverflowButton, ((ActionMenuView) (obj)).generateOverflowButtonLayoutParams());
                }
                if (j == 0)
                {
                    break label1;
                }
            }
            if (mOverflowButton != null && mOverflowButton.getParent() == mMenuView)
            {
                ((ViewGroup)mMenuView).removeView(mOverflowButton);
            }
        }
        ((ActionMenuView)mMenuView).setOverflowReserved(mReserveOverflow);
        return;
_L6:
        i = 0;
        if (true) goto _L7; else goto _L4
_L4:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }



/*
    static OverflowPopup access$102(ActionMenuPresenter actionmenupresenter, OverflowPopup overflowpopup)
    {
        actionmenupresenter.mOverflowPopup = overflowpopup;
        return overflowpopup;
    }

*/



/*
    static ActionButtonSubmenu access$302(ActionMenuPresenter actionmenupresenter, ActionButtonSubmenu actionbuttonsubmenu)
    {
        actionmenupresenter.mActionButtonPopup = actionbuttonsubmenu;
        return actionbuttonsubmenu;
    }

*/


/*
    static OpenOverflowRunnable access$402(ActionMenuPresenter actionmenupresenter, OpenOverflowRunnable openoverflowrunnable)
    {
        actionmenupresenter.mPostedOpenRunnable = openoverflowrunnable;
        return openoverflowrunnable;
    }

*/

    private class PopupPresenterCallback
        implements MenuPresenter.Callback
    {

        final ActionMenuPresenter this$0;

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            if (menubuilder instanceof SubMenuBuilder)
            {
                ((SubMenuBuilder)menubuilder).getRootMenu().close(false);
            }
        }

        public boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            if (menubuilder == null)
            {
                return false;
            } else
            {
                mOpenSubMenuId = ((SubMenuBuilder)menubuilder).getItem().getItemId();
                return false;
            }
        }

        private PopupPresenterCallback()
        {
            this$0 = ActionMenuPresenter.this;
            super();
        }

        PopupPresenterCallback(_cls1 _pcls1)
        {
            this();
        }
    }


    private class HasPermanentMenuKey
    {

        public static boolean get(Context context)
        {
            return ViewConfiguration.get(context).hasPermanentMenuKey();
        }
    }


    private class ActionButtonSubmenu extends MenuPopupHelper
    {

        final ActionMenuPresenter this$0;

        public void onDismiss()
        {
            super.onDismiss();
            mActionButtonPopup = null;
            mOpenSubMenuId = 0;
        }

        public ActionButtonSubmenu(Context context, SubMenuBuilder submenubuilder)
        {
            int i = 0;
            int j = MenuBuilder.a;
            this$0 = ActionMenuPresenter.this;
            super(context, submenubuilder);
            if (!((MenuItemImpl)submenubuilder.getItem()).isActionButton())
            {
                int k;
                boolean flag;
                boolean flag1;
                if (mOverflowButton == null)
                {
                    context = (View)mMenuView;
                } else
                {
                    context = mOverflowButton;
                }
                setAnchorView(context);
            }
            setCallback(mPopupPresenterCallback);
            k = submenubuilder.size();
            flag = false;
            do
            {
                flag1 = flag;
                if (i >= k)
                {
                    break;
                }
                actionmenupresenter = submenubuilder.getItem(i);
                flag1 = flag;
                if (isVisible())
                {
                    flag1 = flag;
                    if (getIcon() != null)
                    {
                        flag1 = true;
                        flag = true;
                        if (j == 0)
                        {
                            break;
                        }
                        flag1 = flag;
                    }
                }
                i++;
                flag = flag1;
            } while (j == 0);
            setForceShowIcon(flag1);
        }
    }


    private class OverflowMenuButton extends ImageButton
        implements ActionMenuView.ActionMenuChildView, View_HasStateListenerSupport
    {

        private final Set mListeners = new HashSet();
        final ActionMenuPresenter this$0;

        public void addOnAttachStateChangeListener(View_OnAttachStateChangeListener view_onattachstatechangelistener)
        {
            mListeners.add(view_onattachstatechangelistener);
        }

        public boolean needsDividerAfter()
        {
            return false;
        }

        public boolean needsDividerBefore()
        {
            return false;
        }

        protected void onAttachedToWindow()
        {
            int i = MenuBuilder.a;
            super.onAttachedToWindow();
            Iterator iterator = mListeners.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ((View_OnAttachStateChangeListener)iterator.next()).onViewAttachedToWindow(this);
            } while (i == 0);
        }

        protected void onDetachedFromWindow()
        {
            int i = MenuBuilder.a;
            super.onDetachedFromWindow();
            Iterator iterator = mListeners.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ((View_OnAttachStateChangeListener)iterator.next()).onViewDetachedFromWindow(this);
            } while (i == 0);
            if (mOverflowPopup != null)
            {
                mOverflowPopup.dismiss();
            }
        }

        public boolean performClick()
        {
            if (super.performClick())
            {
                return true;
            } else
            {
                playSoundEffect(0);
                showOverflowMenu();
                return true;
            }
        }

        public void removeOnAttachStateChangeListener(View_OnAttachStateChangeListener view_onattachstatechangelistener)
        {
            mListeners.remove(view_onattachstatechangelistener);
        }

        public OverflowMenuButton(Context context)
        {
            this$0 = ActionMenuPresenter.this;
            super(context, null, com.actionbarsherlock.R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
        }
    }


    private class OverflowPopup extends MenuPopupHelper
    {

        final ActionMenuPresenter this$0;

        public void onDismiss()
        {
            super.onDismiss();
            mMenu.close();
            mOverflowPopup = null;
        }

        public OverflowPopup(Context context, MenuBuilder menubuilder, View view, boolean flag)
        {
            this$0 = ActionMenuPresenter.this;
            super(context, menubuilder, view, flag);
            setCallback(mPopupPresenterCallback);
        }
    }


    private class OpenOverflowRunnable
        implements Runnable
    {

        private OverflowPopup mPopup;
        final ActionMenuPresenter this$0;

        public void run()
        {
            mMenu.changeMenuMode();
            View view = (View)mMenuView;
            if (view != null && view.getWindowToken() != null && mPopup.tryShow())
            {
                mOverflowPopup = mPopup;
            }
            mPostedOpenRunnable = null;
        }

        public OpenOverflowRunnable(OverflowPopup overflowpopup)
        {
            this$0 = ActionMenuPresenter.this;
            super();
            mPopup = overflowpopup;
        }
    }

}
