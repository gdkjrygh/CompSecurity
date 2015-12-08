// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.visa.cbp.sdk.facade.response.ProvisionTokenResponse;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.d:
//            k

final class n
    implements ResponseCallback
{

    n()
    {
    }

    public void a(ProvisionTokenResponse provisiontokenresponse, GenericResponse genericresponse)
    {
        k.a(true);
    }

    public void failure(CbpError cbperror)
    {
        k.a(false);
    }

    public void success(Object obj, GenericResponse genericresponse)
    {
        a((ProvisionTokenResponse)obj, genericresponse);
    }
}
