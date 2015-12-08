// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.common.fromguava.a;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            aj, ak

public final class Util
{

    public static final String a = m.a(0, 3);
    private static volatile SecureRandom b;

    public static long a(long l)
    {
        return l / 0x100000L;
    }

    public static StartupType a(String s, SharedPreferences sharedpreferences)
    {
        String s1 = sharedpreferences.getString("AnalyticsYouTubeApplicationVersion", null);
        sharedpreferences.edit().putString("AnalyticsYouTubeApplicationVersion", s).apply();
        if (s1 == null)
        {
            return StartupType.FIRST_STARTUP;
        }
        if (s1.equals(s))
        {
            return StartupType.NORMAL_STARTUP;
        } else
        {
            return StartupType.UPGRADE_STARTUP;
        }
    }

    public static String a(int i)
    {
        byte abyte0[] = new byte[9];
        b().nextBytes(abyte0);
        return Base64.encodeToString(abyte0, 10);
    }

    public static String a(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        String s;
        if (context != null)
        {
            context = context.getNetworkCountryIso();
        } else
        {
            context = null;
        }
        if (TextUtils.isEmpty(context))
        {
            context = Locale.getDefault().getCountry();
        }
        s = context.trim().replace(",", "");
        context = s;
        if (s.length() > 2)
        {
            context = s.substring(0, 2);
        }
        return context.toUpperCase(Locale.US);
    }

