// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c1;
import com.whatsapp.util.m;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            App, a1g, mk, Conversation, 
//            asd

public class BubbleRelativeLayout extends RelativeLayout
{

    private static final Drawable a;
    private static final Drawable b;
    private static int c;
    private static final Drawable d;
    static Paint e;
    private static final Drawable f;
    private static final Drawable n;
    private static final String z[];
    boolean g;
    int h;
    c4 i;
    int j;
    public int k;
    Rect l;
    int m;
    boolean o;
    int p;
    boolean q;
    int r;

    public BubbleRelativeLayout(Context context, c4 c4_1)
    {
        super(context);
        q = false;
        l = new Rect();
        k = -1;
        i = c4_1;
        if (e == null)
        {
            e = new Paint();
            e.setColor(0x11000000);
            e.setStrokeWidth(com.whatsapp.a1g.a().C);
        }
        if (c == -1)
        {
            c = (int)getResources().getDimension(0x7f0a0020);
        }
    }

    protected float a()
    {
        a1g a1g1 = com.whatsapp.a1g.a();
        j = 0;
        ViewGroup viewgroup = (ViewGroup)getChildAt(1);
        h = viewgroup.getTop();
        m = viewgroup.getBottom();
        g = mk.h(i.y.a);
        if (g && !i.y.b)
        {
            View view = viewgroup.getChildAt(0);
            r = view.getMeasuredHeight();
            switch (viewgroup.getId())
            {
            default:
                int i1 = j;
                j = viewgroup.getMeasuredWidth() + i1;
                return (float)j + a1g1.B + a1g1.a;

            case 2131427716: 
                p = view.getMeasuredWidth();
                break;
            }
            return (float)viewgroup.getMeasuredWidth() + a1g1.B + a1g1.a;
        } else
        {
            j = viewgroup.getMeasuredWidth();
            return (float)j + a1g1.B + a1g1.a;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        int i1;
        int l1;
        l1 = App.am;
        i1 = 0;
        if (isSelected()) goto _L2; else goto _L1
_L1:
        boolean flag1 = isPressed();
        if (flag1) goto _L2; else goto _L3
_L3:
        flag1 = isFocused();
        if (!flag1) goto _L4; else goto _L2
_L2:
        boolean flag = true;
_L32:
        a1g a1g1;
        int k1;
        a1g1 = com.whatsapp.a1g.a();
        k1 = i1;
        if (i.M == -1) goto _L6; else goto _L5
_L5:
        int j1 = i.M;
        if (j1 != 6) goto _L8; else goto _L7
_L7:
        float f1;
        float f2;
        float f3;
        Object obj;
        int i2;
        int k2;
        boolean flag2;
        try
        {
            j1 = i.w;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        k1 = i1;
        if (j1 != 8) goto _L6; else goto _L8
_L8:
        j1 = (int)a();
        if (!i.y.b) goto _L10; else goto _L9
_L9:
        flag2 = o;
        if (!flag2) goto _L12; else goto _L11
_L11:
        l.set(0, h - a1g1.b, getWidth(), m + a1g1.u);
        if (l1 == 0) goto _L13; else goto _L12
_L12:
        i1 = i.w;
        if (i1 == 0) goto _L15; else goto _L14
_L14:
        obj = l;
        flag2 = App.aR();
        if (flag2)
        {
            try
            {
                i1 = getWidth();
                k1 = a1g1.c;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
            i1 = i1 - j1 - k1;
        } else
        {
            i1 = 0;
        }
        i2 = h;
        k2 = a1g1.b;
        if (!App.aR()) goto _L17; else goto _L16
_L16:
        k1 = getWidth();
_L33:
        ((Rect) (obj)).set(i1, i2 - k2, k1, m + a1g1.u);
        if (l1 == 0) goto _L13; else goto _L15
_L15:
        obj = l;
        flag2 = App.aR();
        if (flag2)
        {
            try
            {
                i1 = getWidth();
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
            i1 -= j1;
        } else
        {
            i1 = 0;
        }
        i2 = h;
        k2 = a1g1.n;
        if (!App.aR()) goto _L19; else goto _L18
_L18:
        k1 = getWidth();
_L34:
        ((Rect) (obj)).set(i1, i2 - k2, k1, getHeight() - a1g1.n);
_L13:
        if (!o)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        obj = App.au.getApplicationContext().getResources();
        if (flag)
        {
            i1 = 0x7f0200a1;
        } else
        {
            i1 = 0x7f0200a0;
        }
        obj = ((Resources) (obj)).getDrawable(i1);
        if (l1 == 0)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        obj = App.au.getApplicationContext().getResources().getDrawable(0x7f0200af);
        if (l1 == 0)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        obj = a;
        k1 = j1;
        if (obj == null) goto _L6; else goto _L20
_L20:
        obj = new m(((Drawable) (obj)));
        ((Drawable) (obj)).setDither(true);
        ((Drawable) (obj)).setBounds(l);
        ((Drawable) (obj)).draw(canvas);
        k1 = j1;
_L6:
        try
        {
            super.onDraw(canvas);
            i1 = i.M;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        }
        if (i1 == -1) goto _L22; else goto _L21
_L21:
        if (i.y.b) goto _L22; else goto _L23
_L23:
        flag2 = g;
        if (!flag2) goto _L22; else goto _L24
_L24:
        i1 = getContext().getResources().getDisplayMetrics().widthPixels;
        OutOfMemoryError outofmemoryerror;
        Object obj1;
        asd asd1;
        Conversation conversation;
        Object obj2;
        int j2;
        int l2;
        boolean flag3;
        try
        {
            j1 = i.w;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        }
        if (j1 != 0) goto _L22; else goto _L25
_L25:
        if (k == -1) goto _L22; else goto _L26
_L26:
        j1 = k;
        if (j1 == 1) goto _L22; else goto _L27
_L27:
        f2 = (float)k1 * 0.25F;
        if (!App.aR()) goto _L29; else goto _L28
_L28:
        f1 = a1g1.f;
_L63:
        if (!App.aR()) goto _L31; else goto _L30
_L30:
        f3 = a1g1.f;
        f2 += f3;
_L64:
        canvas.drawLine(f1, 1.0F, f2, 1.0F, e);
_L22:
        return;
        canvas;
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
_L4:
        flag = false;
          goto _L32
        canvas;
        throw canvas;
        canvas;
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        throw canvas;
        canvas;
        throw canvas;
_L17:
        k1 = a1g1.c + j1;
          goto _L33
        canvas;
        throw canvas;
        canvas;
        throw canvas;
_L19:
        k1 = j1;
          goto _L34
        outofmemoryerror;
        throw outofmemoryerror;
        outofmemoryerror;
        throw outofmemoryerror;
        outofmemoryerror;
        Log.e((new StringBuilder()).append(z[0]).append(outofmemoryerror).toString());
        c1.a();
        k1 = j1;
        if (l1 == 0) goto _L6; else goto _L10
_L10:
        k1 = k;
        i1 = j1;
        if (k1 == -1) goto _L36; else goto _L35
_L35:
        try
        {
            flag3 = Conversation.r.containsKey(i.y);
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        i1 = j1;
        if (!flag3) goto _L38; else goto _L37
_L37:
        k1 = Conversation.aC.getWidth() - c;
        asd1 = (asd)Conversation.r.get(i.y);
        if (com.whatsapp.asd.a(asd1) <= k1) goto _L40; else goto _L39
_L39:
        i1 = k1;
        if (l1 == 0) goto _L42; else goto _L41
_L41:
        j1 = k1;
_L40:
        try
        {
            i1 = com.whatsapp.asd.a(asd1);
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        if (i1 >= j1) goto _L44; else goto _L43
_L43:
        i1 = j1;
        if (com.whatsapp.asd.a(asd1) >= j1)
        {
            i1 = com.whatsapp.asd.a(asd1);
            if (l1 == 0)
            {
                break MISSING_BLOCK_LABEL_2101;
            }
        }
        asd1.a(i1);
        j1 = 1;
_L66:
        if (j1 != 0)
        {
            obj1 = asd1.b;
            if (getContext() instanceof Conversation)
            {
                conversation = (Conversation)getContext();
                try
                {
                    obj2 = conversation.aK;
                }
                // Misplaced declaration of an exception variable
                catch (Canvas canvas)
                {
                    throw canvas;
                }
                if (obj2 != null)
                {
                    do
                    {
                        if (obj1 == null)
                        {
                            break;
                        }
                        ((asd) (obj1)).a(i1);
                        obj2 = conversation.aK.findViewWithTag(((asd) (obj1)).f);
                        if (obj2 != null)
                        {
                            try
                            {
                                ((View) (obj2)).invalidate();
                            }
                            // Misplaced declaration of an exception variable
                            catch (Canvas canvas)
                            {
                                throw canvas;
                            }
                        }
                        obj1 = ((asd) (obj1)).b;
                    } while (l1 == 0);
                    obj1 = asd1.d;
                    do
                    {
                        if (obj1 == null)
                        {
                            break;
                        }
                        ((asd) (obj1)).a(i1);
                        obj2 = conversation.aK.findViewWithTag(((asd) (obj1)).f);
                        if (obj2 != null)
                        {
                            try
                            {
                                ((View) (obj2)).invalidate();
                            }
                            // Misplaced declaration of an exception variable
                            catch (Canvas canvas)
                            {
                                throw canvas;
                            }
                        }
                        obj1 = ((asd) (obj1)).d;
                    } while (l1 == 0);
                }
            }
        }
        if (l1 == 0) goto _L42; else goto _L44
_L44:
        j1 = com.whatsapp.asd.a(asd1);
_L65:
        i1 = j1;
        if (l1 == 0) goto _L36; else goto _L45
_L45:
        i1 = j1;
_L38:
        try
        {
            k = -1;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
_L36:
        if (i.w == 0) goto _L47; else goto _L46
_L46:
        j1 = i.w;
        if (j1 == 8) goto _L47; else goto _L48
_L48:
        obj1 = l;
        flag3 = App.aR();
        if (flag3)
        {
            j1 = 0;
        } else
        {
            j1 = (getWidth() - i1) + a1g1.c;
        }
        j2 = h;
        l2 = a1g1.b;
        if (!App.aR()) goto _L50; else goto _L49
_L49:
        k1 = a1g1.c;
        k1 = i1 - k1;
_L62:
        try
        {
            ((Rect) (obj1)).set(j1, j2 - l2, k1, m + a1g1.u);
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas) { }
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        }
        if (l1 == 0) goto _L51; else goto _L47
_L47:
        j1 = k;
        if (j1 != -1) goto _L53; else goto _L52
_L52:
        obj1 = l;
        flag3 = App.aR();
        if (flag3)
        {
            j1 = 0;
        } else
        {
            j1 = getWidth() - i1;
        }
        try
        {
            j2 = h;
            l2 = a1g1.n;
            flag3 = App.aR();
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        if (flag3)
        {
            k1 = i1;
        } else
        {
            k1 = getWidth();
        }
        try
        {
            ((Rect) (obj1)).set(j1, j2 - l2, k1, getHeight() - a1g1.n);
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas) { }
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        }
        if (l1 == 0) goto _L51; else goto _L53
_L53:
        j1 = k;
        j1;
        JVM INSTR tableswitch 1 3: default 1288
    //                   1 1598
    //                   2 1669
    //                   3 1723;
           goto _L54 _L55 _L56 _L57
_L54:
        try
        {
            obj1 = l;
            flag3 = App.aR();
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        }
        if (flag3)
        {
            j1 = 0;
        } else
        {
            j1 = getWidth() - i1;
        }
        try
        {
            l1 = h;
            j2 = a1g1.n;
            flag3 = App.aR();
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        if (flag3)
        {
            k1 = i1;
        } else
        {
            k1 = getWidth();
        }
        ((Rect) (obj1)).set(j1, l1 - j2, k1, getHeight() - a1g1.n);
        Log.e((new StringBuilder()).append(z[2]).append(k).toString());
_L51:
        j1 = k;
        j1;
        JVM INSTR tableswitch 1 3: default 1420
    //                   1 1898
    //                   2 1935
    //                   3 1969;
           goto _L58 _L59 _L60 _L61
_L60:
        break MISSING_BLOCK_LABEL_1935;
_L61:
        break MISSING_BLOCK_LABEL_1969;
_L58:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_2003;
        }
        try
        {
            obj1 = getContext().getResources().getDrawable(0x7f0200a3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.e((new StringBuilder()).append(z[1]).append(obj1).toString());
            obj1 = null;
            c1.a();
        }
        k1 = i1;
        if (obj1 != null)
        {
            obj1 = new m(((Drawable) (obj1)));
            ((Drawable) (obj1)).setBounds(l);
            ((Drawable) (obj1)).setDither(true);
            ((Drawable) (obj1)).draw(canvas);
            k1 = i1;
        }
          goto _L6
        canvas;
        throw canvas;
        canvas;
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        canvas;
        throw canvas;
_L50:
        k1 = getWidth();
          goto _L62
_L55:
        obj1 = l;
        flag3 = App.aR();
        if (flag3)
        {
            j1 = 0;
        } else
        {
            j1 = getWidth() - i1;
        }
        try
        {
            j2 = h;
            l2 = a1g1.n;
            flag3 = App.aR();
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        if (flag3)
        {
            k1 = i1;
        } else
        {
            k1 = getWidth();
        }
        try
        {
            ((Rect) (obj1)).set(j1, j2 - l2, k1, getHeight() + 1);
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        }
        if (l1 == 0) goto _L51; else goto _L56
_L56:
        obj1 = l;
        flag3 = App.aR();
        if (flag3)
        {
            j1 = 0;
        } else
        {
            j1 = getWidth() - i1;
        }
        try
        {
            flag3 = App.aR();
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        if (flag3)
        {
            k1 = i1;
        } else
        {
            k1 = getWidth();
        }
        try
        {
            ((Rect) (obj1)).set(j1, -1, k1, getHeight() + 1);
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        }
        if (l1 == 0) goto _L51; else goto _L57
_L57:
        obj1 = l;
        flag3 = App.aR();
        if (flag3)
        {
            j1 = 0;
        } else
        {
            j1 = getWidth() - i1;
        }
        try
        {
            flag3 = App.aR();
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        if (flag3)
        {
            k1 = i1;
        } else
        {
            k1 = getWidth();
        }
        ((Rect) (obj1)).set(j1, -1, k1, getHeight() - a1g1.n);
        if (l1 == 0) goto _L51; else goto _L54
_L59:
        if (flag)
        {
            try
            {
                obj1 = getContext().getResources().getDrawable(0x7f0200a6);
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        } else
        {
            obj1 = n;
        }
        break MISSING_BLOCK_LABEL_1440;
        canvas;
        throw canvas;
        if (flag)
        {
            try
            {
                obj1 = getContext().getResources().getDrawable(0x7f0200a5);
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        } else
        {
            obj1 = f;
        }
        break MISSING_BLOCK_LABEL_1440;
        if (flag)
        {
            try
            {
                obj1 = getContext().getResources().getDrawable(0x7f0200a4);
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        } else
        {
            obj1 = b;
        }
        break MISSING_BLOCK_LABEL_1440;
        obj1 = d;
        break MISSING_BLOCK_LABEL_1440;
        canvas;
        throw canvas;
_L29:
        f1 = (float)i1 - a1g1.f - f2;
          goto _L63
        canvas;
        throw canvas;
_L31:
        f2 = (float)i1 - a1g1.f;
          goto _L64
_L42:
        j1 = i1;
          goto _L65
        j1 = 0;
          goto _L66
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i1;
        as = new String[3];
        i1 = 0;
        obj = "\000FWW\r\007lGj\r\003JZ@\025MTGP\004\flW@\003\000_P\032";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "\000FWW\r\007lGj\r\003JZ@\025MTGT\030=Q@W\003\016V";
                i1 = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                i1 = 2;
                obj = "\000FWW\r\007\034GP\002\026\023[Z\025BZ[\\\025\013RAP\005BJPAOX";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                z = as;
                c = -1;
                a = App.au.getApplicationContext().getResources().getDrawable(0x7f0200b3);
                n = App.au.getApplicationContext().getResources().getDrawable(0x7f0200ae);
                f = App.au.getApplicationContext().getResources().getDrawable(0x7f0200aa);
                b = App.au.getApplicationContext().getResources().getDrawable(0x7f0200a2);
                d = App.au.getApplicationContext().getResources().getDrawable(0x7f0200ab);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 244
    //                   0 265
    //                   1 271
    //                   2 277
    //                   3 283;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_283;
_L3:
        byte byte0 = 97;
_L9:
        obj[j1] = (char)(byte0 ^ c2);
        j1++;
          goto _L8
_L4:
        byte0 = 98;
          goto _L9
_L5:
        byte0 = 51;
          goto _L9
_L6:
        byte0 = 53;
          goto _L9
        byte0 = 53;
          goto _L9
    }
}
