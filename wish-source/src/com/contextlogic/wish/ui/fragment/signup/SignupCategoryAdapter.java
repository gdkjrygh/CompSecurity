// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.contextlogic.wish.api.data.WishSignupCategory;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridViewAdapter;
import com.contextlogic.wish.util.TabletUtil;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCategoryGridCellView, SignupCategoryFragment

public class SignupCategoryAdapter
    implements StaggeredGridViewAdapter
{

    private ArrayList categories;
    private Context context;
    private SignupCategoryFragment fragment;
    private StaggeredGridView gridView;

    public SignupCategoryAdapter(Context context1, ArrayList arraylist, StaggeredGridView staggeredgridview, SignupCategoryFragment signupcategoryfragment)
    {
        context = context1;
        categories = arraylist;
        gridView = staggeredgridview;
        fragment = signupcategoryfragment;
    }

    public int getHeightForViewAtIndex(int i, int j)
    {
        return j;
    }

    public int getNumColumnsInLandscape()
    {
        return 2;
    }

    public int getNumColumnsInPortrait()
    {
        return 2;
    }

    public int getNumItems()
    {
        return categories.size();
    }

    public int getScreenWidthOverride()
    {
        int i = (int)TypedValue.applyDimension(1, 16F, context.getResources().getDisplayMetrics());
        if (TabletUtil.isTablet(context))
        {
            return RootActivity.getTabletModalWidth((RootActivity)context) - i;
        } else
        {
            return ((Activity)context).getWindowManager().getDefaultDisplay().getWidth() - i;
        }
    }

    public StaggeredGridCellView getViewAtIndex(int i, int j, boolean flag)
    {
        long l1 = 0L;
        WishSignupCategory wishsignupcategory = (WishSignupCategory)categories.get(i);
        SignupCategoryGridCellView signupcategorygridcellview1 = (SignupCategoryGridCellView)gridView.dequeueView("CategoryCell");
        SignupCategoryGridCellView signupcategorygridcellview = signupcategorygridcellview1;
        if (signupcategorygridcellview1 == null)
        {
            signupcategorygridcellview = new SignupCategoryGridCellView(context);
            signupcategorygridcellview.setIdentifier("CategoryCell");
            signupcategorygridcellview.setFragment(fragment);
        }
        long l = l1;
        if (flag)
        {
            l = l1;
            if (fragment.getAnimationTimeRemaining() == 0L)
            {
                l = 100L;
            }
        }
        signupcategorygridcellview.setCategory(wishsignupcategory, i, j / 2, l);
        return signupcategorygridcellview;
    }

    public boolean overrideScreenWidth()
    {
        return true;
    }
}
