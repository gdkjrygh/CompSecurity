// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceDataValidator;

// Referenced classes of package com.walmart.android.data:
//            LocalAd

public static class mValidator
    implements ServiceDataValidator
{

    private static final String NO_RESULT_FOR_STORE = "undefined";
    private int mErrorCode;
    private final ServiceDataValidator mValidator;

    public int getErrorCode()
    {
        if (mErrorCode != -1)
        {
            return mErrorCode;
        } else
        {
            return mValidator.getErrorCode();
        }
    }

    public boolean validate(ServiceData servicedata)
    {
        if (servicedata.getContent().startsWith("undefined"))
        {
            mErrorCode = 404;
            return false;
        } else
        {
            return mValidator.validate(servicedata);
        }
    }

    public (ServiceDataValidator servicedatavalidator)
    {
        mErrorCode = -1;
        mValidator = servicedatavalidator;
    }
}
