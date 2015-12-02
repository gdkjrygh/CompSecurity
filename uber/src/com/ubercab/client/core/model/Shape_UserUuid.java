// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            UserUuid

public final class Shape_UserUuid extends UserUuid
{

    private String userUuid;

    Shape_UserUuid()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UserUuid)obj;
            if (((UserUuid) (obj)).getUserUuid() == null ? getUserUuid() != null : !((UserUuid) (obj)).getUserUuid().equals(getUserUuid()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getUserUuid()
    {
        return userUuid;
    }

    public final int hashCode()
    {
        int i;
        if (userUuid == null)
        {
            i = 0;
        } else
        {
            i = userUuid.hashCode();
        }
        return i ^ 0xf4243;
    }

    final UserUuid setUserUuid(String s)
    {
        userUuid = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("UserUuid{userUuid=")).append(userUuid).append("}").toString();
    }
}
