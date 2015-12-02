// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ZoomButtonsController;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockMapActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Projection;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.c;
import com.whatsapp.util.q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            o2, adb, App, GoogleMapView, 
//            mz, a1g, ao4, iz, 
//            k, og, u5, asq, 
//            aoz, ji, bh, a__, 
//            _3, lt, mh, kq, 
//            DialogToastActivity, adk

public class GroupChatRecentLocationsActivity extends SherlockMapActivity
    implements o2
{

    private static final String z[];
    private og a;
    private MyLocationOverlay b;
    private ArrayList c;
    private TextView d;
    private ArrayList e;
    private a__ f;
    private int g;
    private GoogleMapView h;
    private final adk i = new adb(this);
    private android.view.View.OnLongClickListener j;
    private int k;
    private String l;

    public GroupChatRecentLocationsActivity()
    {
        c = new ArrayList();
        k = -1;
        e = new ArrayList();
    }

    static int a(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity, int i1)
    {
        groupchatrecentlocationsactivity.g = i1;
        return i1;
    }

    static og a(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        return groupchatrecentlocationsactivity.a;
    }

    static og a(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity, og og1)
    {
        groupchatrecentlocationsactivity.a = og1;
        return og1;
    }

    static c4 a(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity, String s)
    {
        return groupchatrecentlocationsactivity.a(s);
    }

    private c4 a(String s)
    {
        int i1 = App.am;
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c4 c4_1 = (c4)iterator.next();
            if (s.equals(c4_1.G))
            {
                return c4_1;
            }
        } while (i1 == 0);
        return null;
    }

    private void a()
    {
        int i1 = App.am;
        Object obj = e.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            View view = (View)((Iterator) (obj)).next();
            h.removeView(view);
        } while (i1 == 0);
        int j1 = Math.min(h.getWidth(), h.getHeight()) / 10;
        double d1 = (Math.pow(2D, h.getZoomLevel()) * 256D) / 2D;
        d1 = (double)(j1 * 360) / d1;
        double d3 = d1 / 2D;
        obj = new HashMap();
        Point point = new Point();
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c4 c4_1 = (c4)iterator.next();
            double d5 = c4_1.v;
            double d6 = c4_1.o;
            Object obj2 = new GeoPoint((int)(c4_1.o * 1000000D), (int)(c4_1.v * 1000000D));
            h.getProjection().toPixels(((GeoPoint) (obj2)), point);
            obj2 = (new StringBuilder()).append((int)((d5 + 180D) / d1)).append(" ").append((int)((90D + d6) / d3)).toString();
            if (!((HashMap) (obj)).containsKey(obj2))
            {
                ((HashMap) (obj)).put(obj2, new ArrayList());
            }
            ((ArrayList)((HashMap) (obj)).get(obj2)).add(c4_1);
        } while (i1 == 0);
        obj = new ArrayList(((HashMap) (obj)).values());
        Collections.sort(((List) (obj)), new mz(this));
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (ArrayList)((Iterator) (obj)).next();
            LinearLayout linearlayout = new LinearLayout(this);
            linearlayout.setOrientation(0);
            linearlayout.setPadding(0, 0, 0, (int)(7F * a1g.a().g));
            LinearLayout linearlayout1 = new LinearLayout(this);
            linearlayout1.setOrientation(1);
            linearlayout.addView(linearlayout1);
            LayoutInflater layoutinflater = (LayoutInflater)getSystemService(z[1]);
            Object obj3 = new ao4();
            ((ao4) (obj3)).a((int)(12F * a1g.a().g));
            linearlayout1.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj3)));
            obj3 = ((ArrayList) (obj1)).iterator();
            double d2 = 0.0D;
            double d4 = 0.0D;
            do
            {
                if (!((Iterator) (obj3)).hasNext())
                {
                    break;
                }
                c4 c4_2 = (c4)((Iterator) (obj3)).next();
                View view1 = iz.a(layoutinflater, 0x7f030033, null);
                view1.setClickable(true);
                view1.setBackgroundResource(0x7f02063d);
                a(view1, c4_2);
                linearlayout1.addView(view1);
                view1.setOnLongClickListener(j);
                d2 += c4_2.o;
                d4 = c4_2.v + d4;
            } while (i1 == 0);
            obj1 = new GeoPoint((int)((d2 / (double)((ArrayList) (obj1)).size()) * 1000000D), (int)((d4 / (double)((ArrayList) (obj1)).size()) * 1000000D));
            h.addView(linearlayout, new com.google.android.maps.MapView.LayoutParams(-2, -2, ((GeoPoint) (obj1)), 81));
            e.add(linearlayout);
        } while (i1 == 0);
    }

    private void a(View view, c4 c4_1)
    {
label0:
        {
            og og1 = App.az.e(c4_1.G);
            ((TextView)view.findViewById(0x7f0b012b)).setText(og1.a(this));
            ((TextView)view.findViewById(0x7f0b012c)).setText(q.f(this, com.whatsapp.App.q(c4_1)));
            ImageView imageview = (ImageView)view.findViewById(0x7f0b012a);
            android.graphics.Bitmap bitmap = og1.a(getResources().getDimensionPixelSize(0x7f0a0059), getResources().getDimension(0x7f0a0058), true);
            if (bitmap != null)
            {
                imageview.setImageBitmap(bitmap);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            imageview.setImageResource(og1.o());
        }
        view.setTag(c4_1.G);
    }

    static MyLocationOverlay b(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        return groupchatrecentlocationsactivity.b;
    }

    private void b()
    {
label0:
        {
            if (g == -1 && b.getMyLocation() == null)
            {
                g = 0;
            }
            if (g == -1)
            {
                h.getController().animateTo(b.getMyLocation());
                h.getController().setZoom(17);
                d.setText(getString(0x7f0e0286));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (g < c.size())
            {
                Object obj = (c4)c.get(g);
                obj = new GeoPoint((int)(((c4) (obj)).o * 1000000D), (int)(((c4) (obj)).v * 1000000D));
                h.getController().animateTo(((GeoPoint) (obj)));
                h.getController().setZoom(17);
                d.setText(getString(0x7f0e0226, new Object[] {
                    Integer.valueOf(g + 1), Integer.valueOf(c.size())
                }));
            }
        }
    }

    static GoogleMapView c(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        return groupchatrecentlocationsactivity.h;
    }

    static String d(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        return groupchatrecentlocationsactivity.l;
    }

    static TextView e(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        return groupchatrecentlocationsactivity.d;
    }

    static a__ f(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        return groupchatrecentlocationsactivity.f;
    }

    static ArrayList g(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        return groupchatrecentlocationsactivity.c;
    }

    static int h(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        return groupchatrecentlocationsactivity.g;
    }

    static int i(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        int i1 = groupchatrecentlocationsactivity.g;
        groupchatrecentlocationsactivity.g = i1 + 1;
        return i1;
    }

    static void j(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        groupchatrecentlocationsactivity.b();
    }

    static void k(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        groupchatrecentlocationsactivity.a();
    }

    static int l(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        int i1 = groupchatrecentlocationsactivity.g;
        groupchatrecentlocationsactivity.g = i1 - 1;
        return i1;
    }

    public void a(GeoPoint geopoint, int i1, int j1)
    {
        if (k != h.getZoomLevel())
        {
            k = h.getZoomLevel();
            a();
        }
    }

    protected boolean isRouteDisplayed()
    {
        return false;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        int k1 = App.am;
        i1;
        JVM INSTR tableswitch 10 11: default 28
    //                   10 29
    //                   11 92;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (intent == null || intent.getData() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        App.az.a(intent.getData(), a);
        if (k1 == 0) goto _L1; else goto _L4
_L4:
        App.az.h(a);
        if (k1 == 0) goto _L1; else goto _L5
_L5:
        Log.i(z[2]);
        if (k1 == 0) goto _L1; else goto _L3
_L3:
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        App.az.h(a);
        if (k1 == 0) goto _L1; else goto _L6
_L6:
        Log.i(z[3]);
        return;
    }

    public void onCreate(Bundle bundle)
    {
        int i1;
        int j1;
        int k1;
        i1 = App.am;
        super.onCreate(bundle);
        Log.i(z[6]);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f030072);
        l = getIntent().getStringExtra(z[5]);
        bundle = u5.d(l);
        getSupportActionBar().setTitle(com.whatsapp.util.c.b(bundle.a(this), getBaseContext()));
        h = (GoogleMapView)findViewById(0x7f0b0207);
        h.setMapListener(this);
        h.setBuiltInZoomControls(true);
        d = (TextView)findViewById(0x7f0b00cf);
        b = new asq(this, h);
        h.getOverlays().add(b);
        c = App.ah.j(l);
        Collections.sort(c, new ji(this));
        j = new bh(this);
        bundle = c.iterator();
        double d1 = 90D;
        double d2 = -90D;
        double d3 = 180D;
        double d4 = -180D;
        do
        {
            if (!bundle.hasNext())
            {
                break;
            }
            c4 c4_1 = (c4)bundle.next();
            d1 = Math.min(d1, c4_1.o);
            d2 = Math.max(d2, c4_1.o);
            d3 = Math.min(d3, c4_1.v);
            d4 = Math.max(d4, c4_1.v);
        } while (i1 == 0);
        bundle = new GeoPoint((int)(((d1 + d2) * 1000000D) / 2D), (int)(((d3 + d4) * 1000000D) / 2D));
        h.getController().setCenter(bundle);
        j1 = (int)((d2 - d1) * 1.3D * 1000000D);
        k1 = (int)((d4 - d3) * 1.3D * 1000000D);
        if (c.size() > 1)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        h.getController().setZoom(17);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_413;
        }
        Method method;
        try
        {
            h.getController().zoomToSpan(j1, k1);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        a();
        g = c.size() - 1;
        f = new a__(this);
        f.a();
        h.getOverlays().add(f);
        findViewById(0x7f0b020a).setOnClickListener(new _3(this));
        findViewById(0x7f0b020b).setOnClickListener(new lt(this));
        findViewById(0x7f0b0209).setOnClickListener(new mh(this));
        bundle = null;
        method = h.getClass().getMethod(z[4], new Class[0]);
        bundle = method;
_L3:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_632;
        }
        bundle = (ZoomButtonsController)bundle.invoke(h, new Object[0]);
_L1:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_632;
        }
        bundle = bundle.getZoomControls();
