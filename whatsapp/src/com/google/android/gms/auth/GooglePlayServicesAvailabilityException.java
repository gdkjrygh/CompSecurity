// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.content.Intent;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.auth:
//            UserRecoverableAuthException, GoogleAuthException

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException
{

    private final int Eo;

    GooglePlayServicesAvailabilityException(int i, String s, Intent intent)
    {
        boolean flag = GoogleAuthException.a;
        super(s, intent);
        Eo = i;
        if (flag)
        {
            jx.a++;
        }
    }

    public int getConnectionStatusCode()
    {
        return Eo;
    }
}
