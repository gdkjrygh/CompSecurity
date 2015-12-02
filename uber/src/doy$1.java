// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.realtime.error.GlobalStateErrors;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import java.util.List;

final class ang.Object
    implements idi
{

    final doy a;

    private static ica a(Throwable throwable)
    {
        RealtimeError realtimeerror = ((Error)throwable).getRealtimeError();
        if (realtimeerror != null && GlobalStateErrors.get().contains(realtimeerror.getCode()))
        {
            return ica.b();
        } else
        {
            return ica.b(throwable);
        }
    }

    public final volatile Object a(Object obj)
    {
        return a((Throwable)obj);
    }

    (doy doy1)
    {
        a = doy1;
        super();
    }
}
