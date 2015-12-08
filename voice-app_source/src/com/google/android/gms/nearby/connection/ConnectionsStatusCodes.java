// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class ConnectionsStatusCodes extends CommonStatusCodes
{

    public static final int STATUS_ALREADY_ADVERTISING = 8001;
    public static final int STATUS_ALREADY_CONNECTED_TO_ENDPOINT = 8003;
    public static final int STATUS_ALREADY_DISCOVERING = 8002;
    public static final int STATUS_CONNECTION_REJECTED = 8004;
    public static final int STATUS_ERROR = 13;
    public static final int STATUS_NETWORK_NOT_CONNECTED = 8000;
    public static final int STATUS_NOT_CONNECTED_TO_ENDPOINT = 8005;
    public static final int STATUS_OK = 0;

    private ConnectionsStatusCodes()
    {
    }

    public static String getStatusCodeString(int i)
    {
        switch (i)
        {
        default:
            return CommonStatusCodes.getStatusCodeString(i);

        case 8000: 
            return "STATUS_NETWORK_NOT_CONNECTED";

        case 8001: 
            return "STATUS_ALREADY_ADVERTISING";

        case 8002: 
            return "STATUS_ALREADY_DISCOVERING";

        case 8003: 
            return "STATUS_ALREADY_CONNECTED_TO_ENDPOINT";

        case 8004: 
            return "STATUS_CONNECTION_REJECTED";

        case 8005: 
            return "STATUS_NOT_CONNECTED_TO_ENDPOINT";
        }
    }
}
