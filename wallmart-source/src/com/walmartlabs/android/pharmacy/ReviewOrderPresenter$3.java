// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PharmacyUtils

class this._cls0
    implements android.view.iewOrderPresenter._cls3
{

    final ReviewOrderPresenter this$0;

    public void onClick(View view)
    {
        if (ReviewOrderPresenter.access$400(ReviewOrderPresenter.this) == ReviewOrderPresenter.access$500(ReviewOrderPresenter.this))
        {
            view = (TextView)ViewUtil.findViewById(ReviewOrderPresenter.access$600(ReviewOrderPresenter.this), ed_find_store_button);
            view.setTextColor(ReviewOrderPresenter.access$700(ReviewOrderPresenter.this).getResources().getColor(this._fld0));
            ScrollView scrollview = (ScrollView)ViewUtil.findViewById(ReviewOrderPresenter.access$600(ReviewOrderPresenter.this), this._fld0);
            PharmacyUtils.scrollAndFocus(ReviewOrderPresenter.access$700(ReviewOrderPresenter.this), scrollview, view);
            return;
        } else
        {
            ReviewOrderPresenter.access$800(ReviewOrderPresenter.this);
            return;
        }
    }

    ()
    {
        this$0 = ReviewOrderPresenter.this;
        super();
    }
}
