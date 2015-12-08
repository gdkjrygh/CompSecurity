// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapController, AisleAdapter, SourceDataMapper, MappedSections, 
//            InStoreMapMarkerView, AisleMapTransform, AisleSection, InStoreMapView

public class InStoreMapSectionController extends InStoreMapController
{
    private class Observer extends DataSetObserver
    {

        final InStoreMapSectionController this$0;

        public void onChanged()
        {
            mHandler.post(new Runnable() {

                final Observer this$1;

                public void run()
                {
                    zoomMap();
                    updateItemsOnMap();
                }

            
            {
                this$1 = Observer.this;
                super();
            }
            });
        }

        public void onInvalidated()
        {
            hideStoreMap();
        }

        private Observer()
        {
            this$0 = InStoreMapSectionController.this;
            super();
        }

    }

    private static class ZoomToMarkers
        implements InStoreMapView.Zoom
    {

        private final AisleMapTransform mAisleMapTransform;
        private final float mCoordinates[];
        private final AisleAdapter mStoreMapAdapter;

        public void executeZoom(InStoreMapView instoremapview)
        {
            if (mAisleMapTransform.hasMapBounds() && mAisleMapTransform.hasAisleToMap() && mStoreMapAdapter.getCount() > 0)
            {
                RectF rectf = mAisleMapTransform.getMapBounds();
                RectF rectf1 = new RectF(3.402823E+38F, 3.402823E+38F, 1.401298E-45F, 1.401298E-45F);
                for (int i = 0; i < mStoreMapAdapter.getCount(); i++)
                {
                    mAisleMapTransform.aisleToMap(mCoordinates, ((AisleSection)mStoreMapAdapter.getItem(i)).getPosition());
                    rectf1.left = Math.min(rectf1.left, mCoordinates[0]);
                    rectf1.top = Math.min(rectf1.top, mCoordinates[1]);
                    rectf1.right = Math.max(rectf1.right, mCoordinates[0]);
                    rectf1.bottom = Math.max(rectf1.bottom, mCoordinates[1]);
                }

                rectf.offset(rectf1.centerX() - rectf.centerX(), rectf1.centerY() - rectf.centerY());
                instoremapview.scrollToRect(rectf, true);
            }
        }

        private ZoomToMarkers(AisleMapTransform aislemaptransform, AisleAdapter aisleadapter)
        {
            mCoordinates = new float[2];
            mAisleMapTransform = aislemaptransform;
            mStoreMapAdapter = aisleadapter;
        }

    }


    private View mError;
    private final Handler mHandler = new Handler();
    private TextView mItemsOnMap;

    public InStoreMapSectionController(Context context, SourceDataMapper sourcedatamapper, InStoreMapController.LoadingCallbacks loadingcallbacks)
    {
        super(context, sourcedatamapper, loadingcallbacks);
        mStoreMapAdapter.registerDataSetObserver(new Observer());
        mStoreMapAdapter.setPinResource(0x7f0201b6);
    }

    private void updateItemsOnMap()
    {
        if (mSourceDataMapper.getMappedSections().getDataCount() > 0)
        {
            if (mItemsOnMap != null)
            {
                mItemsOnMap.setText(mItemsOnMap.getContext().getString(0x7f09015c, new Object[] {
                    Integer.valueOf(mSourceDataMapper.getMappedSections().getDataCount())
                }));
                mItemsOnMap.setVisibility(0);
            }
            if (mError != null)
            {
                mError.setVisibility(8);
            }
        } else
        if (mSourceDataMapper.hasAllData())
        {
            if (mItemsOnMap != null)
            {
                mItemsOnMap.setVisibility(8);
            }
            if (mError != null)
            {
                mError.setVisibility(0);
                ViewUtil.setText(0x7f10018f, mError, 0x7f09015b);
                return;
            }
        }
    }

    protected InStoreMapMarkerView createMapView(Context context, ViewGroup viewgroup)
    {
        return (InStoreMapMarkerView)ViewUtil.inflate(context, 0x7f040071, viewgroup, false);
    }

    public boolean findViews(ViewGroup viewgroup)
    {
        boolean flag = super.findViews(viewgroup);
        if (flag && mMapContainer != null)
        {
            mItemsOnMap = (TextView)ViewUtil.findViewById(mMapContainer, 0x7f100190);
            mError = ViewUtil.findViewById(mMapContainer, 0x7f10018e);
        }
        return flag;
    }

    protected void hideStoreMap()
    {
        super.hideStoreMap();
        if (mMapContainer != null && mItemsOnMap != null)
        {
            mMapContainer.removeView(mItemsOnMap);
        }
        if (mMapContainer != null && mError != null)
        {
            mMapContainer.removeView(mError);
        }
    }

    protected void initMapView(InStoreMapMarkerView instoremapmarkerview)
    {
        super.initMapView(instoremapmarkerview);
        instoremapmarkerview.setBlockTouch(true);
        updateItemsOnMap();
    }

    protected void onMapFailed()
    {
        super.onMapFailed();
        if (mError != null)
        {
            if (mMapContainer != null && mError.getParent() == null)
            {
                mMapContainer.addView(mError);
            }
            mError.setVisibility(0);
            ViewUtil.setText(0x7f10018f, mError, 0x7f09015a);
        }
    }

    protected void showStoreMap()
    {
        if (mMapContainer != null && mItemsOnMap != null)
        {
            mMapContainer.addView(mItemsOnMap);
        }
        if (mMapContainer != null && mError != null)
        {
            mMapContainer.addView(mError);
        }
        super.showStoreMap();
    }

    protected void zoomToMarkers()
    {
        if (mMapView != null)
        {
            mMapView.zoom(new ZoomToMarkers(mAisleMapTransform, mStoreMapAdapter));
        }
    }


}
