// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.network.uspout.internal.model;

import android.content.Context;
import android.telephony.TelephonyManager;

// Referenced classes of package com.ubercab.network.uspout.internal.model:
//            Shape_Carrier

public abstract class Carrier
{

    private static final int CARRIER_MCC_LENGTH = 3;
    private static final int CARRIER_MNC_START_INDEX = 3;
    private static final String UNKNOWN = "unknown";

    public Carrier()
    {
    }

    public static Carrier create(Context context)
    {
        Object obj = (TelephonyManager)context.getSystemService("phone");
        context = ((TelephonyManager) (obj)).getNetworkOperatorName();
        Object obj1 = getCarrierMnc(((TelephonyManager) (obj)));
        obj = getCarrierMcc(((TelephonyManager) (obj)));
        Object obj2 = new Shape_Carrier();
        if (context == null)
        {
            context = "unknown";
        }
        obj2 = ((Shape_Carrier) (obj2)).setName(context);
        if (obj1 != null)
        {
            context = ((Context) (obj1));
        } else
        {
            context = "unknown";
        }
        obj1 = ((Carrier) (obj2)).setMnc(context);
        if (obj != null)
        {
            context = ((Context) (obj));
        } else
        {
            context = "unknown";
        }
        return ((Carrier) (obj1)).setMcc(context);
    }

    private static String getCarrierMcc(TelephonyManager telephonymanager)
    {
        telephonymanager = telephonymanager.getNetworkOperator();
        if (telephonymanager != null && telephonymanager.length() >= 3)
        {
            return telephonymanager.substring(0, 3);
        } else
        {
            return null;
        }
    }

    private static String getCarrierMnc(TelephonyManager telephonymanager)
    {
        telephonymanager = telephonymanager.getNetworkOperator();
        if (telephonymanager != null && telephonymanager.length() >= 3)
        {
            return telephonymanager.substring(3);
        } else
        {
            return null;
        }
    }

    public abstract String getMcc();

    public abstract String getMnc();

    public abstract String getName();

    public abstract Carrier setMcc(String s);

    public abstract Carrier setMnc(String s);

    public abstract Carrier setName(String s);
}
