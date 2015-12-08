// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.distiller;

import com.android.volley.ParseError;
import com.android.volley.VolleyError;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.distiller.model.a;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.distiller:
//            c, a

final class b
    implements l
{

    final l a;
    final c b;
    final com.google.android.apps.youtube.datalib.distiller.a c;

    b(com.google.android.apps.youtube.datalib.distiller.a a1, l l1, c c1)
    {
        c = a1;
        a = l1;
        b = c1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        a.a(volleyerror);
    }

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        try
        {
            a.a(new a(com.google.android.apps.youtube.datalib.distiller.c.a(b), ((JSONObject) (obj))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(new ParseError(((Throwable) (obj))));
        }
    }
}
