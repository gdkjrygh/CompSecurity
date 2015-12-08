// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import com.android.volley.ParseError;
import com.android.volley.VolleyError;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment;
import com.google.android.apps.youtube.uilib.a.h;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            ac, f

final class ad
    implements l
{

    final TopLevelComment a;
    final ac b;

    ad(ac ac1, TopLevelComment toplevelcomment)
    {
        b = ac1;
        a = toplevelcomment;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        a.a(false);
        f.b(b.a).notifyDataSetChanged();
    }

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        try
        {
            a.a(((JSONObject) (obj)));
            f.j(b.a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((VolleyError) (new ParseError(((Throwable) (obj))))));
        }
        a.a(false);
        f.b(b.a).notifyDataSetChanged();
    }
}
