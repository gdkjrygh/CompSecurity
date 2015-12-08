// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import com.walmart.android.service.pharmacylegacy.FourDollarPrescriptions;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.RecyclerItemSingleClickListener;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.pharmacy:
//            PharmacyFourDollarPresenter, RxFourDollarCategoryPresenter

class this._cls0 extends RecyclerItemSingleClickListener
{

    final PharmacyFourDollarPresenter this$0;

    public void onItemSingleClick(BasicViewHolder basicviewholder, int i)
    {
        basicviewholder = PharmacyFourDollarPresenter.access$000(PharmacyFourDollarPresenter.this).getCategories()[i];
        basicviewholder = new RxFourDollarCategoryPresenter(PharmacyFourDollarPresenter.access$100(PharmacyFourDollarPresenter.this), PharmacyFourDollarPresenter.access$200(PharmacyFourDollarPresenter.this, basicviewholder));
        PharmacyFourDollarPresenter.access$300(PharmacyFourDollarPresenter.this, basicviewholder);
    }

    ons(Presenter presenter)
    {
        this$0 = PharmacyFourDollarPresenter.this;
        super(presenter);
    }
}
