// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Environment;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.y;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

// Referenced classes of package com.whatsapp:
//            DialogToastListActivity, n4, MediaGalleryImageView, App, 
//            abl, a1g, bt, a9w, 
//            k, og, aoz, n3, 
//            ak1, j8, a8j, zj

public class MediaGallery extends DialogToastListActivity
{

    private static SimpleDateFormat F;
    private static final String G[];
    private static a1g x;
    public static MediaGallery z;
    private android.view.View.OnLongClickListener A;
    protected ListView B;
    private PinnedHeaderLayout C;
    private ArrayList D;
    private bt E;
    private a9w i;
    private int j;
    private String k;
    private Display l;
    private TextView m;
    private TreeMap n;
    private bt o;
    private bt p;
    private ActionMode q;
    private int r;
    private android.view.View.OnClickListener s;
    private HashMap t;
    private com.actionbarsherlock.view.ActionMode.Callback u;
    private MenuItem v;
    private TextView w;
    private Calendar y;

    public MediaGallery()
    {
        j = 4;
        n = new TreeMap();
        t = new HashMap();
        u = new n4(this);
    }

    static TextView a(MediaGallery mediagallery, TextView textview)
    {
        mediagallery.w = textview;
        return textview;
    }

    static ActionMode a(MediaGallery mediagallery, ActionMode actionmode)
    {
        mediagallery.q = actionmode;
        return actionmode;
    }

    static MenuItem a(MediaGallery mediagallery, MenuItem menuitem)
    {
        mediagallery.v = menuitem;
        return menuitem;
    }

    static PinnedHeaderLayout a(MediaGallery mediagallery)
    {
        return mediagallery.C;
    }

    static a1g a()
    {
        return x;
    }

    static void a(MediaGallery mediagallery, c4 c4_1, int i1, MediaGalleryImageView mediagalleryimageview)
    {
        mediagallery.a(c4_1, i1, mediagalleryimageview);
    }

    static void a(MediaGallery mediagallery, c4 c4_1, View view)
    {
        mediagallery.a(c4_1, view);
    }

