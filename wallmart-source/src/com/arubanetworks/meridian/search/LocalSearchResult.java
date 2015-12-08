// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.search;

import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.editor.Placemark;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class LocalSearchResult
    implements Serializable
{

    private static final long serialVersionUID = 0xfebf27af3be2ed54L;
    private Placemark a;
    private double b;
    private long c;

    private LocalSearchResult()
    {
    }

    public static LocalSearchResult fromJSONObject(JSONObject jsonobject, EditorKey editorkey)
        throws JSONException
    {
        LocalSearchResult localsearchresult = new LocalSearchResult();
        localsearchresult.b = jsonobject.optDouble("distance", 0.0D);
        localsearchresult.c = (long)(jsonobject.optDouble("time", 0.0D) * 1000D);
        localsearchresult.a = Placemark.fromJSONObject(jsonobject, new EditorKey(jsonobject.getString("map_id"), editorkey));
        return localsearchresult;
    }

    public double getDistance()
    {
        return b;
    }

    public Placemark getPlacemark()
    {
        return a;
    }

    public long getTime()
    {
        return c;
    }
}
