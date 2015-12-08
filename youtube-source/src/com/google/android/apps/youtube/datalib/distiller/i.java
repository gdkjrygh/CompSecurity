// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.distiller;

import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

public abstract class i
{

    public i()
    {
    }

    public abstract String a();

    public Map b()
    {
        return Collections.emptyMap();
    }

    protected abstract void c();

    public final JSONObject e()
    {
        c();
        return null;
    }
}
