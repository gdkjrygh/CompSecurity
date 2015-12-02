// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public final class oe
{

    public static final Handler a = new Handler(Looper.getMainLooper());

    public oe()
    {
    }

    public static int a(Context context, int i)
    {
        return a(context.getResources().getDisplayMetrics(), i);
    }

    public static int a(DisplayMetrics displaymetrics, int i)
    {
        return (int)TypedValue.applyDimension(1, i, displaymetrics);
    }

    public static String a(Context context)
    {
        context = context.getContentResolver();
        if (context == null)
        {
            context = null;
        } else
        {
            context = android.provider.Settings.Secure.getString(context, "android_id");
        }
        if (context == null || a())
        {
            context = "emulator";
        }
        return a(((String) (context)));
    }

    public static String a(String s)
    {
        int i = 0;
_L2:
        if (i >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj;
        obj = MessageDigest.getInstance("MD5");
        ((MessageDigest) (obj)).update(s.getBytes());
        obj = String.format(Locale.US, "%032X", new Object[] {
            new BigInteger(1, ((MessageDigest) (obj)).digest())
        });
        return ((String) (obj));
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public static void a(ViewGroup viewgroup, AdSizeParcel adsizeparcel, String s)
    {
        a(viewgroup, adsizeparcel, s, 0xff000000, -1);
    }

    private static void a(ViewGroup viewgroup, AdSizeParcel adsizeparcel, String s, int i, int j)
    {
        if (viewgroup.getChildCount() != 0)
        {
            return;
        } else
        {
            Context context = viewgroup.getContext();
            TextView textview = new TextView(context);
            textview.setGravity(17);
            textview.setText(s);
            textview.setTextColor(i);
            textview.setBackgroundColor(j);
            s = new FrameLayout(context);
            s.setBackgroundColor(i);
            i = a(context, 3);
            s.addView(textview, new android.widget.FrameLayout.LayoutParams(adsizeparcel.g - i, adsizeparcel.d - i, 17));
            viewgroup.addView(s, adsizeparcel.g, adsizeparcel.d);
            return;
        }
    }

    public static void a(ViewGroup viewgroup, AdSizeParcel adsizeparcel, String s, String s1)
    {
        of.e(s1);
        a(viewgroup, adsizeparcel, s, 0xffff0000, 0xff000000);
    }

    public static boolean a()
    {
        return Build.DEVICE.startsWith("generic");
    }

    public static int b(Context context, int i)
    {
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        context.getMetrics(displaymetrics);
        return b(displaymetrics, i);
    }

    public static int b(DisplayMetrics displaymetrics, int i)
    {
        return Math.round((float)i / displaymetrics.density);
    }

    public static boolean b()
    {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean b(Context context)
    {
        return rz.a(context) == 0;
    }

    public static boolean c(Context context)
    {
        if (context.getResources().getConfiguration().orientation == 2)
        {
            if ((int)((float)((DisplayMetrics) (context = context.getResources().getDisplayMetrics())).heightPixels / ((DisplayMetrics) (context)).density) < 600)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Context context)
    {
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        int i;
        int j;
        int k;
        int l;
        if (alv.e())
        {
            context.getRealMetrics(displaymetrics);
            j = displaymetrics.heightPixels;
            i = displaymetrics.widthPixels;
        } else
        {
            try
            {
                j = ((Integer)android/view/Display.getMethod("getRawHeight", new Class[0]).invoke(context, new Object[0])).intValue();
                i = ((Integer)android/view/Display.getMethod("getRawWidth", new Class[0]).invoke(context, new Object[0])).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
        }
        context.getMetrics(displaymetrics);
        k = displaymetrics.heightPixels;
        l = displaymetrics.widthPixels;
        return k == j && l == i;
    }

    public static int e(Context context)
    {
        int i = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (i > 0)
        {
            return context.getResources().getDimensionPixelSize(i);
        } else
        {
            return 0;
        }
    }

}
