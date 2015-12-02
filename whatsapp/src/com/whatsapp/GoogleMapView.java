// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.location.Location;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Projection;

// Referenced classes of package com.whatsapp:
//            o2

public class GoogleMapView extends MapView
    implements android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnGestureListener
{

    private GeoPoint a;
    private o2 b;
    private GestureDetector c;
    private int d;
    private int e;

    public GoogleMapView(Context context)
    {
        super(context, context.getString(0x7f0e0239));
        a = new GeoPoint(0, 0);
        d = 0;
        e = 0;
        b();
    }

    public GoogleMapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new GeoPoint(0, 0);
        d = 0;
        e = 0;
        b();
    }

    public GoogleMapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new GeoPoint(0, 0);
        d = 0;
        e = 0;
        b();
    }

    public static GeoPoint a(Location location)
    {
        return new GeoPoint((int)(location.getLatitude() * 1000000D), (int)(location.getLongitude() * 1000000D));
    }

    public static Location b(GeoPoint geopoint)
    {
        Location location = new Location("");
        location.setLatitude((double)geopoint.getLatitudeE6() / 1000000D);
        location.setLongitude((double)geopoint.getLongitudeE6() / 1000000D);
        return location;
    }

    private void b()
    {
        c = new GestureDetector(this);
        c.setOnDoubleTapListener(this);
    }

    public int a()
    {
        Location location = b(getMapCenter());
        Location location1 = b(getProjection().fromPixels(getWidth() / 2, 0));
        Location location2 = b(getProjection().fromPixels(0, getHeight() / 2));
        return (int)Math.min(location.distanceTo(location1), location.distanceTo(location2));
    }

    public void a(GeoPoint geopoint)
    {
        if (geopoint == null)
        {
            return;
        }
        try
        {
            getController().animateTo(geopoint);
            return;
        }
        catch (Exception exception) { }
        try
        {
            getController().setCenter(geopoint);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GeoPoint geopoint)
        {
            return;
        }
    }

    public Location c()
    {
        return b(getMapCenter());
    }

    public void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (b != null)
        {
            canvas = getMapCenter();
            int i = getLatitudeSpan();
            int j = getLongitudeSpan();
            if (!a.equals(canvas) || d != i || e != j)
            {
                a = canvas;
                d = i;
                e = j;
                b.a(canvas, i, j);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        c.onTouchEvent(motionevent);
        return super.dispatchTouchEvent(motionevent);
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        return getController().zoomInFixing((int)motionevent.getX(), (int)motionevent.getY());
    }

    public boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onDown(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }

    public void setMapListener(o2 o2_1)
    {
        b = o2_1;
    }
}
