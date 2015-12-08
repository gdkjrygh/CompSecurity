// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.arubanetworks.meridian.editor.EditorKey;
import com.walmart.android.service.storesearch.AisleLocations;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.shop.map:
//            AisleMapTransform, AisleAdapter, SourceDataMapper, InStoreMapLoader, 
//            InStoreMapMarkerView, InStoreMapView, AislePositions

public abstract class InStoreMapController
{
    public static interface LoadingCallbacks
    {

        public abstract void onAislesLoaded();

        public abstract void onMapFail();

        public abstract void onMapLoaded();

        public abstract void onStoreDataSourceChanged();
    }

    public static interface MapVisibilityCallback
    {

        public abstract void onMapVisibilityChanged(boolean flag);
    }

    private static class ZoomToMapBounds
        implements InStoreMapView.Zoom
    {

        private final float SCALE;
        private final AisleMapTransform mAisleMapTransform;

        public void executeZoom(InStoreMapView instoremapview)
        {
            if (mAisleMapTransform.hasMapBounds())
            {
                RectF rectf = mAisleMapTransform.getMapBounds();
                Matrix matrix = new Matrix();
                matrix.setScale(1.5F, 1.5F, rectf.centerX(), rectf.centerY());
                matrix.mapRect(rectf);
                instoremapview.scrollToRect(rectf, true);
            }
        }

        private ZoomToMapBounds(AisleMapTransform aislemaptransform)
        {
            SCALE = 1.5F;
            mAisleMapTransform = aislemaptransform;
        }

    }


    private static final String TAG = com/walmart/android/app/shop/map/InStoreMapController.getSimpleName();
    protected final AisleMapTransform mAisleMapTransform = new AisleMapTransform();
    private final EditorKey mAppKey = EditorKey.forApp("5106842418020352");
    private final Context mContext;
    private boolean mIsMapLoaded;
    private final InStoreMapLoader mLoader;
    private final LoadingCallbacks mLoadingCallbacks;
    protected ViewGroup mMapContainer;
    private EditorKey mMapKey;
    protected InStoreMapMarkerView mMapView;
    private MapVisibilityCallback mMapVisibilityCallback;
    private final Animation mProgressFadeOut;
    private final Animation mProgressLegacyFadeOut;
    private View mProgressView;
    protected final SourceDataMapper mSourceDataMapper;
    private boolean mStarted;
    protected final AisleAdapter mStoreMapAdapter;
    private final ZoomToMapBounds mZoomToMapBounds;

