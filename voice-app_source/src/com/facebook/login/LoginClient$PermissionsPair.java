// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import java.util.List;

// Referenced classes of package com.facebook.login:
//            LoginClient

private static class declinedPermissions
{

    List declinedPermissions;
    List grantedPermissions;

    public List getDeclinedPermissions()
    {
        return declinedPermissions;
    }

    public List getGrantedPermissions()
    {
        return grantedPermissions;
    }

    public (List list, List list1)
    {
        grantedPermissions = list;
        declinedPermissions = list1;
    }
}
