// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.internal:
//            Z, ba, ax, aZ, 
//            ab, ay, v, q, 
//            av

final class aO extends Z
    implements ba
{

    public aO(String s, String s1, av av)
    {
        this(s, s1, av, ax.a);
    }

    private aO(String s, String s1, av av, ax ax1)
    {
        super(s, s1, av, ax1);
    }

    public final JSONObject a(aZ az)
    {
        Object obj2;
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("build_version", az.e);
        hashmap.put("display_version", az.d);
        hashmap.put("source", Integer.toString(az.f));
        if (az.g != null)
        {
            hashmap.put("icon_hash", az.g);
        }
        String s = az.c;
        if (!ab.e(s))
        {
            hashmap.put("instance", s);
        }
        obj2 = a(((Map) (hashmap)));
        Object obj;
        Object obj1;
        obj = obj2;
        obj1 = obj2;
        az = ((ay) (obj2)).a("X-CRASHLYTICS-API-KEY", az.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-D", az.b).a("X-CRASHLYTICS-API-CLIENT-VERSION", v.a().getVersion()).a("Accept", "application/json");
        obj = az;
        obj1 = az;
        v.a().b().a("Crashlytics", (new StringBuilder("Requesting settings from ")).append(a()).toString());
        obj = az;
        obj1 = az;
        v.a().b().a("Crashlytics", (new StringBuilder("Settings query params were: ")).append(hashmap).toString());
        obj = az;
        obj1 = az;
        obj2 = new JSONObject(az.c());
        if (az != null)
        {
            v.a().b().a("Crashlytics", (new StringBuilder("Settings request ID: ")).append(az.a("X-REQUEST-ID")).toString());
        }
        return ((JSONObject) (obj2));
        az;
        obj1 = null;
_L4:
        obj = obj1;
        v.a().b().a("Crashlytics", (new StringBuilder("Failed to retrieve settings from ")).append(a()).toString(), az);
        if (obj1 != null)
        {
            v.a().b().a("Crashlytics", (new StringBuilder("Settings request ID: ")).append(((ay) (obj1)).a("X-REQUEST-ID")).toString());
            return null;
        } else
        {
            return null;
        }
        az;
        obj = null;
_L2:
        if (obj != null)
        {
            v.a().b().a("Crashlytics", (new StringBuilder("Settings request ID: ")).append(((ay) (obj)).a("X-REQUEST-ID")).toString());
        }
        throw az;
        az;
        if (true) goto _L2; else goto _L1
_L1:
        az;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
