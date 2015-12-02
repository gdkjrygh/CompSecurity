// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.location.b;

import android.content.Context;
import android.os.Environment;
import android.os.storage.StorageManager;
import com.baidu.location.f;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Referenced classes of package com.baidu.location.b:
//            a

public final class e
{

    private static volatile e a = null;
    private static final String _flddo = "test.0";
    public static String _fldint = (new StringBuilder()).append(_mthdo()._mthfor()).append("/baidu/tempdata").toString();
    private final List _fldfor = new ArrayList();
    private Context _fldif;

    private e(Context context)
    {
        _fldif = context;
    }

    private List a()
    {
        Object obj2;
        ArrayList arraylist;
        ArrayList arraylist1;
        obj2 = null;
        arraylist1 = new ArrayList();
        arraylist = new ArrayList();
        Object obj = new File("/proc/mounts");
        if (!((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        Object obj1 = new Scanner(((File) (obj)));
_L6:
        obj = obj1;
        if (!((Scanner) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        obj = obj1;
        String s = ((Scanner) (obj1)).nextLine();
        obj = obj1;
        if (!s.startsWith("/dev/block/vold/")) goto _L6; else goto _L5
_L5:
        obj = obj1;
        String as[] = s.replace('\t', ' ').split(" ");
        if (as == null) goto _L6; else goto _L7
_L7:
        obj = obj1;
        if (as.length <= 0) goto _L6; else goto _L8
_L8:
        obj = obj1;
        arraylist1.add(as[1]);
          goto _L6
        obj1;
_L18:
        ((Exception) (obj1)).printStackTrace();
        if (obj != null)
        {
            ((Scanner) (obj)).close();
        }
_L17:
        return _fldfor;
_L4:
        obj = obj1;
        ((Scanner) (obj1)).close();
_L2:
        obj = new File("/system/etc/vold.fstab");
        if (!((File) (obj)).exists()) goto _L10; else goto _L9
_L9:
        obj1 = new Scanner(((File) (obj)));
_L14:
        obj = obj1;
        if (!((Scanner) (obj1)).hasNext()) goto _L12; else goto _L11
_L11:
        obj = obj1;
        as = ((Scanner) (obj1)).nextLine();
        obj = obj1;
        if (!as.startsWith("dev_mount")) goto _L14; else goto _L13
_L13:
        obj = obj1;
        as = as.replace('\t', ' ').split(" ");
        if (as == null) goto _L14; else goto _L15
_L15:
        obj = obj1;
        if (as.length <= 0) goto _L14; else goto _L16
_L16:
        String s2;
        s2 = as[2];
        obj = obj1;
        as = s2;
        if (!s2.contains(":"))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        obj = obj1;
        as = s2.substring(0, s2.indexOf(":"));
        obj = obj1;
        arraylist.add(as);
          goto _L14
        obj;
_L19:
        if (obj1 != null)
        {
            ((Scanner) (obj1)).close();
        }
        throw obj;
_L12:
        obj = obj1;
        ((Scanner) (obj1)).close();
_L10:
        obj = Environment.getExternalStorageDirectory().getAbsolutePath();
        _fldfor.add(new a(((String) (obj)), false, "Auto"));
        obj1 = arraylist1.iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            String s1 = (String)((Iterator) (obj1)).next();
            if (arraylist.contains(s1) && !s1.equals(obj))
            {
                File file = new File(s1);
                if (file.exists() && file.isDirectory() && file.canWrite())
                {
                    _fldfor.add(new a(s1, false, "Auto"));
                }
            }
        }
          goto _L17
        obj1;
        obj = null;
          goto _L18
        obj;
        obj1 = obj2;
          goto _L19
        obj;
          goto _L19
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
          goto _L19
    }

    private boolean a(String s)
    {
        boolean flag;
        s = new File(s, "test.0");
        if (s.exists())
        {
            s.delete();
        }
        flag = s.createNewFile();
        if (s.exists())
        {
            s.delete();
        }
        return flag;
        s;
        flag = false;
_L2:
        s.printStackTrace();
        return flag;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static e _mthdo()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/baidu/location/b/e;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new e(f.getServiceContext());
        }
        com/baidu/location/b/e;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/baidu/location/b/e;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private List _mthint()
    {
        StorageManager storagemanager;
        Method method1;
        Method method2;
        Object obj2;
        Object aobj[];
        storagemanager = (StorageManager)_fldif.getSystemService("storage");
        Method method = storagemanager.getClass().getMethod("getVolumeList", new Class[0]);
        method1 = storagemanager.getClass().getMethod("getVolumeState", new Class[] {
            java/lang/String
        });
        obj2 = Class.forName("android.os.storage.StorageVolume");
        method2 = ((Class) (obj2)).getMethod("isRemovable", new Class[0]);
        obj2 = ((Class) (obj2)).getMethod("getPath", new Class[0]);
        aobj = (Object[])(Object[])method.invoke(storagemanager, new Object[0]);
        if (aobj == null) goto _L2; else goto _L1
_L1:
        int j = aobj.length;
        int i = 0;
_L18:
        if (i >= j) goto _L4; else goto _L3
_L3:
        Object obj = aobj[i];
        String s1 = (String)((Method) (obj2)).invoke(obj, new Object[0]);
        if (s1 == null) goto _L6; else goto _L5
_L5:
        if (s1.length() <= 0 || !"mounted".equals(method1.invoke(storagemanager, new Object[] {
            s1
        }))) goto _L6; else goto _L7
_L7:
        List list;
        boolean flag;
        if (!((Boolean)method2.invoke(obj, new Object[0])).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (android.os.Build.VERSION.SDK_INT <= 19 && a(s1))
        {
            list = _fldfor;
            break MISSING_BLOCK_LABEL_217;
        }
          goto _L6
_L17:
        list.add(new a(s1, flag1, ((String) (obj1))));
          goto _L6
_L4:
        if (android.os.Build.VERSION.SDK_INT < 19) goto _L2; else goto _L8
_L8:
        obj1 = _fldif.getExternalFilesDirs(null);
        arraylist = new ArrayList();
        arraylist.addAll(_fldfor);
        i = 0;
_L19:
        if (i >= obj1.length || obj1[i] == null) goto _L10; else goto _L9
_L9:
        s = obj1[i].getAbsolutePath();
        iterator = _fldfor.iterator();
_L14:
        if (!iterator.hasNext()) goto _L12; else goto _L11
_L11:
        if (!s.startsWith(((a)iterator.next())._mthdo())) goto _L14; else goto _L13
_L13:
        flag = true;
_L16:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.indexOf(_fldif.getPackageName()) != -1)
        {
            arraylist.add(new a(s, true, "External Storage"));
        }
        break; /* Loop/switch isn't completed */
_L10:
        try
        {
            _fldfor.clear();
            _fldfor.addAll(arraylist);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((Exception) (obj1)).printStackTrace();
        }
_L2:
        return _fldfor;
_L12:
        flag = false;
        if (true) goto _L16; else goto _L15
        Object obj1;
        ArrayList arraylist;
        String s;
        Iterator iterator;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag)
        {
            obj1 = "Internal Storage";
        } else
        {
            obj1 = "External Storage";
        }
          goto _L17
_L6:
        i++;
          goto _L18
_L15:
        i++;
          goto _L19
    }

    public final String _mthfor()
    {
        List list = _mthif();
        if (list == null || list.size() == 0)
        {
            return null;
        } else
        {
            return ((a)list.get(0))._mthdo();
        }
    }

    public final List _mthif()
    {
        List list = null;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            list = _mthint();
        }
        if (list != null && list.size() > 0)
        {
            return list;
        } else
        {
            return a();
        }
    }

}
