// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.VideoPreviewActivity;
import com.whatsapp.au2;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.c;
import com.whatsapp.util.c1;
import com.whatsapp.w5;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

// Referenced classes of package com.whatsapp.gallerypicker:
//            v, k, ac, a4, 
//            aj, ImagePreview, a, t, 
//            at, ai, q, i, 
//            n, a9, l

public class ImageGallery extends DialogToastActivity
{

    private static SimpleDateFormat C;
    private static Bitmap I;
    private static Bitmap P;
    private static final String U[];
    private String A;
    private String B;
    private at D;
    private boolean E;
    private HashMap F;
    private q G;
    private com.actionbarsherlock.view.ActionMode.Callback H;
    private HashMap J;
    private long K;
    private BroadcastReceiver L;
    private Drawable M;
    private AsyncTask N;
    private ai O;
    private Handler Q;
    private int R;
    private GridView S;
    private boolean T;
    private HashMap j;
    private boolean k;
    private q l;
    private l m;
    private MenuItem n;
    private int o;
    private ContentObserver p;
    private ActionMode q;
    private View r;
    private int s;
    private ArrayList t;
    private int u;
    private Calendar v;
    private q w;
    private HashSet x;
    private int y;
    private HashMap z;

    public ImageGallery()
    {
        E = true;
        k = false;
        K = 0x7fffffffffffffffL;
        o = 0x7fffffff;
        L = null;
        T = true;
        x = new HashSet();
        J = new HashMap();
        F = new HashMap();
        z = new HashMap();
        j = new HashMap();
        t = new ArrayList();
        Q = new Handler();
        p = new v(this, Q);
        H = new k(this);
    }

    static int a(ImageGallery imagegallery, int i1)
    {
        imagegallery.R = i1;
        return i1;
    }

    public static Bitmap a(t t1, Context context)
    {
        boolean flag = ac.a(t1);
        if (flag)
        {
            try
            {
                if (P == null)
                {
                    P = BitmapFactory.decodeResource(context.getResources(), 0x7f020556);
                }
            }
            // Misplaced declaration of an exception variable
            catch (t t1)
            {
                throw t1;
            }
            return P;
        }
        break MISSING_BLOCK_LABEL_37;
        t1;
        throw t1;
        try
        {
            if (I == null)
            {
                I = BitmapFactory.decodeResource(context.getResources(), 0x7f020555);
            }
        }
        // Misplaced declaration of an exception variable
        catch (t t1)
        {
            throw t1;
        }
        return I;
    }

    static ActionMode a(ImageGallery imagegallery, ActionMode actionmode)
    {
        imagegallery.q = actionmode;
        return actionmode;
    }

    static MenuItem a(ImageGallery imagegallery, MenuItem menuitem)
    {
        imagegallery.n = menuitem;
        return menuitem;
    }

    static ai a(ImageGallery imagegallery)
    {
        return imagegallery.O;
    }

    static ai a(ImageGallery imagegallery, boolean flag)
    {
        return imagegallery.a(flag);
    }

