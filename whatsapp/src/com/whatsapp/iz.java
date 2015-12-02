// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.support.v4.text.BidiFormatter;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.util.bk;
import java.lang.reflect.Field;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            alu, App

public class iz
{

    public static final BidiFormatter a;
    private static final String b[];
    public static final boolean c;
    private static final String z[];

    public static int a(int i)
    {
        if ((0x800000 & i) == 0)
        {
            if ((i & 7) == 5)
            {
                return i & -8 | 3;
            }
            if ((i & 7) == 3)
            {
                return i & -8 | 5;
            }
        }
        return i;
    }

    public static View a(LayoutInflater layoutinflater, int i, ViewGroup viewgroup)
    {
        boolean flag;
        if (viewgroup != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return a(layoutinflater, i, viewgroup, flag);
    }

    public static View a(LayoutInflater layoutinflater, int i, ViewGroup viewgroup, boolean flag)
    {
        return a(layoutinflater, i, viewgroup, flag, null);
    }

    public static View a(LayoutInflater layoutinflater, int i, ViewGroup viewgroup, boolean flag, int ai[])
    {
        layoutinflater = layoutinflater.inflate(i, viewgroup, flag);
        a(((View) (layoutinflater)), ai);
        return layoutinflater;
    }

    public static String a(String s)
    {
        boolean flag;
        try
        {
            flag = App.aR();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (flag || s == null)
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(z[3]).append(s).append("\u202C").toString();
        }
    }

    public static void a(View view)
    {
        a(view, ((int []) (null)));
    }

    public static void a(View view, int ai[])
    {
        int j;
        j = App.am;
        boolean flag;
        try
        {
            flag = App.aR();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (ai == null) goto _L4; else goto _L3
_L3:
        int i;
        int k;
        int j1;
        k = view.getId();
        j1 = ai.length;
        i = 0;
_L6:
        if (i >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ai[i] == k) goto _L1; else goto _L5
_L5:
        i++;
        if (j == 0) goto _L6; else goto _L4
_L4:
        view.setPadding(view.getPaddingRight(), view.getPaddingTop(), view.getPaddingLeft(), view.getPaddingBottom());
        Object obj = view.getLayoutParams();
        if (obj instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)obj;
            marginlayoutparams.setMargins(marginlayoutparams.rightMargin, marginlayoutparams.topMargin, marginlayoutparams.leftMargin, marginlayoutparams.bottomMargin);
        }
        if (obj instanceof android.widget.RelativeLayout.LayoutParams)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)obj;
            int ai1[] = layoutparams.getRules();
            i = ai1[0];
            int l = ai1[1];
            ai1[1] = i;
            ai1[0] = l;
            i = ai1[5];
            layoutparams.addRule(5, ai1[7]);
            layoutparams.addRule(7, i);
            i = ai1[9];
            ai1[9] = ai1[11];
            ai1[11] = i;
        }
        if (obj instanceof android.widget.FrameLayout.LayoutParams)
        {
            android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams)obj;
            layoutparams1.gravity = a(layoutparams1.gravity);
        }
        if (obj instanceof android.widget.LinearLayout.LayoutParams)
        {
            obj = (android.widget.LinearLayout.LayoutParams)obj;
            obj.gravity = a(((android.widget.LinearLayout.LayoutParams) (obj)).gravity);
        }
        boolean flag1;
        if (!(view instanceof TextView))
        {
            break MISSING_BLOCK_LABEL_312;
        }
        flag1 = view instanceof EditText;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        i = android.os.Build.VERSION.SDK_INT;
        if (i < 11)
        {
            Object obj1;
            Object obj2;
            int i1;
            boolean flag2;
            try
            {
                flag2 = c;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (flag2)
            {
                break MISSING_BLOCK_LABEL_312;
            }
        }
        obj1 = (TextView)view;
        ((TextView) (obj1)).setGravity(a(((TextView) (obj1)).getGravity()));
label0:
        {
label1:
            {
                if (!(view instanceof RelativeLayout))
                {
                    break label0;
                }
                obj1 = (RelativeLayout)view;
                try
                {
                    if (android.os.Build.VERSION.SDK_INT < 16)
                    {
                        break label1;
                    }
                    ((RelativeLayout) (obj1)).setGravity(a(((RelativeLayout) (obj1)).getGravity()));
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
                if (j == 0)
                {
                    break label0;
                }
            }
            try
            {
                obj2 = android/widget/RelativeLayout.getDeclaredField(z[0]);
                ((Field) (obj2)).setAccessible(true);
                ((RelativeLayout) (obj1)).setGravity(a(((Integer)((Field) (obj2)).get(obj1)).intValue()));
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                nosuchfieldexception.printStackTrace();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                illegalargumentexception.printStackTrace();
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                illegalaccessexception.printStackTrace();
            }
        }
        if (!(view instanceof LinearLayout))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = (LinearLayout)view;
        try
        {
            obj2 = android/widget/LinearLayout.getDeclaredField(z[1]);
            ((Field) (obj2)).setAccessible(true);
            ((LinearLayout) (obj1)).setGravity(a(((Integer)((Field) (obj2)).get(obj1)).intValue()));
        }
        catch (NoSuchFieldException nosuchfieldexception1)
        {
            nosuchfieldexception1.printStackTrace();
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            illegalargumentexception1.printStackTrace();
        }
        catch (IllegalAccessException illegalaccessexception1)
        {
            illegalaccessexception1.printStackTrace();
        }
        if (((LinearLayout) (obj1)).getOrientation() != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = ((LinearLayout) (obj1)).getChildCount();
        obj2 = new ArrayList(i1);
        i = 0;
        do
        {
            if (i >= i1)
            {
                break;
            }
            ((ArrayList) (obj2)).add(((LinearLayout) (obj1)).getChildAt(i));
            i++;
        } while (j == 0);
        ((LinearLayout) (obj1)).removeAllViews();
        i = i1 - 1;
_L11:
        if (i < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((LinearLayout) (obj1)).addView((View)((ArrayList) (obj2)).get(i));
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_628;
        }
        if (!(view instanceof ViewGroup)) goto _L1; else goto _L7
_L7:
        view = (ViewGroup)view;
        i1 = view.getChildCount();
        i = 0;
_L10:
        if (i >= i1) goto _L1; else goto _L8
_L8:
        a(view.getChildAt(i), ai);
        i++;
        if (j == 0) goto _L10; else goto _L9
_L9:
        return;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
        i--;
          goto _L11
    }

    public static void a(TextView textview)
    {
        if (textview == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        a(textview, textview.getText());
        return;
        textview;
        throw textview;
    }

    public static void a(TextView textview, CharSequence charsequence)
    {
label0:
        {
            int k = App.am;
            boolean flag;
            try
            {
                flag = c;
            }
            // Misplaced declaration of an exception variable
            catch (TextView textview)
            {
                throw textview;
            }
            while (flag || textview == null) 
            {
                return;
            }
            int j = textview.getGravity() & -8;
            int i = j;
            try
            {
                if (!TextUtils.isEmpty(charsequence))
                {
                    break label0;
                }
                flag = App.aR();
            }
            // Misplaced declaration of an exception variable
            catch (TextView textview)
            {
                throw textview;
            }
            i = j;
            if (flag)
            {
                j |= 3;
                i = j;
                if (k == 0)
                {
                    break MISSING_BLOCK_LABEL_106;
                }
                i = j;
            }
            j = i | 5;
            i = j;
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_106;
            }
            i = j;
        }
        try
        {
            flag = a(charsequence);
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            throw textview;
        }
        j = i;
        if (flag)
        {
            j = i | 3;
            i = j;
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_106;
            }
        }
        i = j | 5;
        textview.setGravity(i);
        return;
    }

    private static boolean a()
    {
        int i;
        i = 0;
        int j;
        try
        {
            j = android.os.Build.VERSION.SDK_INT;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (j < 11) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        boolean flag;
        if (Build.DISPLAY != null && (flag = bk.a(b, Build.DISPLAY))) goto _L1; else goto _L3
_L3:
        if (!App.H) goto _L5; else goto _L4
_L4:
        Object obj = App.au.getText(0x7f0e04b5);
_L7:
        int ai[];
        int k;
        TextView textview = new TextView(App.au);
        textview.setGravity(5);
        textview.setText(((CharSequence) (obj)));
        textview.setTextColor(0xff000000);
        textview.setBackgroundColor(-1);
        textview.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)textview.getPaint().measureText(((CharSequence) (obj)).toString()) * 3, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        obj = Bitmap.createBitmap(textview.getMeasuredWidth() / 2, textview.getMeasuredHeight(), android.graphics.Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        canvas.drawColor(-1);
        textview.getLayout().draw(canvas);
        ai = new int[((Bitmap) (obj)).getWidth() * ((Bitmap) (obj)).getHeight()];
        ((Bitmap) (obj)).getPixels(ai, 0, ((Bitmap) (obj)).getWidth(), 0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
        k = ai.length;
        boolean flag2;
        boolean flag1 = false;
        do
        {
            flag2 = flag1;
            if (i >= k)
            {
                break;
            }
            if (ai[i] != -1)
            {
                flag1 = true;
            }
            i++;
        } while (true);
        break MISSING_BLOCK_LABEL_248;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            flag2 = false;
        }
        Log.a(z[4], ((Throwable) (obj)));
        return flag2;
_L5:
        obj = "\u0623";
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static boolean a(CharSequence charsequence)
    {
        boolean flag;
label0:
        {
            flag = false;
            try
            {
                if (!TextUtils.isEmpty(charsequence))
                {
                    break label0;
                }
                Log.w(z[2]);
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
            return true;
        }
        int i = charsequence.toString().codePointAt(0);
        if (i < 1424 || i > 1791)
        {
            flag = true;
        }
        return flag;
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "F<sXtB\017x";
        byte0 = -1;
        as1 = as;
        i = 0;
_L10:
        int j;
        int k;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L7:
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "F<sXtB\017x";
                i = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\177\036yMGF\024kPNJ\031dU-B\bU\\z_7Uk\"_\036yM\"B\b!\\o[\017x\031mY[oLnG";
                i = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\u2024\u2051";
                i = 3;
                as1 = as;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "H\023dZiY\017m";
                i = 4;
                as1 = as;
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                as = new String[48];
                i = 0;
                as1 = as;
                obj = "l2O~Gy9S|CoUIcNhJ";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i] = ((String) (obj));
                obj = "l2O~Gy9S|CoUKqIlI";
                byte0 = 5;
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i] = ((String) (obj));
                obj = "l2O~Gy9S|CoUKqIaJ";
                byte0 = 6;
                i = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i] = ((String) (obj));
                obj = "l2O~Gy9S|CoUKqNiI";
                byte0 = 7;
                i = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i] = ((String) (obj));
                obj = "l2O~Gy9S|CoUKpIlH";
                byte0 = 8;
                i = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "l2O~Gy9S|CoUKpIaJ";
                byte0 = 9;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "l2O~Gy9S|CoUKsIlJ";
                byte0 = 10;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "l2O~Gy9S|CoUKsIaJ";
                byte0 = 11;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "b!@}MyUW\0276\005=HwCg";
                byte0 = 12;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "m2S|Do(/o3\005<HwEn)CkGj?/aKg:3";
                byte0 = 13;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "l2O~Gy9S|CoUKqNfJ";
                byte0 = 14;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "s,JmJ\0053D{Pn,";
                byte0 = 15;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "l2O~Gy9S|CoUKqInO";
                byte0 = 16;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "m)F\0011";
                byte0 = 17;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "e\036yMPD\026";
                byte0 = 18;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\037U4\0273\006J2\r]o=Q\0240\030J";
                byte0 = 19;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "x0@k@e2J\031Pd6!\b,\030U1";
                byte0 = 20;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "m)N`M\0051IsRh";
                byte0 = 21;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "l2O~Gy9S|CoUKpH}C";
                byte0 = 22;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "l2O~Gy9S|CoUKqH}9";
                byte0 = 23;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "l2O~Gy9S|CoUKqH}B";
                byte0 = 24;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "l2O~Gy9S|CoUKqH}<";
                byte0 = 25;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\035U4\0273tL2\024Q{?,pPoV3\b";
                byte0 = 26;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "l2O~Gy9S|CoUKsH}9";
                byte0 = 27;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "l2O~Gy9S|CoUKpH}<";
                byte0 = 28;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "l2O~Gy9S|CoUYaIbM";
                byte0 = 29;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "a)EwGf$T\n]\031U4\000,\033";
                byte0 = 30;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "m)N`M\0051HsRh";
                byte0 = 31;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "l2O~Gy9S|CoUKqIzO";
                byte0 = 32;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 29;
                obj = "l2O~Gy9S|CoUYaNfM";
                byte0 = 33;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "\035U4\0273\006J7\016/x+E\024Ky?,\r2";
                byte0 = 34;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "m)N`M\0051IsRo";
                byte0 = 35;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "l2O~Gy9S|CoUYaI{0";
                byte0 = 36;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "l2O~Gy9S|CoUKpIzL";
                byte0 = 37;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 34;
                obj = "m2S|Do(/o3\005<HwEn)CkGj?/aU`70";
                byte0 = 38;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "d7X|Ot.5f6\005C/\t";
                byte0 = 39;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 36;
                obj = "l2O~Gy9S|CoUKsIzN";
                byte0 = 40;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 37;
                obj = "\037U1\0270\005:/\t,\035I";
                byte0 = 41;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "c\036ctK~2!o4";
                byte0 = 42;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "l2O~Gy9S|CoUKpNiH";
                byte0 = 43;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "m2S|Do(/o3\005<HwEn)CkGj?/aU`13";
                byte0 = 44;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 41;
                obj = "l)K\0002";
                byte0 = 45;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 42;
                obj = "\037U1\027C\005I/\n4\023";
                byte0 = 46;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "l2O~Gy9S|CoUKiNjI";
                byte0 = 47;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 47: // '/'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "l2O~Gy9S|CoUKiI{I";
                byte0 = 48;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 48: // '0'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "l2O~Gy9S|CoUKiI{>";
                byte0 = 49;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 49: // '1'
                as1[i] = ((String) (obj));
                i = 46;
                obj = "l2O~Gy9S|CoUKiNhJ";
                byte0 = 50;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 50: // '2'
                as1[i] = ((String) (obj));
                i = 47;
                obj = "l2O~Gy9S|CoUKiIaI";
                byte0 = 51;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 51: // '3'
                as1[i] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 408
    //                   0 430
    //                   1 437
    //                   2 444
    //                   3 450;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_450;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 2;
_L8:
        obj[j] = (char)(byte1 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 43;
          goto _L8
_L3:
        byte1 = 123;
          goto _L8
_L4:
        byte1 = 1;
          goto _L8
        byte1 = 57;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        b = as;
        c = a();
        a = (new android.support.v4.text.BidiFormatter.Builder()).setTextDirectionHeuristic(new alu()).build();
    }
}
