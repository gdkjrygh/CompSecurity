// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.Group;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class ejz extends dmx
{

    private final String a;

    public ejz(Group group, Response response, String s)
    {
        super(group, response);
        a = s;
    }

    public ejz(RetrofitError retrofiterror, String s)
    {
        super(retrofiterror);
        a = s;
    }

    public final String a()
    {
        return a;
    }
}
