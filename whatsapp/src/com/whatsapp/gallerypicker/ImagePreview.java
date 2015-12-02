// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.PhotoView;
import com.whatsapp.au2;
import com.whatsapp.cq;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.b7;
import com.whatsapp.util.c;
import com.whatsapp.wallpaper.CropImage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.whatsapp.gallerypicker:
//            a2, p, a5, bl, 
//            ay, l, a1, bw, 
//            e, j, g, c

public class ImagePreview extends SherlockActivity
{

    public static int B;
    private static final String K[];
    private static b7 s;
    private Handler A;
    private ViewGroup C;
    private ThumbsGrid D;
    private l E;
    private boolean F;
    private View G;
    private View H;
    private int I;
    private HashMap J;
    private boolean b;
    private ViewGroup c;
    private TextView d;
    private Drawable e;
    private ImageView f;
    private Drawable g;
    private int h[];
    private int i;
    private int j;
    private cq k;
    private ViewPager l;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener m;
    private ArrayList n;
    private HashMap o;
    private float p;
    private ImageView q;
    private com.whatsapp.gallerypicker.a5 r;
    private Runnable t;
    private Uri u;
    private float v;
    private Handler w;
    private HashMap x;
    private HashMap y;
    private View z;

    public ImagePreview()
    {
        y = new HashMap();
        J = new HashMap();
        x = new HashMap();
        o = new HashMap();
        A = new Handler();
        h = new int[2];
        m = new a2(this);
        w = new Handler();
        t = new p(this);
    }

    static float a(ImagePreview imagepreview, float f1)
    {
        imagepreview.v = f1;
        return f1;
    }

    static Drawable a(ImagePreview imagepreview)
    {
        return imagepreview.e;
    }

    static Uri a(ImagePreview imagepreview, Uri uri)
    {
        imagepreview.u = uri;
        return uri;
    }

    static View a(ImagePreview imagepreview, View view)
    {
        imagepreview.z = view;
        return view;
    }

