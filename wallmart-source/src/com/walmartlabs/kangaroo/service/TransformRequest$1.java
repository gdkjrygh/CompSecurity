// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import com.walmartlabs.kangaroo.Callback;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmartlabs.kangaroo.service:
//            TransformRequest, Transformer

class this._cls0
    implements Callback
{

    final TransformRequest this$0;

    public void onCancelled(Request request)
    {
        cancel();
    }

    public void onResult(Request request, Result result)
    {
        request = TransformRequest.access$000(TransformRequest.this, result);
        if (result.hasData())
        {
            result = ((Result) (TransformRequest.access$100(TransformRequest.this).transform(result.getData())));
            if (result != null)
            {
                request.(result);
            } else
            {
                request.r(com.walmartlabs.kangaroo.UNEXPECTED_RESPONSE, new ansformException());
            }
        }
        setAndNotifyResult(request.d());
    }

    ansformException()
    {
        this$0 = TransformRequest.this;
        super();
    }
}
