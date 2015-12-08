// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.ui.ViewStackLayout;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.wishlist:
//            DeepLinkFragment, GiverItemListPresenter

class this._cls1
    implements android.content.missListener
{

    final ctivity this$1;

    public void onDismiss(DialogInterface dialoginterface)
    {
        getActivity().finish();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/wishlist/DeepLinkFragment$1

/* anonymous class */
    class DeepLinkFragment._cls1 extends CallbackSameThread
    {

        final DeepLinkFragment this$0;

        public void onResultSameThread(Request request, Result result)
        {
            boolean flag1 = false;
            DeepLinkFragment.access$002(DeepLinkFragment.this, null);
            if (result.successful() && result.hasData())
            {
                DeepLinkFragment.access$100(DeepLinkFragment.this).findViewById(0x7f100083).setVisibility(8);
                DeepLinkFragment.access$200(DeepLinkFragment.this).setVisibility(0);
                request = new GiverItemListPresenter((AppCompatActivity)getActivity(), (WishList)result.getData());
                DeepLinkFragment.access$300(DeepLinkFragment.this).pushPresenter(request, false);
            } else
            if (isVisible() && !getActivity().isFinishing())
            {
                boolean flag = flag1;
                if (result.hasError())
                {
                    flag = flag1;
                    if (result.getError().connectionError())
                    {
                        flag = true;
                    }
                }
                char c;
                if (flag)
                {
                    c = '\u0258';
                } else
                {
                    c = '\u0385';
                }
                request = DialogFactory.onCreateDialog(c, getActivity());
                request.setOnDismissListener(new DeepLinkFragment._cls1._cls1());
                request.show();
                return;
            }
        }

            
            {
                this$0 = DeepLinkFragment.this;
                super();
            }
    }

}
