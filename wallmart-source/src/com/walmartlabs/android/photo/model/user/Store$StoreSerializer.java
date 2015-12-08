// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.user;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.walmartlabs.android.photo.model.user:
//            Store

private static class 
{

    private static final String KEY_CITY = "city";
    private static final String KEY_ID = "id";
    private static final String KEY_LATITUDE = "latitude";
    private static final String KEY_LONGITUDE = "longitude";
    private static final String KEY_NAME = "name";
    private static final String KEY_PHONE = "phone";
    private static final String KEY_STATE = "state";
    private static final String KEY_STREET = "street";
    private static final String KEY_ZIP = "zip";

    public static String asJson(Store store)
        throws JSONException
    {
        return asJson(store, 0);
    }

    public static String asJson(Store store, int i)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("id", store.getId());
        jsonobject.put("name", store.getName());
        jsonobject.put("street", store.getStreet());
        jsonobject.put("city", store.getCity());
        jsonobject.put("state", store.getState());
        jsonobject.put("zip", store.getZip());
        jsonobject.put("phone", store.getPhone());
        jsonobject.put("latitude", store.getLatitude());
        jsonobject.put("longitude", store.getLongitude());
        if (i > 0)
        {
            return jsonobject.toString(i);
        } else
        {
            return jsonobject.toString();
        }
    }

    public static Store fromJson(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        Store store = new Store();
        store.setId(s.getString("id"));
        store.setName(s.getString("name"));
        store.setStreet(s.getString("street"));
        store.setCity(s.getString("city"));
        store.setState(s.getString("state"));
        store.setZip(s.getInt("zip"));
        store.setPhone(s.getString("phone"));
        store.setLatitude(s.getDouble("latitude"));
        store.setLongitude(s.getDouble("longitude"));
        return store;
    }

    private ()
    {
    }
}
