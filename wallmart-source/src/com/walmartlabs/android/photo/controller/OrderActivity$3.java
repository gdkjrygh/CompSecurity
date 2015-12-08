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

class this._cls0
    implements ServiceConnection
{

    final OrderActivity this$0;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        OrderActivity.access$002(OrderActivity.this, ((com.walmartlabs.android.photo.service.order.alBinder)ibinder).getService());
        OrderActivity.access$102(OrderActivity.this, OrderActivity.access$000(OrderActivity.this).getStartingIntent());
        if (!OrderActivity.access$000(OrderActivity.this).wasExplicitlyStarted())
        {
            findViewById(com.walmartlabs.android.photo.).setVisibility(8);
            findViewById(com.walmartlabs.android.photo.).setVisibility(0);
            ((Button)findViewById(com.walmartlabs.android.photo.)).setOnClickListener(new android.view.View.OnClickListener() {

                final OrderActivity._cls3 this$1;

                public void onClick(View view)
                {
                    finish();
                }

            
            {
                this$1 = OrderActivity._cls3.this;
                super();
            }
            });
            return;
        } else
        {
            OrderActivity.access$000(OrderActivity.this).setOrderServiceListener(new com.walmartlabs.android.photo.service.order.OrderService.OrderServiceListener() {

                final OrderActivity._cls3 this$1;

                public void onNewPhotoUploading(final DevicePhoto photo, int i)
                {
                    runOnUiThread(i. new Runnable() {

                        final _cls2 this$2;
                        final int val$count;
                        final DevicePhoto val$photo;

                        public void run()
                        {
                            OrderActivity.access$200(this$0).addPhotoToStack(photo, count);
                        }

            
            {
                this$2 = final__pcls2;
                photo = devicephoto;
                count = I.this;
                super();
            }
                    });
                }

                public void onUploadStatus(OrderProgress orderprogress)
                {
                    runOnUiThread(orderprogress. new Runnable() {

                        final _cls2 this$2;
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
                this$2 = final__pcls2;
                status = OrderProgress.this;
                super();
            }
                    });
                }

                public boolean visible()
                {
                    return !OrderActivity.access$300(this$0);
                }

            
            {
                this$1 = OrderActivity._cls3.this;
                super();
            }
            });
            OrderActivity.access$500(OrderActivity.this, OrderActivity.access$000(OrderActivity.this).getOrderProgress());
            OrderActivity.access$200(OrderActivity.this).addPhotoToStack(OrderActivity.access$000(OrderActivity.this).getOrderProgress().getCurrentPhoto(), OrderActivity.access$000(OrderActivity.this).getOrderProgress().totalProgress());
            return;
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        OrderActivity.access$002(OrderActivity.this, null);
    }

    _cls2.this._cls1()
    {
        this$0 = OrderActivity.this;
        super();
    }
}
