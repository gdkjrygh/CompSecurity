// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Handler;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Projection;

// Referenced classes of package com.whatsapp:
//            yq

public class asq extends MyLocationOverlay
{

    private Drawable a;
    private Point b;
    private Handler c;
    private Drawable d;
    private Drawable e;
    private Point f;
    private Paint g;

    public asq(Context context, MapView mapview)
    {
        super(context, mapview);
        f = new Point();
        b = new Point();
        e = context.getResources().getDrawable(0x7f020597);
        d = context.getResources().getDrawable(0x7f020598);
        a = e;
        g = new Paint();
        g.setAntiAlias(true);
        g.setStrokeWidth(2.0F);
        c = new yq(this, mapview);
        c.sendEmptyMessageDelayed(0, 500L);
    }

    static Drawable a(asq asq1)
    {
        return asq1.a;
    }

    static Drawable a(asq asq1, Drawable drawable)
    {
        asq1.a = drawable;
        return drawable;
    }

    static Drawable b(asq asq1)
    {
        return asq1.e;
    }

    static Drawable c(asq asq1)
    {
        return asq1.d;
    }

    public void disableMyLocation()
    {
        super.disableMyLocation();
        c.removeMessages(0);
    }

    protected void drawMyLocation(Canvas canvas, MapView mapview, Location location, GeoPoint geopoint, long l)
    {
        int i = a.getIntrinsicWidth();
        int j = a.getIntrinsicHeight();
        mapview = mapview.getProjection();
        double d1 = location.getLatitude();
        double d2 = location.getLongitude();
        float f1 = location.getAccuracy();
        location = new float[1];
        Location.distanceBetween(d1, d2, d1, d2 + 1.0D, location);
        float f2 = location[0];
        mapview.toPixels(new GeoPoint((int)(d1 * 1000000D), (int)((d2 - (double)(f1 / f2)) * 1000000D)), b);
        mapview.toPixels(geopoint, f);
        int k = f.x - b.x;
        g.setColor(0xff6666ff);
        g.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawCircle(f.x, f.y, k, g);
        g.setColor(0x186666ff);
        g.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawCircle(f.x, f.y, k, g);
        a.setBounds(f.x - i / 2, f.y - j / 2, f.x + i / 2, f.y + j / 2);
        a.draw(canvas);
    }
}
