// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static final class mapReference
    implements Runnable
{

    final WeakReference mapReference;

    public void run()
    {
        MapMakerInternalMap mapmakerinternalmap = (MapMakerInternalMap)mapReference.get();
        if (mapmakerinternalmap == null)
        {
            throw new CancellationException();
        }
        mapReference amapreference[] = mapmakerinternalmap.segments;
        int j = amapreference.length;
        for (int i = 0; i < j; i++)
        {
            amapreference[i].nup();
        }

    }

    public (MapMakerInternalMap mapmakerinternalmap)
    {
        mapReference = new WeakReference(mapmakerinternalmap);
    }
}
