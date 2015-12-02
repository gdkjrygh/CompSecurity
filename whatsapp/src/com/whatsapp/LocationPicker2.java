// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.whatsapp.fieldstats.ak;
import com.whatsapp.fieldstats.bo;
import com.whatsapp.fieldstats.u;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.a5;
import com.whatsapp.util.b2;
import com.whatsapp.util.r;
import java.io.File;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, PlaceInfo, a1g, _8, 
//            ady, th, cg, App, 
//            t3, a_2, a8q, asw, 
//            ft, GoogleMapView2, iz, vx, 
//            uo, g_, v9, cn, 
//            a8b, rh, a9j, a_4, 
//            abl, ma, a1w

public class LocationPicker2 extends DialogToastActivity
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, LocationListener
{

    private static final LocationRequest W;
    private static long ab;
    private static final String bb[];
    private t3 A;
    private b2 B;
    private PlaceInfo C;
    private float D;
    private ProgressBar E;
    private int F;
    private long G;
    private Handler H;
    private float I;
    private View J;
    private a_2 K;
    private TextView L;
    private View M;
    private HandlerThread N;
    private a1w O;
    private String P;
    private GoogleApiClient Q;
    private bo R;
    private boolean S;
    private int T;
    private Bitmap U;
    private boolean V;
    private BitmapDescriptor X;
    private int Y;
    private View Z;
    private boolean aa;
    private TextView ac;
    private GoogleMapView2 j;
    private Button k;
    private boolean l;
    private BitmapDescriptor m;
    private ImageView n;
    private a8q o;
    private Bitmap p;
    private Handler q;
    private ListView r;
    private PlaceInfo s;
    private GoogleMap t;
    private Runnable u;
    private View v;
    private View w;
    private Location x;
    private ProgressBar y;
    private TextView z;

    public LocationPicker2()
    {
        Y = -1;
        V = true;
        s = new PlaceInfo();
        R = bo.DID_NOT_REQUEST;
        F = 1;
    }

    static ImageView A(LocationPicker2 locationpicker2)
    {
        return locationpicker2.n;
    }

    static int a(LocationPicker2 locationpicker2, int i1)
    {
        locationpicker2.F = i1;
        return i1;
    }

    static long a(long l1)
    {
        ab = l1;
        return l1;
    }

    static Bitmap a(Context context, int i1)
    {
        int j1 = context.getResources().getDimensionPixelSize(0x7f0a0043);
        float f1 = context.getResources().getDimension(0x7f0a0044);
        int k1 = j1 / 2 - (int)f1;
        int l1 = j1 / 2;
        int i2 = j1 / 2 + (int)FloatMath.ceil(f1);
        context = Bitmap.createBitmap(j1, (int)FloatMath.ceil(f1) * 2 + j1, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(context);
        BlurMaskFilter blurmaskfilter = new BlurMaskFilter(f1, android.graphics.BlurMaskFilter.Blur.NORMAL);
        Paint paint = new Paint(1);
        paint.setColor(0xff999999);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setMaskFilter(blurmaskfilter);
        canvas.translate(0.0F, f1);
        canvas.drawCircle(l1, i2, k1, paint);
        canvas.translate(0.0F, -f1);
        paint.setMaskFilter(null);
        paint.setStrokeWidth(a1g.a().g);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(0x66000000);
        canvas.drawCircle(l1, i2, k1, paint);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(i1);
        canvas.drawCircle(l1, i2, k1, paint);
        return context;
    }

    static Location a(LocationPicker2 locationpicker2, Location location)
    {
        locationpicker2.x = location;
        return location;
    }

    static PlaceInfo a(LocationPicker2 locationpicker2, PlaceInfo placeinfo)
    {
        locationpicker2.C = placeinfo;
        return placeinfo;
    }

    static a1w a(LocationPicker2 locationpicker2, a1w a1w)
    {
        locationpicker2.O = a1w;
        return a1w;
    }

    static bo a(LocationPicker2 locationpicker2, bo bo1)
    {
        locationpicker2.R = bo1;
        return bo1;
    }

    static t3 a(LocationPicker2 locationpicker2)
    {
        return locationpicker2.A;
    }

    static t3 a(LocationPicker2 locationpicker2, t3 t3_1)
    {
        locationpicker2.A = t3_1;
        return t3_1;
    }

    private void a()
    {
label0:
        {
            t.setTrafficEnabled(true);
            t.setIndoorEnabled(true);
            t.setMyLocationEnabled(true);
            t.getUiSettings().setMyLocationButtonEnabled(false);
            t.setOnMarkerClickListener(new _8(this));
            t.setOnInfoWindowClickListener(new ady(this));
            t.setOnMapClickListener(new th(this));
            t.setOnCameraChangeListener(new cg(this));
            if (A != null)
            {
                f();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            SharedPreferences sharedpreferences = getSharedPreferences(bb[12], 0);
            LatLng latlng = new LatLng(sharedpreferences.getFloat(bb[15], 37.3898F), sharedpreferences.getFloat(bb[13], -122.0814F));
            t.moveCamera(CameraUpdateFactory.newLatLng(latlng));
            t.moveCamera(CameraUpdateFactory.zoomTo(sharedpreferences.getFloat(bb[14], 18F) - 0.2F));
        }
    }

    private void a(Location location, int i1, String s1, boolean flag)
    {
        q.removeCallbacks(u);
        E.setVisibility(0);
        if (v.getVisibility() != 0)
        {
            y.setVisibility(0);
        }
        findViewById(0x7f0b0226).setVisibility(8);
        if (t != null)
        {
            t.clear();
        }
        C = null;
        r.removeFooterView(ac);
        A = new t3();
        K.notifyDataSetChanged();
        R = bo.CANCEL;
        o = new a8q(this, location, i1, s1, flag);
        asw.a(o, new Void[0]);
    }

    static void a(LocationPicker2 locationpicker2, Location location, int i1, String s1, boolean flag)
    {
        locationpicker2.a(location, i1, s1, flag);
    }

    static void a(LocationPicker2 locationpicker2, ak ak1)
    {
        locationpicker2.a(ak1);
    }

    static void a(LocationPicker2 locationpicker2, ak ak1, int i1)
    {
        locationpicker2.a(ak1, i1);
    }

    private void a(ak ak1)
    {
        a(ak1, 0);
    }

    private void a(ak ak1, int i1)
    {
        int j1;
        long l1;
        l1 = 0L;
        j1 = App.am;
        if (G > 0L)
        {
            l1 = Math.max(0L, System.currentTimeMillis() - G);
        }
        F;
        JVM INSTR tableswitch 1 2: default 56
    //                   1 105
    //                   2 114;
           goto _L1 _L2 _L3
_L1:
        u u1 = u.FACEBOOK;
_L4:
        bo bo1 = R;
        boolean flag1 = l;
        boolean flag;
        if (v.getVisibility() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ft.a(this, u1, ak1, bo1, flag1, flag, T, i1, l1);
        return;
_L2:
        u1 = u.GOOGLE;
        if (j1 == 0) goto _L4; else goto _L3
_L3:
        u1 = u.FOURSQUARE;
        if (j1 == 0) goto _L4; else goto _L1
    }

    static boolean a(LocationPicker2 locationpicker2, boolean flag)
    {
        locationpicker2.S = flag;
        return flag;
    }

    private int b()
    {
        Location location = e();
        VisibleRegion visibleregion = t.getProjection().getVisibleRegion();
        Location location1 = new Location("");
        location1.setLatitude((visibleregion.nearLeft.latitude + visibleregion.nearRight.latitude) / 2D);
        location1.setLongitude((visibleregion.nearLeft.longitude + visibleregion.nearRight.longitude) / 2D);
        return (int)location.distanceTo(location1);
    }

    static int b(LocationPicker2 locationpicker2, int i1)
    {
        locationpicker2.T = i1;
        return i1;
    }

    static GoogleMapView2 b(LocationPicker2 locationpicker2)
    {
        return locationpicker2.j;
    }

    static boolean b(LocationPicker2 locationpicker2, boolean flag)
    {
        locationpicker2.l = flag;
        return flag;
    }

    static int c(LocationPicker2 locationpicker2)
    {
        return locationpicker2.F;
    }

    static long c()
    {
        return ab;
    }

    static boolean c(LocationPicker2 locationpicker2, boolean flag)
    {
        locationpicker2.V = flag;
        return flag;
    }

    static Location d(LocationPicker2 locationpicker2)
    {
        return locationpicker2.e();
    }

    private void d()
    {
        if (t == null)
        {
            t = j.getMap();
            if (t != null)
            {
                a();
            }
        }
    }

    private Location e()
    {
        LatLng latlng = t.getCameraPosition().target;
        Location location = new Location("");
        location.setLatitude(latlng.latitude);
        location.setLongitude(latlng.longitude);
        return location;
    }

    static ProgressBar e(LocationPicker2 locationpicker2)
    {
        return locationpicker2.E;
    }

    static BitmapDescriptor f(LocationPicker2 locationpicker2)
    {
        return locationpicker2.X;
    }

    private void f()
    {
        int i1 = App.am;
        t.clear();
        Iterator iterator = A.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PlaceInfo placeinfo = (PlaceInfo)iterator.next();
            MarkerOptions markeroptions = (new MarkerOptions()).position(new LatLng(placeinfo.lat, placeinfo.lon));
            if (!TextUtils.isEmpty(placeinfo.name))
            {
                markeroptions.title(placeinfo.name);
            }
            if (!TextUtils.isEmpty(placeinfo.vicinity))
            {
                markeroptions.snippet(placeinfo.vicinity);
            }
            markeroptions.icon(X);
            markeroptions.anchor(0.5F, 0.5F);
            placeinfo.tag = t.addMarker(markeroptions);
        } while (i1 == 0);
        (new MarkerOptions()).position(t.getCameraPosition().target).title(getString(0x7f0e0379));
    }

    static a_2 g(LocationPicker2 locationpicker2)
    {
        return locationpicker2.K;
    }

    private void g()
    {
        String s1;
        if (A != null && !A.isEmpty())
        {
            if (A.d == 2)
            {
                s1 = getString(0x7f0e0225, new Object[] {
                    bb[11]
                });
            } else
            {
                s1 = A.a;
            }
        } else
        {
            s1 = null;
        }
        r.removeFooterView(ac);
        if (s1 != null)
        {
            ac.setText(Html.fromHtml(s1));
            r.addFooterView(ac, null, true);
        }
    }

    static TextView h(LocationPicker2 locationpicker2)
    {
        return locationpicker2.L;
    }

    static PlaceInfo i(LocationPicker2 locationpicker2)
    {
        return locationpicker2.C;
    }

    static Bitmap j(LocationPicker2 locationpicker2)
    {
        return locationpicker2.p;
    }

    static Location k(LocationPicker2 locationpicker2)
    {
        return locationpicker2.x;
    }

    static a1w l(LocationPicker2 locationpicker2)
    {
        return locationpicker2.O;
    }

    static Handler m(LocationPicker2 locationpicker2)
    {
        return locationpicker2.H;
    }

    static TextView n(LocationPicker2 locationpicker2)
    {
        return locationpicker2.z;
    }

    static void o(LocationPicker2 locationpicker2)
    {
        locationpicker2.f();
    }

    static String p(LocationPicker2 locationpicker2)
    {
        return locationpicker2.P;
    }

    static b2 q(LocationPicker2 locationpicker2)
    {
        return locationpicker2.B;
    }

    static View r(LocationPicker2 locationpicker2)
    {
        return locationpicker2.Z;
    }

    static void s(LocationPicker2 locationpicker2)
    {
        locationpicker2.g();
    }

    static BitmapDescriptor t(LocationPicker2 locationpicker2)
    {
        return locationpicker2.m;
    }

    static int u(LocationPicker2 locationpicker2)
    {
        return locationpicker2.b();
    }

    static ProgressBar v(LocationPicker2 locationpicker2)
    {
        return locationpicker2.y;
    }

    static PlaceInfo w(LocationPicker2 locationpicker2)
    {
        return locationpicker2.s;
    }

    static View x(LocationPicker2 locationpicker2)
    {
        return locationpicker2.v;
    }

    static GoogleMap y(LocationPicker2 locationpicker2)
    {
        return locationpicker2.t;
    }

    static ListView z(LocationPicker2 locationpicker2)
    {
        return locationpicker2.r;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        int i1 = App.am;
        if (v.getVisibility() != 8) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 52
    //                   0 58
    //                   1 250
    //                   2 86
    //                   3 250;
           goto _L2 _L3 _L4 _L5 _L4
_L2:
        return super.dispatchTouchEvent(motionevent);
_L3:
        if (aa)
        {
            continue; /* Loop/switch isn't completed */
        }
        D = motionevent.getX();
        I = motionevent.getY();
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        if (aa)
        {
            continue; /* Loop/switch isn't completed */
        }
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        float f3 = D;
        float f4 = D;
        float f5 = I;
        if ((f1 - f4) * (f1 - f3) + (f2 - I) * (f2 - f5) > a1g.a().g * 6F)
        {
            aa = true;
            J.setVisibility(0);
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, J.getHeight(), 0.0F);
            translateanimation.setInterpolator(new DecelerateInterpolator());
            translateanimation.setDuration(120L);
            w.startAnimation(translateanimation);
            if (z.getVisibility() == 0)
            {
                z.startAnimation(translateanimation);
            }
            Z.setVisibility(0);
        }
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        D = 0.0F;
        I = 0.0F;
        if (aa)
        {
            aa = false;
            J.setVisibility(8);
            TranslateAnimation translateanimation1 = new TranslateAnimation(0.0F, 0.0F, -J.getHeight(), 0.0F);
            translateanimation1.setInterpolator(new DecelerateInterpolator());
            translateanimation1.setDuration(120L);
            w.startAnimation(translateanimation1);
            if (z.getVisibility() == 0)
            {
                z.startAnimation(translateanimation1);
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void onBackPressed()
    {
        a(ak.CANCEL);
        super.onBackPressed();
    }

    public void onConnected(Bundle bundle)
    {
        LocationServices.FusedLocationApi.requestLocationUpdates(Q, W, this);
        x = LocationServices.FusedLocationApi.getLastLocation(Q);
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    public void onConnectionSuspended(int i1)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        int i1;
label0:
        {
            int j1 = App.am;
            super.onCreate(bundle);
            Log.i(bb[21]);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            if (!WhatsAppLibLoader.a(null))
            {
                Log.i(bb[25]);
                finish();
                return;
            }
            if (App.Z == null)
            {
                finish();
                return;
            }
            Object obj = App.k();
            if (obj != null && ((String) (obj)).length() > 1)
            {
                if ((((String) (obj)).charAt(((String) (obj)).length() - 2) - 48) % 2 == 1)
                {
                    i1 = 1;
                } else
                {
                    i1 = 2;
                }
                F = i1;
            }
            if (App.l == 3)
            {
                F = 3;
            }
            Q = (new com.google.android.gms.common.api.GoogleApiClient.Builder(this)).addApi(LocationServices.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
            P = getIntent().getStringExtra(bb[16]);
            A = (t3)getLastNonConfigurationInstance();
            setContentView(iz.a(getLayoutInflater(), 0x7f030079, null, false));
            L = (TextView)findViewById(0x7f0b0224);
            a1g.a(L);
            Z = findViewById(0x7f0b021a);
            w = findViewById(0x7f0b021e);
            w.setOnClickListener(new vx(this));
            J = findViewById(0x7f0b021f);
            M = findViewById(0x7f0b021b);
            z = (TextView)findViewById(0x7f0b021d);
            z.setText(Html.fromHtml((new StringBuilder()).append(bb[19]).append(getString(0x7f0e0379)).append(bb[17]).toString()));
            z.setOnClickListener(new uo(this));
            v = findViewById(0x7f0b0223);
            MapsInitializer.initialize(this);
            U = a(this, 0xff00c853);
            X = BitmapDescriptorFactory.fromBitmap(U);
            p = a(this, 0xfff44336);
            m = BitmapDescriptorFactory.fromBitmap(p);
            obj = new GoogleMapOptions();
            ((GoogleMapOptions) (obj)).mapType(1).mapToolbarEnabled(false).zoomControlsEnabled(false).zoomGesturesEnabled(true).compassEnabled(false).rotateGesturesEnabled(true).tiltGesturesEnabled(true);
            j = new _cls3(this, ((GoogleMapOptions) (obj)));
            ((ViewGroup)findViewById(0x7f0b0204)).addView(j);
            j.onCreate(bundle);
            d();
            q = new Handler();
            u = new g_(this);
            if (A == null)
            {
                q.postDelayed(u, 15000L);
                if (j1 == 0)
                {
                    break label0;
                }
            }
            if (!TextUtils.isEmpty(A.h))
            {
                L.setText(getString(0x7f0e02ea, new Object[] {
                    A.h
                }));
                if (j1 == 0)
                {
                    break label0;
                }
            }
            L.setText(0x7f0e02e8);
        }
        k = (Button)findViewById(0x7f0b0222);
        k.setText(Html.fromHtml((new StringBuilder()).append(bb[26]).append(getString(0x7f0e037a)).append(bb[22]).toString()));
        k.setOnClickListener(new v9(this));
        K = new a_2(this, this);
        r = (ListView)findViewById(0x7f0b0225);
        ac = new TextView(this);
        ac.setMovementMethod(LinkMovementMethod.getInstance());
        ac.setGravity(17);
        ac.setPadding((int)a1g.a().k, 0, (int)a1g.a().k, 0);
        r.setFooterDividersEnabled(true);
        r.addFooterView(ac, null, true);
        r.setAdapter(K);
        g();
        r.setOnItemClickListener(new cn(this));
        E = (ProgressBar)findViewById(0x7f0b019c);
        obj = E;
        if (A == null)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((ProgressBar) (obj)).setVisibility(i1);
        y = (ProgressBar)findViewById(0x7f0b0220);
        if (App.l == 3)
        {
            k.setOnLongClickListener(new a8b(this));
        }
        if (bundle == null)
        {
            bundle = (LocationManager)getSystemService(bb[24]);
            if (!bundle.isProviderEnabled(bb[20]) && !bundle.isProviderEnabled(bb[23]))
            {
                showDialog(2);
            }
        }
        bundle = (ImageView)findViewById(0x7f0b0221);
        bundle.setOnClickListener(new rh(this, bundle));
        n = (ImageView)findViewById(0x7f0b0205);
        n.setOnClickListener(new a9j(this));
        bundle = new File(App.au.getCacheDir(), bb[27]);
        bundle.mkdirs();
        B = (new r(bundle)).a((int)(a1g.a().g * 48F)).a();
        N = new HandlerThread(bb[18]);
        N.start();
        H = new Handler(N.getLooper());
    }

    public Dialog onCreateDialog(int i1)
    {
        a_4 a_4_1;
        switch (i1)
        {
        default:
            return super.onCreateDialog(i1);

        case 2: // '\002'
            a_4_1 = new a_4(this);
            break;
        }
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e01a9).setMessage(0x7f0e01a8).setCancelable(true).setPositiveButton(0x7f0e02ba, a_4_1).create();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0, 0, 0x7f0e0366).setIcon(0x7f020517).setShowAsAction(2);
        menu.add(0, 1, 0, 0x7f0e030f).setIcon(0x7f020515).setShowAsAction(1);
        if (com.whatsapp.App.u == 3)
        {
            a5.b(this);
        }
        return true;
    }

    protected void onDestroy()
    {
        j.onDestroy();
        if (q != null)
        {
            q.removeCallbacks(u);
        }
        if (o != null)
        {
            o.cancel(true);
            o = null;
        }
        if (t != null)
        {
            android.content.SharedPreferences.Editor editor = getSharedPreferences(bb[8], 0).edit();
            CameraPosition cameraposition = t.getCameraPosition();
            editor.putFloat(bb[9], (float)cameraposition.target.latitude);
            editor.putFloat(bb[7], (float)cameraposition.target.longitude);
            editor.putFloat(bb[10], cameraposition.zoom);
            editor.commit();
        }
        B.a();
        N.quit();
        super.onDestroy();
    }

    public void onLocationChanged(Location location)
    {
label0:
        {
            int i1;
            int j1;
label1:
            {
                j1 = App.am;
                if (location == null)
                {
                    break label0;
                }
                if (x == null && t != null)
                {
                    t.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(location.getLatitude(), location.getLongitude())));
                }
                x = location;
                if (location.hasAccuracy())
                {
                    i1 = Math.max(1, (int)location.getAccuracy());
                    if (j1 == 0)
                    {
                        break label1;
                    }
                }
                i1 = -1;
            }
label2:
            {
                if (i1 == Y)
                {
                    break label2;
                }
                Y = i1;
                if (i1 > 0)
                {
                    String s1 = String.format(App.j.a(0x7f0d0013, i1), new Object[] {
                        Integer.valueOf(i1)
                    });
                    k.setText(Html.fromHtml((new StringBuilder()).append(bb[3]).append(getString(0x7f0e037a)).append(bb[5]).append(s1).append(bb[2]).toString()));
                    if (j1 == 0)
                    {
                        break label2;
                    }
                }
                k.setText(Html.fromHtml((new StringBuilder()).append(bb[6]).append(getString(0x7f0e037a)).append(bb[4]).toString()));
            }
            boolean flag;
            if (A != null && A.l != null && V && location.getAccuracy() < 200F && A.l.distanceTo(location) > 1000F)
            {
                V = false;
                flag = true;
            } else
            {
                flag = false;
            }
            x = location;
            if ((A == null || flag) && (location.getAccuracy() < 200F && location.getTime() + 60000L > System.currentTimeMillis() || S))
            {
                runOnUiThread(new ma(this, flag));
            }
        }
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        j.onLowMemory();
    }

    public void onNewIntent(Intent intent)
    {
        if (bb[0].equals(intent.getAction()))
        {
            intent = intent.getStringExtra(bb[1]);
            a(e(), Math.max(b(), 1500), intent, true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 0: // '\0'
            onSearchRequested();
            return true;

        case 1: // '\001'
            V = false;
            a(e(), b(), null, false);
            return true;

        case 16908332: 
            a(ak.CANCEL);
            break;
        }
        finish();
        return true;
    }

    protected void onPause()
    {
        j.onPause();
        j.b();
        if (Q != null && Q.isConnected())
        {
            Q.disconnect();
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        j.onResume();
        j.c();
        d();
        Q.connect();
        G = System.currentTimeMillis();
    }

    public Object onRetainNonConfigurationInstance()
    {
        return A;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        j.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested()
    {
        Object obj = (ViewGroup)findViewById(0x7f0b017c);
        if (obj != null)
        {
            ((ViewGroup) (obj)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(((ViewGroup) (obj)).getWidth(), ((ViewGroup) (obj)).getHeight()));
        }
        if (A == null)
        {
            obj = null;
        } else
        {
            obj = A.h;
        }
        startSearch(((String) (obj)), true, null, false);
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[28];
        obj = "o)h3Cg#\"(Bz\"b5\002o$x(C`i_\004m\\\004D";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "\1772i3U";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "2h\177,Mb+2";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "2%2";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "2hn\177";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "2hn\177\020l5#\177\020}*m-@0";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "2%2";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "}/m3IQ+c\"Mz.c/sb(b";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "m(ao[f&x2M~7S1^k!i3I`$i2";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "}/m3IQ+c\"Mz.c/sb&x";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "}/m3IQ+c\"Mz.c/st(c,";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "2&,)^k!1fDz3|2\026!hj.Y|4}4M|\"\"\"Cch+\177Ja2~2]{&~$\020!&2";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                obj = "m(ao[f&x2M~7S1^k!i3I`$i2";
                byte0 = 11;
                i1 = 12;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "}/m3IQ+c\"Mz.c/sb(b";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                obj = "}/m3IQ+c\"Mz.c/st(c,";
                byte0 = 13;
                i1 = 14;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "}/m3IQ+c\"Mz.c/sb&x";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "d.h";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "2hn\177";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "I\"c\002Cj\"";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "2%2";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "i7\177";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "b(o Xg(b1Em,i3\003m5i Xk";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "2hn\177";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "`\"x6C|,";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "b(o Xg(b";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "o%c3Xg)kaH{\",5C.)m5Ex\",-El5m3Ek4,,E}4e/K";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "2%2";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "^+m\"I}";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                bb = as;
                ab = 0L;
                W = LocationRequest.create().setInterval(5000L).setFastestInterval(16L).setPriority(100);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 724
    //                   0 747
    //                   1 754
    //                   2 761
    //                   3 768;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_768;
_L3:
        byte byte1 = 44;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 14;
          goto _L9
_L5:
        byte1 = 71;
          goto _L9
_L6:
        byte1 = 12;
          goto _L9
        byte1 = 65;
          goto _L9
    }

    private class _cls3 extends GoogleMapView2
    {

        final LocationPicker2 n;

        public void a(int i1)
        {
            int j1 = App.am;
            i1;
            JVM INSTR tableswitch 0 2: default 32
        //                       0 33
        //                       1 49
        //                       2 65;
               goto _L1 _L2 _L3 _L4
_L1:
            return;
_L2:
            LocationPicker2.A(n).setImageResource(0x7f0200c0);
            if (j1 == 0) goto _L1; else goto _L3
_L3:
            LocationPicker2.A(n).setImageResource(0x7f0200bd);
            if (j1 == 0) goto _L1; else goto _L4
_L4:
            LocationPicker2.A(n).setImageResource(0x7f0200e1);
            return;
        }

        _cls3(Context context, GoogleMapOptions googlemapoptions)
        {
            n = LocationPicker2.this;
            super(context, googlemapoptions);
        }
    }

}
