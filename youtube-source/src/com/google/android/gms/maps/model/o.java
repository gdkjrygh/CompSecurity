// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.model.a.w;

// Referenced classes of package com.google.android.gms.maps.model:
//            q, TileOverlayOptions, Tile

final class o extends w
{

    final q a;
    final TileOverlayOptions b;

    o(TileOverlayOptions tileoverlayoptions, q q1)
    {
        b = tileoverlayoptions;
        a = q1;
        super();
    }

    public final Tile a(int i, int j, int k)
    {
        return a.a(i, j, k);
    }
}
