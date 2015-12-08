// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.geodata.controller;

import android.util.Log;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.wsi.android.framework.wxdata.geodata.controller:
//            GeoFeature

public class GeoFeaturesPool
{

    protected String TAG;
    private List geoFeaturesPool;
    private int nextGeoFeatureIndex;

    public GeoFeaturesPool(int i)
    {
        TAG = getClass().getSimpleName();
        nextGeoFeatureIndex = -1;
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("GeoFeaturesPool: creating GEO features pool; size = ").append(i).toString());
        }
        geoFeaturesPool = new ArrayList(i);
        for (int j = 0; j < i; j++)
        {
            geoFeaturesPool.add(new GeoFeature());
        }

    }

    protected GeoFeature getGeoFeature()
    {
        this;
        JVM INSTR monitorenter ;
        GeoFeature geofeature;
        int i = nextGeoFeatureIndex + 1;
        nextGeoFeatureIndex = i;
        if (i == geoFeaturesPool.size())
        {
            geoFeaturesPool.add(new GeoFeature());
            if (ConfigInfo.DEBUG)
            {
                Log.d(TAG, (new StringBuilder()).append("getGeoFeature: increased GEO features pool size to ").append(geoFeaturesPool.size()).toString());
            }
        }
        geofeature = (GeoFeature)geoFeaturesPool.get(nextGeoFeatureIndex);
        this;
        JVM INSTR monitorexit ;
        return geofeature;
        Exception exception;
        exception;
        throw exception;
    }

    public GeoFeature getGeoFeature(String s, String s1, String s2)
    {
        GeoFeature geofeature = getGeoFeature();
        geofeature.setTitle(s);
        geofeature.setVersion(s1);
        geofeature.setHref(s2);
        return geofeature;
    }

    public GeoFeature getGeoFeature(String s, String s1, String s2, int i, int ai[], int ai1[], String s3, 
            String s4)
    {
        GeoFeature geofeature = getGeoFeature();
        geofeature.setHref(s);
        geofeature.setVersion(s1);
        geofeature.setExtension(s2);
        geofeature.setServerIndex(i);
        geofeature.setCacheModifiers(ai);
        geofeature.setIterations(ai1);
        geofeature.setCipher(s3);
        geofeature.setTesseraFeatureId(s4);
        return geofeature;
    }

    public void resetNextGeoFeatureIndex()
    {
        nextGeoFeatureIndex = -1;
    }
}
