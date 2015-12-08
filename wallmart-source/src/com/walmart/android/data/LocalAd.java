// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceDataValidator;

public class LocalAd
{
    public static class Category
    {

        private String id;
        private StoreQueryResult.Item items[];
        private String name;
        private int totalCount;

        public String getId()
        {
            return id;
        }

        public StoreQueryResult.Item[] getItems()
        {
            return items;
        }

        public String getName()
        {
            return name;
        }

        public int getTotalCount()
        {
            return totalCount;
        }

        public void setId(String s)
        {
            id = s;
        }

        public void setItems(StoreQueryResult.Item aitem[])
        {
            items = aitem;
        }

        public void setName(String s)
        {
            name = s;
        }

        public void setTotalCount(int i)
        {
            totalCount = i;
        }

        public Category()
        {
        }
    }

    public static class LocalAdResponseValidator
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

        public LocalAdResponseValidator(ServiceDataValidator servicedatavalidator)
        {
            mErrorCode = -1;
            mValidator = servicedatavalidator;
        }
    }


    private Category categories[];
    private String effectiveDatesMessage;
    private String name;

    public LocalAd()
    {
    }

    public Category[] getCategories()
    {
        return categories;
    }

    public String getEffectiveDatesMessage()
    {
        return effectiveDatesMessage;
    }

    public String getName()
    {
        return name;
    }

    public void setCategories(Category acategory[])
    {
        categories = acategory;
    }

    public void setEffectiveDatesMessage(String s)
    {
        effectiveDatesMessage = s;
    }

    public void setName(String s)
    {
        name = s;
    }
}
