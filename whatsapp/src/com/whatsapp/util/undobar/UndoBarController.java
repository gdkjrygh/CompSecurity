// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.undobar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Method;

// Referenced classes of package com.whatsapp.util.undobar:
//            a, e, g, c, 
//            f

public class UndoBarController extends LinearLayout
{

    public static final a a;
    static final boolean c;
    private static Animation f;
    public static boolean i;
    private static Animation k;
    public static final a p;
    public static final a r;
    private static final String z[];
    private a b;
    private String d;
    private final TextView e;
    private boolean g;
    private boolean h;
    private CharSequence j;
    private int l;
    private final TextView m;
    private final Handler n;
    private f o;
    private final Runnable q;
    private float s;
    private Parcelable t;

    private UndoBarController(Context context, AttributeSet attributeset)
    {
        boolean flag = true;
        super(context, attributeset);
        b = r;
        n = new Handler();
        q = new e(this);
        l = -1;
        LayoutInflater.from(context).inflate(0x7f0300aa, this, true);
        m = (TextView)findViewById(0x7f0b02a4);
        e = (TextView)findViewById(0x7f0b02a6);
        e.setOnClickListener(new g(this));
        a(true);
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        attributeset = (WindowManager)context.getSystemService(z[10]);
        int i1;
        try
        {
            i1 = getResources().getConfiguration().orientation;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (i1 != 1)
        {
            flag = false;
        }
        g = flag;
        try
        {
            Method method = Class.forName(z[11]).getDeclaredMethod(z[12], new Class[] {
                java/lang/String
            });
            method.setAccessible(true);
            d = (String)method.invoke(null, new Object[] {
                z[9]
            });
        }
        catch (Throwable throwable)
        {
            d = null;
        }
        context = context.obtainStyledAttributes(new int[] {
            0x10103ef, 0x10103f0
        });
        h = context.getBoolean(1, false);
        context.recycle();
        flag = c;
        if (!flag)
        {
            try
            {
                if (getContext() == null)
                {
                    throw new AssertionError();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        break MISSING_BLOCK_LABEL_294;
        attributeset;
        context.recycle();
        throw attributeset;
        context;
        throw context;
        context = ((Activity)getContext()).getWindow().getAttributes();
        try
        {
            if ((((android.view.WindowManager.LayoutParams) (context)).flags & 0x8000000) != 0)
            {
                h = true;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        s = a(attributeset);
    }

    private float a(WindowManager windowmanager)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        int i1;
        try
        {
            i1 = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (WindowManager windowmanager)
        {
            try
            {
                throw windowmanager;
            }
            // Misplaced declaration of an exception variable
            catch (WindowManager windowmanager)
            {
                throw windowmanager;
            }
        }
        if (i1 < 16)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        windowmanager.getDefaultDisplay().getRealMetrics(displaymetrics);
        if (!i)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
        return Math.min((float)displaymetrics.widthPixels / displaymetrics.density, (float)displaymetrics.heightPixels / displaymetrics.density);
    }

    private int a(Context context)
    {
        Resources resources;
        resources = context.getResources();
        int i1;
        boolean flag;
        try
        {
            i1 = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (i1 < 14)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (!b(context))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        flag = g;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        context = z[18];
        flag = i;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        try
        {
            flag = a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (!flag)
        {
            return 0;
        }
        break MISSING_BLOCK_LABEL_76;
        context;
        throw context;
        context = z[19];
        return a(resources, ((String) (context)));
        return 0;
    }

    private int a(Resources resources, String s1)
    {
        int i1 = 0;
        int j1 = resources.getIdentifier(s1, z[5], z[4]);
        if (j1 > 0)
        {
            i1 = resources.getDimensionPixelSize(j1);
        }
        return i1;
    }

    private static Animation a(android.view.animation.Animation.AnimationListener animationlistener)
    {
        TranslateAnimation translateanimation = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 0.0F, 2, 1.0F);
        translateanimation.setDuration(500L);
        translateanimation.setInterpolator(new AnticipateOvershootInterpolator(1.0F));
        translateanimation.setAnimationListener(animationlistener);
        return translateanimation;
    }

    private static UndoBarController a(Activity activity)
    {
        UndoBarController undobarcontroller1 = c(activity);
        UndoBarController undobarcontroller = undobarcontroller1;
        if (undobarcontroller1 == null)
        {
            undobarcontroller = new UndoBarController(activity, null);
            ((ViewGroup)activity.findViewById(0x1020002)).addView(undobarcontroller);
        }
        return undobarcontroller;
    }

    public static UndoBarController a(Activity activity, CharSequence charsequence, f f1, Parcelable parcelable, boolean flag, a a1, int i1)
    {
        activity = a(activity);
        if (a1 == null)
        {
            try
            {
                throw new IllegalArgumentException(z[17]);
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw activity;
            }
        } else
        {
            activity.b = a1;
            activity.a(f1);
            activity.a(flag, charsequence, parcelable);
            activity.l = i1;
            return activity;
        }
    }

    static f a(UndoBarController undobarcontroller)
    {
        return undobarcontroller.o;
    }

    static void a(UndoBarController undobarcontroller, boolean flag)
    {
        undobarcontroller.a(flag);
    }

    private void a(f f1)
    {
        o = f1;
    }

    private void a(boolean flag)
    {
        boolean flag1 = i;
        n.removeCallbacks(q);
        t = null;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        setVisibility(8);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        Animation animation;
        clearAnimation();
        animation = b.c;
        if (animation != null)
        {
            IllegalArgumentException illegalargumentexception;
            try
            {
                startAnimation(b.c);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_72;
            }
        }
        startAnimation(f);
        setVisibility(8);
        return;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    private void a(boolean flag, CharSequence charsequence, Parcelable parcelable)
    {
        boolean flag1 = i;
        int i1;
        t = parcelable;
        j = charsequence;
        m.setText(j);
        i1 = b.f;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        e.setVisibility(0);
        findViewById(0x7f0b02a5).setVisibility(0);
        e.setText(b.f);
        i1 = b.b;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        try
        {
            e.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(b.b), null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        e.setVisibility(8);
        findViewById(0x7f0b02a5).setVisibility(8);
        try
        {
            if (b.d > 0)
            {
                findViewById(0x7f0b02a3).setBackgroundResource(b.d);
            }
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        try
        {
            n.removeCallbacks(q);
            if (b.e > 0L)
            {
                n.postDelayed(q, b.e);
            }
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        clearAnimation();
        charsequence = b.a;
        if (charsequence != null)
        {
            try
            {
                startAnimation(b.a);
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_249;
            }
        }
        startAnimation(k);
        try
        {
            setVisibility(0);
            i1 = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            try
            {
                throw charsequence;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence) { }
            try
            {
                throw charsequence;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence) { }
            try
            {
                throw charsequence;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
        }
        if (i1 < 19)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        i1 = l;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        i1 = l;
        if (i1 == 1)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        if (!h)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        setPadding(0, 0, 0, a(getContext()));
        return;
        charsequence;
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        throw charsequence;
        charsequence;
        throw charsequence;
    }

    private boolean a()
    {
        float f1;
        try
        {
            f1 = s;
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
        if (f1 >= 600F)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (!g)
        {
            return false;
        }
        return true;
    }

    static Parcelable b(UndoBarController undobarcontroller)
    {
        return undobarcontroller.t;
    }

    private static Animation b(android.view.animation.Animation.AnimationListener animationlistener)
    {
        TranslateAnimation translateanimation = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 1.0F, 2, 0.0F);
        translateanimation.setDuration(500L);
        translateanimation.setInterpolator(new OvershootInterpolator(1.0F));
        translateanimation.setAnimationListener(animationlistener);
        return translateanimation;
    }

    public static void b(Activity activity)
    {
        activity = c(activity);
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        activity.setVisibility(8);
        ((UndoBarController) (activity)).n.removeCallbacks(((UndoBarController) (activity)).q);
        if (((UndoBarController) (activity)).o instanceof c)
        {
            ((c)((UndoBarController) (activity)).o).a();
        }
        return;
        activity;
        throw activity;
    }

    private boolean b(Context context)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        boolean flag4 = false;
        flag1 = false;
        Resources resources = context.getResources();
        int i1 = resources.getIdentifier(z[6], z[7], z[8]);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        flag = resources.getBoolean(i1);
        if (!"1".equals(d))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        flag = flag4;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        flag = flag1;
        boolean flag2;
        try
        {
            flag2 = "0".equals(d);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (flag2)
        {
            flag = true;
        }
        return flag;
        boolean flag3;
        try
        {
            flag3 = ViewConfiguration.get(context).hasPermanentMenuKey();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (flag3)
        {
            flag = false;
        }
        return flag;
    }

    private static UndoBarController c(Activity activity)
    {
        View view = activity.findViewById(0x7f0b02a3);
        activity = null;
        if (view != null)
        {
            activity = (UndoBarController)view.getParent();
        }
        return activity;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            try
            {
                j = parcelable.getCharSequence(z[14]);
                t = parcelable.getParcelable(z[16]);
                b = (a)parcelable.getParcelable(z[15]);
                if (parcelable.getInt(z[13]) == 0)
                {
                    a(true, j, t);
                }
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Parcelable parcelable)
            {
                throw parcelable;
            }
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(z[1], j);
        bundle.putParcelable(z[3], t);
        bundle.putParcelable(z[2], b);
        bundle.putInt(z[0], getVisibility());
        return bundle;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        boolean flag;
        flag = true;
        as = new String[20];
        i1 = 0;
        obj = "~(0]8d$";
        byte0 = -1;
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
                obj = "}/'[\005e$0G;o$";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "}/'[\005{5:X?";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "}/'[\005|.(Q4";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "i/'F5a%";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "l(.Q4";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "k.-R3o\0360\\5\177\017\"B3o 7]5f\003\"F";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "j.,X";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                obj = "i/'F5a%";
                byte0 = 7;
                i1 = 8;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "y$.At`6mY;a/(Q#{";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "\177(-P5\177";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "i/'F5a%m[)&\022:G.m,\023F5x$1@3m2";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "o$7";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "~(0]8d$";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "}/'[\005e$0G;o$";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "}/'[\005{5:X?";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "}/'[\005|.(Q4";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "{5:X?(,6G.(/,@zj$cQ7x5:\032";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "f 5]=i5*[4W#\"F\005`$*S2|";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "f 5]=i5*[4W#\"F\005`$*S2|\036/U4l2 U*m";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                z = as;
                byte byte1;
                char c1;
                boolean flag1;
                try
                {
                    flag1 = com/whatsapp/util/undobar/UndoBarController.desiredAssertionStatus();
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
                if (flag1)
                {
                    flag = false;
                }
                c = flag;
                r = new a(0x7f02056c, 0x7f0e0456);
                p = new a(0x7f020565, 0x7f0e0361, -1L);
                a = new a(-1, -1, 5000L);
                k = b(((android.view.animation.Animation.AnimationListener) (null)));
                f = a(((android.view.animation.Animation.AnimationListener) (null)));
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 600
    //                   0 623
    //                   1 630
    //                   2 637
    //                   3 644;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_644;
_L3:
        byte1 = 90;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 8;
          goto _L9
_L5:
        byte1 = 65;
          goto _L9
_L6:
        byte1 = 67;
          goto _L9
        byte1 = 52;
          goto _L9
    }
}
