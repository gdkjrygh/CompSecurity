// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import android.content.Context;
import com.google.android.apps.ytremote.backend.model.Method;
import com.google.android.apps.ytremote.backend.model.a;
import com.google.android.apps.ytremote.fork.net.async.x;
import com.google.android.apps.ytremote.model.LoungeToken;
import com.google.android.apps.ytremote.util.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            c, a, u

public final class t
    implements c
{

    private final String a;
    private final int b = 80;
    private final String c;
    private final Context d;
    private final Map e;
    private final u f;

    public t(Context context, String s, int i, String s1, u u, Map map)
    {
        d = context;
        c = s;
        a = s1;
        f = u;
        e = map;
    }

    public final com.google.android.apps.ytremote.backend.browserchannel.a a(a a1)
    {
        HashMap hashmap = new HashMap();
        HashMap hashmap1 = new HashMap();
        if (a1.f())
        {
            hashmap.put("method", a1.b().toString());
            if (a1.g())
            {
                hashmap.put("params", com.google.android.apps.ytremote.util.b.a(a1.c()).toString());
            }
        }
        if (a1.i())
        {
            hashmap.put("ui", "");
        }
        if (a1.h())
        {
            hashmap1.put("X-YouTube-LoungeId-Token", a1.d().toString());
        }
        if (a1.e())
        {
            hashmap1.put("Authorization", a1.a());
        }
        return new com.google.android.apps.ytremote.backend.browserchannel.a(d, x.a(), c, b, a, f, hashmap, e, hashmap1);
    }
}
