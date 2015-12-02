// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import gjz;

// Referenced classes of package com.ubercab.rider.realtime.response:
//            Shape_TestAccount

public abstract class TestAccount
{

    public TestAccount()
    {
    }

    public static TestAccount create(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return (new Shape_TestAccount()).setUuid((String)gjz.a(s)).setFirstName(s1).setLastName(s2).setEmail((String)gjz.a(s3)).setToken((String)gjz.a(s4)).setRole(s5);
    }

    public abstract String getEmail();

    public abstract String getFirstName();

    public abstract String getLabel();

    public abstract String getLastName();

    public abstract String getRole();

    public abstract String getToken();

    public abstract String getUuid();

    public abstract TestAccount setEmail(String s);

    public abstract TestAccount setFirstName(String s);

    public abstract TestAccount setLabel(String s);

    public abstract TestAccount setLastName(String s);

    public abstract TestAccount setRole(String s);

    public abstract TestAccount setToken(String s);

    public abstract TestAccount setUuid(String s);
}
