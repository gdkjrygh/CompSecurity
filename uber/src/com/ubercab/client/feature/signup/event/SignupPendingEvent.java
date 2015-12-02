// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.event;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.feature.signup.event:
//            Shape_SignupPendingEvent

public abstract class SignupPendingEvent
    implements Parcelable
{

    public SignupPendingEvent()
    {
    }

    public static SignupPendingEvent b(String s)
    {
        return (new Shape_SignupPendingEvent()).a(s);
    }

    abstract SignupPendingEvent a(String s);

    public abstract String a();
}
