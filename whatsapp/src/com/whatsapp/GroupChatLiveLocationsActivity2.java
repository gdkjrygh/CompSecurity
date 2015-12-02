// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.whatsapp.protocol.cr;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, t9, App, a1g, 
//            ao4, k, og, GoogleMapView2, 
//            td, a_v, pu, lv, 
//            a86, ts, lo, u5, 
//            ad1

public class GroupChatLiveLocationsActivity2 extends DialogToastActivity
    implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, LocationListener
{

    private static final String z[];
    private HashMap j;
    private GoogleMap k;
    private GoogleMapView2 l;
    private ImageView m;
    private float n;
    private cr o;
    private boolean p;
    private MenuItem q;
    private td r;
    private HashMap s;

    public GroupChatLiveLocationsActivity2()
    {
        j = new HashMap();
        s = new HashMap();
        n = -1F;
        r = new t9(this);
    }

    private float a(float f1)
    {
label0:
        {
            if (f1 > 0.0F)
            {
                VisibleRegion visibleregion = k.getProjection().getVisibleRegion();
                Location location = new Location("");
                location.setLatitude(visibleregion.nearLeft.latitude);
                location.setLongitude(visibleregion.nearLeft.longitude);
                Location location1 = new Location("");
                location1.setLatitude(visibleregion.nearRight.latitude);
                location1.setLongitude(visibleregion.nearRight.longitude);
                double d1 = location1.distanceTo(location);
                if (d1 > 0.0D)
                {
                    d1 /= f1;
                    double d2 = k.getCameraPosition().zoom;
                    f1 = (float)(Math.log(d1 / 30D) / Math.log(2D) + d2);
                    if (f1 <= 17F)
                    {
                        break label0;
                    }
                }
            }
            return 17F;
        }
        return f1;
    }

    static float a(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2, float f1)
    {
        return groupchatlivelocationsactivity2.a(f1);
    }

    private Point a(int i1)
    {
        if (i1 < 4)
        {
            return new Point(i1, 1);
        } else
        {
            return new Point(2, 2);
        }
    }

    private Point a(int i1, Point point)
    {
        int j1 = i1 / point.x;
        return new Point(i1 % point.x, j1);
    }

