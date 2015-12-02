// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.ProfileResponseError;
import com.ubercab.client.core.model.Shape_ProfileResponseError;
import retrofit.RetrofitError;
import retrofit.client.Response;

public abstract class dmt extends dmx
{

    private ProfileResponseError a;

    dmt(Object obj, Response response)
    {
        super(obj, response);
    }

    dmt(RetrofitError retrofiterror)
    {
        super(retrofiterror);
        try
        {
            a = (ProfileResponseError)retrofiterror.getBodyAs(com/ubercab/client/core/model/Shape_ProfileResponseError);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            a = ProfileResponseError.create("", retrofiterror.getLocalizedMessage());
        }
    }

    public final ProfileResponseError b()
    {
        return a;
    }
}
