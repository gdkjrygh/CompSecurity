// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.feature.signup:
//            Shape_PhoneNumber

public abstract class PhoneNumber
    implements Parcelable
{

    public PhoneNumber()
    {
    }

    public static PhoneNumber a(String s, String s1)
    {
        return (new Shape_PhoneNumber()).a(s).b(s1);
    }

    abstract PhoneNumber a(String s);

    public abstract String a();

    abstract PhoneNumber b(String s);

    public abstract String b();
}
