// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;

import android.os.Binder;
import com.arubanetworks.meridian.editor.EditorKey;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.arubanetworks.meridian.location:
//            MeridianLocationService, MeridianLocation

public class a extends Binder
{

    final MeridianLocationService a;
    private final List b = new CopyOnWriteArrayList();

    private void a(MeridianLocation meridianlocation)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((r)iterator.next()).onLocationUpdate(meridianlocation)) { }
    }

    static void a(r.onLocationUpdate onlocationupdate, MeridianLocation meridianlocation)
    {
        onlocationupdate.a(meridianlocation);
    }

    static void a(a a1, Throwable throwable)
    {
        a1.a(throwable);
    }

    private void a(Throwable throwable)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((r)iterator.next()).onLocationError(throwable)) { }
    }

    public MeridianLocation getLastKnownLocation()
    {
        return MeridianLocationService.e(a);
    }

    public void registerListener(r r)
    {
        if (r != null)
        {
            b.add(r);
        }
    }

    public void setAppKey(EditorKey editorkey)
    {
        while (editorkey == MeridianLocationService.b(a) || MeridianLocationService.b(a) != null && editorkey != null && editorkey.getId().equals(MeridianLocationService.b(a).getId())) 
        {
            return;
        }
        MeridianLocationService.d(a);
        MeridianLocationService.a(a, null);
        MeridianLocationService.b(a, editorkey);
        MeridianLocationService.a(a, MeridianLocationService.b(a), MeridianLocationService.c(a));
    }

    public void unregisterListener(r r)
    {
        b.remove(r);
    }

    public r(MeridianLocationService meridianlocationservice)
    {
        a = meridianlocationservice;
        super();
    }
}
