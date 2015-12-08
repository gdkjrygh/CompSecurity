// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ar

public final class ai
{

    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final List e;
    public final String f;

    public ai(JSONObject jsonobject)
    {
        Object obj1 = null;
        super();
        b = jsonobject.getString("id");
        Object obj = jsonobject.getJSONArray("adapters");
        ArrayList arraylist = new ArrayList(((JSONArray) (obj)).length());
        for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
        {
            arraylist.add(((JSONArray) (obj)).getString(i));
        }

        c = Collections.unmodifiableList(arraylist);
        d = jsonobject.optString("allocation_id", null);
        e = ar.a(jsonobject, "imp_urls");
        obj = jsonobject.optJSONObject("ad");
        if (obj != null)
        {
            obj = ((JSONObject) (obj)).toString();
        } else
        {
            obj = null;
        }
        a = ((String) (obj));
        obj = jsonobject.optJSONObject("data");
        jsonobject = obj1;
        if (obj != null)
        {
            jsonobject = ((JSONObject) (obj)).toString();
        }
        f = jsonobject;
    }
}
