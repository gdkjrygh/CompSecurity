// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package android.support.multidex:
//            e, c, b, d

public final class a
{

    private static final String a;
    private static final Set b = new HashSet();
    private static final boolean c = a(System.getProperty("java.vm.version"));

    static Field a(Object obj, String s)
    {
        return b(obj, s);
    }

    static Method a(Object obj, String s, Class aclass[])
    {
        return b(obj, s, aclass);
    }

    public static void a(Context context)
    {
        Log.i("MultiDex", "install");
        if (!c) goto _L2; else goto _L1
_L1:
        Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
_L4:
        return;
_L2:
        if (android.os.Build.VERSION.SDK_INT < 4)
        {
            throw new RuntimeException((new StringBuilder()).append("Multi dex installation failed. SDK ").append(android.os.Build.VERSION.SDK_INT).append(" is unsupported. Min SDK version is ").append(4).append(".").toString());
        }
        ApplicationInfo applicationinfo = b(context);
        if (applicationinfo == null) goto _L4; else goto _L3
_L3:
        Object obj;
        synchronized (b)
        {
            obj = applicationinfo.sourceDir;
            if (!b.contains(obj))
            {
                break MISSING_BLOCK_LABEL_158;
            }
        }
        return;
        context;
        set;
        JVM INSTR monitorexit ;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("MultiDex", "Multidex installation failure", context);
        }
        throw new RuntimeException((new StringBuilder()).append("Multi dex installation failed (").append(context.getMessage()).append(").").toString());
        b.add(obj);
        if (android.os.Build.VERSION.SDK_INT > 20)
        {
            Log.w("MultiDex", (new StringBuilder()).append("MultiDex is not guaranteed to work in SDK version ").append(android.os.Build.VERSION.SDK_INT).append(": SDK version higher than ").append(20).append(" should be backed by ").append("runtime with built-in multidex capabilty but it's not the ").append("case here: java.vm.version=\"").append(System.getProperty("java.vm.version")).append("\"").toString());
        }
        obj = context.getClassLoader();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
        set;
        JVM INSTR monitorexit ;
        return;
        context;
        Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", context);
        set;
        JVM INSTR monitorexit ;
        return;
        c(context);
_L7:
        Object obj1;
        List list;
        obj1 = new File(applicationinfo.dataDir, a);
        list = e.a(context, applicationinfo, ((File) (obj1)), false);
        if (!a(list)) goto _L6; else goto _L5
_L5:
        a(((ClassLoader) (obj)), ((File) (obj1)), list);
_L8:
        set;
        JVM INSTR monitorexit ;
        Log.i("MultiDex", "install done");
        return;
        obj1;
        Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", ((Throwable) (obj1)));
          goto _L7
_L6:
label0:
        {
            Log.w("MultiDex", "Files were not valid zip files.  Forcing a reload.");
            context = e.a(context, applicationinfo, ((File) (obj1)), true);
            if (!a(((List) (context))))
            {
                break label0;
            }
            a(((ClassLoader) (obj)), ((File) (obj1)), ((List) (context)));
        }
          goto _L8
        throw new RuntimeException("Zip files were not valid.");
          goto _L7
    }

    private static void a(ClassLoader classloader, File file, List list)
    {
label0:
        {
            if (!list.isEmpty())
            {
                if (android.os.Build.VERSION.SDK_INT < 19)
                {
                    break label0;
                }
                android.support.multidex.c.a(classloader, list, file);
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            android.support.multidex.b.a(classloader, list, file);
            return;
        } else
        {
            d.a(classloader, list);
            return;
        }
    }

    static void a(Object obj, String s, Object aobj[])
    {
        b(obj, s, aobj);
    }

    static boolean a(String s)
    {
        Matcher matcher;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(s);
        flag = flag1;
        if (!matcher.matches())
        {
            break MISSING_BLOCK_LABEL_76;
        }
        int i;
        int j;
        i = Integer.parseInt(matcher.group(1));
        j = Integer.parseInt(matcher.group(2));
        if (i <= 2)
        {
            flag = flag1;
            if (i != 2)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            flag = flag1;
            if (j < 1)
            {
                break MISSING_BLOCK_LABEL_76;
            }
        }
        flag = true;
_L2:
        StringBuilder stringbuilder = (new StringBuilder()).append("VM with version ").append(s);
        if (flag)
        {
            s = " has multidex support";
        } else
        {
            s = " does not have multidex support";
        }
        Log.i("MultiDex", stringbuilder.append(s).toString());
        return flag;
        NumberFormatException numberformatexception;
        numberformatexception;
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean a(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (!e.a((File)list.next()))
            {
                return false;
            }
        }

        return true;
    }

    private static ApplicationInfo b(Context context)
    {
        PackageManager packagemanager;
        try
        {
            packagemanager = context.getPackageManager();
            context = context.getPackageName();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", context);
            return null;
        }
        if (packagemanager == null || context == null)
        {
            return null;
        } else
        {
            return packagemanager.getApplicationInfo(context, 128);
        }
    }

    private static Field b(Object obj, String s)
    {
        Class class1 = obj.getClass();
_L2:
        if (class1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Field field;
        field = class1.getDeclaredField(s);
        if (!field.isAccessible())
        {
            field.setAccessible(true);
        }
        return field;
        NoSuchFieldException nosuchfieldexception;
        nosuchfieldexception;
        class1 = class1.getSuperclass();
        if (true) goto _L2; else goto _L1
_L1:
        throw new NoSuchFieldException((new StringBuilder()).append("Field ").append(s).append(" not found in ").append(obj.getClass()).toString());
    }

    private static transient Method b(Object obj, String s, Class aclass[])
    {
        Class class1 = obj.getClass();
_L2:
        if (class1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Method method;
        method = class1.getDeclaredMethod(s, aclass);
        if (!method.isAccessible())
        {
            method.setAccessible(true);
        }
        return method;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        class1 = class1.getSuperclass();
        if (true) goto _L2; else goto _L1
_L1:
        throw new NoSuchMethodException((new StringBuilder()).append("Method ").append(s).append(" with parameters ").append(Arrays.asList(aclass)).append(" not found in ").append(obj.getClass()).toString());
    }

    private static void b(Object obj, String s, Object aobj[])
    {
        s = b(obj, s);
        Object aobj1[] = (Object[])(Object[])s.get(obj);
        Object aobj2[] = (Object[])(Object[])Array.newInstance(((Object) (aobj1)).getClass().getComponentType(), aobj1.length + aobj.length);
        System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), 0, aobj1.length);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), aobj1.length, aobj.length);
        s.set(obj, ((Object) (aobj2)));
    }

    private static void c(Context context)
    {
        File afile[];
label0:
        {
            context = new File(context.getFilesDir(), "secondary-dexes");
            if (context.isDirectory())
            {
                Log.i("MultiDex", (new StringBuilder()).append("Clearing old secondary dex dir (").append(context.getPath()).append(").").toString());
                afile = context.listFiles();
                if (afile != null)
                {
                    break label0;
                }
                Log.w("MultiDex", (new StringBuilder()).append("Failed to list secondary dex dir content (").append(context.getPath()).append(").").toString());
            }
            return;
        }
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file = afile[i];
            Log.i("MultiDex", (new StringBuilder()).append("Trying to delete old file ").append(file.getPath()).append(" of size ").append(file.length()).toString());
            if (!file.delete())
            {
                Log.w("MultiDex", (new StringBuilder()).append("Failed to delete old file ").append(file.getPath()).toString());
            } else
            {
                Log.i("MultiDex", (new StringBuilder()).append("Deleted old file ").append(file.getPath()).toString());
            }
            i++;
        }
        if (!context.delete())
        {
            Log.w("MultiDex", (new StringBuilder()).append("Failed to delete secondary dex dir ").append(context.getPath()).toString());
            return;
        } else
        {
            Log.i("MultiDex", (new StringBuilder()).append("Deleted old secondary dex dir ").append(context.getPath()).toString());
            return;
        }
    }

    static 
    {
        a = (new StringBuilder()).append("code_cache").append(File.separator).append("secondary-dexes").toString();
    }
}
