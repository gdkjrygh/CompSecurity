// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.base.Preconditions;
import com.weather.util.geometry.LatLng;
import com.weather.util.parsing.ValidationException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.tropical:
//            StormData

private static final class type
{

    private final LatLng leftEndPoint;
    private final LatLng location;
    private final LatLng rightEndPoint;
    private final <init> type;

    private static type fromJSON(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        double d = jsonobject.getDouble("HPLat");
        double d1 = jsonobject.getDouble("HPLong");
        double d2 = jsonobject.getDouble("HPLatLftEndPnt");
        double d3 = jsonobject.getDouble("HPLongLftEndPnt");
        double d4 = jsonobject.getDouble("HPLatRghtEndPnt");
        double d5 = jsonobject.getDouble("HPLongRghtEndPnt");
        jsonobject = StormData.access$100(jsonobject.getString("HPCat"), "HPCat");
        return new <init>(new LatLng(Double.valueOf(d), Double.valueOf(d1)), new LatLng(Double.valueOf(d2), Double.valueOf(d3)), new LatLng(Double.valueOf(d4), Double.valueOf(d5)), jsonobject);
    }






    private (LatLng latlng, LatLng latlng1, LatLng latlng2,  )
    {
        location = (LatLng)Preconditions.checkNotNull(latlng);
        leftEndPoint = (LatLng)Preconditions.checkNotNull(latlng1);
        rightEndPoint = (LatLng)Preconditions.checkNotNull(latlng2);
        type = (type)Preconditions.checkNotNull();
    }
}
