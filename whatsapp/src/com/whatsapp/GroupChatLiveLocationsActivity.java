// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockMapActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Projection;
import com.whatsapp.protocol.cr;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.whatsapp:
//            o2, tu, App, td, 
//            GoogleMapView, ol, k, og, 
//            zf, a1g, ao4, iz, 
//            at0, u5, asi, aoq, 
//            a97, dz, DialogToastActivity

public class GroupChatLiveLocationsActivity extends SherlockMapActivity
    implements o2
{

    private static final String z[];
    private ArrayList a;
    private aoq b;
    private cr c;
    private GoogleMapView d;
    private td e;
    private MyLocationOverlay f;
    private int g;

    public GroupChatLiveLocationsActivity()
    {
        a = new ArrayList();
        g = -1;
        e = new tu(this);
    }

    static cr a(GroupChatLiveLocationsActivity groupchatlivelocationsactivity, cr cr1)
    {
        groupchatlivelocationsactivity.c = cr1;
        return cr1;
    }

    static ArrayList a(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        return groupchatlivelocationsactivity.a;
    }

    private void a()
    {
        double d1;
        double d2;
        double d3;
        double d4;
        int i;
label0:
        {
            i = App.am;
            Object obj = e.e.iterator();
            d1 = 90D;
            d2 = -90D;
            d3 = 180D;
            d4 = -180D;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                cr cr1 = (cr)((Iterator) (obj)).next();
                d1 = Math.min(d1, cr1.e);
                d2 = Math.max(d2, cr1.e);
                d3 = Math.min(d3, cr1.d);
                d4 = Math.max(d4, cr1.d);
            } while (i == 0);
            obj = new GeoPoint((int)(((d1 + d2) * 1000000D) / 2D) + (int)(((d2 - d1) * 1000000D) / 6D), (int)(((d3 + d4) * 1000000D) / 2D));
            if (e.e.size() > 0)
            {
                d.getController().setCenter(((GeoPoint) (obj)));
                if (i == 0)
                {
                    break label0;
                }
            }
            f.runOnFirstFix(new ol(this));
        }
label1:
        {
            int j = (int)((d2 - d1) * 1.3D * 1000000D);
            int l = (int)((d4 - d3) * 1.3D * 1000000D);
            if (e.e.size() <= 1)
            {
                d.getController().setZoom(17);
                if (i == 0)
                {
                    break label1;
                }
            }
            d.getController().zoomToSpan(j, l);
        }
        if (d.getZoomLevel() <= 1)
        {
            d.getController().setZoom(2);
        }
    }

    private void a(View view, cr cr1)
    {
        String s1;
        og og1;
        TextView textview;
        TextView textview1;
        int i;
label0:
        {
            i = App.am;
            og1 = App.az.e(cr1.g);
            textview = (TextView)view.findViewById(0x7f0b012b);
            textview.setText(og1.a(this));
            textview1 = (TextView)view.findViewById(0x7f0b012c);
            if (System.currentTimeMillis() - cr1.i < 60000L)
            {
                s1 = getString(0x7f0e0227);
                if (i == 0)
                {
                    break label0;
                }
            }
            s1 = DateUtils.getRelativeTimeSpanString(cr1.i, System.currentTimeMillis(), 60000L, 0).toString();
        }
label1:
        {
            String s = s1;
            if (cr1.f != 0)
            {
                s = (new StringBuilder()).append(s1).append(z[4]).append(getString(0x7f0e0224, new Object[] {
                    Integer.valueOf(cr1.f)
                })).toString();
            }
            s1 = s;
            if ((double)cr1.c <= 0.44703999999999999D)
            {
                break label1;
            }
            s1 = (new StringBuilder()).append(s).append(z[6]).toString();
            s = s1;
            if (Locale.US.equals(Locale.getDefault()))
            {
                s = (new StringBuilder()).append(s1).append(getString(0x7f0e022c, new Object[] {
                    String.format(z[3], new Object[] {
                        Double.valueOf((double)cr1.c * 2.2369400000000002D)
                    })
                })).toString();
                s1 = s;
                if (i == 0)
                {
                    break label1;
                }
            }
            s1 = (new StringBuilder()).append(s).append(getString(0x7f0e022b, new Object[] {
                String.format(z[5], new Object[] {
                    Double.valueOf((double)cr1.c * 3.6000000000000001D)
                })
            })).toString();
        }
label2:
        {
            textview1.setText(s1);
            view = (ImageView)view.findViewById(0x7f0b012a);
            cr1 = og1.a(getResources().getDimensionPixelSize(0x7f0a0059), getResources().getDimension(0x7f0a0058), true);
            if (cr1 != null)
            {
                view.setImageBitmap(cr1);
                if (i == 0)
                {
                    break label2;
                }
            }
            view.setImageResource(og1.o());
        }
        textview.setVisibility(8);
        textview1.setVisibility(8);
    }

    static GoogleMapView b(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        return groupchatlivelocationsactivity.d;
    }

    private void b()
    {
        int i;
        int j;
        int l;
        j = App.am;
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            View view = (View)iterator.next();
            d.removeView(view);
        } while (j == 0);
        i = d.getWidth();
        l = d.getHeight();
        if (i != 0 && l != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        i = Math.min(i, l) / 10;
        double d1 = (Math.pow(2D, d.getZoomLevel()) * 256D) / 2D;
        d1 = (double)(i * 360) / d1;
        double d3 = d1 / 2D;
        obj = new HashMap();
        obj1 = new Point();
        Object obj2 = e.e.iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            cr cr1 = (cr)((Iterator) (obj2)).next();
            double d5 = cr1.d;
            double d6 = cr1.e;
            Object obj3 = new GeoPoint((int)(cr1.e * 1000000D), (int)(cr1.d * 1000000D));
            d.getProjection().toPixels(((GeoPoint) (obj3)), ((Point) (obj1)));
            obj3 = (new StringBuilder()).append((int)((d5 + 180D) / d1)).append(" ").append((int)((90D + d6) / d3)).toString();
            if (!((HashMap) (obj)).containsKey(obj3))
            {
                ((HashMap) (obj)).put(obj3, new ArrayList());
            }
            ((ArrayList)((HashMap) (obj)).get(obj3)).add(cr1);
        } while (j == 0);
        obj2 = new ArrayList(((HashMap) (obj)).values());
        Collections.sort(((List) (obj2)), new zf(this));
        obj = new ArrayList();
        obj1 = new ArrayList();
        obj2 = ((ArrayList) (obj2)).iterator();
