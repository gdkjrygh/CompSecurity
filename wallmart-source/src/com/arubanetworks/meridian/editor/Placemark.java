// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.editor;

import android.graphics.Color;
import com.arubanetworks.meridian.internal.util.Polygon;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.arubanetworks.meridian.editor:
//            EditorKey

public class Placemark
    implements Serializable
{

    private static final long serialVersionUID = 0xff73ba3c68d4867cL;
    private EditorKey a;
    private EditorKey b;
    private String c;
    private String d;
    private String e;
    private float f;
    private float g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private short l;
    private short m;
    private Polygon n;

    public Placemark()
    {
        f = (0.0F / 0.0F);
        g = (0.0F / 0.0F);
        i = 0x7fffffff;
        j = 0;
    }

    public static Placemark fromClientLocationDataJSON(JSONObject jsonobject, EditorKey editorkey)
        throws JSONException
    {
        Placemark placemark = new Placemark();
        placemark.a = new EditorKey("-1", new EditorKey(jsonobject.getString("map_id"), editorkey));
        if (jsonobject.has("x"))
        {
            placemark.f = (float)jsonobject.getDouble("x");
        }
        if (jsonobject.has("y"))
        {
            placemark.g = (float)jsonobject.getDouble("y");
        }
        if (jsonobject.has("major"))
        {
            placemark.l = (short)jsonobject.getInt("major");
        }
        if (jsonobject.has("minor"))
        {
            placemark.m = (short)jsonobject.getInt("minor");
        }
        placemark.n = Polygon.fromCSVPoints(jsonobject.optString("area", null));
        return placemark;
    }

    public static List fromJSONArray(JSONArray jsonarray, EditorKey editorkey)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            arraylist.add(fromJSONObject(jsonarray.getJSONObject(i1), editorkey));
        }

        return arraylist;
    }

    public static Placemark fromJSONObject(JSONObject jsonobject, EditorKey editorkey)
        throws JSONException
    {
        Placemark placemark = new Placemark();
        placemark.a = new EditorKey(jsonobject.getString("id"), editorkey);
        placemark.d = jsonobject.optString("type", "");
        placemark.c = jsonobject.optString("name", "");
        placemark.e = jsonobject.optString("type_name", "");
        placemark.f = (float)jsonobject.optDouble("x", placemark.f);
        placemark.g = (float)jsonobject.optDouble("y", placemark.g);
        placemark.h = Color.parseColor((new StringBuilder()).append("#").append(jsonobject.optString("color", "88689e")).toString());
        placemark.k = jsonobject.optBoolean("hide_on_map", false);
        if (jsonobject.has("related_map_id"))
        {
            placemark.b = new EditorKey(jsonobject.getString("related_map_id"), editorkey.getParent());
        }
        return placemark;
    }

    public static Placemark fromJSONObjectAndAppKey(JSONObject jsonobject, EditorKey editorkey)
        throws JSONException
    {
        return fromJSONObject(jsonobject, EditorKey.forMap(jsonobject.optString("map_id"), editorkey.getId()));
    }

    public Polygon getArea()
    {
        return n;
    }

    public int getColor()
    {
        return h;
    }

    public EditorKey getKey()
    {
        return a;
    }

    public short getMajor()
    {
        return l;
    }

    public int getMaxZoomLevel()
    {
        return i;
    }

    public int getMinZoomLevel()
    {
        return j;
    }

    public short getMinor()
    {
        return m;
    }

    public String getName()
    {
        return c;
    }

    public EditorKey getRelatedMapKey()
    {
        return b;
    }

    public String getType()
    {
        return d;
    }

    public String getTypeName()
    {
        return e;
    }

    public float getX()
    {
        return f;
    }

    public float getY()
    {
        return g;
    }

    public boolean isHideOnMap()
    {
        return k;
    }

    public boolean isInvalid()
    {
        return a == null || a.getParent() == null || Float.isNaN(f) || Float.isNaN(g);
    }

    public String majorMinorString()
    {
        return String.format("%s/%s", new Object[] {
            Short.valueOf(l), Short.valueOf(m)
        });
    }

    public void setArea(Polygon polygon)
    {
        n = polygon;
    }

    public void setColor(int i1)
    {
        h = i1;
    }

    public void setHideOnMap(boolean flag)
    {
        k = flag;
    }

    public void setKey(EditorKey editorkey)
    {
        a = editorkey;
    }

    public void setMajor(short word0)
    {
        l = word0;
    }

    public void setMaxZoomLevel(int i1)
    {
        i = i1;
    }

    public void setMinZoomLevel(int i1)
    {
        j = i1;
    }

    public void setMinor(short word0)
    {
        m = word0;
    }

    public void setName(String s)
    {
        c = s;
    }

    public void setRelatedMapKey(EditorKey editorkey)
    {
        b = editorkey;
    }

    public void setType(String s)
    {
        d = s;
    }

    public void setTypeName(String s)
    {
        e = s;
    }

    public void setX(float f1)
    {
        f = f1;
    }

    public void setY(float f1)
    {
        g = f1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Placemark{key=").append(a).append(", relatedMapKey=").append(b).append(", name='").append(c).append('\'').append(", type='").append(d).append('\'').append(", typeName='").append(e).append('\'').append(", x=").append(f).append(", y=").append(g).append(", color=").append(h).append(", maxZoomLevel=").append(i).append(", minZoomLevel=").append(j).append(", hideOnMap=").append(k).append(", major=").append(l).append(", minor=").append(m).append(", area=").append(n).append('}').toString();
    }
}
