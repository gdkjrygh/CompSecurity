// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceDataValidator;
import java.io.IOException;
import java.util.Arrays;

public class SlapResponse
{
    private static class Error
    {

        public Exception exception;

        private Error()
        {
        }
    }

    private static class Error.Exception
    {

        public String message;

        private Error.Exception()
        {
        }
    }

    public static class Item
    {

        public String id;
        public String name;
        public String productImageUrl;
        public String signingDesc;
        public String sizeDesc;
        public String upc;

        public String toString()
        {
            return (new StringBuilder()).append("Item [id=").append(id).append(", name=").append(name).append(", productImageUrl=").append(productImageUrl).append(", signingDesc=").append(signingDesc).append(", sizeDesc=").append(sizeDesc).append(", upc=").append(upc).append("]").toString();
        }

        public Item()
        {
        }
    }

    public static class SlapResponseValidator
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
                        servicedata = (Error)jsonmapper.readValue(servicedata, com/walmart/android/data/SlapResponse$Error);
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
                        if (((Error) (servicedata)).exception != null)
                        {
                            servicedata = ((Error) (servicedata)).exception.message;
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

        public SlapResponseValidator(ServiceDataValidator servicedatavalidator)
        {
            mErrorCode = -1;
            mValidator = servicedatavalidator;
        }
    }

    public static class Store
    {

        public Address address;
        public float price;
        public Boolean putAvailable;
        public String stockStatus;
        public String storeId;

        public String toString()
        {
            return (new StringBuilder()).append("Store [price=").append(price).append(", stockStatus=").append(stockStatus).append("]").toString();
        }

        public Store()
        {
        }
    }

    public static class Store.Address
    {

        public String street1;

        public Store.Address()
        {
        }
    }


    private static final String NO_RESULTS = "Sorry we can not find any results for this query.";
    private static final String NO_RESULTS_V2 = "OpenAPI exception: code=100, message='Sorry we can not find any results for this query.'";
    private static final String NO_RESULT_NON_JSON_RESPONSE = "Open API exception: 100";
    public Item item;
    public Store stores[];

    public SlapResponse()
    {
    }

    public String toString()
    {
        return (new StringBuilder()).append("SlapResponse [item=").append(item).append(", stores=").append(Arrays.toString(stores)).append("]").toString();
    }
}
