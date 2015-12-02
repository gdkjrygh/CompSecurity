// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            App

public class a1g
{

    private static Typeface D;
    private static final String I[];
    private static Typeface l;
    private static Typeface q;
    private static Boolean r;
    private static a1g s;
    private static Typeface z;
    public final int A;
    public final float B;
    public final float C;
    public final int E;
    public final int F;
    public final int G = Color.argb(255, 163, 213, 252);
    public final int H;
    public final float a;
    public final int b;
    public final int c = 0;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final float m;
    public final int n;
    public final float o;
    public final int p;
    public final float t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;

    private a1g(Context context)
    {
        g = context.getResources().getDisplayMetrics().density;
        o = g * 3.333333F;
        n = (int)(g * 2.666667F);
        b = (int)(1.2F * g + 0.5F);
        u = (int)(g * 2.0F + 0.5F);
        a = g * 2.0F;
        B = 8.666667F * g;
        e = (int)(43.33333F * g);
        w = (int)(43.33333F * g);
        E = (int)(12F * g);
        x = (int)(g * 2.0F);
        d = (int)(12F * g);
        float f1;
        if (g >= 1.5F)
        {
            f1 = 52F;
        } else
        {
            f1 = 42F;
        }
        k = f1;
        m = (int)(4F * g);
        f = 15.33333F * g;
        t = 11.33333F * g;
        C = 1.0F * g;
        v = (int)(26.66667F * g);
        h = g * 2.0F;
        H = (int)(83.33334F * g);
        p = (int)(g * 1.333333F);
        j = g * 3.333333F;
        y = (int)(66.66666F * g);
        F = (int)(g * 2.666667F);
        i = (int)(g * 1.333333F);
        A = (int)(4F * g);
    }

    public static a1g a()
    {
        return s;
    }

