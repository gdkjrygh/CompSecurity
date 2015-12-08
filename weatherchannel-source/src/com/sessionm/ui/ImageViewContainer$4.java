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

class this._cls0 extends c
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
        if (request.bd() == com.sessionm.net.his._fld0)
        {
            byte abyte0[] = new byte[0];
            if (request.aU() != null)
            {
                abyte0 = request.aU().bE();
            }
            ImageViewContainer.access$402(ImageViewContainer.this, BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length));
            ((Activity)getContext()).runOnUiThread(new Runnable() {

                final ImageViewContainer._cls4 this$1;

                public void run()
                {
                    ImageViewContainer.access$500(this$0).dismiss();
                    ImageViewContainer.access$602(this$0, new ImageView(getContext()));
                    ImageViewContainer.access$600(this$0).setPadding(1, 1, 1, 1);
                    ImageViewContainer.access$600(this$0).setBackgroundColor(-1);
                    android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                    layoutparams.setMargins(20, 30, 20, 90);
                    layoutparams.addRule(13);
                    ImageViewContainer.access$600(this$0).setImageBitmap(ImageViewContainer.access$400(this$0));
                    ImageViewContainer.access$600(this$0).setLayoutParams(layoutparams);
                    addView(ImageViewContainer.access$600(this$0));
                    ImageViewContainer.access$700(this$0).setEnabled(true);
                }

            
            {
                this$1 = ImageViewContainer._cls4.this;
                super();
            }
            });
            return;
        } else
        {
            ((Activity)getContext()).runOnUiThread(new Runnable() {

                final ImageViewContainer._cls4 this$1;

                public void run()
                {
                    ImageViewContainer.access$500(this$0).setLoaderViewStatus(LoaderView.LoaderViewStatus.UNAVAILABLE);
                }

            
            {
                this$1 = ImageViewContainer._cls4.this;
                super();
            }
            });
            return;
        }
    }

    _cls2.this._cls1()
    {
        this$0 = ImageViewContainer.this;
        super();
    }
}
