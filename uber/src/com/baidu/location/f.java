// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.location;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.baidu.location.a.a;
import com.baidu.location.b.e;
import com.baidu.location.b.k;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.RandomAccessFile;

// Referenced classes of package com.baidu.location:
//            LLSInterface

public class f extends Service
    implements com.baidu.location.b.f
{

    public static boolean isServing = false;
    private static final String l0 = "app.jar";
    public static Context mC = null;
    public static String replaceFileName = "repll.jar";
    LLSInterface l1;
    LLSInterface l2;
    LLSInterface lZ;

    public f()
    {
        lZ = null;
        l1 = null;
        l2 = null;
    }

    private boolean _mthdo(File file)
    {
        boolean flag = false;
        boolean flag3 = false;
        boolean flag2 = false;
        Object obj = (new StringBuilder()).append(e._fldint).append("/grtcf.dat").toString();
        boolean flag1 = flag3;
        byte abyte0[];
        String s;
        int i;
        try
        {
            obj = new File(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return flag1;
        }
        flag1 = flag3;
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_209;
        }
        flag1 = flag3;
        obj = new RandomAccessFile(((File) (obj)), "rw");
        flag1 = flag3;
        ((RandomAccessFile) (obj)).seek(200L);
        flag = flag2;
        flag1 = flag3;
        if (!((RandomAccessFile) (obj)).readBoolean())
        {
            break MISSING_BLOCK_LABEL_201;
        }
        flag = flag2;
        flag1 = flag3;
        if (!((RandomAccessFile) (obj)).readBoolean())
        {
            break MISSING_BLOCK_LABEL_201;
        }
        flag1 = flag3;
        i = ((RandomAccessFile) (obj)).readInt();
        flag = flag2;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        flag1 = flag3;
        abyte0 = new byte[i];
        flag1 = flag3;
        ((RandomAccessFile) (obj)).read(abyte0, 0, i);
        flag1 = flag3;
        s = new String(abyte0);
        flag1 = flag3;
        file = k._mthif(file);
        flag = flag2;
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        flag = flag2;
        flag1 = flag3;
        if (file.equals(s))
        {
            flag = true;
        }
        flag1 = flag;
        ((RandomAccessFile) (obj)).close();
        return flag;
    }

    public static float getFrameVersion()
    {
        return 6.05F;
    }

    public static String getJarFileName()
    {
        return "app.jar";
    }

    public static Context getServiceContext()
    {
        return mC;
    }

    public IBinder onBind(Intent intent)
    {
        return l2.onBind(intent);
    }

    public void onCreate()
    {
        mC = getApplicationContext();
        System.currentTimeMillis();
        l1 = new a();
        try
        {
            File file = new File((new StringBuilder()).append(k.ai()).append(File.separator).append(replaceFileName).toString());
            File file1 = new File((new StringBuilder()).append(k.ai()).append(File.separator).append("app.jar").toString());
            if (file.exists())
            {
                if (file1.exists())
                {
                    file1.delete();
                }
                file.renameTo(file1);
            }
            if (file1.exists())
            {
                lZ = (LLSInterface)(new DexClassLoader((new StringBuilder()).append(k.ai()).append(File.separator).append("app.jar").toString(), k.ai(), null, getClassLoader())).loadClass("com.baidu.serverLoc.LocationService").newInstance();
            }
        }
        catch (Exception exception)
        {
            lZ = null;
        }
        if (lZ != null && lZ.getVersion() >= l1.getVersion() && _mthdo(new File((new StringBuilder()).append(k.ai()).append(File.separator).append("app.jar").toString())))
        {
            l2 = lZ;
            l1 = null;
        } else
        {
            l2 = l1;
            lZ = null;
        }
        isServing = true;
        l2.onCreate(this);
    }

    public void onDestroy()
    {
        isServing = false;
        l2.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        return l2.onStartCommand(intent, i, j);
    }

    public boolean onUnbind(Intent intent)
    {
        return l2.onUnBind(intent);
    }

    static 
    {
        isServing = false;
    }
}