label0:
        do
        {
            LinearLayout linearlayout;
label1:
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break label0;
                }
                ArrayList arraylist = (ArrayList)((Iterator) (obj2)).next();
                linearlayout = new LinearLayout(this);
                linearlayout.setOrientation(0);
                linearlayout.setPadding(0, 0, 0, (int)(7F * a1g.a().g));
                LinearLayout linearlayout1 = new LinearLayout(this);
                linearlayout1.setOrientation(1);
                linearlayout.addView(linearlayout1);
                linearlayout1.setClickable(true);
                linearlayout1.setFocusable(true);
                Object obj4 = (LayoutInflater)getSystemService(z[0]);
                Object obj5 = new ao4();
                ((ao4) (obj5)).a((int)(12F * a1g.a().g));
                linearlayout1.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj5)));
                double d2 = 0.0D;
                double d4 = 0.0D;
                obj5 = arraylist.iterator();
                boolean flag = false;
                do
                {
                    if (!((Iterator) (obj5)).hasNext())
                    {
                        break;
                    }
                    cr cr2 = (cr)((Iterator) (obj5)).next();
                    View view1 = iz.a(((LayoutInflater) (obj4)), 0x7f030033, null);
                    a(view1, cr2);
                    linearlayout1.addView(view1);
                    view1.setTag(cr2);
                    d2 += cr2.e;
                    d4 += cr2.d;
                    if (e.o.contains(cr2))
                    {
                        flag = true;
                    }
                } while (j == 0);
                obj4 = new GeoPoint((int)((d2 / (double)arraylist.size()) * 1000000D), (int)((d4 / (double)arraylist.size()) * 1000000D));
                linearlayout1.setTag(arraylist);
                linearlayout1.setSelected(flag);
                linearlayout1.setOnClickListener(new at0(this, arraylist, ((GeoPoint) (obj4))));
                if (flag)
                {
                    ((ArrayList) (obj)).add(linearlayout);
                    ((ArrayList) (obj1)).add(obj4);
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                d.addView(linearlayout, new com.google.android.maps.MapView.LayoutParams(-2, -2, ((GeoPoint) (obj4)), 81));
            }
            a.add(linearlayout);
        } while (j == 0);
        i = 0;