    private void a(c4 c4_1, int i1, MediaGalleryImageView mediagalleryimageview)
    {
        if (c4_1 == null)
        {
            try
            {
                Log.e(G[10]);
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        i1 = c4_1.w;
        i1;
        JVM INSTR tableswitch 1 3: default 44
    //                   1 60
    //                   2 48
    //                   3 60;
           goto _L1 _L2 _L3 _L2
_L1:
        return;
_L3:
        mediagalleryimageview.setImageResource(0x7f0205a0);
        if (App.am == 0) goto _L1; else goto _L2
_L2:
        com.whatsapp.util.y.c(c4_1, mediagalleryimageview, null);
        return;
        c4_1;
        throw c4_1;
        c4_1;
        throw c4_1;
    }

    private void a(c4 c4_1, View view)
    {
        int i1;
        boolean flag;
        try
        {
            flag = t.containsKey(c4_1.y);
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        t.remove(c4_1.y);
        view.setSelected(false);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        t.put(c4_1.y, c4_1);
        view.setSelected(true);
        boolean flag1;
        try
        {
            c4_1 = v;
            i1 = t.size();
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (i1 <= 10)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        c4_1.setVisible(flag1);
        w.setText(String.format(App.j.a(0x7f0d001e, t.size()), new Object[] {
            Integer.valueOf(t.size())
        }));
        return;
    }

    private int b()
    {
        int i1 = x.H;
        int j1 = x.p;
        int k1 = (int)x.j;
        j = l.getWidth() / (i1 + j1 * 2 + k1);
        Log.i((new StringBuilder()).append(G[0]).append(j).toString());
        r = (l.getWidth() - (int)x.j * (j + 2)) / j;
        Log.i((new StringBuilder()).append(G[1]).append(l.getWidth() - r * j - (int)x.j * (j - 1)).toString());
        return r;
    }

    static MenuItem b(MediaGallery mediagallery)
    {
        return mediagallery.v;
    }

    static ActionMode c(MediaGallery mediagallery)
    {
        return mediagallery.q;
    }

    static a9w d(MediaGallery mediagallery)
    {
        return mediagallery.i;
    }

    static String e(MediaGallery mediagallery)
    {
        return mediagallery.k;
    }

    static SimpleDateFormat f()
    {
        return F;
    }

    static HashMap f(MediaGallery mediagallery)
    {
        return mediagallery.t;
    }

    static com.actionbarsherlock.view.ActionMode.Callback g(MediaGallery mediagallery)
    {
        return mediagallery.u;
    }

    static TextView h(MediaGallery mediagallery)
    {
        return mediagallery.m;
    }

    static int i(MediaGallery mediagallery)
    {
        return mediagallery.r;
    }

    static android.view.View.OnClickListener j(MediaGallery mediagallery)
    {
        return mediagallery.s;
    }

    static TextView k(MediaGallery mediagallery)
    {
        return mediagallery.w;
    }

    static TreeMap l(MediaGallery mediagallery)
    {
        return mediagallery.n;
    }

    static ArrayList m(MediaGallery mediagallery)
    {
        return mediagallery.D;
    }

    static int n(MediaGallery mediagallery)
    {
        return mediagallery.j;
    }

    static android.view.View.OnLongClickListener o(MediaGallery mediagallery)
    {
        return mediagallery.A;
    }

    public bt a(long l1)
    {
        Object obj;
label0:
        {
            obj = Calendar.getInstance();
            try
            {
                ((Calendar) (obj)).setTime(new Date(l1));
                if (!((Calendar) (obj)).after(o))
                {
                    break label0;
                }
                obj = o;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((bt) (obj));
        }
label1:
        {
            try
            {
                if (!((Calendar) (obj)).after(p))
                {
                    break label1;
                }
                obj = p;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((bt) (obj));
        }
label2:
        {
            try
            {
                if (!((Calendar) (obj)).after(E))
                {
                    break label2;
                }
                obj = E;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((bt) (obj));
        }
label3:
        {
            try
            {
                if (!((Calendar) (obj)).after(y))
                {
                    break label3;
                }
                obj = new bt(this, 4, new GregorianCalendar(((Calendar) (obj)).get(1), ((Calendar) (obj)).get(2), 1));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((bt) (obj));
        }
        return new bt(this, 5, new GregorianCalendar(((Calendar) (obj)).get(1), 1, 1));
    }

    public void d()
    {
        Log.i(G[4]);
        B.removeAllViewsInLayout();
    }

    public void e()
    {
        int i1 = App.am;
        n.clear();
        Iterator iterator = D.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c4 c4_1 = (c4)iterator.next();
            bt bt1 = a(c4_1.I);
            ArrayList arraylist1 = (ArrayList)n.get(bt1);
            ArrayList arraylist = arraylist1;
            if (arraylist1 == null)
            {
                arraylist = new ArrayList();
                n.put(bt1, arraylist);
            }
            arraylist.add(c4_1);
        } while (i1 == 0);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        int j1 = App.am;
        super.onConfigurationChanged(configuration);
        b();
        i.a();
        i.notifyDataSetChanged();
        int k1 = B.getFirstVisiblePosition();
        int i1 = a9w.a(i).size() - 1;
        do
        {
label0:
            {
label1:
                {
                    if (i1 < 0)
                    {
                        break label1;
                    }
                    int l1 = a9w.a(i).keyAt(i1);
                    if (l1 <= k1)
                    {
                        try
                        {
                            m.setText(((bt)a9w.a(i).get(l1)).toString());
                        }
                        // Misplaced declaration of an exception variable
                        catch (Configuration configuration)
                        {
                            throw configuration;
                        }
                        if (j1 == 0)
                        {
                            break label1;
                        }
                    }
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            i1--;
        } while (true);
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            int j1 = App.am;
            String s1;
            boolean flag;
            try
            {
                Log.i(G[5]);
                super.onCreate(bundle);
                App.aT();
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                setContentView(0x7f03007d);
                if (x == null)
                {
                    x = a1g.a();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            z = this;
            o = new bt(this, 1, Calendar.getInstance());
            o.add(6, -2);
            p = new bt(this, 2, Calendar.getInstance());
            p.add(6, -7);
            E = new bt(this, 3, Calendar.getInstance());
            E.add(6, -28);
            y = Calendar.getInstance();
            y.add(6, -366);
            k = getIntent().getStringExtra(G[6]);
            l = getWindowManager().getDefaultDisplay();
            bundle = App.az.e(k);
            try
            {
                if (!bundle.k())
                {
                    break label0;
                }
                s1 = ((og) (bundle)).n;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_251;
            }
            bundle = bundle.a(this);
            try
            {
                getSupportActionBar().setTitle(com.whatsapp.util.c.b(bundle, getBaseContext()));
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_251;
            }
        }
        ((TextView)findViewById(0x7f0b022d)).setText(0x7f0e019b);
        try
        {
            D = App.ah.x(k);
            B = getListView();
            B.setClickable(false);
            b();
            if (D.size() == 0)
            {
                findViewById(0x7f0b022d).setVisibility(0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        C = new PinnedHeaderLayout();
        m = (TextView)C.findViewById(0x7f0b022e);
        ((ViewGroup)findViewById(0x7f0b022c)).addView(C, new android.widget.LinearLayout.LayoutParams(-1, -2));
        e();
        B.setDividerHeight(0);
        i = new a9w(this);
        B.setAdapter(i);
        B.setClickable(false);
        s = new n3(this);
        A = new ak1(this);
        if (!getIntent().getBooleanExtra(G[9], false))
        {
            break MISSING_BLOCK_LABEL_516;
        }
        bundle = Environment.getExternalStorageState();
        flag = bundle.equals(G[7]);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_509;
        }
        flag = bundle.equals(G[8]);
        if (!flag)
        {
            int i1;
            try
            {
                flag = App.m();
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (flag)
            {
                i1 = 0x7f0e0287;
            } else
            {
                i1 = 0x7f0e0288;
            }
            try
            {
                a(i1);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_516;
            }
        }
        a(0x7f0e019e);
        B.setSelection(i.getCount() - 1);
        B.setOnScrollListener(new j8(this));
        com.whatsapp.util.y.a(k);
        return;
        bundle;
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        throw bundle;
    }

    public Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return super.onCreateDialog(i1);

        case 1: // '\001'
            break;
        }
        HashMap hashmap;
        try
        {
            hashmap = t;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (hashmap == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (!t.isEmpty())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        Log.e(G[3]);
        return super.onCreateDialog(i1);
        Log.i((new StringBuilder()).append(G[2]).append(t.size()).toString());
        ArrayList arraylist = new ArrayList(t.values());
        return zj.a(this, arraylist, k, 1, new a8j(this, arraylist));
    }

    public void onDestroy()
    {
        Log.i(G[11]);
        super.onDestroy();
        z = null;
        d();
        com.whatsapp.util.y.c(k);
        App.aT();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 16908332 16908332: default 33
    //                   16908332 24;
           goto _L1 _L2
_L2:
        finish();
        return true;
        menuitem;
        throw menuitem;
_L1:
        return false;
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[14];
        obj = "Vk3\tf\\o;\fbIwx\003hW@\"\re^|$Z";
        byte0 = -1;
        i1 = 0;
_L10:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L7:
        if (k1 <= j1)
        {
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "Vk3\tf\\o;\fbIwx\022bHk##hUh>\007rIo#\thU}m";
                i1 = 1;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "Vk3\tf\\o;\fbIwx\004nZb8\007(_k;\005s^!";
                i1 = 2;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "Vk3\tf\\o;\fbIwx\004nZb8\007(_k;\005s^.9\017'Vk$\023f\\k$";
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "Vk3\tf\\o;\fbIwx\022bXw4\fbyg#\rfK}";
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "Vk3\tf\\o;\fbIwx\003u^o#\005";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "Qg3";
                byte0 = 5;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                obj = "Va\"\016s^j";
                byte0 = 6;
                i1 = 7;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "Va\"\016s^j\b\022h";
                byte0 = 7;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "Zb2\022s";
                byte0 = 8;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "U{;\f";
                byte0 = 9;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "Vk3\tf\\o;\fbIwx\004bHz%\017~";
                byte0 = 10;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                obj = "vC\032-";
                byte0 = 11;
                i1 = 12;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "wB\033,";
                byte0 = 12;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                G = as;
                byte byte1;
                char c1;
                try
                {
                    F = new SimpleDateFormat(G[13]);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    F = new SimpleDateFormat(G[12]);
                }
                break;
            }
            break MISSING_BLOCK_LABEL_472;
        }
        c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 404
    //                   0 427
    //                   1 434
    //                   2 441
    //                   3 448;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_448;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 7;
_L8:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 59;
          goto _L8
_L3:
        byte1 = 14;
          goto _L8
_L4:
        byte1 = 87;
          goto _L8
        byte1 = 96;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
    }

    private class PinnedHeaderLayout extends LinearLayout
    {

        View a;
        final MediaGallery b;

        public void a()
        {
label0:
            {
                int i1 = App.am;
                View view = b.B.getChildAt(1);
                int j1 = a.getHeight();
                if (view != null && view.getTag() == null)
                {
                    if (view.getTop() < j1)
                    {
                        int k1 = view.getTop();
                        a.offsetTopAndBottom(k1 - j1 - a.getTop());
                        if (i1 == 0)
                        {
                            break label0;
                        }
                    }
                    a.offsetTopAndBottom(-a.getTop());
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                a.offsetTopAndBottom(-a.getTop());
            }
        }

        protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
        {
            super.onLayout(flag, i1, j1, k1, l1);
            a();
        }

        PinnedHeaderLayout()
        {
            b = MediaGallery.this;
            super(MediaGallery.this);
            a = getLayoutInflater().inflate(0x7f03007e, null, true);
            a.setClickable(false);
            addView(a, new android.widget.LinearLayout.LayoutParams(-1, -2));
        }
    }

}
