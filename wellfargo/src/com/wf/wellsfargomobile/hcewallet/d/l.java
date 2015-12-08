// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;

final class l
    implements ResponseCallback
{

    l()
    {
    }

    public void a(Void void1, GenericResponse genericresponse)
    {
    }

    public void failure(CbpError cbperror)
    {
    }

    public void success(Object obj, GenericResponse genericresponse)
    {
        a((Void)obj, genericresponse);
    }
}
