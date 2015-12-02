// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;

import android.content.Context;
import com.ubercab.rider.realtime.model.FareSplitClient;
import gke;
import java.io.Serializable;
import java.util.List;

public final class 
    implements Serializable
{

    private static final List FAKE_NAMES = gke.a("Skyler", "Jesse", "Hank", "Marie", "Saul");
    public static final String STATUS_ACCEPTED = "Accepted";
    public static final String STATUS_CANCELED = "Canceled";
    public static final String STATUS_DECLINED = "Declined";
    public static final String STATUS_INVALID_NUMBER = "InvalidNumber";
    public static final String STATUS_NO_ACCOUNT = "NoAccount";
    public static final String STATUS_PENDING = "Pending";
    private String mId;
    private String mName;
    private String mStatus;

    public static  createFake(int i, String s)
    {
          = new <init>();
        .mId = String.valueOf(i);
        .mName = (String)FAKE_NAMES.get(i);
        .mStatus = s;
        return ;
    }

    public static mStatus fromFareSplitClient(FareSplitClient faresplitclient)
    {
        mStatus mstatus = new <init>();
        mstatus.mId = faresplitclient.getMobileDigits();
        mstatus.mName = faresplitclient.getDisplayName();
        mstatus.mStatus = faresplitclient.getStatus();
        return mstatus;
    }

    public final String getDisplayStatus(Context context)
    {
        String s;
        byte byte0;
        s = mStatus;
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 60
    //                   -2081881145: 101
    //                   -522759168: 143
    //                   -58529607: 129
    //                   632840270: 115
    //                   1418225932: 157;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_157;
_L7:
        switch (byte0)
        {
        default:
            return mStatus;

        case 0: // '\0'
            return context.getString(0x7f070236);

        case 1: // '\001'
            return context.getString(0x7f07023b);

        case 2: // '\002'
            return context.getString(0x7f070237);

        case 3: // '\003'
            return context.getString(0x7f070288);

        case 4: // '\004'
            return context.getString(0x7f070241);
        }
_L2:
        if (s.equals("Accepted"))
        {
            byte0 = 0;
        }
          goto _L7
_L5:
        if (s.equals("Declined"))
        {
            byte0 = 1;
        }
          goto _L7
_L4:
        if (s.equals("Canceled"))
        {
            byte0 = 2;
        }
          goto _L7
_L3:
        if (s.equals("InvalidNumber"))
        {
            byte0 = 3;
        }
          goto _L7
        if (s.equals("NoAccount"))
        {
            byte0 = 4;
        }
          goto _L7
    }

    public final String getId()
    {
        return mId;
    }

    public final String getName()
    {
        return mName;
    }

    public final String getStatus()
    {
        return mStatus;
    }


    private ()
    {
    }
}
