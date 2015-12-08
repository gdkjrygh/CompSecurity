// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataResponseException;
import com.google.android.apps.youtube.core.async.x;
import com.google.android.apps.youtube.core.identity.l;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            v

final class w extends x
{

    final v a;

    w(v v, l l)
    {
        a = v;
        super(l);
    }

    private boolean a(GDataRequest gdatarequest, Exception exception)
    {
        if ((exception instanceof GDataResponseException) && ((GDataResponseException)exception).containsYouTubeSignupRequiredError())
        {
            L.c("operation needs a full YouTube account");
            return false;
        } else
        {
            return super.a(gdatarequest, exception);
        }
    }

    public final volatile boolean a(com.google.android.apps.youtube.core.async.w w1, Exception exception)
    {
        return a((GDataRequest)w1, exception);
    }

    public final volatile boolean a(Object obj, Exception exception)
    {
        return a((GDataRequest)obj, exception);
    }
}
