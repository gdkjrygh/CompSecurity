// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;

public final class ni
{

    public static aiw a(Context context, AdRequestInfoParcel adrequestinfoparcel, nj nj)
    {
        return a(context, adrequestinfoparcel, nj, ((nk) (new _cls1())));
    }

    private static aiw a(Context context, AdRequestInfoParcel adrequestinfoparcel, nj nj, nk nk1)
    {
        if (nk1.a(adrequestinfoparcel))
        {
            return b(context, adrequestinfoparcel, nj);
        } else
        {
            return c(context, adrequestinfoparcel, nj);
        }
    }

    private static aiw b(Context context, AdRequestInfoParcel adrequestinfoparcel, nj nj)
    {
        of.a("Fetching ad response from local ad request service.");
        context = new nm(context, adrequestinfoparcel, nj);
        context.e();
        return context;
    }

    private static aiw c(Context context, AdRequestInfoParcel adrequestinfoparcel, nj nj)
    {
        of.a("Fetching ad response from remote ad request service.");
        kx.a();
        if (!oe.b(context))
        {
            of.e("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new nn(context, adrequestinfoparcel, nj);
        }
    }

    /* member class not found */
    class _cls1 {}

}
