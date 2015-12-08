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

class adCallback
    implements ValueCallback
{

    final RootActivity this$0;
    final ProfileImageUploadCallback val$callback;

    public void onReceiveValue(Uri uri)
    {
        uri = readImageUri(uri, 300, 300);
        if (uri == null)
        {
            val$callback.onFailure(true);
            return;
        }
        if (RootActivity.access$1400(RootActivity.this) == null)
        {
            RootActivity.access$1402(RootActivity.this, new UploadProfileImageService());
        }
        showLoadingSpinner();
        RootActivity.access$1400(RootActivity.this).requestService(uri, new com.contextlogic.wish.api.service.UploadProfileImageService.SuccessCallback() {

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
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final RootActivity._cls34 this$1;

            public void onServiceFailed()
            {
                hideLoadingSpinner();
                callback.onFailure(false);
                RootActivity.access$1500(this$0);
            }

            
            {
                this$1 = RootActivity._cls34.this;
                super();
            }
        });
    }

    public volatile void onReceiveValue(Object obj)
    {
        onReceiveValue((Uri)obj);
    }

    adCallback()
    {
        this$0 = final_rootactivity;
        val$callback = ProfileImageUploadCallback.this;
        super();
    }
}