    private ai a(boolean flag)
    {
        Uri uri;
        int i1;
        int j1;
        i1 = 1;
        j1 = 1;
        uri = getIntent().getData();
        Object obj;
        boolean flag1;
        if (uri != null)
        {
            try
            {
                obj = uri.toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            obj = "";
        }
        flag1 = ((String) (obj)).startsWith(a4.i.toString());
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        i1 = u;
        if (i1 == 4)
        {
            IllegalArgumentException illegalargumentexception;
            try
            {
                obj = getContentResolver();
                flag = k;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 2;
            }
            return new aj(((android.content.ContentResolver) (obj)), i1, uri.getQueryParameter(U[47]));
        }
        break MISSING_BLOCK_LABEL_115;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        android.content.ContentResolver contentresolver;
        try
        {
            contentresolver = getContentResolver();
            flag = k;
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        if (flag)
        {
            i1 = j1;
        } else
        {
            i1 = 2;
        }
        return new a4(contentresolver, i1, uri.getQueryParameter(U[49]));
        Object obj1;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        obj1 = com.whatsapp.gallerypicker.ac.c();
        j1 = ImagePreview.B;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        a a1;
        int k1;
        try
        {
            a1 = a.EXTERNAL;
            k1 = u;
            flag = k;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (!flag)
        {
            i1 = 2;
        }
        if (uri != null)
        {
            try
            {
                obj1 = uri.getQueryParameter(U[48]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        } else
        {
            obj1 = null;
        }
        obj1 = ac.a(a1, k1, i1, ((String) (obj1)));
        return ac.a(getContentResolver(), ((aq) (obj1)));
        obj1;
        throw obj1;
    }

    static SimpleDateFormat a()
    {
        return C;
    }

    static void a(ImageGallery imagegallery, t t1)
    {
        imagegallery.a(t1);
    }

    static void a(ImageGallery imagegallery, HashSet hashset)
    {
        imagegallery.a(hashset);
    }

    static void a(ImageGallery imagegallery, boolean flag, boolean flag1)
    {
        imagegallery.a(flag, flag1);
    }

    private void a(t t1)
    {
        int i1 = ImagePreview.B;
        if (t1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ActionMode actionmode = q;
        if (actionmode == null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = x.contains(t1.a());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        x.remove(t1.a());
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        int j1;
        int k1;
        j1 = x.size();
        k1 = o;
        if (j1 < k1)
        {
            HashSet hashset;
            boolean flag1;
            try
            {
                x.add(t1.a());
            }
            // Misplaced declaration of an exception variable
            catch (t t1)
            {
                throw t1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_110;
            }
        }
        Toast.makeText(getBaseContext(), 0x7f0e03d6, 0).show();
        flag1 = x.isEmpty();
        if (flag1)
        {
            try
            {
                q.finish();
            }
            // Misplaced declaration of an exception variable
            catch (t t1)
            {
                throw t1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_142;
            }
        }
        q.invalidate();
        D.notifyDataSetChanged();
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        hashset = new HashSet();
        hashset.add(t1.a());
        a(hashset);
        return;
        t1;
        try
        {
            throw t1;
        }
        // Misplaced declaration of an exception variable
        catch (t t1) { }
        try
        {
            throw t1;
        }
        // Misplaced declaration of an exception variable
        catch (t t1) { }
        try
        {
            throw t1;
        }
        // Misplaced declaration of an exception variable
        catch (t t1) { }
        throw t1;
        t1;
        throw t1;
    }

    private void a(HashSet hashset)
    {
        int i1 = ImagePreview.B;
        if (hashset == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            flag = hashset.isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (HashSet hashset)
        {
            try
            {
                throw hashset;
            }
            // Misplaced declaration of an exception variable
            catch (HashSet hashset)
            {
                throw hashset;
            }
        }
        if (!flag) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ArrayList arraylist = new ArrayList();
        Intent intent;
        int j1;
        boolean flag1;
        try
        {
            arraylist.addAll(hashset);
            if (!E)
            {
                break; /* Loop/switch isn't completed */
            }
            j1 = u;
        }
        // Misplaced declaration of an exception variable
        catch (HashSet hashset)
        {
            throw hashset;
        }
        if (j1 != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset = new Intent(this, com/whatsapp/gallerypicker/ImagePreview);
        try
        {
            hashset.putExtra(U[14], B);
            hashset.putExtra(U[13], A);
            hashset.putExtra(U[16], o);
            hashset.putExtra(U[15], arraylist);
            hashset.putExtra(U[8], J);
            hashset.putExtra(U[11], F);
            hashset.putExtra(U[19], z);
            hashset.putExtra(U[9], j);
            startActivityForResult(hashset, 1);
        }
        // Misplaced declaration of an exception variable
        catch (HashSet hashset)
        {
            throw hashset;
        }
        if (i1 == 0) goto _L2; else goto _L4
_L4:
        j1 = u;
        if (j1 != 4)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            hashset = c1.a((Uri)arraylist.get(0));
        }
        // Misplaced declaration of an exception variable
        catch (HashSet hashset)
        {
            Log.a(hashset);
            hashset = null;
        }
        if (hashset == null)
        {
            break MISSING_BLOCK_LABEL_375;
        }
        try
        {
            flag1 = w5.c(hashset);
        }
        // Misplaced declaration of an exception variable
        catch (HashSet hashset)
        {
            throw hashset;
        }
        if (flag1)
        {
            intent = new Intent(this, com/whatsapp/VideoPreviewActivity);
            try
            {
                intent.putExtra(U[20], hashset.getAbsolutePath());
                intent.putExtra(U[12], A);
                startActivityForResult(intent, 2);
            }
            // Misplaced declaration of an exception variable
            catch (HashSet hashset)
            {
                try
                {
                    throw hashset;
                }
                // Misplaced declaration of an exception variable
                catch (HashSet hashset)
                {
                    throw hashset;
                }
            }
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (hashset.length() <= (long)au2.q * 0x100000L)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        f(getString(0x7f0e018f, new Object[] {
            Integer.valueOf(au2.q)
        }));
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = new Intent();
        try
        {
            intent.putExtra(U[6], hashset.getAbsolutePath());
            setResult(-1, intent);
            finish();
        }
        // Misplaced declaration of an exception variable
        catch (HashSet hashset)
        {
            throw hashset;
        }
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        App.b(getBaseContext(), 0x7f0e03d4, 0);
        if (i1 == 0) goto _L2; else goto _L5
_L5:
        hashset = new Intent();
        hashset.putExtra(U[7], getIntent().getData());
        hashset.putParcelableArrayListExtra(U[10], arraylist);
        setResult(-1, hashset);
        finish();
        if (i1 == 0) goto _L2; else goto _L6
_L6:
        hashset = new Intent();
        hashset.putExtra(U[17], getIntent().getData());
        hashset.putParcelableArrayListExtra(U[18], arraylist);
        setResult(-1, hashset);
        finish();
        return;
    }

    private void a(boolean flag, boolean flag1)
    {
        View view;
        int i1;
        boolean flag2;
        try
        {
            Log.i((new StringBuilder()).append(U[34]).append(flag).append(U[33]).append(flag1).toString());
            if (N != null)
            {
                N.cancel(true);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        try
        {
            if (O != null)
            {
                O.a(p);
                O.b();
                O = null;
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        try
        {
            setSupportProgressBarIndeterminateVisibility(true);
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        if (!flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        try
        {
            O = a(flag2);
            t.clear();
            O.b(p);
            view = r;
            i1 = O.d();
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            throw illegalargumentexception3;
        }
        if (i1 > 0)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        view.setVisibility(i1);
        w = new q(this, 1, Calendar.getInstance());
        w.add(6, -2);
        G = new q(this, 2, Calendar.getInstance());
        G.add(6, -7);
        l = new q(this, 3, Calendar.getInstance());
        l.add(6, -28);
        v = Calendar.getInstance();
        v.add(6, -366);
        R = 0;
        D.notifyDataSetChanged();
        N = new i(this, flag, flag1);
        N.execute(new Void[0]);
    }

    private boolean a(String s1)
    {
        boolean flag;
        try
        {
            flag = s1.equals(U[36]);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (!s1.equals(U[35]))
        {
            return false;
        }
        return true;
    }

    static MenuItem b(ImageGallery imagegallery)
    {
        return imagegallery.n;
    }

    private void b()
    {
        Object obj;
        try
        {
            u = 5;
            if (o > 1)
            {
                getSupportActionBar().setSubtitle(0x7f0e0370);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj = getIntent();
        if (obj != null)
        {
            Object obj1 = ((Intent) (obj)).resolveType(this);
            if (obj1 != null)
            {
                TextPaint textpaint;
                int i1;
                try
                {
                    if (b(((String) (obj1))))
                    {
                        u = 1;
                        setTitle(0x7f0e02e4);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                try
                {
                    if (a(((String) (obj1))))
                    {
                        u = 4;
                        setTitle(0x7f0e02e5);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
            }
            obj1 = ((Intent) (obj)).getExtras();
            if (obj1 != null)
            {
                try
                {
                    obj = ((Bundle) (obj1)).getString(U[31]);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
            } else
            {
                obj = null;
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                textpaint = new TextPaint();
                textpaint.setTextSize(getResources().getDimension(0x7f0a0005));
                setTitle(com.whatsapp.util.c.b(((String) (obj)), getBaseContext(), textpaint));
            }
            if (obj1 != null)
            {
                try
                {
                    u = ((Bundle) (obj1)).getInt(U[30], u) & 5;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
            }
        }
        i1 = u;
        if (i1 == 1)
        {
            IllegalArgumentException illegalargumentexception1;
            try
            {
                getSupportActionBar().setIcon(0x7f020530);
                i1 = ImagePreview.B;
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                try
                {
                    throw illegalargumentexception2;
                }
                catch (IllegalArgumentException illegalargumentexception3)
                {
                    throw illegalargumentexception3;
                }
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_218;
            }
        }
        if (u == 4)
        {
            getSupportActionBar().setIcon(0x7f02056d);
        }
        return;
        illegalargumentexception1;
        throw illegalargumentexception1;
    }

    private boolean b(String s1)
    {
        boolean flag;
        try
        {
            flag = s1.equals(U[38]);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (!s1.equals(U[37]))
        {
            return false;
        }
        return true;
    }

    static at c(ImageGallery imagegallery)
    {
        return imagegallery.D;
    }

    static int d(ImageGallery imagegallery)
    {
        return imagegallery.y;
    }

    static int e(ImageGallery imagegallery)
    {
        return imagegallery.R;
    }

    static l f(ImageGallery imagegallery)
    {
        return imagegallery.m;
    }

    static com.actionbarsherlock.view.ActionMode.Callback g(ImageGallery imagegallery)
    {
        return imagegallery.H;
    }

    static ArrayList h(ImageGallery imagegallery)
    {
        return imagegallery.t;
    }

    static ActionMode i(ImageGallery imagegallery)
    {
        return imagegallery.q;
    }

    static int j(ImageGallery imagegallery)
    {
        return imagegallery.s;
    }

    static Drawable k(ImageGallery imagegallery)
    {
        return imagegallery.M;
    }

    static HashSet l(ImageGallery imagegallery)
    {
        return imagegallery.x;
    }

    public q a(long l1)
    {
        Object obj;
label0:
        {
            obj = Calendar.getInstance();
            try
            {
                ((Calendar) (obj)).setTime(new Date(l1));
                if (!((Calendar) (obj)).after(w))
                {
                    break label0;
                }
                obj = w;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((q) (obj));
        }
label1:
        {
            try
            {
                if (!((Calendar) (obj)).after(G))
                {
                    break label1;
                }
                obj = G;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((q) (obj));
        }
label2:
        {
            try
            {
                if (!((Calendar) (obj)).after(l))
                {
                    break label2;
                }
                obj = l;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((q) (obj));
        }
label3:
        {
            try
            {
                if (!((Calendar) (obj)).after(v))
                {
                    break label3;
                }
                obj = new q(this, 4, new GregorianCalendar(((Calendar) (obj)).get(1), ((Calendar) (obj)).get(2), 1));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((q) (obj));
        }
        return new q(this, 5, new GregorianCalendar(((Calendar) (obj)).get(1), 1, 1));
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        int k1 = ImagePreview.B;
        i1;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 29
    //                   2 289;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        setResult(-1, intent);
        finish();
        if (k1 == 0) goto _L1; else goto _L4
_L4:
        if (j1 != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj;
        try
        {
            setResult(2);
            finish();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0) goto _L1; else goto _L5
_L5:
        if (j1 != 1) goto _L1; else goto _L6
_L6:
        obj = intent.getParcelableArrayListExtra(U[5]);
        try
        {
            x.clear();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        x.addAll(((java.util.Collection) (obj)));
        obj = q;
        if (obj != null) goto _L8; else goto _L7
_L7:
        try
        {
            q = startActionMode(H);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0) goto _L9; else goto _L8
_L8:
        q.invalidate();
_L9:
        try
        {
            J = (HashMap)intent.getSerializableExtra(U[2]);
            if (J == null)
            {
                J = new HashMap();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        try
        {
            F = (HashMap)intent.getSerializableExtra(U[1]);
            if (F == null)
            {
                F = new HashMap();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        try
        {
            z = (HashMap)intent.getSerializableExtra(U[3]);
            if (z == null)
            {
                z = new HashMap();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        try
        {
            j = (HashMap)intent.getSerializableExtra(U[4]);
            if (j == null)
            {
                j = new HashMap();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        D.notifyDataSetChanged();
        if (k1 == 0) goto _L1; else goto _L3
_L3:
        if (j1 != -1 && j1 != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        setResult(-1, intent);
        finish();
        if (k1 == 0) goto _L1; else goto _L10
_L10:
        if (j1 != 2) goto _L1; else goto _L11
_L11:
        try
        {
            setResult(2);
            finish();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
        intent;
        throw intent;
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        int i1 = ImagePreview.B;
        try
        {
            Log.i(U[22]);
            super.onCreate(bundle);
            requestWindowFeature(5L);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            setContentView(0x7f030075);
            K = getIntent().getLongExtra(U[21], 0x7fffffffffffffffL);
            o = getIntent().getIntExtra(U[25], 0x7fffffff);
            E = getIntent().getBooleanExtra(U[27], true);
            B = getIntent().getStringExtra(U[26]);
            A = getIntent().getStringExtra(U[29]);
            y = getResources().getColor(0x7f090025);
            M = new ColorDrawable(y);
            s = getResources().getDimensionPixelSize(0x7f0a003b);
            r = findViewById(0x7f0b01e8);
            S = (GridView)findViewById(0x7f0b020f);
            S.setOnItemClickListener(new n(this));
            if (o > 1)
            {
                S.setOnItemLongClickListener(new a9(this));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        D = new at(this);
        S.setAdapter(D);
        b();
        m = new l(getContentResolver(), new Handler());
        if (bundle != null)
        {
            bundle = bundle.getParcelableArrayList(U[28]);
        } else
        {
            bundle = getIntent().getParcelableArrayListExtra(U[23]);
        }
        if (bundle != null)
        {
            try
            {
                if (!bundle.isEmpty())
                {
                    x.clear();
                    x.addAll(bundle);
                    q = startActionMode(H);
                    D.notifyDataSetChanged();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        bundle = getIntent().getData();
        if (bundle != null)
        {
            try
            {
                bundle = bundle.toString();
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        } else
        {
            bundle = "";
        }
        try
        {
            Log.i((new StringBuilder()).append(U[24]).append(bundle).toString());
            a(false, ac.a(getContentResolver()));
            if (DialogToastActivity.g != 0)
            {
                ImagePreview.B = i1 + 1;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        try
        {
            if (App.u == 3)
            {
                a5.b(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        return true;
    }

    public void onDestroy()
    {
        try
        {
            Log.i(U[46]);
            super.onDestroy();
            if (N != null)
            {
                N.cancel(true);
                N = null;
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        try
        {
            if (m != null)
            {
                m.a();
                m = null;
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        try
        {
            if (O != null)
            {
                O.a(p);
                O.b();
                O = null;
            }
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        R = 0;
        H = null;
        q = null;
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        boolean flag;
        try
        {
            flag = T;
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            throw keyevent;
        }
        if (flag)
        {
            return false;
        }
        int j1 = App.u;
        if (j1 == 3 && i1 == 84)
        {
            try
            {
                a5.a(this, false);
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent)
            {
                throw keyevent;
            }
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
        keyevent;
        throw keyevent;
    }

    public boolean onMenuItemSelected(int i1, android.view.MenuItem menuitem)
    {
        DialogToastActivity.a(menuitem);
        return super.onMenuItemSelected(i1, menuitem);
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
        try
        {
            Log.i(U[0]);
            super.onPause();
            T = true;
            if (L != null)
            {
                unregisterReceiver(L);
                L = null;
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        boolean flag;
        try
        {
            flag = T;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        if (flag)
        {
            return false;
        }
        try
        {
            if (App.u == 3)
            {
                a5.b(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        return true;
    }

    public void onResume()
    {
        Log.i(U[43]);
        super.onResume();
        S.requestFocus();
        T = false;
        IntentFilter intentfilter = new IntentFilter(U[39]);
        intentfilter.addAction(U[45]);
        intentfilter.addAction(U[42]);
        intentfilter.addAction(U[40]);
        intentfilter.addAction(U[44]);
        intentfilter.addDataScheme(U[41]);
        L = new _cls3();
        registerReceiver(L, intentfilter);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            super.onSaveInstanceState(bundle);
            if (x != null)
            {
                bundle.putParcelableArrayList(U[32], new ArrayList(x));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[52];
        obj = "'c\0202/)o\0359/<w^%+;}\024";
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
                obj = "-|\036%?<g\002";
                i1 = 1;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "<a\0054>'a\037&";
                i1 = 2;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "-|\036%8+m\005&";
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "-o\001!#!`\002";
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "/`\025'%'j_<$:k\037!d+v\005'+`]%\007\017\017C";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "(g\0350\025>o\005=";
                byte0 = 5;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = ",{\022>/:Q\004'#";
                byte0 = 6;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "<a\0054>'a\037&";
                byte0 = 7;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "-o\001!#!`\002";
                byte0 = 8;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "/`\025'%'j_<$:k\037!d+v\005'+`]%\007\017\017C";
                byte0 = 9;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "-|\036%?<g\002";
                byte0 = 10;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = ":g\0059/";
                byte0 = 11;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "<k\022<:'k\037!";
                byte0 = 12;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                obj = "8k\0037";
                byte0 = 13;
                i1 = 14;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "/`\025'%'j_<$:k\037!d+v\005'+`]%\007\017\017C";
                byte0 = 14;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "#o\t\n#:k\034&";
                byte0 = 15;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = ",{\022>/:Q\004'#";
                byte0 = 16;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "/`\025'%'j_<$:k\037!d+v\005'+`]%\007\017\017C";
                byte0 = 17;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "-|\036%8+m\005&";
                byte0 = 18;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "(g\0350\025>o\005=";
                byte0 = 19;
                continue; /* Loop/switch isn't completed */

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "/`\025'%'j_<$:k\037!d+v\005'+`}\030//\002g\034<>";
                byte0 = 20;
                continue; /* Loop/switch isn't completed */

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "'c\0202/)o\0359/<w^68+o\0050";
                byte0 = 21;
                continue; /* Loop/switch isn't completed */

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "/`\025'%'j_<$:k\037!d+v\005'+`]%\007\017\017C";
                byte0 = 22;
                continue; /* Loop/switch isn't completed */

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "'c\0202/)o\0359/<w^68+o\0050e";
                byte0 = 23;
                continue; /* Loop/switch isn't completed */

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "#o\t\n#:k\034&";
                byte0 = 24;
                continue; /* Loop/switch isn't completed */

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "8k\0037";
                byte0 = 25;
                continue; /* Loop/switch isn't completed */

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = ">|\024##+y";
                byte0 = 26;
                continue; /* Loop/switch isn't completed */

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "/`\025'%'j_<$:k\037!d+v\005'+`]%\007\017\017C";
                byte0 = 27;
                continue; /* Loop/switch isn't completed */

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "<k\022<:'k\037!";
                byte0 = 28;
                continue; /* Loop/switch isn't completed */

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "'`\0229?*k.8/*g\020";
                byte0 = 29;
                continue; /* Loop/switch isn't completed */

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "9g\0371%9Z\030!&+";
                byte0 = 30;
                continue; /* Loop/switch isn't completed */

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "/`\025'%'j_<$:k\037!d+v\005'+`]%\007\017\017C";
                byte0 = 31;
                continue; /* Loop/switch isn't completed */

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "n}\0224$ g\0372p";
                byte0 = 32;
                continue; /* Loop/switch isn't completed */

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "'c\0202/)o\0359/<w^'/,o\0320j;`\034:? z\0241p";
                byte0 = 33;
                continue; /* Loop/switch isn't completed */

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "8g\0250%a$";
                byte0 = 34;
                continue; /* Loop/switch isn't completed */

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "8`\025{+ j\003:#* \022 8=a\003{.'|^##*k\036";
                byte0 = 35;
                continue; /* Loop/switch isn't completed */

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "'c\0202/a$";
                byte0 = 36;
                continue; /* Loop/switch isn't completed */

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "8`\025{+ j\003:#* \022 8=a\003{.'|^<'/i\024";
                byte0 = 37;
                continue; /* Loop/switch isn't completed */

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "/`\025'%'j_<$:k\037!d/m\005<%  <\020\016\007O.\030\005\033@%\020\016";
                byte0 = 38;
                continue; /* Loop/switch isn't completed */

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "/`\025'%'j_<$:k\037!d/m\005<%  <\020\016\007O.\006\t\017@?\020\030\021H8\033\003\035F4\021";
                byte0 = 39;
                continue; /* Loop/switch isn't completed */

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "(g\0350";
                byte0 = 40;
                continue; /* Loop/switch isn't completed */

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "/`\025'%'j_<$:k\037!d/m\005<%  <\020\016\007O.\006\t\017@?\020\030\021]%\024\030\032K5";
                byte0 = 41;
                continue; /* Loop/switch isn't completed */

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "'c\0202/)o\0359/<w^'/={\0340";
                byte0 = 42;
                continue; /* Loop/switch isn't completed */

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "/`\025'%'j_<$:k\037!d/m\005<%  <\020\016\007O.\020\000\013M%";
                byte0 = 43;
                continue; /* Loop/switch isn't completed */

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "/`\025'%'j_<$:k\037!d/m\005<%  <\020\016\007O.\000\004\003A$\033\036\013J";
                byte0 = 44;
                continue; /* Loop/switch isn't completed */

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "'c\0202/)o\0359/<w^1/=z\003:3";
                byte0 = 45;
                continue; /* Loop/switch isn't completed */

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = ",{\022>/:G\025";
                byte0 = 46;
                continue; /* Loop/switch isn't completed */

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = ",{\022>/:G\025";
                byte0 = 47;
                continue; /* Loop/switch isn't completed */

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = ",{\022>/:G\025";
                byte0 = 48;
                continue; /* Loop/switch isn't completed */

            case 48: // '0'
                as1[i1] = ((String) (obj));
                obj = "\002B=\031";
                byte0 = 49;
                i1 = 50;
                continue; /* Loop/switch isn't completed */

            case 49: // '1'
                as1[i1] = ((String) (obj));
                i1 = 51;
                obj = "\003C<\030";
                byte0 = 50;
                continue; /* Loop/switch isn't completed */

            case 50: // '2'
                as1[i1] = ((String) (obj));
                U = as;
                byte byte1;
                char c2;
                try
                {
                    C = new SimpleDateFormat(U[50], Locale.getDefault());
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    C = new SimpleDateFormat(U[51], Locale.getDefault());
                }
                break;
            }
            break MISSING_BLOCK_LABEL_1315;
        }
        c2 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 1244
    //                   0 1267
    //                   1 1274
    //                   2 1281
    //                   3 1288;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_1288;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 74;
_L8:
        obj[j1] = (char)(byte1 ^ c2);
        j1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 78;
          goto _L8
_L3:
        byte1 = 14;
          goto _L8
_L4:
        byte1 = 113;
          goto _L8
        byte1 = 85;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
    }

    private class _cls3 extends BroadcastReceiver
    {

        private static final String z[];
        final ImageGallery a;

        public void onReceive(Context context, Intent intent)
        {
label0:
            {
                int i1 = ImagePreview.B;
                context = intent.getAction();
                if (context.equals(z[6]))
                {
                    Log.i(z[1]);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                if (context.equals(z[7]))
                {
                    Log.i(z[5]);
                    ImageGallery.a(a, true, false);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                if (context.equals(z[8]))
                {
                    Log.i(z[0]);
                    ImageGallery.a(a, false, true);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                if (context.equals(z[2]))
                {
                    Log.i(z[9]);
                    ImageGallery.a(a, false, false);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                if (context.equals(z[3]))
                {
                    Log.i(z[4]);
                    ImageGallery.a(a, true, false);
                }
            }
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i1;
            as = new String[10];
            obj = "\fIi\013!\002Ed\000!\027]'\036!\006Aa\032!\bAl\005%\007Vg\r \006E{\030k$g\\%\013+{E)\000,eW?\007$jF)\026:w\\-\0261aL";
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
                    obj = "\fIi\013!\002Ed\000!\027]'\036!\006Aa\032!\bAl\005%\007Vg\r \006E{\030k$g\\%\013+{E)\000,eW!\0130j\\)\0";
                    i1 = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i1] = ((String) (obj));
                    obj = "\004Jl\036+\f@&\005*\021Af\030j\004G|\005+\013\nE)\000,eW?\007$jF)\026:bA\"\r6lM(";
                    i1 = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i1] = ((String) (obj));
                    obj = "\004Jl\036+\f@&\005*\021Af\030j\004G|\005+\013\nE)\000,eW)\016 g\\";
                    i1 = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i1] = ((String) (obj));
                    i1 = 4;
                    obj = "\fIi\013!\002Ed\000!\027]'\036!\006Aa\032!\bAl\005%\007Vg\r \006E{\030k$g\\%\013+{E)\000,eW)\016 g\\";
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i1] = ((String) (obj));
                    i1 = 5;
                    obj = "\fIi\013!\002Ed\000!\027]'\036!\006Aa\032!\bAl\005%\007Vg\r \006E{\030k$g\\%\013+{E)\000,eW9\n(k]\"\020 `";
                    byte0 = 4;
                    break;

                case 4: // '\004'
                    as1[i1] = ((String) (obj));
                    i1 = 6;
                    obj = "\004Jl\036+\f@&\005*\021Af\030j\004G|\005+\013\nE)\000,eW!\0130j\\)\0";
                    byte0 = 5;
                    break;

                case 5: // '\005'
                    as1[i1] = ((String) (obj));
                    i1 = 7;
                    obj = "\004Jl\036+\f@&\005*\021Af\030j\004G|\005+\013\nE)\000,eW9\n(k]\"\020 `";
                    byte0 = 6;
                    break;

                case 6: // '\006'
                    as1[i1] = ((String) (obj));
                    obj = "\004Jl\036+\f@&\005*\021Af\030j\004G|\005+\013\nE)\000,eW?\007$jF)\026:w\\-\0261aL";
                    byte0 = 7;
                    i1 = 8;
                    break;

                case 7: // '\007'
                    as1[i1] = ((String) (obj));
                    i1 = 9;
                    obj = "\fIi\013!\002Ed\000!\027]'\036!\006Aa\032!\bAl\005%\007Vg\r \006E{\030k$g\\%\013+{E)\000,eW?\007$jF)\026:bA\"\r6lM(";
                    byte0 = 8;
                    break;

                case 8: // '\b'
                    as1[i1] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c2 = obj[j1];
            j1 % 5;
            JVM INSTR tableswitch 0 3: default 300
        //                       0 323
        //                       1 330
        //                       2 337
        //                       3 344;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_344;
_L3:
            byte byte1 = 68;
_L9:
            obj[j1] = (char)(byte1 ^ c2);
            j1++;
              goto _L8
_L4:
            byte1 = 101;
              goto _L9
_L5:
            byte1 = 36;
              goto _L9
_L6:
            byte1 = 8;
              goto _L9
            byte1 = 108;
              goto _L9
        }

        _cls3()
        {
            a = ImageGallery.this;
            super();
        }
    }

}
