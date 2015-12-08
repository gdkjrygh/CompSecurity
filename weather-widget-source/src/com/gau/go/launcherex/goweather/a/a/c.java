// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.a.a;

import android.text.TextUtils;
import com.gau.go.launcherex.goweather.a.f;
import com.gau.go.launcherex.goweather.a.g;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.jiubang.goweather.e.a;

// Referenced classes of package com.gau.go.launcherex.goweather.a.a:
//            d

public class c
    implements TileProvider
{

    private final d a = new d();

    public c()
    {
    }

    private static f a()
    {
        f f1 = new f();
        f1.a("http://gwm.3g.cn:8099/goweatherexMeteor/satellite/v2/image");
        f1.c(256);
        f1.b(256);
        f1.a(g.a);
        return f1;
    }

    private boolean a(int i, int j, int k)
    {
        return k >= 2 && k <= 8;
    }

    private boolean a(LatLngBounds latlngbounds)
    {
        return latlngbounds.southwest.latitude <= 64D && latlngbounds.northeast.latitude >= -64D;
    }

    public Tile getTile(int i, int j, int k)
    {
        Object obj1 = null;
        Object obj;
        if (!a(i, j, k))
        {
            obj = TileProvider.NO_TILE;
        } else
        {
            obj = a.a(i, j, k);
            if (!a(((LatLngBounds) (obj))))
            {
                return TileProvider.NO_TILE;
            }
            f f1 = a();
            f1.a(k);
            f1.a(((LatLngBounds) (obj)));
            String s = f1.m();
            com.gtp.a.a.b.c.a("SatelliteTileProvider", (new StringBuilder()).append("requestUrl:").append(s).toString());
            obj = obj1;
            if (!TextUtils.isEmpty(s))
            {
                i = 3;
                byte abyte0[];
                for (abyte0 = null; abyte0 == null && i > 0; abyte0 = com.jiubang.goweather.e.a.a(s))
                {
                    i--;
                }

                obj = obj1;
                if (abyte0 != null)
                {
                    return new Tile(256, 256, abyte0);
                }
            }
        }
        return ((Tile) (obj));
    }
}
