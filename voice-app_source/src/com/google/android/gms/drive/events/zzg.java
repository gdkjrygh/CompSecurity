// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import com.google.android.gms.drive.DriveId;

public class zzg
{

    public static boolean zza(int i, DriveId driveid)
    {
        boolean flag = true;
        i;
        JVM INSTR tableswitch 1 6: default 40
    //                   1 44
    //                   2 40
    //                   3 40
    //                   4 50
    //                   5 56
    //                   6 56;
           goto _L1 _L2 _L1 _L1 _L3 _L4 _L4
_L1:
        flag = false;
_L6:
        return flag;
_L2:
        if (driveid == null)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (driveid != null)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (driveid == null)
        {
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
