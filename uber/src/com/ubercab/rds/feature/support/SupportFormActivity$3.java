// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.support;

import com.ubercab.rds.core.model.SupportImageUploadResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.rds.feature.support:
//            SupportFormActivity

final class a
    implements Callback
{

    final String a;
    final SupportFormActivity b;

    private void a(SupportImageUploadResponse supportimageuploadresponse)
    {
        supportimageuploadresponse = supportimageuploadresponse.getToken();
        b.d(a, supportimageuploadresponse);
        SupportFormActivity.i(b);
    }

    public final void failure(RetrofitError retrofiterror)
    {
        b.d(a, null);
        SupportFormActivity.i(b);
    }

    public final void success(Object obj, Response response)
    {
        a((SupportImageUploadResponse)obj);
    }

    (SupportFormActivity supportformactivity, String s)
    {
        b = supportformactivity;
        a = s;
        super();
    }
}
