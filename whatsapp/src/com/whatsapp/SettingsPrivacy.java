// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.preference.Preference;
import com.whatsapp.preference.WaPrivacyPreference;
import com.whatsapp.util.Log;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

// Referenced classes of package com.whatsapp:
//            DialogToastPreferenceActivity, ash, ao3, a_d, 
//            App, ij, gb, k_

public class SettingsPrivacy extends DialogToastPreferenceActivity
{

    private static Handler h;
    private static SettingsPrivacy i;
    private static HashMap j;
    private static Runnable l;
    private static final String z[];
    private android.preference.Preference.OnPreferenceChangeListener k;

    public SettingsPrivacy()
    {
        k = new ao3(this);
    }

    private static int a(String s)
    {
        if (z[0].equals(s))
        {
            return 0;
        }
        if (z[2].equals(s))
        {
            return 1;
        }
        return !z[1].equals(s) ? -1 : 2;
    }

    protected static String a(int i1)
    {
        switch (i1)
        {
        default:
            return z[11];

        case 0: // '\0'
            return z[10];

        case 1: // '\001'
            return z[9];

        case 2: // '\002'
            return z[12];
        }
    }

    private void a()
    {
        boolean flag1 = true;
        SharedPreferences sharedpreferences = getSharedPreferences(z[22], 0);
        String as[] = getResources().getStringArray(0x7f070011);
        WaPrivacyPreference waprivacypreference = (WaPrivacyPreference)findPreference(z[19]);
        a_d a_d1 = (a_d)j.get(z[20]);
        int i1;
        boolean flag;
        if (a_d1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        waprivacypreference.setEnabled(flag);
        if (a_d1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        waprivacypreference.a(flag);
        if (a_d1 == null)
        {
            i1 = sharedpreferences.getInt(z[21], 0);
        } else
        {
            i1 = a(a_d1.c);
        }
        i1 = Math.max(0, i1);
        waprivacypreference.setValueIndex(i1);
        waprivacypreference.setSummary(as[i1]);
        waprivacypreference = (WaPrivacyPreference)findPreference(z[15]);
        a_d1 = (a_d)j.get(z[18]);
        if (a_d1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        waprivacypreference.setEnabled(flag);
        if (a_d1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        waprivacypreference.a(flag);
        if (a_d1 == null)
        {
            i1 = sharedpreferences.getInt(z[23], 0);
        } else
        {
            i1 = a(a_d1.c);
        }
        i1 = Math.max(0, i1);
        waprivacypreference.setValueIndex(i1);
        waprivacypreference.setSummary(as[i1]);
        waprivacypreference = (WaPrivacyPreference)findPreference(z[24]);
        a_d1 = (a_d)j.get(z[16]);
        if (a_d1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        waprivacypreference.setEnabled(flag);
        if (a_d1 != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        waprivacypreference.a(flag);
        if (a_d1 == null)
        {
            i1 = sharedpreferences.getInt(z[17], 0);
        } else
        {
            i1 = a(a_d1.c);
        }
        i1 = Math.max(0, i1);
        waprivacypreference.setValueIndex(i1);
        waprivacypreference.setSummary(as[i1]);
    }

    static void a(SettingsPrivacy settingsprivacy)
    {
        settingsprivacy.a();
    }

    public static void a(Hashtable hashtable)
    {
        SharedPreferences sharedpreferences;
        android.content.SharedPreferences.Editor editor;
        Enumeration enumeration;
        boolean flag;
        int i1;
        i1 = App.am;
        sharedpreferences = App.au.getSharedPreferences(z[29], 0);
        editor = sharedpreferences.edit();
        enumeration = hashtable.keys();
        flag = false;
_L8:
        String s;
        String s1;
        a_d a_d1;
        int j1;
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)enumeration.nextElement();
        s1 = (String)hashtable.get(s);
        Log.i((new StringBuilder()).append(z[31]).append(s).append(":").append(s1).toString());
        j1 = a(s1);
        if (j1 < 0)
        {
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_332;
            }
            flag = true;
        }
        a_d1 = (a_d)j.get(s);
        if (a_d1 != null && !a_d1.c.equals(s1)) goto _L2; else goto _L1
_L1:
        j.remove(s);
        if (!z[26].equals(s)) goto _L4; else goto _L3
_L3:
        int k1 = sharedpreferences.getInt(z[32], 0);
        editor.putInt(z[33], j1);
        if (k1 != j1)
        {
            App.o.a();
        }
        if (i1 == 0) goto _L2; else goto _L4
_L4:
        if (!z[27].equals(s)) goto _L6; else goto _L5
_L5:
        editor.putInt(z[28], j1);
        if (i1 == 0) goto _L2; else goto _L6
_L6:
        if (z[25].equals(s))
        {
            editor.putInt(z[30], j1);
        }
_L2:
        if (i1 == 0) goto _L8; else goto _L7
_L7:
        editor.commit();
        if (flag)
        {
            App.b(App.au.getApplicationContext(), 0x7f0e0187, 1);
        }
        if (i != null)
        {
            i.a();
        }
        return;
        flag = true;
          goto _L2
        if (true) goto _L8; else goto _L9
_L9:
    }

    static Runnable b()
    {
        return l;
    }

    static SettingsPrivacy c()
    {
        return i;
    }

    static HashMap d()
    {
        return j;
    }

    static Handler e()
    {
        return h;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.i(z[5]);
        i = this;
        addPreferencesFromResource(0x7f05000c);
        ((WaPrivacyPreference)findPreference(z[8])).setOnPreferenceChangeListener(k);
        ((WaPrivacyPreference)findPreference(z[4])).setOnPreferenceChangeListener(k);
        ((WaPrivacyPreference)findPreference(z[3])).setOnPreferenceChangeListener(k);
        findPreference(z[6]).setOnPreferenceChangeListener(new gb(this));
        findPreference(z[7]).setOnPreferenceClickListener(new k_(this));
        a();
        App.aj();
    }

    public void onDestroy()
    {
        Log.i(z[14]);
        super.onDestroy();
        i = null;
    }

    protected void onResume()
    {
        String s;
        Preference preference;
label0:
        {
            super.onResume();
            preference = findPreference(z[13]);
            int i1 = App.L.size();
            if (i1 > 0)
            {
                s = getString(0x7f0e0397, new Object[] {
                    Integer.valueOf(i1)
                });
                if (App.am == 0)
                {
                    break label0;
                }
            }
            s = getString(0x7f0e0397, new Object[] {
                getString(0x7f0e0398)
            });
        }
        preference.setTitle(s);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[34];
        obj = "=6\013";
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
                obj = "25\t;";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "?5\t*'?.\024";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = ",(\016('?#8-2=.\022-";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = ",(\016('?#8.43<\0162#\003*\017123";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "/?\023*/2=\024.45,\006=?s9\025;'(?";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = ".?\006:\031.?\004;/,.\024\001#2;\0052#8";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = ">6\b=-\0036\016-2";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = ",(\016('?#82'/.8-#94";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "?5\t*'?.\024";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "=6\013";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "=6\013";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "25\t;";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = ">6\b=-\0036\016-2";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "/?\023*/2=\024.45,\006=?s>\002-2.5\036";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = ",(\016('?#8.43<\0162#\003*\017123";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "/.\006*3/";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = ",(\016('?#8-2=.\022-";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = ",(\b8/0?";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = ",(\016('?#82'/.8-#94";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "0;\024*";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = ",(\016('?#82'/.8-#94";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "?5\np14;\023-',*8.49<\002,#29\002-";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = ",(\016('?#8.43<\0162#\003*\017123";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = ",(\016('?#8-2=.\022-";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "/.\006*3/";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "0;\024*";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = ",(\b8/0?";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = ",(\016('?#8.43<\0162#\003*\017123";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "?5\np14;\023-',*8.49<\002,#29\002-";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = ",(\016('?#8-2=.\022-";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "/?\023*/2=\024.45,\006=?s(\002=#5,\002:f";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = ",(\016('?#82'/.8-#94";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = ",(\016('?#82'/.8-#94";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                z = as;
                j = new HashMap();
                h = new Handler();
                l = new ash();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 860
    //                   0 883
    //                   1 890
    //                   2 897
    //                   3 904;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_904;
_L3:
        byte byte1 = 70;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 92;
          goto _L9
_L5:
        byte1 = 90;
          goto _L9
_L6:
        byte1 = 103;
          goto _L9
        byte1 = 94;
          goto _L9
    }
}