_L4:
        if (bundle != null)
        {
            try
            {
                bundle.setPadding(0, 0, 0, (int)(a1g.a().g * 48F));
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        App.ah.a(i);
        return;
        bundle;
        throw bundle;
        bundle;
_L2:
        bundle = null;
          goto _L1
        bundle;
          goto _L2
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
          goto _L3
        bundle = null;
          goto _L4
    }

    protected Dialog onCreateDialog(int i1)
    {
        Object obj;
label0:
        {
            switch (i1)
            {
            default:
                return null;

            case 0: // '\0'
                obj = new ArrayList();
                break;
            }
            ((ArrayList) (obj)).add(getString(0x7f0e024f, new Object[] {
                a.a(this)
            }));
            ((ArrayList) (obj)).add(getString(0x7f0e0070, new Object[] {
                a.a(this)
            }));
            if (a.z != null)
            {
                ((ArrayList) (obj)).add(getString(0x7f0e047d, new Object[] {
                    a.a(this)
                }));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ((ArrayList) (obj)).add(getString(0x7f0e0026));
            ((ArrayList) (obj)).add(getString(0x7f0e0029));
        }
        String as[] = new String[((ArrayList) (obj)).size()];
        ((ArrayList) (obj)).toArray(as);
        obj = new android.app.AlertDialog.Builder(this);
        ((android.app.AlertDialog.Builder) (obj)).setItems(as, new kq(this));
        AlertDialog alertdialog = ((android.app.AlertDialog.Builder) (obj)).create();
        alertdialog.requestWindowFeature(1);
        return alertdialog;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0, 0, 0x7f0e0235).setIcon(0x7f0200fc).setShowAsAction(2);
        if (App.u == 3)
        {
            a5.b(this);
        }
        return true;
    }

    public void onDestroy()
    {
        Log.i(z[0]);
        super.onDestroy();
        App.ah.b(i);
    }

    public boolean onMenuItemSelected(int i1, android.view.MenuItem menuitem)
    {
        DialogToastActivity.a(menuitem);
        return super.onMenuItemSelected(i1, menuitem);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = false;
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 0: // '\0'
            menuitem = h;
            if (!h.isSatellite())
            {
                flag = true;
            }
            menuitem.setSatellite(flag);
            return true;

        case 16908332: 
            finish();
            return true;
        }
    }

    protected void onPause()
    {
        super.onPause();
        b.disableMyLocation();
    }

    protected void onResume()
    {
        super.onResume();
        b.enableMyLocation();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[7];
        obj = "wFpRBs\\~S@uWzIF|[|FFy[qT\035tQlS@\177M";
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
                obj = "|UfHGdkvIT|UkB@";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "wFpRBs\\~S@uWzIF|[|FFy[qT\035bQlR^d\033|H\\dU|S\022~[k\007StPzC";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "wFpRBs\\~S@uWzIF|[|FFy[qT\035bQlR^d\033lL[`\033|H\\dU|S\022~[k\007StPzC";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "wQk}]\177Y]RFd[qTq\177ZkU]|XzU";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "z]{";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "wFpRBs\\~S@uWzIF|[|FFy[qT\035sFzFFu";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 50;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 16;
          goto _L9
_L5:
        byte1 = 52;
          goto _L9
_L6:
        byte1 = 31;
          goto _L9
        byte1 = 39;
          goto _L9
    }
}
