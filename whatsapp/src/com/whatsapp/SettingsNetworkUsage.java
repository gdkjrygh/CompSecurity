// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import com.whatsapp.preference.WaDialogPreference;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.whatsapp:
//            DialogToastPreferenceActivity, App, l1, abl, 
//            s4

public class SettingsNetworkUsage extends DialogToastPreferenceActivity
{

    private static final SimpleDateFormat h;
    private static final String z[];

    public SettingsNetworkUsage()
    {
    }

    private void a()
    {
label0:
        {
            Statistics.Data data;
            int i;
label1:
            {
                i = App.am;
                data = l1.b;
                if (data == null)
                {
                    break label0;
                }
                a(z[4], 0x7f0d0021, data.getTotalMessagesSent());
                a(z[6], 0x7f0d0021, data.getTotalMessagesReceived());
                a(z[15], data.getMediaBytesSent());
                a(z[8], data.getMediaBytesReceived());
                a(z[9], data.getMessageBytesSent());
                a(z[1], data.getMessageBytesReceived());
                if (App.aq())
                {
                    a(z[11], 0x7f0d0022, data.getOutgoingVoipCalls());
                    a(z[7], 0x7f0d0022, data.getIncomingVoipCalls());
                    a(z[18], data.getVoipBytesSent());
                    a(z[2], data.getVoipBytesReceived());
                    if (i == 0)
                    {
                        break label1;
                    }
                }
                PreferenceScreen preferencescreen = getPreferenceScreen();
                a(preferencescreen, z[5]);
                a(preferencescreen, z[10]);
                a(preferencescreen, z[3]);
                a(preferencescreen, z[13]);
            }
            a(z[17], data.getTotalBytesSent());
            a(z[14], data.getTotalBytesReceived());
            long l = data.getLastReset();
            if (l != 0x8000000000000000L)
            {
                a(z[16], 0x7f0e028e, new Object[] {
                    h.format(new Date(l))
                });
                if (i == 0)
                {
                    break label0;
                }
            }
            a(z[12], 0x7f0e028e, new Object[] {
                getString(0x7f0e029c)
            });
        }
    }

    private void a(PreferenceScreen preferencescreen, String s)
    {
        if (preferencescreen != null && s != null)
        {
            if ((s = findPreference(s)) != null)
            {
                preferencescreen.removePreference(s);
                return;
            }
        }
    }

    static void a(SettingsNetworkUsage settingsnetworkusage)
    {
        settingsnetworkusage.a();
    }

    private void a(String s, int i, long l)
    {
        s = findPreference(s);
        if (s != null)
        {
            s.setSummary(String.format(App.j.a(i, (int)l), new Object[] {
                Long.valueOf(l)
            }));
        }
    }

    private void a(String s, int i, Object aobj[])
    {
        s = findPreference(s);
        if (s != null)
        {
            s.setSummary(String.format(getString(i), aobj));
        }
    }

    private void a(String s, long l)
    {
        double d1;
        int k;
        int i1;
        i1 = App.am;
        double d = l;
        int i = 0;
        do
        {
            k = i;
            d1 = d;
            if (i >= 3)
            {
                break;
            }
            k = i;
            d1 = d;
            if (d <= 1024D)
            {
                break;
            }
            d1 = d / 1024D;
            k = i + 1;
            i = k;
            d = d1;
        } while (i1 == 0);
        k;
        JVM INSTR tableswitch 0 3: default 104
    //                   0 127
    //                   1 136
    //                   2 145
    //                   3 154;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        int j = 0;
_L7:
        a(s, j, new Object[] {
            Double.valueOf(d1)
        });
        return;
_L2:
        a(s, 0x7f0d0020, l);
        return;
_L3:
        j = 0x7f0e028c;
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        j = 0x7f0e028d;
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        j = 0x7f0e028b;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f05000a);
        ((WaDialogPreference)findPreference(z[0])).a(new s4(this));
    }

    protected void onResume()
    {
        super.onResume();
        a();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[20];
        obj = "\007>VIs\0330}Ko\b<Gan\f(GJ";
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
                obj = "\007>VIs\0330}Ko\b<Gaq\f(Q_{\f\004@Gh\f(}Ly\n>KHy\r";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\007>VIs\0330}Ko\b<Gaj\0062Ra\177\b7Na~\020/GMC\033>A[u\037>F";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\007>VIs\0330}Ko\b<Gaj\0062Ra\177\b7Na~\020/GMC\032>LJ";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\007>VIs\0330}Ko\b<Gaq\f(Q_{\f(}My\007/";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\007>VIs\0330}Ko\b<Gaj\0062Ra\177\b7NMC\032>LJ";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\007>VIs\0330}Ko\b<Gaq\f(Q_{\f(}Ly\n>KHy\r";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\007>VIs\0330}Ko\b<Gaj\0062Ra\177\b7NMC\033>A[u\037>F";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\007>VIs\0330}Ko\b<Gaq\f?K_C\013\"V[o6)G]y\000-GZ";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\007>VIs\0330}Ko\b<Gaq\f(Q_{\f\004@Gh\f(}My\007/";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\007>VIs\0330}Ko\b<Gaj\0062Ra\177\b7NMC\033>A[u\037>F";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\007>VIs\0330}Ko\b<Gaj\0062Ra\177\b7NMC\032>LJ";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\007>VIs\0330}Ko\b<Gan\f(GJ";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\007>VIs\0330}Ko\b<Gaj\0062Ra\177\b7Na~\020/GMC\033>A[u\037>F";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\007>VIs\0330}Ko\b<Gah\006/CRC\013\"V[o6)G]y\000-GZ";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\007>VIs\0330}Ko\b<Gaq\f?K_C\013\"V[o6(GPh";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\007>VIs\0330}Ko\b<Gan\f(GJ";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\007>VIs\0330}Ko\b<Gah\006/CRC\013\"V[o6(GPh";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\007>VIs\0330}Ko\b<Gaj\0062Ra\177\b7Na~\020/GMC\032>LJ";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\020\"[G1$\026o\023x\r{jv&\0046\030Mo";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                z = as;
                h = new SimpleDateFormat(z[19]);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 536
    //                   0 559
    //                   1 566
    //                   2 573
    //                   3 580;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_580;
_L3:
        byte byte1 = 28;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 105;
          goto _L9
_L5:
        byte1 = 91;
          goto _L9
_L6:
        byte1 = 34;
          goto _L9
        byte1 = 62;
          goto _L9
    }
}
