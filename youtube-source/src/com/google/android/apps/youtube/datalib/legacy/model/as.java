// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.util.Base64;
import com.google.android.apps.youtube.datalib.legacy.a.a;
import com.google.android.apps.youtube.datalib.legacy.a.b;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            Survey

public final class as extends b
{

    private Survey a;

    public as()
    {
    }

    public as(Survey survey)
    {
        a = survey;
    }

    public final int a()
    {
        return 2;
    }

    protected final a a(JSONObject jsonobject, int i)
    {
        if (i != 2)
        {
            throw new JSONException("Unsupported version");
        }
        try
        {
            jsonobject = new Survey((com.google.android.apps.youtube.a.a.a.b)c.a(new com.google.android.apps.youtube.a.a.a.b(), Base64.decode(jsonobject.getString("data_pb"), 0)), null);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder("Unable to parse proto: ")).append(jsonobject.getMessage()).toString());
        }
        return jsonobject;
    }

    protected final void a(JSONObject jsonobject)
    {
        jsonobject.put("data_pb", Base64.encodeToString(c.a(Survey.access$100(a)), 0));
    }
}
