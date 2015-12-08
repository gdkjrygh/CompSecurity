// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            TagManager

class zzaSw
    implements 
{

    final TagManager zzaSw;

    public void zzH(Map map)
    {
        map = ((Map) (map.get("event")));
        if (map != null)
        {
            TagManager.zza(zzaSw, map.toString());
        }
    }

    (TagManager tagmanager)
    {
        zzaSw = tagmanager;
        super();
    }
}
