// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            FastPickupUserStatus

public static class current
{

    public merStatus current;

    public int getUserStatus()
    {
label0:
        {
            byte byte0 = -1;
            if (current != null)
            {
                if (!"ready".equals(current.status))
                {
                    break label0;
                }
                byte0 = 2;
            }
            return byte0;
        }
        if ("checkedin".equals(current.status))
        {
            return 1;
        }
        return !"accepted".equals(current.status) ? 0 : 3;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{current: ").append(current).append("}").toString();
    }

    public merStatus()
    {
    }

    public merStatus(String s)
    {
        current = null;
    }
}
