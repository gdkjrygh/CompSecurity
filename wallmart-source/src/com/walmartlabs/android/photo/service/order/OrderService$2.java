// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.service.order;


// Referenced classes of package com.walmartlabs.android.photo.service.order:
//            OrderService, OrderProgress

class this._cls0
    implements com.walmartlabs.android.photo.net.toUploadListener
{

    final OrderService this$0;

    public void onBytesWritten(long l, long l1)
    {
        OrderService.access$100(OrderService.this).setCurrentProgress(l);
        OrderService.access$100(OrderService.this).setCurrentMax(l1);
        OrderService.access$200(OrderService.this);
    }

    stener()
    {
        this$0 = OrderService.this;
        super();
    }
}
