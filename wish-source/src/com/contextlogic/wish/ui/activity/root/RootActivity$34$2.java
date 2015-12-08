// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.UploadProfileImageService;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity, ProfileImageUploadCallback

class this._cls1
    implements com.contextlogic.wish.api.service.Callback
{

    final is._cls0 this$1;

    public void onServiceFailed()
    {
        hideLoadingSpinner();
        callback.onFailure(false);
        RootActivity.access$1500(_fld0);
    }

    Callback()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/activity/root/RootActivity$34

/* anonymous class */
    class RootActivity._cls34
        implements ValueCallback
    {

        final RootActivity this$0;
        final ProfileImageUploadCallback val$callback;

        public void onReceiveValue(Uri uri)
        {
            uri = readImageUri(uri, 300, 300);
            if (uri == null)
            {
                callback.onFailure(true);
                return;
            }
            if (RootActivity.access$1400(RootActivity.this) == null)
            {
                RootActivity.access$1402(RootActivity.this, new UploadProfileImageService());
            }
            showLoadingSpinner();
            RootActivity.access$1400(RootActivity.this).requestService(uri, new RootActivity._cls34._cls1(), new RootActivity._cls34._cls2());
        }

        public volatile void onReceiveValue(Object obj)
        {
            onReceiveValue((Uri)obj);
        }

            
            {
                this$0 = final_rootactivity;
                callback = ProfileImageUploadCallback.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/activity/root/RootActivity$34$1

/* anonymous class */
        class RootActivity._cls34._cls1
            implements com.contextlogic.wish.api.service.UploadProfileImageService.SuccessCallback
        {

            final RootActivity._cls34 this$1;

            public void onServiceSucceeded(WishUser wishuser)
            {
                hideLoadingSpinner();
                callback.onSuccess(wishuser);
                RootActivity.access$1500(this$0);
            }

                    
                    {
                        this$1 = RootActivity._cls34.this;
                        super();
                    }
        }

    }

}
