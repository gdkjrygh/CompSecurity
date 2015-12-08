// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.util;

import com.google.android.apps.ytremote.backend.model.Params;
import com.google.android.apps.ytremote.backend.model.f;
import java.util.Iterator;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public class b
{

    private static final String a = com/google/android/apps/ytremote/util/b.getCanonicalName();
    private static final Logger b = Logger.getLogger(com/google/android/apps/ytremote/util/b.getCanonicalName());

    public b()
    {
    }

    public static JSONObject a(Params params)
    {
        JSONObject jsonobject = new JSONObject();
        for (Iterator iterator = params.iterator(); iterator.hasNext();)
        {
            f f1 = (f)iterator.next();
            try
            {
                jsonobject.put(f1.a, f1.b);
            }
            catch (JSONException jsonexception)
            {
                b.warning((new StringBuilder("Error converting ")).append(params).append(" to JSON ").append(jsonexception).toString());
            }
        }

        return jsonobject;
    }

}