    private void a()
    {
        int i1 = B;
        D.removeAllViews();
        Iterator iterator = n.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ThumbImageView thumbimageview = new ThumbImageView(this, (Uri)iterator.next());
            D.addView(thumbimageview);
        } while (i1 == 0);
        if (n.size() < I)
        {
            D.addView(f);
        }
    }

    private void a(int i1)
    {
        int k1 = B;
        j = i1;
        int l1 = D.getChildCount();
        int j1 = 0;
        do
        {
label0:
            {
                if (j1 < l1)
                {
                    View view = D.getChildAt(j1);
                    boolean flag;
                    if (j1 == i1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    view.setSelected(flag);
                    if (k1 == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            j1++;
        } while (true);
    }

    private void a(Uri uri, View view)
    {
        n.remove(uri);
        y.remove(uri);
        J.remove(uri);
        x.remove(uri);
        o.remove(uri);
        D.removeView(view);
        r.notifyDataSetChanged();
        if (j >= n.size())
        {
            j = n.size() - 1;
        }
        if (j >= 0)
        {
            l.setCurrentItem(j);
            a(j);
        }
        if (n.size() == I - 1)
        {
            D.addView(f);
        }
        if (n.isEmpty())
        {
            finish();
        }
    }

    private void a(PhotoView photoview, Uri uri)
    {
        photoview.setTag(uri);
        Object obj;
        ay ay1;
        if (J.containsKey(uri))
        {
            obj = (Uri)J.get(uri);
        } else
        {
            obj = uri;
        }
        obj = new bl(this, Math.max(l.getMeasuredHeight(), l.getMeasuredWidth()), ((Uri) (obj)), uri);
        ay1 = new ay(this, photoview, uri);
        E.a(((bp) (obj)), ay1);
        if (y.containsKey(uri))
        {
            photoview.setRotation(((Integer)y.get(uri)).intValue(), false);
        }
    }

    static void a(ImagePreview imagepreview, int i1)
    {
        imagepreview.a(i1);
    }

    static void a(ImagePreview imagepreview, PhotoView photoview, Uri uri)
    {
        imagepreview.a(photoview, uri);
    }

    static boolean a(ImagePreview imagepreview, boolean flag)
    {
        imagepreview.b = flag;
        return flag;
    }

    static float b(ImagePreview imagepreview, float f1)
    {
        imagepreview.p = f1;
        return f1;
    }

    static int b(ImagePreview imagepreview, int i1)
    {
        imagepreview.i = i1;
        return i1;
    }

    static Handler b(ImagePreview imagepreview)
    {
        return imagepreview.w;
    }

    private void b()
    {
        int j1;
        j1 = B;
        if (E != null)
        {
            E.a();
            E = null;
        }
        com.whatsapp.gallerypicker.l.b();
        if (l == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 >= l.getChildCount()) goto _L2; else goto _L3
_L3:
        View view = l.getChildAt(i1);
        if (view instanceof PhotoView)
        {
            ((PhotoView)view).d();
        }
        if (j1 == 0) goto _L4; else goto _L2
_L2:
        App.aT();
        return;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static View c(ImagePreview imagepreview)
    {
        return imagepreview.G;
    }

    static cq d(ImagePreview imagepreview)
    {
        return imagepreview.k;
    }

    static ImageView e(ImagePreview imagepreview)
    {
        return imagepreview.q;
    }

    static boolean f(ImagePreview imagepreview)
    {
        return imagepreview.b;
    }

    static int g(ImagePreview imagepreview)
    {
        return imagepreview.i;
    }

    static HashMap h(ImagePreview imagepreview)
    {
        return imagepreview.J;
    }

    static int i(ImagePreview imagepreview)
    {
        return imagepreview.j;
    }

    static View j(ImagePreview imagepreview)
    {
        return imagepreview.z;
    }

    static HashMap k(ImagePreview imagepreview)
    {
        return imagepreview.o;
    }

    static View l(ImagePreview imagepreview)
    {
        return imagepreview.H;
    }

    static TextView m(ImagePreview imagepreview)
    {
        return imagepreview.d;
    }

    static boolean n(ImagePreview imagepreview)
    {
        return imagepreview.F;
    }

    static HashMap o(ImagePreview imagepreview)
    {
        return imagepreview.y;
    }

    static ThumbsGrid p(ImagePreview imagepreview)
    {
        return imagepreview.D;
    }

    static void q(ImagePreview imagepreview)
    {
        imagepreview.b();
    }

    static ViewGroup r(ImagePreview imagepreview)
    {
        return imagepreview.c;
    }

    static ArrayList s(ImagePreview imagepreview)
    {
        return imagepreview.n;
    }

    static ViewPager t(ImagePreview imagepreview)
    {
        return imagepreview.l;
    }

    static int[] u(ImagePreview imagepreview)
    {
        return imagepreview.h;
    }

    static HashMap v(ImagePreview imagepreview)
    {
        return imagepreview.x;
    }

    static Runnable w(ImagePreview imagepreview)
    {
        return imagepreview.t;
    }

    static ViewGroup x(ImagePreview imagepreview)
    {
        return imagepreview.C;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        int i2;
        int i1;
label0:
        {
            i2 = B;
            if (z == null)
            {
                break MISSING_BLOCK_LABEL_678;
            }
            if (motionevent.getAction() != 2)
            {
                break MISSING_BLOCK_LABEL_563;
            }
            c.setVisibility(0);
            C.getLocationOnScreen(h);
            C.setPadding((int)motionevent.getX() - h[0] - (int)p, (int)motionevent.getY() - h[1] - (int)v, 0, 0);
            G.setPadding(0, 0, 0, c.getHeight() - l.getHeight());
            d.getLocationOnScreen(h);
            i1 = h[1] + d.getHeight();
            int k1 = C.getHeight() - i1;
            if (k1 > 0)
            {
                i1 = (int)Math.min(100F, (((float)k1 - (motionevent.getY() - (float)i1)) * 100F) / (float)k1);
                if (i2 == 0)
                {
                    break label0;
                }
            }
            i1 = 0;
        }
label1:
        {
            int l1 = i1;
            if (i1 < 0)
            {
                l1 = 0;
            }
            if (l1 > 70)
            {
                G.setBackgroundColor((((l1 * 2) / 3) * 255) / 100 << 24);
                if (!F)
                {
                    int j1 = (l1 * 255) / 100;
                    d.setTextColor(j1 << 24 | 0xffffff);
                    e.setAlpha(j1);
                }
                G.clearAnimation();
                w.removeCallbacks(t);
            }
            boolean flag;
            if (l1 == 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && !F)
            {
                F = true;
                d.setTextColor(0xffff0000);
                d.setCompoundDrawablesWithIntrinsicBounds(g, null, null, null);
                float f1 = (0.5F * (float)C.getWidth()) / (float)d.getWidth();
                motionevent = new ScaleAnimation(1.0F, f1, 1.0F, f1, 1, 0.5F, 1, 0.5F);
                motionevent.setInterpolator(new BounceInterpolator());
                motionevent.setDuration(800L);
                motionevent.setFillAfter(true);
                d.clearAnimation();
                d.startAnimation(motionevent);
                q.invalidate();
                if (i2 == 0)
                {
                    break label1;
                }
            }
            if (!flag && F)
            {
                F = false;
                d.setTextColor(-1);
                d.setCompoundDrawablesWithIntrinsicBounds(e, null, null, null);
                float f2 = (0.5F * (float)C.getWidth()) / (float)d.getWidth();
                motionevent = new ScaleAnimation(f2, 1.0F, f2, 1.0F, 1, 0.5F, 1, 0.5F);
                motionevent.setInterpolator(new LinearInterpolator());
                motionevent.setDuration(500L);
                motionevent.setFillAfter(true);
                d.clearAnimation();
                d.startAnimation(motionevent);
                q.invalidate();
            }
        }
        z.invalidate();
        return true;
label2:
        {
            if (motionevent.getAction() == 1 && F)
            {
                a(u, z);
                if (i2 == 0)
                {
                    break label2;
                }
            }
            z.invalidate();
        }
        F = false;
        u = null;
        z = null;
        c.setVisibility(8);
        e.setAlpha(255);
        d.clearAnimation();
        d.setTextColor(0xffffff);
        d.setCompoundDrawablesWithIntrinsicBounds(e, null, null, null);
        w.removeCallbacks(t);
        return super.dispatchTouchEvent(motionevent);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 1 1: default 20
    //                   1 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (j1 == -1)
        {
            Uri uri = (Uri)n.get(j);
            Uri uri1 = Uri.fromFile(App.m(uri.getLastPathSegment()));
            J.put(uri, uri1);
            intent = (Rect)intent.getParcelableExtra(K[10]);
            if (intent != null)
            {
                x.put(uri, intent);
            }
            com.whatsapp.gallerypicker.l.a(uri.toString());
            intent = (PhotoView)l.findViewWithTag(uri);
            if (intent != null)
            {
                a(intent, uri);
            }
            ThumbImageView.a((ThumbImageView)D.getChildAt(j), uri);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        int i1;
        i1 = B;
        Log.i(K[8]);
        super.onCreate(bundle);
        App.aT();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        if (bundle != null) goto _L2; else goto _L1
_L1:
        Bundle bundle1;
        Bundle bundle2;
        n = getIntent().getParcelableArrayListExtra(K[1]);
        bundle2 = getIntent().getExtras();
        bundle1 = bundle2;
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        bundle1 = bundle2;
_L6:
        n = bundle.getParcelableArrayList(K[3]);
_L4:
        o = new HashMap();
        bundle = n.iterator();
        do
        {
            if (!bundle.hasNext())
            {
                break;
            }
            Uri uri = (Uri)bundle.next();
            String s1 = uri.getQueryParameter(K[4]);
            if (!TextUtils.isEmpty(s1))
            {
                o.put(uri, s1);
            }
        } while (i1 == 0);
        if (bundle1 != null)
        {
            y = (HashMap)bundle1.getSerializable(K[2]);
            if (y == null)
            {
                y = new HashMap();
            }
            J = (HashMap)bundle1.getSerializable(K[6]);
            if (J == null)
            {
                J = new HashMap();
            }
            x = (HashMap)bundle1.getSerializable(K[7]);
            if (x == null)
            {
                x = new HashMap();
            }
            bundle = (HashMap)bundle1.getSerializable(K[9]);
            if (bundle != null)
            {
                o = bundle;
            }
        }
        y.putAll(s);
        bundle = getIntent().getStringExtra(K[0]);
        if (!TextUtils.isEmpty(bundle))
        {
            getSupportActionBar().setTitle(com.whatsapp.util.c.b(bundle, getBaseContext()));
        }
        I = getIntent().getIntExtra(K[5], 0x7fffffff);
        if (n == null)
        {
            finish();
            return;
        }
        e = getResources().getDrawable(0x7f020564);
        g = getResources().getDrawable(0x7f020563);
        setContentView(0x7f030078);
        c = (ViewGroup)findViewById(0x7f0b0215);
        d = (TextView)findViewById(0x7f0b0217);
        G = findViewById(0x7f0b0216);
        C = (ViewGroup)findViewById(0x7f0b0218);
        q = new _cls2(this);
        q.setSelected(true);
        q.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        C.addView(q);
        l = (ViewPager)findViewById(0x7f0b012d);
        l.setPageMargin((int)(12F * getResources().getDisplayMetrics().density));
        r = new com.whatsapp.gallerypicker.a5(this, null);
        l.setAdapter(r);
        l.setOnPageChangeListener(new a1(this));
        bundle = (Button)findViewById(0x7f0b01bd);
        bundle.setText(0x7f0e0373);
        bundle.setOnClickListener(new bw(this));
        f = new _cls5(this);
        f.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        f.setImageResource(0x7f0204fb);
        f.setBackgroundResource(0x7f02063d);
        f.setOnClickListener(new e(this));
        k = new j(this, this);
        k.a(new g(this));
        ((Button)findViewById(0x7f0b01be)).setOnClickListener(new com.whatsapp.gallerypicker.c(this));
        bundle = (ViewGroup)findViewById(0x7f0b0214);
        D = new ThumbsGrid(this);
        bundle.addView(D);
        if (I == 0 && n.size() == 1)
        {
            bundle.setVisibility(4);
        }
        H = findViewById(0x7f0b0211);
        H.getViewTreeObserver().addOnGlobalLayoutListener(m);
        a();
        a(0);
        E = new l(getContentResolver(), A);
        return;
_L2:
        bundle1 = bundle;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0, 0, 0x7f0e0108).setIcon(0x7f020507).setShowAsAction(2);
        menu.add(0, 1, 0, 0x7f0e0363).setIcon(0x7f020516).setShowAsAction(2);
        if (App.u == 3)
        {
            a5.b(this);
        }
        return true;
    }

    protected void onDestroy()
    {
        Log.i(K[19]);
        super.onDestroy();
        H.getViewTreeObserver().removeGlobalOnLayoutListener(m);
        s.putAll(y);
        if (E != null)
        {
            E.a();
            E = null;
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (App.u == 3 && i1 == 84)
        {
            a5.a(this, false);
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public boolean onMenuItemSelected(int i1, android.view.MenuItem menuitem)
    {
        DialogToastActivity.a(menuitem);
        return super.onMenuItemSelected(i1, menuitem);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
label0:
        {
            Uri uri1;
label1:
            {
                switch (menuitem.getItemId())
                {
                default:
                    return false;

                case 16908332: 
                    finish();
                    return true;

                case 0: // '\0'
                    menuitem = new Intent(this, com/whatsapp/wallpaper/CropImage);
                    Uri uri = (Uri)n.get(j);
                    menuitem.putExtra(K[15], false);
                    menuitem.putExtra(K[11], false);
                    menuitem.putExtra(K[18], false);
                    menuitem.putExtra(K[13], au2.d);
                    menuitem.putExtra(K[17], Uri.fromFile(App.m(uri.getLastPathSegment())));
                    menuitem.putExtra(K[16], android.graphics.Bitmap.CompressFormat.JPEG.toString());
                    menuitem.setData(uri);
                    if (x.containsKey(uri))
                    {
                        Rect rect = (Rect)x.get(uri);
                        menuitem.putExtra(K[14], rect);
                    }
                    if (y.containsKey(uri))
                    {
                        menuitem.putExtra(K[12], (Serializable)y.get(uri));
                    }
                    startActivityForResult(menuitem, 1);
                    return true;

                case 1: // '\001'
                    break;
                }
                if (j < 0)
                {
                    break label0;
                }
                uri1 = (Uri)n.get(j);
                Integer integer = (Integer)y.get(uri1);
                menuitem = integer;
                if (integer == null)
                {
                    menuitem = Integer.valueOf(0);
                }
                integer = Integer.valueOf(menuitem.intValue() + 90);
                menuitem = integer;
                if (integer.intValue() >= 360)
                {
                    menuitem = Integer.valueOf(integer.intValue() - 360);
                }
                if (menuitem.intValue() == 0)
                {
                    y.remove(uri1);
                    if (B == 0)
                    {
                        break label1;
                    }
                }
                y.put(uri1, menuitem);
            }
            D.getChildAt(j).invalidate();
            menuitem = (PhotoView)l.findViewWithTag(uri1);
            if (menuitem != null)
            {
                menuitem.c();
            }
        }
        return true;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList(K[21], n);
        bundle.putSerializable(K[20], y);
        bundle.putSerializable(K[22], J);
        bundle.putSerializable(K[24], x);
        bundle.putSerializable(K[23], o);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[25];
        obj = "UB|pzNBqm";
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
                obj = "FI{keNC1pdSBqm$B_kkk\ttKKOfj";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "UHkx~NHqj";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "RUvj";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "DFomcHI";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "JFgFcSBrj";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "DUpi\177UNl";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "DUpixBDkj";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "NJ~~oWUzocBP0zxBFk|";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "DFomcHIl";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                obj = "UB|m";
                byte0 = 9;
                i1 = 10;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "DUpiH^hjmzRSLppB";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "UHkx~NHq";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "JFgZxHW";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "NIvmcFKM|iS";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "TD~uorWV\177DBB{|n";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "HRki\177SapkgFS";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "HRki\177S";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "AK~m~BIMv~FSvvd";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "NJ~~oWUzocBP0}oTSmvs";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "UHkx~NHqj";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "RUvj";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "DUpi\177UNl";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "DFomcHIl";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "DUpixBDkj";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                K = as;
                s = new b7(256);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 644
    //                   0 667
    //                   1 674
    //                   2 681
    //                   3 688;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_688;
_L3:
        byte byte1 = 10;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 39;
          goto _L9
_L5:
        byte1 = 39;
          goto _L9
_L6:
        byte1 = 31;
          goto _L9
        byte1 = 25;
          goto _L9
    }

    private class ThumbsGrid extends ViewGroup
    {

        int a;
        final ImagePreview b;

        protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
        {
            l1 = ImagePreview.B;
            int i2 = getChildCount();
            if (a != 0)
            {
                int j2 = (int)(2.0F * getResources().getDisplayMetrics().density);
                int k2 = (k1 - i1) / a;
                k1 = 0;
                do
                {
                    if (k1 >= i2)
                    {
                        break;
                    }
                    View view = getChildAt(k1);
                    int i3 = k1 / a;
                    int l2 = (k1 % a) * k2;
                    i3 *= k2;
                    view.layout(i1 + l2 + j2, j1 + i3 + j2, (l2 + i1 + k2) - j2, (i3 + j1 + k2) - j2);
                    k1++;
                } while (l1 == 0);
            }
        }

        public void onMeasure(int i1, int j1)
        {
            byte byte0 = 2;
            super.onMeasure(i1, j1);
            i1 = (int)(72F * getResources().getDisplayMetrics().density);
            int k1 = getChildCount();
            j1 = getMeasuredWidth();
            if (k1 > 0 && j1 > 0)
            {
                a = j1 / i1;
                i1 = ((a + k1) - 1) / a;
                if (k1 % a == 1)
                {
                    a = a + 1;
                    i1 = ((a + k1) - 1) / a;
                }
                if (i1 > 2)
                {
                    a = ((k1 + 2) - 1) / 2;
                    i1 = byte0;
                }
                j1 /= a;
                setMeasuredDimension(getMeasuredWidth(), i1 * j1);
            }
        }

        public ThumbsGrid(Context context)
        {
            b = ImagePreview.this;
            super(context);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                setLayoutTransition(new LayoutTransition());
            }
        }
    }


    private class ThumbImageView extends MediaGalleryImageView
    {

        private Uri A;
        private Matrix B;
        final ImagePreview z;

        static Uri a(ThumbImageView thumbimageview)
        {
            return thumbimageview.A;
        }

        private void a(Uri uri)
        {
            A = uri;
            int i1 = (int)(72F * getResources().getDisplayMetrics().density);
            if (ImagePreview.h(z).containsKey(uri))
            {
                uri = (Uri)ImagePreview.h(z).get(uri);
            }
            setBackgroundResource(0x7f090025);
            (new bt(this, uri, i1)).execute(new Void[0]);
        }

        static void a(ThumbImageView thumbimageview, Uri uri)
        {
            thumbimageview.a(uri);
        }

        public void onDraw(Canvas canvas)
        {
            canvas.save();
            if (ImagePreview.j(z) == this)
            {
                canvas.drawColor(0xff111111);
                return;
            }
            y = false;
            if (ImagePreview.o(z).containsKey(A))
            {
                int i1 = ((Integer)ImagePreview.o(z).get(A)).intValue();
                B.setRotate(i1, getWidth() / 2, getHeight() / 2);
                canvas.concat(B);
            }
            super.onDraw(canvas);
            canvas.restore();
        }

        protected void onMeasure(int i1, int j1)
        {
            i1 = getDefaultSize(getSuggestedMinimumHeight(), j1);
            setMeasuredDimension(i1, i1);
        }

        public ThumbImageView(Context context, Uri uri)
        {
            z = ImagePreview.this;
            super(context);
            B = new Matrix();
            setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            a(uri);
            setOnClickListener(new bf(this, ImagePreview.this));
            setOnTouchListener(new a3(this, ImagePreview.this));
        }
    }


    private class _cls2 extends MediaGalleryImageView
    {

        final ImagePreview z;

        public void onDraw(Canvas canvas)
        {
            super.onDraw(canvas);
            if (ImagePreview.n(z))
            {
                canvas.drawColor(0x66ff0000);
            }
        }

        protected void onMeasure(int i1, int j1)
        {
            i1 = getDefaultSize(getSuggestedMinimumWidth(), i1);
            setMeasuredDimension(i1, i1);
        }

        _cls2(Context context)
        {
            z = ImagePreview.this;
            super(context);
        }
    }


    private class _cls5 extends ImageView
    {

        final ImagePreview a;

        public void onDraw(Canvas canvas)
        {
            if (!isSelected() && !isPressed())
            {
                canvas.drawColor(0xff111111);
            }
            super.onDraw(canvas);
        }

        protected void onMeasure(int i1, int j1)
        {
            i1 = getDefaultSize(getSuggestedMinimumHeight(), j1);
            setMeasuredDimension(i1, i1);
        }

        _cls5(Context context)
        {
            a = ImagePreview.this;
            super(context);
        }
    }

}
