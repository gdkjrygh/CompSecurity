// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.map;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.settings.helpers.MapViewType;
import com.wsi.android.framework.ui.overlay.OverlayController;
import com.wsi.android.weather.utils.Destroyable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

// Referenced classes of package com.wsi.android.framework.ui.map:
//            MapViewInterface, GoogleGeoPoint, GeoPointInterface

public class WSIMapView extends MapView
    implements Destroyable, MapViewInterface
{

    private static final float MAP_WIDTH_MULTIPLIER = 1.5F;
    private static final String TAG = com/wsi/android/framework/ui/map/WSIMapView.getSimpleName();
    public static final int TILE_ZOOM_LEVEL_DISCREPANCY = 1;
    private boolean coverWorldHorizontally;
    private int mapSize;
    private Runnable onAnimateToCompleteAction;
    OverlayController overlayController;

    public WSIMapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onAnimateToCompleteAction = new _cls1();
    }

    public WSIMapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        onAnimateToCompleteAction = new _cls1();
    }

    public WSIMapView(Context context, String s)
    {
        super(context, s);
        onAnimateToCompleteAction = new _cls1();
    }

    private static void logTileCleanupError(Throwable throwable)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.e(TAG, "Unable to clean up the Map tiles due to the following error:", throwable);
        }
    }

    private static boolean releaseMapTiles()
    {
        Object aobj[];
        Field field = Class.forName("com.google.googlenav.map.Tile").getDeclaredField("tileObjectCache");
        field.setAccessible(true);
        aobj = (Object[])(Object[])field.get(null);
        int i = 0;
        while (i < aobj.length) 
        {
            aobj[i] = null;
            i++;
        }
        return true;
        Object obj;
        obj;
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "Impossible to clean up the tile cache for this platform.");
        }
_L2:
        return false;
        obj;
        logTileCleanupError(((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        logTileCleanupError(((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        logTileCleanupError(((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        logTileCleanupError(((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean updateHorizontalWorldCover()
    {
        boolean flag;
        if ((float)getWidth() * 1.5F > (float)mapSize)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        coverWorldHorizontally = flag;
        return flag;
    }

    private int updatePixelMapSize()
    {
        int i = 256 << getZoomLevel();
        mapSize = i;
        return i;
    }

    public void animateTo(GeoPoint geopoint)
    {
        super.getController().animateTo(geopoint, onAnimateToCompleteAction);
    }

    public void cleanUp()
    {
        com/wsi/android/framework/ui/map/WSIMapView;
        JVM INSTR monitorenter ;
        releaseMapTiles();
        System.gc();
        com/wsi/android/framework/ui/map/WSIMapView;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/wsi/android/framework/ui/map/WSIMapView;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void fixTileTextSize()
    {
        if (getResources().getDisplayMetrics().densityDpi != 120) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Method method;
        obj = Class.forName("com.google.googlenav.map.MapTile");
        method = ((Class) (obj)).getDeclaredMethod("setTextSize", new Class[] {
            Integer.TYPE
        });
        if (getResources().getDisplayMetrics().densityDpi != 240)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        obj = (Byte)((Class) (obj)).getDeclaredField("TEXT_SIZE_LARGE").get(null);
_L3:
        method.invoke(null, new Object[] {
            obj
        });
        releaseMapTiles();
        return;
        obj;
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "Setting the label text size is unsupported for this platform.");
            return;
        }
        continue; /* Loop/switch isn't completed */
        obj = (Byte)((Class) (obj)).getDeclaredField("TEXT_SIZE_MEDIUM").get(null);
          goto _L3
        Throwable throwable;
        throwable;
        if (ConfigInfo.DEBUG)
        {
            Log.e(TAG, "Failed to set the label text size due to the error:", throwable);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public MapController getController()
        throws UnsupportedOperationException
    {
        return super.getController();
    }

    public GeoPointInterface getMapCenterGeneric()
    {
        return new GoogleGeoPoint(getMapCenter());
    }

    public int getPixelMapSize()
    {
        return mapSize;
    }

    public int getZoomLevel()
    {
        int i = super.getZoomLevel();
        if (i > 0)
        {
            return i - 1;
        } else
        {
            return 0;
        }
    }

    protected void invalidateOverlayController()
    {
        if (overlayController != null)
        {
            overlayController.invalidate();
        }
    }

    public boolean isCoverWorldHorizontally()
    {
        return coverWorldHorizontally;
    }

    public void onDestroy()
    {
        getOverlays().clear();
        overlayController = null;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        onZoomLevelChanged();
        try
        {
            if (overlayController != null)
            {
                overlayController.onSizeChanged(i, j);
            }
            return;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            processOutOfTileMemoryError(outofmemoryerror);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.onTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            processOutOfTileMemoryError(motionevent);
            return false;
        }
        return flag;
    }

    public void onZoomLevelChanged()
    {
        updatePixelMapSize();
        updateHorizontalWorldCover();
    }

    public void processOutOfTileMemoryError(OutOfMemoryError outofmemoryerror)
    {
        if (releaseMapTiles())
        {
            if (ConfigInfo.DEBUG)
            {
                Log.w(TAG, (new StringBuilder()).append("Memory limit has reached: ").append(outofmemoryerror.getMessage()).toString());
                Log.d(TAG, "Successfully released cached Map tiles.");
            }
            System.gc();
            preLoad();
            return;
        } else
        {
            throw outofmemoryerror;
        }
    }

    public void setCenter(GeoPoint geopoint)
    {
        super.getController().setCenter(geopoint);
        invalidateOverlayController();
    }

    public void setOverlayController(OverlayController overlaycontroller)
    {
        overlayController = overlaycontroller;
    }

    public void setViewMode(MapViewType mapviewtype)
    {
        if (mapviewtype == null)
        {
            return;
        }
        switch (_cls2..SwitchMap.com.wsi.android.framework.settings.helpers.MapViewType[mapviewtype.ordinal()])
        {
        default:
            setSatellite(false);
            setStreetView(false);
            setTraffic(false);
            return;

        case 1: // '\001'
            setSatellite(true);
            break;
        }
        setStreetView(false);
        setTraffic(false);
    }

    public int setZoom(int i)
    {
        if (overlayController != null)
        {
            overlayController.updateZoomLevel();
        }
        i = super.getController().setZoom(i);
        if (overlayController != null)
        {
            overlayController.checkZoomLevelChanged();
        }
        invalidateOverlayController();
        return i;
    }

    public void setZoomLevel(int i)
    {
        try
        {
            setZoom(i + 1);
            return;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            processOutOfTileMemoryError(outofmemoryerror);
        }
    }

    public boolean zoomIn()
    {
        return super.getController().zoomIn();
    }

    public boolean zoomInFixing(int i, int j)
    {
        return super.getController().zoomInFixing(i, j);
    }

    public boolean zoomOut()
    {
        return super.getController().zoomOut();
    }

    public void zoomToSpan(int i, int j)
    {
        if (overlayController != null)
        {
            overlayController.updateZoomLevel();
        }
        super.getController().zoomToSpan(i, j);
        if (overlayController != null)
        {
            overlayController.checkZoomLevelChanged();
        }
        invalidateOverlayController();
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
