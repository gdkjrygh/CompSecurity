// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.feature.geojson.model.Geometry;
import com.ubercab.rider.realtime.model.GeoJsonFeature;
import com.ubercab.rider.realtime.model.GeoJsonPoint;
import com.ubercab.rider.realtime.model.GeoJsonPolygon;
import java.util.Iterator;
import java.util.List;

public final class ecx
{

    private static int a(int i)
    {
        return i != 1 ? 0 : 1;
    }

    public static int a(Geometry geometry)
    {
        return geometry.getLngIndex();
    }

    public static UberLatLng a(UberLatLng uberlatlng, double d, float f)
    {
        gjz.a(uberlatlng);
        double d1 = Math.toRadians(f);
        double d2 = d / 1000D / 6371.0100000000002D;
        d = Math.sin(d2);
        double d3 = Math.cos(d2);
        double d5 = Math.toRadians(uberlatlng.a());
        d2 = Math.toRadians(uberlatlng.b());
        double d4 = Math.cos(d5);
        double d6 = Math.sin(d5);
        d5 = Math.asin(d6 * d3 + d4 * d * Math.cos(d1));
        d = Math.atan2(Math.sin(d1) * d * d4, d3 - Math.sin(d5) * d6);
        return new UberLatLng(Math.toDegrees(d5), Math.toDegrees(d + d2));
    }

    public static UberLatLng a(GeoJsonFeature geojsonfeature)
    {
        return a(((GeoJsonPoint)geojsonfeature.getGeometry()).getCoordinates(), geojsonfeature.getChirality());
    }

    private static UberLatLng a(GeoJsonPolygon geojsonpolygon, int i)
    {
        int k = b(i);
        int l = a(i);
        geojsonpolygon = (List)geojsonpolygon.getCoordinates().get(0);
        double d = 0.0D;
        i = 0;
        double d1 = 0.0D;
        double d2;
        double d3;
        for (d2 = 0.0D; i < geojsonpolygon.size(); d2 += d3)
        {
            int j = i + 1;
            if (j == geojsonpolygon.size())
            {
                j = 0;
            }
            List list = (List)geojsonpolygon.get(i);
            List list1 = (List)geojsonpolygon.get(j);
            double d4 = ((Double)list.get(l)).doubleValue();
            double d6 = ((Double)list.get(k)).doubleValue();
            double d5 = ((Double)list1.get(l)).doubleValue();
            double d7 = ((Double)list1.get(k)).doubleValue();
            d3 = d4 * d7 - d5 * d6;
            d = (d6 + d7) * d3 + d;
            i++;
            d1 = (d4 + d5) * d3 + d1;
        }

        d2 = 0.5D * d2;
        d1 /= 6D * d2;
        return new UberLatLng(d / (d2 * 6D), d1);
    }

    private static UberLatLng a(List list, int i)
    {
        return new UberLatLng(((Double)list.get(b(i))).doubleValue(), ((Double)list.get(a(i))).doubleValue());
    }

    public static GeoJsonFeature a(UberLatLng uberlatlng, List list)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        obj = obj2;
        if (list == null) goto _L2; else goto _L1
_L1:
        obj = obj2;
        if (list.isEmpty()) goto _L2; else goto _L3
_L3:
        if (uberlatlng != null) goto _L5; else goto _L4
_L4:
        obj = obj2;
_L2:
        return ((GeoJsonFeature) (obj));
_L5:
        double d = 1.7976931348623157E+308D;
        Iterator iterator = list.iterator();
        list = obj1;
        do
        {
            obj = list;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (GeoJsonFeature)iterator.next();
            double d1 = UberLatLng.a(uberlatlng, a(((GeoJsonPoint)((GeoJsonFeature) (obj)).getGeometry()).getCoordinates(), ((GeoJsonFeature) (obj)).getChirality()));
            if (d1 < d)
            {
                list = ((List) (obj));
                d = d1;
            }
        } while (true);
        if (true) goto _L2; else goto _L6
_L6:
    }

    private static boolean a(double d, double d1, GeoJsonPolygon geojsonpolygon, int i)
    {
        int k = b(i);
        int l = a(i);
        geojsonpolygon = (List)geojsonpolygon.getCoordinates().get(0);
        i = 0;
        int j = geojsonpolygon.size();
        boolean flag2 = false;
        j--;
        while (i < geojsonpolygon.size()) 
        {
            boolean flag;
            boolean flag1;
            if (((Double)((List)geojsonpolygon.get(i)).get(l)).doubleValue() > d1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (((Double)((List)geojsonpolygon.get(j)).get(l)).doubleValue() > d1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag != flag1 && d < ((((Double)((List)geojsonpolygon.get(j)).get(k)).doubleValue() - ((Double)((List)geojsonpolygon.get(i)).get(k)).doubleValue()) * (d1 - ((Double)((List)geojsonpolygon.get(i)).get(l)).doubleValue())) / (((Double)((List)geojsonpolygon.get(j)).get(l)).doubleValue() - ((Double)((List)geojsonpolygon.get(i)).get(l)).doubleValue()) + ((Double)((List)geojsonpolygon.get(i)).get(k)).doubleValue())
            {
                if (!flag2)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
            }
            j = i;
            i++;
        }
        return flag2;
    }

    public static boolean a(UberLatLng uberlatlng, GeoJsonFeature geojsonfeature)
    {
        return a(uberlatlng.a(), uberlatlng.b(), (GeoJsonPolygon)geojsonfeature.getGeometry(), geojsonfeature.getChirality());
    }

    private static int b(int i)
    {
        int j = 1;
        if (i == 1)
        {
            j = 0;
        }
        return j;
    }

    public static UberLatLng b(GeoJsonFeature geojsonfeature)
    {
        return a((GeoJsonPolygon)geojsonfeature.getGeometry(), geojsonfeature.getChirality());
    }
}
