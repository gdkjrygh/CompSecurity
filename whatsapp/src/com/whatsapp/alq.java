// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.preference.Preference;
import com.whatsapp.util.Log;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            App, SettingsChat

class alq
    implements android.preference.Preference.OnPreferenceClickListener
{

    private static final String z[];
    final SettingsChat a;

    alq(SettingsChat settingschat)
    {
        a = settingschat;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        int j = App.am;
        preference = new Intent(z[9], null);
        preference.setType(z[6]);
        Object obj = a.getPackageManager().queryIntentActivities(preference, 0);
        int k = ((List) (obj)).size();
        int i = 0;
        do
        {
label0:
            {
label1:
                {
                    if (i >= k)
                    {
                        break label1;
                    }
                    ActivityInfo activityinfo = ((ResolveInfo)((List) (obj)).get(i)).activityInfo;
                    Log.i((new StringBuilder()).append(activityinfo.applicationInfo.packageName).append(z[4]).append(activityinfo.name).toString());
                    if (activityinfo.name.contains(z[10]) && activityinfo.name.contains(z[5]) || activityinfo.name.contains(z[7]))
                    {
                        preference.setComponent(new ComponentName(activityinfo.applicationInfo.packageName, activityinfo.name));
                        preference.putExtra(z[11], a.getResources().getConfiguration().orientation);
                        if (j == 0)
                        {
                            break label1;
                        }
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                obj = new Intent(z[1], null);
                ((Intent) (obj)).putExtra(z[2], a.getResources().getConfiguration().orientation);
                Intent intent = new Intent(z[0], null);
                Intent intent1 = Intent.createChooser(new Intent(z[3], null), a.getString(0x7f0e02e6));
                intent1.putExtra(z[8], new Parcelable[] {
                    preference, obj, intent
                });
                a.startActivityForResult(intent1, 17);
                return true;
            }
            i++;
        } while (true);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "7\022GUU<\034^\bC$\r\004\022L \030D\017\f5\036^\022M:Sn>d\025(f/}\003<f7r\025-o)";
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
                obj = "7\022GUU<\034^\bC$\r\004\022L \030D\017\f5\036^\022M:Sy>v\013*k7n\004<z>p";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ";\017C\036L \034^\022M:";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "7\022GUU<\034^\bC$\r\004\022L \030D\017\f5\036^\022M:Sx>q\021)u,c\0301z:r\021/";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "t\001\n";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\023\034F\027G&\004";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "=\020K\034G{W";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "7\022GUJ \036\004\032N6\bG";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "5\023N\tM=\031\004\022L \030D\017\f1\005^\tCz4d2v\035<f$k\032)o5v\007";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "5\023N\tM=\031\004\022L \030D\017\f5\036^\022M:Sm>v\013>e5v\0213~";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "7\022E\027K&\024Y";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = ";\017C\036L \034^\022M:";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 34;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 84;
          goto _L9
_L5:
        byte1 = 125;
          goto _L9
_L6:
        byte1 = 42;
          goto _L9
        byte1 = 123;
          goto _L9
    }
}
