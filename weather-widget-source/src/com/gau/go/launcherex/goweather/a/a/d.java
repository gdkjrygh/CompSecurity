// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.a.a;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.gau.go.launcherex.goweather.a.a:
//            a, b

public class d
{

    private final a a = new a();

    public d()
    {
    }

    private LatLng a(b b1, int i)
    {
        i = 1 << i;
        b1 = new b(b1.b / (double)i, b1.a / (double)i);
        return a.a(b1);
    }

    protected final LatLngBounds a(int i, int j, int k)
    {
        return new LatLngBounds(a(new b(i * 256, (j + 1) * 256), k), a(new b((i + 1) * 256, j * 256), k));
    }
}