    public static void a(Context context)
    {
        try
        {
            if (s != null)
            {
                throw new IllegalStateException(I[5]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        s = new a1g(context);
    }

    public static void a(TextView textview)
    {
        int i1 = App.am;
        Typeface typeface;
        int j1;
        boolean flag;
        try
        {
            if (r == null)
            {
                b();
            }
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            throw textview;
        }
        flag = r.booleanValue();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        typeface = l;
        if (typeface != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        j1 = android.os.Build.VERSION.SDK_INT;
        if (j1 >= 21)
        {
            try
            {
                l = Typeface.create(I[1], 0);
            }
            // Misplaced declaration of an exception variable
            catch (TextView textview)
            {
                throw textview;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_78;
            }
        }
        l = Typeface.createFromAsset(App.au.getAssets(), I[2]);
        textview.setTypeface(l);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        try
        {
            if (D == null)
            {
                D = Typeface.defaultFromStyle(0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            throw textview;
        }
        textview.setTypeface(D);
        textview.getPaint().setFakeBoldText(false);
        return;
        textview;
        try
        {
            throw textview;
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview) { }
        try
        {
            throw textview;
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview) { }
        throw textview;
        textview;
        throw textview;
    }

    public static void b(TextView textview)
    {
        boolean flag;
        flag = true;
        int i1 = App.am;
        Typeface typeface;
        int j1;
        boolean flag1;
        try
        {
            if (r == null)
            {
                b();
            }
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            throw textview;
        }
        flag1 = r.booleanValue();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        typeface = z;
        if (typeface != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        j1 = android.os.Build.VERSION.SDK_INT;
        if (j1 >= 21)
        {
            try
            {
                z = Typeface.create(I[3], 0);
            }
            // Misplaced declaration of an exception variable
            catch (TextView textview)
            {
                throw textview;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_81;
            }
        }
        z = Typeface.createFromAsset(App.au.getAssets(), I[4]);
        textview.setTypeface(z);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        try
        {
            if (q == null)
            {
                q = Typeface.create(Typeface.DEFAULT, 1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            throw textview;
        }
        try
        {
            textview.setTypeface(q);
            textview = textview.getPaint();
            i1 = q.getStyle();
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            throw textview;
        }
        if ((i1 & 1) != 0)
        {
            flag = false;
        }
        textview.setFakeBoldText(flag);
        return;
        textview;
        try
        {
            throw textview;
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview) { }
        try
        {
            throw textview;
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview) { }
        throw textview;
        textview;
        throw textview;
    }

    public static boolean b()
    {
        float f1;
        int i1;
        boolean flag1;
        flag1 = true;
        i1 = App.am;
        TextPaint textpaint = new TextPaint();
        textpaint.setTextSize(20F);
        textpaint.setTypeface(Typeface.DEFAULT);
        f1 = textpaint.measureText(I[0]);
        int j1 = android.os.Build.VERSION.SDK_INT;
        if (j1 < 21)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        r = Boolean.valueOf(true);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        int k1;
        boolean flag;
        try
        {
            k1 = android.os.Build.VERSION.SDK_INT;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            try
            {
                throw illegalstateexception1;
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        }
        if (k1 >= 14)
        {
            IllegalStateException illegalstateexception;
            if (f1 == 105F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            try
            {
                r = Boolean.valueOf(flag);
            }
            catch (IllegalStateException illegalstateexception3)
            {
                try
                {
                    throw illegalstateexception3;
                }
                catch (IllegalStateException illegalstateexception4)
                {
                    throw illegalstateexception4;
                }
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_114;
            }
        }
        if (f1 == 101F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        r = Boolean.valueOf(flag);
        return r.booleanValue();
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
    }

    public float a(float f1)
    {
        float f2;
        try
        {
            f2 = g;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (f2 >= 1.5F)
        {
            f2 = f1 * 0.78F;
        } else
        {
            try
            {
                f2 = g;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            if (f2 >= 1.0F)
            {
                return f1 * 0.8F;
            }
            float f3;
            try
            {
                f3 = g;
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
            f2 = f1;
            if (f3 >= 0.75F)
            {
                return f1 * 0.8F;
            }
        }
        return f2;
    }

    public void a(EditText edittext)
    {
        int i1 = App.am;
        float f1 = g;
        if (f1 < 1.5F)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        edittext.setMaxLines(6);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        f1 = g;
        if (f1 >= 1.0F)
        {
            try
            {
                edittext.setMaxLines(5);
            }
            // Misplaced declaration of an exception variable
            catch (EditText edittext)
            {
                throw edittext;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_51;
            }
        }
        edittext.setMaxLines(4);
        return;
        edittext;
        try
        {
            throw edittext;
        }
        // Misplaced declaration of an exception variable
        catch (EditText edittext) { }
        try
        {
            throw edittext;
        }
        // Misplaced declaration of an exception variable
        catch (EditText edittext) { }
        throw edittext;
    }

    public float b(float f1)
    {
        float f2;
        try
        {
            f2 = g;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (f2 >= 1.5F)
        {
            f2 = f1 * 0.59F;
        } else
        {
            try
            {
                f2 = g;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            if (f2 >= 1.0F)
            {
                return f1 * 0.6F;
            }
            float f3;
            try
            {
                f3 = g;
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
            f2 = f1;
            if (f3 >= 0.75F)
            {
                return f1 * 0.6F;
            }
        }
        return f2;
    }

    public float c(float f1)
    {
        float f2;
        try
        {
            f2 = g;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (f2 >= 1.5F)
        {
            return 0.55F * f1;
        }
        try
        {
            f2 = g;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        if (f2 >= 1.0F)
        {
            return f1 * 0.56F;
        }
        try
        {
            f2 = g;
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        if (f2 >= 0.75F)
        {
            return 0.54F * f1;
        } else
        {
            return f1 * 0.56F;
        }
    }

    public int c()
    {
        Object obj;
label0:
        {
            obj = new DisplayMetrics();
            float f1;
            try
            {
                ((WindowManager)App.au.getSystemService(I[6])).getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
                if (((DisplayMetrics) (obj)).densityDpi < 320)
                {
                    break label0;
                }
                f1 = ((DisplayMetrics) (obj)).density;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return (int)(f1 * 25F);
        }
        int i1;
        try
        {
            i1 = ((DisplayMetrics) (obj)).densityDpi;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i1 >= 240)
        {
            return 38;
        }
        try
        {
            i1 = ((DisplayMetrics) (obj)).densityDpi;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return i1 < 160 ? 19 : 25;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[7];
        obj = "Hg|j@j\024\r8";
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
                obj = "zDQx\017z@MbD$IVlJ}";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "oJQ\177Q&wPiM}J\022GKnMK%V}C";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "zDQx\017z@MbD$HZoK|H";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "oJQ\177Q&wPiM}J\022FGmLJf\f}QY";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "zF^gG{\005LcM|I[+MgIF+@l\005VeK}L^gKs@[+MgFZ";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "~LQoM~";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                I = as;
                s = null;
                r = null;
                l = null;
                z = null;
                D = null;
                q = null;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 260
    //                   0 283
    //                   1 290
    //                   2 297
    //                   3 304;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_304;
_L3:
        byte byte1 = 34;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 9;
          goto _L9
_L5:
        byte1 = 37;
          goto _L9
_L6:
        byte1 = 63;
          goto _L9
        byte1 = 11;
          goto _L9
    }
}
