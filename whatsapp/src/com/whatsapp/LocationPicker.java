// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockMapActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.google.android.maps.MyLocationOverlay;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.a5;
import com.whatsapp.util.b2;
import com.whatsapp.util.r;
import java.io.File;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            o2, t3, afc, bs, 
//            asw, App, iz, GoogleMapView, 
//            asx, atm, af8, h8, 
//            a8d, a1g, f2, d4, 
//            ad6, no, PlaceInfo

public class LocationPicker extends SherlockMapActivity
    implements o2
{

    private static long g;
    private static boolean l;
    private static final String z[];
    private Button a;
    private String b;
    private t3 c;
    private afc d;
    private TextView e;
    private boolean f;
    private ListView h;
    private PlaceInfo i;
    private MyLocationOverlay j;
    private GoogleMapView k;
    private b2 m;
    private ProgressBar n;
    private boolean o;
    private TextView p;
    private bs q;
    private h8 r;
    private Handler s;
    private Runnable t;
    private Location u;

    public LocationPicker()
    {
        f = true;
    }

    static long a()
    {
        return g;
    }

    static long a(long l1)
    {
        g = l1;
        return l1;
    }

    static Location a(LocationPicker locationpicker, Location location)
    {
        locationpicker.u = location;
        return location;
    }

    static PlaceInfo a(LocationPicker locationpicker, PlaceInfo placeinfo)
    {
        locationpicker.i = placeinfo;
        return placeinfo;
    }

    static t3 a(LocationPicker locationpicker, t3 t3_1)
    {
        locationpicker.c = t3_1;
        return t3_1;
    }

    static String a(LocationPicker locationpicker)
    {
        return locationpicker.b;
    }

    private void a(Location location, int i1, String s1, boolean flag)
    {
        s.removeCallbacks(t);
        n.setVisibility(0);
        findViewById(0x7f0b0226).setVisibility(8);
        h.removeFooterView(e);
        c = new t3();
        d.notifyDataSetChanged();
        q = new bs(this, location, i1, s1, flag);
        asw.a(q, new Void[0]);
    }

    static void a(LocationPicker locationpicker, Location location, int i1, String s1, boolean flag)
    {
        locationpicker.a(location, i1, s1, flag);
    }

    static boolean a(LocationPicker locationpicker, boolean flag)
    {
        locationpicker.o = flag;
        return flag;
    }

    static boolean a(boolean flag)
    {
        l = flag;
        return flag;
    }

    static GoogleMapView b(LocationPicker locationpicker)
    {
        return locationpicker.k;
    }

    static boolean b()
    {
        return l;
    }

    static boolean b(LocationPicker locationpicker, boolean flag)
    {
        locationpicker.f = flag;
        return flag;
    }

    private void c()
    {
        String s1;
        if (c != null)
        {
            if (c.d == 2)
            {
                s1 = getString(0x7f0e0225, new Object[] {
                    z[0]
                });
            } else
            {
                s1 = c.a;
            }
        } else
        {
            s1 = null;
        }
        h.removeFooterView(e);
        if (s1 != null)
        {
            e.setText(Html.fromHtml(s1));
            h.addFooterView(e, null, true);
        }
    }

    static boolean c(LocationPicker locationpicker)
    {
        return locationpicker.f;
    }

    static TextView d(LocationPicker locationpicker)
    {
        return locationpicker.p;
    }

    static b2 e(LocationPicker locationpicker)
    {
        return locationpicker.m;
    }

    static Button f(LocationPicker locationpicker)
    {
        return locationpicker.a;
    }

    static afc g(LocationPicker locationpicker)
    {
        return locationpicker.d;
    }

    static MyLocationOverlay h(LocationPicker locationpicker)
    {
        return locationpicker.j;
    }

    static ListView i(LocationPicker locationpicker)
    {
        return locationpicker.h;
    }

    static h8 j(LocationPicker locationpicker)
    {
        return locationpicker.r;
    }

    static ProgressBar k(LocationPicker locationpicker)
    {
        return locationpicker.n;
    }

    static boolean l(LocationPicker locationpicker)
    {
        return locationpicker.o;
    }

    static void m(LocationPicker locationpicker)
    {
        locationpicker.c();
    }

    static t3 n(LocationPicker locationpicker)
    {
        return locationpicker.c;
    }

    static PlaceInfo o(LocationPicker locationpicker)
    {
        return locationpicker.i;
    }

    static Location p(LocationPicker locationpicker)
    {
        return locationpicker.u;
    }

    public void a(GeoPoint geopoint, int i1, int j1)
    {
    }

    protected boolean isRouteDisplayed()
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            int i1;
label1:
            {
                i1 = App.am;
                super.onCreate(bundle);
                Log.i(z[12]);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                if (!WhatsAppLibLoader.a(null))
                {
                    Log.i(z[17]);
                    finish();
                    return;
                }
                if (App.Z == null)
                {
                    finish();
                    return;
                }
                b = getIntent().getStringExtra(z[9]);
                c = (t3)getLastNonConfigurationInstance();
                setContentView(iz.a(getLayoutInflater(), 0x7f030079, null, false));
                p = (TextView)findViewById(0x7f0b0224);
                k = new GoogleMapView(this);
                k.setClickable(true);
                k.setEnabled(true);
                k.setMapListener(this);
                k.setBuiltInZoomControls(false);
                k.getController().setZoom(18);
                ((ViewGroup)findViewById(0x7f0b0204)).addView(k);
                j = new asx(this, this, k);
                s = new Handler();
                t = new atm(this);
                if (c == null)
                {
                    j.runOnFirstFix(new af8(this));
                    s.postDelayed(t, 15000L);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                if (bundle != null)
                {
                    int k1 = bundle.getInt(z[6]);
                    if (k1 > 0)
                    {
                        GeoPoint geopoint = new GeoPoint(bundle.getInt(z[10]), bundle.getInt(z[8]));
                        k.getController().setCenter(geopoint);
                        k.getController().setZoom(k1);
                    }
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                if (c.l != null)
                {
                    k.a(GoogleMapView.a(c.l));
                }
            }
            if (c.h != null && !"".equals(c.h))
            {
                p.setText(getString(0x7f0e02ea, new Object[] {
                    c.h
                }));
                if (i1 == 0)
                {
                    break label0;
                }
            }
            p.setText(0x7f0e02e8);
        }
        r = new h8(this);
        r.a();
        k.getOverlays().add(r);
        k.getOverlays().add(j);
        a = (Button)findViewById(0x7f0b0222);
        a.setText(Html.fromHtml((new StringBuilder()).append(z[14]).append(getString(0x7f0e037a)).append(z[7]).toString()));
        a.setOnClickListener(new a8d(this));
        d = new afc(this, this);
        h = (ListView)findViewById(0x7f0b0225);
        e = new TextView(this);
        e.setMovementMethod(LinkMovementMethod.getInstance());
        e.setGravity(17);
        e.setPadding((int)a1g.a().k, 0, (int)a1g.a().k, 0);
        h.setFooterDividersEnabled(true);
        h.addFooterView(e, null, true);
        h.setAdapter(d);
        c();
        h.setOnItemClickListener(new f2(this));
        n = (ProgressBar)findViewById(0x7f0b019c);
        Object obj = n;
        int j1;
        if (c == null)
        {
            j1 = 0;
        } else
        {
            j1 = 8;
        }
        ((ProgressBar) (obj)).setVisibility(j1);
        findViewById(0x7f0b0221).setVisibility(8);
        obj = (ImageView)findViewById(0x7f0b0205);
        ((ImageView) (obj)).setImageResource(0x7f0200e1);
        ((ImageView) (obj)).setOnClickListener(new d4(this));
        if (App.l == 3)
        {
            a.setOnLongClickListener(new ad6(this));
        }
        if (bundle == null)
        {
            bundle = (LocationManager)getSystemService(z[13]);
            if (!bundle.isProviderEnabled(z[15]) && !bundle.isProviderEnabled(z[16]))
            {
                showDialog(2);
            }
        }
        bundle = new File(App.au.getCacheDir(), z[11]);
        bundle.mkdirs();
        m = (new r(bundle)).a((int)(a1g.a().g * 48F)).a();
    }

    public Dialog onCreateDialog(int i1)
    {
        no no1;
        switch (i1)
        {
        default:
            return super.onCreateDialog(i1);

        case 2: // '\002'
            no1 = new no(this);
            break;
        }
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e01a9).setMessage(0x7f0e01a8).setCancelable(true).setPositiveButton(0x7f0e02ba, no1).create();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0, 0, 0x7f0e0366).setIcon(0x7f020517).setShowAsAction(2);
        menu.add(0, 1, 0, 0x7f0e030f).setIcon(0x7f020515).setShowAsAction(1);
        if (App.u == 3)
        {
            a5.b(this);
        }
        return true;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (s != null)
        {
            s.removeCallbacks(t);
        }
        if (q != null)
        {
            q.cancel(true);
            q = null;
        }
        m.a();
    }

    public void onNewIntent(Intent intent)
    {
        if (z[5].equals(intent.getAction()))
        {
            intent = intent.getStringExtra(z[4]);
            a(k.c(), Math.max(k.a(), 1500), intent, true);
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
            f = false;
            a(k.c(), k.a(), null, false);
            return true;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    protected void onPause()
    {
        super.onPause();
        j.disableMyLocation();
    }

    protected void onResume()
    {
        super.onResume();
        j.enableMyLocation();
    }

    public Object onRetainNonConfigurationInstance()
    {
        return c;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        GeoPoint geopoint = k.getMapCenter();
        bundle.putInt(z[1], geopoint.getLatitudeE6());
        bundle.putInt(z[3], geopoint.getLongitudeE6());
        bundle.putInt(z[2], k.getZoomLevel());
    }

    public boolean onSearchRequested()
    {
        Object obj = (ViewGroup)findViewById(0x7f0b017c);
        if (obj != null)
        {
            ((ViewGroup) (obj)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(((ViewGroup) (obj)).getWidth(), ((ViewGroup) (obj)).getHeight()));
        }
        if (c == null)
        {
            obj = null;
        } else
        {
            obj = c.h;
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
        as = new String[18];
        obj = "\034[\031u\026E\\\004:\fTNIn^\017\025_r\021RIHh\005R_\027~\013M\025\036#\002OOKn\025U[KxX\017[\007";
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
                obj = "L[M";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "ZUVp";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "LUW";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "QO\\o\035";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "AT]o\013I^\027t\nT_WiJAYMt\013N\024jX%ryq";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "ZUVp";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "\034\025[#";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "LUW";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "JS]";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "L[M";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "pVX~\001S";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "LUZ|\020IUWm\rCQ\\oKCH\\|\020E";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "LUZ|\020IUW";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "\034X\007";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "GJJ";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "N_Mj\013RQ";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "AXVo\020IT^=\000U_\031i\013\000TXi\rV_\031q\rBHXo\rEI\031p\rSIPs\003";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                z = as;
                g = 0L;
                l = false;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 484
    //                   0 507
    //                   1 514
    //                   2 521
    //                   3 528;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_528;
_L3:
        byte byte1 = 100;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 32;
          goto _L9
_L5:
        byte1 = 58;
          goto _L9
_L6:
        byte1 = 57;
          goto _L9
        byte1 = 29;
          goto _L9
    }
}
