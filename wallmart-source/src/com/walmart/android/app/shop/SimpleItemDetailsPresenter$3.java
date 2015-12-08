// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.squareup.otto.Bus;
import com.walmart.android.app.item.ProductImagePresenter;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop:
//            SimpleItemDetailsPresenter

class val.imageView extends OnSingleClickListener
{

    final SimpleItemDetailsPresenter this$0;
    final ImageView val$imageView;

    public void onSingleClick(View view)
    {
        if (SimpleItemDetailsPresenter.access$300(SimpleItemDetailsPresenter.this) && (BitmapDrawable)val$imageView.getDrawable() != null)
        {
            view = new com.walmartlabs.anivia.it>("enlargePic");
            MessageBus.getBus().post(view);
            view = new ArrayList();
            view.add(SimpleItemDetailsPresenter.access$400(SimpleItemDetailsPresenter.this));
            view = new ProductImagePresenter(SimpleItemDetailsPresenter.access$500(SimpleItemDetailsPresenter.this), view);
            SimpleItemDetailsPresenter.access$600(SimpleItemDetailsPresenter.this, view);
        }
    }

    (ImageView imageview)
    {
        this$0 = final_simpleitemdetailspresenter;
        val$imageView = imageview;
        super(Presenter.this);
    }
}
