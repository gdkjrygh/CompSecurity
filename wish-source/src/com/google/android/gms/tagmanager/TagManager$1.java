// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            TagManager

class zzaFO
    implements 
{

    final TagManager zzaFO;

    public void zzE(Map map)
    {
        map = ((Map) (map.get("event")));
        if (map != null)
        {
            TagManager.zza(zzaFO, map.toString());
        }
    }

    (TagManager tagmanager)
    {
        zzaFO = tagmanager;
        super();
    }
}
