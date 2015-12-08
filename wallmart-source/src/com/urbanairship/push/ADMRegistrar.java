// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import com.amazon.device.messaging.ADM;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.amazon.ADMUtils;

class ADMRegistrar
{

    ADMRegistrar()
    {
    }

    public static boolean register()
    {
        if (ADMUtils.isADMSupported())
        {
            (new ADM(UAirship.getApplicationContext())).startRegister();
            return true;
        } else
        {
            Logger.error("ADM is not supported on this device.");
            return false;
        }
    }
}
