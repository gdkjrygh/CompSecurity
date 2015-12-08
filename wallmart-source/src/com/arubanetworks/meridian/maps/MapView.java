// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.maps;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.arubanetworks.meridian.Meridian;
import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.editor.Placemark;
import com.arubanetworks.meridian.internal.analytics.MeridianAnalytics;
import com.arubanetworks.meridian.internal.util.ColorUtil;
import com.arubanetworks.meridian.internal.util.Dev;
import com.arubanetworks.meridian.internal.util.Obj;
import com.arubanetworks.meridian.location.LocationProvider;
import com.arubanetworks.meridian.location.MeridianLocation;
import com.arubanetworks.meridian.location.MeridianLocationManager;
import com.arubanetworks.meridian.log.MeridianLogger;
import com.arubanetworks.meridian.maprender.BaseGLMapView;
import com.arubanetworks.meridian.maprender.GLMapViewListener;
import com.arubanetworks.meridian.maps.directions.DirectionsResponse;
import com.arubanetworks.meridian.maps.directions.Route;
import com.arubanetworks.meridian.maps.directions.RouteStep;
import com.arubanetworks.meridian.requests.MapImageRequest;
import com.arubanetworks.meridian.requests.MapInfoRequest;
import com.arubanetworks.meridian.requests.MeridianRequest;
import com.arubanetworks.meridian.requests.PlacemarksRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.arubanetworks.meridian.maps:
//            MapOptions, LocationTexture, AccuracyTexture, MapControls, 
//            MapInfo, Transaction, Marker, PlacemarkMarker

