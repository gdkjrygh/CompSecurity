// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            WalmartStore

public static class ion
{

    private ion hoursOfOperation[];
    private String name;
    private String phone;

    public ion[] getHoursOfOperation()
    {
        return hoursOfOperation;
    }

    public String getName()
    {
        return name;
    }

    public String getPhone()
    {
        return phone;
    }

    public boolean matches(String s)
    {
        boolean flag = false;
        String s1 = getName();
        s = s.substring(0, 5);
        if (s1.substring(0, 5).equalsIgnoreCase(s))
        {
            flag = true;
        }
        return flag;
    }

    public void setHoursOfOperation(ion aion[])
    {
        hoursOfOperation = aion;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPhone(String s)
    {
        phone = s;
    }

    public ion()
    {
    }
}
