// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            at

final class av
    implements b
{

    final at a;

    av(at at1)
    {
        a = at1;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Could not fetch environment", exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Uri)obj;
        obj = (JSONObject)obj1;
        try
        {
            obj = ((JSONObject) (obj)).getJSONObject("environment");
            at.a(a, ((JSONObject) (obj)).getString("country"), ((JSONObject) (obj)).getLong("start_time"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            L.a("Could not fetch environment", ((Throwable) (obj)));
        }
    }
}
