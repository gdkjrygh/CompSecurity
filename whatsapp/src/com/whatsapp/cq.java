// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            bp, App, a1g, iz, 
//            hk, afn, za

public class cq extends PopupWindow
{

    private static final String z[];
    private ImageButton a;
    private View b;
    private afn c;
    private Activity d;
    private za e;
    private ViewGroup f;
    private View g;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener h;
    private ImageButton i;
    private boolean j;

    public cq(Activity activity)
    {
        super(activity);
        h = new bp(this);
        d = activity;
    }

    static View a(cq cq1)
    {
        return cq1.b;
    }

    private void a(int k)
    {
        String s;
        if (d.getResources().getConfiguration().orientation == 2)
        {
            s = z[2];
        } else
        {
            s = z[1];
        }
        App.au.getSharedPreferences(z[0], 0).edit().putInt(s, k).commit();
    }

    static void a(cq cq1, int k)
    {
        cq1.a(k);
    }

    static boolean a(cq cq1, boolean flag)
    {
        cq1.j = flag;
        return flag;
    }

    static Activity b(cq cq1)
    {
        return cq1.d;
    }

    static ImageButton c(cq cq1)
    {
        return cq1.a;
    }

    private void c()
    {
        a1g a1g1 = a1g.a();
        Object obj = new RelativeLayout(d);
        iz.a(d.getLayoutInflater(), 0x7f030063, ((ViewGroup) (obj)), true);
        f = (ViewGroup)((RelativeLayout) (obj)).findViewById(0x7f0b01c2);
        f.getLayoutParams().height = -1;
        f.setVisibility(0);
        f.findViewById(0x7f0b01c4).setPadding(0, 0, 0, 0);
        f.findViewById(0x7f0b01c4).setBackgroundColor(d.getResources().getColor(0x7f090023));
        f.findViewById(0x7f0b01d2).setPadding(0, 0, 0, 0);
        f.findViewById(0x7f0b01d2).setBackgroundColor(d.getResources().getColor(0x7f090022));
        setContentView(((View) (obj)));
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new BitmapDrawable());
        setTouchInterceptor(new hk(this));
        setTouchable(true);
        setFocusable(false);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        c = new afn(d, f);
        obj = d.getWindowManager().getDefaultDisplay();
        c.b(((Display) (obj)).getWidth() / a1g1.e);
        c.a(true);
        c.a(e);
    }

    static View d(cq cq1)
    {
        return cq1.g;
    }

    public int a()
    {
        String s;
        if (d.getResources().getConfiguration().orientation == 2)
        {
            s = z[7];
        } else
        {
            s = z[6];
        }
        return App.au.getSharedPreferences(z[8], 0).getInt(s, 0);
    }

    public void a(Configuration configuration)
    {
        if (c != null)
        {
            configuration = a1g.a();
            Display display = d.getWindowManager().getDefaultDisplay();
            c.b(display.getWidth() / ((a1g) (configuration)).e);
        }
    }

    public void a(View view, ImageButton imagebutton, ImageButton imagebutton1, View view1)
    {
label0:
        {
            if (c == null)
            {
                c();
            }
            if (g != null)
            {
                g.getViewTreeObserver().removeGlobalOnLayoutListener(h);
            }
            g = view;
            a = imagebutton;
            i = imagebutton1;
            b = view1;
            a.setImageResource(0x7f0204d5);
            imagebutton = a1g.a();
            int k1 = view.getHeight();
            imagebutton1 = new int[2];
            view.getLocationOnScreen(imagebutton1);
            int l = imagebutton1[1] + k1 + 0;
            imagebutton1 = d.getWindowManager().getDefaultDisplay();
            int j1 = imagebutton1.getWidth();
            int k;
            int i1;
            boolean flag;
            if ((float)(imagebutton1.getHeight() - l) < 128F * ((a1g) (imagebutton)).g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = l;
            if (flag)
            {
                i1 = (int)Math.min(240F * ((a1g) (imagebutton)).g, imagebutton1.getHeight());
                setHeight(i1);
                k = l - (k1 + i1);
                l = k;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            i1 = imagebutton1.getHeight() - k;
            setHeight(i1);
            a(i1);
            l = k;
        }
        setWidth(j1);
        imagebutton1 = g.getViewTreeObserver();
        if (imagebutton1 != null)
        {
            imagebutton1.addOnGlobalLayoutListener(h);
        }
        Log.i((new StringBuilder()).append(z[5]).append(flag).append(z[4]).append(l).append(z[3]).append(i1).toString());
        showAtLocation(view, 51, 0, l);
        c.b(j1 / ((a1g) (imagebutton)).e);
    }

    public void a(za za)
    {
        e = za;
        if (c != null)
        {
            c.a(za);
        }
    }

    public void a(boolean flag)
    {
        j = flag;
    }

    public boolean b()
    {
        return j;
    }

    public void dismiss()
    {
        if (g != null)
        {
            g.getViewTreeObserver().removeGlobalOnLayoutListener(h);
        }
        if (a != null)
        {
            a.setImageResource(0x7f0204ce);
        }
        super.dismiss();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int k;
        as = new String[9];
        obj = "RC\033uqYM\002(gA\\)+tTJ\023)c_O\023(";
        byte0 = -1;
        k = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[k] = ((String) (obj));
                obj = "TA\0311on\\\031+sAs\036>oVD\002";
                k = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[k] = ((String) (obj));
                obj = "TA\0311on\\\031+sAs\032:hU_\025:vTs\036>oVD\002";
                k = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[k] = ((String) (obj));
                obj = "\021DL";
                k = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[k] = ((String) (obj));
                k = 4;
                obj = "\021UL";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[k] = ((String) (obj));
                k = 5;
                obj = "RC\030-cC_\027/o^B\0236i[E\0064vD\\\0012hUC\001tuYC\001{gSC\000><";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[k] = ((String) (obj));
                obj = "TA\0311on\\\031+sAs\036>oVD\002";
                byte0 = 5;
                k = 6;
                break;

            case 5: // '\005'
                as1[k] = ((String) (obj));
                k = 7;
                obj = "TA\0311on\\\031+sAs\032:hU_\025:vTs\036>oVD\002";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[k] = ((String) (obj));
                k = 8;
                obj = "RC\033uqYM\002(gA\\)+tTJ\023)c_O\023(";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[k] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 280
    //                   0 303
    //                   1 310
    //                   2 317
    //                   3 324;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_324;
_L3:
        byte byte1 = 6;
_L9:
        obj[l] = (char)(byte1 ^ c1);
        l++;
          goto _L8
_L4:
        byte1 = 49;
          goto _L9
_L5:
        byte1 = 44;
          goto _L9
_L6:
        byte1 = 118;
          goto _L9
        byte1 = 91;
          goto _L9
    }
}
