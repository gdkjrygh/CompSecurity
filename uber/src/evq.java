// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion;
import java.util.Iterator;
import java.util.List;

final class evq extends AsyncTask
{

    final evp a;

    evq(evp evp1)
    {
        a = evp1;
        super();
    }

    private transient evs a(ews aews[])
    {
        aews = aews[0];
        if (!aews.i())
        {
            ijg.c("Attempting to load region data from an unsuccessful event.", new Object[0]);
            return null;
        } else
        {
            return a.a(aews.a(), aews.b(), (GuidedPickupGeocodeRegion)aews.g());
        }
    }

    private void a(evs evs1)
    {
        if (evs1 != null)
        {
            Iterator iterator = evp.a(a).iterator();
            while (iterator.hasNext()) 
            {
                ((evr)iterator.next()).a(evs1.a(), evs1.b(), evs1.c());
            }
        }
    }

    public final Object doInBackground(Object aobj[])
    {
        return a((ews[])aobj);
    }

    public final void onPostExecute(Object obj)
    {
        a((evs)obj);
    }
}
