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

class val.bucketName
    implements com.contextlogic.wish.api.service.back
{

    final val.bucketName this$1;
    final String val$bucketName;

    public void onServiceSucceeded()
    {
        hideLoadingSpinner();
        MoveToWishlistMenuFragment.access$500(_fld0).onBucketEdited(MoveToWishlistMenuFragment.access$400(_fld0), val$bucketName, null);
    }

    l.input()
    {
        this$1 = final_input;
        val$bucketName = String.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/menu/wishlist/MoveToWishlistMenuFragment$3

/* anonymous class */
    class MoveToWishlistMenuFragment._cls3
        implements android.content.DialogInterface.OnClickListener
    {

        final MoveToWishlistMenuFragment this$0;
        final UnifiedFontEditText val$input;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = input.getText();
            if (dialoginterface != null && !dialoginterface.toString().trim().equals(""))
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Create);
                dialoginterface = dialoginterface.toString();
                if (wishlistAlreadyExists(dialoginterface))
                {
                    PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getString(0x7f060104));
                    return;
                } else
                {
                    showLoadingSpinner();
                    (new CreateBucketService()).requestService(dialoginterface, dialoginterface. new MoveToWishlistMenuFragment._cls3._cls1(), new MoveToWishlistMenuFragment._cls3._cls2());
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

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/menu/wishlist/MoveToWishlistMenuFragment$3$2

/* anonymous class */
        class MoveToWishlistMenuFragment._cls3._cls2
            implements com.contextlogic.wish.api.service.ApiService.FailureCallback
        {

            final MoveToWishlistMenuFragment._cls3 this$1;

            public void onServiceFailed()
            {
                hideLoadingSpinner();
            }

                    
                    {
                        this$1 = MoveToWishlistMenuFragment._cls3.this;
                        super();
                    }
        }

    }

}
