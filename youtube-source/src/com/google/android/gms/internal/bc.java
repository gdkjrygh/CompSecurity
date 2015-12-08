// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.ads.mediation.a;
import java.util.Date;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            aa

public final class bc
{

    public static a a(aa aa1)
    {
        com.google.ads.AdRequest.Gender gender;
        HashSet hashset;
        Date date;
        if (aa1.eD != null)
        {
            hashset = new HashSet(aa1.eD);
        } else
        {
            hashset = null;
        }
        date = new Date(aa1.eB);
        aa1.eC;
        JVM INSTR tableswitch 1 2: default 56
    //                   1 87
    //                   2 80;
           goto _L1 _L2 _L3
_L1:
        gender = com.google.ads.AdRequest.Gender.UNKNOWN;
_L5:
        return new a(date, gender, hashset, aa1.eE);
_L3:
        gender = com.google.ads.AdRequest.Gender.FEMALE;
        continue; /* Loop/switch isn't completed */
_L2:
        gender = com.google.ads.AdRequest.Gender.MALE;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
