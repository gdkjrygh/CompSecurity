// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.service.wishlist.WishListManager;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ReceiptMatchPresenter, MatchedItemsAdapter

class this._cls0
    implements android.view.iptMatchPresenter._cls1
{

    final ReceiptMatchPresenter this$0;

    public void onClick(View view)
    {
        view = ReceiptMatchPresenter.access$000(ReceiptMatchPresenter.this).getSelectedItems();
        if (view.length > 0)
        {
            WishListManager.get().markPurchasedItems(ReceiptMatchPresenter.access$100(ReceiptMatchPresenter.this).id, view).addCallback(new CallbackSameThread(ReceiptMatchPresenter.access$200(ReceiptMatchPresenter.this)) {

                final ReceiptMatchPresenter._cls1 this$1;

                public void onResultSameThread(Request request, Result result)
                {
                    if (!isPopped())
                    {
                        if (result.successful())
                        {
                            ReceiptMatchPresenter.access$300(this$0, 1);
                        } else
                        {
                            byte byte0;
                            if (result.hasError() && result.getError().connectionError())
                            {
                                byte0 = 1;
                            } else
                            {
                                byte0 = 0;
                            }
                            request = this$0;
                            if (byte0 != 0)
                            {
                                byte0 = 2;
                            } else
                            {
                                byte0 = 3;
                            }
                            ReceiptMatchPresenter.access$400(request, byte0);
                        }
                        ReceiptMatchPresenter.access$500(this$0).setText(0x7f09064f);
                        ReceiptMatchPresenter.access$500(this$0).setEnabled(true);
                    }
                    ReceiptMatchPresenter.access$600(this$0).afterUpdate(result.successful());
                }

            
            {
                this$1 = ReceiptMatchPresenter._cls1.this;
                super(context);
            }
            });
            ReceiptMatchPresenter.access$500(ReceiptMatchPresenter.this).setText(0x7f090650);
            ReceiptMatchPresenter.access$500(ReceiptMatchPresenter.this).setEnabled(false);
            ReceiptMatchPresenter.access$600(ReceiptMatchPresenter.this).beforeUpdate();
            MessageBus.getBus().post(new com.walmartlabs.anivia.r("listMarkPurchased"));
        }
    }

    _cls1.this._cls1()
    {
        this$0 = ReceiptMatchPresenter.this;
        super();
    }
}
