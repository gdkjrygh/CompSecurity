// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;

import android.os.Handler;
import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.log.MeridianLogger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.arubanetworks.meridian.location:
//            MeridianLocationService, ClientLocationData

class b
    implements com.arubanetworks.meridian.requests.b
{

    final EditorKey a;
    final a b;
    final MeridianLocationService c;

    public void a(JSONObject jsonobject)
    {
        try
        {
            jsonobject = ClientLocationData.fromJSONObject(jsonobject, a);
            if (jsonobject.getBeaconPlacemarks() != null)
            {
                MeridianLocationService.a().d("Fetched %d beacons.", new Object[] {
                    Integer.valueOf(jsonobject.getBeaconPlacemarks().size())
                });
            }
            MeridianLocationService.a(c, jsonobject);
            b.a();
            MeridianLocationService.b(c, MeridianLocationService.c(c));
            MeridianLocationService.a(c, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            MeridianLocationService.a().w("Error parsing JSON for client location data", jsonobject);
        }
        MeridianLocationService.a(c, null);
    /* block-local class not found */
    class _cls1 {}

        (new Handler()).postDelayed(new _cls1(), b.b());
    }

    public void onResponse(Object obj)
    {
        a((JSONObject)obj);
    }

    _cls1(MeridianLocationService meridianlocationservice, EditorKey editorkey, _cls1 _pcls1)
    {
        c = meridianlocationservice;
        a = editorkey;
        b = _pcls1;
        super();
    }
}
