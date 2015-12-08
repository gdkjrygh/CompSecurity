// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.facade;

import java.util.Comparator;
import org.json.JSONException;
import org.json.JSONObject;

public class DsxLocation
    implements Comparator
{
    public static class DsxLocationDoc
    {

        private final String address;
        private final String loc;
        private final String nickname;
        private final int position;
        private final String tag;

        public String getAddress()
        {
            return address;
        }

        public String getLoc()
        {
            return loc;
        }

        public String getNickname()
        {
            return nickname;
        }

        public int getPosition()
        {
            return position;
        }

        public String getTag()
        {
            return tag;
        }

        public DsxLocationDoc()
        {
            address = null;
            loc = "";
            nickname = null;
            position = 0;
            tag = null;
        }

        private DsxLocationDoc(String s, String s1, String s2, int i, String s3)
        {
            address = s;
            loc = s1;
            nickname = s2;
            position = i;
            tag = s3;
        }

    }


    public static final String ADDRESS = "address";
    public static final String LOCATION = "loc";
    public static final String NICKNAME = "nickname";
    public static final String POSITION = "position";
    public static final String TAG = "tag";
    private final DsxLocationDoc doc;
    private final String id;

    public DsxLocation()
    {
        id = null;
        doc = null;
    }

    public DsxLocation(String s, String s1, String s2, String s3, int i, String s4)
    {
        id = s;
        doc = new DsxLocationDoc(s1, s2, s3, i, s4);
    }

    public DsxLocation(JSONObject jsonobject)
        throws JSONException
    {
        id = null;
        doc = new DsxLocationDoc(jsonobject.getString("address"), jsonobject.getString("loc"), jsonobject.getString("nickname"), jsonobject.getInt("position"), jsonobject.getString("tag"));
    }

    public int compare(DsxLocation dsxlocation, DsxLocation dsxlocation1)
    {
        dsxlocation = dsxlocation.getDoc();
        dsxlocation1 = dsxlocation1.getDoc();
        if (dsxlocation != null && dsxlocation1 != null)
        {
            if (dsxlocation.getPosition() > dsxlocation1.getPosition())
            {
                return -1;
            }
            if (dsxlocation.getPosition() < dsxlocation1.getPosition())
            {
                return 1;
            }
        }
        return 0;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((DsxLocation)obj, (DsxLocation)obj1);
    }

    public DsxLocationDoc getDoc()
    {
        return doc;
    }

    public String getId()
    {
        return id;
    }

    public JSONObject toJSON()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.putOpt("nickname", doc.getNickname());
        jsonobject.putOpt("loc", doc.getLoc());
        jsonobject.putOpt("tag", doc.getTag());
        jsonobject.putOpt("address", doc.getAddress());
        jsonobject.put("position", doc.getPosition());
        return jsonobject;
    }
}
