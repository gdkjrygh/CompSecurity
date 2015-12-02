// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.identity.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.identity.model:
//            Shape_Identity

public abstract class Identity
    implements Parcelable
{

    public Identity()
    {
    }

    public static Identity create(String s, String s1, long l, String s2, String s3)
    {
        return (new Shape_Identity()).setIdentifier(s).setToken(s1).setCode(s2).setRedirectUri(s3).setTokenExpiresIn(l);
    }

    public abstract String getCode();

    public abstract String getIdentifier();

    public abstract String getRedirectUri();

    public abstract String getToken();

    public abstract long getTokenExpiresIn();

    abstract Identity setCode(String s);

    abstract Identity setIdentifier(String s);

    abstract Identity setRedirectUri(String s);

    abstract Identity setToken(String s);

    abstract Identity setTokenExpiresIn(long l);
}
