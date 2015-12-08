// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.youtube.p;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            PackageUtil, ai

public final class m
{

    private static final Uri a = Uri.parse("http://youtube.com/my_purchases");
    private static final Uri b = Uri.parse("http://play.google.com/store/");

    private static Intent a(Context context, String s, String s1)
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        String s2 = context.getString(p.fA, new Object[] {
            s
        });
        context = context.getString(p.fB, new Object[] {
            s, s1
        });
        intent.putExtra("android.intent.extra.SUBJECT", s2);
        intent.putExtra("android.intent.extra.TEXT", context);
        intent.setFlags(0x80000);
        return intent;
    }

    public static String a(Context context, int i)
    {
        Object obj = Locale.getDefault();
        String s = ((Locale) (obj)).getLanguage();
        obj = ((Locale) (obj)).getCountry().toLowerCase(Locale.US);
        return context.getResources().getString(i, new Object[] {
            s, obj
        });
    }

    public static String a(Context context, int i, String s)
    {
        Object obj = Locale.getDefault();
        String s1 = ((Locale) (obj)).getLanguage();
        obj = ((Locale) (obj)).getCountry().toLowerCase();
        int j = PackageUtil.g(context);
        return context.getResources().getString(i, new Object[] {
            s1, obj, s, Integer.valueOf(j)
        });
    }

    public static String a(Context context, String s, int i)
    {
        Object obj = Locale.getDefault();
        String s1 = ((Locale) (obj)).getLanguage();
        obj = ((Locale) (obj)).getCountry().toLowerCase(Locale.US);
        return context.getResources().getString(i, new Object[] {
            s, s1, obj
        });
    }

    public static void a(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT", null);
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[] {
                "video/*"
            });
            intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
            intent.setType("video/*");
            intent.addCategory("android.intent.category.OPENABLE");
            activity.startActivityForResult(intent, 901);
            return;
        } else
        {
            Intent intent1 = new Intent("android.intent.action.GET_CONTENT", null);
            intent1.putExtra("android.intent.extra.LOCAL_ONLY", true);
            intent1.setType("video/*");
            intent1.addCategory("android.intent.category.OPENABLE");
            activity.startActivityForResult(intent1, 901);
            return;
        }
    }

    public static void a(Activity activity, Uri uri)
    {
        b(activity, (new ai(activity.getContentResolver())).a(uri));
    }

    public static void a(Activity activity, String s, String s1)
    {
        c.a(true);
        String s2 = s;
        if (!TextUtils.isEmpty(s))
        {
            s2 = s;
            if (s.length() > 50)
            {
                s2 = (new StringBuilder()).append(s.subSequence(0, 49)).append("\u2026").toString();
            }
        }
        s = com.google.android.apps.youtube.common.e.p.d(s1);
        if (!TextUtils.isEmpty(s))
        {
            activity.startActivity(Intent.createChooser(a(((Context) (activity)), s2, s), activity.getText(p.fy)));
            return;
        } else
        {
            L.c("Share video error: null watch uri");
            return;
        }
    }

    public static void a(Activity activity, String s, String s1, String s2, String s3)
    {
        c.a(activity);
        Uri uri = b.buildUpon().appendEncodedPath("apps").appendEncodedPath("details").appendQueryParameter("id", "com.google.android.apps.youtube").build();
        StringBuilder stringbuilder = new StringBuilder();
        String s4 = "";
        if (!TextUtils.isEmpty(s))
        {
            stringbuilder.append("");
            s4 = "&";
            stringbuilder.append((new StringBuilder("utm_source=")).append(s).toString());
        }
        s = s4;
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(s4);
            s = "&";
            stringbuilder.append((new StringBuilder("utm_medium=")).append(s1).toString());
        }
        s4 = s;
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(s);
            s4 = "&";
            stringbuilder.append((new StringBuilder("utm_campaign=")).append(s2).toString());
        }
        if (!TextUtils.isEmpty(s3))
        {
            stringbuilder.append(s4);
            stringbuilder.append((new StringBuilder("utm_term=")).append(s3).toString());
        }
        s = stringbuilder.toString();
        if (!TextUtils.isEmpty(s))
        {
            s = uri.buildUpon().appendQueryParameter("referrer", Uri.encode(s)).build();
        } else
        {
            s = uri;
        }
        s = new Intent("android.intent.action.VIEW", s);
        if (!a(((Context) (activity)), ((Intent) (s))))
        {
            break MISSING_BLOCK_LABEL_279;
        }
        activity.startActivity(s);
        return;
        activity;
    }

    public static void a(Context context, Uri uri)
    {
        uri = new Intent("android.intent.action.VIEW", uri);
        uri.setPackage("com.google.android.apps.youtube");
        if (!a(context, ((Intent) (uri))))
        {
            uri.setPackage(null);
        }
        b(context, uri);
    }

    public static void a(Context context, String s, WatchFeature watchfeature)
    {
        if (TextUtils.isEmpty(s))
        {
            L.c("Watch video error: null videoId");
            return;
        }
        s = new Intent("android.intent.action.VIEW", Uri.parse(com.google.android.apps.youtube.common.e.p.e(s)));
        s.setPackage("com.google.android.apps.youtube");
        if (a(context, ((Intent) (s)))) goto _L2; else goto _L1
_L1:
        s.setPackage(null);
_L4:
        b(context, s);
        return;
_L2:
        if (watchfeature != null)
        {
            s.putExtra("feature", watchfeature.ordinal());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(Activity activity, int i, int j, Intent intent)
    {
        i;
        JVM INSTR tableswitch 900 902: default 28
    //                   900 30
    //                   901 30
    //                   902 28;
           goto _L1 _L2 _L2 _L1
_L1:
        return false;
_L2:
        if (j == -1)
        {
            Uri uri = intent.getData();
            if (uri == null)
            {
                L.c((new StringBuilder("No Uri on upload video intent:")).append(intent).toString());
                return false;
            }
            if (TextUtils.isEmpty(activity.getContentResolver().getType(uri)))
            {
                L.c((new StringBuilder("No mime-type on upload video intent:")).append(intent).toString());
                return false;
            } else
            {
                activity.startActivityForResult(new Intent("com.google.android.youtube.intent.action.UPLOAD", intent.getData()), 902);
                return true;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static boolean a(Context context)
    {
        if (Build.MANUFACTURER != null && Build.MANUFACTURER.equalsIgnoreCase("samsung"))
        {
            try
            {
                context.getPackageManager().getApplicationInfo("com.sec.android.app.launcher", 8192);
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                Intent intent = new Intent();
                intent.setData(Uri.parse("samsungapps://MainPage/"));
                intent.setFlags(0x14000020);
                return a(context, intent);
            }
            return true;
        } else
        {
            return false;
        }
    }

    private static boolean a(Context context, Intent intent)
    {
        context = context.getPackageManager().queryIntentActivities(intent, 0x10000);
        return context != null && !context.isEmpty();
    }

    public static void b(Activity activity, Uri uri)
    {
        uri = new Intent("android.intent.action.VIEW", uri);
        uri.setPackage("com.android.chrome");
        if (!a(activity, uri))
        {
            uri.setPackage("com.android.browser");
            if (!a(activity, uri))
            {
                return;
            }
        }
        activity.startActivity(uri);
    }

    public static void b(Activity activity, String s, String s1)
    {
        if (s != null)
        {
            activity.startActivity(Intent.createChooser(a(activity, s1, String.format("http://www.youtube.com/playlist?list=%1$s", new Object[] {
                s
            })), activity.getText(p.fy)));
            return;
        } else
        {
            L.c("Share playlist error: null playlist id");
            return;
        }
    }

    private static void b(Context context, Intent intent)
    {
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }

    public static void b(Context context, Uri uri)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try
        {
            b(context, intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            L.a("Activity not found to view uri", context);
        }
    }

}