_L5:
        if (i >= ((ArrayList) (obj)).size()) goto _L1; else goto _L3
_L3:
        d.addView((View)((ArrayList) (obj)).get(i), new com.google.android.maps.MapView.LayoutParams(-2, -2, (GeoPoint)((ArrayList) (obj1)).get(i), 81));
        if (j != 0) goto _L1; else goto _L4
_L4:
        i++;
          goto _L5
    }

    static void c(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        groupchatlivelocationsactivity.b();
    }

    static cr d(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        return groupchatlivelocationsactivity.c;
    }

    static void e(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        groupchatlivelocationsactivity.a();
    }

    static td f(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        return groupchatlivelocationsactivity.e;
    }

    static MyLocationOverlay g(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        return groupchatlivelocationsactivity.f;
    }

    static aoq h(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        return groupchatlivelocationsactivity.b;
    }

    public void a(GeoPoint geopoint, int i, int j)
    {
        j = d.getZoomLevel();
        i = j;
        if (j <= 1)
        {
            i = 2;
            d.getController().setZoom(2);
        }
        if (g != i)
        {
            g = i;
            b();
        }
    }

    protected boolean isRouteDisplayed()
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.i(z[2]);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f030071);
        bundle = u5.d(getIntent().getStringExtra(z[1]));
        getSupportActionBar().setTitle(com.whatsapp.util.c.b(bundle.a(this), this));
        e.a(this);
        d = new _cls2(this);
        d.setClickable(true);
        d.setEnabled(true);
        d.setMapListener(this);
        d.setBuiltInZoomControls(false);
        d.getController().setZoom(17);
        ((ViewGroup)findViewById(0x7f0b0204)).addView(d);
        f = new asi(this, this, d);
        d.getOverlays().add(f);
        b = new aoq(this);
        b.a();
        d.getOverlays().add(b);
        d.getViewTreeObserver().addOnPreDrawListener(new a97(this));
        findViewById(0x7f0b0205).setOnClickListener(new dz(this));
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
        Log.i(z[7]);
        super.onDestroy();
        e.h();
    }

    public boolean onMenuItemSelected(int i, android.view.MenuItem menuitem)
    {
        DialogToastActivity.a(menuitem);
        return super.onMenuItemSelected(i, menuitem);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = false;
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 0: // '\0'
            menuitem = d;
            if (!d.isSatellite())
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
        f.disableMyLocation();
        e.g();
    }

    protected void onResume()
    {
        super.onResume();
        f.enableMyLocation();
        e.b();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "^0G7(F\016W6;^0J=/";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "X8Z";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "U#Q--^>]9)[>P+rQ#[9)W";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\027`\032ts\0037";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\036q";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\027`\032ts\0037";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\036q";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "U#Q--^>]9)[>P+rV4M,/](";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 93;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 50;
          goto _L9
_L5:
        byte1 = 81;
          goto _L9
_L6:
        byte1 = 62;
          goto _L9
        byte1 = 88;
          goto _L9
    }

    private class _cls2 extends GoogleMapView
    {

        final GroupChatLiveLocationsActivity f;

        public boolean dispatchTouchEvent(MotionEvent motionevent)
        {
            GroupChatLiveLocationsActivity.a(f, null);
            return super.dispatchTouchEvent(motionevent);
        }

        _cls2(Context context)
        {
            f = GroupChatLiveLocationsActivity.this;
            super(context);
        }
    }

}