public class MapView extends FrameLayout
    implements com.arubanetworks.meridian.location.MeridianLocationManager.LocationUpdateListener, GLMapViewListener, MapControls.MapControlsListener, Marker.a, com.arubanetworks.meridian.maps.directions.Directions.DirectionsRequestListener
{

    public static final int REQUIRED_OPENGL_LEVEL = 2;
    private static final MeridianLogger c;
    private MeridianRequest A;
    private PlacemarksRequest B;
    private CountDownTimer C;
    private AtomicBoolean D;
    private AsyncTask E;
    private boolean F;
    private Marker G;
    private EditorKey H;
    private final Matrix a;
    private Handler b;
    private MapEventListener d;
    private DirectionsEventListener e;
    private MarkerEventListener f;
    private EditorKey g;
    private EditorKey h;
    private MapInfo i;
    private final List j;
    private final List k;
    private final List l;
    private boolean m;
    private File n;
    private Route o;
    private int p;
    private int q;
    private long r;
    private MeridianLocationManager s;
    private LocationTexture.State t;
    private Marker u;
    private final MapOptions v;
    private boolean w;
    private BaseGLMapView x;
    private MapControls y;
    private MapInfoRequest z;

    public MapView(Context context)
        throws OpenGLNotSupportedException
    {
        super(context);
        a = new Matrix();
        j = new ArrayList();
        k = new ArrayList();
        l = new ArrayList();
        m = true;
        p = -1;
        q = -1;
        r = 0L;
        t = LocationTexture.State.OLD;
        v = MapOptions.getDefaultOptions();
        w = true;
        D = new AtomicBoolean(false);
        a(context, ((AttributeSet) (null)));
    }

    public MapView(Context context, AttributeSet attributeset)
        throws OpenGLNotSupportedException
    {
        super(context, attributeset);
        a = new Matrix();
        j = new ArrayList();
        k = new ArrayList();
        l = new ArrayList();
        m = true;
        p = -1;
        q = -1;
        r = 0L;
        t = LocationTexture.State.OLD;
        v = MapOptions.getDefaultOptions();
        w = true;
        D = new AtomicBoolean(false);
        a(context, attributeset);
    }

    public MapView(Context context, AttributeSet attributeset, int i1)
        throws OpenGLNotSupportedException
    {
        super(context, attributeset, i1);
        a = new Matrix();
        j = new ArrayList();
        k = new ArrayList();
        l = new ArrayList();
        m = true;
        p = -1;
        q = -1;
        r = 0L;
        t = LocationTexture.State.OLD;
        v = MapOptions.getDefaultOptions();
        w = true;
        D = new AtomicBoolean(false);
        a(context, attributeset);
    }

    static MeridianLogger a()
    {
        return c;
    }

    private LocationTexture.State a(MeridianLocation meridianlocation)
    {
        if (meridianlocation == null || meridianlocation.getProvider() == null) goto _L2; else goto _L1
_L1:
    /* anonymous class not found */
    class _anm13 {}

        _cls13.a[meridianlocation.getProvider().getType().ordinal()];
        JVM INSTR tableswitch 1 4: default 56
    //                   1 60
    //                   2 64
    //                   3 68
    //                   4 72;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        return LocationTexture.State.OLD;
_L3:
        return LocationTexture.State.BLUETOOTH;
_L4:
        return LocationTexture.State.WIFI;
_L5:
        return LocationTexture.State.SIMULATED;
_L6:
        return LocationTexture.State.RTLS;
    }

    static LocationTexture.State a(MapView mapview, LocationTexture.State state)
    {
        mapview.t = state;
        return state;
    }

    static MapInfo a(MapView mapview, MapInfo mapinfo)
    {
        mapview.i = mapinfo;
        return mapinfo;
    }

    static Route a(MapView mapview)
    {
        return mapview.o;
    }

    static File a(MapView mapview, File file)
    {
        mapview.n = file;
        return file;
    }

    private void a(Context context, AttributeSet attributeset)
        throws OpenGLNotSupportedException
    {
        b = new Handler();
    /* block-local class not found */
    class OpenGLNotSupportedException {}

        if (Dev.getOpenGLMajorVersion(context) < 2)
        {
            throw new OpenGLNotSupportedException(Dev.getOpenGLMajorVersion(context));
        }
        if (isInEditMode())
        {
            return;
        }
        LayoutInflater.from(context).inflate(com.arubanetworks.meridian.R.layout.mr_map_view, this);
        x = (BaseGLMapView)findViewById(com.arubanetworks.meridian.R.id.mr_gl_map_view);
        if (getBackground() != null)
        {
            setBackgroundDrawable(getBackground());
        }
        c.d("Got the glMapView and its using %s", new Object[] {
            x.getClass().getName()
        });
        x.setListener(this);
        x.setLocation(null);
        x.setLocationMarker(new LocationTexture(context, t), new AccuracyTexture(context));
        v.fromAttributes(context, attributeset);
        y = (MapControls)findViewById(com.arubanetworks.meridian.R.id.mr_map_controls);
        y.setListener(this);
        y.setMapOptions(v);
    }

    static void a(MapView mapview, Throwable throwable)
    {
        mapview.a(throwable);
    }

    static void a(MapView mapview, List list)
    {
        mapview.a(list);
    }

    private void a(Marker marker)
    {
        if (u != null && u.equals(marker))
        {
            return;
        } else
        {
            u = marker;
            return;
        }
    }

    private void a(Route route, int i1)
    {
        if (route == null)
        {
            return;
        }
        long l1;
        if (i1 > 0)
        {
            l1 = Math.round(((i1 + 1) * 100) / route.getSteps().size());
        } else
        {
            l1 = 0L;
        }
        MeridianAnalytics.event("Directions", "End", null, Long.valueOf(l1));
    }

    private void a(Throwable throwable)
    {
        c.e("Map Load Error", throwable);
    /* block-local class not found */
    class MapEventListener {}

        if (d != null)
        {
            d.onMapLoadFail(throwable);
        }
    }

    private void a(List list)
    {
        c.d("Loaded %d placemarks", new Object[] {
            Integer.valueOf(list.size())
        });
        j.clear();
        j.addAll(list);
        D.set(true);
        if (d != null)
        {
            d.onPlacemarksLoadFinish();
        }
        if (E != null)
        {
            E.cancel(true);
        }
        if (j.size() <= 0)
        {
            b(new ArrayList());
            return;
        } else
        {
            E = new _cls20(getContext());
            E.execute(new Void[0]);
            return;
        }
    }

    private void a(boolean flag)
    {
        if (x == null || !flag && D.get())
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(k);
        arraylist.addAll(l);
        if (F && G != null && h.equals(H))
        {
            arraylist.add(G);
        }
        if (arraylist.size() > 0)
        {
            x.addTransaction((new Transaction.Builder()).addMarkers(arraylist).setAnimated(true).setListener(new _cls2()).build());
            return;
        } else
        {
            post(new _cls3());
            return;
        }
    }

    static RouteStep b(MapView mapview)
    {
        return mapview.getCurrentRouteStep();
    }

    private void b()
    {
        if (g == null)
        {
            throw new IllegalStateException("You must call MapView.setAppKey() with a valid app key before calling this method.");
        } else
        {
            return;
        }
    }

    static void b(MapView mapview, List list)
    {
        mapview.b(list);
    }

    private void b(List list)
    {
        k.clear();
        k.addAll(list);
        c.d("Placemarks Generated");
        a(true);
    }

    static MapControls c(MapView mapview)
    {
        return mapview.y;
    }

    private void c()
    {
        d();
        showLoadingIndicator(true);
        g();
        if (d != null)
        {
            d.onMapLoadStart();
        }
        z = (new com.arubanetworks.meridian.requests.MapInfoRequest.Builder()).setAppId(h.getParent().getId()).setMapId(h.getId()).setListener(new _cls12()).setErrorListener(new _cls1()).build();
        z.sendRequest();
    }

    private void d()
    {
        if (z != null)
        {
            z.cancel();
        }
        if (B != null)
        {
            B.cancel();
        }
        if (A != null)
        {
            A.cancel();
        }
        if (x != null)
        {
            x.setMap(null);
        }
        z = null;
        A = null;
        B = null;
        b.removeCallbacksAndMessages(null);
        showLoadingIndicator(false);
        h();
        i = null;
    }

    static void d(MapView mapview)
    {
        mapview.e();
    }

    private void e()
    {
        Object obj;
label0:
        {
label1:
            {
                com.arubanetworks.meridian.requests.MapImageRequest.Type type;
                String s1;
                if (i.svgURI != null)
                {
                    type = com.arubanetworks.meridian.requests.MapImageRequest.Type.SVG;
                } else
                {
                    type = com.arubanetworks.meridian.requests.MapImageRequest.Type.BITMAP;
                }
                if (i.svgURI != null)
                {
                    obj = i.svgURI.toString();
                } else
                {
                    obj = null;
                }
                s1 = ((String) (obj));
                if (obj == null)
                {
                    if (i.imageURI == null)
                    {
                        break label1;
                    }
                    s1 = i.imageURI.toString();
                }
                obj = new MapImageRequest(getContext(), s1, type, new _cls14(), new _cls15());
                if (!((MapImageRequest) (obj)).hasCache())
                {
                    break label0;
                }
                n = ((MapImageRequest) (obj)).getImageFile();
                c.d("Cached Map image in %s", new Object[] {
                    n.getAbsolutePath()
                });
                f();
            }
            return;
        }
        ((MapImageRequest) (obj)).buildRequest().sendRequest();
    }

    static void e(MapView mapview)
    {
        mapview.f();
    }

    static Matrix f(MapView mapview)
    {
        return mapview.a;
    }

    private void f()
    {
        b.removeCallbacksAndMessages(null);
        b.postDelayed(new _cls17(), 100L);
        if (m)
        {
            D.set(true);
            B = (new com.arubanetworks.meridian.requests.PlacemarksRequest.Builder()).setMapKey(h).setListener(new _cls19()).setErrorListener(new _cls18()).build();
            B.sendRequest();
        } else
        {
            if (d != null)
            {
                D.set(false);
                d.onPlacemarksLoadFinish();
                d.onMapRenderFinish();
            }
            c.d("Loading Map is finished.");
        }
        MeridianAnalytics.screen((new StringBuilder()).append("map/").append(h.getId()).append("/").append(i.name).toString());
    }

    static MapEventListener g(MapView mapview)
    {
        return mapview.d;
    }

    private void g()
    {
        h();
        x.setDirectionsPath(null);
        x.setMap(null);
        u = null;
    }

    private RouteStep getCurrentRouteStep()
    {
        Object obj = null;
        RouteStep routestep = obj;
        if (o != null)
        {
            routestep = obj;
            if (p >= 0)
            {
                routestep = obj;
                if (p < o.getSteps().size())
                {
                    routestep = (RouteStep)o.getSteps().get(p);
                }
            }
        }
        return routestep;
    }

    static MapInfo h(MapView mapview)
    {
        return mapview.i;
    }

    private void h()
    {
        j.clear();
        k.clear();
        l.clear();
        if (x != null)
        {
            x.clearMarkers();
        }
        if (E != null)
        {
            E.cancel(true);
            E = null;
        }
        D.set(false);
    }

    static BaseGLMapView i(MapView mapview)
    {
        return mapview.x;
    }

    private void i()
    {
        a(false);
    }

    public static boolean isAccessible(Context context)
    {
        return context.getSharedPreferences("Meridian.PreferencesFile", 0).getBoolean("Meridian.AccessiblePaths", false);
    }

    static File j(MapView mapview)
    {
        return mapview.n;
    }

    private void j()
    {
        if (x == null || o == null || p < 0 || p >= o.getSteps().size() || !((RouteStep)o.getSteps().get(p)).getMapKey().equals(h))
        {
            if (x != null)
            {
                x.setDirectionsPath(null);
            }
        } else
        {
            x.setDirectionsPath(o.getPointsFor(getMapKey()));
            int ai[] = o.getIndexesForStep((RouteStep)o.getSteps().get(p));
            if (ai != null)
            {
                c.d("Step Index (%d, %d)", new Object[] {
                    Integer.valueOf(ai[0]), Integer.valueOf(ai[1])
                });
                x.setDirectionsStep(ai[0], ai[1]);
                return;
            }
        }
    }

    private void k()
    {
        F = true;
        x.enableDebugMode();
        y.a(new _cls11());
    }

    static void k(MapView mapview)
    {
        mapview.j();
    }

    private void l()
    {
        F = false;
        x.disableDebugMode();
        y.a();
        u = null;
        i();
    }

    static void l(MapView mapview)
    {
        mapview.i();
    }

    static Handler m(MapView mapview)
    {
        return mapview.b;
    }

    static AtomicBoolean n(MapView mapview)
    {
        return mapview.D;
    }

    static List o(MapView mapview)
    {
        return mapview.j;
    }

    static MapOptions p(MapView mapview)
    {
        return mapview.v;
    }

    static MarkerEventListener q(MapView mapview)
    {
        return mapview.f;
    }

    static DirectionsEventListener r(MapView mapview)
    {
        return mapview.e;
    }

    static LocationTexture.State s(MapView mapview)
    {
        return mapview.t;
    }

    static void t(MapView mapview)
    {
        mapview.k();
    }

    static void u(MapView mapview)
    {
        mapview.l();
    }

    static Marker v(MapView mapview)
    {
        return mapview.G;
    }

    static EditorKey w(MapView mapview)
    {
        return mapview.H;
    }

    public void commitTransaction(Transaction transaction)
    {
        if (transaction.getMarkers() != null)
        {
            Marker amarker[] = transaction.getMarkers();
            int j1 = amarker.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                Marker marker = amarker[i1];
                if (transaction.getType() == Transaction.Type.REMOVE)
                {
                    if (l.contains(marker))
                    {
                        marker.b(this);
                        l.remove(marker);
                    }
                } else
                if (!l.contains(marker))
                {
                    l.add(marker);
                    marker.a(this);
                }
                i1++;
            }
        }
        if (x != null && i != null)
        {
            x.addTransaction(transaction);
        }
    }

    public List getAllMarkers()
    {
        ArrayList arraylist = new ArrayList(l.size() + k.size());
        arraylist.addAll(l);
        arraylist.addAll(k);
        return arraylist;
    }

    public EditorKey getAppKey()
    {
        return g;
    }

    public Matrix getCurrentScreenToMapTransform()
    {
        return a;
    }

    public MapInfo getMapInfo()
    {
        return i;
    }

    public EditorKey getMapKey()
    {
        return h;
    }

    public List getMarkers()
    {
        return new ArrayList(l);
    }

    public MapOptions getOptions()
    {
        return new MapOptions(v);
    }

    public List getPlacemarks()
    {
        return new ArrayList(j);
    }

    public Route getRoute()
    {
        return o;
    }

    public int getRouteStepIndex()
    {
        return p;
    }

    public MeridianLocation getUserLocation()
    {
        if (w && s != null)
        {
            return s.getLastLocation();
        } else
        {
            return null;
        }
    }

    public List getUserMarkers()
    {
        return new ArrayList(l);
    }

    public void onAccessibilityButtonClick()
    {
        if (getContext() == null || getResources() == null)
        {
            return;
        }
        boolean flag = getContext().getSharedPreferences("Meridian.PreferencesFile", 0).getBoolean("Meridian.AccessiblePaths", false);
        String s1;
        String s2;
        android.app.AlertDialog.Builder builder;
        _cls5 _lcls5;
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        s1 = getResources().getString(com.arubanetworks.meridian.R.string.mr_shortest_notice);
        s2 = getResources().getString(com.arubanetworks.meridian.R.string.mr_accessible_notice);
        builder = (new android.app.AlertDialog.Builder(getContext())).setPositiveButton(com.arubanetworks.meridian.R.string.mr_ok, null);
        _lcls5 = new _cls5(flag);
        builder.setSingleChoiceItems(new CharSequence[] {
            s1, s2
        }, i1, _lcls5).create().show();
    }

    public void onCalloutClick()
    {
    /* block-local class not found */
    class MarkerEventListener {}

        if (f != null)
        {
            f.onCalloutClick(u);
        }
    }

    public void onDirectionsButtonClick()
    {
    /* block-local class not found */
    class DirectionsEventListener {}

        if (e != null)
        {
            e.onDirectionsClick(u);
        }
    }

    public void onDirectionsRequestCanceled()
    {
        y.setLoading(false);
        a(o, p);
    }

    public void onDirectionsRequestComplete(DirectionsResponse directionsresponse)
    {
        y.setLoading(false);
        setRoute((Route)directionsresponse.getRoutes().get(0));
        if (e != null)
        {
            e.onDirectionsStart();
        }
    }

    public void onDirectionsRequestError(Throwable throwable)
    {
        c.e("Directions Error ", throwable);
        y.setLoading(false);
        if (e == null || !e.onDirectionsError(throwable))
        {
            Toast.makeText(getContext(), "Could not load directions", 0).show();
        }
    }

    public void onDirectionsRequestStart()
    {
        y.setLoading(true);
    }

    public void onDoubleTap(float f1, float f2)
    {
        x.zoomToPoint(new PointF(f1, f2));
    }

    public void onEnableBluetoothRequest()
    {
    }

    public void onEnableGPSRequest()
    {
    }

    public void onEnableWiFiRequest()
    {
    }

    public void onEndButtonClick()
    {
        a(o, p);
        if (e == null || !e.onDirectionsClosed())
        {
            setRoute(null);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        r = motionevent.getEventTime();
        return super.onInterceptTouchEvent(motionevent);
    }

    public void onLocationButtonClick()
    {
        c.v("onLocationButtonClick");
        if (!Dev.isLocationEnabled(getContext()))
        {
            (new android.app.AlertDialog.Builder(getContext())).setTitle(getResources().getString(com.arubanetworks.meridian.R.string.mr_location_disabled_dialog_title)).setMessage(getResources().getString(com.arubanetworks.meridian.R.string.mr_location_disabled_dialog_text)).setNegativeButton(getResources().getString(com.arubanetworks.meridian.R.string.mr_location_disabled_dialog_ignore_button), null).setPositiveButton(getResources().getString(com.arubanetworks.meridian.R.string.mr_location_disabled_dialog_settings_button), new _cls4()).show();
            return;
        }
        if (s != null && s.getLastLocation() != null)
        {
            if (s.getLastLocation().getMapKey().equals(h))
            {
                Object obj = s.getLastLocation().getPoint();
                double d1 = s.getLastLocation().getAccuracy();
                obj = new RectF((float)((double)((PointF) (obj)).x - d1), (float)((double)((PointF) (obj)).y - d1), (float)((double)((PointF) (obj)).x + d1), (float)(d1 + (double)((PointF) (obj)).y));
                x.zoomToRect(((RectF) (obj)), true);
                return;
            } else
            {
                setMapKey(s.getLastLocation().getMapKey());
                return;
            }
        }
        android.app.AlertDialog.Builder builder = (new android.app.AlertDialog.Builder(getContext())).setTitle(getResources().getString(com.arubanetworks.meridian.R.string.mr_location_no_location_dialog_title)).setPositiveButton(0x1040013, null);
        if (Dev.hasBLE(getContext()) && Dev.hasBLEPermission(getContext()) && !Dev.isBluetoothEnabled(getContext()))
        {
            builder.setMessage(getResources().getString(com.arubanetworks.meridian.R.string.mr_location_no_location_dialog_text_bluetooth));
        } else
        {
            builder.setMessage(getResources().getString(com.arubanetworks.meridian.R.string.mr_location_no_location_dialog_text_generic));
        }
        builder.show();
    }

    public void onLocationError(Throwable throwable)
    {
    }

    public void onLocationUpdate(MeridianLocation meridianlocation)
    {
        long l2 = 10000L;
        if (meridianlocation == null)
        {
            return;
        }
        c.d((new StringBuilder()).append("onLocationUpdate: ").append(meridianlocation).toString());
        if (o != null && i != null && Meridian.getShared().shouldAutoAdvanceRoutes())
        {
            Object obj;
            long l1;
            if (r > 0L)
            {
                l1 = SystemClock.uptimeMillis() - r;
            } else
            {
                l1 = 0x7fffffffffffffffL;
            }
            obj = o.getAutoAdvanceInfo(meridianlocation, i);
            meridianlocation.setPoint(((com.arubanetworks.meridian.maps.directions.Route.AutoAdvanceInfo) (obj)).getPoint());
            if (l1 > 10000L)
            {
                if (((com.arubanetworks.meridian.maps.directions.Route.AutoAdvanceInfo) (obj)).getShouldReroute().booleanValue())
                {
                    e.onDirectionsReroute();
                } else
                if (((com.arubanetworks.meridian.maps.directions.Route.AutoAdvanceInfo) (obj)).getAutoAdvanceIndex() != p)
                {
                    setRouteStepIndex(((com.arubanetworks.meridian.maps.directions.Route.AutoAdvanceInfo) (obj)).getAutoAdvanceIndex());
                }
            }
        }
        if (w && meridianlocation.getMapKey().equals(h))
        {
            l1 = l2;
            if (meridianlocation.getProvider() != null)
            {
                l1 = l2;
                if (meridianlocation.getProvider().getType() == com.arubanetworks.meridian.location.LocationProvider.ProviderType.RTLS_PROVIDER)
                {
                    l1 = 0x493e0L;
                }
            }
            if (C != null)
            {
                C.cancel();
            }
            C = new _cls6(l1, l1, meridianlocation);
            C.start();
            obj = a(meridianlocation);
            if (obj != t)
            {
                t = ((LocationTexture.State) (obj));
                x.setLocation(null);
                x.setLocationMarker(new LocationTexture(getContext(), t), new AccuracyTexture(getContext()));
            }
            x.setLocation(meridianlocation);
            return;
        } else
        {
            x.setLocation(null);
            return;
        }
    }

    public void onMapChange(MapInfo mapinfo)
    {
        setMapKey(mapinfo.key);
    }

    public void onMapClick()
    {
        if (f != null && u != null && f.onMarkerDeselect(u))
        {
            return;
        }
        if (F && u != null && G != null && u.equals(G))
        {
            y.hideDebugCallout();
        } else
        {
            y.setCalloutVisible(false, true);
        }
        u = null;
    }

    public void onMapFinishedLoading()
    {
        if (q >= 0)
        {
            setRouteStepIndex(q);
            q = -1;
        }
        if (s != null && s.getLastLocation() != null)
        {
            onLocationUpdate(s.getLastLocation());
        }
        if (d != null)
        {
            d.onMapLoadFinish();
        }
        c.d("Map is Rendered.");
    }

    public void onMapParsingError()
    {
        d();
        h();
        if (d != null)
        {
            d.onMapLoadFail(new Exception("Failed to Parse Map"));
        }
    }

    public void onMarkerClick(Marker marker)
    {
        if (!(marker instanceof PlacemarkMarker) || ((PlacemarkMarker)marker).getPlacemark().getKey() == null) goto _L2; else goto _L1
_L1:
        Placemark placemark = ((PlacemarkMarker)marker).getPlacemark();
        MeridianAnalytics.event("Annotation", "Select", (new StringBuilder()).append("placemark/").append(placemark.getKey().getId()).append("/").append(placemark.getName()).toString());
_L8:
        if (f == null || !f.onMarkerSelect(marker)) goto _L4; else goto _L3
_L3:
        a(marker);
_L6:
        return;
_L2:
        Throwable throwable;
        if (marker.equals(G))
        {
            MeridianAnalytics.event("Annotation", "Select", "userlocation");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            MeridianAnalytics.event("Annotation", "Select", (new StringBuilder()).append("custom/").append(marker.getName()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            c.e("Error submitting analytics event", throwable);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (o != null) goto _L6; else goto _L5
_L5:
        a(marker);
        if (u.equals(G))
        {
            y.showDebugCallout();
            return;
        }
        if (u.showsCallout())
        {
            y.setCalloutVisible(true, true, marker.getCalloutText(), true);
            return;
        }
        y.setCalloutVisible(false, true);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onMarkerInvalidated(Marker marker, boolean flag)
    {
        Transaction.Builder builder = (new Transaction.Builder()).addMarker(marker);
        if (flag)
        {
            marker = Transaction.Type.INVALIDATE;
        } else
        {
            marker = Transaction.Type.UPDATE;
        }
        commitTransaction(builder.setType(marker).setAnimated(false).build());
    }

    public void onOneFingerLongPress(float f1, float f2)
    {
        if (F)
        {
            G = new _cls10(f1, f2);
            G.setName("reported_location");
            H = h;
            i();
            u = G;
            y.showDebugCallout();
        }
    }

    public void onOverviewMapButtonClick()
    {
        if (i != null)
        {
            setMapKey(i.overviewKey);
        }
    }

    public void onPause()
    {
        if (s != null)
        {
            s.stopListeningForLocation();
        }
        if (x != null)
        {
            x.onPause();
        }
        if (C != null)
        {
            C.cancel();
        }
    }

    public void onPlacemarksTransactionComplete()
    {
        if (D.compareAndSet(true, false) && d != null)
        {
            c.d("Map and Placemarks are Rendered.");
            d.onMapRenderFinish();
        }
    }

    public void onResume()
    {
        if (s != null && w)
        {
            s.startListeningForLocation();
        }
        if (x != null)
        {
            x.onResume();
        }
        if (C != null && t != LocationTexture.State.OLD)
        {
            C.start();
        }
        if (o != null)
        {
            restoreRoute(o, p);
        }
    }

    public void onRouteOverviewButtonClick()
    {
        scrollToOverview();
    }

    public void onRouteStepChange(RouteStep routestep)
    {
        if (o != null && routestep != null)
        {
            setRouteStepIndex(o.getSteps().indexOf(routestep));
        }
    }

    public void onThreeFingerLongPress()
    {
        Object obj = (new android.app.AlertDialog.Builder(getContext())).setCancelable(true).setTitle("Meridian SDK").setMessage(String.format("Version %s", new Object[] {
            Meridian.getShared().getSDKVersion()
        }));
        if (!F)
        {
            ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(getResources().getString(com.arubanetworks.meridian.R.string.mr_debug_mode_enter), new _cls8());
        } else
        {
            ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(getResources().getString(com.arubanetworks.meridian.R.string.mr_debug_mode_exit), new _cls9());
        }
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        ((AlertDialog) (obj)).setCanceledOnTouchOutside(true);
        ((AlertDialog) (obj)).show();
    }

    public void onTransformUpdated(Matrix matrix)
    {
        a.set(matrix);
        if (d != null)
        {
            post(new _cls16());
        }
    }

    public void onTwoFingerLongPress()
    {
    }

    public void restoreRoute(Route route, int i1)
    {
        (new Handler()).postDelayed(new _cls7(route, i1), 100L);
    }

    public void scrollToOverview()
    {
        x.reCenter(true);
    }

    public void scrollToRect(RectF rectf)
    {
        scrollToRect(rectf, true);
    }

    public void scrollToRect(RectF rectf, float f1)
    {
        scrollToRect(rectf, f1, true);
    }

    public void scrollToRect(RectF rectf, float f1, boolean flag)
    {
        if (x == null)
        {
            return;
        } else
        {
            x.zoomToRect(rectf, f1, flag);
            return;
        }
    }

    public void scrollToRect(RectF rectf, boolean flag)
    {
        if (x == null)
        {
            return;
        } else
        {
            x.zoomToRect(rectf, flag);
            return;
        }
    }

    public void setAppKey(EditorKey editorkey)
    {
        if (g != null)
        {
            throw new IllegalArgumentException("You can only set appKey once in the lifetime of a MapView.");
        }
        g = editorkey;
        if (s != null)
        {
            s.stopListeningForLocation();
        }
        s = new MeridianLocationManager(getContext(), editorkey, this);
        MeridianAnalytics.setAppId(editorkey.getId());
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        int j1 = ColorUtil.getBackgroundColorFor(drawable);
        int i1 = j1;
        if (j1 == 0)
        {
            c.w("Only solod colors are supported as the MapView's background.");
            i1 = 0xff000000;
        }
        drawable = findViewById(com.arubanetworks.meridian.R.id.mr_progress_curtain);
        if (drawable != null)
        {
            drawable.setBackgroundColor(i1);
        }
        if (x != null)
        {
            x.setBackgroundColor(i1);
        }
        super.setBackgroundDrawable(new ColorDrawable(i1));
    }

    public void setDirectionsEventListener(DirectionsEventListener directionseventlistener)
    {
        e = directionseventlistener;
    }

    public void setMapEventListener(MapEventListener mapeventlistener)
    {
        d = mapeventlistener;
    }

    public void setMapKey(EditorKey editorkey)
    {
        b();
        if (editorkey == null)
        {
            d();
            h = null;
        } else
        if (!Obj.equals(h, editorkey))
        {
            if (!editorkey.getParent().equals(g))
            {
                throw new IllegalArgumentException("Parent of mapKey must be equal to MapView.getAppKey().");
            } else
            {
                h = editorkey;
                c();
                return;
            }
        }
    }

    public void setMarkerEventListener(MarkerEventListener markereventlistener)
    {
        f = markereventlistener;
    }

    public void setMarkers(Collection collection)
    {
        for (Iterator iterator = l.iterator(); iterator.hasNext(); ((Marker)iterator.next()).b(this)) { }
        l.clear();
        if (collection != null && !collection.isEmpty())
        {
            l.addAll(collection);
        }
        for (collection = l.iterator(); collection.hasNext(); ((Marker)collection.next()).a(this)) { }
        i();
    }

    public void setOptions(MapOptions mapoptions)
    {
        MapOptions mapoptions2 = v;
        MapOptions mapoptions1 = mapoptions;
        if (mapoptions == null)
        {
            mapoptions1 = MapOptions.getDefaultOptions();
        }
        mapoptions2.set(mapoptions1);
        if (y != null)
        {
            y.setMapOptions(v);
        }
    }

    public void setRoute(Route route)
    {
        setRoute(route, 0);
    }

    public void setRoute(Route route, int i1)
    {
        o = route;
        if (route != null)
        {
            setRouteStepIndex(i1);
            y.setCalloutVisible(false, true);
            y.setMap(i, route, getCurrentRouteStep());
            return;
        } else
        {
            y.setMap(i, null, null);
            j();
            return;
        }
    }

    public void setRouteStepIndex(int i1)
    {
        RouteStep routestep;
label0:
        {
            p = i1;
            if (i1 >= 0 && o != null && i1 < o.getSteps().size())
            {
                routestep = (RouteStep)o.getSteps().get(i1);
                if (e != null)
                {
                    e.onRouteStepIndexChange(i1);
                }
                if (h != null && h.equals(routestep.getMapKey()))
                {
                    break label0;
                }
                q = i1;
                setMapKey(routestep.getMapKey());
            }
            return;
        }
        y.setMap(i, o, routestep);
        j();
        float f1 = y.getDirectionsControlHeight();
        RectF rectf = new RectF(0.0F, f1, getWidth(), (float)getHeight() - f1);
        x.zoomSegmentToRect(routestep.getPathRect(), routestep.getHeading(), rectf, true);
    }

    public void setShowsPlacemarks(boolean flag)
    {
        m = flag;
    }

    public void setShowsUserLocation(boolean flag)
    {
        w = flag;
        if (!w && x != null)
        {
            x.setLocation(null);
        }
    }

    public void showLoadingIndicator(boolean flag)
    {
        FrameLayout framelayout = (FrameLayout)findViewById(com.arubanetworks.meridian.R.id.mr_progress_curtain);
        if (framelayout != null)
        {
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            framelayout.setVisibility(i1);
        }
    }

    public boolean showsPlacemarks()
    {
        return m;
    }

    public boolean showsUserLocation()
    {
        return w;
    }

    static 
    {
        c = MeridianLogger.forTag("MapView").andFeature(com.arubanetworks.meridian.log.MeridianLogger.Feature.MAPS);
    }

    /* member class not found */
    class _cls20 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls12 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls14 {}


    /* member class not found */
    class _cls15 {}


    /* member class not found */
    class _cls17 {}


    /* member class not found */
    class _cls19 {}


    /* member class not found */
    class _cls18 {}


    /* member class not found */
    class _cls11 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls10 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls16 {}


    /* member class not found */
    class _cls7 {}

}