    private MarkerOptions a(Collection collection, boolean flag, int i1)
    {
        int j1 = App.am;
        Point point = a(collection.size());
        int k1 = (int)(32F * a1g.a().g);
        int l1 = (int)(3.5F * a1g.a().g);
        int i2 = (k1 + l1) * point.x + l1;
        int j2 = (k1 + l1) * point.y + l1;
        int l2 = (int)(10F * a1g.a().g);
        float f1 = (a1g.a().g * 3F) / 2.0F;
        int k2 = k1 / 5 - (int)f1;
        ao4 ao4_1 = new ao4();
        if (flag)
        {
            ao4_1.setState(new int[] {
                0x10100a1
            });
        }
        ao4_1.a(l2);
        Rect rect1 = new Rect();
        ao4_1.getPadding(rect1);
        ao4_1.setBounds(0, 0, rect1.left + i2 + rect1.right, rect1.top + j2 + rect1.bottom);
        Bitmap bitmap = Bitmap.createBitmap(rect1.left + i2 + rect1.right, rect1.top + j2 + rect1.bottom + (int)((float)(k2 * 2) + f1), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        l2 = rect1.left + i2 / 2;
        int i3 = rect1.top + j2 + rect1.bottom + (int)((float)k2 - f1);
        BlurMaskFilter blurmaskfilter = new BlurMaskFilter(f1, android.graphics.BlurMaskFilter.Blur.NORMAL);
        Paint paint = new Paint(1);
        paint.setColor(0xff999999);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setMaskFilter(blurmaskfilter);
        canvas.translate(0.0F, f1);
        canvas.drawCircle(l2, i3, k2, paint);
        canvas.translate(0.0F, -f1);
        paint.setMaskFilter(null);
        paint.setStrokeWidth(1.0F);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(0x99000000);
        canvas.drawCircle(l2, i3, k2, paint);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(i1);
        canvas.drawCircle(l2, i3, k2, paint);
        ao4_1.draw(canvas);
        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setFilterBitmap(true);
        paint1.setDither(true);
        Iterator iterator = collection.iterator();
        i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            Object obj2 = App.az.e(((String) (obj)));
            Object obj1 = ((og) (obj2)).a(getResources().getDimensionPixelSize(0x7f0a0059), getResources().getDimension(0x7f0a0058), true);
            obj = obj1;
            if (obj1 == null)
            {
                obj = ((og) (obj2)).j();
            }
            obj1 = a(i1, point);
            obj2 = new Rect(rect1.left + l1, rect1.top + l1, rect1.left + l1 + k1, rect1.top + l1 + k1);
            ((Rect) (obj2)).offset(((Point) (obj1)).x * (l1 + k1), ((Point) (obj1)).y * (l1 + k1));
            canvas.drawBitmap(((Bitmap) (obj)), new Rect(0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight()), ((Rect) (obj2)), paint1);
            i1++;
        } while ((i1 < 4 || j1 != 0) && j1 == 0);
        if (collection.size() > 4)
        {
            float f2 = rect1.left + i2 / 2;
            float f3 = rect1.top + j2 / 2;
            paint.setStrokeWidth(1.0F);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setColor(0x99000000);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(-1);
            canvas.drawCircle(f2, f3, k2 * 2, paint);
            TextPaint textpaint = new TextPaint(1);
            textpaint.setTextSize((float)(k2 * 2) * 1.3F);
            textpaint.setColor(0xff0099cc);
            textpaint.setTextAlign(android.graphics.Paint.Align.CENTER);
            textpaint.setFakeBoldText(true);
            Rect rect = new Rect();
            String s1 = Integer.toString(collection.size());
            textpaint.getTextBounds(s1, 0, s1.length(), rect);
            canvas.drawText(Integer.toString(collection.size()), f2, f3 + (float)(rect.height() / 2), textpaint);
        }
        collection = new MarkerOptions();
        collection.icon(BitmapDescriptorFactory.fromBitmap(bitmap)).anchor(0.5F, (float)(bitmap.getHeight() - k2) / (float)bitmap.getHeight());
        return collection;
    }

    static cr a(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2, cr cr1)
    {
        groupchatlivelocationsactivity2.o = cr1;
        return cr1;
    }

    static HashMap a(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        return groupchatlivelocationsactivity2.j;
    }

    private void a()
    {
        if (k == null)
        {
            k = l.getMap();
            if (k != null)
            {
                b();
            }
        }
    }

    private void a(boolean flag)
    {
        int i1;
        i1 = App.am;
        break MISSING_BLOCK_LABEL_5;
_L4:
        double d1;
        double d2;
        double d3;
        double d4;
        Iterator iterator;
        do
        {
            return;
        } while (k == null || r.e.isEmpty());
        if (l.getWidth() <= 0 || l.getHeight() <= 0)
        {
            l.getViewTreeObserver().addOnGlobalLayoutListener(new a_v(this));
            return;
        }
        iterator = r.e.iterator();
        d3 = 90D;
        d2 = -90D;
        d1 = 180D;
        d4 = -180D;
_L7:
        double d6;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_580;
        }
        cr cr1 = (cr)iterator.next();
        d3 = Math.min(d3, cr1.e);
        d2 = Math.max(d2, cr1.e);
        d6 = Math.min(d1, cr1.d);
        d4 = Math.max(d4, cr1.d);
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        double d7;
        d1 = d2;
        d7 = d3;
_L8:
        d2 = d4;
        d3 = d6;
        if (d4 - d6 > 180D)
        {
            Iterator iterator1 = r.e.iterator();
            d3 = 360D;
            d2 = 0.0D;
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                cr cr2 = (cr)iterator1.next();
                double d5;
                if (cr2.d < 0.0D)
                {
                    d5 = cr2.d + 360D;
                } else
                {
                    d5 = cr2.d;
                }
                d3 = Math.min(d3, d5);
                if (cr2.d < 0.0D)
                {
                    d5 = cr2.d + 360D;
                } else
                {
                    d5 = cr2.d;
                }
                d2 = Math.max(d2, d5);
            } while (i1 == 0);
        }
        if (r.e.size() <= 1)
        {
            break; /* Loop/switch isn't completed */
        }
        d1 = (d1 - d7) / 10D + d1;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        k.animateCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(d7, d3), new LatLng(d1, d2)), (int)(a1g.a().g * 64F)));
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        k.moveCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(d7, d3), new LatLng(d1, d2)), (int)(a1g.a().g * 64F)));
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        k.animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(new LatLng((d7 + d1) / 2D, (d3 + d2) / 2D)).zoom(17F).build()));
        if (i1 == 0) goto _L4; else goto _L6