    public static String a(Context context, String s, String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(context.getPackageName());
        stringbuilder.append('/');
        stringbuilder.append(s);
        stringbuilder.append("(Linux; U; Android ");
        stringbuilder.append(android.os.Build.VERSION.RELEASE);
        stringbuilder.append("; ");
        stringbuilder.append(Locale.getDefault().toString());
        context = Build.MODEL;
        if (context.length() > 0)
        {
            stringbuilder.append("; ");
            stringbuilder.append(context);
        }
        context = Build.ID;
        if (context.length() > 0)
        {
            stringbuilder.append(" Build/");
            stringbuilder.append(context);
        }
        stringbuilder.append(')');
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(" Experiment/");
            stringbuilder.append(s1);
        }
        return stringbuilder.toString();
    }

    public static String a(Uri uri)
    {
        if (uri == null)
        {
            return null;
        }
        for (uri = uri.getPathSegments().iterator(); uri.hasNext();)
        {
            if ("videos".equals((String)uri.next()))
            {
                if (uri.hasNext())
                {
                    return (String)uri.next();
                } else
                {
                    return null;
                }
            }
        }

        return null;
    }

    public static String a(String s, int i, String s1)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "maxLength must be non-negative");
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        if (s != null)
        {
            s1 = s;
        }
        s1 = s1.replaceAll("[<>]", "");
        s = s1;
        if (i >= 0)
        {
            s = s1;
            if (s1.length() > i)
            {
                s = s1.substring(0, i);
            }
        }
        return c(s);
    }

    public static transient String a(String as[])
    {
        return (new StringBuilder("oauth2:")).append(TextUtils.join(" ", as)).toString();
    }

    public static Throwable a(Throwable throwable)
    {
        for (; throwable.getCause() != null; throwable = throwable.getCause()) { }
        return throwable;
    }

    public static SimpleDateFormat a()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpledateformat;
    }

    public static Date a(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        Date date = a().parse(s);
        return date;
        ParseException parseexception;
        parseexception;
        String s2 = s;
        String s1;
        int i;
        try
        {
            i = s.length() - 3;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            L.e((new StringBuilder("Invalid RFC3339 date: ")).append(s2).toString());
            return null;
        }
        s1 = s;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        s1 = s;
        s2 = s;
        if (s.charAt(i) != ':')
        {
            break MISSING_BLOCK_LABEL_77;
        }
        s2 = s;
        s1 = (new StringBuilder()).append(s.substring(0, i)).append(s.substring(i + 1)).toString();
        s2 = s1;
        s = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.US)).parse(s1);
        return s;
    }

    public static void a(InputStream inputstream, OutputStream outputstream)
    {
        com.google.android.apps.youtube.common.fromguava.a.a(inputstream, outputstream);
    }

    public static void a(int ai[], int i, int j)
    {
        Random random = b();
        if (ai != null && random != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k = Math.max(1, 0);
        if (j >= 0 && k < j)
        {
            i = ai.length;
            if (i != 0 && k < i)
            {
                i = Math.min(j, i) - k - 1;
                while (i >= 0) 
                {
                    j = i + k;
                    int l = random.nextInt(i + 1) + k;
                    int i1 = ai[j];
                    ai[j] = ai[l];
                    ai[l] = i1;
                    i--;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static boolean a(Bundle bundle, Bundle bundle1)
    {
label0:
        {
            if (bundle == null || bundle1 == null)
            {
                return bundle == null && bundle1 == null;
            }
            if (bundle.size() != bundle1.size())
            {
                return false;
            }
            Iterator iterator = bundle.keySet().iterator();
            Object obj;
            Object obj1;
label1:
            do
            {
                do
                {
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        String s = (String)iterator.next();
                        obj = bundle.get(s);
                        obj1 = bundle1.get(s);
                        if (obj == null)
                        {
                            if (obj1 != null || !bundle1.containsKey(s))
                            {
                                return false;
                            }
                            continue;
                        }
                        if (!(obj instanceof Bundle) || !(obj1 instanceof Bundle))
                        {
                            break;
                        }
                        if (!a((Bundle)obj, (Bundle)obj1))
                        {
                            return false;
                        }
                    } while (true);
                    if (!(obj instanceof byte[]) || !(obj1 instanceof byte[]))
                    {
                        continue label1;
                    }
                } while (Arrays.equals((byte[])obj, (byte[])obj1));
                return false;
            } while (obj.equals(obj1));
            return false;
        }
        return true;
    }

    public static byte[] a(Bitmap bitmap)
    {
        return a(bitmap, android.graphics.Bitmap.CompressFormat.JPEG, 80);
    }

    public static byte[] a(Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat, int i)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(compressformat, 80, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] a(String s, int i)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(1024);
        GZIPOutputStream gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
        gzipoutputstream.write(s.getBytes());
        gzipoutputstream.close();
        s = bytearrayoutputstream.toByteArray();
        bytearrayoutputstream.close();
        return s;
    }

    public static byte[] a(byte abyte0[])
    {
        com/google/android/apps/youtube/core/utils/aj;
        JVM INSTR monitorenter ;
        abyte0 = com.google.android.apps.youtube.core.utils.aj.a.digest(abyte0);
        com/google/android/apps/youtube/core/utils/aj;
        JVM INSTR monitorexit ;
        return abyte0;
        abyte0;
        throw abyte0;
    }

    public static String b(Uri uri)
    {
        if (uri == null)
        {
            return null;
        }
        for (uri = uri.getPathSegments().iterator(); uri.hasNext();)
        {
            if ("playlists".equals((String)uri.next()))
            {
                if (uri.hasNext())
                {
                    return (String)uri.next();
                } else
                {
                    return null;
                }
            }
        }

        return null;
    }

    public static String b(String s)
    {
        com/google/android/apps/youtube/core/utils/aj;
        JVM INSTR monitorenter ;
        s = new String(com.google.android.apps.youtube.core.utils.aj.a.digest(s.getBytes()));
        com/google/android/apps/youtube/core/utils/aj;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public static String b(String s, int i, String s1)
    {
        if (!TextUtils.isEmpty(s))
        {
            s1 = new StringBuilder();
            s = new StringTokenizer(s.trim().replaceAll("[<>]", "").replaceAll("\\s+", ","), ",;");
            do
            {
                if (!s.hasMoreTokens())
                {
                    break;
                }
                String s2 = s.nextToken();
                i = s2.length();
                if (2 <= i && i <= 30 && i + s1.length() < 500)
                {
                    s1.append(",").append(s2);
                }
            } while (true);
            return c(s1.toString());
        } else
        {
            return a(((String) (null)), 500, s1);
        }
    }

    private static Random b()
    {
        if (b == null)
        {
            b = new SecureRandom();
        }
        return b;
    }

    public static boolean b(Context context)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            flag = flag1;
            if (context == null)
            {
                break label0;
            }
            int i = context.getIntExtra("plugged", -1);
            if (i != 1)
            {
                flag = flag1;
                if (i != 2)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public static byte[] b(byte abyte0[])
    {
        com/google/android/apps/youtube/core/utils/Util;
        JVM INSTR monitorenter ;
        com/google/android/apps/youtube/core/utils/ak;
        JVM INSTR monitorenter ;
        abyte0 = com.google.android.apps.youtube.core.utils.ak.a.digest(abyte0);
        com/google/android/apps/youtube/core/utils/ak;
        JVM INSTR monitorexit ;
        com/google/android/apps/youtube/core/utils/Util;
        JVM INSTR monitorexit ;
        return abyte0;
        abyte0;
        com/google/android/apps/youtube/core/utils/ak;
        JVM INSTR monitorexit ;
        throw abyte0;
        abyte0;
        com/google/android/apps/youtube/core/utils/Util;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    private static String c(String s)
    {
        return s.replace("&", "&amp;");
    }

    public static String c(byte abyte0[])
    {
        abyte0 = (new Scanner(new GZIPInputStream(new ByteArrayInputStream(abyte0)))).useDelimiter("\\A");
        if (abyte0.hasNext())
        {
            return abyte0.next();
        } else
        {
            return "";
        }
    }

    public static boolean c(Context context)
    {
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        if (context == null)
        {
            return false;
        }
        return Math.min(context.getWidth(), context.getHeight()) <= 359;
    }

    public static boolean d(Context context)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        return ((ActivityManager)context.getSystemService("activity")).getLargeMemoryClass() >= 128;
    }


    private class StartupType extends Enum
    {

        private static final StartupType $VALUES[];
        public static final StartupType FIRST_STARTUP;
        public static final StartupType NORMAL_STARTUP;
        public static final StartupType UPGRADE_STARTUP;

        public static StartupType valueOf(String s)
        {
            return (StartupType)Enum.valueOf(com/google/android/apps/youtube/core/utils/Util$StartupType, s);
        }

        public static StartupType[] values()
        {
            return (StartupType[])$VALUES.clone();
        }

        static 
        {
            NORMAL_STARTUP = new StartupType("NORMAL_STARTUP", 0);
            FIRST_STARTUP = new StartupType("FIRST_STARTUP", 1);
            UPGRADE_STARTUP = new StartupType("UPGRADE_STARTUP", 2);
            $VALUES = (new StartupType[] {
                NORMAL_STARTUP, FIRST_STARTUP, UPGRADE_STARTUP
            });
        }

        private StartupType(String s, int i)
        {
            super(s, i);
        }
    }

}
