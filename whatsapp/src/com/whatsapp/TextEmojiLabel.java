// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            qv, App, ao5

public class TextEmojiLabel extends TextView
{

    private static boolean d;
    private static final android.text.Spannable.Factory e;
    private static final String z[];
    private CharSequence a;
    private ao5 b;
    private android.widget.TextView.BufferType c;
    private int f;

    public TextEmojiLabel(Context context)
    {
        super(context);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        if (!d)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        setSpannableFactory(e);
        return;
        context;
        throw context;
    }

    public TextEmojiLabel(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        if (!d)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        setSpannableFactory(e);
        return;
        context;
        throw context;
    }

    public TextEmojiLabel(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        if (!d)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        setSpannableFactory(e);
        return;
        context;
        throw context;
    }

    private String a(CharSequence charsequence)
    {
        int j = App.am;
        String s = "";
        int i = 0;
        String s1;
        do
        {
            s1 = s;
            if (i >= charsequence.length())
            {
                break;
            }
            char c1 = charsequence.charAt(i);
            s1 = (new StringBuilder()).append(s).append(z[12]).append(Integer.toHexString(c1)).append(z[11]).toString();
            i++;
            s = s1;
        } while (j == 0);
        return s1;
    }

    private void a()
    {
        CharSequence charsequence;
        Layout layout;
        int i;
        int k;
        i = 0;
        k = App.am;
        Log.e((new StringBuilder()).append(z[4]).append(getMeasuredWidth()).toString());
        charsequence = getText();
        Log.e((new StringBuilder()).append(z[3]).append(a(charsequence)).toString());
        layout = getLayout();
        Log.e((new StringBuilder()).append(z[7]).append(layout.getLineCount()).toString());
_L2:
        int j;
        int l;
label0:
        {
            if (i >= layout.getLineCount())
            {
                break; /* Loop/switch isn't completed */
            }
            l = layout.getLineStart(i);
            if (i == layout.getLineCount() - 1)
            {
                j = charsequence.length();
                if (k == 0)
                {
                    break label0;
                }
            }
            j = layout.getLineStart(i + 1);
        }
        if (l <= j)
        {
            try
            {
                Log.e((new StringBuilder()).append(z[5]).append(i).append(z[1]).append(l).append("-").append(j).append(z[0]).append(a(charsequence.subSequence(l, j))).toString());
            }
            catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
            {
                throw arrayindexoutofboundsexception;
            }
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_289;
            }
        }
        Log.e((new StringBuilder()).append(z[2]).append(i).append(z[6]).append(l).append("-").append(j).append(")").toString());
        i++;
        if (k == 0) goto _L2; else goto _L1
_L1:
    }

    private void a(int i, int j)
    {
        int l = App.am;
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(a);
        int k = spannablestringbuilder.nextSpanTransition(0, spannablestringbuilder.length(), android/text/style/MetricAffectingSpan);
        do
        {
            if (k < 0 || k >= spannablestringbuilder.length())
            {
                break;
            }
            spannablestringbuilder.insert(k, " ");
            k = spannablestringbuilder.nextSpanTransition(k + 1, spannablestringbuilder.length(), android/text/style/MetricAffectingSpan);
        } while (l == 0);
        try
        {
            a = spannablestringbuilder;
            super.setText(spannablestringbuilder);
            super.onMeasure(i, j);
            return;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            Log.e((new StringBuilder()).append(z[8]).append(arrayindexoutofboundsexception.toString()).toString());
        }
        arrayindexoutofboundsexception = new SpannableStringBuilder(a);
        k = TextUtils.indexOf(arrayindexoutofboundsexception, '\n', 0);
        SpannableStringBuilder spannablestringbuilder1;
        do
        {
            spannablestringbuilder1 = arrayindexoutofboundsexception;
            if (k < 0)
            {
                break;
            }
            spannablestringbuilder1 = arrayindexoutofboundsexception.replace(k, k + 1, " ");
            k = TextUtils.indexOf(spannablestringbuilder1, '\n', k + 1);
            arrayindexoutofboundsexception = spannablestringbuilder1;
        } while (l == 0);
        a = spannablestringbuilder1;
        super.setText(spannablestringbuilder1);
        super.onMeasure(i, j);
    }

    protected void onDraw(Canvas canvas)
    {
        try
        {
            super.onDraw(canvas);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            Log.a(canvas);
        }
        a();
        throw new RuntimeException(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        try
        {
            k = android.os.Build.VERSION.SDK_INT;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            try
            {
                throw arrayindexoutofboundsexception;
            }
            catch (SecurityException securityexception)
            {
                throw securityexception;
            }
        }
        if (k == 16) goto _L2; else goto _L1
_L1:
        k = android.os.Build.VERSION.SDK_INT;
        if (k != 17) goto _L3; else goto _L2
_L2:
        super.onMeasure(i, j);
_L4:
        i = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
        Object obj;
        Object obj1;
        try
        {
            j = f;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception1)
        {
            try
            {
                throw arrayindexoutofboundsexception1;
            }
            catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception2)
            {
                throw arrayindexoutofboundsexception2;
            }
        }
        if (j == i)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        if (!(a instanceof Spanned))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = getEllipsize();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        f = i;
        obj = TextUtils.ellipsize(a, getPaint(), i, getEllipsize());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        if (!obj.equals(getText()))
        {
            super.setText(((CharSequence) (obj)), c);
        }
        return;
        obj1;
        Log.e((new StringBuilder()).append(z[10]).append(((ArrayIndexOutOfBoundsException) (obj1)).toString()).toString());
        a(i, j);
          goto _L4
        obj1;
        Log.e((new StringBuilder()).append(z[9]).append(((IndexOutOfBoundsException) (obj1)).toString()).toString());
        a(i, j);
        if (App.am == 0) goto _L4; else goto _L3
_L3:
        super.onMeasure(i, j);
          goto _L4
        obj1;
        throw obj1;
        ArrayIndexOutOfBoundsException arrayindexoutofboundsexception3;
        arrayindexoutofboundsexception3;
        throw arrayindexoutofboundsexception3;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
label0:
        {
            flag = super.onTouchEvent(motionevent);
            if (b == null)
            {
                break label0;
            }
            CharSequence charsequence = getText();
            Layout layout;
            try
            {
                if (!(charsequence instanceof Spannable))
                {
                    break label0;
                }
                layout = getLayout();
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
            if (layout != null)
            {
                return b.onTouchEvent(this, (Spannable)charsequence, motionevent) | flag;
            }
        }
        return flag;
    }

    public void setLinkHandler(ao5 ao5_1)
    {
        b = ao5_1;
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        Object obj;
        Object obj1;
        int i;
        int j = App.am;
        char c1;
        boolean flag;
        try
        {
            flag = d;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        obj = charsequence;
        if (!flag) goto _L2; else goto _L1
_L1:
        obj = charsequence;
        if (charsequence == null) goto _L2; else goto _L3
_L3:
        obj = null;
        i = 0;
_L8:
        obj1 = obj;
        if (i >= charsequence.length()) goto _L5; else goto _L4
_L4:
        c1 = charsequence.charAt(i);
        obj1 = obj;
        if (c1 >= '\uD800')
        {
            obj1 = obj;
            if (c1 <= '\uDFFF')
            {
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = new SpannableStringBuilder(charsequence);
                }
                ((SpannableStringBuilder) (obj1)).replace(i, i + 1, "\u25A1");
            }
        }
        if (j == 0) goto _L6; else goto _L5
_L5:
        obj = charsequence;
        if (obj1 != null)
        {
            obj = obj1;
        }
_L2:
        a = ((CharSequence) (obj));
        c = buffertype;
        f = 0;
        i = android.os.Build.VERSION.SDK_INT;
        if (i >= 11)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        flag = d;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        flag = obj instanceof Spanned;
        if (flag)
        {
            try
            {
                super.setText(((CharSequence) (obj)), android.widget.TextView.BufferType.SPANNABLE);
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_188;
            }
        }
        super.setText(((CharSequence) (obj)), buffertype);
        return;
        charsequence;
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
        throw charsequence;
_L6:
        i++;
        obj = obj1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[13];
        obj = "7\020&";
        byte0 = -1;
        i = 0;
_L24:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L22:
        if (l > k) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 11: default 112
    //                   0 128
    //                   1 144
    //                   2 160
    //                   3 176
    //                   4 192
    //                   5 209
    //                   6 227
    //                   7 245
    //                   8 263
    //                   9 281
    //                   10 299
    //                   11 317;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L3:
        as1[i] = ((String) (obj));
        obj = ">\002";
        i = 1;
        byte0 = 0;
        break; /* Loop/switch isn't completed */
_L4:
        as1[i] = ((String) (obj));
        obj = "rCh\034@";
        i = 2;
        byte0 = 1;
        break; /* Loop/switch isn't completed */
_L5:
        as1[i] = ((String) (obj));
        obj = "jO~\rZ>";
        i = 3;
        byte0 = 2;
        break; /* Loop/switch isn't completed */
_L6:
        as1[i] = ((String) (obj));
        i = 4;
        obj = "sOg\n\025lOb\016\tz^nC@";
        byte0 = 3;
        break; /* Loop/switch isn't completed */
_L7:
        as1[i] = ((String) (obj));
        i = 5;
        obj = "rCh\034@";
        byte0 = 4;
        break; /* Loop/switch isn't completed */
_L8:
        as1[i] = ((String) (obj));
        obj = ">\002";
        byte0 = 5;
        i = 6;
        break; /* Loop/switch isn't completed */
_L9:
        as1[i] = ((String) (obj));
        i = 7;
        obj = "rCh\034?}Es\027\024$\n";
        byte0 = 6;
        break; /* Loop/switch isn't completed */
_L10:
        as1[i] = ((String) (obj));
        i = 8;
        obj = "jO~\r\005sEl\020\f\177Hc\025OsOg\n\025lO7Y";
        byte0 = 7;
        break; /* Loop/switch isn't completed */
_L11:
        as1[i] = ((String) (obj));
        i = 9;
        obj = "jO~\r\005sEl\020\f\177Hc\025OsOg\n\025lO&";
        byte0 = 8;
        break; /* Loop/switch isn't completed */
_L12:
        as1[i] = ((String) (obj));
        i = 10;
        obj = "jO~\r\005sEl\020\f\177Hc\025OsOg\n\025lO&";
        byte0 = 9;
        break; /* Loop/switch isn't completed */
_L13:
        as1[i] = ((String) (obj));
        i = 11;
        obj = "2\n";
        byte0 = 10;
        break; /* Loop/switch isn't completed */
_L14:
        as1[i] = ((String) (obj));
        i = 12;
        obj = ".R";
        byte0 = 11;
        break; /* Loop/switch isn't completed */
_L15:
        int j;
        as1[i] = ((String) (obj));
        z = as;
        d = false;
        obj = "nXi\032\005mYR\0263kZv\026\022jok\026\nw".toCharArray();
        j = obj.length;
        i = 0;
          goto _L16
_L2:
        c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 444
    //                   0 467
    //                   1 474
    //                   2 481
    //                   3 488;
           goto _L17 _L18 _L19 _L20 _L21
_L21:
        break MISSING_BLOCK_LABEL_488;
_L17:
        byte2 = 96;
_L23:
        obj[k] = (char)(byte2 ^ c1);
        k++;
          goto _L22
_L18:
        byte2 = 30;
          goto _L23
_L19:
        byte2 = 42;
          goto _L23
_L20:
        byte2 = 6;
          goto _L23
        byte2 = 121;
          goto _L23
        if (true) goto _L24; else goto _L2
_L16:
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            byte byte2;
            char c1;
            try
            {
                android/text/Layout.getDeclaredMethod(((String) (obj)), new Class[] {
                    java/lang/CharSequence, Integer.TYPE, Integer.TYPE
                });
                d = true;
            }
            catch (SecurityException securityexception) { }
            catch (NoSuchMethodException nosuchmethodexception) { }
            e = new qv();
            return;
        }
        k = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 536
    //                   0 557
    //                   1 563
    //                   2 569
    //                   3 575;
           goto _L25 _L26 _L27 _L28 _L29
_L29:
        break MISSING_BLOCK_LABEL_575;
_L25:
        byte1 = 96;
_L30:
        obj[i] = (char)(byte1 ^ k);
        i++;
          goto _L16
_L26:
        byte1 = 30;
          goto _L30
_L27:
        byte1 = 42;
          goto _L30
_L28:
        byte1 = 6;
          goto _L30
        byte1 = 121;
          goto _L30
    }
}
