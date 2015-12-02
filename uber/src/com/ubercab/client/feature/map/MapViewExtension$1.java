// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.map;

import eeo;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.map:
//            MapViewExtension

final class a
    implements Runnable
{

    final MapViewExtension a;

    public final void run()
    {
        for (Iterator iterator = MapViewExtension.a(a).iterator(); iterator.hasNext(); ((eeo)iterator.next()).s_()) { }
    }

    (MapViewExtension mapviewextension)
    {
        a = mapviewextension;
        super();
    }
}
