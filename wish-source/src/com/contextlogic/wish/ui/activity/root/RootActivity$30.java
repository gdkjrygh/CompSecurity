// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import com.contextlogic.wish.ui.fragment.menu.wishlist.WishlistMenuFragment;
import com.contextlogic.wish.ui.fragment.menu.wishlistv2.WishlistV2MenuFragment;
import com.contextlogic.wish.util.TabletUtil;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class this._cls0 extends ActionBarDrawerToggle
{

    final RootActivity this$0;

    public void onDrawerClosed(View view)
    {
        super.onDrawerClosed(view);
        RootActivity.access$1002(RootActivity.this, false);
        if (!hasRightMenu() || RootActivity.access$1100(RootActivity.this) == null) goto _L2; else goto _L1
_L1:
        if (!RootActivity.access$1200().equals("show") || (RootActivity.access$1100(RootActivity.this) instanceof WishlistV2MenuFragment)) goto _L4; else goto _L3
_L3:
        view = new WishlistV2MenuFragment();
        setRightMenuFragment(view);
_L2:
        supportInvalidateOptionsMenu();
        return;
_L4:
        if (!RootActivity.access$1200().equals("show") && !(RootActivity.access$1100(RootActivity.this) instanceof WishlistMenuFragment))
        {
            view = new WishlistMenuFragment();
            setRightMenuFragment(view);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void onDrawerOpened(View view)
    {
        super.onDrawerOpened(view);
        if (!TabletUtil.isTablet(RootActivity.this) || RootActivity.access$1300(RootActivity.this) != 2)
        {
            RootActivity.access$1002(RootActivity.this, true);
        }
        if (hasRightMenu() && RootActivity.access$1100(RootActivity.this) != null && (RootActivity.access$1100(RootActivity.this) instanceof WishlistV2MenuFragment))
        {
            ((WishlistV2MenuFragment)RootActivity.access$1100(RootActivity.this)).refreshIfNeeded(false);
        }
        supportInvalidateOptionsMenu();
    }

    tMenuFragment(Activity activity, DrawerLayout drawerlayout, int i, int j)
    {
        this$0 = RootActivity.this;
        super(activity, drawerlayout, i, j);
    }
}
