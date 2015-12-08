// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.maps;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.location.Location;
import android.net.Uri;
import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.internal.util.LocUtil;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MapInfo
{

    public static final int ZOOM_LEVEL_ATOM = 0x7fffffff;
    public static final int ZOOM_LEVEL_CONFERENCE_ROOM = 23;
    public static final int ZOOM_LEVEL_CUBICLE = 25;
    public static final int ZOOM_LEVEL_DEPARTMENT = 22;
    public static final int ZOOM_LEVEL_LARGE_BUILDING = 17;
    public static final int ZOOM_LEVEL_LARGE_CAMPUS = 14;
    public static final int ZOOM_LEVEL_LARGE_STORE = 19;
    public static final int ZOOM_LEVEL_MEDIUM_BUILDING = 18;
    public static final int ZOOM_LEVEL_MEDIUM_CAMPUS = 15;
    public static final int ZOOM_LEVEL_MEDIUM_STORE = 20;
    public static final int ZOOM_LEVEL_OFFICE = 24;
    public static final int ZOOM_LEVEL_SMALL_CAMPUS = 16;
    public static final int ZOOM_LEVEL_SMALL_STORE = 21;
    public static final int ZOOM_LEVEL_TOWN = 13;
    public static final int ZOOM_LEVEL_WORLD = 0;
    double a;
    double b;
    public double gpsMultiplier;
    public Matrix gpsTransform;
    public EditorKey groupKey;
    public String groupName;
    public double height;
    public double heightMeters;
    public Uri imageURI;
    public EditorKey key;
    public int level;
    public String levelLabel;
    public String name;
    public boolean outdoor;
    public EditorKey overviewKey;
    public Uri svgURI;
    public double unitsPerMeter;
    public double width;
    public double widthMeters;

    public MapInfo()
    {
        level = 0;
    }

    private void a(String s)
    {
        s = s.split(",");
        if (s.length < 8)
        {
            gpsTransform = new Matrix();
            gpsMultiplier = 1.0D;
            return;
        }
        width = Double.valueOf(s[6]).doubleValue();
        height = Double.valueOf(s[7]).doubleValue();
        double ad[] = new double[2];
        ad[0] = Location.convert(s[0]);
        ad[1] = Location.convert(s[1]);
        double ad1[] = new double[2];
        ad1[0] = Location.convert(s[2]);
        ad1[1] = Location.convert(s[3]);
        float af[] = new int[4];
        int i = 4;
        do
        {
            if (i >= 8)
            {
                break;
            }
            if (s[i].trim().length() <= 0)
            {
                gpsTransform = new Matrix();
                gpsMultiplier = 1.0D;
                System.err.format(Locale.US, "Error Proccessing GPS Reference Coords for %s\n", new Object[] {
                    levelLabel
                });
                return;
            }
            try
            {
                af[i - 4] = (int)Math.floor(Float.parseFloat(s[i].trim()));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                gpsTransform = new Matrix();
                gpsMultiplier = 1.0D;
                return;
            }
            i++;
        } while (true);
        float f = LocUtil.distOfPointPath(af);
        Location location = LocUtil.fromLatLon(ad[0], ad[1]);
        Location location1 = LocUtil.fromLatLon(ad[0] + 1.0D, ad[1]);
        float f1 = location.distanceTo(LocUtil.fromLatLon(ad[0], ad[1] + 1.0D));
        float f2 = location.distanceTo(location1);
        location = new float[1];
        Location.distanceBetween(ad[0], ad[1], ad1[0], ad1[1], location);
        unitsPerMeter = f / location[0];
        double d = f1 / f2;
        gpsMultiplier = d;
        gpsTransform = b(String.format(Locale.US, "%1.16e,%1.16e,%1.16e,%1.16e,%s,%s,%s,%s", new Object[] {
            Double.valueOf(ad[1] * d), Double.valueOf(-ad[0]), Double.valueOf(d * ad1[1]), Double.valueOf(-ad1[0]), s[4], s[5], s[6], s[7]
        }));
    }

    private static Matrix b(String s)
    {
        String as[] = s.split(",");
        s = new Matrix();
        if (as.length < 8)
        {
            return s;
        } else
        {
            PointF pointf1 = new PointF(Float.valueOf(as[0]).floatValue(), Float.valueOf(as[1]).floatValue());
            Object obj = new PointF(Float.valueOf(as[2]).floatValue(), Float.valueOf(as[3]).floatValue());
            PointF pointf = new PointF(Float.valueOf(as[4]).floatValue(), Float.valueOf(as[5]).floatValue());
            PointF pointf2 = new PointF(Float.valueOf(as[6]).floatValue(), Float.valueOf(as[7]).floatValue());
            obj = new PointF(((PointF) (obj)).x - pointf1.x, ((PointF) (obj)).y - pointf1.y);
            pointf2 = new PointF(pointf2.x - pointf.x, pointf2.y - pointf.y);
            float f = (float)Math.sqrt(Math.pow(((PointF) (obj)).x, 2D) + Math.pow(((PointF) (obj)).y, 2D));
            f = (float)Math.sqrt(Math.pow(pointf2.x, 2D) + Math.pow(pointf2.y, 2D)) / f;
            s.setScale(f, f);
            f = (float)Math.atan2(((PointF) (obj)).y, ((PointF) (obj)).x);
            float f1 = (float)Math.atan2(pointf2.y, pointf2.x);
            obj = new Matrix();
            ((Matrix) (obj)).setRotate((float)Math.toDegrees(f1 - f));
            s.postConcat(((Matrix) (obj)));
            f = pointf1.x;
            f1 = pointf1.y;
            float af[] = new float[2];
            s.mapPoints(af, new float[] {
                f, f1
            });
            af = new PointF(af[0], af[1]);
            obj = new Matrix();
            ((Matrix) (obj)).setTranslate(pointf.x - ((PointF) (af)).x, pointf.y - ((PointF) (af)).y);
            s.postConcat(((Matrix) (obj)));
            return s;
        }
    }

    public static MapInfo fromClientLocationDataJSON(JSONObject jsonobject, EditorKey editorkey)
        throws JSONException
    {
        MapInfo mapinfo = new MapInfo();
        mapinfo.key = new EditorKey(jsonobject.getString("id"), editorkey);
        mapinfo.a(jsonobject.optString("gps_ref_points"));
        return mapinfo;
    }

    public static List fromJSONArray(JSONArray jsonarray, EditorKey editorkey)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(fromJSONObject(jsonarray.getJSONObject(i), editorkey));
        }

        return arraylist;
    }

    public static MapInfo fromJSONObject(JSONObject jsonobject, EditorKey editorkey)
        throws JSONException
    {
        MapInfo mapinfo = new MapInfo();
        mapinfo.key = new EditorKey(jsonobject.getString("id"), editorkey);
        if (jsonobject.optString("group_id").length() > 0)
        {
            mapinfo.groupKey = new EditorKey(jsonobject.getString("group_id"), editorkey);
        }
        if (jsonobject.optString("overview_map_id").length() > 0)
        {
            mapinfo.overviewKey = new EditorKey(jsonobject.getString("overview_map_id"), editorkey);
        }
        if (jsonobject.optString("image_url").length() > 0)
        {
            mapinfo.imageURI = Uri.parse(jsonobject.getString("image_url"));
        }
        if (jsonobject.optString("svg_url").length() > 0)
        {
            mapinfo.svgURI = Uri.parse(jsonobject.getString("svg_url"));
        }
        mapinfo.name = jsonobject.getString("name");
        mapinfo.groupName = jsonobject.optString("group_name");
        mapinfo.level = jsonobject.optInt("level");
        mapinfo.levelLabel = jsonobject.optString("level_label");
        mapinfo.outdoor = jsonobject.optBoolean("is_outdoor");
        mapinfo.widthMeters = jsonobject.optDouble("width_meters", 0.0D);
        mapinfo.heightMeters = jsonobject.optDouble("height_meters", 0.0D);
        mapinfo.width = jsonobject.optDouble("width");
        mapinfo.height = jsonobject.optDouble("height");
        mapinfo.a = jsonobject.optDouble("zoom_scalar", 1.0D);
        mapinfo.b = jsonobject.optDouble("zoom_modifier", 1.0D);
        mapinfo.unitsPerMeter = jsonobject.optDouble("units_per_meter", 1.0D);
        if (jsonobject.has("gps_ref_points"))
        {
            mapinfo.a(jsonobject.optString("gps_ref_points"));
        }
        if ((mapinfo.widthMeters <= 0.10000000000000001D || mapinfo.heightMeters <= 0.10000000000000001D) && mapinfo.unitsPerMeter > 0.0D)
        {
            mapinfo.widthMeters = mapinfo.width / mapinfo.unitsPerMeter;
            mapinfo.heightMeters = mapinfo.height / mapinfo.unitsPerMeter;
        }
        return mapinfo;
    }

    double a(int i)
    {
        return 156412D / Math.pow(2D, i);
    }

    public PointF latLongToMapPoint(float f, float f1)
    {
        float af[] = new float[2];
        af[0] = (float)gpsMultiplier * f;
        af[1] = -f1;
        gpsTransform.mapPoints(af);
        return new PointF(af[0], af[1]);
    }

    public PointF mapPointLatLong(int i, int j)
    {
        float af[] = new float[2];
        af[0] = i;
        af[1] = j;
        Matrix matrix = new Matrix();
        gpsTransform.invert(matrix);
        matrix.mapPoints(af);
        return new PointF(-af[1], af[0] / (float)gpsMultiplier);
    }

    public double zoomScaleFromLevel(int i)
    {
        return widthMeters / a(i) / width;
    }
}
