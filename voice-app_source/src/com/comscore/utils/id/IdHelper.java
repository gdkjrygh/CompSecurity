// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils.id;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.comscore.utils.API4;
import com.comscore.utils.API9;
import com.comscore.utils.Storage;
import com.comscore.utils.Utils;
import java.util.UUID;

// Referenced classes of package com.comscore.utils.id:
//            b, c

public class IdHelper
{

    private static final String a = "com.google.android.gms";
    private static final String b = "com.google.android.gms.ads.identifier.service.START";
    private String c;
    private String d;
    private Storage e;
    private Context f;
    private String g;
    private String h;
    private String i;
    private String j;
    private boolean k;
    private boolean l;

    public IdHelper(Context context, Storage storage)
    {
        k = false;
        l = false;
        f = context;
        e = storage;
    }

    private void a()
    {
        if (isPackageInstalledFromGooglePlayStore())
        {
            if (isGooglePlayServicesAvailable())
            {
                l = true;
                if (isAdvertisingIdEnabled().booleanValue())
                {
                    a(getAdvertisingId(f));
                    b(i);
                    k = false;
                    return;
                } else
                {
                    a(null);
                    b(null);
                    k = true;
                    return;
                }
            } else
            {
                b(null);
                return;
            }
        }
        String s = getAndroidSerial(f);
        if (s != null && s.length() > 0 && !s.equals("unknown") && s.length() > 3 && !s.substring(0, 3).equals("***") && !s.substring(0, 3).equals("000"))
        {
            b(s);
            return;
        }
        s = getAndroidId(f);
        if (s != null && s.length() > 0)
        {
            b(s);
            return;
        } else
        {
            b(null);
            return;
        }
    }

    private void a(String s)
    {
        i = s;
        if (s != null)
        {
            j = Utils.md5(s);
            return;
        } else
        {
            j = null;
            return;
        }
    }

    private void b()
    {
        if (e.has("vid").booleanValue())
        {
            d = e.get("vid");
        } else
        {
            String as[] = getPublisherADID();
            String s = as[0];
            String s1 = as[1];
            if (d == null)
            {
                d = (new StringBuilder()).append(Utils.md5((new StringBuilder()).append(s).append(getPublisherSecret()).toString())).append(s1).toString();
                e.set("vid", d);
                return;
            }
        }
    }

    private void b(String s)
    {
        if (s != null)
        {
            String s1 = Utils.md5(s);
            if (c(s1))
            {
                c = e.get("crossPublisherId");
                return;
            } else
            {
                c = d(s);
                e.set("crossPublisherId", c);
                e.set("md5RawCrossPublisherId", s1);
                return;
            }
        } else
        {
            c = null;
            return;
        }
    }

    private boolean c(String s)
    {
        String s1 = e.get("md5RawCrossPublisherId");
        return s1 != null && s1.equals(s);
    }

    private String d(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (s != null)
        {
            s1 = obj;
            if (s.length() > 0)
            {
                try
                {
                    s1 = Utils.encrypt(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return null;
                }
            }
        }
        return s1;
    }

    public static String getAdvertisingId(Context context)
    {
        Exception exception1;
        String s = "";
        b b1 = new b(null);
        Intent intent = new Intent(b);
        intent.setPackage(a);
        if (context.bindService(intent, b1, 1))
        {
            try
            {
                s = (new c(b1.getBinder())).getId();
            }
            catch (Exception exception)
            {
                context.unbindService(b1);
                return "";
            }
            finally
            {
                context.unbindService(b1);
            }
            context.unbindService(b1);
        }
        return s;
        throw exception1;
    }

    public static String getAndroidId(Context context)
    {
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 3)
        {
            context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (context != null && context.length() > 0 && !"9774d56d682e549c".equals(context) && !"unknown".equals(context) && !"android_id".equals(context))
            {
                return context;
            }
        }
        return null;
    }

