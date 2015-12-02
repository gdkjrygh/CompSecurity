// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.ubercab.client.feature.trip.map.layer.pickup.HotspotMarker;
import com.ubercab.rider.realtime.model.GeoJsonFeature;

public final class gbi
{

    private final cjf a;
    private final Context b;
    private final cjn c;
    private cje d;

    public gbi(cjf cjf1, Context context, cjn cjn)
    {
        a = cjf1;
        b = context;
        c = cjn;
    }

    private cje a()
    {
        if (d == null)
        {
            d = cjf.a(b());
        }
        return d;
    }

    private Bitmap b()
    {
        Drawable drawable = b.getResources().getDrawable(0x7f020164);
        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }

    public final HotspotMarker a(GeoJsonFeature geojsonfeature, int i)
    {
        return new HotspotMarker(c, geojsonfeature, i, a());
    }
}
