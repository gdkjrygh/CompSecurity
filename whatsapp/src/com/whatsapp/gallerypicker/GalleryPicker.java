// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.iz;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ac, bs, a, aa, 
//            ag, ImagePreview, au, ai, 
//            l, b_, ad, aj, 
//            ar, bm, a4, bd, 
//            x, d, av, u, 
//            h, s, ak, y, 
//            a8, ImageGallery, b1

public class GalleryPicker extends SherlockActivity
{

    private static final String e;
    private static final bs o[];
    private static final String z[];
    private boolean b;
    ArrayList c;
    private Thread d;
    volatile boolean f;
    private GridView g;
    private int h;
    private l i;
    private ContentObserver j;
    private boolean k;
    private int l;
    private Drawable m;
    private View n;
    private int p;
    private aa q;
    private Handler r;
    private BroadcastReceiver s;

    public GalleryPicker()
    {
        h = 1;
        r = new Handler();
        f = false;
        c = new ArrayList();
    }

    static int a(GalleryPicker gallerypicker, int i1)
    {
        gallerypicker.h = i1;
        return i1;
    }

    static Drawable a(GalleryPicker gallerypicker)
    {
        return gallerypicker.m;
    }

    private ai a(int i1, String s1, ContentResolver contentresolver)
    {
        s1 = ac.a(contentresolver, a.EXTERNAL, i1, 2, s1);
        c.add(s1);
        return s1;
    }

    private void a()
    {
        if (n == null)
        {
            ViewGroup viewgroup = (ViewGroup)findViewById(0x7f0b01e5);
            getLayoutInflater().inflate(0x7f03006b, viewgroup);
            n = findViewById(0x7f0b01e8);
        }
        n.setVisibility(0);
    }

    private void a(int i1)
    {
        ((ag)q.d.get(i1)).a(this);
    }