_L6:
        k.moveCamera(CameraUpdateFactory.newLatLng(new LatLng((d1 + d7) / 2D, (d2 + d3) / 2D)));
        k.moveCamera(CameraUpdateFactory.zoomTo(17F));
        return;
_L2:
        d1 = d6;
          goto _L7
        d6 = d1;
        d1 = d2;
        d7 = d3;
          goto _L8
    }

    static boolean a(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2, boolean flag)
    {
        groupchatlivelocationsactivity2.p = flag;
        return flag;
    }

    static float b(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        return groupchatlivelocationsactivity2.n;
    }

    static float b(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2, float f1)
    {
        groupchatlivelocationsactivity2.n = f1;
        return f1;
    }

    private void b()
    {
label0:
        {
            boolean flag = getSharedPreferences(z[7], 0).getBoolean(z[0], false);
            k.setTrafficEnabled(flag);
            if (q != null)
            {
                q.setChecked(flag);
            }
            k.setMapType(getSharedPreferences(z[2], 0).getInt(z[3], 1));
            k.setIndoorEnabled(true);
            k.setMyLocationEnabled(true);
            k.getUiSettings().setCompassEnabled(true);
            k.getUiSettings().setZoomControlsEnabled(false);
            k.getUiSettings().setMyLocationButtonEnabled(false);
            k.setOnMarkerClickListener(new pu(this));
            k.setOnCameraChangeListener(new lv(this));
            k.setOnMapClickListener(new a86(this));
            f();
            if (r.e.isEmpty())
            {
                SharedPreferences sharedpreferences = getSharedPreferences(z[5], 0);
                LatLng latlng = new LatLng(sharedpreferences.getFloat(z[1], 37.3898F), sharedpreferences.getFloat(z[6], -122.0814F));
                k.moveCamera(CameraUpdateFactory.newLatLng(latlng));
                k.moveCamera(CameraUpdateFactory.zoomTo(sharedpreferences.getFloat(z[4], 17F) - 0.2F));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a(false);
        }
    }

    static void b(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2, boolean flag)
    {
        groupchatlivelocationsactivity2.a(flag);
    }

    static ImageView c(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        return groupchatlivelocationsactivity2.m;
    }

    static td d(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        return groupchatlivelocationsactivity2.r;
    }

    private void d()
    {
    }

    private void e()
    {
        a(true);
    }

    static boolean e(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        return groupchatlivelocationsactivity2.p;
    }

    static GoogleMap f(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        return groupchatlivelocationsactivity2.k;
    }

    private void f()
    {
        int i2 = App.am;
        if (k != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        int k1;
        i1 = l.getWidth();
        k1 = l.getHeight();
        if (i1 == 0 || k1 == 0) goto _L1; else goto _L3
_L3:
label0:
        {
label1:
            {
                j.clear();
                Object obj = s.values().iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    ((Marker)((Iterator) (obj)).next()).setVisible(false);
                } while (i2 == 0);
                Object obj1 = k.getProjection();
                float f1 = a1g.a().g;
                float f2 = a1g.a().g;
                obj = new ArrayList();
                Iterator iterator = r.e.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    cr cr1 = (cr)iterator.next();
                    ((ArrayList) (obj)).add(new Pair(cr1, ((Projection) (obj1)).toScreenLocation(new LatLng(cr1.e, cr1.d))));
                } while (i2 == 0);
                Collections.sort(((java.util.List) (obj)), new ts(this));
                obj1 = new ArrayList();
                obj = ((ArrayList) (obj)).iterator();
                double d1;
                double d2;
                double d3;
                double d4;
                Object obj2;
                Object obj3;
                ArrayList arraylist;
                ArrayList arraylist1;
                Object obj4;
                int l1;
                long l2;
                long l3;
                boolean flag;
                boolean flag1;
                for (int j1 = 0x80000000; !((Iterator) (obj)).hasNext(); j1 = l1)
                {
                    break label0;
                }

                obj2 = (Pair)((Iterator) (obj)).next();
                Log.i((new StringBuilder()).append(((cr)((Pair) (obj2)).first).g).append(" ").append(j1).append(" ").append(((Point)((Pair) (obj2)).second).x).toString());
                l1 = j1;
                if ((float)j1 + f1 * 32F < (float)((Point)((Pair) (obj2)).second).x)
                {
                    obj3 = new ArrayList();
                    ((ArrayList) (obj3)).add(obj2);
                    ((ArrayList) (obj1)).add(obj3);
                    j1 = ((Point)((Pair) (obj2)).second).x;
                    l1 = j1;
                    if (i2 == 0)
                    {
                        break label1;
                    }
                    l1 = j1;
                }
                ((ArrayList)((ArrayList) (obj1)).get(((ArrayList) (obj1)).size() - 1)).add(obj2);
            }
            if (i2 == 0)
            {
                break MISSING_BLOCK_LABEL_1163;
            }
        }
        obj = new ArrayList();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (ArrayList)((Iterator) (obj1)).next();
        Collections.sort(((java.util.List) (obj2)), new lo(this));
        obj2 = ((ArrayList) (obj2)).iterator();
        j1 = 0x80000000;
_L9:
label2:
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj3 = (Pair)((Iterator) (obj2)).next();
            l1 = j1;
            if ((float)j1 + f2 * 48F < (float)((Point)((Pair) (obj3)).second).y)
            {
                arraylist = new ArrayList();
                arraylist.add(obj3);
                ((ArrayList) (obj)).add(arraylist);
                j1 = ((Point)((Pair) (obj3)).second).y;
                l1 = j1;
                if (i2 == 0)
                {
                    break label2;
                }
                l1 = j1;
            }
            ((ArrayList)((ArrayList) (obj)).get(((ArrayList) (obj)).size() - 1)).add(obj3);
        }
        if (i2 == 0)
        {
            break MISSING_BLOCK_LABEL_1156;
        }
        if (i2 == 0) goto _L5; else goto _L4
