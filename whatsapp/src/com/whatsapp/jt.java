// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.widget.EditText;
import com.whatsapp.fieldstats.as;
import com.whatsapp.fieldstats.ax;
import com.whatsapp.fieldstats.z;
import com.whatsapp.notification.a1;
import com.whatsapp.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            DescribeProblemActivity, as6, App, g, 
//            SettingsPrivacy

public class jt extends AsyncTask
{

    private static final String z[];
    final DescribeProblemActivity a;

    protected jt(DescribeProblemActivity describeproblemactivity)
    {
        a = describeproblemactivity;
        super();
    }

    protected Void a(Void avoid[])
    {
        Log.i(as6.a(a, DescribeProblemActivity.c(a), DescribeProblemActivity.g(a), true));
        Log.a();
        Log.i();
        return null;
    }

    protected void a(Void void1)
    {
        int j = App.am;
        a.removeDialog(1);
        void1 = new ArrayList();
        android.net.Uri auri[] = DescribeProblemActivity.d(a);
        int k = auri.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            android.net.Uri uri = auri[i];
            if (uri != null)
            {
                void1.add(uri);
            }
            i++;
        } while (j == 0);
        DescribeProblemActivity.f(a).n = Double.valueOf(as.EMAIL_SEND.getCode());
        com.whatsapp.fieldstats.z.a(a, DescribeProblemActivity.f(a));
        as6.a(a, DescribeProblemActivity.c(a), DescribeProblemActivity.a(a).getText().toString().trim(), void1, DescribeProblemActivity.g(a));
        DescribeProblemActivity.a(a, null);
        a.finish();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        a.showDialog(1);
        SharedPreferences sharedpreferences = a.getSharedPreferences(z[28], 0);
        Log.i((new StringBuilder()).append(z[0]).append(a1.c().a(g.GROUP)).toString());
        Log.i((new StringBuilder()).append(z[18]).append(a1.c().a(g.INDIVIDUAL)).toString());
        Log.i((new StringBuilder()).append(z[29]).append(sharedpreferences.getString(z[13], null)).toString());
        Log.i((new StringBuilder()).append(z[25]).append(sharedpreferences.getString(z[20], null)).toString());
        Log.i((new StringBuilder()).append(z[10]).append(sharedpreferences.getBoolean(z[15], true)).toString());
        Log.i((new StringBuilder()).append(z[3]).append(sharedpreferences.getBoolean(z[12], true)).toString());
        Log.i((new StringBuilder()).append(z[22]).append(sharedpreferences.getString(z[6], z[30])).toString());
        Log.i((new StringBuilder()).append(z[26]).append(sharedpreferences.getString(z[19], z[4])).toString());
        Log.i((new StringBuilder()).append(z[11]).append(sharedpreferences.getString(z[7], "1")).toString());
        Log.i((new StringBuilder()).append(z[9]).append(sharedpreferences.getString(z[14], "1")).toString());
        Log.i((new StringBuilder()).append(z[23]).append(SettingsPrivacy.a(sharedpreferences.getInt(z[21], 0))).toString());
        Log.i((new StringBuilder()).append(z[8]).append(SettingsPrivacy.a(sharedpreferences.getInt(z[1], 0))).toString());
        Log.i((new StringBuilder()).append(z[16]).append(SettingsPrivacy.a(sharedpreferences.getInt(z[24], 0))).toString());
        Log.i((new StringBuilder()).append(z[27]).append(sharedpreferences.getBoolean(z[17], true)).toString());
        Log.i((new StringBuilder()).append(z[5]).append(sharedpreferences.getString(z[2], "")).toString());
    }

    static 
    {
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as1 = new String[31];
        obj = "\033|SAY\rvB\rN\rvURv\017vPWYB";
        byte0 = -1;
        i = 0;
_L2:
        String as2[];
        int j;
        int k;
        as2 = as1;
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
                as2[i] = ((String) (obj));
                obj = "\017kITH\034`\177R[\020\177INL iHM]\020";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as2[i] = ((String) (obj));
                obj = "\022lTGv\026wFM";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as2[i] = ((String) (obj));
                obj = "\033|SAY\rvB\rJ\020wV}E\026~HV\024";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as2[i] = ((String) (obj));
                i = 4;
                obj = "9_fdo9";
                byte0 = 3;
                break;

            case 3: // '\003'
                as2[i] = ((String) (obj));
                i = 5;
                obj = "\033|SAY\rvB\rD\nmE\037";
                byte0 = 4;
                break;

            case 4: // '\004'
                as2[i] = ((String) (obj));
                i = 6;
                obj = "\030kOWY wOV@\031`\177N@\030qT}J\020uOP";
                byte0 = 5;
                break;

            case 5: // '\005'
                as2[i] = ((String) (obj));
                i = 7;
                obj = "\030kOWY wOV@\031`\177T@\035kAVL uELN\013q";
                byte0 = 6;
                break;

            case 6: // '\006'
                as2[i] = ((String) (obj));
                i = 8;
                obj = "\033|SAY\rvB\rY\rpV\rY\026z\035";
                byte0 = 7;
                break;

            case 7: // '\007'
                as2[i] = ((String) (obj));
                i = 9;
                obj = "\033|SAY\rvB\rJ\020wV}_\026{RC]\032FLGG\030mH\037";
                byte0 = 8;
                break;

            case 8: // '\b'
                as2[i] = ((String) (obj));
                i = 10;
                obj = "\033|SAY\rvB\rN\rvURv\023pGJ]B";
                byte0 = 9;
                break;

            case 9: // '\t'
                as2[i] = ((String) (obj));
                i = 11;
                obj = "\033|SAY\rvB\rN\rvURv\tpBPH\013|\177NL\021~TJ\024";
                byte0 = 10;
                break;

            case 10: // '\n'
                as2[i] = ((String) (obj));
                i = 12;
                obj = "\021vTKO\006FLKN\027m";
                byte0 = 11;
                break;

            case 11: // '\013'
                as2[i] = ((String) (obj));
                i = 13;
                obj = "\030kOWY wOV@\031`\177VF\021|";
                byte0 = 12;
                break;

            case 12: // '\f'
                as2[i] = ((String) (obj));
                i = 14;
                obj = "\021vTKO\006FVKK\rxTGv\023|NE]\027";
                byte0 = 13;
                break;

            case 13: // '\r'
                as2[i] = ((String) (obj));
                i = 15;
                obj = "\030kOWY wOV@\031`\177N@\030qT";
                byte0 = 14;
                break;

            case 14: // '\016'
                as2[i] = ((String) (obj));
                i = 16;
                obj = "\033|SAY\rvB\rY\rpV\rZ\013xTWZB";
                byte0 = 15;
                break;

            case 15: // '\017'
                as2[i] = ((String) (obj));
                i = 17;
                obj = "\r|AFv\r|CG@\017mS}L\021xBNL\033";
                byte0 = 16;
                break;

            case 16: // '\020'
                as2[i] = ((String) (obj));
                i = 18;
                obj = "\033|SAY\rvB\rJ\020wV}Y\020iUR\024";
                byte0 = 17;
                break;

            case 17: // '\021'
                as2[i] = ((String) (obj));
                i = 19;
                obj = "\021vTKO\006FLKN\027m\177AF\023vR";
                byte0 = 18;
                break;

            case 18: // '\022'
                as2[i] = ((String) (obj));
                i = 20;
                obj = "\021vTKO\006FRKG\030mOLL";
                byte0 = 19;
                break;

            case 19: // '\023'
                as2[i] = ((String) (obj));
                i = 21;
                obj = "\017kITH\034`\177NH\fm\177QL\032w";
                byte0 = 20;
                break;

            case 20: // '\024'
                as2[i] = ((String) (obj));
                i = 22;
                obj = "\033|SAY\rvB\rN\rvURv\023pGJ] zONF\r$";
                byte0 = 21;
                break;

            case 21: // '\025'
                as2[i] = ((String) (obj));
                i = 23;
                obj = "\033|SAY\rvB\rY\rpV\rE\036jT\037";
                byte0 = 22;
                break;

            case 22: // '\026'
                as2[i] = ((String) (obj));
                i = 24;
                obj = "\017kITH\034`\177Q]\036mUQ";
                byte0 = 23;
                break;

            case 23: // '\027'
                as2[i] = ((String) (obj));
                obj = "\033|SAY\rvB\rJ\020wV}G\020mIDPB";
                byte0 = 24;
                i = 25;
                break;

            case 24: // '\030'
                as2[i] = ((String) (obj));
                i = 26;
                obj = "\033|SAY\rvB\rJ\020wV}E\026~HVv\034vLM[B";
                byte0 = 25;
                break;

            case 25: // '\031'
                as2[i] = ((String) (obj));
                i = 27;
                obj = "\033|SAY\rvB\rY\rpV\r[\032xDPL\034|IR]\f$";
                byte0 = 26;
                break;

            case 26: // '\032'
                as2[i] = ((String) (obj));
                i = 28;
                obj = "\034vM\f^\027xTQH\017i\177R[\032\177EPL\021zEQ";
                byte0 = 27;
                break;

            case 27: // '\033'
                as2[i] = ((String) (obj));
                i = 29;
                obj = "\033|SAY\rvB\rN\rvURv\021vTKO\006$";
                byte0 = 28;
                break;

            case 28: // '\034'
                as2[i] = ((String) (obj));
                i = 30;
                obj = "9_fdo9";
                byte0 = 29;
                break;

            case 29: // '\035'
                as2[i] = ((String) (obj));
                z = as1;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 764
    //                   0 787
    //                   1 794
    //                   2 801
    //                   3 808;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_808;
_L3:
        byte byte1 = 41;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 127;
          goto _L9
_L5:
        byte1 = 25;
          goto _L9
_L6:
        byte1 = 32;
          goto _L9
        byte1 = 34;
          goto _L9
    }
}
