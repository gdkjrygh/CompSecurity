// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import com.walmart.android.service.wishlist.CancelableCallback;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ListCreatorPresenter

class this._cls1
    implements android.content.Listener
{

    final is._cls0 this$1;

    public void onDismiss(DialogInterface dialoginterface)
    {
        ListCreatorPresenter.access$200(_fld0).finish();
    }

    nit>()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/wishlist/ListCreatorPresenter$8

/* anonymous class */
    class ListCreatorPresenter._cls8 extends CancelableCallback
    {

        final ListCreatorPresenter this$0;

        protected void onCancel()
        {
            WLog.d(ListCreatorPresenter.access$1300(), "reloadCurrentWishList().onCancel");
            ListCreatorPresenter.access$1402(ListCreatorPresenter.this, null);
            ListCreatorPresenter.access$2300(ListCreatorPresenter.this, 1);
        }

        public void onResult(Result result)
        {
            WLog.d(ListCreatorPresenter.access$1300(), "reloadCurrentWishList().onResult");
            ListCreatorPresenter.access$1402(ListCreatorPresenter.this, null);
            if (result.successful() && result.hasData() && ListCreatorPresenter.access$1500(ListCreatorPresenter.this).equals(((WishList)result.getData()).id))
            {
                ListCreatorPresenter.access$1002(ListCreatorPresenter.this, (WishList)result.getData());
                ListCreatorPresenter.access$1600(ListCreatorPresenter.this, ListCreatorPresenter.access$1000(ListCreatorPresenter.this));
                ListCreatorPresenter.access$1100(ListCreatorPresenter.this);
                ListCreatorPresenter.access$2000(ListCreatorPresenter.this, ListCreatorPresenter.access$1700(ListCreatorPresenter.this), ListCreatorPresenter.access$1800(ListCreatorPresenter.this), ListCreatorPresenter.access$1900(ListCreatorPresenter.this));
                ListCreatorPresenter.access$1200(ListCreatorPresenter.this);
                return;
            }
            if (ListCreatorPresenter.access$2100(ListCreatorPresenter.this))
            {
                result = DialogFactory.onCreateDialog(900, ListCreatorPresenter.access$200(ListCreatorPresenter.this));
                result.setOnDismissListener(new ListCreatorPresenter._cls8._cls1());
                result.show();
            }
            ListCreatorPresenter.access$2200(ListCreatorPresenter.this, 1);
        }

            
            {
                this$0 = ListCreatorPresenter.this;
                super(context);
            }
    }

}
