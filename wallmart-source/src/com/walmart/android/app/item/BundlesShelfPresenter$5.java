// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;


// Referenced classes of package com.walmart.android.app.item:
//            BundlesShelfPresenter

class this._cls0
    implements ener
{

    final BundlesShelfPresenter this$0;

    public void onCheckItem(com.walmart.android.service.item. )
    {
        if (BundlesShelfPresenter.access$000(BundlesShelfPresenter.this).isSelected())
        {
            BundlesShelfPresenter.access$000(BundlesShelfPresenter.this).deselect();
        } else
        if (.isVariant())
        {
            BundlesShelfPresenter.access$702(BundlesShelfPresenter.this, );
            BundlesShelfPresenter.access$800(BundlesShelfPresenter.this, 1);
        } else
        if (BundlesShelfPresenter.access$000(BundlesShelfPresenter.this).canMakeAdditionalSelections())
        {
            BundlesShelfPresenter.access$000(BundlesShelfPresenter.this).select();
        } else
        if (BundlesShelfPresenter.access$000(BundlesShelfPresenter.this).getBundleGroup().getMaximumSelectionsAllowed() > 1)
        {
            BundlesShelfPresenter.access$900(BundlesShelfPresenter.this, 102);
        } else
        {
            BundlesShelfPresenter.access$702(BundlesShelfPresenter.this, );
            BundlesShelfPresenter.access$1000(BundlesShelfPresenter.this, 101);
        }
        BundlesShelfPresenter.access$1100(BundlesShelfPresenter.this);
    }

    ion()
    {
        this$0 = BundlesShelfPresenter.this;
        super();
    }
}
