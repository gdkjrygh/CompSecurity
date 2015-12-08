// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.b;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.a.a.a.a.py;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.a.g;

public final class a
    implements g
{

    private final SharedPreferences a;

    public a(SharedPreferences sharedpreferences)
    {
        a = (SharedPreferences)c.a(sharedpreferences);
    }

    public final void a(py py1)
    {
        Object obj = py1.c;
        if (obj != null)
        {
            py1 = a.getString("csi_params_from_innertube", null);
            obj = Base64.encodeToString(com.google.protobuf.nano.c.a(((com.google.protobuf.nano.c) (obj))), 0);
            if (py1 == null || !py1.equals(obj))
            {
                a.edit().putString("csi_params_from_innertube", ((String) (obj))).apply();
            }
        }
    }
}
