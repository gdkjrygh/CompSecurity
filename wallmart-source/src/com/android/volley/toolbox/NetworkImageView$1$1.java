// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.VolleyError;

// Referenced classes of package com.android.volley.toolbox:
//            NetworkImageView

class ainer
    implements Runnable
{

    final val.response this$1;
    final ainer val$response;

    public void run()
    {
        Response(val$response, false);
    }

    ainer()
    {
        this$1 = final_ainer;
        val$response = ainer.this;
        super();
    }

    // Unreferenced inner class com/android/volley/toolbox/NetworkImageView$1

/* anonymous class */
    class NetworkImageView._cls1
        implements ImageLoader.ImageListener
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

        public void onResponse(ImageLoader.ImageContainer imagecontainer, boolean flag)
        {
            if (flag && isInLayoutPass)
            {
                post(imagecontainer. new NetworkImageView._cls1._cls1());
            } else
            {
                if (imagecontainer.getBitmap() != null)
                {
                    setImageBitmap(imagecontainer.getBitmap());
                    return;
                }
                if (NetworkImageView.access$100(NetworkImageView.this) != 0)
                {
                    setImageResource(NetworkImageView.access$100(NetworkImageView.this));
                    return;
                }
            }
        }

            
            {
                this$0 = final_networkimageview;
                isInLayoutPass = Z.this;
                super();
            }
    }

}
