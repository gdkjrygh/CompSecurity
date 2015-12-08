// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.view.View;
import com.walmart.android.app.shop.map.InStoreMapFullScreenPresenter;
import com.walmart.android.app.shop.map.InStoreMapSectionController;
import com.walmart.android.app.shop.map.InStoreSearchPagerAdapter;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.shop:
//            InStoreListPresenter

class this._cls1
    implements com.walmart.android.app.shop.map.nter.ActionCallbacks
{

    final is._cls0 this$1;

    public void onItemSelected(int i)
    {
        InStoreListPresenter.access$400(_fld0, i);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/shop/InStoreListPresenter$3

/* anonymous class */
    class InStoreListPresenter._cls3 extends OnSingleClickListener
    {

        final InStoreListPresenter this$0;

        public void onSingleClick(View view)
        {
            view = new InStoreSearchPagerAdapter();
            InStoreListPresenter.access$500(InStoreListPresenter.this, new InStoreMapFullScreenPresenter(InStoreListPresenter.access$200(InStoreListPresenter.this), getPresenterStack().peek().getTitleText(), InStoreListPresenter.access$300(InStoreListPresenter.this).getSourceDataMapper(), view, new InStoreListPresenter._cls3._cls1()));
        }

            
            {
                this$0 = InStoreListPresenter.this;
                super(presenter);
            }
    }

}
