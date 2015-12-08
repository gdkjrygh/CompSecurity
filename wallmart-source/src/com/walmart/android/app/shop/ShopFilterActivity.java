// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.os.Bundle;
import com.walmart.android.app.main.AppState;
import com.walmart.android.app.main.FullScreenActivity;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterPresenter, ShopFilterManager

public class ShopFilterActivity extends FullScreenActivity
{

    private static ShopFilterManager sFilterParamsIn;
    private static ShopFilterManager sFilterParamsOut;
    private ShopFilterManager mShopFilterManager;
    private ShopFilterPresenter mShopFilterPresenter;

    public ShopFilterActivity()
    {
    }

    public static ShopFilterManager getFilterReturnValue()
    {
        ShopFilterManager shopfiltermanager = sFilterParamsOut;
        sFilterParamsOut = null;
        return shopfiltermanager;
    }

    public static void setFilterParams(ShopFilterManager shopfiltermanager)
    {
        sFilterParamsIn = shopfiltermanager;
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, 0x7f05002f);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (AppState.rerouteOnAppStart(this))
        {
            return;
        }
        if (sFilterParamsIn == null)
        {
            finish();
            return;
        } else
        {
            mShopFilterManager = sFilterParamsIn;
            sFilterParamsIn = null;
            mShopFilterPresenter = new ShopFilterPresenter(this, mShopFilterManager);
            mShopFilterPresenter.setOnFilterAppliedListener(new ShopFilterPresenter.OnFilterAppliedListener() {

                final ShopFilterActivity this$0;

                public void onFilterApplied()
                {
                    setResult(-1);
                    ShopFilterActivity.sFilterParamsOut = mShopFilterManager;
                    finish();
                }

            
            {
                this$0 = ShopFilterActivity.this;
                super();
            }
            });
            getPresenterStack().pushPresenter(mShopFilterPresenter, false);
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onResume()
    {
        super.onResume();
        getPresenterStack().popToRoot();
    }


/*
    static ShopFilterManager access$002(ShopFilterManager shopfiltermanager)
    {
        sFilterParamsOut = shopfiltermanager;
        return shopfiltermanager;
    }

*/

}
