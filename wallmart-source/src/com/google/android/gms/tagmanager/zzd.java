// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzax

class zzd
    implements DataLayer.zzb
{

    private final Context context;

    public zzd(Context context1)
    {
        context = context1;
    }

    public void zzH(Map map)
    {
        Object obj = map.get("gtm.url");
        if (obj != null) goto _L2; else goto _L1
_L1:
        map = ((Map) (map.get("gtm")));
        if (map == null || !(map instanceof Map)) goto _L2; else goto _L3
_L3:
        map = ((Map) (((Map)map).get("url")));
_L8:
        if (map != null && (map instanceof String)) goto _L5; else goto _L4
_L4:
        return;
_L5:
        if ((map = Uri.parse((String)map).getQueryParameter("referrer")) == null) goto _L4; else goto _L6
_L6:
        zzax.zzl(context, map);
        return;
_L2:
        map = ((Map) (obj));
        if (true) goto _L8; else goto _L7
_L7:
    }
}
