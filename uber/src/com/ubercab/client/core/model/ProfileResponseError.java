// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_ProfileResponseError

public abstract class ProfileResponseError
{

    public ProfileResponseError()
    {
    }

    public static ProfileResponseError create(String s, String s1)
    {
        return (new Shape_ProfileResponseError()).setCode(s).setMessage(s1);
    }

    public abstract String getCode();

    public abstract String getMessage();

    abstract ProfileResponseError setCode(String s);

    abstract ProfileResponseError setMessage(String s);
}
