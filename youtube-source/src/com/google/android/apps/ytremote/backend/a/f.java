// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import android.util.Log;
import com.google.android.apps.ytremote.model.LoungeToken;
import com.google.android.apps.ytremote.model.ScreenId;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.ytremote.backend.a:
//            e

final class f
{

    final e a;
    private final String b;

    public f(e e1, String s)
    {
        a = e1;
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
            break MISSING_BLOCK_LABEL_40;
        }
        return Collections.emptyMap();
        HashMap hashmap = new HashMap();
        int i = 0;
_L2:
        int j = jsonarray.length();
        Object obj;
        obj = hashmap;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        obj = jsonarray.getJSONObject(i);
        if (!((JSONObject) (obj)).has("screenId") || !((JSONObject) (obj)).has("loungeToken"))
        {
            break MISSING_BLOCK_LABEL_175;
        }
        try
        {
            hashmap.put(new ScreenId(((JSONObject) (obj)).getString("screenId")), new LoungeToken(((JSONObject) (obj)).getString("loungeToken")));
            break MISSING_BLOCK_LABEL_175;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            Log.w(e.a(), (new StringBuilder("Error parsing screen ")).append(i).toString());
            break MISSING_BLOCK_LABEL_175;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(e.a(), "Error parsing screen status ", ((Throwable) (obj)));
            obj = Collections.emptyMap();
        }
        return ((Map) (obj));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
