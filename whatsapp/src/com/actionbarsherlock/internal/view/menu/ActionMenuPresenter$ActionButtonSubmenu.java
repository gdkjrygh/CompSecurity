// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.view.View;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuPopupHelper, MenuBuilder, SubMenuBuilder, MenuItemImpl, 
//            ActionMenuPresenter

class setForceShowIcon extends MenuPopupHelper
{

    final ActionMenuPresenter this$0;

    public void onDismiss()
    {
        super.onDismiss();
        ActionMenuPresenter.access$302(ActionMenuPresenter.this, null);
        mOpenSubMenuId = 0;
    }

    public (Context context, SubMenuBuilder submenubuilder)
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
            if (ActionMenuPresenter.access$200(ActionMenuPresenter.this) == null)
            {
                context = (View)mMenuView;
            } else
            {
                context = ActionMenuPresenter.access$200(ActionMenuPresenter.this);
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
