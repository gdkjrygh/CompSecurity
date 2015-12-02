// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Parcelable;
import android.text.TextUtils;

// Referenced classes of package com.ubercab.client.feature.signup:
//            Shape_ThirdPartyToken

public abstract class ThirdPartyToken
    implements Parcelable
{

    public ThirdPartyToken()
    {
    }

    public static ThirdPartyToken a(String s, String s1, long l)
    {
        return g().a(l).c(s1).d(s);
    }

    public static ThirdPartyToken a(String s, String s1, long l, String s2, String s3)
    {
        return g().a(s3).a(l).b(s2).c(s1).d(s);
    }

    private static ThirdPartyToken g()
    {
        return new Shape_ThirdPartyToken();
    }

    abstract ThirdPartyToken a(long l);

    abstract ThirdPartyToken a(String s);

    public abstract String a();

    public abstract long b();

    abstract ThirdPartyToken b(String s);

    abstract ThirdPartyToken c(String s);

    public abstract String c();

    abstract ThirdPartyToken d(String s);

    public abstract String d();

    public abstract String e();

    public final boolean f()
    {
        return !TextUtils.isEmpty(e()) && (!TextUtils.isEmpty(a()) || !TextUtils.isEmpty(d()));
    }
}
