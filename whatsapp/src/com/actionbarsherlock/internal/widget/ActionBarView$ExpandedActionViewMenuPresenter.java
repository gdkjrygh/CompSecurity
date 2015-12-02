// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.view.menu.MenuItemImpl;
import com.actionbarsherlock.internal.view.menu.MenuPresenter;
import com.actionbarsherlock.internal.view.menu.SubMenuBuilder;
import com.actionbarsherlock.view.CollapsibleActionView;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            ActionBarView, AbsActionBarView, ScrollingTabContainerView, IcsSpinner

class <init>
    implements MenuPresenter
{

    MenuItemImpl mCurrentExpandedItem;
    MenuBuilder mMenu;
    final ActionBarView this$0;

    public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
label0:
        {
            if (mExpandedActionView instanceof CollapsibleActionView)
            {
                ((CollapsibleActionView)mExpandedActionView).onActionViewCollapsed();
            }
            removeView(mExpandedActionView);
            removeView(ActionBarView.access$600(ActionBarView.this));
            mExpandedActionView = null;
            if ((ActionBarView.access$1200(ActionBarView.this) & 2) != 0)
            {
                ActionBarView.access$700(ActionBarView.this)._mth0(0);
            }
            if ((ActionBarView.access$1200(ActionBarView.this) & 8) == 0)
            {
                break label0;
            }
            if (ActionBarView.access$800(ActionBarView.this) == null)
            {
                ActionBarView.access$1300(ActionBarView.this);
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            ActionBarView.access$800(ActionBarView.this).setVisibility(0);
        }
        if (ActionBarView.access$900(ActionBarView.this) != null && ActionBarView.access$1400(ActionBarView.this) == 2)
        {
            ActionBarView.access$900(ActionBarView.this).setVisibility(0);
        }
        if (ActionBarView.access$1000(ActionBarView.this) != null && ActionBarView.access$1400(ActionBarView.this) == 1)
        {
            ActionBarView.access$1000(ActionBarView.this).setVisibility(0);
        }
        if (ActionBarView.access$1100(ActionBarView.this) != null && (ActionBarView.access$1200(ActionBarView.this) & 0x10) != 0)
        {
            ActionBarView.access$1100(ActionBarView.this).setVisibility(0);
        }
        ActionBarView.access$600(ActionBarView.this)._mth0(null);
        mCurrentExpandedItem = null;
        requestLayout();
        menuitemimpl.setActionViewExpanded(false);
        return true;
    }

    public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        mExpandedActionView = menuitemimpl.getActionView();
        ActionBarView.access$600(ActionBarView.this)._mth0(ActionBarView.access$500(ActionBarView.this).getConstantState()._mth0());
        mCurrentExpandedItem = menuitemimpl;
        if (mExpandedActionView.getParent() != ActionBarView.this)
        {
            addView(mExpandedActionView);
        }
        if (ActionBarView.access$600(ActionBarView.this)._mth0() != ActionBarView.this)
        {
            addView(ActionBarView.access$600(ActionBarView.this));
        }
        ActionBarView.access$700(ActionBarView.this)._mth0(8);
        if (ActionBarView.access$800(ActionBarView.this) != null)
        {
            ActionBarView.access$800(ActionBarView.this).setVisibility(8);
        }
        if (ActionBarView.access$900(ActionBarView.this) != null)
        {
            ActionBarView.access$900(ActionBarView.this).setVisibility(8);
        }
        if (ActionBarView.access$1000(ActionBarView.this) != null)
        {
            ActionBarView.access$1000(ActionBarView.this).setVisibility(8);
        }
        if (ActionBarView.access$1100(ActionBarView.this) != null)
        {
            ActionBarView.access$1100(ActionBarView.this).setVisibility(8);
        }
        requestLayout();
        menuitemimpl.setActionViewExpanded(true);
        if (mExpandedActionView instanceof CollapsibleActionView)
        {
            ((CollapsibleActionView)mExpandedActionView).onActionViewExpanded();
        }
        return true;
    }

    public boolean flagActionItems()
    {
        return false;
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
        if (mMenu != null && mCurrentExpandedItem != null)
        {
            mMenu.collapseItemActionView(mCurrentExpandedItem);
        }
        mMenu = menubuilder;
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        return false;
    }

    public void updateMenuView(boolean flag)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        int j = AbsActionBarView.b;
        if (mCurrentExpandedItem != null)
        {
            if (mMenu != null)
            {
                int k = mMenu.size();
                int i = 0;
                do
                {
                    flag1 = flag2;
                    if (i >= k)
                    {
                        break;
                    }
                    flag1 = flag2;
                    if (mMenu.getItem(i) == mCurrentExpandedItem)
                    {
                        flag1 = true;
                        flag2 = true;
                        if (j == 0)
                        {
                            break;
                        }
                        flag1 = flag2;
                    }
                    i++;
                    flag2 = flag1;
                } while (j == 0);
            }
            if (!flag1)
            {
                collapseItemActionView(mMenu, mCurrentExpandedItem);
            }
        }
    }

    private Y()
    {
        this$0 = ActionBarView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
