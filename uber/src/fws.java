// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.ubercab.android.location.UberLatLngBounds;

public final class fws
{

    private final fwd a;
    private final Context b;

    public fws(fwd fwd1, Context context)
    {
        a = fwd1;
        b = context;
    }

    public final int a(cjn cjn1, int i)
    {
        if (cjn1.b() == null)
        {
            return 0;
        } else
        {
            cjn1 = cjn1.b().a();
            com.ubercab.android.location.UberLatLng uberlatlng = cjn1.a();
            double d = fwd.a(uberlatlng, fwd.b(uberlatlng, cjn1.b()));
            return (int)Math.ceil(((float)fwd.a(b) / (float)d) * (float)i);
        }
    }
}