    public InStoreMapController(Context context, SourceDataMapper sourcedatamapper, LoadingCallbacks loadingcallbacks)
    {
        mContext = context;
        mStoreMapAdapter = new AisleAdapter(context, mAisleMapTransform);
        mSourceDataMapper = sourcedatamapper;
        mSourceDataMapper.addListener(mStoreMapAdapter);
        mAisleMapTransform.setAislePositions(mSourceDataMapper.getAislePositions());
        mLoader = new InStoreMapLoader(context);
        mLoadingCallbacks = loadingcallbacks;
        mZoomToMapBounds = new ZoomToMapBounds(mAisleMapTransform);
        mProgressLegacyFadeOut = AnimationUtils.loadAnimation(context, 0x7f050018);
        mProgressLegacyFadeOut.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final InStoreMapController this$0;

            public void onAnimationEnd(Animation animation)
            {
                mProgressView.startAnimation(mProgressFadeOut);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = InStoreMapController.this;
                super();
            }
        });
        mProgressFadeOut = AnimationUtils.loadAnimation(context, 0x7f050010);
        mProgressFadeOut.setDuration(100L);
        mProgressFadeOut.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final InStoreMapController this$0;

            public void onAnimationEnd(Animation animation)
            {
                mProgressView.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = InStoreMapController.this;
                super();
            }
        });
    }

    private void loadAisles(String s)
    {
        if (mSourceDataMapper.getAislePositions() == null)
        {
            mLoader.loadAisles(s, new InStoreMapLoader.AisleLoadCallback() {

                final InStoreMapController this$0;

                public void onAisleFailed()
                {
                    onMapFailed();
                }

                public void onAisleLocations(AisleLocations aislelocations)
                {
                    aislelocations = new AislePositions(aislelocations);
                    mAisleMapTransform.setAislePositions(aislelocations);
                    mSourceDataMapper.setAislePositions(aislelocations);
                    if (mLoadingCallbacks != null)
                    {
                        mLoadingCallbacks.onAislesLoaded();
                    }
                }

            
            {
                this$0 = InStoreMapController.this;
                super();
            }
            });
        } else
        if (mLoadingCallbacks != null)
        {
            mLoadingCallbacks.onAislesLoaded();
            return;
        }
    }

    private void loadEnabled(final String storeId)
    {
        mLoader.load(storeId, new InStoreMapLoader.EnabledCallback() {

            final InStoreMapController this$0;
            final String val$storeId;

            public void onEnabled(String s)
            {
                if (!TextUtils.isEmpty(s))
                {
                    showStoreMap();
                    mMapKey = EditorKey.forMap(s, mAppKey);
                    if (mMapView != null)
                    {
                        mMapView.setMapKey(mMapKey);
                    }
                    loadAisles(storeId);
                    return;
                } else
                {
                    onMapDisabled();
                    return;
                }
            }

            
            {
                this$0 = InStoreMapController.this;
                storeId = s;
                super();
            }
        });
    }

    private void loadStoreMap(String s)
    {
        mLoader.cancel();
        onMapLoading();
        loadEnabled(s);
    }

    protected abstract InStoreMapMarkerView createMapView(Context context, ViewGroup viewgroup);

    public void destroy()
    {
        if (mMapView != null)
        {
            destroyMapView(mMapView);
        }
        mSourceDataMapper.removeListener(mStoreMapAdapter);
        mLoader.cancel();
    }

    protected void destroyMapView(InStoreMapMarkerView instoremapmarkerview)
    {
        instoremapmarkerview.setAdapter(null);
        instoremapmarkerview.setMapLoadListener(null);
    }

    protected boolean findViews(ViewGroup viewgroup)
    {
        if (viewgroup != mMapContainer)
        {
            if (mMapView != null)
            {
                mMapView.onPause();
                destroyMapView(mMapView);
            }
            mMapContainer = viewgroup;
            mProgressView = ViewUtil.findViewById(mMapContainer, 0x7f100184);
            mMapView = (InStoreMapMarkerView)ViewUtil.findViewById(mMapContainer, 0x7f10018d);
            return true;
        } else
        {
            return false;
        }
    }

    public SourceDataMapper getSourceDataMapper()
    {
        return mSourceDataMapper;
    }

    protected void hideStoreMap()
    {
        if (mMapContainer != null)
        {
            if (mMapView != null)
            {
                mMapContainer.removeView(mMapView);
            }
            mMapContainer.removeView(mProgressView);
        }
        if (mMapVisibilityCallback != null)
        {
            mMapVisibilityCallback.onMapVisibilityChanged(false);
        }
    }

    protected void initMapView(InStoreMapMarkerView instoremapmarkerview)
    {
        instoremapmarkerview.setAppKey(mAppKey);
        instoremapmarkerview.setMapLoadListener(new InStoreMapView.MapLoadListener() {

            final InStoreMapController this$0;

            public void onMapLoadFail(Throwable throwable)
            {
                WLog.d(InStoreMapController.TAG, (new StringBuilder()).append("Failed to load store map ").append(throwable).toString());
                onMapFailed();
            }

            public void onMapLoadFinish()
            {
                WLog.d(InStoreMapController.TAG, "Finished loading map");
                if (mAisleMapTransform.hasMapBounds())
                {
                    onMapLoaded();
                    zoomMap();
                    return;
                } else
                {
                    WLog.e(InStoreMapController.TAG, "Map has no placemarker bounds");
                    onMapFailed();
                    return;
                }
            }

            public void onMapLoadStart()
            {
                WLog.d(InStoreMapController.TAG, "Starting to load map");
                mAisleMapTransform.resetMapBounds();
            }

            public void onMapReloadFinish()
            {
                WLog.d(InStoreMapController.TAG, "Finished reloading map");
                onMapReloaded();
            }

            public void onMapReloadStart()
            {
                WLog.d(InStoreMapController.TAG, "Map reload start");
                onMapReloading();
            }

            public void onMapSource(float f, float f1, float f2, float f3)
            {
                mAisleMapTransform.setMapSource(f, f1, f2, f3);
            }

            
            {
                this$0 = InStoreMapController.this;
                super();
            }
        });
        instoremapmarkerview.setAdapter(mStoreMapAdapter);
    }

    public boolean isMapLoaded()
    {
        return mIsMapLoaded;
    }

    protected void onMapDisabled()
    {
        hideStoreMap();
        if (mLoadingCallbacks != null)
        {
            mLoadingCallbacks.onMapFail();
        }
    }

    protected void onMapFailed()
    {
        hideStoreMap();
        if (mLoadingCallbacks != null)
        {
            mLoadingCallbacks.onMapFail();
        }
    }

    protected void onMapLoaded()
    {
        if (mProgressView != null)
        {
            mProgressView.startAnimation(mProgressFadeOut);
        }
        mIsMapLoaded = true;
        if (mLoadingCallbacks != null)
        {
            mLoadingCallbacks.onMapLoaded();
        }
    }

    protected void onMapLoading()
    {
        if (mProgressView != null)
        {
            mProgressView.setVisibility(0);
        }
        mIsMapLoaded = false;
    }

    protected void onMapReloaded()
    {
        if (mProgressView != null)
        {
            if (android.os.Build.VERSION.SDK_INT <= 19)
            {
                mProgressView.startAnimation(mProgressLegacyFadeOut);
            } else
            {
                mProgressView.startAnimation(mProgressFadeOut);
            }
        }
        mIsMapLoaded = true;
    }

    protected void onMapReloading()
    {
        onMapLoading();
    }

    public final void setContainerView(ViewGroup viewgroup)
    {
        if (findViews(viewgroup))
        {
            if (mMapView != null)
            {
                initMapView(mMapView);
            }
            hideStoreMap();
            if (mSourceDataMapper.getStoreId() != null)
            {
                loadStoreMap(mSourceDataMapper.getStoreId());
            }
        }
    }

    public void setMapVisibilityCallback(MapVisibilityCallback mapvisibilitycallback)
    {
        mMapVisibilityCallback = mapvisibilitycallback;
    }

    public void setStoreDataSource(String s, Object obj)
    {
        if (s == null || obj == null)
        {
            hideStoreMap();
            if (mLoadingCallbacks != null)
            {
                mLoadingCallbacks.onStoreDataSourceChanged();
            }
        } else
        if (mSourceDataMapper.setStoreDataSource(s, obj))
        {
            hideStoreMap();
            loadStoreMap(s);
            if (mLoadingCallbacks != null)
            {
                mLoadingCallbacks.onStoreDataSourceChanged();
                return;
            }
        }
    }

    protected void showStoreMap()
    {
        if (mMapContainer != null)
        {
            if (mMapView == null)
            {
                mMapView = createMapView(mContext, mMapContainer);
                if (mStarted)
                {
                    mMapView.onResume();
                } else
                {
                    mMapView.onPause();
                }
                initMapView(mMapView);
            }
            mMapContainer.addView(mMapView, 0);
            mMapContainer.addView(mProgressView);
        }
        if (mMapVisibilityCallback != null)
        {
            mMapVisibilityCallback.onMapVisibilityChanged(true);
        }
    }

    public void start()
    {
        if (mMapView != null)
        {
            mMapView.onResume();
        }
        mStarted = true;
    }

    public void stop()
    {
        if (mMapView != null)
        {
            mMapView.onPause();
        }
        mStarted = false;
    }

    protected void zoomMap()
    {
        if (!isMapLoaded() || mMapView == null || !mMapView.isReady())
        {
            return;
        }
        if (mStoreMapAdapter.getCount() == 0)
        {
            zoomToMap();
            return;
        } else
        {
            zoomToMarkers();
            return;
        }
    }

    protected void zoomToMap()
    {
        if (mMapView != null)
        {
            mMapView.zoom(mZoomToMapBounds);
        }
    }

    protected abstract void zoomToMarkers();







/*
    static EditorKey access$402(InStoreMapController instoremapcontroller, EditorKey editorkey)
    {
        instoremapcontroller.mMapKey = editorkey;
        return editorkey;
    }

*/



}