    public static String getAndroidSerial(Context context)
    {
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() < 9)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        context = API9.getSerial();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        boolean flag;
        if (context.length() <= 0 || context.equals("unknown") || context.length() <= 3 || context.substring(0, 3).equals("***"))
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = context.substring(0, 3).equals("000");
        if (!flag)
        {
            return context;
        }
        break MISSING_BLOCK_LABEL_79;
        context;
        return null;
    }

    public void generateIds()
    {
        if (isPublisherSecretEmpty())
        {
            return;
        } else
        {
            h = getAndroidId(f);
            b();
            a();
            return;
        }
    }

    public String getAdvertisingId()
    {
        if (l && isAdvertisingIdEnabled().booleanValue())
        {
            if (k)
            {
                a();
            }
            return i;
        } else
        {
            return null;
        }
    }

    public String getAndroidId()
    {
        return h;
    }

    public String getCrossPublisherId()
    {
        if (l)
        {
            if (isAdvertisingIdEnabled().booleanValue())
            {
                if (k)
                {
                    a();
                }
                return c;
            } else
            {
                return "none";
            }
        } else
        {
            return c;
        }
    }

    public String getMD5AdvertisingId()
    {
        if (l && isAdvertisingIdEnabled().booleanValue())
        {
            if (k)
            {
                a();
            }
            return j;
        } else
        {
            return null;
        }
    }

    public String[] getPublisherADID()
    {
        String s = getAndroidSerial(f);
        if (s != null && s.length() > 0 && !s.equals("unknown") && s.length() > 3 && !s.substring(0, 3).equals("***") && !s.substring(0, 3).equals("000"))
        {
            return (new String[] {
                s, "-cs31"
            });
        }
        s = getAndroidId(f);
        if (s != null && s.length() > 0)
        {
            return (new String[] {
                s, "-cs32"
            });
        }
        if (s == null || s.length() == 0)
        {
            return (new String[] {
                UUID.randomUUID().toString(), "-cs72"
            });
        } else
        {
            return null;
        }
    }

    public String getPublisherSecret()
    {
        if (g == null)
        {
            g = "";
        }
        return g;
    }

    public String getVisitorId()
    {
        return d;
    }

    public Boolean isAdvertisingIdEnabled()
    {
        Boolean boolean1;
        Boolean boolean2;
        b b1;
        boolean flag;
        flag = true;
        boolean2 = Boolean.FALSE;
        b1 = new b(null);
        Intent intent = new Intent(b);
        intent.setPackage(a);
        boolean1 = boolean2;
        if (!f.bindService(intent, b1, 1))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if ((new c(b1.getBinder())).isLimitAdTrackingEnabled(true))
        {
            flag = false;
        }
        boolean1 = Boolean.valueOf(flag);
        f.unbindService(b1);
        return boolean1;
        Object obj;
        obj;
        f.unbindService(b1);
        return boolean2;
        obj;
        f.unbindService(b1);
        throw obj;
    }

    public boolean isGooglePlayServicesAvailable()
    {
        Object obj = Boolean.FALSE;
        if (android.os.Build.VERSION.SDK_INT <= 8)
        {
            obj = Boolean.FALSE;
        } else
        {
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            b b1;
            try
            {
                f.getPackageManager().getPackageInfo("com.android.vending", 0);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return Boolean.FALSE.booleanValue();
            }
            b1 = new b(null);
            obj = new Intent(b);
            ((Intent) (obj)).setPackage(a);
            if (f.bindService(((Intent) (obj)), b1, 1))
            {
                obj = Boolean.TRUE;
                f.unbindService(b1);
            } else
            {
                obj = Boolean.FALSE;
            }
        }
        return ((Boolean) (obj)).booleanValue();
    }

    public boolean isPackageInstalledFromGooglePlayStore()
    {
        if (android.os.Build.VERSION.SDK_INT > 4)
        {
            return API4.isPackageInstalledFromGooglePlayStore(f);
        } else
        {
            return false;
        }
    }

    public boolean isPublisherSecretEmpty()
    {
        return g == null || g.length() == 0;
    }

    public void setPublisherSecret(String s)
    {
        g = s;
    }

}
