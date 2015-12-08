// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceDataValidator;
import java.io.IOException;

// Referenced classes of package com.walmart.android.data:
//            SlapResponse

public static class mValidator
    implements ServiceDataValidator
{

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
        boolean flag1 = mValidator.validate(servicedata);
        boolean flag = flag1;
        if (flag1)
        {
            servicedata = servicedata.getContent();
            if (servicedata.startsWith("Open API exception: 100"))
            {
                mErrorCode = 10000;
                flag = false;
            } else
            {
                JsonMapper jsonmapper = new JsonMapper();
                try
                {
                    servicedata = (mErrorCode)jsonmapper.readValue(servicedata, com/walmart/android/data/SlapResponse$Error);
                }
                // Misplaced declaration of an exception variable
                catch (ServiceData servicedata)
                {
                    servicedata = null;
                }
                flag = flag1;
                if (servicedata != null)
                {
                    flag = flag1;
                    if (((mErrorCode) (servicedata)).mErrorCode != null)
                    {
                        servicedata = ((mErrorCode) (servicedata)).mErrorCode.e;
                        if ("Sorry we can not find any results for this query.".equals(servicedata) || "OpenAPI exception: code=100, message='Sorry we can not find any results for this query.'".equals(servicedata))
                        {
                            mErrorCode = 10000;
                        } else
                        {
                            mErrorCode = 0x15f91;
                        }
                        return false;
                    }
                }
            }
        }
        return flag;
    }

    public A(ServiceDataValidator servicedatavalidator)
    {
        mErrorCode = -1;
        mValidator = servicedatavalidator;
    }
}
