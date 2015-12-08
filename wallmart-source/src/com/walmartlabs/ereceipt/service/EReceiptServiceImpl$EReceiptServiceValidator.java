// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceDataValidator;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptServiceImpl

private static class <init>
    implements ServiceDataValidator
{

    int mErrorCode;

    public int getErrorCode()
    {
        return mErrorCode;
    }

    public boolean validate(ServiceData servicedata)
    {
        if (servicedata.hasHttpError())
        {
            mErrorCode = servicedata.getHttpStatusCode();
            return false;
        } else
        {
            return true;
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
