// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import com.sessionm.net.Request;
import com.sessionm.net.c;
import com.sessionm.net.http.d;
import java.util.Locale;

// Referenced classes of package com.sessionm.ui:
//            ImageViewContainer, LoaderView

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        ImageViewContainer.access$500(_fld0).dismiss();
        ImageViewContainer.access$602(_fld0, new ImageView(getContext()));
        ImageViewContainer.access$600(_fld0).setPadding(1, 1, 1, 1);
        ImageViewContainer.access$600(_fld0).setBackgroundColor(-1);
        android.widget.rams rams = new android.widget.rams(-2, -2);
        rams.setMargins(20, 30, 20, 90);
        rams.addRule(13);
        ImageViewContainer.access$600(_fld0).setImageBitmap(ImageViewContainer.access$400(_fld0));
        ImageViewContainer.access$600(_fld0).setLayoutParams(rams);
        addView(ImageViewContainer.access$600(_fld0));
        ImageViewContainer.access$700(_fld0).setEnabled(true);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/sessionm/ui/ImageViewContainer$4

/* anonymous class */
    class ImageViewContainer._cls4 extends c
    {

        final ImageViewContainer this$0;

        public void onReplyReceived(Request request)
        {
            if (Log.isLoggable("SessionM.ImageView", 3))
            {
                Log.d("SessionM.ImageView", String.format(Locale.US, "finished image request: %s", new Object[] {
                    request.getURL()
                }));
            }
            if (request.bd() == com.sessionm.net.Request.State.gI)
            {
                byte abyte0[] = new byte[0];
                if (request.aU() != null)
                {
                    abyte0 = request.aU().bE();
                }
                ImageViewContainer.access$402(ImageViewContainer.this, BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length));
                ((Activity)getContext()).runOnUiThread(new ImageViewContainer._cls4._cls1());
                return;
            } else
            {
                ((Activity)getContext()).runOnUiThread(new ImageViewContainer._cls4._cls2());
                return;
            }
        }

            
            {
                this$0 = ImageViewContainer.this;
                super();
            }

        // Unreferenced inner class com/sessionm/ui/ImageViewContainer$4$2

/* anonymous class */
        class ImageViewContainer._cls4._cls2
            implements Runnable
        {

            final ImageViewContainer._cls4 this$1;

            public void run()
            {
                ImageViewContainer.access$500(this$0).setLoaderViewStatus(LoaderView.LoaderViewStatus.UNAVAILABLE);
            }

                    
                    {
                        this$1 = ImageViewContainer._cls4.this;
                        super();
                    }
        }

    }

}
