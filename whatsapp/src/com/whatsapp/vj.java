// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Handler;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            mv, al4, as2, e4, 
//            aos, App, jf, zw, 
//            su, b0, bq, j6, 
//            au4, a3j, dk, iw, 
//            RegisterPhone, abp, y4, aoz, 
//            co, asw

public abstract class vj
{

    protected static e4 d;
    private static final String z[];
    private Handler a;
    protected boolean b;
    private Activity c;

    public vj(Activity activity)
    {
        b = false;
        a = new mv(this);
        c = activity;
    }

    static Activity a(vj vj1)
    {
        return vj1.c;
    }

    private Dialog a(int i, int j)
    {
        return (new android.app.AlertDialog.Builder(c)).setMessage(j).setCancelable(false).setPositiveButton(0x7f0e0361, new al4(this, i)).setNeutralButton(0x7f0e0270, new as2(this, i)).create();
    }

    static Handler b(vj vj1)
    {
        return vj1.a;
    }

    protected Dialog a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 100: // 'd'
            Log.i(z[7]);
            d = new e4(c);
            d.setTitle(c.getString(0x7f0e0279));
            d.setMessage(c.getString(0x7f0e0278));
            d.setIndeterminate(false);
            d.setCancelable(false);
            d.setProgressStyle(1);
            return d;

        case 101: // 'e'
            Log.i(z[8]);
            return (new android.app.AlertDialog.Builder(c)).setTitle(0x7f0e0033).setMessage(c.getString(0x7f0e0272)).setNeutralButton(0x7f0e02ba, new aos(this)).create();

        case 102: // 'f'
            Log.i(z[9]);
            android.app.AlertDialog.Builder builder = (new android.app.AlertDialog.Builder(c)).setTitle(0x7f0e0033);
            Activity activity = c;
            if (App.m())
            {
                i = 0x7f0e0276;
            } else
            {
                i = 0x7f0e0277;
            }
            return builder.setMessage(activity.getString(i)).setNegativeButton(0x7f0e0361, new jf(this)).setPositiveButton(0x7f0e03d8, new zw(this)).setCancelable(false).create();

        case 107: // 'k'
            Log.i(z[5]);
            Object obj = (new StringBuilder()).append(c.getString(0x7f0e0275)).append(" ");
            Activity activity1 = c;
            if (App.m())
            {
                i = 0x7f0e0276;
            } else
            {
                i = 0x7f0e0277;
            }
            obj = ((StringBuilder) (obj)).append(activity1.getString(i)).toString();
            return (new android.app.AlertDialog.Builder(c)).setTitle(0x7f0e0033).setMessage(((CharSequence) (obj))).setNegativeButton(0x7f0e0361, new su(this)).setPositiveButton(0x7f0e03d8, new b0(this)).setCancelable(false).create();

        case 103: // 'g'
            Log.i(z[3]);
            return (new android.app.AlertDialog.Builder(c)).setTitle(0x7f0e0268).setMessage(c.getString(0x7f0e026f)).setPositiveButton(0x7f0e04b5, new bq(this)).setNegativeButton(0x7f0e02a3, new j6(this)).setCancelable(false).create();

        case 105: // 'i'
            Log.i(z[4]);
            String s = (new StringBuilder()).append(c.getString(0x7f0e0275)).append(" ").append(c.getString(0x7f0e026f)).toString();
            return (new android.app.AlertDialog.Builder(c)).setTitle(0x7f0e026a).setMessage(s).setPositiveButton(0x7f0e027a, new au4(this)).setNegativeButton(0x7f0e0270, new a3j(this)).setCancelable(false).create();

        case 106: // 'j'
            return (new android.app.AlertDialog.Builder(c)).setTitle(0x7f0e026e).setMessage(c.getString(0x7f0e0274)).setPositiveButton(0x7f0e0270, new dk(this)).setNegativeButton(0x7f0e027a, new iw(this)).setCancelable(false).create();

        case 108: // 'l'
            Log.i(z[1]);
            return (new android.app.AlertDialog.Builder(c)).setTitle(0x7f0e0033).setMessage(c.getString(0x7f0e0273)).setNeutralButton(0x7f0e02ba, null).create();

