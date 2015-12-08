// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.sessionm.core.Session;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a
{

    public static final String TAG = "SessionM.CPI";
    private static final String fA = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private static final String fB = "com.google.android.gms.common.GooglePlayServicesUtil";
    private static final String fC = "iso-8859-1";
    public static final int fD = 0;
    public static final String fE = "advertisingId";
    public static final String fF = "isLimitAdTrackingEnabled";
    public static final String fG = "com.sessionm.google_play_services";
    private static String fH = "";
    private static boolean fI = false;
    private static final String fz = "getAdvertisingIdInfo";

    public a()
    {
    }

    public static String a(byte abyte0[])
    {
        StringBuilder stringbuilder;
        int i;
        int l;
        stringbuilder = new StringBuilder();
        l = abyte0.length;
        i = 0;
_L2:
        int j;
        int k;
        byte byte0;
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = abyte0[i];
        k = byte0 >>> 4 & 0xf;
        j = 0;
_L3:
        if (k >= 0 && k <= 9)
        {
            stringbuilder.append((char)(k + 48));
        } else
        {
            stringbuilder.append((char)((k - 10) + 97));
        }
        if (j < 1)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return stringbuilder.toString();
        j++;
        k = byte0 & 0xf;
          goto _L3
    }

    public static boolean aH()
    {
        return fI;
    }

    private static void aI()
    {
        Object obj = Session.D().getApplicationContext();
        if (obj != null)
        {
            if ((obj = ((Context) (obj)).getSharedPreferences("com.sessionm.google_play_services", 0)) != null && !fH.isEmpty())
            {
                obj = ((SharedPreferences) (obj)).edit();
                ((android.content.SharedPreferences.Editor) (obj)).putString("advertisingId", fH);
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("isLimitAdTrackingEnabled", fI);
                ((android.content.SharedPreferences.Editor) (obj)).commit();
                return;
            }
        }
    }

    public static String c(String s1, String s2)
    {
        String s3;
        String s4;
label0:
        {
            s4 = "";
            if (s1 == null || s1.length() == 0)
            {
                if (Log.isLoggable("SessionM.CPI", 6))
                {
                    Log.e("SessionM.CPI", "type was not provided for getSystemIdentifiers call!");
                }
                return "";
            }
            if (s2 != null)
            {
                s3 = s2;
                if (s2.length() != 0)
                {
                    break label0;
                }
            }
            s3 = "none";
        }
        Context context = Session.D().getApplicationContext();
        if (s1.equalsIgnoreCase("gpadvertiserid") && s(context))
        {
            s2 = fH;
        } else
        {
            s2 = s4;
            if (s1.equalsIgnoreCase("androiddeviceid"))
            {
                s2 = s4;
                if (!s(context))
                {
                    s2 = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
                }
            }
        }
        s4 = d(s2, s3);
        if (Log.isLoggable("SessionM.CPI", 3))
        {
            if (!s4.equals(""))
            {
                Log.d("SessionM.CPI", String.format("Retrieved id with type: %s algorithm: %s id: %s", new Object[] {
                    s1, s3, s2
                }));
            } else
            {
                Log.d("SessionM.CPI", String.format("Failed to retrieved id! Type: %s Algorithm: %s Id: %s", new Object[] {
                    s1, s3, s2
                }));
            }
        }
        return s4;
    }

    public static String d(String s1, String s2)
    {
        String s3 = s1;
        if (s2.equalsIgnoreCase("none"))
        {
            break MISSING_BLOCK_LABEL_48;
        }
        s3 = s1;
        if (!s1.isEmpty())
        {
            s2 = MessageDigest.getInstance(s2);
            s2.update(s1.getBytes("iso-8859-1"), 0, s1.length());
            s3 = a(s2.digest());
        }
_L2:
        return s3;
        s2;
        s3 = s1;
        if (Log.isLoggable("SessionM.CPI", 6))
        {
            Log.e("SessionM.CPI", (new StringBuilder()).append("error hashing id ").append(s2).toString());
            return s1;
        }
        continue; /* Loop/switch isn't completed */
        s2;
        s3 = s1;
        if (Log.isLoggable("SessionM.CPI", 6))
        {
            Log.e("SessionM.CPI", (new StringBuilder()).append("error hashing id ").append(s2).toString());
            return s1;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String p(Context context)
    {
        try
        {
            Class class1 = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            context = ((Context) (class1.getMethod("getAdvertisingIdInfo", new Class[] {
                android/content/Context
            }).invoke(class1.getClass(), new Object[] {
                context
            })));
            context = (String)context.getClass().getMethod("getId", new Class[0]).invoke(context, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (Log.isLoggable("SessionM.CPI", 6))
            {
                Log.e("SessionM.CPI", "Error retrieving advertiser id: ", context);
            }
            context = "";
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (Log.isLoggable("SessionM.CPI", 6))
            {
                Log.e("SessionM.CPI", "Error retrieving advertiser id: ", context);
            }
            context = "";
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (Log.isLoggable("SessionM.CPI", 6))
            {
                Log.e("SessionM.CPI", "Error retrieving advertiser id: ", context);
            }
            context = "";
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (Log.isLoggable("SessionM.CPI", 6))
            {
                Log.e("SessionM.CPI", "Error retrieving advertiser id: ", context);
            }
            context = "";
        }
        if (!context.isEmpty())
        {
            fH = context;
        }
        return context;
    }

    private static boolean q(Context context)
    {
        boolean flag;
        try
        {
            Class class1 = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            context = ((Context) (class1.getMethod("getAdvertisingIdInfo", new Class[] {
                android/content/Context
            }).invoke(class1.getClass(), new Object[] {
                context
            })));
            flag = ((Boolean)context.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(context, new Object[0])).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (Log.isLoggable("SessionM.CPI", 6))
            {
                Log.d("SessionM.CPI", "Error retrieving ad tracking limited: ", context);
            }
            flag = false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (Log.isLoggable("SessionM.CPI", 6))
            {
                Log.d("SessionM.CPI", "Error retrieving ad tracking limited: ", context);
            }
            flag = false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (Log.isLoggable("SessionM.CPI", 6))
            {
                Log.d("SessionM.CPI", "Error retrieving ad tracking limited: ", context);
            }
            flag = false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (Log.isLoggable("SessionM.CPI", 6))
            {
                Log.d("SessionM.CPI", "Error retrieving ad tracking limited: ", context);
            }
            flag = false;
        }
        fI = flag;
        return flag;
    }

    public static void r(Context context)
    {
        if (s(context))
        {
            int i = 3;
            String s1;
            for (s1 = ""; i > 0 && s1.isEmpty(); i--)
            {
                s1 = p(context);
                q(context);
            }

            if (s1.isEmpty())
            {
                context = context.getSharedPreferences("com.sessionm.google_play_services", 0);
                if (context != null)
                {
                    fH = context.getString("advertisingId", s1);
                    fI = context.getBoolean("isLimitAdTrackingEnabled", false);
                }
            }
            aI();
        }
    }

    public static boolean s(Context context)
    {
        boolean flag = false;
        Class class1 = Class.forName("com.google.android.gms.common.GooglePlayServicesUtil");
        context = ((Context) (class1.getMethod("isGooglePlayServicesAvailable", new Class[] {
            android/content/Context
        }).invoke(class1.getClass(), new Object[] {
            context
        })));
        if (context == null) goto _L2; else goto _L1
_L1:
        int i = ((Integer)context).intValue();
        if (i != 0) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        return flag;
_L2:
        flag = false;
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
        context;
        if (Log.isLoggable("SessionM.CPI", 6))
        {
            Log.e("SessionM.CPI", "Error fetching Google Play services availability info: ", context);
            return false;
        }
        continue; /* Loop/switch isn't completed */
        context;
        if (Log.isLoggable("SessionM.CPI", 6))
        {
            Log.e("SessionM.CPI", "Error fetching Google Play services availability info: ", context);
            return false;
        }
        continue; /* Loop/switch isn't completed */
        context;
        if (Log.isLoggable("SessionM.CPI", 6))
        {
            Log.e("SessionM.CPI", "Error fetching Google Play services availability info: ", context);
            return false;
        }
        continue; /* Loop/switch isn't completed */
        context;
        if (Log.isLoggable("SessionM.CPI", 6))
        {
            Log.e("SessionM.CPI", "Error fetching Google Play services availability info: ", context);
            return false;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        fI = false;
    }
}
