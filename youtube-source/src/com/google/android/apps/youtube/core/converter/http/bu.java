// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.datalib.legacy.model.MusicVideo;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            bj

public final class bu extends bj
{

    public bu()
    {
    }

    protected final Object a(JSONObject jsonobject)
    {
        if (jsonobject.has("id"))
        {
            return new MusicVideo(jsonobject.getString("id"), jsonobject.getJSONObject("artist").getString("id"), jsonobject.getJSONObject("artist").getString("name"), jsonobject.getString("name"), jsonobject.getInt("length"));
        } else
        {
            return null;
        }
    }
}
