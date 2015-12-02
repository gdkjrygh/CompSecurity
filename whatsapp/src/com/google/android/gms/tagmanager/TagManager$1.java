// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            TagManager

class atX
    implements atX
{

    final TagManager atX;

    public void C(Map map)
    {
        map = ((Map) (map.get("event")));
        if (map != null)
        {
            TagManager.a(atX, map.toString());
        }
    }

    (TagManager tagmanager)
    {
        atX = tagmanager;
        super();
    }
}
