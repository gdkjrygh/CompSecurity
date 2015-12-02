// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.util.a;
import com.whatsapp.util.b8;
import com.whatsapp.util.bp;
import com.whatsapp.util.c8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.whatsapp:
//            App, o4, au2, ChangeNumber, 
//            m7, my, asy, EnterPhoneNumber, 
//            cu, dx, DialogToastActivity, DialogToastListActivity

public class as6
{

    private static final String z[];

    private static int a(String s, String s1, int i)
    {
        int l = 0;
        int i1 = App.am;
        byte byte0 = -1;
        int k = byte0;
        if (s != null)
        {
            k = byte0;
            if (s1 != null)
            {
                k = byte0;
                if (s.length() >= i)
                {
                    k = byte0;
                    if (s1.length() >= i)
                    {
                        int j1 = s.length();
                        int k1 = s1.length();
                        int j = 0;
                        do
                        {
                            k = j;
                            if (l >= i)
                            {
                                break;
                            }
                            k = j;
                            if (s.charAt((j1 - i) + l) != s1.charAt((k1 - i) + l))
                            {
                                k = j + 1;
                            }
                            l++;
                            j = k;
                        } while (i1 == 0);
                    }
                }
            }
        }
        return k;
    }

    private static String a()
    {
        Object obj = new StringBuilder();
        a a1 = App.ar.a(0L, TimeUnit.MILLISECONDS);
        if (a1.b != null)
        {
            ((StringBuilder) (obj)).append(z[44]).append(a1.b.size()).append(' ');
        }
        if (a1.a != null)
        {
            ((StringBuilder) (obj)).append(z[40]).append(a1.a.size()).append(' ');
        }
_L1:
        boolean flag;
        try
        {
            Class.forName(z[41]);
            ((StringBuilder) (obj)).append(z[43]);
        }
        catch (ClassNotFoundException classnotfoundexception) { }
        flag = o4.z();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        String s;
        Exception exception;
        int i;
        try
        {
            if (o4.P())
            {
                ((StringBuilder) (obj)).append(z[39]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        try
        {
            s = com.whatsapp.o4.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        ((StringBuilder) (obj)).append(z[47]);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        ((StringBuilder) (obj)).append(z[45]);
        try
        {
            if (au2.j)
            {
                ((StringBuilder) (obj)).append(z[46]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        try
        {
            i = ((StringBuilder) (obj)).length();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i == 0)
        {
            return null;
        } else
        {
            return ((StringBuilder) (obj)).toString();
        }
        exception;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            ((StringBuilder) (obj)).append(z[42]);
        }
          goto _L1
        exception;
        throw exception;
        obj;
        throw obj;
    }

    private static String a(int i)
    {
        switch (i)
        {
        default:
            return z[17];

        case 0: // '\0'
            return z[16];

        case 1: // '\001'
            return z[19];

        case 2: // '\002'
            return z[20];

        case 3: // '\003'
            return z[18];
        }
    }

    private static String a(Context context)
    {
label0:
        {
            Object obj = ((ConnectivityManager)context.getSystemService(z[117])).getActiveNetworkInfo();
            context = new StringBuilder();
            if (obj != null)
            {
                a(((StringBuilder) (context)), ((NetworkInfo) (obj)).getTypeName());
                obj = ((NetworkInfo) (obj)).getSubtypeName();
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    context.append(z[118]);
                    a(((StringBuilder) (context)), ((String) (obj)));
                    context.append(')');
                }
                if (App.am == 0)
                {
                    break label0;
                }
            }
            context.append(z[119]);
        }
        return context.toString();
    }

    private static String a(Context context, String s, String s1, String s2)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (s1 != null)
        {
            stringbuilder.append(s1);
        }
        stringbuilder.append(a(context, s, s2, false));
        return stringbuilder.toString();
    }

    public static String a(Context context, String s, String s1, boolean flag)
    {
        StringBuilder stringbuilder;
        int i;
        i = App.am;
        stringbuilder = new StringBuilder();
        String s7;
        String s8;
        SimpleDateFormat simpledateformat;
        Locale locale;
        simpledateformat = new SimpleDateFormat(z[86], Locale.US);
        locale = context.getResources().getConfiguration().locale;
        SharedPreferences sharedpreferences = context.getSharedPreferences(z[109], 0);
        s7 = sharedpreferences.getString(z[69], "");
        s8 = sharedpreferences.getString(z[58], "");
        if (App.Z == null) goto _L2; else goto _L1
_L1:
        Object obj = App.Z.jabber_id;
        if (obj == null) goto _L2; else goto _L3
_L3:
        Object obj1 = (new StringBuilder()).append("+").append(App.Z.jabber_id).toString();
_L37:
        obj = obj1;
        Object obj2;
        if (!ChangeNumber.f())
        {
            break MISSING_BLOCK_LABEL_1497;
        }
        obj1 = (new StringBuilder()).append(z[56]).append(((String) (obj1))).toString();
        obj2 = App.aE();
        obj = obj1;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1497;
        }
        String s2 = ((App.Me) (obj2)).jabber_id;
        obj = obj1;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_1497;
        }
        obj1 = (new StringBuilder()).append(((String) (obj1))).append(z[99]).append(((App.Me) (obj2)).jabber_id).append(")").toString();
_L44:
        long l = m7.b(z[62]);
        if (l < 0x40acd884560L) goto _L5; else goto _L4
_L4:
        obj = z[98];
        if (i == 0) goto _L6; else goto _L5
_L5:
        if (l <= 0L) goto _L8; else goto _L7
_L7:
        obj = simpledateformat.format(new Date(l));
        if (i == 0) goto _L6; else goto _L8
_L8:
        obj2 = z[80];
_L43:
        obj = z[75];
        obj = z[77];
        obj = (TelephonyManager)context.getSystemService(z[111]);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        String s3;
        String s4;
        String s5;
        String s6;
        s6 = a(((TelephonyManager) (obj)).getPhoneType());
        s5 = b(((TelephonyManager) (obj)).getNetworkType());
        s4 = b8.a(((TelephonyManager) (obj)).getNetworkOperator(), z[101]);
        s3 = b8.a(((TelephonyManager) (obj)).getSimOperator(), z[76]);
        s2 = ((TelephonyManager) (obj)).getNetworkOperatorName();
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_454;
        }
        s6 = z[108];
        s5 = z[106];
        s4 = z[63];
        s3 = z[105];
        s2 = z[54];
        if (!App.ac) goto _L10; else goto _L9
_L9:
        obj = z[107];
        if (i == 0) goto _L11; else goto _L10
_L10:
        boolean flag1 = App.V;
        if (!flag1) goto _L13; else goto _L12
_L12:
        obj = z[102];
        if (i == 0) goto _L11; else goto _L13
_L13:
        flag1 = App.x();
        if (!flag1) goto _L15; else goto _L14
_L14:
        obj = z[91];
        if (i == 0) goto _L11; else goto _L15
_L15:
        Object obj3 = z[113];
_L42:
        JSONObject jsonobject;
        stringbuilder.append(z[50]);
        stringbuilder.append(z[81]);
        jsonobject = new JSONObject();
        int j;
        if (flag)
        {
            obj = jsonobject;
        } else
        {
            obj = stringbuilder;
        }
        a(z[70], ((String) (obj1)), obj);
        a(z[79], z[60], obj);
        a(z[89], z[110], obj);
        a(z[83], ((String) (obj2)), obj);
        obj2 = z[72];
        if (locale == null) goto _L17; else goto _L16
_L16:
        obj1 = locale.getCountry();
_L38:
        a(((String) (obj2)), ((String) (obj1)), obj);
        obj2 = z[103];
        if (locale == null) goto _L19; else goto _L18
_L18:
        obj1 = locale.getLanguage();
_L39:
        a(((String) (obj2)), ((String) (obj1)), obj);
        a(z[66], s, obj);
        a(z[51], s2, obj);
        a(z[87], Build.MANUFACTURER, obj);
        a(z[96], Build.MODEL, obj);
        a(z[53], android.os.Build.VERSION.RELEASE, obj);
        a(z[71], ((String) (obj3)), obj);
        a(z[84], s4, obj);
        a(z[61], s3, obj);
        if (!my.r()) goto _L21; else goto _L20
_L20:
        a(z[93], z[55], obj);
        if (i == 0) goto _L22; else goto _L21
_L21:
        flag1 = my.l();
        if (!flag1) goto _L22; else goto _L23
_L23:
        a(z[95], z[74], obj);
_L22:
        a(z[52], (new StringBuilder()).append(s7).append(" ").append(s8).toString(), obj);
        a(z[64], z[90], obj);
        a(z[57], z[78], obj);
        a(z[100], Build.PRODUCT, obj);
        a(z[73], Build.DEVICE, obj);
        a(z[97], Build.DISPLAY, obj);
        a(z[88], b(), obj);
        a(z[68], a(context), obj);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1005;
        }
        a(z[115], s1, obj);
        a(z[114], simpledateformat.format(new Date()), obj);
        a(z[85], a(s6), obj);
        a(z[59], a(s5), obj);
        context = a();
        if (!TextUtils.isEmpty(context))
        {
            a(z[82], ((String) (context)), obj);
        }
        if (App.Z != null) goto _L25; else goto _L24
_L24:
        obj1 = App.z.getLine1Number();
        a(z[49], (new StringBuilder()).append(((String) (obj1))).append(" ").append(App.z.getSimState()).toString(), obj);
        j = a(s8, ((String) (obj1)), 6);
        s = Boolean.valueOf(true);
        if (j != 0 && j != 1) goto _L25; else goto _L26
_L26:
        context = s;
        if (j != 0) goto _L28; else goto _L27
_L27:
        s1 = null;
        j = Integer.parseInt(s7);
        context = com.whatsapp.asy.a(j, ((String) (obj1)));
        s1 = context;
_L40:
        if (((String) (obj1)).equals(s8)) goto _L30; else goto _L29
_L29:
        flag1 = ((String) (obj1)).endsWith((new StringBuilder()).append(s7).append(s8).toString());
        if (flag1) goto _L30; else goto _L31
_L31:
        flag1 = s8.equals(s1);
        if (!flag1) goto _L32; else goto _L30
_L30:
        s = Boolean.valueOf(false);
        context = s;
        if (i == 0) goto _L28; else goto _L32
_L32:
        flag1 = s8.endsWith(s1);
        context = s;
        if (!flag1) goto _L28; else goto _L33
_L33:
        i = com.whatsapp.EnterPhoneNumber.a(s7, s1);
        context = s;
        if (i == 5)
        {
            context = null;
        }
_L28:
        s = z[116];
        if (context != null) goto _L35; else goto _L34
_L34:
        context = z[104];
_L41:
        a(s, ((String) (context)), obj);
_L25:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1332;
        }
        stringbuilder.append(jsonobject.toString(1));
_L36:
        return stringbuilder.toString();
        context;
        throw context;
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.a(z[48], context);
        }
        stringbuilder.append(z[94]);
        stringbuilder.append(context);
        if (true) goto _L36; else goto _L2
