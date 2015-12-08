// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.arubanetworks.meridian.editor.Placemark;
import com.arubanetworks.meridian.maps.MapOptions;
import com.arubanetworks.meridian.maps.MapView;
import com.arubanetworks.meridian.maps.Marker;
import com.walmartlabs.utils.WLog;
import java.util.Iterator;
import java.util.List;

public class InStoreMapView extends MapView
    implements com.arubanetworks.meridian.maps.MapView.MapEventListener, com.arubanetworks.meridian.maps.MapView.MarkerEventListener
{
    public static interface MapLoadListener
    {

        public abstract void onMapLoadFail(Throwable throwable);

        public abstract void onMapLoadFinish();

        public abstract void onMapLoadStart();

        public abstract void onMapReloadFinish();

        public abstract void onMapReloadStart();

        public abstract void onMapSource(float f, float f1, float f2, float f3);
    }

    public static interface MapTapListener
    {

        public abstract void onMapTapped();

        public abstract void onMarkerTapped(Marker marker);
    }

    public static interface Zoom
    {

        public abstract void executeZoom(InStoreMapView instoremapview);
    }


    private final String TAG;
    private boolean mAttachedToWindow;
    private boolean mBlockTouch;
    private boolean mIsLoadingMap;
    private boolean mIsRenderingMap;
    private MapLoadListener mLoadListener;
    private MapTapListener mMapTapListener;
    private boolean mPaused;
    private Matrix mTransform;

    public InStoreMapView(Context context)
    {
        this(context, null);
    }

    public InStoreMapView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, -1);
    }

    public InStoreMapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        TAG = (new StringBuilder()).append(com/walmart/android/app/shop/map/InStoreMapView.getSimpleName()).append(Integer.toHexString(hashCode())).toString();
        mIsRenderingMap = true;
        mIsLoadingMap = true;
        mPaused = true;
        mAttachedToWindow = false;
        setMapEventListener(this);
        setMarkerEventListener(this);
        setShowsUserLocation(false);
        showLoadingIndicator(false);
        context = getOptions();
        context.HIDE_LEVELS_CONTROL = true;
        context.HIDE_LOCATION_BUTTON = true;
        context.HIDE_MAP_LABEL = true;
        context.HIDE_DIRECTIONS_CONTROLS = true;
        context.HIDE_MENU_BUTTON = true;
        context.HIDE_OVERVIEW_BUTTON = true;
        context.HIDE_STEP_LABEL = true;
        setOptions(context);
    }

    private void findMapSourceCoordinates()
    {
        Object obj = getPlacemarks();
        float f4 = 0.0F;
        float f2 = 0.0F;
        float f = 0.0F;
        float f1 = 0.0F;
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Placemark placemark = (Placemark)((Iterator) (obj)).next();
            float f5 = f4;
            float f3 = f2;
            if ("MAP_SRC_ORIGIN".equalsIgnoreCase(placemark.getName()))
            {
                f5 = placemark.getX();
                f3 = placemark.getY();
                placemark.setHideOnMap(true);
            }
            f4 = f5;
            f2 = f3;
            if ("MAP_SRC_MAX".equalsIgnoreCase(placemark.getName()))
            {
                f = placemark.getX();
                f1 = placemark.getY();
                placemark.setHideOnMap(true);
                f4 = f5;
                f2 = f3;
            }
        } while (true);
        WLog.i(TAG, (new StringBuilder()).append("Found source coordinates ").append(f4).append(", ").append(f2).append(", ").append(f).append(", ").append(f1).toString());
        if (mLoadListener != null)
        {
            mLoadListener.onMapSource(f4, f2, f, f1);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.dispatchTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            WLog.e(TAG, "onTouchEvent exception", motionevent);
            return false;
        }
        return flag;
    }

    public void focusableViewAvailable(View view)
    {
    }

    public Matrix getTransform()
    {
        return mTransform;
    }

    protected void internalMapLoadFinish()
    {
    }

    protected void internalMapLoadStart()
    {
        mIsRenderingMap = true;
        mIsLoadingMap = true;
    }

    public boolean isAttachedToWindow()
    {
        return mAttachedToWindow;
    }

    public boolean isLoadingMap()
    {
        return mIsLoadingMap;
    }

    public boolean isPaused()
    {
        return mPaused;
    }

    public boolean isReady()
    {
        return !isRenderingMap() && !isLoadingMap() && !isPaused() && isAttachedToWindow();
    }

    public boolean isRenderingMap()
    {
        return mIsRenderingMap;
    }

    public Marker markerForPlacemark(Placemark placemark)
    {
        return null;
    }

    protected void onAttachedToWindow()
    {
        WLog.i(TAG, "onAttachedToWindow");
        boolean flag = isReady();
        mAttachedToWindow = true;
        super.onAttachedToWindow();
        if (!flag && isReady() && mLoadListener != null)
        {
            mLoadListener.onMapReloadStart();
        }
    }

    public boolean onCalloutClick(Marker marker)
    {
        return true;
    }

    protected void onDetachedFromWindow()
    {
        WLog.i(TAG, "onDetachedFromWindow");
        mAttachedToWindow = false;
        super.onDetachedFromWindow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return mBlockTouch;
    }

    public void onMapClick()
    {
        super.onMapClick();
        if (mMapTapListener != null)
        {
            mMapTapListener.onMapTapped();
        }
    }

    public void onMapLoadFail(Throwable throwable)
    {
        WLog.i(TAG, (new StringBuilder()).append("Failed loading view map() ").append(Thread.currentThread()).toString());
        if (mLoadListener != null)
        {
            mLoadListener.onMapLoadFail(throwable);
        }
    }

    public void onMapLoadFinish()
    {
        WLog.i(TAG, (new StringBuilder()).append("onMapLoadFinish() ").append(Thread.currentThread()).toString());
        boolean flag = isReady();
        mIsLoadingMap = false;
        if (isReady() && flag)
        {
            if (mLoadListener != null)
            {
                mLoadListener.onMapReloadFinish();
            }
        } else
        if (isReady())
        {
            WLog.e(TAG, (new StringBuilder()).append("We got onMapLoadFinish() after onMapRenderFinish() ").append(Thread.currentThread()).toString());
            internalMapLoadFinish();
            if (mLoadListener != null)
            {
                mLoadListener.onMapLoadFinish();
                return;
            }
        }
    }

    public void onMapLoadStart()
    {
        WLog.i(TAG, (new StringBuilder()).append("Starting to load view map() ").append(Thread.currentThread()).toString());
        internalMapLoadStart();
        if (mLoadListener != null)
        {
            mLoadListener.onMapLoadStart();
        }
    }

    public void onMapRenderFinish()
    {
        WLog.i(TAG, (new StringBuilder()).append("onMapRenderFinish() ").append(Thread.currentThread()).toString());
        mIsRenderingMap = false;
        if (isReady())
        {
            internalMapLoadFinish();
            if (mLoadListener != null)
            {
                mLoadListener.onMapLoadFinish();
            }
        }
    }

    public void onMapTransformChange(Matrix matrix)
    {
        mTransform = matrix;
    }

    public boolean onMarkerDeselect(Marker marker)
    {
        return false;
    }

    public boolean onMarkerSelect(Marker marker)
    {
        if (mMapTapListener != null)
        {
            mMapTapListener.onMarkerTapped(marker);
        }
        return true;
    }

    public void onPause()
    {
        WLog.i(TAG, "onPause");
        mPaused = true;
        super.onPause();
    }

    public void onPlacemarksLoadFinish()
    {
        WLog.i(TAG, (new StringBuilder()).append("onPlacemarksLoadFinish() ").append(Thread.currentThread()).toString());
        findMapSourceCoordinates();
    }

    public void onResume()
    {
        WLog.i(TAG, "onResume");
        boolean flag = isReady();
        mPaused = false;
        super.onResume();
        if (!flag && isReady() && mLoadListener != null)
        {
            mLoadListener.onMapReloadStart();
        }
    }

    public void onThreeFingerLongPress()
    {
    }

    public void scrollToRect(RectF rectf)
    {
        WLog.i(TAG, (new StringBuilder()).append("scrollToRect(RectF) ").append(rectf).toString());
        super.scrollToRect(rectf);
    }

    public void scrollToRect(RectF rectf, float f)
    {
        WLog.i(TAG, (new StringBuilder()).append("scrollToRect(RectF, float) ").append(rectf).toString());
        super.scrollToRect(rectf, f);
    }

    public void scrollToRect(RectF rectf, float f, boolean flag)
    {
        WLog.i(TAG, (new StringBuilder()).append("scrollToRect(RectF, float, boolean) ").append(rectf).toString());
        super.scrollToRect(rectf, f, flag);
    }

    public void scrollToRect(RectF rectf, boolean flag)
    {
        WLog.i(TAG, (new StringBuilder()).append("scrollToRect(RectF, boolean) ").append(rectf).toString());
        super.scrollToRect(rectf, flag);
    }

    public void setBlockTouch(boolean flag)
    {
        mBlockTouch = flag;
    }

    public void setMapLoadListener(MapLoadListener maploadlistener)
    {
        mLoadListener = maploadlistener;
    }

    public void setMapTapListener(MapTapListener maptaplistener)
    {
        mMapTapListener = maptaplistener;
    }

    public void zoom(Zoom zoom1)
    {
        zoom1.executeZoom(this);
    }
}
