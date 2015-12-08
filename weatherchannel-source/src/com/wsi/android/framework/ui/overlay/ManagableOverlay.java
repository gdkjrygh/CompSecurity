// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.overlay;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.ui.map.WSIMapView;
import com.wsi.android.framework.ui.utils.MapRect;
import com.wsi.android.weather.utils.Destroyable;

// Referenced classes of package com.wsi.android.framework.ui.overlay:
//            AbstractItemizedOverlay, ZoomReaction

public abstract class ManagableOverlay extends AbstractItemizedOverlay
    implements Destroyable
{

    protected WSIMapView map;
    private boolean requiresRedraw;

    public ManagableOverlay(WSIMapView wsimapview)
    {
        map = wsimapview;
    }

    public static void drawAt(Canvas canvas, Drawable drawable, int i, int j)
    {
        canvas.save();
        canvas.translate(i, j);
        drawable.draw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas, MapView mapview, Matrix matrix, GeoPoint geopoint, GeoPoint geopoint1)
    {
        if (requiresRedraw)
        {
            requiresRedraw = false;
        }
    }

    public final void draw(Canvas canvas, MapView mapview, boolean flag)
    {
        if (flag)
        {
            return;
        } else
        {
            draw(canvas, mapview, null, null, null);
            return;
        }
    }

    public abstract ZoomReaction getActionOnZoom();

    public void invalidate()
    {
        invalidate(0);
    }

    public void invalidate(int i)
    {
        if (!requiresRedraw)
        {
            requiresRedraw = true;
            if (map != null)
            {
                map.postInvalidateDelayed(i);
            } else
            if (ConfigInfo.DEBUG)
            {
                Log.w(getClass().getSimpleName(), "Invalidate after destroy...");
                return;
            }
        }
    }

    public void onDestroy()
    {
        map = null;
    }

    public abstract void onMapScale();

    public abstract void onSizeChanged();

    public boolean onTap(MapRect maprect, MapView mapview)
    {
        return false;
    }

    public abstract void onZoomLevelChanged(MapView mapview);

    public boolean requiresRedraw()
    {
        return requiresRedraw;
    }
}
