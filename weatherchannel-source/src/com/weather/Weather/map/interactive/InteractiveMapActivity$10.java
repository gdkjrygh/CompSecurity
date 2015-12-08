// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive;

import com.google.android.maps.GeoPoint;
import com.google.common.base.Objects;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.tropical.StormData;
import com.weather.commons.tropical.StormDataManager;
import com.weather.commons.tropical.Storms;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.geometry.LatLng;
import com.weather.util.geometry.LatLngBounds;
import com.wsi.android.framework.ui.map.GoogleGeoPoint;
import com.wsi.android.framework.ui.map.WSIMapView;
import com.wsi.android.weather.ui.LayerItem;
import com.wsi.android.weather.utils.settings.WSIMapAPI;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.Weather.map.interactive:
//            InteractiveMapActivity, RouteUtil, Layers, TwcActivityNavigationManager, 
//            BoundingBox

class this._cls0
    implements Runnable
{

    final InteractiveMapActivity this$0;

    public void run()
    {
        SavedLocation savedlocation;
        savedlocation = FlagshipApplication.getInstance().getLocationManager().getCurrentLocation();
        if (Objects.equal(savedlocation, InteractiveMapActivity.access$700(InteractiveMapActivity.this)))
        {
            return;
        }
        if (InteractiveMapActivity.access$300(InteractiveMapActivity.this) == null) goto _L2; else goto _L1
_L1:
        if (savedlocation == null) goto _L4; else goto _L3
_L3:
        GoogleGeoPoint googlegeopoint = new GoogleGeoPoint(savedlocation.getLatE6(), savedlocation.getLngE6());
        if (InteractiveMapActivity.access$700(InteractiveMapActivity.this) != null || !InteractiveMapActivity.access$800(InteractiveMapActivity.this)) goto _L6; else goto _L5
_L5:
        Object obj = InteractiveMapActivity.access$900(InteractiveMapActivity.this);
        Object obj3;
        List list;
        Iterator iterator1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = InteractiveMapActivity.access$1000(InteractiveMapActivity.this).getActiveStorms().getDataFor(((String) (obj)));
        }
        if (obj != null)
        {
            Object obj2 = ((StormData) (obj)).getStormBounds();
            obj = RouteUtil.calculateGeoPoint(((LatLngBounds) (obj2)).getCenter().latitude, ((LatLngBounds) (obj2)).getCenter().longitude);
            obj2 = RouteUtil.getLatLongBoundsBoundingBox(((LatLngBounds) (obj2)));
            RouteUtil.centerOnMapView(InteractiveMapActivity.access$300(InteractiveMapActivity.this), ((BoundingBox) (obj2)), 1.0F);
        } else
        {
            BoundingBox boundingbox = RouteUtil.getNoActiveStormRegion();
            obj = boundingbox.getCenterPoint();
            RouteUtil.centerOnMapView(InteractiveMapActivity.access$300(InteractiveMapActivity.this), boundingbox, 1.0F);
        }
        googlegeopoint = new GoogleGeoPoint(((GeoPoint) (obj)).getLatitudeE6(), ((GeoPoint) (obj)).getLongitudeE6());
        list = InteractiveMapActivity.access$1100(InteractiveMapActivity.this).getAvailableLayers();
        obj3 = null;
        iterator1 = list.iterator();
        do
        {
            obj = obj3;
            if (!iterator1.hasNext())
            {
                break;
            }
            obj = (LayerItem)iterator1.next();
            if (((LayerItem) (obj)).getId() != 105)
            {
                continue;
            }
            obj = ((LayerItem) (obj)).getName();
            break;
        } while (true);
        obj3 = obj;
        if (obj == null)
        {
            obj3 = Layers.getLayerForPoint(Layers.CLOUDS, googlegeopoint, list);
        }
        obj = obj3;
        if (obj3 == null)
        {
            obj = Layers.getDefaultLayer(googlegeopoint, list);
        }
        InteractiveMapActivity.access$1100(InteractiveMapActivity.this).setActiveLayer(((String) (obj)));
_L8:
        InteractiveMapActivity.access$300(InteractiveMapActivity.this).cleanUp();
_L4:
        ((TwcActivityNavigationManager)InteractiveMapActivity.access$1500(InteractiveMapActivity.this)).pokeMap();
_L2:
        InteractiveMapActivity.access$702(InteractiveMapActivity.this, savedlocation);
        return;
_L6:
        if (InteractiveMapActivity.access$700(InteractiveMapActivity.this) == null && InteractiveMapActivity.access$1200(InteractiveMapActivity.this))
        {
            Object obj1 = InteractiveMapActivity.access$1100(InteractiveMapActivity.this).getAvailableLayers();
            String s = null;
            Iterator iterator = ((List) (obj1)).iterator();
            do
            {
                obj1 = s;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj1 = (LayerItem)iterator.next();
                if (((LayerItem) (obj1)).getId() != 52)
                {
                    continue;
                }
                s = ((LayerItem) (obj1)).getName();
                obj1 = s;
                if (InteractiveMapActivity.access$1300(InteractiveMapActivity.this))
                {
                    InteractiveMapActivity.access$1400(InteractiveMapActivity.this);
                    obj1 = s;
                }
                break;
            } while (true);
            InteractiveMapActivity.access$300(InteractiveMapActivity.this).animateTo(googlegeopoint);
            InteractiveMapActivity.access$300(InteractiveMapActivity.this).setZoom(10);
            InteractiveMapActivity.access$1100(InteractiveMapActivity.this).setActiveLayer(((String) (obj1)));
            continue; /* Loop/switch isn't completed */
        }
        InteractiveMapActivity.access$300(InteractiveMapActivity.this).animateTo(googlegeopoint);
        InteractiveMapActivity.access$300(InteractiveMapActivity.this).setZoom(10);
        InteractiveMapActivity.access$1100(InteractiveMapActivity.this).setActiveLayer(Layers.getMatchingLayerForPoint(InteractiveMapActivity.access$1100(InteractiveMapActivity.this).getActiveLayer(), googlegeopoint, InteractiveMapActivity.access$1100(InteractiveMapActivity.this).getAvailableLayers()));
        if (true) goto _L8; else goto _L7
_L7:
    }

    er()
    {
        this$0 = InteractiveMapActivity.this;
        super();
    }
}
