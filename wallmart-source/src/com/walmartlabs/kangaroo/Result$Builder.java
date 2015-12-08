// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo;

import com.walmartlabs.kangaroo.service.Header;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.walmartlabs.kangaroo:
//            Result

public static class mHeaders
{

    private Object mData;
    private mRedirect mError;
    private Throwable mException;
    private ArrayList mHeaderList;
    private LinkedHashMap mHeaders;
    private boolean mRedirect;
    private Type mResponseType;
    private int mStatusCode;

    public Result build()
    {
        if (mData != null || mError != null && mException != null)
        {
            if (mHeaderList == null)
            {
                mHeaderList = new ArrayList(mHeaders.size());
                java.util.Result._cls1 _lcls1;
                for (Iterator iterator = mHeaders.entrySet().iterator(); iterator.hasNext(); mHeaderList.add(new Header((String)_lcls1.y(), (String)_lcls1.lue())))
                {
                    _lcls1 = (java.util.lue)iterator.next();
                }

            }
            return new Result(this, null);
        } else
        {
            throw new IllegalArgumentException("must have data, or error and exception");
        }
    }

    public > code(int i)
    {
        mStatusCode = i;
        return this;
    }

    public mStatusCode data(Object obj)
    {
        mData = obj;
        return this;
    }

    public mData error(mData mdata, Throwable throwable)
    {
        mError = mdata;
        mException = throwable;
        return this;
    }

    public mException headers(LinkedHashMap linkedhashmap)
    {
        mHeaders = linkedhashmap;
        return this;
    }

    public mHeaders headers(List list)
    {
        mHeaderList = new ArrayList(list);
        return this;
    }

    public Type responseType(Type type)
    {
        mResponseType = type;
        return this;
    }

    public mResponseType setRedirect(boolean flag)
    {
        mRedirect = flag;
        return this;
    }








    public Type()
    {
        mResponseType = Type.NO_RESPONSE;
        mHeaders = new LinkedHashMap();
    }
}
