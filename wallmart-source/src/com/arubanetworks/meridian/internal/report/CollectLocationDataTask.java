// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.internal.report;

import android.graphics.PointF;
import android.os.AsyncTask;
import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.location.MeridianLocationManager;
import com.arubanetworks.meridian.log.MeridianLogger;
import com.arubanetworks.meridian.maps.MapView;
import com.arubanetworks.meridian.maps.Marker;
import com.squareup.otto.Bus;

// Referenced classes of package com.arubanetworks.meridian.internal.report:
//            ReportBus

public class CollectLocationDataTask extends AsyncTask
{

    private static final MeridianLogger a;
    private static final Integer b = Integer.valueOf(10000);
    private static final Integer c = Integer.valueOf(1000);
    private static final Integer d = Integer.valueOf(2);
    private static final Integer e = Integer.valueOf(3000);
    private MapView f;
    private Marker g;
    private EditorKey h;
    private Listener i;
    private boolean j;
    private Report.Meridian k;

    public CollectLocationDataTask(MapView mapview, Marker marker, EditorKey editorkey, Listener listener)
    {
        k = new Report.Meridian();
        f = mapview;
        g = marker;
        h = editorkey;
        i = listener;
    }

    static Listener a(CollectLocationDataTask collectlocationdatatask)
    {
        return collectlocationdatatask.i;
    }

    static Integer a()
    {
        return d;
    }

    static boolean a(CollectLocationDataTask collectlocationdatatask, boolean flag)
    {
        collectlocationdatatask.j = flag;
        return flag;
    }

    static Report.Meridian b(CollectLocationDataTask collectlocationdatatask)
    {
        return collectlocationdatatask.k;
    }

    static Integer b()
    {
        return e;
    }

    static Integer c()
    {
        return c;
    }

    protected transient Report.Meridian doInBackground(Void avoid[])
    {
        avoid = new MeridianLocationManager(f.getContext(), f.getAppKey(), new _cls2());
        avoid.startListeningForLocation();
        if (g != null)
        {
            Report.Meridian.a a1 = new Report.Meridian.a();
            a1.b = 0.0D;
            a1.c = h.getId();
            a1.d = new PointF(g.getPosition()[0], g.getPosition()[1]);
            k.a = a1;
        }
        while (!j) ;
        avoid.stopListeningForLocation();
        return null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Report.Meridian meridian)
    {
        ReportBus.getInstance().unregister(this);
    /* block-local class not found */
    class Listener {}

        if (i != null)
        {
            i.onResult(k);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Report.Meridian)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        ReportBus.getInstance().register(this);
        (new _cls1(b.intValue(), c.intValue())).start();
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((String[])aobj);
    }

    protected transient void onProgressUpdate(String as[])
    {
        super.onProgressUpdate(as);
        if (i != null && as != null)
        {
            i.onProgress(as[0]);
        }
    }

    public void onRawBeaconDataUpdate(ReportBus.RawBeaconsResult rawbeaconsresult)
    {
        Report.Meridian.b b1 = new Report.Meridian.b();
        b1.b = rawbeaconsresult.a;
        k.addRawBeacons(b1);
    }

    public void onVisibleBeaconDataUpdate(ReportBus.VisibleBeaconsResult visiblebeaconsresult)
    {
        Report.Meridian.c c1 = new Report.Meridian.c();
        c1.b = visiblebeaconsresult.a;
        c1.c = visiblebeaconsresult.b;
        k.addVisibleBeacons(c1);
    }

    static 
    {
        a = MeridianLogger.forTag("CollectLocationDataTask").andFeature(com.arubanetworks.meridian.log.MeridianLogger.Feature.DEBUG_REPORTS);
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
