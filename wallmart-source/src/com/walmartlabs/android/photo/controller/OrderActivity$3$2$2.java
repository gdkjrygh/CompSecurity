// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.Button;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.service.order.OrderProgress;
import com.walmartlabs.android.photo.service.order.OrderService;
import com.walmartlabs.android.photo.view.upload.UploadProgressView;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            OrderActivity

class val.count
    implements Runnable
{

    final val.count this$2;
    final int val$count;
    final DevicePhoto val$photo;

    public void run()
    {
        OrderActivity.access$200(_fld0).addPhotoToStack(val$photo, val$count);
    }

    ._cls0()
    {
        this$2 = final__pcls0;
        val$photo = devicephoto;
        val$count = I.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/android/photo/controller/OrderActivity$3

/* anonymous class */
    class OrderActivity._cls3
        implements ServiceConnection
    {

        final OrderActivity this$0;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            OrderActivity.access$002(OrderActivity.this, ((com.walmartlabs.android.photo.service.order.OrderService.LocalBinder)ibinder).getService());
            OrderActivity.access$102(OrderActivity.this, OrderActivity.access$000(OrderActivity.this).getStartingIntent());
            if (!OrderActivity.access$000(OrderActivity.this).wasExplicitlyStarted())
            {
                findViewById(com.walmartlabs.android.photo.R.id.main_layout).setVisibility(8);
                findViewById(com.walmartlabs.android.photo.R.id.idle_layout).setVisibility(0);
                ((Button)findViewById(com.walmartlabs.android.photo.R.id.idle_button)).setOnClickListener(new OrderActivity._cls3._cls1());
                return;
            } else
            {
                OrderActivity.access$000(OrderActivity.this).setOrderServiceListener(new OrderActivity._cls3._cls2());
                OrderActivity.access$500(OrderActivity.this, OrderActivity.access$000(OrderActivity.this).getOrderProgress());
                OrderActivity.access$200(OrderActivity.this).addPhotoToStack(OrderActivity.access$000(OrderActivity.this).getOrderProgress().getCurrentPhoto(), OrderActivity.access$000(OrderActivity.this).getOrderProgress().totalProgress());
                return;
            }
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            OrderActivity.access$002(OrderActivity.this, null);
        }

            
            {
                this$0 = OrderActivity.this;
                super();
            }

        // Unreferenced inner class com/walmartlabs/android/photo/controller/OrderActivity$3$1

/* anonymous class */
        class OrderActivity._cls3._cls1
            implements android.view.View.OnClickListener
        {

            final OrderActivity._cls3 this$1;

            public void onClick(View view)
            {
                finish();
            }

                    
                    {
                        this$1 = OrderActivity._cls3.this;
                        super();
                    }
        }

    }


    // Unreferenced inner class com/walmartlabs/android/photo/controller/OrderActivity$3$2

/* anonymous class */
    class OrderActivity._cls3._cls2
        implements com.walmartlabs.android.photo.service.order.OrderService.OrderServiceListener
    {

        final OrderActivity._cls3 this$1;

        public void onNewPhotoUploading(final DevicePhoto photo, int i)
        {
            runOnUiThread(i. new OrderActivity._cls3._cls2._cls2());
        }

        public void onUploadStatus(final OrderProgress status)
        {
            runOnUiThread(new OrderActivity._cls3._cls2._cls1());
        }

        public boolean visible()
        {
            return !OrderActivity.access$300(this$0);
        }

            
            {
                this$1 = OrderActivity._cls3.this;
                super();
            }

        // Unreferenced inner class com/walmartlabs/android/photo/controller/OrderActivity$3$2$1

/* anonymous class */
        class OrderActivity._cls3._cls2._cls1
            implements Runnable
        {

            final OrderActivity._cls3._cls2 this$2;
            final OrderProgress val$status;

            public void run()
            {
                if (status != null && status.orderSuccessful())
                {
                    getSupportActionBar().setTitle(getString(com.walmartlabs.android.photo.R.string.photo_order_complete));
                }
                if (status != null && status.uploadsDone())
                {
                    OrderActivity.access$400(this$0);
                }
                OrderActivity.access$500(this$0, status);
            }

                    
                    {
                        this$2 = OrderActivity._cls3._cls2.this;
                        status = orderprogress;
                        super();
                    }
        }

    }

}