    private void a(Intent intent)
    {
label0:
        {
            int i1 = ImagePreview.B;
            intent = intent.getAction();
            if (intent.equals(z[45]))
            {
                Log.i(z[49]);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (intent.equals(z[44]))
            {
                Log.i(z[46]);
                a(true, false);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (intent.equals(z[50]))
            {
                Log.i(z[47]);
                a(false, true);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (intent.equals(z[51]))
            {
                Log.i(z[48]);
                a(false, false);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (intent.equals(z[42]))
            {
                Log.i(z[43]);
                a(true, false);
            }
        }
    }

    private void a(ContextMenu contextmenu, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
    }

    static void a(GalleryPicker gallerypicker, Intent intent)
    {
        gallerypicker.a(intent);
    }

    static void a(GalleryPicker gallerypicker, ContextMenu contextmenu, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        gallerypicker.a(contextmenu, contextmenuinfo);
    }

    static void a(GalleryPicker gallerypicker, ag ag1)
    {
        gallerypicker.a(ag1);
    }

    static void a(GalleryPicker gallerypicker, boolean flag, boolean flag1)
    {
        gallerypicker.a(flag, flag1);
    }

    static void a(GalleryPicker gallerypicker, boolean flag, boolean flag1, boolean flag2)
    {
        gallerypicker.a(flag, flag1, flag2);
    }

    private void a(ag ag1)
    {
        if (q.getCount() == 0)
        {
            b();
        }
        q.a(ag1);
        q.b();
    }

    private void a(boolean flag, boolean flag1)
    {
        a(flag, flag1, false);
    }

    private void a(boolean flag, boolean flag1, boolean flag2)
    {
        Log.i((new StringBuilder()).append(z[14]).append(flag).append(z[17]).append(flag1).append(z[16]).append(b).append(z[15]).append(k).toString());
        if (flag != b || flag1 != k || flag2) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i();
        b = flag;
        k = flag1;
        a(k);
        if (!b)
        {
            break; /* Loop/switch isn't completed */
        }
        a();
        if (ImagePreview.B == 0) goto _L1; else goto _L3
_L3:
        b();
        m();
        return;
    }

    static boolean a(GalleryPicker gallerypicker, boolean flag)
    {
        gallerypicker.k = flag;
        return flag;
    }

    private void b()
    {
        if (n != null)
        {
            n.setVisibility(8);
        }
    }

    static void b(GalleryPicker gallerypicker, int i1)
    {
        gallerypicker.a(i1);
    }

    static boolean b(GalleryPicker gallerypicker)
    {
        return gallerypicker.k;
    }

    static int c(GalleryPicker gallerypicker)
    {
        return gallerypicker.p;
    }

    private void c()
    {
        boolean flag = ac.a(getContentResolver());
        r.post(new au(this, flag));
    }

    static int d(GalleryPicker gallerypicker)
    {
        return gallerypicker.h;
    }

    private void d()
    {
        if (!k && q.d.size() == 0)
        {
            a();
        }
    }

    static l e(GalleryPicker gallerypicker)
    {
        return gallerypicker.i;
    }

    private void e()
    {
        int i1 = ImagePreview.B;
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((ai)iterator.next()).b();
        } while (i1 == 0);
        c.clear();
    }

    private void f()
    {
        q = new aa(this, getLayoutInflater());
        g.setAdapter(q);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(z[5]);
        intentfilter.addAction(z[6]);
        intentfilter.addAction(z[8]);
        intentfilter.addAction(z[9]);
        intentfilter.addAction(z[7]);
        intentfilter.addDataScheme(z[4]);
        registerReceiver(s, intentfilter);
        getContentResolver().registerContentObserver(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, j);
        i = new l(getContentResolver(), r);
        b = false;
        k = false;
        m();
    }

    static void f(GalleryPicker gallerypicker)
    {
        gallerypicker.l();
    }

    static int g(GalleryPicker gallerypicker)
    {
        return gallerypicker.l;
    }

    private void g()
    {
        if (i != null)
        {
            i();
            i.a();
            i = null;
            unregisterReceiver(s);
            getContentResolver().unregisterContentObserver(j);
            q = null;
            g.setAdapter(null);
        }
    }

    private void h()
    {
        ai aai[];
        int i1;
        int j1;
        int k1;
        j1 = ImagePreview.B;
        k1 = o.length;
        aai = new ai[k1];
        i1 = 0;
_L8:
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        Object obj = o[i1];
        if ((((bs) (obj)).b & h) == 0 && j1 == 0) goto _L4; else goto _L3
_L3:
        if (!f) goto _L5; else goto _L2
_L2:
        return;
_L5:
        aai[i1] = a(((bs) (obj)).b & h, ((bs) (obj)).d, getContentResolver());
        if (aai[i1].e())
        {
            aai[i1].b();
            if (j1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (i1 == 2 && aai[0].d() == aai[2].d())
        {
            aai[i1].b();
            if (j1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (i1 == 3 && aai[1].d() == aai[3].d())
        {
            aai[i1].b();
            if (j1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        obj = new ag(this, ((bs) (obj)).c, h, ((bs) (obj)).d, getResources().getString(((bs) (obj)).a), aai[i1].a(0), aai[i1].d());
        aai[i1].b();
        r.post(new b_(this, ((ag) (obj))));
_L4:
        if (j1 != 0) goto _L2; else goto _L6
_L6:
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void h(GalleryPicker gallerypicker)
    {
        gallerypicker.d();
    }

    private void i()
    {
        if (d != null)
        {
            ad.a().a(d, getContentResolver());
            f = true;
            try
            {
                d.join();
            }
            catch (InterruptedException interruptedexception)
            {
                Log.i(z[3]);
            }
            d = null;
            r.removeMessages(0);
            q.a();
            q.b();
            e();
        }
    }

    static boolean i(GalleryPicker gallerypicker)
    {
        return gallerypicker.b;
    }

    private void j()
    {
        int i1 = ImagePreview.B;
        Cursor cursor = getContentResolver().query(Uri.parse(z[13]), null, null, null, null);
        if (cursor != null)
        {
            do
            {
                if (!cursor.moveToNext())
                {
                    break;
                }
                Object obj1 = cursor.getString(0);
                String s1 = cursor.getString(1);
                if (f && i1 == 0)
                {
                    break;
                }
                Object obj;
                if (h == 4)
                {
                    obj = new aj(getContentResolver(), 2, ((String) (obj1)));
                } else
                {
                    obj = new a4(getContentResolver(), 2, ((String) (obj1)));
                }
                if (!((ar) (obj)).e())
                {
                    obj1 = new ag(this, 6, h, ((String) (obj1)), s1, ((ar) (obj)).a(0), ((ar) (obj)).d());
                    r.post(new bm(this, ((ag) (obj1))));
                }
                ((ar) (obj)).b();
            } while (i1 == 0);
            cursor.close();
        }
    }

    private void k()
    {
        Object obj;
        int i1;
label0:
        {
            i1 = ImagePreview.B;
            if (!b)
            {
                obj = ac.a(getContentResolver(), a.EXTERNAL, h, 2, null);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            obj = ac.b();
        }
        if (!f) goto _L2; else goto _L1
_L1:
        ((ai) (obj)).b();
_L4:
        return;
_L2:
        ArrayList arraylist;
        arraylist = new ArrayList(((ai) (obj)).c().entrySet());
        Collections.sort(arraylist, new bd(this));
        ((ai) (obj)).b();
        if (f) goto _L4; else goto _L3
_L3:
        obj = arraylist.iterator();
_L7:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L5
_L5:
        Object obj1;
        String s1;
        obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
        s1 = (String)((java.util.Map.Entry) (obj1)).getKey();
        if (s1 == null && i1 == 0) goto _L7; else goto _L6
_L6:
        if (f) goto _L4; else goto _L8
_L8:
        if (!s1.equals(e))
        {
            ai ai1 = a(h, s1, getContentResolver());
            if (!ai1.e())
            {
                obj1 = new ag(this, 5, h, s1, (String)((java.util.Map.Entry) (obj1)).getValue(), ai1.a(0), ai1.d());
                r.post(new x(this, ((ag) (obj1))));
            }
            ai1.b();
        }
        if (i1 != 0)
        {
            return;
        }
          goto _L7
    }

    private void l()
    {
        c();
        if (!f)
        {
            h();
            if (!f)
            {
                k();
                if (!f)
                {
                    j();
                    if (!f)
                    {
                        r.post(new d(this));
                        return;
                    }
                }
            }
        }
    }

    private void m()
    {
        f = false;
        d = new av(this, z[0]);
        ad.a().a(d);
        d.start();
    }

    public void a(boolean flag)
    {
        setSupportProgressBarIndeterminateVisibility(flag);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        int k1 = ImagePreview.B;
        i1;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 29
    //                   1 87;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (h == 4)
        {
            intent.putExtra(z[2], true);
        }
        setResult(-1, intent);
        finish();
        if (k1 == 0) goto _L1; else goto _L4
_L4:
        if (j1 != 2) goto _L1; else goto _L5
_L5:
        setResult(2);
        finish();
        if (k1 == 0) goto _L1; else goto _L3
_L3:
        if (j1 == -1)
        {
            if (h == 4)
            {
                intent.putExtra(z[1], true);
            }
            setResult(-1, intent);
        }
        finish();
        return;
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            int i1 = ImagePreview.B;
            Log.i(z[27]);
            super.onCreate(bundle);
            requestWindowFeature(5L);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            Object obj = getSupportActionBar();
            ((ActionBar) (obj)).setDisplayHomeAsUpEnabled(true);
            ((ActionBar) (obj)).setDisplayShowTitleEnabled(false);
            ((ActionBar) (obj)).setDisplayShowCustomEnabled(true);
            ((ActionBar) (obj)).setIcon(new u(this));
            h = getIntent().getIntExtra(z[23], -1);
            if (h == -1)
            {
                h = getSharedPreferences(z[19], 0).getInt(z[32], 1);
            }
            bundle = iz.a(getLayoutInflater(), 0x7f030068, null);
            ((ActionBar) (obj)).setCustomView(bundle);
            obj = bundle.findViewById(0x7f0b01e1);
            bundle = bundle.findViewById(0x7f0b01e3);
            ((View) (obj)).setOnClickListener(new h(this, ((View) (obj)), bundle));
            bundle.setOnClickListener(new s(this, ((View) (obj)), bundle));
            setContentView(0x7f030069);
            l = getResources().getColor(0x7f090025);
            m = new ColorDrawable(l);
            p = getResources().getDimensionPixelSize(0x7f0a003a);
            g = (GridView)findViewById(0x7f0b01e6);
            g.setOnItemClickListener(new ak(this));
            g.setOnCreateContextMenuListener(new y(this));
            s = new _cls6();
            j = new a8(this, r);
            if (h == 1)
            {
                ((View) (obj)).setSelected(true);
                if (i1 == 0)
                {
                    break label0;
                }
                DialogToastActivity.g++;
            }
            if (h == 4)
            {
                bundle.setSelected(true);
            }
        }
        bundle = getIntent().getParcelableArrayListExtra(z[22]);
        Object obj1 = (Uri)getIntent().getParcelableExtra(z[28]);
        if (obj1 != null)
        {
            obj1 = new Intent(z[21], ((Uri) (obj1)));
            ((Intent) (obj1)).putExtra(z[18], h);
            ((Intent) (obj1)).putExtra(z[36], getIntent().getBooleanExtra(z[20], true));
            ((Intent) (obj1)).putExtra(z[24], getIntent().getStringExtra(z[34]));
            ((Intent) (obj1)).putExtra(z[26], getIntent().getStringExtra(z[29]));
            ((Intent) (obj1)).putExtra(z[25], getIntent().getLongExtra(z[33], 0x7fffffffffffffffL));
            ((Intent) (obj1)).putExtra(z[30], getIntent().getIntExtra(z[35], 0x7fffffff));
            ((Intent) (obj1)).putExtra(z[31], bundle);
            ((Intent) (obj1)).setClass(this, com/whatsapp/gallerypicker/ImageGallery);
            startActivityForResult(((Intent) (obj1)), 0);
        }
        f();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        Intent intent;
        PackageManager packagemanager;
        List list;
        int i1;
        int j1;
        int k1;
label0:
        {
            i1 = 0;
            j1 = ImagePreview.B;
            if (h == 4)
            {
                intent = new Intent(z[37], android.provider.MediaStore.Video.Media.INTERNAL_CONTENT_URI);
                intent.setType(z[39]);
                if (j1 == 0)
                {
                    break label0;
                }
            }
            intent = new Intent(z[40], android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            intent.setType(z[41]);
        }
        packagemanager = getPackageManager();
        list = packagemanager.queryIntentActivities(intent, 0);
        k1 = list.size();
        if (k1 <= 0) goto _L2; else goto _L1
_L1:
        SubMenu submenu;
        getSharedPreferences(z[38], 0);
        getSupportMenuInflater().inflate(0x7f100000, menu);
        submenu = menu.findItem(0x7f0b02f3).getSubMenu();
        submenu.clear();
        menu.findItem(0x7f0b02f2).setVisible(false);
_L6:
        if (i1 >= k1) goto _L2; else goto _L3
_L3:
        menu = (ResolveInfo)list.get(i1);
        Drawable drawable = menu.loadIcon(packagemanager);
        MenuItem menuitem = submenu.add(menu.loadLabel(packagemanager));
        menuitem.setIcon(drawable);
        menuitem.setOnMenuItemClickListener(new b1(this, menu, intent));
        if (j1 == 0) goto _L4; else goto _L2
_L2:
        return true;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onDestroy()
    {
        Log.i(z[11]);
        super.onDestroy();
        g();
        com.whatsapp.gallerypicker.l.b();
        getSharedPreferences(z[12], 0).edit().putInt(z[10], h).commit();
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

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return super.onPrepareOptionsMenu(menu);
    }

    public void onStart()
    {
        super.onStart();
    }

    public void onStop()
    {
        super.onStop();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[52];
        obj = "\177\005& \032J\035\032%\034S\0018l(W\026!)\r";
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
                obj = "N\r.)\020";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "N\r.)\020";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "_\005& \032J\035:%\034S\0018c\025W\r$l\026V\020/>\rM\024>)\033";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "^\r&)";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\007\t;q%\025\0010m*\036\t;";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\007\t;q%\025\0311u+\037\002+} ";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\007\t;q%\025\t5}'\036";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\007\t;q%\025\037<y*\004\t-g7\036\r-l!\016";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\007\t;q%\025\037<y*\004\t-g\"\003\0026k,\017\b";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "_\005& \032J\035:%\034S\0018%\021[\b?(\032";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "_\005& \032J\035:%\034S\0018c\033]\027>>\020A";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "[\013'b\bP\005>?\036H\024\025<\r]\002/>\032V\007/?";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "[\013$8\032V\020pcP[\013'b\bP\005>?\036H\024d<\rW\022#(\032JJ')\033Q\005e.\n[\017/8\f";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "_\005& \032J\035:%\034S\0018c\r]\006+'\032\030\021$!\020M\n>)\033\002";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "\030\013&(\f[\005$\"\026V\003p";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "\030\013&(\nV\t%9\021L\001.v";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "\030\027)-\021V\r$+E";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "Q\n) \n\\\001\025!\032\\\r+";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "[\013'b\bP\005>?\036H\024\025<\r]\002/>\032V\007/?";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "H\026/:\026]\023";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\034\005:o";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "Y\n.>\020Q\000d%\021L\001$8Q]\034>>\036\0267\036\036:y)";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "Q\n) \n\\\001\025!\032\\\r+";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "N\0018.";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "U\0052\023\tQ\000/# K\r0)";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "J\001)%\017Q\001$8";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "_\005& \032J\035:%\034S\0018c\034J\001+8\032";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "Z\021)'\032L;?>\026";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "J\001)%\017Q\001$8";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "U\0052\023\026L\001'?";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "Y\n.>\020Q\000d%\021L\001$8Q]\034>>\036\0267\036\036:y)";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "_\005& \032J\035:%\034S\0018%\021[\b?(\032";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "U\0052\023\tQ\000/# K\r0)";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "N\0018.";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "U\0052\023\026L\001'?";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "H\026/:\026]\023";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\032\005<s";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "[\013'b\bP\005>?\036H\024\025<\r]\002/>\032V\007/?";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "N\r.)\020\027N";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\032\005<s";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "Q\t++\032\027N";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\007\t;q%\025\t5}'\036";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "_\005& \032J\035:%\034S\0018c\r]\007/%\t]\t/(\026Y\0068#\036\\\007+?\013\027%\t\0306w*\025\001:|-\013\023:r!\t\030";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\007\t;q%\025\0311u+\037\002+} ";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\007\t;q%\025\0010m*\036\t;";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "_\005& \032J\035:%\034S\0018c\r]\007/%\t]\t/(\026Y\0068#\036\\\007+?\013\027%\t\0306w*\025\001:|-\013\023*v)\005\0311l!\016";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = "_\005& \032J\035:%\034S\0018c\r]\007/%\t]\t/(\026Y\0068#\036\\\007+?\013\027%\t\0306w*\025\001:|-\013\023,{%\004\002:j;\031\030>j0\017\b";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = "_\005& \032J\035:%\034S\0018c\r]\007/%\t]\t/(\026Y\0068#\036\\\007+?\013\027%\t\0306w*\025\001:|-\013\023,{%\004\002:j;\f\0051q7\002\t;";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = "_\005& \032J\035:%\034S\0018c\r]\007/%\t]\t/(\026Y\0068#\036\\\007+?\013\027%\t\0306w*\025\001:|-\013\0232w1\004\030:|";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i1] = ((String) (obj));
                i1 = 50;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\007\t;q%\025\037<y*\004\t-g7\036\r-l!\016";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i1] = ((String) (obj));
                i1 = 51;
                obj = "Y\n.>\020Q\000d%\021L\001$8QY\007>%\020VJ\007\t;q%\025\037<y*\004\t-g\"\003\0026k,\017\b";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[i1] = ((String) (obj));
                z = as;
                e = ac.b;
                o = (new bs[] {
                    new bs(2, 1, ac.b, 0x7f0e0198), new bs(3, 4, ac.b, 0x7f0e019a), new bs(0, 1, null, 0x7f0e0034), new bs(1, 4, null, 0x7f0e0036)
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 1304
    //                   0 1327
    //                   1 1334
    //                   2 1341
    //                   3 1348;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1348;
_L3:
        byte byte1 = 127;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 56;
          goto _L9
_L5:
        byte1 = 100;
          goto _L9
_L6:
        byte1 = 74;
          goto _L9
        byte1 = 76;
          goto _L9
    }

    private class _cls6 extends BroadcastReceiver
    {

        final GalleryPicker a;

        public void onReceive(Context context, Intent intent)
        {
            GalleryPicker.a(a, intent);
        }

        _cls6()
        {
            a = GalleryPicker.this;
            super();
        }
    }

}