_L4:
        obj3 = ((ArrayList) (obj)).iterator();
_L8:
        if (!((Iterator) (obj3)).hasNext()) goto _L1; else goto _L6
_L6:
label3:
        {
            obj2 = (ArrayList)((Iterator) (obj3)).next();
            l2 = 0x7fffffffffffffffL;
            arraylist1 = new ArrayList();
            arraylist = new ArrayList();
            obj = ((ArrayList) (obj2)).iterator();
            d1 = 0.0D;
            d2 = 0.0D;
            flag = false;
            do
            {
                l3 = l2;
                flag1 = flag;
                d3 = d2;
                d4 = d1;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                obj1 = (cr)((Pair)((Iterator) (obj)).next()).first;
                d4 = d1 + ((cr) (obj1)).e;
                d3 = d2 + ((cr) (obj1)).d;
                arraylist1.add(((cr) (obj1)).g);
                arraylist.add(obj1);
                flag1 = flag;
                if (r.o.contains(obj1))
                {
                    flag1 = true;
                }
                l3 = l2;
                if (((cr) (obj1)).i < l2)
                {
                    l3 = ((cr) (obj1)).i;
                }
                l2 = l3;
                flag = flag1;
                d2 = d3;
                d1 = d4;
            } while (i2 == 0);
            Collections.sort(arraylist1);
            obj1 = arraylist1.iterator();
            obj = "";
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                obj4 = (String)((Iterator) (obj1)).next();
                obj = (new StringBuilder()).append(((String) (obj))).append(" ").append(((String) (obj4))).toString();
            } while (i2 == 0);
            if (l3 + 0x1b7740L > System.currentTimeMillis())
            {
                j1 = 0x9900cc00;
            } else
            {
                j1 = 0x999933cc;
            }
            obj = (new StringBuilder()).append(((String) (obj))).append(" ").append(Integer.toString(j1)).toString();
            obj1 = obj;
            if (flag1)
            {
                obj1 = (new StringBuilder()).append(((String) (obj))).append(z[23]).toString();
            }
            obj4 = new LatLng(d4 / (double)((ArrayList) (obj2)).size(), d3 / (double)((ArrayList) (obj2)).size());
            obj2 = (Marker)s.get(obj1);
            obj = obj2;
            if (obj2 == null)
            {
                Log.i((new StringBuilder()).append(z[22]).append(((String) (obj1))).toString());
                obj = a(arraylist1, flag1, j1);
                obj = k.addMarker(((MarkerOptions) (obj)).position(((LatLng) (obj4))));
                s.put(obj1, obj);
                obj1 = obj;
                if (i2 == 0)
                {
                    break label3;
                }
            }
            ((Marker) (obj)).setVisible(true);
            ((Marker) (obj)).setPosition(((LatLng) (obj4)));
            obj1 = obj;
        }
        j.put(obj1, arraylist);
        if (i2 == 0) goto _L8; else goto _L7
