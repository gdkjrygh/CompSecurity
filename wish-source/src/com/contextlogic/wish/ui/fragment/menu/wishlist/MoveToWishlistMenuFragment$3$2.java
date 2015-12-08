// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlist;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.contextlogic.wish.api.service.CreateBucketService;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.text.UnifiedFontEditText;

// Referenced classes of package com.contextlogic.wish.ui.fragment.menu.wishlist:
//            MoveToWishlistMenuFragment

class this._cls1
    implements com.contextlogic.wish.api.service.uFragment._cls3._cls2
{

    final LoadingSpinner this$1;

    public void onServiceFailed()
    {
        hideLoadingSpinner();
    }

    l.input()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/menu/wishlist/MoveToWishlistMenuFragment$3

/* anonymous class */
    class MoveToWishlistMenuFragment._cls3
        implements android.content.DialogInterface.OnClickListener
    {

        final MoveToWishlistMenuFragment this$0;
        final UnifiedFontEditText val$input;

        public void onClick(final DialogInterface bucketName, int i)
        {
            bucketName = input.getText();
            if (bucketName != null && !bucketName.toString().trim().equals(""))
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Create);
                bucketName = bucketName.toString();
                if (wishlistAlreadyExists(bucketName))
                {
                    PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getString(0x7f060104));
                    return;
                } else
                {
                    showLoadingSpinner();
                    (new CreateBucketService()).requestService(bucketName, new MoveToWishlistMenuFragment._cls3._cls1(), new MoveToWishlistMenuFragment._cls3._cls2());
                    return;
                }
            } else
            {
                PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getString(0x7f0602b7));
                return;
            }
        }

            
            {
                this$0 = final_movetowishlistmenufragment;
                input = UnifiedFontEditText.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/menu/wishlist/MoveToWishlistMenuFragment$3$1

/* anonymous class */
        class MoveToWishlistMenuFragment._cls3._cls1
            implements com.contextlogic.wish.api.service.CreateBucketService.SuccessCallback
        {

            final MoveToWishlistMenuFragment._cls3 this$1;
            final String val$bucketName;

            public void onServiceSucceeded()
            {
                hideLoadingSpinner();
                MoveToWishlistMenuFragment.access$500(this$0).onBucketEdited(MoveToWishlistMenuFragment.access$400(this$0), bucketName, null);
            }

                    
                    {
                        this$1 = MoveToWishlistMenuFragment._cls3.this;
                        bucketName = s;
                        super();
                    }
        }

    }

}
