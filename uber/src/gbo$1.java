// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TypeEvaluator;
import com.ubercab.android.location.UberLatLng;

final class ang.Object
    implements TypeEvaluator
{

    final gbo a;

    private static UberLatLng a(float f, UberLatLng uberlatlng, UberLatLng uberlatlng1)
    {
        return dub.a(f, uberlatlng, uberlatlng1);
    }

    public final Object evaluate(float f, Object obj, Object obj1)
    {
        return a(f, (UberLatLng)obj, (UberLatLng)obj1);
    }

    (gbo gbo1)
    {
        a = gbo1;
        super();
    }
}
