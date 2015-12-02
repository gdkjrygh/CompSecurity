// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hln;

abstract class ObjectFareSplitClient
    implements hln
{

    ObjectFareSplitClient()
    {
    }

    public String getDisplayName()
    {
        String s = getFullName();
        if (s == null || s.isEmpty()) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        String s1;
        s1 = getName();
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = s1;
        if (!s1.isEmpty()) goto _L1; else goto _L3
_L3:
        return "";
    }
}
