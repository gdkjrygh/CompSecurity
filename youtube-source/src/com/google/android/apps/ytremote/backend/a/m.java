// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import android.util.Log;
import com.google.android.apps.ytremote.model.ClientName;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.LoungeToken;
import com.google.android.apps.ytremote.model.ScreenId;
import com.google.android.apps.ytremote.model.TemporaryAccessToken;
import org.json.JSONException;
import org.json.JSONObject;

class m
{

    private static final String a = com/google/android/apps/ytremote/backend/a/m.getCanonicalName();
    private final JSONObject b;

    public m(JSONObject jsonobject)
    {
        b = jsonobject;
    }

    public final CloudScreen a()
    {
        Object obj1;
        String s;
        if (b == null)
        {
            return null;
        }
        com.google.android.apps.ytremote.model.CloudScreen.AccessType accesstype;
        try
        {
            obj1 = b.optString("accessType", null);
        }
        catch (JSONException jsonexception)
        {
            Log.e(a, "Error parsing screen ", jsonexception);
            return null;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        accesstype = com.google.android.apps.ytremote.model.CloudScreen.AccessType.fromString(((String) (obj1)));
        s = b.optString("name", null);
        obj1 = b.getString("loungeToken");
        if (accesstype != com.google.android.apps.ytremote.model.CloudScreen.AccessType.PERMANENT) goto _L2; else goto _L1
_L1:
        if (b.has("screenId")) goto _L4; else goto _L3
_L3:
        Log.e(a, (new StringBuilder("We got a permanent screen without a screen id. ")).append(b).toString());
        return null;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        Log.e(a, (new StringBuilder("Unknown access type ")).append(((String) (obj1))).toString(), illegalargumentexception);
        return null;
_L4:
        Object obj;
        ScreenId screenid;
        screenid = new ScreenId(b.getString("screenId"));
        if (!b.has("loungeToken"))
        {
            break MISSING_BLOCK_LABEL_277;
        }
        obj = new LoungeToken(((String) (obj1)));
_L10:
        obj1 = b.optString("clientName", null);
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        obj1 = new ClientName(((String) (obj1)));
_L9:
        return new CloudScreen(screenid, s, ((ClientName) (obj1)), ((LoungeToken) (obj)));
_L2:
        if (b.has("loungeToken")) goto _L8; else goto _L7
_L7:
        Log.e(a, (new StringBuilder("We got a temporary screen without a loungeToken. ")).append(b).toString());
        return null;
_L8:
        obj = new CloudScreen(new TemporaryAccessToken(((String) (obj1))), s);
        return ((CloudScreen) (obj));
_L6:
        obj1 = null;
          goto _L9
        obj = null;
          goto _L10
        return null;
    }

}
