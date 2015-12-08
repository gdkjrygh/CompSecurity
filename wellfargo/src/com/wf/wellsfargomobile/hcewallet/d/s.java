// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import android.util.Log;
import com.visa.cbp.external.lcm.LcmTokenRequest;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.provider.DeleteTokenProvider;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.d:
//            k

final class s
    implements DeleteTokenProvider
{

    s()
    {
    }

    public void a(LcmTokenRequest lcmtokenrequest, ResponseCallback responsecallback)
    {
        responsecallback.success(null, new GenericResponse(200, "Deletion Successful", null));
        Log.d(k.a(), "Delete Token provider ");
    }

    public void doRequest(Object obj, ResponseCallback responsecallback)
    {
        a((LcmTokenRequest)obj, responsecallback);
    }
}
