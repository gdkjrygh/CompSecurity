// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.app.Activity;
import android.app.Dialog;
import android.backport.util.Base64;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.text.method.TextKeyListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.ConversationRow;
import com.whatsapp.ConversationRowDivider;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.GalleryView;
import com.whatsapp.ThumbnailButton;
import com.whatsapp.ThumbnailTextButton;
import com.whatsapp.a1g;
import com.whatsapp.ak8;
import com.whatsapp.akr;
import com.whatsapp.all;
import com.whatsapp.aoz;
import com.whatsapp.fe;
import com.whatsapp.g;
import com.whatsapp.iz;
import com.whatsapp.k;
import com.whatsapp.m7;
import com.whatsapp.mk;
import com.whatsapp.og;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.u5;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.c1;
import com.whatsapp.util.cl;
import com.whatsapp.util.m;
import com.whatsapp.util.y;
import com.whatsapp.wd;
import com.whatsapp.za;
import g;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import l;

// Referenced classes of package com.whatsapp.notification:
//            z, x, ak, o, 
//            ao, a, t, a1, 
//            as, r, u, e, 
//            c, j, g, a_, 
//            y, f, b, i, 
//            at, af

public class PopupNotification extends Activity
    implements wd
{

    private static int D;
    private static final String M[];
    public static boolean q;
    public static PopupNotification s;
    private SensorManager A;
    private TextView B;
    private Runnable C;
    private ArrayList E;
    private c4 F;
    private Button G;
    private HashSet H;
    private android.os.PowerManager.WakeLock I;
    private TextView J;
    private String K;
    private View L;
    private ak8 a;
    private GalleryView b;
    private android.view.View.OnClickListener c;
    private Sensor d;
    private ImageButton e;
    private Runnable f;
    private HashSet g;
    private Handler h;
    private ImageButton i;
    private og j;
    private fe k;
    private HashSet l;
    private float m;
    private TextView n;
    private boolean o;
    private ConversationTextEntry p;
    private SensorEventListener r;
    private a1g t;
    private View u;
    private View v;
    private HashSet w;
    private za x;
    private Handler y;
    private View z;

    public PopupNotification()
    {
        boolean flag = false;
        boolean flag1 = q;
        super();
        o = false;
        E = new ArrayList();
        H = new HashSet();
        g = new HashSet();
        w = new HashSet();
        l = new HashSet();
        I = null;
        x = new z(this);
        m = 5F;
        h = new Handler();
        f = new x(this);
        y = new Handler();
        C = new ak(this);
        K = null;
        if (DialogToastActivity.g != 0)
        {
            if (!flag1)
            {
                flag = true;
            }
            q = flag;
        }
    }

    static float a(PopupNotification popupnotification, float f1)
    {
        popupnotification.m = f1;
        return f1;
    }

    static int a(PopupNotification popupnotification, int i1)
    {
        return popupnotification.b(i1);
    }

    static SensorEventListener a(PopupNotification popupnotification, SensorEventListener sensoreventlistener)
    {
        popupnotification.r = sensoreventlistener;
        return sensoreventlistener;
    }

    private View a(c4 c4_1)
    {
        ThumbnailButton thumbnailbutton = new ThumbnailButton(this);
        int i1 = getResources().getDimensionPixelSize(0x7f0a004d);
        thumbnailbutton.setMinimumHeight(i1);
        thumbnailbutton.setMaxHeight(i1);
        thumbnailbutton.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        i1 = (int)t.m;
        android.graphics.Bitmap bitmap;
        try
        {
            thumbnailbutton.setPadding(i1, i1, i1, i1);
            thumbnailbutton.setRadius(t.h);
            if (l.add(c4_1.y.a))
            {
                com.whatsapp.util.y.a(c4_1.y.a);
            }
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        bitmap = com.whatsapp.util.y.a(c4_1);
        c4_1 = bitmap;
        if (bitmap == null)
        {
            c4_1 = cl.c(this);
        }
        thumbnailbutton.setImageBitmap(c4_1);
        thumbnailbutton.setOnClickListener(c);
        return thumbnailbutton;
    }

    static fe a(PopupNotification popupnotification)
    {
        return popupnotification.k;
    }

    private boolean a(boolean flag)
    {
        String s1;
        try
        {
            K = m7.a(this, flag);
            if (K != null)
            {
                showDialog(116);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        try
        {
            s1 = K;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        return s1 != null;
    }

    private int b(int i1)
    {
        int j1;
        int k1;
        try
        {
            k1 = E.size();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        j1 = i1;
        if (k1 > 1)
        {
            j1 = i1 + 1;
        }
        return j1;
    }

    private View b(c4 c4_1)
    {
        Object obj;
        ThumbnailTextButton thumbnailtextbutton = new ThumbnailTextButton(this);
        int i1 = getResources().getDimensionPixelSize(0x7f0a004d);
        thumbnailtextbutton.setMinimumHeight(i1);
        thumbnailtextbutton.setMaxHeight(i1);
        thumbnailtextbutton.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        int j1 = (int)t.m;
        boolean flag;
        try
        {
            thumbnailtextbutton.setPadding(j1, j1, j1, j1);
            thumbnailtextbutton.setRadius(t.h);
            thumbnailtextbutton.setIcon(getResources().getDrawable(0x7f02059f));
            thumbnailtextbutton.setTextSize((float)i1 / 7F);
            thumbnailtextbutton.setTextGravity(5);
            if (l.add(c4_1.y.a))
            {
                com.whatsapp.util.y.a(c4_1.y.a);
            }
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        obj = com.whatsapp.util.y.a(c4_1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        thumbnailtextbutton.setImageBitmap(((android.graphics.Bitmap) (obj)));
        flag = q;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        try
        {
            thumbnailtextbutton.setImageBitmap(cl.d(this));
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        obj = null;
        if (c4_1.H == 0) goto _L2; else goto _L1
_L1:
        obj = DateUtils.formatElapsedTime(c4_1.H);
_L4:
        thumbnailtextbutton.setText(((CharSequence) (obj)));
_L5:
        thumbnailtextbutton.setOnClickListener(c);
        return thumbnailtextbutton;
        c4_1;
        throw c4_1;
_L2:
        if (c4_1.t <= 0L) goto _L4; else goto _L3
_L3:
        obj = Formatter.formatShortFileSize(App.au, c4_1.t);
          goto _L4
        c4_1;
          goto _L5
    }

    static ConversationTextEntry b(PopupNotification popupnotification)
    {
        return popupnotification.p;
    }

    private void b()
    {
        int i1;
        try
        {
            App.aP();
            if (F != null)
            {
                H.add(F.y);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        try
        {
            i1 = E.size();
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (i1 <= 1)
        {
            return;
        }
        int j1 = b.d() - 1 - 1;
        i1 = j1;
        if (j1 < 0)
        {
            i1 = E.size() - 1;
        }
        b.setCurrentScreen(i1 + 1);
        View view = b.getChildAt(i1 + 1);
        TranslateAnimation translateanimation;
        boolean flag;
        try
        {
            flag = App.aR();
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        translateanimation = new TranslateAnimation((i1 * -view.getWidth()) / 2, 0.0F, 0.0F, 0.0F);
        translateanimation.setDuration(D);
        translateanimation.setFillAfter(true);
        view.startAnimation(translateanimation);
    }

    private int c(int i1)
    {
        int j1;
        int k1;
        try
        {
            k1 = E.size();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        j1 = i1;
        if (k1 > 1)
        {
            j1 = i1 - 1;
        }
        return j1;
    }

    private View c(c4 c4_1)
    {
        android.graphics.Bitmap bitmap;
        Object obj;
        obj = null;
        TextView textview = new TextView(this);
        textview.setText(c4_1.L);
        textview.setTextSize(ConversationRow.b(getResources()));
        textview.setGravity(17);
        textview.setTextColor(0xff000000);
        byte abyte0[];
        int i1;
        try
        {
            c4_1 = g.i(c4_1.e());
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            Log.c(c4_1);
            c4_1 = null;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            Log.a(c4_1);
            c4_1 = null;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            Log.c(c4_1);
            c4_1 = null;
        }
        bitmap = obj;
        if (c4_1 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        abyte0 = ((g) (c4_1)).m;
        bitmap = obj;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        try
        {
            i1 = ((g) (c4_1)).m.length;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        bitmap = obj;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        c4_1 = Base64.decode(((g) (c4_1)).m, 0);
        bitmap = BitmapFactory.decodeByteArray(c4_1, 0, c4_1.length);
_L2:
        c4_1 = getResources().getDrawable(0x7f02064c);
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        bitmap = c1.a(bitmap, c4_1.getIntrinsicWidth(), t.h);
        textview.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(getResources(), bitmap), null, null, null);
        if (!q)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        textview.setCompoundDrawablesWithIntrinsicBounds(c4_1, null, null, null);
        textview.setCompoundDrawablePadding((int)t.m);
        textview.setPadding((int)t.m, (int)t.m, (int)t.m, (int)t.m);
        c4_1 = new RelativeLayout(this);
        c4_1.setGravity(17);
        c4_1.addView(textview);
        return c4_1;
        c4_1;
        throw c4_1;
        c4_1;
_L3:
        Log.a(M[29], c4_1);
        bitmap = obj;
        if (true) goto _L2; else goto _L1
_L1:
        c4_1;
        throw c4_1;
        c4_1;
          goto _L3
        c4_1;
          goto _L3
    }

    private void c()
    {
        boolean flag = q;
        if (s != this) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        Log.i((new StringBuilder()).append(M[27]).append(w.size()).toString());
        iterator = w.iterator();
_L5:
        ArrayList arraylist;
        Object obj;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (String)iterator.next();
        arraylist = new ArrayList();
        obj = u5.d(((String) (obj)));
        iterator1 = H.iterator();
_L4:
        a a2;
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        a2 = (a)iterator1.next();
        String s1 = a2.a;
        IllegalArgumentException illegalargumentexception;
        if (s1 != null)
        {
            try
            {
                if (a2.a.equals(((og) (obj)).a))
                {
                    arraylist.add(a2);
                }
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        try
        {
            Log.i((new StringBuilder()).append(M[28]).append(arraylist.size()).append("/").append(((og) (obj)).c).toString());
            if (arraylist.size() == ((og) (obj)).c)
            {
                App.a(((og) (obj)), false, true);
                H.removeAll(arraylist);
            }
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        if (!flag) goto _L5; else goto _L2
_L2:
        App.a(true, true, true, false);
        return;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    static void c(PopupNotification popupnotification)
    {
        popupnotification.g();
    }

    private View d(c4 c4_1)
    {
        String s1;
        TextView textview;
label0:
        {
            textview = new TextView(this);
            if (c4_1.M == 6)
            {
                s1 = ConversationRowDivider.c(c4_1);
                if (!q)
                {
                    break label0;
                }
            }
            s1 = c4_1.e();
        }
        textview.setText(com.whatsapp.util.c.b(s1, this));
        textview.setTextSize(ConversationRow.b(getResources()));
        textview.setGravity(17);
        textview.setTextColor(0xff000000);
        textview.setPadding((int)t.o, 0, (int)t.o, 0);
        return textview;
    }

    static c4 d(PopupNotification popupnotification)
    {
        return popupnotification.F;
    }

    private void d()
    {
        int i1;
        try
        {
            App.aP();
            if (F != null)
            {
                H.add(F.y);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        try
        {
            i1 = E.size();
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (i1 <= 1)
        {
            return;
        }
        int j1 = (b.d() - 1) + 1;
        i1 = j1;
        if (j1 >= E.size())
        {
            i1 = 0;
        }
        b.setCurrentScreen(i1 + 1);
        View view = b.getChildAt(i1 + 1);
        TranslateAnimation translateanimation;
        boolean flag;
        try
        {
            flag = App.aR();
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        translateanimation = new TranslateAnimation((i1 * view.getWidth()) / 2, 0.0F, 0.0F, 0.0F);
        translateanimation.setDuration(D);
        translateanimation.setFillAfter(true);
        view.startAnimation(translateanimation);
    }

    private View e(c4 c4_1)
    {
        byte byte0;
        try
        {
            byte0 = c4_1.w;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        byte0;
        JVM INSTR tableswitch 0 5: default 44
    //                   0 53
    //                   1 70
    //                   2 64
    //                   3 76
    //                   4 88
    //                   5 82;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return new TextView(this);
_L2:
        c4_1 = d(c4_1);
        return c4_1;
_L4:
        return f(c4_1);
_L3:
        return a(c4_1);
_L5:
        return b(c4_1);
_L7:
        return g(c4_1);
_L6:
        return c(c4_1);
    }

    private void e()
    {
        boolean flag;
        flag = false;
        og og1;
        try
        {
            og1 = j;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (og1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag1;
        try
        {
            flag1 = a(true);
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        if (flag1) goto _L1; else goto _L3
_L3:
        try
        {
            if (App.C(j.a))
            {
                showDialog(106);
                return;
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        String s1 = p.getText().toString().trim();
        IllegalArgumentException illegalargumentexception3;
        int i1;
        try
        {
            i1 = s1.length();
        }
        catch (IllegalArgumentException illegalargumentexception4)
        {
            try
            {
                throw illegalargumentexception4;
            }
            // Misplaced declaration of an exception variable
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        App.a(j, com.whatsapp.util.c.a(s1));
        TextKeyListener.clear(p.getText());
        if (!q)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        Log.i((new StringBuilder()).append(M[13]).append(E.size()).toString());
        return;
        App.a(j, false, true);
        Object obj = (InputMethodManager)App.au.getSystemService(M[14]);
        int j1;
        int k1;
        try
        {
            if (((InputMethodManager) (obj)).isFullscreenMode())
            {
                ((InputMethodManager) (obj)).hideSoftInputFromWindow(p.getWindowToken(), 0);
            }
        }
        catch (IllegalArgumentException illegalargumentexception6)
        {
            throw illegalargumentexception6;
        }
        k1 = b.d();
        j1 = c(b.d());
        try
        {
            Log.i((new StringBuilder()).append(M[10]).append(k1).append(M[12]).append(j1).append(M[11]).append(E.size()).toString());
            g.add(((c4)E.get(j1)).y);
            E.remove(j1);
            if (E.isEmpty())
            {
                c();
                finish();
                return;
            }
        }
        catch (IllegalArgumentException illegalargumentexception5)
        {
            throw illegalargumentexception5;
        }
        b.removeViewAt(k1);
        TranslateAnimation translateanimation;
        boolean flag2;
        if (j1 >= E.size())
        {
            j1--;
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (E.size() == 1)
        {
            b.removeViewAt(b.getChildCount() - 1);
            b.removeViewAt(0);
            findViewById(0x7f0b026f).setVisibility(8);
            findViewById(0x7f0b026e).setVisibility(8);
            u.setVisibility(8);
            z.setVisibility(8);
            j1 = ((flag) ? 1 : 0);
        }
        j1 = b(j1);
        try
        {
            b.setCurrentScreen(j1);
            if (F != null)
            {
                H.add(F.y);
            }
        }
        catch (IllegalArgumentException illegalargumentexception7)
        {
            throw illegalargumentexception7;
        }
        try
        {
            if (j != null)
            {
                w.add(j.a);
            }
        }
        catch (IllegalArgumentException illegalargumentexception8)
        {
            throw illegalargumentexception8;
        }
        illegalargumentexception6 = b.getChildAt(j1);
        try
        {
            flag2 = App.aR();
        }
        catch (IllegalArgumentException illegalargumentexception9)
        {
            throw illegalargumentexception9;
        }
        if (flag2)
        {
            j1 = 1;
        } else
        {
            j1 = -1;
        }
        if (k1 != 0)
        {
            k1 = -1;
        } else
        {
            k1 = 1;
        }
        translateanimation = new TranslateAnimation((k1 * j1 * illegalargumentexception6.getWidth()) / 2, 0.0F, 0.0F, 0.0F);
        translateanimation.setDuration(D);
        translateanimation.setFillAfter(true);
        illegalargumentexception6.startAnimation(translateanimation);
        return;
    }

    static void e(PopupNotification popupnotification)
    {
        popupnotification.b();
    }

    public static void e(String s1)
    {
        Object obj;
        boolean flag;
        try
        {
            obj = s;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
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
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        flag = s.i();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        obj = s.j;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (s1.equals(s.j.a))
        {
            s.finish();
        }
    }

    private View f(c4 c4_1)
    {
        if (c4_1.n != 1)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        View view = ((LayoutInflater)getSystemService(M[25])).inflate(0x7f030053, null, false);
        ImageButton imagebutton = (ImageButton)view.findViewById(0x7f0b017b);
        TextView textview = (TextView)view.findViewById(0x7f0b0194);
        ProgressBar progressbar = (ProgressBar)view.findViewById(0x7f0b0088);
        akr akr1 = new akr(this);
        int i1;
        try
        {
            akr1.b(c4_1);
            akr1.a(new o(this, imagebutton, progressbar, akr1, textview));
            i1 = c4_1.H;
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
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        textview.setText(DateUtils.formatElapsedTime(c4_1.H));
        if (!q)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        textview.setText(Formatter.formatShortFileSize(App.au, c4_1.t));
        imagebutton.setOnClickListener(new ao(this, akr1));
        return view;
        c4_1 = new ThumbnailButton(this);
        c4_1.setMinimumHeight(getResources().getDimensionPixelSize(0x7f0a004d));
        c4_1.setMaxHeight(getResources().getDimensionPixelSize(0x7f0a004d));
        c4_1.setAdjustViewBounds(true);
        c4_1.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        c4_1.setImageBitmap(cl.e(this));
        c4_1.setOnClickListener(c);
        return c4_1;
    }

    static ArrayList f(PopupNotification popupnotification)
    {
        return popupnotification.E;
    }

    private void f()
    {
        SensorEventListener sensoreventlistener;
        Log.i(M[24]);
        m = 5F;
        y.removeCallbacks(C);
        y.postDelayed(C, 600L);
        sensoreventlistener = r;
        IllegalArgumentException illegalargumentexception;
        if (sensoreventlistener == null)
        {
            try
            {
                if (d != null)
                {
                    r = new com.whatsapp.notification.a(this);
                    A.registerListener(r, d, 0);
                    return;
                }
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        break MISSING_BLOCK_LABEL_93;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    static Sensor g(PopupNotification popupnotification)
    {
        return popupnotification.d;
    }

    private View g(c4 c4_1)
    {
        boolean flag = q;
        RelativeLayout relativelayout = new RelativeLayout(this);
        relativelayout.setGravity(17);
        View view = ((LayoutInflater)getBaseContext().getSystemService(M[18])).inflate(0x7f030044, relativelayout, true);
        TextView textview = (TextView)view.findViewById(0x7f0b0178);
        TextView textview1 = (TextView)view.findViewById(0x7f0b0179);
        Object obj;
        if (!TextUtils.isEmpty(c4_1.L))
        {
            obj = c4_1.L.split("\n");
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            Object obj1;
            int i1;
            boolean flag1;
            try
            {
                i1 = obj.length;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                try
                {
                    throw c4_1;
                }
                // Misplaced declaration of an exception variable
                catch (c4 c4_1) { }
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
            if (i1 != 0)
            {
                break MISSING_BLOCK_LABEL_128;
            }
        }
        textview.setVisibility(8);
        textview1.setVisibility(8);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_374;
        }
        textview.setVisibility(0);
        if (c4_1.l == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        flag1 = "".equals(c4_1.l);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        obj1 = (new StringBuilder()).append(M[21]).append(Uri.encode(c4_1.L.replaceAll(M[16], "+"))).append(M[19]).append(c4_1.o).append(",").append(c4_1.v).toString();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        obj1 = c4_1.l;
        textview.setAutoLinkMask(0);
        textview.setText(Html.fromHtml((new StringBuilder()).append(M[17]).append(((String) (obj1))).append(M[15]).append(obj[0]).append(M[20]).toString()));
        i1 = obj.length;
        if (i1 <= 1)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        flag1 = "".equals(obj[1]);
        if (!flag1)
        {
            try
            {
                textview1.setVisibility(0);
                textview1.setText(obj[1]);
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_352;
            }
        }
        textview1.setVisibility(8);
        obj = new t(this, ((String) (obj1)));
        textview.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        textview1.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        obj1 = (ThumbnailButton)view.findViewById(0x7f0b012a);
        i1 = (int)t.m;
        try
        {
            ((ThumbnailButton) (obj1)).setPadding(i1, i1, i1, i1);
            ((ThumbnailButton) (obj1)).setRadius(t.h);
            ((ThumbnailButton) (obj1)).setBorderSize(1.0F);
            ((ThumbnailButton) (obj1)).setBorderColor(0x66000000);
            if (l.add(c4_1.y.a))
            {
                com.whatsapp.util.y.a(c4_1.y.a);
            }
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        obj = com.whatsapp.util.y.a(c4_1);
        c4_1 = ((c4) (obj));
        if (obj == null)
        {
            c4_1 = cl.f(this);
        }
        ((ThumbnailButton) (obj1)).setImageBitmap(c4_1);
        ((ThumbnailButton) (obj1)).setOnClickListener(c);
        return relativelayout;
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        throw c4_1;
    }

    private void g()
    {
        android.os.PowerManager.WakeLock wakelock;
        Log.i(M[8]);
        wakelock = I;
        IllegalArgumentException illegalargumentexception;
        if (wakelock != null)
        {
            try
            {
                if (!I.isHeld())
                {
                    I.acquire();
                }
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        h.removeCallbacks(f);
        h.postDelayed(f, 5000L);
        return;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    static int h()
    {
        return D;
    }

    static void h(PopupNotification popupnotification)
    {
        popupnotification.c();
    }

    static void i(PopupNotification popupnotification)
    {
        popupnotification.d();
    }

    static GalleryView j(PopupNotification popupnotification)
    {
        return popupnotification.b;
    }

    private void j()
    {
        if (j != null)
        {
            android.graphics.Bitmap bitmap = j.a(getResources().getDimensionPixelSize(0x7f0a0059), getResources().getDimension(0x7f0a0058), true);
            if (bitmap == null)
            {
                bitmap = j.j();
            }
            ((ImageView)findViewById(0x7f0b0259)).setImageBitmap(bitmap);
        }
    }

    static HashSet k(PopupNotification popupnotification)
    {
        return popupnotification.H;
    }

    static SensorManager l(PopupNotification popupnotification)
    {
        return popupnotification.A;
    }

    static android.os.PowerManager.WakeLock m(PopupNotification popupnotification)
    {
        return popupnotification.I;
    }

    static ImageButton n(PopupNotification popupnotification)
    {
        return popupnotification.e;
    }

    static float o(PopupNotification popupnotification)
    {
        return popupnotification.m;
    }

    static SensorEventListener p(PopupNotification popupnotification)
    {
        return popupnotification.r;
    }

    static og q(PopupNotification popupnotification)
    {
        return popupnotification.j;
    }

    static ImageButton r(PopupNotification popupnotification)
    {
        return popupnotification.i;
    }

    static void s(PopupNotification popupnotification)
    {
        popupnotification.e();
    }

    static HashSet t(PopupNotification popupnotification)
    {
        return popupnotification.w;
    }

    public void a()
    {
        try
        {
            if (!E.isEmpty())
            {
                a(c(b.d()));
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    public void a(int i1)
    {
        boolean flag;
        flag = q;
        og og1;
        try
        {
            F = (c4)E.get(i1);
            a.a(F.y.a);
            j = u5.d(F.y.a);
            og1 = j;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (og1 == null)
        {
            return;
        }
        boolean flag2 = App.R();
        ImageButton imagebutton;
        IllegalArgumentException illegalargumentexception1;
        int j1;
        int k1;
        if (flag2)
        {
            try
            {
                if (!j.k())
                {
                    App.a(j);
                }
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
        }
        try
        {
            j1 = E.size();
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            try
            {
                throw illegalargumentexception3;
            }
            catch (IllegalArgumentException illegalargumentexception4)
            {
                throw illegalargumentexception4;
            }
        }
        if (j1 == 1)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        if (!App.R())
        {
            break MISSING_BLOCK_LABEL_143;
        }
        H.add(F.y);
        w.add(j.a);
label0:
        {
            j();
            j1 = 0x7f0e047a;
            if (F.w == 2)
            {
                k1 = 0x7f0e0221;
                j1 = k1;
                if (!flag)
                {
                    break label0;
                }
                j1 = k1;
            }
            try
            {
                k1 = F.w;
            }
            catch (IllegalArgumentException illegalargumentexception5)
            {
                throw illegalargumentexception5;
            }
            if (k1 == 3)
            {
                j1 = 0x7f0e04a2;
            }
        }
        G.setText(j1);
        n.setText(com.whatsapp.util.c.b(j.a(this), this));
        flag2 = j.k();
        if (flag2)
        {
            IllegalArgumentException illegalargumentexception6;
            try
            {
                J.setText((new StringBuilder()).append(App.az.e(F.G).a(this)).append(" ").toString());
            }
            catch (IllegalArgumentException illegalargumentexception7)
            {
                throw illegalargumentexception7;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_319;
            }
        }
        J.setText((new StringBuilder()).append(j.v()).append(" ").toString());
        boolean flag1;
        try
        {
            B.setText(getString(0x7f0e023c, new Object[] {
                Integer.valueOf(i1 + 1), Integer.valueOf(E.size())
            }));
            imagebutton = e;
            i1 = p.getText().toString().length();
        }
        catch (IllegalArgumentException illegalargumentexception8)
        {
            throw illegalargumentexception8;
        }
        if (i1 != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        imagebutton.setEnabled(flag1);
        return;
        illegalargumentexception1;
        throw illegalargumentexception1;
        illegalargumentexception6;
        throw illegalargumentexception6;
    }

    public void a(String s1)
    {
    }

    public void a(Collection collection)
    {
    }

    public void b(String s1)
    {
        og og1;
        boolean flag;
        try
        {
            og1 = j;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
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
        if (og1 == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        flag = s1.equals(j.a);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (!mk.h(s1))
        {
            J.setText((new StringBuilder()).append(j.v()).append(" ").toString());
        }
    }

    public void c(String s1)
    {
    }

    public void d(String s1)
    {
        og og1 = j;
        if (og1 != null)
        {
            try
            {
                if (s1.equals(j.a))
                {
                    j();
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        break MISSING_BLOCK_LABEL_34;
        s1;
        throw s1;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = akr.i();
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (flag)
        {
            return false;
        } else
        {
            return super.dispatchTouchEvent(motionevent);
        }
    }

    public boolean i()
    {
        return o;
    }

    public void k()
    {
        int k1;
        int l1;
        boolean flag1;
        flag1 = q;
        Log.i(M[23]);
        k1 = com.whatsapp.notification.a1.c().a(g.GROUP);
        l1 = com.whatsapp.notification.a1.c().a(g.INDIVIDUAL);
        if (k1 != 0 || l1 != 0) goto _L2; else goto _L1
_L1:
        finish();
_L20:
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
_L2:
        int i1 = c(b.d());
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        Iterator iterator;
        og og1;
        boolean flag;
        try
        {
            i1 = p.getText().toString().length();
        }
        // Misplaced declaration of an exception variable
        catch (Iterator iterator)
        {
            throw iterator;
        }
        if (i1 != 0) goto _L4; else goto _L5
_L5:
        flag = true;
_L13:
        E = new ArrayList();
        iterator = u5.d().iterator();
_L7:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        og1 = u5.d((String)iterator.next());
        i1 = og1.c;
        if (i1 <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        Iterator iterator1;
        c4 c4_1;
        boolean flag2;
        try
        {
            flag2 = og1.k();
        }
        // Misplaced declaration of an exception variable
        catch (Iterator iterator)
        {
            try
            {
                throw iterator;
            }
            // Misplaced declaration of an exception variable
            catch (Iterator iterator)
            {
                throw iterator;
            }
        }
        if (!flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag1) goto _L7; else goto _L6
_L6:
        if (l1 == 0 && !flag1) goto _L7; else goto _L8
_L8:
        iterator1 = App.ah.a(og1.a, og1.c).iterator();
_L10:
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        c4_1 = (c4)iterator1.next();
        flag2 = g.contains(c4_1.y);
        if (flag2)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag2 = og1.k();
        if (!flag2)
        {
            if (l1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            try
            {
                E.add(c4_1);
            }
            // Misplaced declaration of an exception variable
            catch (Iterator iterator)
            {
                throw iterator;
            }
            if (!flag1)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        E.add(c4_1);
        if (!flag1) goto _L10; else goto _L9
_L9:
        if (!flag1) goto _L7; else goto _L11
_L11:
        try
        {
            Log.i((new StringBuilder()).append(M[22]).append(E.size()).toString());
            if (E.isEmpty())
            {
                finish();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Iterator iterator)
        {
            throw iterator;
        }
        break; /* Loop/switch isn't completed */
        iterator;
        throw iterator;
_L4:
        flag = false;
        if (true) goto _L13; else goto _L12
        iterator;
        throw iterator;
        iterator;
        throw iterator;
        iterator;
        throw iterator;
        iterator;
        throw iterator;
_L12:
        i1 = E.size();
        int j1;
        if (i1 == 1)
        {
            Object obj;
            Object obj1;
            Object obj2;
            ScrollView scrollview;
            android.widget.RelativeLayout.LayoutParams layoutparams;
            boolean flag3;
            try
            {
                findViewById(0x7f0b026f).setVisibility(8);
                findViewById(0x7f0b026e).setVisibility(8);
                u.setVisibility(8);
                z.setVisibility(8);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_468;
            }
        }
        findViewById(0x7f0b026f).setVisibility(0);
        findViewById(0x7f0b026e).setVisibility(0);
        u.setVisibility(0);
        z.setVisibility(0);
        Collections.sort(E, new as(this));
        b.removeAllViews();
        if (E.size() > 1)
        {
            obj = new TextView(this);
            ((TextView) (obj)).setGravity(17);
            obj1 = new RelativeLayout(this);
            obj2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(13);
            ((RelativeLayout) (obj1)).addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj2)));
            b.addView(((View) (obj1)));
        }
        obj = E.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj1 = e((c4)((Iterator) (obj)).next());
            obj2 = new RelativeLayout(this);
            scrollview = new ScrollView(this);
            layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutparams.addRule(13);
            scrollview.addView(((View) (obj1)));
            ((RelativeLayout) (obj2)).addView(scrollview, layoutparams);
            b.addView(((View) (obj2)));
        } while (!flag1);
        if (E.size() > 1)
        {
            obj = new TextView(this);
            ((TextView) (obj)).setGravity(17);
            obj1 = new RelativeLayout(this);
            obj2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(13);
            ((RelativeLayout) (obj1)).addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj2)));
            b.addView(((View) (obj1)));
        }
        try
        {
            obj = F;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1039;
        }
        if (flag)
        {
            (new Handler()).post(new r(this));
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_1039;
            }
        }
        obj = E.iterator();
        j1 = 0;
_L23:
        i1 = j1;
        if (!((Iterator) (obj)).hasNext()) goto _L15; else goto _L14
_L14:
        obj1 = (c4)((Iterator) (obj)).next();
        try
        {
            flag3 = ((c4) (obj1)).y.equals(F.y);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (!flag3) goto _L17; else goto _L16
_L16:
        i1 = j1;
        if (!flag1) goto _L15; else goto _L17
_L17:
        i1 = j1 + 1;
        if (!flag1) goto _L18; else goto _L15
_L15:
        j1 = i1;
        if (i1 == E.size())
        {
            j1 = 0;
        }
_L24:
        b.setCurrentScreen(b(j1));
        obj = AnimationUtils.loadAnimation(this, 0x7f040000);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        ((Animation) (obj)).setDuration(i1 * D);
        ((Animation) (obj)).setFillAfter(true);
        B.startAnimation(((Animation) (obj)));
        obj = u5.d(((c4)E.get(0)).y.a);
        flag3 = ((og) (obj)).k();
        if (!flag3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k1 != 2 && k1 != 3) goto _L20; else goto _L19
_L19:
        getWindow().addFlags(0x80000);
        f();
        if (!flag1) goto _L20; else goto _L21
_L21:
        if (l1 != 2 && l1 != 3) goto _L20; else goto _L22
_L22:
        try
        {
            getWindow().addFlags(0x80000);
            f();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
_L18:
        j1 = i1;
          goto _L23
        j1 = 0;
          goto _L24
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        c();
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag = q;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0x99000000));
        A = (SensorManager)getSystemService(M[2]);
        d = A.getDefaultSensor(8);
        Log.i(M[0]);
        bundle = (PowerManager)App.au.getSystemService(M[3]);
        if (bundle != null)
        {
            try
            {
                I = bundle.newWakeLock(0x1000000a, M[1]);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        try
        {
            setContentView(iz.a(getLayoutInflater(), 0x7f030094, null, false));
            s = this;
            t = a1g.a();
            b = (GalleryView)findViewById(0x7f0b0271);
            p = (ConversationTextEntry)findViewById(0x7f0b0168);
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                p.setBackgroundResource(0x7f020603);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        G = (Button)findViewById(0x7f0b0273);
        n = (TextView)findViewById(0x7f0b026d);
        J = (TextView)findViewById(0x7f0b010d);
        B = (TextView)findViewById(0x7f0b0270);
        L = findViewById(0x7f0b020b);
        ((ImageView)L).setImageDrawable(new m(getResources().getDrawable(0x7f02063b)));
        u = findViewById(0x7f0b026b);
        v = findViewById(0x7f0b020a);
        ((ImageView)v).setImageDrawable(new m(getResources().getDrawable(0x7f02063c)));
        z = findViewById(0x7f0b026a);
        e = (ImageButton)findViewById(0x7f0b0164);
        i = (ImageButton)findViewById(0x7f0b0165);
        b.setEventCallback(new u(this));
        ((Button)findViewById(0x7f0b0272)).setOnClickListener(new e(this));
        c = new com.whatsapp.notification.c(this);
        G.setOnClickListener(c);
        bundle = new j(this);
        L.setOnClickListener(bundle);
        u.setOnClickListener(bundle);
        bundle = new com.whatsapp.notification.g(this);
        v.setOnClickListener(bundle);
        z.setOnClickListener(bundle);
        e.setImageDrawable(new m(getResources().getDrawable(0x7f020641)));
        p.setOnClickListener(new a_(this));
        a = new com.whatsapp.notification.y(this, this, new f(this));
        i.setVisibility(0);
        e.setVisibility(8);
        bundle = new b(this);
        p.addTextChangedListener(bundle);
        bundle = new i(this);
        p.setOnEditorActionListener(bundle);
        e.setOnClickListener(new at(this));
        k = new fe(this);
        k.a(x);
        k.a(null);
        bundle = (ImageButton)findViewById(0x7f0b0167);
        try
        {
            bundle.setOnClickListener(new af(this, bundle));
            k();
            App.b(this);
            if (App.a3())
            {
                showDialog(115);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (flag)
        {
            DialogToastActivity.g++;
        }
    }

    public Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return super.onCreateDialog(i1);

        case 116: // 't'
            Dialog dialog;
            try
            {
                dialog = all.a(this, K);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return dialog;

        case 115: // 's'
            Log.i(M[9]);
            return m7.a(this);
        }
    }

    public void onDestroy()
    {
        boolean flag = q;
        Log.i(M[4]);
        super.onDestroy();
        Iterator iterator = l.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.whatsapp.util.y.c((String)iterator.next());
        } while (!flag);
        android.os.PowerManager.WakeLock wakelock;
        h.removeCallbacks(f);
        y.removeCallbacks(C);
        wakelock = I;
        IllegalArgumentException illegalargumentexception;
        if (wakelock != null)
        {
            try
            {
                if (I.isHeld())
                {
                    I.release();
                }
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        try
        {
            if (r != null)
            {
                A.unregisterListener(r);
            }
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        try
        {
            if (s == this)
            {
                s = null;
            }
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            throw illegalargumentexception3;
        }
        akr.t();
        App.a(this);
        return;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    protected void onPause()
    {
        Log.i(M[5]);
        super.onPause();
        App.aL();
    }

    protected void onResume()
    {
        Log.i(M[6]);
        super.onResume();
    }

    protected void onStart()
    {
        Log.i(M[7]);
        super.onStart();
        o = true;
    }

    public void onStop()
    {
        Log.i(M[26]);
        super.onStop();
        o = false;
    }

    static 
    {
        Object obj;
        String as1[];
        byte byte0;
        int i1;
        as1 = new String[30];
        obj = "\f8: \020\0228><\006\0254+!\t\0239e6\022\0316>0";
        byte0 = -1;
        i1 = 0;
_L2:
        String as2[];
        int j1;
        int k1;
        as2 = as1;
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
                as2[i1] = ((String) (obj));
                obj = "\f8: \020\0228><\006\0254+!\t\0239";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as2[i1] = ((String) (obj));
                obj = "\0172$&\017\016";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as2[i1] = ((String) (obj));
                obj = "\f8=0\022";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as2[i1] = ((String) (obj));
                obj = "\f8: \020\0228><\006\0254+!\t\0239e1\005\017#8:\031";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as2[i1] = ((String) (obj));
                i1 = 5;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e%\001\t$/";
                byte0 = 4;
                break;

            case 4: // '\004'
                as2[i1] = ((String) (obj));
                i1 = 6;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e'\005\017\"'0";
                byte0 = 5;
                break;

            case 5: // '\005'
                as2[i1] = ((String) (obj));
                i1 = 7;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e&\024\035%>";
                byte0 = 6;
                break;

            case 6: // '\006'
                as2[i1] = ((String) (obj));
                i1 = 8;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e\"\001\0272?%";
                byte0 = 7;
                break;

            case 7: // '\007'
                as2[i1] = ((String) (obj));
                i1 = 9;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e1\t\035;%2M\0178,!\027\035%/x\001\0368?!M\b8g0\030\f>80";
                byte0 = 8;
                break;

            case 8: // '\b'
                as2[i1] = ((String) (obj));
                i1 = 10;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e&\005\0223/;\024\016.eu\023\037%/0\016#'%&Z";
                byte0 = 9;
                break;

            case 9: // '\t'
                as2[i1] = ((String) (obj));
                i1 = 11;
                obj = "\\:/&\023\0350/&N\017>00Z";
                byte0 = 10;
                break;

            case 10: // '\n'
                as2[i1] = ((String) (obj));
                i1 = 12;
                obj = "\\:/&\023\0350/\n\020\023$p";
                byte0 = 11;
                break;

            case 11: // '\013'
                as2[i1] = ((String) (obj));
                i1 = 13;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e&\005\0223/;\024\016.e0\r\f#3u\024\031/>u";
                byte0 = 12;
                break;

            case 12: // '\f'
                as2[i1] = ((String) (obj));
                i1 = 14;
                obj = "\0259: \024#:/!\b\0233";
                byte0 = 13;
                break;

            case 13: // '\r'
                as2[i1] = ((String) (obj));
                i1 = 15;
                obj = "^i";
                byte0 = 14;
                break;

            case 14: // '\016'
                as2[i1] = ((String) (obj));
                i1 = 16;
                obj = " $a";
                byte0 = 15;
                break;

            case 15: // '\017'
                as2[i1] = ((String) (obj));
                i1 = 17;
                obj = "@6j=\022\0311ww";
                byte0 = 16;
                break;

            case 16: // '\020'
                as2[i1] = ((String) (obj));
                i1 = 18;
                obj = "\02063:\025\b\b#;\006\0206>0\022";
                byte0 = 17;
                break;

            case 17: // '\021'
                as2[i1] = ((String) (obj));
                i1 = 19;
                obj = "Z$&9]";
                byte0 = 18;
                break;

            case 18: // '\022'
                as2[i1] = ((String) (obj));
                i1 = 20;
                obj = "@x+k";
                byte0 = 19;
                break;

            case 19: // '\023'
                as2[i1] = ((String) (obj));
                i1 = 21;
                obj = "\024#>%\023Fxe8\001\f$d2\017\0230&0N\0378'z\r\035'9j\021A";
                byte0 = 20;
                break;

            case 20: // '\024'
                as2[i1] = ((String) (obj));
                i1 = 22;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e6\017\t9>o";
                byte0 = 21;
                break;

            case 21: // '\025'
                as2[i1] = ((String) (obj));
                i1 = 23;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e<\016\025#::\020\t'";
                byte0 = 22;
                break;

            case 22: // '\026'
                as2[i1] = ((String) (obj));
                i1 = 24;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e\"\001\0272?%\t\0329/0\004\0313";
                byte0 = 23;
                break;

            case 23: // '\027'
                as2[i1] = ((String) (obj));
                i1 = 25;
                obj = "\02063:\025\b\b#;\006\0206>0\022";
                byte0 = 24;
                break;

            case 24: // '\030'
                as2[i1] = ((String) (obj));
                i1 = 26;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e&\024\023'";
                byte0 = 25;
                break;

            case 25: // '\031'
                as2[i1] = ((String) (obj));
                i1 = 27;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e6\f\03168;\017\b>,<\003\035##:\016\017m";
                byte0 = 26;
                break;

            case 26: // '\032'
                as2[i1] = ((String) (obj));
                i1 = 28;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e8\023\033m";
                byte0 = 27;
                break;

            case 27: // '\033'
                as2[i1] = ((String) (obj));
                i1 = 29;
                obj = "\f8: \020\0228><\006\0254+!\t\0239e6\017\022#+6\024Q#\" \r\036x(4\023\031a~x\004\0314%1\005S28'\017\016";
                byte0 = 28;
                break;

            case 28: // '\034'
                as2[i1] = ((String) (obj));
                M = as1;
                D = 200;
                s = null;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 752
    //                   0 775
    //                   1 782
    //                   2 789
    //                   3 796;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_796;
_L3:
        byte byte1 = 96;
_L9:
        obj[j1] = (char)(byte1 ^ c2);
        j1++;
          goto _L8
_L4:
        byte1 = 124;
          goto _L9
_L5:
        byte1 = 87;
          goto _L9
_L6:
        byte1 = 74;
          goto _L9
        byte1 = 85;
          goto _L9
    }
}
