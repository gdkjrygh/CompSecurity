// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;

// Referenced classes of package com.whatsapp:
//            VerifyMessageStoreActivity, RegisterName, App, k, 
//            og, Conversation, HomeActivity, Conversations, 
//            EULA, RegisterPhone, VerifySms, ChangeNumber, 
//            DeleteAccountConfirmation, atr, mk, _b, 
//            asw, DelayedRegistrationBroadcastReceiver, aoz, tg, 
//            am, _n, ta, aup, 
//            xt

public class Main extends VerifyMessageStoreActivity
{

    private static final String z[];
    private Uri k;
    private _b l;

    public Main()
    {
        k = null;
        l = null;
    }

    private void a()
    {
        if (!isFinishing())
        {
            Intent intent = getIntent();
            if (intent != null && !z[0].equals(intent.getAction()) && (intent.getFlags() & 0x4000000) != 0 && !intent.hasExtra(z[3]))
            {
                Object obj = getSharedPreferences(z[2], 0);
                if (obj != null && ((SharedPreferences) (obj)).getInt(z[5], 0) == 0)
                {
                    Log.i(z[1]);
                    RegisterName.a(this, getString(0x7f0e0047), 0);
                    RegisterName.a(this, getString(0x7f0e0047));
                    obj = ((SharedPreferences) (obj)).edit();
                    ((android.content.SharedPreferences.Editor) (obj)).putInt(z[4], 1);
                    ((android.content.SharedPreferences.Editor) (obj)).commit();
                }
            }
            startActivity(new Intent(this, g()));
            finish();
        }
    }

    static void a(Main main)
    {
        main.a();
    }

    static Uri b(Main main)
    {
        return main.k;
    }

    static void c(Main main)
    {
        main.f();
    }

