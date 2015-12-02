// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.text.Html;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.text.DateFormat;

// Referenced classes of package com.whatsapp:
//            cj, m2, App, dc, 
//            m7, d3, alm, ald, 
//            db, dr

public class all
{

    private static final String z[];

    public static Dialog a(Activity activity)
    {
        String s = d();
        return (new android.app.AlertDialog.Builder(activity)).setMessage(s).setPositiveButton(0x7f0e02ba, null).create();
    }

    public static Dialog a(Activity activity, String s)
    {
        Log.i(z[2]);
        if (s == null)
        {
            Log.e(z[3]);
            return null;
        } else
        {
            cj cj1 = new cj(activity);
            m2 m2_1 = new m2();
            TextView textview = (TextView)activity.getLayoutInflater().inflate(0x7f030087, null);
            textview.setText(s);
            Object obj1 = activity.getString(0x7f0e02ce);
            Object obj = activity.getString(0x7f0e02cc);
            s = activity.getString(0x7f0e02ca);
            String s5 = activity.getString(0x7f0e02cf, new Object[] {
                App.as.a("1")
            });
            String s4 = activity.getString(0x7f0e02cd);
            String s1 = activity.getString(0x7f0e02cb);
            String s2 = z[0];
            String s3 = z[1];
            obj1 = Html.fromHtml((new StringBuilder()).append(((String) (obj1))).append(s2).append(s5).append(s3).toString());
            obj = Html.fromHtml((new StringBuilder()).append(((String) (obj))).append(s2).append(s4).append(s3).toString());
            s = Html.fromHtml((new StringBuilder()).append(s).append(s2).append(s1).append(s3).toString());
            activity = (new android.app.AlertDialog.Builder(activity)).setCustomTitle(textview).setCancelable(false).setItems(new CharSequence[] {
                obj1, obj, s
            }, cj1).create();
            activity.setOnDismissListener(m2_1);
            return activity;
        }
    }

    public static Dialog a(Activity activity, boolean flag)
    {
        Object obj = b();
        obj = (new android.app.AlertDialog.Builder(activity)).setMessage(((CharSequence) (obj)));
        ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(0x7f0e02ba, b(activity, flag));
        return ((android.app.AlertDialog.Builder) (obj)).create();
    }

    public static String a()
    {
        DateFormat dateformat = DateFormat.getDateInstance(2);
        long l = m7.b(z[7]);
        return App.au.getString(0x7f0e017a, new Object[] {
            dateformat.format(Long.valueOf(l))
        });
    }

    public static void a(Activity activity, AlertDialog alertdialog, boolean flag)
    {
        activity = b(activity, flag);
        alertdialog.setButton(-1, alertdialog.getButton(-1).getText(), activity);
    }

    public static Dialog b(Activity activity)
    {
        d3 d3_1 = new d3(activity, 0x7f0300a7, activity);
        d3_1.setOnCancelListener(new alm(activity));
        return d3_1;
    }

    private static android.content.DialogInterface.OnClickListener b(Activity activity, boolean flag)
    {
        if (flag)
        {
            return new ald(activity);
        } else
        {
            return null;
        }
    }

    public static String b()
    {
        DateFormat dateformat = DateFormat.getDateInstance(2);
        long l = m7.b(z[5]);
        return App.au.getString(0x7f0e017d, new Object[] {
            dateformat.format(Long.valueOf(l))
        });
    }

    public static Dialog c(Activity activity)
    {
        String s = a();
        return (new android.app.AlertDialog.Builder(activity)).setMessage(s).setPositiveButton(0x7f0e02ba, null).create();
    }

    public static String c()
    {
        DateFormat dateformat = DateFormat.getDateInstance(2);
        long l = m7.b(z[6]);
        return App.au.getString(0x7f0e017b, new Object[] {
            dateformat.format(Long.valueOf(l))
        });
    }

    public static Dialog d(Activity activity)
    {
        db db1 = new db(activity, 0x7f03002d, activity);
        db1.setOnCancelListener(new dr(activity));
        return db1;
    }

    public static String d()
    {
        DateFormat dateformat = DateFormat.getDateInstance(2);
        long l = m7.b(z[4]);
        return App.au.getString(0x7f0e017e, new Object[] {
            dateformat.format(Long.valueOf(l))
        });
    }

    public static Dialog e(Activity activity)
    {
        return (new android.app.AlertDialog.Builder(activity)).setMessage(0x7f0e017c).setPositiveButton(0x7f0e02ba, null).create();
    }

    public static Dialog f(Activity activity)
    {
        String s = c();
        return (new android.app.AlertDialog.Builder(activity)).setMessage(s).setPositiveButton(0x7f0e02ba, null).create();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "C\032J\033xC\013UU*\023F\004G+\036\024T\n";
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
                obj = "CWKY'\023\024\006\bi\f\025YX*A";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\033\021YX)\030WOU4\021UKQ4\t\021[Qk\032\000H]4\036\fQ[(";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\033\021YX)\030WOU4\021UKQ4\t\021[Qk\032\000H]4\036\fQ[(_\025]G5\036\037]\t(\n\024T";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\032\000H]4\036\fQ[( \034Y@#";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\032\000H]4\036\fQ[( \034Y@#";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\032\000H]4\036\fQ[( \034Y@#";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\032\000H]4\036\fQ[( \034Y@#";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 70;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 127;
          goto _L9
_L5:
        byte1 = 120;
          goto _L9
_L6:
        byte1 = 56;
          goto _L9
        byte1 = 52;
          goto _L9
    }
}
