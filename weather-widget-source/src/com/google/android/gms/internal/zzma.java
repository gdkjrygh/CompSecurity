// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzlz, zzlv

public class zzma
{

    private static final Method zzagh = zzpZ();
    private static final Method zzagi = zzqa();
    private static final Method zzagj = zzqb();
    private static final Method zzagk = zzqc();
    private static final Method zzagl = zzqd();

    public static int zza(WorkSource worksource)
    {
        if (zzagj == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        int i = ((Integer)zzagj.invoke(worksource, new Object[0])).intValue();
        return i;
        worksource;
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
        return 0;
    }

    public static String zza(WorkSource worksource, int i)
    {
        if (zzagl == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        worksource = (String)zzagl.invoke(worksource, new Object[] {
            Integer.valueOf(i)
        });
        return worksource;
        worksource;
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
        return null;
    }

    public static void zza(WorkSource worksource, int i, String s)
    {
        String s1;
        if (zzagi == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        zzagi.invoke(worksource, new Object[] {
            Integer.valueOf(i), s1
        });
_L1:
        return;
        worksource;
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
        return;
        if (zzagh != null)
        {
            try
            {
                zzagh.invoke(worksource, new Object[] {
                    Integer.valueOf(i)
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WorkSource worksource)
            {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
            }
            return;
        }
          goto _L1
    }

    public static boolean zzaq(Context context)
    {
        return context.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
    }

    public static List zzb(WorkSource worksource)
    {
        Object obj;
        int i;
        int j;
        j = 0;
        if (worksource == null)
        {
            i = 0;
        } else
        {
            i = zza(worksource);
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        obj = Collections.EMPTY_LIST;
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        do
        {
            obj = arraylist;
            if (j >= i)
            {
                continue;
            }
            obj = zza(worksource, j);
            if (!zzlz.zzcB(((String) (obj))))
            {
                arraylist.add(obj);
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static WorkSource zze(int i, String s)
    {
        WorkSource worksource = new WorkSource();
        zza(worksource, i, s);
        return worksource;
    }

    public static WorkSource zzj(Context context, String s)
    {
        if (context == null)
        {
            return null;
        }
        try
        {
            context = context.getPackageManager().getApplicationInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("WorkSourceUtil", (new StringBuilder()).append("Could not find package: ").append(s).toString());
            return null;
        }
        if (context == null)
        {
            Log.e("WorkSourceUtil", (new StringBuilder()).append("Could not get applicationInfo from package: ").append(s).toString());
            return null;
        } else
        {
            return zze(((ApplicationInfo) (context)).uid, s);
        }
    }

    private static Method zzpZ()
    {
        Method method;
        try
        {
            method = android/os/WorkSource.getMethod("add", new Class[] {
                Integer.TYPE
            });
        }
        catch (Exception exception)
        {
            return null;
        }
        return method;
    }

    private static Method zzqa()
    {
        Method method = null;
        if (zzlv.zzpU())
        {
            try
            {
                method = android/os/WorkSource.getMethod("add", new Class[] {
                    Integer.TYPE, java/lang/String
                });
            }
            catch (Exception exception)
            {
                return null;
            }
        }
        return method;
    }

    private static Method zzqb()
    {
        Method method;
        try
        {
            method = android/os/WorkSource.getMethod("size", new Class[0]);
        }
        catch (Exception exception)
        {
            return null;
        }
        return method;
    }

    private static Method zzqc()
    {
        Method method;
        try
        {
            method = android/os/WorkSource.getMethod("get", new Class[] {
                Integer.TYPE
            });
        }
        catch (Exception exception)
        {
            return null;
        }
        return method;
    }

    private static Method zzqd()
    {
        Method method = null;
        if (zzlv.zzpU())
        {
            try
            {
                method = android/os/WorkSource.getMethod("getName", new Class[] {
                    Integer.TYPE
                });
            }
            catch (Exception exception)
            {
                return null;
            }
        }
        return method;
    }

}
