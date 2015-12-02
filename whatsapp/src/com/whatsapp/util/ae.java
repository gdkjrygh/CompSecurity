// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.Map;
import org.json.JSONArray;

// Referenced classes of package com.whatsapp.util:
//            Log, a5, bt, bx

class ae
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private static final String z[];
    final TextView a;
    final View b;
    final bt c;

    ae(bt bt1, View view, TextView textview)
    {
        c = bt1;
        b = view;
        a = textview;
        super();
    }

    public void onGlobalLayout()
    {
        long l;
        boolean flag;
label0:
        {
            flag = Log.f;
            l = (long)(b.getHeight() * b.getWidth()) + ((long)b.hashCode() + b.getDrawingTime());
            if (a5.k)
            {
                Log.i(z[0]);
                if (!flag)
                {
                    break label0;
                }
            }
            Log.i((new StringBuilder()).append(z[2]).append(l).toString());
            a5.b(a, l, true, c.a.a);
        }
        if (a5.f() != null && a5.f().containsKey(Long.valueOf(l))) goto _L2; else goto _L1
_L1:
        Log.i(z[1]);
_L4:
        return;
_L2:
        Object obj;
        Object obj1;
        TextPaint textpaint;
        int i;
label1:
        {
            i = ((Integer)a5.f().get(Long.valueOf(l))).intValue();
            Log.i((new StringBuilder()).append(z[3]).append(i).toString());
            obj = a.getLayout();
            textpaint = a.getPaint();
            obj1 = a.getText();
            Log.i((new StringBuilder()).append(z[4]).append(obj1).toString());
            int j = a.getLineCount();
            if (j > 0)
            {
                obj = ((CharSequence) (obj1)).subSequence(((Layout) (obj)).getLineStart(j - 1), ((Layout) (obj)).getLineEnd(j - 1));
                if (!flag)
                {
                    break label1;
                }
            }
            obj = obj1;
        }
        obj1 = ((CharSequence) (obj1)).toString();
        float f = a.getWidth() - a.getCompoundPaddingLeft() - a.getCompoundPaddingRight();
        float f1 = textpaint.measureText(((CharSequence) (obj)), 0, ((CharSequence) (obj)).length());
        if (f > 0.0F && a5.a(a) && !TextUtils.isEmpty(((CharSequence) (obj1))) && a5.a() != null)
        {
label2:
            {
                JSONArray jsonarray = new JSONArray();
                String s;
                if (i < 10)
                {
                    s = (new StringBuilder()).append("0").append(i).toString();
                } else
                {
                    s = String.valueOf(i);
                }
                jsonarray.put((new StringBuilder()).append(a5.e()).append("-").append(s).toString());
                jsonarray.put(obj1);
                jsonarray.put(Double.valueOf(f));
                jsonarray.put(Double.valueOf(f1));
                if (f1 > f)
                {
                    jsonarray.put(true);
                    if (!flag)
                    {
                        break label2;
                    }
                }
                jsonarray.put(false);
            }
            a5.b().put(jsonarray);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "b6QX{w0MYvC0MZk9\"MX|[!JCLd1JUyb-KXk6\000KX?bdPWssdWE";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "b6QX{w0MYvC0MZk9\"MX|[!JCLd1JUyb-KXk67O_hf!@";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "b6QX{w0MYvC0MZk9\"MX|[!JCLd1JUyb-KXk6/AO\"6";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "b6QX{w0MYvC0MZk9\"MX|[!JCLd1JUyb-KXk67MR\"6";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "b6QX{w0MYvC0MZk9\"MX|[!JCLd1JUyb-KXk60ANl,d";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 24;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 22;
          goto _L9
_L5:
        byte1 = 68;
          goto _L9
_L6:
        byte1 = 36;
          goto _L9
        byte1 = 54;
          goto _L9
    }
}
