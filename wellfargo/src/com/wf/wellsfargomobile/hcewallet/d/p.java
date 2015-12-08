// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.d:
//            k

final class p
    implements ResponseCallback
{

    p()
    {
    }

    public void a(Void void1, GenericResponse genericresponse)
    {
        k.a(true);
    }

    public void failure(CbpError cbperror)
    {
        k.a(false);
    }

    public void success(Object obj, GenericResponse genericresponse)
    {
        a((Void)obj, genericresponse);
    }
}
