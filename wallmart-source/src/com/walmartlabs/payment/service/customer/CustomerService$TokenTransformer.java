// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import com.walmartlabs.kangaroo.service.Transformer;
import com.walmartlabs.payment.service.payment.PairResponse;
import java.util.List;

// Referenced classes of package com.walmartlabs.payment.service.customer:
//            CustomerService

private static class <init>
    implements Transformer
{

    public volatile Object transform(Object obj)
    {
        return transform((PairResponse)obj);
    }

    public String transform(PairResponse pairresponse)
    {
        if (pairresponse.data != null && pairresponse.data. != null && !pairresponse.data..isEmpty())
        {
            return ((com.walmartlabs.payment.service.payment.)pairresponse.data..get(0)).;
        } else
        {
            return null;
        }
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
