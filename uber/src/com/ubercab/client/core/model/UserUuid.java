// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UserUuid

public abstract class UserUuid
{

    public UserUuid()
    {
    }

    public static UserUuid create(String s)
    {
        return (new Shape_UserUuid()).setUserUuid(s);
    }

    public abstract String getUserUuid();

    abstract UserUuid setUserUuid(String s);
}
