// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import android.util.Log;
import com.google.android.apps.ytremote.model.LoungeToken;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.ytremote.backend.a:
//            j

final class k
{

    final j a;
    private final String b;

    public k(j j1, String s)
    {
        a = j1;
        super();
        b = s;
    }

    public final Map a()
    {
        JSONArray jsonarray;
        JSONObject jsonobject = new JSONObject(b);
        if (!jsonobject.has("screens"))
        {
            return Collections.emptyMap();
        }
        jsonarray = jsonobject.getJSONArray("screens");
        if (jsonarray != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        return Collections.emptyMap();
        HashMap hashmap = new HashMap();
        int i = 0;
_L1:
        int l = jsonarray.length();
        Object obj;
        obj = hashmap;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        Boolean boolean1;
        JSONObject jsonobject1;
        String s;
        jsonobject1 = jsonarray.getJSONObject(i);
        s = jsonobject1.optString("status");
        boolean1 = Boolean.valueOf(false);
        obj = boolean1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj = boolean1;
        if ("online".equals(s))
        {
            obj = Boolean.valueOf(true);
        }
        if (jsonobject1.has("loungeToken"))
        {
            hashmap.put(new LoungeToken(jsonobject1.getString("loungeToken")), obj);
        }
_L2:
        i++;
          goto _L1
        obj;
        Log.w(j.a(), (new StringBuilder("Error parsing screen ")).append(i).toString());
          goto _L2
        obj;
        Log.e(j.a(), "Error parsing screen status ", ((Throwable) (obj)));
        obj = Collections.emptyMap();
        return ((Map) (obj));
    }
}
