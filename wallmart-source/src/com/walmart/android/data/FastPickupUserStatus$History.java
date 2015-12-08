// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            FastPickupUserStatus

public static class 
{

    public String status;
    public String timestamp;

    public void setState(String s)
    {
        status = s;
    }

    public void setTimestamp(String s)
    {
        timestamp = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{status: ").append(status).append(", timestamp: ").append(timestamp).append("}").toString();
    }

    public ()
    {
    }
}
