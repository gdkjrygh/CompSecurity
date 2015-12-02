// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.profile;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.android.partner.funnel.signup.profile:
//            Shape_ProfileInfo

public abstract class ProfileInfo
    implements Parcelable
{

    public ProfileInfo()
    {
    }

    public static ProfileInfo a()
    {
        return new Shape_ProfileInfo();
    }

    public abstract ProfileInfo a(String s);

    public abstract ProfileInfo a(List list);

    public abstract ProfileInfo b(String s);

    public abstract ProfileInfo b(List list);

    public abstract String b();

    public abstract String c();

    public abstract List d();

    public abstract List e();
}