    private void f()
    {
        Object obj = getIntent().getStringExtra(z[26]);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = App.az.e(((String) (obj)));
            if (obj != null && (!((og) (obj)).k() && !((og) (obj)).p() || ((og) (obj)).n != null))
            {
                if (!isFinishing())
                {
                    startActivity(Conversation.a(((og) (obj))));
                    finish();
                }
                return;
            }
        }
        a();
    }

    public static Class g()
    {
        if (App.aq())
        {
            return com/whatsapp/HomeActivity;
        } else
        {
            return com/whatsapp/Conversations;
        }
    }

    protected void b()
    {
        int i;
        i = App.am;
        super.b();
        if (App.Z != null) goto _L2; else goto _L1
_L1:
        if (isFinishing()) goto _L4; else goto _L3
_L3:
        i = App.f(this);
        i;
        JVM INSTR tableswitch 0 6: default 68
    //                   0 133
    //                   1 180
    //                   2 195
    //                   3 68
    //                   4 218
    //                   5 180
    //                   6 255;
           goto _L5 _L6 _L7 _L8 _L5 _L9 _L7 _L10
_L5:
        Intent intent;
        Log.e((new StringBuilder()).append(z[22]).append(i).append(z[17]).toString());
        App.d(this, 0);
        intent = new Intent(this, com/whatsapp/EULA);
_L11:
        if (intent != null)
        {
            startActivity(intent);
            finish();
        }
_L4:
        return;
_L6:
        Intent intent1 = new Intent(this, com/whatsapp/EULA);
        intent = intent1;
        if (getIntent().getBooleanExtra(z[20], false))
        {
            intent1.putExtra(z[25], true);
            intent = intent1;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        intent = new Intent(this, com/whatsapp/RegisterPhone);
        continue; /* Loop/switch isn't completed */
_L8:
        Log.i(z[23]);
        intent = new Intent(this, com/whatsapp/RegisterName);
        continue; /* Loop/switch isn't completed */
_L9:
        Intent intent2 = new Intent(this, com/whatsapp/VerifySms);
        intent = intent2;
        if (ChangeNumber.f())
        {
            intent2.putExtra(z[24], true);
            intent = intent2;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        intent = new Intent(this, com/whatsapp/DeleteAccountConfirmation);
        if (true) goto _L11; else goto _L2
_L2:
label0:
        {
            if (App.f(this) == 2)
            {
                Log.i(z[18]);
                startActivity(new Intent(this, com/whatsapp/RegisterName));
                finish();
                return;
            }
            App.d(this, 3);
            k = atr.h();
            if (App.u == 1 && k != null)
            {
                if (isFinishing())
                {
                    break label0;
                }
                showDialog(0);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (App.T == null)
            {
                if (isFinishing())
                {
                    break label0;
                }
                showDialog(1);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (App.aA)
            {
                if (isFinishing())
                {
                    break label0;
                }
                showDialog(2);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (mk.f)
            {
                if (l == null || l.getStatus() != android.os.AsyncTask.Status.RUNNING)
                {
                    l = new _b(this);
                    asw.a(l, new Void[0]);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                Log.i(z[21]);
                showDialog(104);
                if (i == 0)
                {
                    break label0;
                }
            }
            Log.i(z[19]);
            f();
        }
        App.au.aG.b(App.au);
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        int i;
        i = App.am;
        super.onCreate(bundle);
        Log.i(z[11]);
        if (WhatsAppLibLoader.a(null)) goto _L2; else goto _L1
_L1:
        Log.i(z[6]);
        finish();
_L4:
        return;
_L2:
        int j;
        setContentView(new LinearLayout(this));
        j = App.f(this);
        if (App.Z != null || j != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!isFinishing())
        {
            bundle = new Intent(this, com/whatsapp/EULA);
            if (getIntent().getBooleanExtra(z[8], false))
            {
                bundle.putExtra(z[9], true);
            }
            startActivity(bundle);
            finish();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (j != 6)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!isFinishing())
        {
            startActivity(new Intent(this, com/whatsapp/DeleteAccountConfirmation));
            finish();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (App.Z == null || App.ah.y())
        {
            break; /* Loop/switch isn't completed */
        }
        bundle = Environment.getExternalStorageState();
        if (!bundle.equals(z[7]) && !bundle.equals(z[10]))
        {
            showDialog(107);
            if (i == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        int i1 = App.ah.v();
        Log.i((new StringBuilder()).append(z[12]).append(i1).toString());
        if (i1 > 0)
        {
            showDialog(105);
            if (i == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        b(false);
        if (i == 0) goto _L4; else goto _L6
_L6:
        b();
        return;
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 0: // '\0'
            Log.i(z[16]);
            return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e045d).setMessage(0x7f0e045c).setCancelable(false).setPositiveButton(0x7f0e04b5, new tg(this)).setNeutralButton(0x7f0e02b8, new am(this)).setNegativeButton(0x7f0e0216, new _n(this)).create();

        case 1: // '\001'
            Log.i(z[15]);
            return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0033).setCancelable(false).setMessage(0x7f0e0344).setNeutralButton(0x7f0e02ba, new ta(this)).create();

        case 2: // '\002'
            Log.i(z[13]);
            return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0033).setCancelable(false).setMessage(0x7f0e0233).setNeutralButton(0x7f0e02ba, new aup(this)).create();

        case 3: // '\003'
            Log.i(z[14]);
            break;
        }
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0047).setCancelable(false).setMessage(0x7f0e0135).setNeutralButton(0x7f0e02ba, new xt(this)).create();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[27];
        obj = "'\022[Jp/\030\021Qq2\031QL1'\037KQp(RryV\b";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        j = 0;
_L8:
label0:
        {
            if (i1 > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "+\035VV04\031\\Jz'\bZgl.\023ML|3\b";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "%\023R\026h.\035KK~6\f`Hm#\032ZJz(\037ZK";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ",\025[";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "5\024PJk%\tKgi#\016LQp(";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "5\024PJk%\tKgi#\016LQp(";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "'\036PJk/\022X\030{3\031\037Lpf\022^Lv0\031\037Tv$\016^Jv#\017\037Uv5\017VVx";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "+\023JVk#\030";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "5\024PO@4\031XQl2\016^Lv)\022`^v4\017Kg{*\033";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "5\024PO@4\031XQl2\016^Lv)\022`^v4\017Kg{*\033";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "+\023JVk#\030`Jp";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "+\035VV0%\016ZYk#";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "+\035VV0%\016ZYk#S]Y|-\tO^v*\031L^p3\022[\030";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "+\035VV0\"\025^Tp!SLPj2\030POq";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "+\035VV0\"\025^Tp!SJVl3\fOWm2\031[";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "+\035VV0\"\025^Tp!SOYl5\013PJ{";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "+\035VV0\"\025^Tp!SJHx4\035[]";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "}\\[]y'\tSL?2\023\037}J\n=";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "+\035VV0+\031\020Jz!\022^Uz";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "+\035VV0!\023KW^%\bVNv2\005";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "5\024PO@4\031XQl2\016^Lv)\022`^v4\017Kg{*\033";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "+\035VV05\024PO?\"\025^Tp!\\LAq%";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "+\035VV0/\022IYs/\030\020Jz!\025LLm'\bVWqf\017KYk#A";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "+\035VV0(\023\022Uzi\016Z_q'\021Z";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "%\023R\026h.\035KK~6\f\021nz4\025YAL+\017\021[w'\022X]q3\021]]m";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "5\024PO@4\031XQl2\016^Lv)\022`^v4\017Kg{*\033";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = ",\025[";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 676
    //                   0 699
    //                   1 706
    //                   2 713
    //                   3 720;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_720;
_L3:
        byte byte1 = 31;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 70;
          goto _L9
_L5:
        byte1 = 124;
          goto _L9
_L6:
        byte1 = 63;
          goto _L9
        byte1 = 56;
          goto _L9
    }
}
