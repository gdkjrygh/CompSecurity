// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.content.Context;
import android.database.DataSetObserver;
import android.database.Observable;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.arubanetworks.meridian.maps.Marker;
import com.walmart.android.utils.ViewUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.map:
//            AisleSection, AisleMapTransform, MappedSections

public class AisleAdapter extends BaseAdapter
    implements InStoreMapMarkerView.MarkerAdapter, SourceDataMapper.Listener
{
    public static abstract class AisleDataSetObserver extends DataSetObserver
    {

        public void onVisualChanged(List list)
        {
        }

        public AisleDataSetObserver()
        {
        }
    }

    public static class AisleMarker extends Marker
    {

        private final AisleSection mAisleSection;
        private final Bitmap mBitmap;

        public AisleSection getAisleSection()
        {
            return mAisleSection;
        }

        public Bitmap getBitmap()
        {
            return mBitmap;
        }

        public String getCalloutText()
        {
            return null;
        }

        public AisleMarker(AisleSection aislesection, float f, float f1, Bitmap bitmap)
        {
            super(f, f1);
            mBitmap = bitmap;
            mAisleSection = aislesection;
            setShowsCallout(false);
        }
    }

    private static class AisleSetObservable extends Observable
    {

        public void notifyChanged(List list)
        {
            ArrayList arraylist = mObservers;
            arraylist;
            JVM INSTR monitorenter ;
            int i = mObservers.size() - 1;
_L2:
            if (i < 0)
            {
                break; /* Loop/switch isn't completed */
            }
            ((AisleDataSetObserver)mObservers.get(i)).onVisualChanged(list);
            i--;
            if (true) goto _L2; else goto _L1
_L1:
            arraylist;
            JVM INSTR monitorexit ;
            return;
            list;
            arraylist;
            JVM INSTR monitorexit ;
            throw list;
        }

        private AisleSetObservable()
        {
        }

    }

    private static class MarkerFactory
    {

        private final LruCache mAisles = new LruCache(10);
        private final Context mContext;
        private int mPinResource;
        private float mSelectedAnchorY;

        public Marker create(AisleSection aislesection, float f, float f1)
        {
            return new AisleMarker(aislesection, f, f1, BitmapFactory.decodeResource(mContext.getResources(), mPinResource));
        }

        public Marker create(AisleSection aislesection, float f, float f1, String s)
        {
            Object obj = (Bitmap)mAisles.get(s);
            if (obj == null || mSelectedAnchorY == 0.0F)
            {
                View view = ViewUtil.inflate(mContext, 0x7f04006b, null, false);
                ViewUtil.setText(0x7f100178, view, mContext.getString(0x7f090159, new Object[] {
                    s
                }));
                if (view.getMeasuredHeight() <= 0 || view.getMeasuredWidth() <= 0)
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                }
                s = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                obj = new Canvas(s);
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                view.draw(((Canvas) (obj)));
                obj = s;
                if (mSelectedAnchorY == 0.0F)
                {
                    float f2 = view.getHeight();
                    mSelectedAnchorY = (float)ViewUtil.findViewById(view, 0x7f100179).getHeight() / 2.0F / f2;
                    obj = s;
                }
            }
            aislesection = new AisleMarker(aislesection, f, f1, ((Bitmap) (obj)));
            aislesection.setAnchor(0.5F, mSelectedAnchorY);
            return aislesection;
        }

        public void setPinResource(int i)
        {
            mPinResource = i;
        }

        public MarkerFactory(Context context)
        {
            mContext = context;
        }
    }


    private final AisleMapTransform mAisleMapTransform;
    private List mAisles;
    private final AisleSetObservable mDataSetObservable = new AisleSetObservable();
    private final MarkerFactory mMarkerFactory;
    private AisleSection mSelectedAisleSection;

    public AisleAdapter(Context context, AisleMapTransform aislemaptransform)
    {
        mAisles = Collections.emptyList();
        mMarkerFactory = new MarkerFactory(context);
        mAisleMapTransform = aislemaptransform;
    }

    private void notifyDataSetChanged(List list)
    {
        mDataSetObservable.notifyChanged(list);
    }

    public int getCount()
    {
        return mAisles.size();
    }

    public Object getItem(int i)
    {
        return mAisles.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public Marker getMarker(int i)
    {
        return getMarker((AisleSection)getItem(i));
    }

    public Marker getMarker(AisleSection aislesection)
    {
        float af[] = new float[2];
        AisleSection aislesection1 = null;
        if (mAisleMapTransform.aisleToMap(af, aislesection.getPosition()))
        {
            if (mSelectedAisleSection != null && mSelectedAisleSection.equals(aislesection))
            {
                aislesection = mMarkerFactory.create(aislesection, af[0], af[1], aislesection.getName());
                aislesection.setWeight(2.0F);
            } else
            {
                aislesection = mMarkerFactory.create(aislesection, af[0], af[1]);
            }
            aislesection.setCollision(false);
            aislesection1 = aislesection;
        }
        return aislesection1;
    }

    public AisleSection getSelected()
    {
        return mSelectedAisleSection;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return null;
    }

    public void onUpdate(MappedSections mappedsections)
    {
        mAisles = mappedsections.getAisles();
        notifyDataSetChanged();
    }

    public void registerDataSetObserver(AisleDataSetObserver aisledatasetobserver)
    {
        super.registerDataSetObserver(aisledatasetobserver);
        mDataSetObservable.registerObserver(aisledatasetobserver);
    }

    public void setPinResource(int i)
    {
        mMarkerFactory.setPinResource(i);
    }

    public void setSelectedData(AisleSection aislesection)
    {
        AisleSection aislesection1;
        aislesection1 = mSelectedAisleSection;
        mSelectedAisleSection = aislesection;
        if (aislesection1 == null || aislesection1.equals(mSelectedAisleSection)) goto _L2; else goto _L1
_L1:
        if (mSelectedAisleSection == null) goto _L4; else goto _L3
_L3:
        notifyDataSetChanged(Arrays.asList(new AisleSection[] {
            aislesection1, mSelectedAisleSection
        }));
_L6:
        return;
_L4:
        notifyDataSetChanged(Collections.singletonList(aislesection1));
        return;
_L2:
        if (aislesection1 == null && mSelectedAisleSection != null)
        {
            notifyDataSetChanged(Collections.singletonList(mSelectedAisleSection));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void unregisterDataSetObserver(AisleDataSetObserver aisledatasetobserver)
    {
        super.unregisterDataSetObserver(aisledatasetobserver);
        mDataSetObservable.unregisterObserver(aisledatasetobserver);
    }
}
