// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.utils;

import android.content.Context;
import android.location.Address;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmartlabs.utils:
//            LocationUtils

public static class mAddress
{

    public static final int ERROR_NO_ADDRESSES_FOUND = 3;
    public static final int ERROR_NO_NETWORK = 1;
    public static final int ERROR_SERVICE_UNAVAILABLE = 2;
    private Address mAddress;
    private int mError;

    public Address getAddress()
    {
        return mAddress;
    }

    public int getError()
    {
        return mError;
    }

    public boolean hasAddress()
    {
        return mAddress != null;
    }

    public (Context context, List list)
    {
        if (list != null)
        {
            if (list.size() == 0)
            {
                mError = 3;
            }
        } else
        {
            context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (context == null || !context.isConnected())
            {
                mError = 1;
            } else
            {
                mError = 2;
            }
        }
        if (mError == 0)
        {
            context = null;
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                list = (Address)iterator.next();
                context = list;
                if (!"US".equals(list.getCountryCode()))
                {
                    continue;
                }
                context = list;
                break;
            } while (true);
            mAddress = context;
        }
    }
}
