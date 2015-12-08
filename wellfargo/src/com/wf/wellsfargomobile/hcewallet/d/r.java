// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.error.TokenStatusError;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.visa.cbp.sdk.facade.response.TokenStatusResponse;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.d:
//            k

final class r
    implements ResponseCallback
{

    r()
    {
    }

    public void a(TokenStatusError tokenstatuserror)
    {
        k.a(false);
    }

    public void a(TokenStatusResponse tokenstatusresponse, GenericResponse genericresponse)
    {
        k.a(true);
    }

    public void failure(CbpError cbperror)
    {
        a((TokenStatusError)cbperror);
    }

    public void success(Object obj, GenericResponse genericresponse)
    {
        a((TokenStatusResponse)obj, genericresponse);
    }
}
