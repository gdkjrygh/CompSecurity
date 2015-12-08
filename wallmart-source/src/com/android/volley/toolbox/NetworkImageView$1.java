// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.VolleyError;

// Referenced classes of package com.android.volley.toolbox:
//            NetworkImageView

class val.isInLayoutPass
    implements stener
{

    final NetworkImageView this$0;
    final boolean val$isInLayoutPass;

    public void onErrorResponse(VolleyError volleyerror)
    {
        if (NetworkImageView.access$000(NetworkImageView.this) != 0)
        {
            setImageResource(NetworkImageView.access$000(NetworkImageView.this));
        }
    }

    public void onResponse(final ntainer response, boolean flag)
    {
        if (flag && val$isInLayoutPass)
        {
            post(new Runnable() {

                final NetworkImageView._cls1 this$1;
                final ImageLoader.ImageContainer val$response;

                public void run()
                {
                    onResponse(response, false);
                }

            
            {
                this$1 = NetworkImageView._cls1.this;
                response = imagecontainer;
                super();
            }
            });
        } else
        {
            if (response.getBitmap() != null)
            {
                setImageBitmap(response.getBitmap());
                return;
            }
            if (NetworkImageView.access$100(NetworkImageView.this) != 0)
            {
                setImageResource(NetworkImageView.access$100(NetworkImageView.this));
                return;
            }
        }
    }

    _cls1.val.response()
    {
        this$0 = final_networkimageview;
        val$isInLayoutPass = Z.this;
        super();
    }
}