_L7:
        return;
        j1 = l1;
          goto _L9
    }

    static GoogleMapView2 g(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        return groupchatlivelocationsactivity2.l;
    }

    static cr h(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        return groupchatlivelocationsactivity2.o;
    }

    static void i(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        groupchatlivelocationsactivity2.e();
    }

    static void j(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        groupchatlivelocationsactivity2.f();
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.i(z[20]);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f030071);
        Object obj = u5.d(getIntent().getStringExtra(z[21]));
        getSupportActionBar().setTitle(com.whatsapp.util.c.b(((og) (obj)).a(this), this));
        r.a(this);
        MapsInitializer.initialize(this);
        obj = new GoogleMapOptions();
        ((GoogleMapOptions) (obj)).mapType(1).zoomControlsEnabled(false).zoomGesturesEnabled(true).compassEnabled(true).rotateGesturesEnabled(true).tiltGesturesEnabled(true);
        l = new _cls2(this, ((GoogleMapOptions) (obj)));
        ((ViewGroup)findViewById(0x7f0b0204)).addView(l);
        l.onCreate(bundle);
        a();
        m = (ImageView)findViewById(0x7f0b0205);
        m.setOnClickListener(new ad1(this));
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getSupportMenuInflater().inflate(0x7f100001, menu);
        q = menu.findItem(0x7f0b02f9);
        if (q != null && k != null)
        {
            q.setChecked(k.isTrafficEnabled());
        }
        if (App.u == 3)
        {
            a5.b(this);
        }
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        l.onDestroy();
        r.h();
        if (k != null)
        {
            android.content.SharedPreferences.Editor editor = getSharedPreferences(z[10], 0).edit();
            CameraPosition cameraposition = k.getCameraPosition();
            editor.putFloat(z[11], (float)cameraposition.target.latitude);
            editor.putFloat(z[8], (float)cameraposition.target.longitude);
            editor.putFloat(z[9], cameraposition.zoom);
            editor.commit();
        }
    }

    public void onLocationChanged(Location location)
    {
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        l.onLowMemory();
    }

    public boolean onMenuItemSelected(int i1, android.view.MenuItem menuitem)
    {
        DialogToastActivity.a(menuitem);
        return super.onMenuItemSelected(i1, menuitem);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131428086: 
            k.setMapType(1);
            getSharedPreferences(z[19], 0).edit().putInt(z[12], 1).commit();
            return true;

        case 2131428087: 
            k.setMapType(4);
            getSharedPreferences(z[14], 0).edit().putInt(z[16], 4).commit();
            return true;

        case 2131428088: 
            k.setMapType(3);
            getSharedPreferences(z[17], 0).edit().putInt(z[13], 3).commit();
            return true;

        case 2131428089: 
            boolean flag;
            if (!k.isTrafficEnabled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k.setTrafficEnabled(flag);
            q.setChecked(flag);
            getSharedPreferences(z[18], 0).edit().putBoolean(z[15], flag).commit();
            return true;

        case 16908332: 
            finish();
            return true;
        }
    }

    protected void onPause()
    {
        super.onPause();
        l.onPause();
        l.b();
        r.g();
    }

    protected void onResume()
    {
        super.onResume();
        l.onResume();
        l.c();
        r.b();
        a();
        d();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        l.onSaveInstanceState(bundle);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[24];
        obj = "\024R\016\035q\024T\033\031Z\021T\026']\020T\017'Z\nZ\036\036G\033";
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
                obj = "\024R\016\035q\024T\033\031Z\021T\026'B\031O";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "\033T\025VY\020Z\f\013O\bK'\b\\\035]\035\nK\026X\035\013";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "\024R\016\035q\024T\033\031Z\021T\026'C\031K'\fW\b^";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "\024R\016\035q\024T\033\031Z\021T\026'T\027T\025";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "\033T\025VY\020Z\f\013O\bK'\b\\\035]\035\nK\026X\035\013";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "\024R\016\035q\024T\033\031Z\021T\026'B\027U";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "\033T\025VY\020Z\f\013O\bK'\b\\\035]\035\nK\026X\035\013";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "\024R\016\035q\024T\033\031Z\021T\026'B\027U";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "\024R\016\035q\024T\033\031Z\021T\026'T\027T\025";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "\033T\025VY\020Z\f\013O\bK'\b\\\035]\035\nK\026X\035\013";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "\024R\016\035q\024T\033\031Z\021T\026'B\031O";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "\024R\016\035q\024T\033\031Z\021T\026'C\031K'\fW\b^";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "\024R\016\035q\024T\033\031Z\021T\026'C\031K'\fW\b^";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "\033T\025VY\020Z\f\013O\bK'\b\\\035]\035\nK\026X\035\013";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "\024R\016\035q\024T\033\031Z\021T\026']\020T\017'Z\nZ\036\036G\033";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "\024R\016\035q\024T\033\031Z\021T\026'C\031K'\fW\b^";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "\033T\025VY\020Z\f\013O\bK'\b\\\035]\035\nK\026X\035\013";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "\033T\025VY\020Z\f\013O\bK'\b\\\035]\035\nK\026X\035\013";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "\033T\025VY\020Z\f\013O\bK'\b\\\035]\035\nK\026X\035\013";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "\037I\027\r^\024T\033\031Z\021T\026\013\001\033I\035\031Z\035";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "\022R\034";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "\037I\027\r^\024T\033\031Z\021T\026\013\001\025Z\n\023K\nX\n\035O\f^\034X";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "XH\035\024K\033O\035\034";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 608
    //                   0 631
    //                   1 638
    //                   2 645
    //                   3 652;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_652;
_L3:
        byte byte1 = 46;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 120;
          goto _L9
_L5:
        byte1 = 59;
          goto _L9
_L6:
        byte1 = 120;
          goto _L9
        byte1 = 120;
          goto _L9
    }

    private class _cls2 extends GoogleMapView2
    {

        final GroupChatLiveLocationsActivity2 n;

        public void a(int i1)
        {
            int j1;
            j1 = App.am;
            GroupChatLiveLocationsActivity2.a(n, true);
            i1;
            JVM INSTR tableswitch 0 2: default 40
        //                       0 41
        //                       1 57
        //                       2 73;
               goto _L1 _L2 _L3 _L4
_L1:
            return;
_L2:
            com.whatsapp.GroupChatLiveLocationsActivity2.c(n).setImageResource(0x7f0200c0);
            if (j1 == 0) goto _L1; else goto _L3
_L3:
            com.whatsapp.GroupChatLiveLocationsActivity2.c(n).setImageResource(0x7f0200bd);
            if (j1 == 0) goto _L1; else goto _L4
_L4:
            com.whatsapp.GroupChatLiveLocationsActivity2.c(n).setImageResource(0x7f0200e1);
            return;
        }

        public boolean dispatchTouchEvent(MotionEvent motionevent)
        {
            GroupChatLiveLocationsActivity2.a(n, true);
            GroupChatLiveLocationsActivity2.a(n, null);
            return super.dispatchTouchEvent(motionevent);
        }

        _cls2(Context context, GoogleMapOptions googlemapoptions)
        {
            n = GroupChatLiveLocationsActivity2.this;
            super(context, googlemapoptions);
        }
    }

}
