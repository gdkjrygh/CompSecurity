// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Patterns;
import android.util.TypedValue;
import android.webkit.URLUtil;
import android.widget.ImageButton;
import com.sessionm.a.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestInputStream;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.sessionm.core:
//            Drawables, Config

public class h
{

    public static final String ANDROID_CALENDAR_CONTENT_TYPE = "vnd.android.cursor.item/event";
    private static final String TAG = "SessionM.Util";
    public static final int fr = 0x10000;

    public h()
    {
    }

    public static int a(float f, Context context)
    {
        return (int)(b(f, context) + 0.5F);
    }

    public static int a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[0x10000];
        int i = 0;
        do
        {
            int i1 = inputstream.read(abyte0);
            if (i1 != -1)
            {
                outputstream.write(abyte0, 0, i1);
                i += i1;
            } else
            {
                return i;
            }
        } while (true);
    }

    public static transient String a(com.sessionm.api.SessionM.ActivityType activitytype, String s1, String s2, boolean flag, Object aobj[])
    {
        if (activitytype == com.sessionm.api.SessionM.ActivityType.ACHIEVEMENT)
        {
            throw new InvalidParameterException((new StringBuilder()).append("Invalid activityType : ").append(activitytype).append(" for portal url").toString());
        }
        if (activitytype != com.sessionm.api.SessionM.ActivityType.INTERSTITIAL) goto _L2; else goto _L1
_L1:
        aobj = String.format("%s/%s", new Object[] {
            s1, String.format(Locale.US, "apps/%s/welcome?z=%d", new Object[] {
                s2, Long.valueOf(System.currentTimeMillis())
            })
        });
_L4:
        return ((String) (aobj));
_L2:
        if (flag)
        {
            return String.format("%s/%s", new Object[] {
                s1, String.format(Locale.US, "optin?z=%d&platform=android", new Object[] {
                    Long.valueOf(System.currentTimeMillis())
                })
            });
        }
        Object obj = null;
        activitytype = obj;
        if (aobj != null)
        {
            activitytype = obj;
            if (aobj.length > 0)
            {
                if (aobj[0] instanceof String)
                {
                    activitytype = (String)aobj[0];
                } else
                {
                    activitytype = obj;
                    if (aobj.length > 1)
                    {
                        activitytype = obj;
                        if (aobj[1] instanceof String)
                        {
                            activitytype = (String)aobj[1];
                        }
                    }
                }
            }
        }
        if (activitytype == null)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj = activitytype;
        if (URLUtil.isValidUrl(activitytype)) goto _L4; else goto _L3
_L3:
label0:
        {
            aobj = String.format(Locale.US, "apps/%s/portal?z=%d", new Object[] {
                s2, Long.valueOf(System.currentTimeMillis())
            });
            if (activitytype != null)
            {
                s2 = activitytype;
                if (activitytype.length() != 0)
                {
                    break label0;
                }
            }
            s2 = ((String) (aobj));
        }
        return String.format("%s/%s", new Object[] {
            s1, s2
        });
    }

    public static String a(File file, String s1)
    {
        file = b(file, s1);
        if (file == null)
        {
            return null;
        } else
        {
            return com.sessionm.a.a.a(file.digest());
        }
    }

    public static String a(String s1, byte abyte0[])
        throws NoSuchAlgorithmException, InvalidKeyException
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            abyte0 = new SecretKeySpec(abyte0, "HmacSHA256");
            s1 = s1.getBytes();
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(abyte0);
            return Base64.encodeToString(mac.doFinal(s1), 10);
        }
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            return;
        }
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            return;
        }
    }

    public static void a(File file)
    {
        File afile[] = file.listFiles();
        if (afile != null)
        {
            int i1 = afile.length;
            int i = 0;
            while (i < i1) 
            {
                File file1 = afile[i];
                if (file1.isDirectory())
                {
                    a(file1);
                } else
                {
                    file1.delete();
                }
                i++;
            }
        }
        file.delete();
    }

    public static boolean a(Context context, Intent intent)
    {
        while (context == null || context.getPackageManager().queryIntentActivities(intent, 0).size() <= 0) 
        {
            return false;
        }
        return true;
    }

    public static boolean a(CharSequence charsequence)
    {
        return charsequence != null && Patterns.EMAIL_ADDRESS.matcher(charsequence).matches();
    }

    public static String aE()
    {
        return Build.BRAND;
    }

    public static float b(float f, Context context)
    {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static MessageDigest b(File file, String s1)
    {
        Object obj;
        Object obj2 = null;
        byte abyte0[] = null;
        if (s1 == null)
        {
            return null;
        }
        int i;
        try
        {
            s1 = MessageDigest.getInstance(s1);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return null;
        }
        file = new DigestInputStream(new FileInputStream(file), s1);
        abyte0 = new byte[0x10000];
        do
        {
            i = file.read(abyte0);
        } while (i != -1);
        a(file);
_L1:
        return s1;
        file;
        file = abyte0;
_L5:
        a(file);
          goto _L1
        file;
        file = obj2;
_L4:
        a(file);
          goto _L1
        file;
        obj = null;
        s1 = file;
_L3:
        a(((Closeable) (obj)));
        throw s1;
        s1;
        obj = file;
        if (true) goto _L3; else goto _L2
_L2:
        Object obj1;
        obj1;
          goto _L4
        obj1;
          goto _L5
    }

    public static boolean b(CharSequence charsequence)
    {
        return charsequence != null && charsequence.length() > 0;
    }

    public static boolean c(CharSequence charsequence)
    {
        if (charsequence != null)
        {
            if ((charsequence = charsequence.toString()).equalsIgnoreCase("m") || charsequence.equalsIgnoreCase("f") || charsequence.equalsIgnoreCase("male") || charsequence.equalsIgnoreCase("female"))
            {
                return true;
            }
        }
        return false;
    }

    public static ImageButton d(Activity activity)
    {
        ImageButton imagebutton = new ImageButton(activity);
        imagebutton.setBackgroundColor(0x106000d);
        BitmapDrawable bitmapdrawable = Drawables.aI.e(activity);
        if (m(16))
        {
            imagebutton.setBackground(bitmapdrawable);
        } else
        {
            imagebutton.setBackgroundDrawable(bitmapdrawable);
        }
        activity = new android.widget.RelativeLayout.LayoutParams(a(50F, activity), a(50F, activity));
        activity.addRule(11);
        activity.rightMargin = 0;
        activity.topMargin = 0;
        imagebutton.setLayoutParams(activity);
        return imagebutton;
    }

    public static String getModel()
    {
        return Build.MODEL;
    }

    public static int getPid()
    {
        return Process.myPid();
    }

    public static boolean isSupportedPlatform()
    {
        return android.os.Build.VERSION.SDK_INT >= Config.f().j();
    }

    public static String j(Context context)
    {
        if (context == null)
        {
            return "unknown";
        }
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context != null && context.isConnectedOrConnecting())
        {
            if (context.getType() == 1)
            {
                return "wifi";
            }
            if (context.getType() == 0)
            {
                return context.getSubtypeName();
            } else
            {
                return (new StringBuilder()).append("connection_type_").append(context.getType()).toString();
            }
        } else
        {
            return "unknown";
        }
    }

    public static boolean k(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    public static boolean l(Context context)
    {
        return "mounted".equals(Environment.getExternalStorageState()) && context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static boolean m(int i)
    {
        return android.os.Build.VERSION.SDK_INT >= i;
    }

    public static boolean m(Context context)
    {
        Intent intent = (new Intent("android.intent.action.INSERT")).setType("vnd.android.cursor.item/event");
        return m(14) && a(context, intent);
    }

    public static boolean n(Context context)
    {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return a(context, intent);
    }

    public static boolean o(Context context)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return a(context, intent);
    }

    public static BitmapDrawable p(String s1)
    {
        s1 = Base64.decode(s1, 0);
        return new BitmapDrawable(null, BitmapFactory.decodeByteArray(s1, 0, s1.length));
    }

    public static Bitmap q(String s1)
    {
        Object obj = r(s1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((Bitmap) (obj));
_L2:
        Bitmap bitmap = BitmapFactory.decodeStream(((InputStream) (obj)));
        ((InputStream) (obj)).close();
        return bitmap;
        IOException ioexception;
        ioexception;
        obj = bitmap;
        if (Log.isLoggable("SessionM.Util", 6))
        {
            Log.e("SessionM.Util", String.format(Locale.US, "Error closing stream while reading drawable at path: %s", new Object[] {
                s1
            }), ioexception);
            return bitmap;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static InputStream r(String s1)
    {
        return com/sessionm/core/h.getClassLoader().getResourceAsStream(s1);
    }

    public static String s(String s1)
    {
        s1 = s1.split("&");
        Arrays.sort(s1, new Comparator() {

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((String)obj, (String)obj1);
            }

            public int compare(String s2, String s3)
            {
                byte byte0 = 2;
                String as[] = s2.split("=");
                String s5 = as[0];
                s2 = "";
                if (as.length > 1)
                {
                    s2 = as[1];
                }
                int i = 2;
                String s4 = s2;
                for (; i < as.length; i++)
                {
                    s4 = (new StringBuilder()).append(s4).append("=").append(as[i]).toString();
                }

                s3 = s3.split("=");
                String s6 = s3[0];
                s2 = "";
                i = byte0;
                if (s3.length > 1)
                {
                    s2 = s3[1];
                    i = byte0;
                }
                for (; i < s3.length; i++)
                {
                    s2 = (new StringBuilder()).append(s2).append("=").append(s3[i]).toString();
                }

                if (s5.equals(s6))
                {
                    return s4.compareTo(s2);
                } else
                {
                    return s5.compareTo(s6);
                }
            }

        });
        return TextUtils.join("&", s1);
    }

    public static boolean t(String s1)
    {
        if (s1 == null)
        {
            return false;
        } else
        {
            return Pattern.matches("^\\d{5}(-\\d{4})?$", s1);
        }
    }

    public static boolean u(String s1)
    {
        boolean flag;
        flag = true;
        break MISSING_BLOCK_LABEL_2;
_L2:
        do
        {
            return false;
        } while (s1 == null || s1.isEmpty());
        int i;
        int i1;
        i = Calendar.getInstance().get(1);
        i1 = Integer.parseInt(s1);
        i -= i1;
        if (i < 14 || i > 120)
        {
            flag = false;
        }
        return flag;
        s1;
        if (Log.isLoggable("SessionM.Util", 6))
        {
            Log.e("SessionM.Util", String.format("Exception parse int from yob string: %s", new Object[] {
                s1
            }));
            return false;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int v(String s1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        if (s1.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        int i;
        int i1;
        i = Calendar.getInstance().get(1);
        i1 = Integer.parseInt(s1);
        i -= i1;
        if (i >= 14 && i <= 120)
        {
            return i;
        }
        continue; /* Loop/switch isn't completed */
        s1;
        if (Log.isLoggable("SessionM.Util", 6))
        {
            Log.e("SessionM.Util", String.format("Exception parse int from yob string: %s", new Object[] {
                s1
            }));
            return -1;
        }
        if (true) goto _L1; else goto _L3
_L3:
        return 0;
    }
}
