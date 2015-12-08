// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import android.widget.AdapterView;
import com.walmart.android.service.wishlist.WishList;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ListCreatorPresenter

class this._cls0
    implements android.widget.tedListener
{

    final ListCreatorPresenter this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (WishList)ListCreatorPresenter.access$500(ListCreatorPresenter.this).getItem(i);
        if (ListCreatorPresenter.access$600(ListCreatorPresenter.this))
        {
            ListCreatorPresenter.access$700(ListCreatorPresenter.this, ((WishList) (adapterview)).id);
        }
        ListCreatorPresenter.access$602(ListCreatorPresenter.this, true);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    stsAdapter()
    {
        this$0 = ListCreatorPresenter.this;
        super();
    }
}
