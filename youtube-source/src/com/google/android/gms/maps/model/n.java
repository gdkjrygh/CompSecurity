// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.maps.model.a.v;

// Referenced classes of package com.google.android.gms.maps.model:
//            q, TileOverlayOptions, Tile

final class n
    implements q
{

    final TileOverlayOptions a;
    private final v c;

    n(TileOverlayOptions tileoverlayoptions)
    {
        a = tileoverlayoptions;
        super();
        c = TileOverlayOptions.a(a);
    }

    public final Tile a(int i, int j, int k)
    {
        Tile tile;
        try
        {
            tile = c.a(i, j, k);
        }
        catch (RemoteException remoteexception)
        {
            return null;
        }
        return tile;
    }
}