_L2:
        obj1 = z[67];
          goto _L37
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
_L17:
        obj1 = z[92];
          goto _L38
        context;
        throw context;
_L19:
        obj1 = z[112];
          goto _L39
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        Log.a(z[65], context);
          goto _L40
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
_L35:
        context = String.valueOf(context);
          goto _L41
        context;
        throw context;
_L11:
        obj3 = obj;
          goto _L42
_L6:
        obj2 = obj;
          goto _L43
        obj1 = obj;
          goto _L44
    }

    private static String a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder(s.length() * 2);
            a(stringbuilder, s);
            return stringbuilder.toString();
        }
    }

    private static void a(Activity activity, dx dx1, String s, String s1, ArrayList arraylist, String s2)
    {
        int i = App.am;
        String s3 = activity.getString(0x7f0e014e);
        s1 = a(((Context) (activity)), s, s1, s2);
        s2 = bp.a(Log.a(3));
        Intent intent;
        boolean flag;
        if (arraylist != null && !arraylist.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            s = z[27];
        } else
        {
            s = z[30];
        }
        intent = new Intent(s);
        if (s2 != null) goto _L2; else goto _L1
_L1:
        intent.setType(z[28]);
        s = (new StringBuilder()).append(s1).append(z[23]).toString();
        s1 = s;
        if (i == 0) goto _L4; else goto _L3
_L3:
        intent.setType(z[26]);
        if (!flag) goto _L6; else goto _L5
_L5:
        arraylist.add(Uri.fromFile(s2));
        s1 = s;
        if (i == 0) goto _L4; else goto _L6
_L6:
        intent.putExtra(z[25], Uri.fromFile(s2));
        s1 = s;
_L4:
        intent.putExtra(z[31], new String[] {
            cu.b
        });
        intent.putExtra(z[24], s3);
        intent.putExtra(z[32], s1);
        if (flag)
        {
            intent.putParcelableArrayListExtra(z[29], arraylist);
        }
        a(intent, activity, dx1, activity.getString(0x7f0e00d8));
        return;
_L2:
        s = s1;
        if (true) goto _L3; else goto _L7
_L7:
    }

    public static void a(Intent intent, Activity activity, dx dx1, String s)
    {
label0:
        {
            int i = App.am;
            ArrayList arraylist = new ArrayList();
            Object obj = activity.getPackageManager().queryIntentActivities(intent, 0);
            if (obj != null)
            {
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    Object obj1 = ((ResolveInfo)((Iterator) (obj)).next()).activityInfo;
                    String s1 = ((ActivityInfo) (obj1)).name;
                    obj1 = ((ActivityInfo) (obj1)).applicationInfo.packageName;
                    Log.i((new StringBuilder()).append(z[122]).append(((String) (obj1))).append(z[123]).append(s1).toString());
                    if (((String) (obj1)).contains(z[121]) || ((String) (obj1)).contains(z[130]) || ((String) (obj1)).contains(z[125]) || ((String) (obj1)).contains(z[128]) || ((String) (obj1)).contains(z[127]) || ((String) (obj1)).contains(z[126]) || ((String) (obj1)).contains(z[129]) || ((String) (obj1)).contains(z[124]))
                    {
                        Intent intent1 = (Intent)intent.clone();
                        intent1.setClassName(((String) (obj1)), s1);
                        intent1.setPackage(((String) (obj1)));
                        arraylist.add(intent1);
                    }
                } while (i == 0);
            }
            if (arraylist.size() == 0)
            {
                if (dx1 != null)
                {
                    dx1.a(0x7f0e0160);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                App.b(activity, 0x7f0e0160, 0);
                if (i == 0)
                {
                    break label0;
                }
            }
            intent = Intent.createChooser((Intent)arraylist.get(arraylist.size() - 1), s);
            if (arraylist.size() > 1)
            {
                arraylist.remove(arraylist.size() - 1);
                intent.putExtra(z[120], (android.os.Parcelable[])arraylist.toArray(new Intent[arraylist.size()]));
            }
            activity.startActivity(intent);
        }
    }

    public static void a(DialogToastActivity dialogtoastactivity, String s, String s1, ArrayList arraylist, String s2)
    {
        a(((Activity) (dialogtoastactivity)), ((dx) (dialogtoastactivity)), s, s1, arraylist, s2);
    }

    public static void a(DialogToastListActivity dialogtoastlistactivity, String s, String s1, ArrayList arraylist, String s2)
    {
        a(((Activity) (dialogtoastlistactivity)), ((dx) (dialogtoastlistactivity)), s, s1, arraylist, s2);
    }

    private static void a(String s, String s1, Object obj)
    {
        if (!(obj instanceof JSONObject))
        {
            break MISSING_BLOCK_LABEL_25;
        }
        JSONObject jsonobject = (JSONObject)obj;
        boolean flag;
        try
        {
            jsonobject.put(s, s1);
        }
        catch (JSONException jsonexception)
        {
            Log.e((new StringBuilder()).append(z[21]).append(jsonexception.toString()).toString());
        }
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        flag = obj instanceof StringBuilder;
        if (flag)
        {
            ((StringBuilder)obj).append(s).append(z[22]).append(s1).append('\n');
        }
        return;
        s;
        throw s;
    }

    private static void a(StringBuilder stringbuilder, String s)
    {
        int j = App.am;
        if (s != null)
        {
            int i = 0;
            do
            {
                if (i >= s.length())
                {
                    continue;
                }
                stringbuilder.append(s.charAt(i)).append('.');
                i++;
            } while (j == 0);
        }
        break MISSING_BLOCK_LABEL_42;
        while (true) 
        {
            return;
        }
    }

    public static String b()
    {
        StringBuilder stringbuilder;
        String s = z[34];
        s = z[37];
        stringbuilder = new StringBuilder();
        Object obj1 = new BufferedReader(new FileReader(z[38]));
        stringbuilder.append(((BufferedReader) (obj1)).readLine());
        Object obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj = obj1;
        ((BufferedReader) (obj1)).close();
        obj = obj1;
_L1:
        obj1 = new BufferedReader(new FileReader(z[33]));
        stringbuilder.append(' ').append(((BufferedReader) (obj1)).readLine());
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        ((BufferedReader) (obj1)).close();
_L2:
        return stringbuilder.toString();
        Exception exception;
        exception;
        obj = null;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        ((BufferedReader) (obj)).close();
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            stringbuilder.append(z[35]);
        }
        Log.a(((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
        exception;
        obj1 = obj;
        obj = exception;
_L3:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        ((BufferedReader) (obj1)).close();
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            stringbuilder.append(z[36]);
        }
        Log.a(((Throwable) (obj)));
          goto _L2
        obj;
        throw obj;
        obj;
          goto _L3
        exception;
        obj = obj1;
          goto _L4
    }

    private static String b(int i)
    {
        switch (i)
        {
        default:
            return z[10];

        case 1: // '\001'
            return z[8];

        case 2: // '\002'
            return z[13];

        case 3: // '\003'
            return z[0];

        case 8: // '\b'
            return z[1];

        case 9: // '\t'
            return z[9];

        case 10: // '\n'
            return z[11];

        case 4: // '\004'
            return z[15];

        case 5: // '\005'
            return z[4];

        case 6: // '\006'
            return z[3];

        case 12: // '\f'
            return z[5];

        case 7: // '\007'
            return z[12];

        case 13: // '\r'
            return z[2];

        case 14: // '\016'
            return z[6];

        case 11: // '\013'
            return z[14];

        case 15: // '\017'
            return z[7];
        }
    }

    static 
    {
        Object obj;
        String as[];
        char c;
        int i;
        as = new String[131];
        obj = "teU$";
        c = '\uFFFF';
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
            switch (c)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "i{E'\037";
                i = 1;
                c = '\0';
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "m|D";
                c = '\001';
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "blL6~\f\bD\001\032N\bs\022(\017\b@";
                c = '\002';
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "blL6~\f\bD\001\032N\bs\022(\017\b1";
                c = '\003';
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "blL6~\f\bD\001\032N\bs\022(\017\bC";
                c = '\004';
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "blL6~\f\bd?\fql";
                c = '\005';
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "i{Q6u";
                c = '\006';
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "fxS$";
                c = '\007';
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "i{T'\037";
                c = '\b';
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "tfJ9\021vf";
                c = '\t';
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "i{Q6";
                c = '\n';
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "blL6~\f\b0\017\fu|";
                c = '\013';
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "dlF2";
                c = '\f';
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "HlD9";
                c = '\r';
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "blL6";
                c = '\016';
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "ogO2";
                c = '\017';
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "tfJ9\021vf";
                c = '\020';
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "raQ";
                c = '\021';
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "f{L";
                c = '\022';
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "blL6";
                c = '\023';
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "DE`\0362RMo\023;S\007k\0041O\007d\005,NZ!";
                c = '\024';
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\033\b";
                c = '\025';
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "oG!\0331F\bg\0362D\bu\030~@\\u\026=I\006\013";
                c = '\026';
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "@Fe\0051HL/\0360UMo\003pDPu\005?\017{T5\024dkU";
                c = '\027';
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "@Fe\0051HL/\0360UMo\003pDPu\005?\017{U%\033`e";
                c = '\030';
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "@Xq\0337BIu\0361O\007{\036.";
                c = '\031';
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "@Fe\0051HL/\0360UMo\003p@Ku\0361O\006R2\020ewL\"\022uaQ;\033";
                c = '\032';
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "QD`\0360\016\\d\017*";
                c = '\033';
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "@Fe\0051HL/\0360UMo\003pDPu\005?\017{U%\033`e";
                c = '\034';
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "@Fe\0051HL/\0360UMo\003p@Ku\0361O\006R2\020e";
                c = '\035';
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "@Fe\0051HL/\0360UMo\003pDPu\005?\017mL6\027m";
                c = '\036';
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "@Fe\0051HL/\0360UMo\003pDPu\005?\017|D/\n";
                c = '\037';
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                obj = "\016Xs\030=\016[x\004qJMs\031;M\007w\022,RAn\031";
                c = ' ';
                i = 33;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "\016Xs\030=\016[x\004qJMs\031;M\007n\004,DDd\026-D";
                c = '!';
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "tFj\0311VF!\005;MM`\004;";
                c = '"';
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "\001]o\0340N_oW(DZr\0361O";
                c = '#';
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "\016Xs\030=\016[x\004qJMs\031;M\007w\022,RAn\031";
                c = '$';
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "\016Xs\030=\016[x\004qJMs\031;M\007n\004,DDd\026-D";
                c = '%';
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "ek,%\ndl!";
                c = '&';
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                obj = "uc,9\r\f";
                c = '\'';
                i = 40;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "NZfY?BZ`Y\037bz@";
                c = '(';
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "uc,1\031\f\030!";
                c = ')';
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "o\177, \037q\0050W";
                c = '*';
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "uc,9\016\f";
                c = '+';
                break;

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "ek,9\030nf@W";
                c = ',';
                break;

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 46;
                obj = "gm,!\035\001";
                c = '-';
                break;

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 47;
                obj = "ek,5\037bzLW";
                c = '.';
                break;

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 48;
                obj = "DPb\022.UAn\031~E]s\0360F\bd\032?HD!\0241LXn\0047UAn\031";
                c = '/';
                break;

            case 47: // '/'
                as1[i] = ((String) (obj));
                i = 49;
                obj = "rAl";
                c = '0';
                break;

            case 48: // '0'
                as1[i] = ((String) (obj));
                i = 50;
                obj = "+\"\013}";
                c = '1';
                break;

            case 49: // '1'
                as1[i] = ((String) (obj));
                i = 51;
                obj = "bIs\0057DZ";
                c = '2';
                break;

            case 50: // '2'
                as1[i] = ((String) (obj));
                i = 52;
                obj = "bkn\023;";
                c = '3';
                break;

            case 51: // '3'
                as1[i] = ((String) (obj));
                i = 53;
                obj = "n{";
                c = '4';
                break;

            case 52: // '4'
                as1[i] = ((String) (obj));
                i = 54;
                obj = "tfJ9\021vf!_0N\bu\0222DXi\0300X\bl\0260@Od\005w";
                c = '5';
                break;

            case 53: // '5'
                as1[i] = ((String) (obj));
                i = 55;
                obj = "@Ku\036(D";
                c = '6';
                break;

            case 54: // '6'
                as1[i] = ((String) (obj));
                i = 56;
                obj = "B@o\0023\001";
                c = '7';
                break;

            case 55: // '7'
                as1[i] = ((String) (obj));
                i = 57;
                obj = "eAr\003,HJt\0037NF";
                c = '8';
                break;

            case 56: // '8'
                as1[i] = ((String) (obj));
                i = 58;
                obj = "Q@";
                c = '9';
                break;

            case 57: // '9'
                as1[i] = ((String) (obj));
                i = 59;
                obj = "oMu\0001SC!#'QM";
                c = ':';
                break;

            case 58: // ':'
                as1[i] = ((String) (obj));
                i = 60;
                obj = "\023\0060Fp\024\0330";
                c = ';';
                break;

            case 59: // ';'
                as1[i] = ((String) (obj));
                i = 61;
                obj = "raLW\023bk,:\020b";
                c = '<';
                break;

            case 60: // '<'
                as1[i] = ((String) (obj));
                i = 62;
                obj = "DPq\036,@\\h\0300~L`\003;";
                c = '=';
                break;

            case 61: // '='
                as1[i] = ((String) (obj));
                i = 63;
                obj = "o\007@WvOG!\003;MMq\0371OQ!\032?OIf\022,\b";
                c = '>';
                break;

            case 62: // '>'
                as1[i] = ((String) (obj));
                i = 64;
                obj = "uIs\020;U";
                c = '?';
                break;

            case 63: // '?'
                as1[i] = ((String) (obj));
                i = 65;
                obj = "DE`\0362\016Ft\032<DZ.\003,HE.\022,SGs";
                c = '@';
                break;

            case 64: // '@'
                as1[i] = ((String) (obj));
                i = 66;
                obj = "bGo\003;Y\\";
                c = 'A';
                break;

            case 65: // 'A'
                as1[i] = ((String) (obj));
                i = 67;
                obj = "TFs\0229H[u\022,DL";
                c = 'B';
                break;

            case 66: // 'B'
                as1[i] = ((String) (obj));
                i = 68;
                obj = "bGo\031;B\\h\0300";
                c = 'C';
                break;

            case 67: // 'C'
                as1[i] = ((String) (obj));
                i = 69;
                obj = "BK";
                c = 'D';
                break;

            case 68: // 'D'
                as1[i] = ((String) (obj));
                i = 70;
                obj = "eMc\0029\001Ao\0211";
                c = 'E';
                break;

            case 69: // 'E'
                as1[i] = ((String) (obj));
                i = 71;
                obj = "rGb\034;U\bB\0300O";
                c = 'F';
                break;

            case 70: // 'F'
                as1[i] = ((String) (obj));
                i = 72;
                obj = "mk";
                c = 'G';
                break;

            case 71: // 'G'
                as1[i] = ((String) (obj));
                i = 73;
                obj = "eMw\036=D";
                c = 'H';
                break;

            case 72: // 'H'
                as1[i] = ((String) (obj));
                i = 74;
                obj = "UGj\0220\001[`\001;E";
                c = 'I';
                break;

            case 73: // 'I'
                as1[i] = ((String) (obj));
                i = 75;
                obj = "SMm\022?RM";
                c = 'J';
                break;

            case 74: // 'J'
                as1[i] = ((String) (obj));
                i = 76;
                obj = "o\007@";
                c = 'K';
                break;

            case 75: // 'K'
                as1[i] = ((String) (obj));
                i = 77;
                obj = "VMc\0047UM";
                c = 'L';
                break;

            case 76: // 'L'
                as1[i] = ((String) (obj));
                i = 78;
                obj = "VMc\0047UM";
                c = 'M';
                break;

            case 77: // 'M'
                as1[i] = ((String) (obj));
                i = 79;
                obj = "eMr\024,HXu\0361O";
                c = 'N';
                break;

            case 78: // 'N'
                as1[i] = ((String) (obj));
                i = 80;
                obj = "TFj\0311VF";
                c = 'O';
                break;

            case 79: // 'O'
                as1[i] = ((String) (obj));
                i = 81;
                obj = "\f\005R\002.QGs\003~hFg\030s\f\"";
                c = 'P';
                break;

            case 80: // 'P'
                as1[i] = ((String) (obj));
                i = 82;
                obj = "eA`\0200N[u\036=\001kn\023;R";
                c = 'Q';
                break;

            case 81: // 'Q'
                as1[i] = ((String) (obj));
                i = 83;
                obj = "dPq";
                c = 'R';
                break;

            case 82: // 'R'
                as1[i] = ((String) (obj));
                i = 84;
                obj = "sIe\0361\001eB4slfB";
                c = 'S';
                break;

            case 83: // 'S'
                as1[i] = ((String) (obj));
                i = 85;
                obj = "q@n\031;\001|x\007;";
                c = 'T';
                break;

            case 84: // 'T'
                as1[i] = ((String) (obj));
                i = 86;
                obj = "XQx\016sle,\023:\001`IM3L\022r\004pr{R-";
                c = 'U';
                break;

            case 85: // 'U'
                as1[i] = ((String) (obj));
                i = 87;
                obj = "lIo\0028@Ku\002,DZ";
                c = 'V';
                break;

            case 86: // 'V'
                as1[i] = ((String) (obj));
                i = 88;
                obj = "jMs\031;M";
                c = 'W';
                break;

            case 87: // 'W'
                as1[i] = ((String) (obj));
                i = 89;
                obj = "wMs\0047NF";
                c = 'X';
                break;

            case 88: // 'X'
                as1[i] = ((String) (obj));
                i = 90;
                obj = "SMm\022?RM";
                c = 'Y';
                break;

            case 89: // 'Y'
                as1[i] = ((String) (obj));
                i = 91;
                obj = "q\177";
                c = 'Z';
                break;

            case 90: // 'Z'
                as1[i] = ((String) (obj));
                i = 92;
                obj = "[R";
                c = '[';
                break;

            case 91: // '['
                as1[i] = ((String) (obj));
                i = 93;
                obj = "vMcW-D[r\0361O";
                c = '\\';
                break;

            case 92: // '\\'
                as1[i] = ((String) (obj));
                obj = "+\"\013}%ZMl\0267Mwd\017=DXu\0361OU|}";
                c = ']';
                i = 94;
                break;

            case 93: // ']'
                as1[i] = ((String) (obj));
                i = 95;
                obj = "vMcW-D[r\0361O";
                c = '^';
                break;

            case 94: // '^'
                as1[i] = ((String) (obj));
                i = 96;
                obj = "lGe\0222";
                c = '_';
                break;

            case 95: // '_'
                as1[i] = ((String) (obj));
                i = 97;
                obj = "c]h\033:";
                c = '`';
                break;

            case 96: // '`'
                as1[i] = ((String) (obj));
                i = 98;
                obj = "MAg\022*HEd";
                c = 'a';
                break;

            case 97: // 'a'
                as1[i] = ((String) (obj));
                i = 99;
                obj = "\001\0";
                c = 'b';
                break;

            case 98: // 'b'
                as1[i] = ((String) (obj));
                i = 100;
                obj = "qZn\023+B\\";
                c = 'c';
                break;

            case 99: // 'c'
                as1[i] = ((String) (obj));
                i = 101;
                obj = "o\007@";
                c = 'd';
                break;

            case 100: // 'd'
                as1[i] = ((String) (obj));
                i = 102;
                obj = "rk./\035";
                c = 'e';
                break;

            case 101: // 'e'
                as1[i] = ((String) (obj));
                i = 103;
                obj = "mo";
                c = 'f';
                break;

            case 102: // 'f'
                as1[i] = ((String) (obj));
                i = 104;
                obj = "TFj\0311VF";
                c = 'g';
                break;

            case 103: // 'g'
                as1[i] = ((String) (obj));
                i = 105;
                obj = "o\007@WvOG!\003;MMq\0371OQ!\032?OIf\022,\b";
                c = 'h';
                break;

            case 104: // 'h'
                as1[i] = ((String) (obj));
                i = 106;
                obj = "tfJ9\021vf!_0N\bu\0222DXi\0300X\bl\0260@Od\005w";
                c = 'i';
                break;

            case 105: // 'i'
                as1[i] = ((String) (obj));
                i = 107;
                obj = "tx";
                c = 'j';
                break;

            case 106: // 'j'
                as1[i] = ((String) (obj));
                i = 108;
                obj = "tfJ9\021vf!_0N\bu\0222DXi\0300X\bl\0260@Od\005w";
                c = 'k';
                break;

            case 107: // 'k'
                as1[i] = ((String) (obj));
                i = 109;
                obj = "BGlY)IIu\004?QX^\007,DNd\005;OKd\004";
                c = 'l';
                break;

            case 108: // 'l'
                as1[i] = ((String) (obj));
                i = 110;
                obj = "\023\0060Fp\024\0330";
                c = 'm';
                break;

            case 109: // 'm'
                as1[i] = ((String) (obj));
                i = 111;
                obj = "Q@n\031;";
                c = 'n';
                break;

            case 110: // 'n'
                as1[i] = ((String) (obj));
                i = 112;
                obj = "[R";
                c = 'o';
                break;

            case 111: // 'o'
                as1[i] = ((String) (obj));
                i = 113;
                obj = "ef";
                c = 'p';
                break;

            case 112: // 'p'
                as1[i] = ((String) (obj));
                i = 114;
                obj = "eMw\036=D\bH$\021\031\0361F";
                c = 'q';
                break;

            case 113: // 'q'
                as1[i] = ((String) (obj));
                i = 115;
                obj = "rMs\001;S";
                c = 'r';
                break;

            case 114: // 'r'
                as1[i] = ((String) (obj));
                i = 116;
                obj = "lAr\003'QMe";
                c = 's';
                break;

            case 115: // 's'
                as1[i] = ((String) (obj));
                i = 117;
                obj = "BGo\031;B\\h\0017UQ";
                c = 't';
                break;

            case 116: // 't'
                as1[i] = ((String) (obj));
                i = 118;
                obj = "\001\0";
                c = 'u';
                break;

            case 117: // 'u'
                as1[i] = ((String) (obj));
                i = 119;
                obj = "ogO2";
                c = 'v';
                break;

            case 118: // 'v'
                as1[i] = ((String) (obj));
                i = 120;
                obj = "@Fe\0051HL/\0360UMo\003pDPu\005?\017aO>\nhiM(\027o|D9\nr";
                c = 'w';
                break;

            case 119: // 'w'
                as1[i] = ((String) (obj));
                i = 121;
                obj = "FE";
                c = 'x';
                break;

            case 120: // 'x'
                as1[i] = ((String) (obj));
                i = 122;
                obj = "DE`\0362\f[d\031:DZ.\026.Q\b";
                c = 'y';
                break;

            case 121: // 'y'
                as1[i] = ((String) (obj));
                i = 123;
                obj = "\001T!";
                c = 'z';
                break;

            case 122: // 'z'
                as1[i] = ((String) (obj));
                i = 124;
                obj = "XIo\023;Y\006l\0267M";
                c = '{';
                break;

            case 123: // '{'
                as1[i] = ((String) (obj));
                i = 125;
                obj = "G[b\034pJ\021";
                c = '|';
                break;

            case 124: // '|'
                as1[i] = ((String) (obj));
                i = 126;
                obj = "@Fe\0051HL/\032?HD";
                c = '}';
                break;

            case 125: // '}'
                as1[i] = ((String) (obj));
                i = 127;
                obj = "IGu\032?HD";
                c = '~';
                break;

            case 126: // '~'
                as1[i] = ((String) (obj));
                i = 128;
                obj = "LIh\033:SGh\023";
                c = '\177';
                break;

            case 127: // '\177'
                as1[i] = ((String) (obj));
                i = 129;
                obj = "BGlY<@Qe\0360\017Jn\0303DZ`\0319";
                c = '\200';
                break;

            case 128: 
                as1[i] = ((String) (obj));
                i = 130;
                obj = "DE`\0362";
                c = '\201';
                break;

            case 129: 
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 2968
    //                   0 2991
    //                   1 2998
    //                   2 3005
    //                   3 3011;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_3011;
_L3:
        byte byte0 = 94;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 33;
          goto _L9
_L5:
        byte0 = 40;
          goto _L9
_L6:
        byte0 = 1;
          goto _L9
        byte0 = 119;
          goto _L9
    }
}
