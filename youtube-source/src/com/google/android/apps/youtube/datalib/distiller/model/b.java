// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.distiller.model;

import com.google.android.apps.youtube.common.fromguava.c;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.distiller.model:
//            c, TopLevelComment

public class b extends com.google.android.apps.youtube.datalib.distiller.model.c
{

    private final String a;
    private final TopLevelComment b;

    public b(JSONObject jsonobject, TopLevelComment toplevelcomment)
    {
        super(jsonobject);
        b = (TopLevelComment)c.a(toplevelcomment);
        a = jsonobject.getString("id");
    }

    public final TopLevelComment a()
    {
        return b;
    }

    public final String b()
    {
        return a;
    }
}