        case 104: // 'h'
            Log.i(z[10]);
            e4 e4_1 = new e4(c);
            e4_1.setTitle(c.getString(0x7f0e0354));
            e4_1.setMessage(c.getString(0x7f0e0353));
            e4_1.setIndeterminate(true);
            e4_1.setCancelable(false);
            return e4_1;

        case 201: 
            Log.i(z[6]);
            return a(201, 0x7f0e027e);

        case 200: 
            Log.i(z[2]);
            return a(200, 0x7f0e027d);
        }
    }

    protected abstract void a();

    protected void a(boolean flag)
    {
        a(flag, false);
    }

    protected void a(boolean flag, boolean flag1)
    {
        App.Me me;
        if (!flag1 && !c.isFinishing() && (!b || flag))
        {
            c.showDialog(100);
        }
        me = App.q(c);
        me.jabber_id = App.b(App.au);
        if (me.jabber_id != null) goto _L2; else goto _L1
_L1:
        Log.e(z[0]);
        App.d(c, 1);
        c.startActivity(new Intent(c, com/whatsapp/RegisterPhone));
        c.finish();
_L4:
        return;
_L2:
        App.Z = me;
        App.q = false;
        App.m(c.getApplication());
        App.q();
        MessageService.b(App.au);
        int i;
        if (flag)
        {
            Object obj = new abp(this, flag, flag1);
            y4 y4_1 = new y4(this);
            obj = App.ah.a(((Runnable) (obj)), y4_1);
            i = App.ah.a(((Runnable) (obj)));
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        asw.a(new co(this, flag, b, flag1), new Object[0]);
        if (App.am == 0) goto _L4; else goto _L3
_L3:
        a.sendEmptyMessageDelayed(1, 32000L);
        return;
    }

    protected void b()
    {
label0:
        {
            int i = App.ah.v();
            Log.i((new StringBuilder()).append(z[11]).append(i).toString());
            if (i > 0)
            {
                c.showDialog(103);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a(false, true);
        }
    }

    protected void b(boolean flag)
    {
        b = flag;
    }

    protected abstract void c();

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "Y4>\031e_4+\036wF4v\035sX\"8\027sX%6\002s]4+\031pB4=_{B\"*\031xL|)\021dJ<*PtD$7\023s\013%6PdN6)\030yE4";
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
                obj = "]4+\031pR<*\027e_>+\0259O88\034yL~4\003qX%6\002sE>-\002sX%6\002sO";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "]4+\031pR<*\027e_>+\0259O88\034yL~:\021xE>-]uD?7\025u_";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "]4+\031pR<*\027e_>+\0259O88\034yL~+\025e_>+\025";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "]4+\031pR<*\027e_>+\0259O88\034yL~+\025e_>+\025r^4-\037sY#6\002";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "]4+\031pR<*\027e_>+\0259O88\034yL~+\025e_>+\025pY>4\022wH:,\000r^4-\037sY#6\002uJ#=\036y_76\005xO0*\033dN%+\t";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "]4+\031pR<*\027e_>+\0259O88\034yL~2\025oX4+\006\177H4,\036w]00\034wI=<";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "]4+\031pR<*\027e_>+\0259O88\034yL~*\025b^!";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "]4+\031pR<*\027e_>+\0259O88\034yL~4\003qX%6\002sN#+\037d";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "]4+\031pR<*\027e_>+\0259O88\034yL~4\025rB0:\021dO?6\004pD$7\024wX:+\025bY(";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "]4+\031pR<*\027e_>+\0259O88\034yL~>\002y^!*\txH";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "]4+\031pR<*\027e_>+\0259^\"<\030\177X%6\002oB7<\b\177X%*_tJ22\005fM85\025eM>,\036r\013";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                d = null;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 348
    //                   0 371
    //                   1 378
    //                   2 385
    //                   3 392;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_392;
_L3:
        byte byte1 = 22;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 43;
          goto _L9
_L5:
        byte1 = 81;
          goto _L9
_L6:
        byte1 = 89;
          goto _L9
        byte1 = 112;
          goto _L9
    }
}
