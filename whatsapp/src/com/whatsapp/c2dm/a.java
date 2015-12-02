// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.c2dm;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.c2dm:
//            C2DMRegistrar

public class a
{

    private static final String z[];
    private final Context a;

    public a(Context context)
    {
        a = context;
    }

    private SharedPreferences f()
    {
        return a.getSharedPreferences(z[9], 0);
    }

    public void a(int k)
    {
        Log.b(f().edit().putInt(z[0], k).commit());
    }

    public void a(String s)
    {
        Log.b(f().edit().putString(z[5], s).commit());
    }

    public boolean a()
    {
        return f().contains(z[7]);
    }

    public int b()
    {
        return f().getInt(z[10], 0);
    }

    public void c()
    {
        Log.b(f().edit().remove(z[8]).commit());
    }

    public void d()
    {
        Log.b(f().edit().remove(z[1]).commit());
    }

    public void e()
    {
        boolean flag = C2DMRegistrar.c;
        int l = b();
        int k = l;
        if (l < 0x7fffffff)
        {
            k = l + 1;
        }
        Log.b(f().edit().putInt(z[3], k).commit());
        if (DialogToastActivity.g != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            C2DMRegistrar.c = flag;
        }
    }

    public void g()
    {
        Log.b(f().edit().remove(z[6]).commit());
    }

    public int h()
    {
        int k;
        try
        {
            k = a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.a(z[2], namenotfoundexception);
            return -1;
        }
        return k;
    }

    public String i()
    {
        return f().getString(z[4], null);
    }

    public int j()
    {
        return f().getInt(z[11], 0);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int k;
        as = new String[12];
        obj = "&`\030\013{$\"\f9R  \017";
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
                obj = "&`\030\013{$\"\f9R  \017";
                k = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[k] = ((String) (obj));
                obj = "\"7\b%Q7 \031\bP\004\"\f\nM&3\b\017K+\004\031\024W,=\022";
                k = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[k] = ((String) (obj));
                obj = "&`\030\013{77\b\024]\0321\023\023J1";
                k = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[k] = ((String) (obj));
                obj = "&`\030\013{77\0339M!";
                k = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[k] = ((String) (obj));
                k = 5;
                obj = "&`\030\013{77\0339M!";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[k] = ((String) (obj));
                k = 6;
                obj = "&`\030\013{77\0339M!";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[k] = ((String) (obj));
                k = 7;
                obj = "&`\030\013{77\0339M!";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[k] = ((String) (obj));
                k = 8;
                obj = "&`\030\013{77\b\024]\0321\023\023J1";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[k] = ((String) (obj));
                k = 9;
                obj = "&=\021HS-3\b\025E5\"#\026V 4\031\024A+1\031\025";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[k] = ((String) (obj));
                k = 10;
                obj = "&`\030\013{77\b\024]\0321\023\023J1";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[k] = ((String) (obj));
                k = 11;
                obj = "&`\030\013{$\"\f9R  \017";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[k] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 36;
_L9:
        obj[l] = (char)(byte1 ^ c1);
        l++;
          goto _L8
_L4:
        byte1 = 69;
          goto _L9
_L5:
        byte1 = 82;
          goto _L9
_L6:
        byte1 = 124;
          goto _L9
        byte1 = 102;
          goto _L9
    }
}
