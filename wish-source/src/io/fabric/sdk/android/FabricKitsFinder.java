// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.os.SystemClock;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// Referenced classes of package io.fabric.sdk.android:
//            Fabric, Logger, KitInfo

class FabricKitsFinder
    implements Callable
{

    private static final String FABRIC_BUILD_TYPE_KEY = "fabric-build-type";
    static final String FABRIC_DIR = "fabric/";
    private static final String FABRIC_IDENTIFIER_KEY = "fabric-identifier";
    private static final String FABRIC_VERSION_KEY = "fabric-version";
    final String apkFileName;

    FabricKitsFinder(String s)
    {
        apkFileName = s;
    }

    private KitInfo loadKitInfo(ZipEntry zipentry, ZipFile zipfile)
    {
        ZipFile zipfile1;
        ZipFile zipfile2;
        zipfile2 = null;
        zipfile1 = null;
        zipfile = zipfile.getInputStream(zipentry);
        zipfile1 = zipfile;
        zipfile2 = zipfile;
        Object obj1 = new Properties();
        zipfile1 = zipfile;
        zipfile2 = zipfile;
        ((Properties) (obj1)).load(zipfile);
        zipfile1 = zipfile;
        zipfile2 = zipfile;
        Object obj = ((Properties) (obj1)).getProperty("fabric-identifier");
        zipfile1 = zipfile;
        zipfile2 = zipfile;
        String s = ((Properties) (obj1)).getProperty("fabric-version");
        zipfile1 = zipfile;
        zipfile2 = zipfile;
        obj1 = ((Properties) (obj1)).getProperty("fabric-build-type");
        zipfile1 = zipfile;
        zipfile2 = zipfile;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_104;
        }
        zipfile1 = zipfile;
        zipfile2 = zipfile;
        if (!TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_182;
        }
        zipfile1 = zipfile;
        zipfile2 = zipfile;
        try
        {
            throw new IllegalStateException((new StringBuilder()).append("Invalid format of fabric file,").append(zipentry.getName()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (ZipFile zipfile)
        {
            zipfile2 = zipfile1;
        }
        finally
        {
            CommonUtils.closeQuietly(zipfile2);
        }
        Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Error when parsing fabric properties ").append(zipentry.getName()).toString(), zipfile);
        CommonUtils.closeQuietly(zipfile1);
        return null;
        zipfile1 = zipfile;
        zipfile2 = zipfile;
        obj = new KitInfo(((String) (obj)), s, ((String) (obj1)));
        CommonUtils.closeQuietly(zipfile);
        return ((KitInfo) (obj));
        throw zipentry;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Map call()
        throws Exception
    {
        HashMap hashmap = new HashMap();
        long l = SystemClock.elapsedRealtime();
        int i = 0;
        ZipFile zipfile = loadApkFile();
        Enumeration enumeration = zipfile.entries();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            int j = i + 1;
            Object obj = (ZipEntry)enumeration.nextElement();
            i = j;
            if (((ZipEntry) (obj)).getName().startsWith("fabric/"))
            {
                i = j;
                if (((ZipEntry) (obj)).getName().length() > "fabric/".length())
                {
                    obj = loadKitInfo(((ZipEntry) (obj)), zipfile);
                    i = j;
                    if (obj != null)
                    {
                        hashmap.put(((KitInfo) (obj)).getIdentifier(), obj);
                        Fabric.getLogger().v("Fabric", String.format("Found kit:[%s] version:[%s]", new Object[] {
                            ((KitInfo) (obj)).getIdentifier(), ((KitInfo) (obj)).getVersion()
                        }));
                        i = j;
                    }
                }
            }
        } while (true);
        if (zipfile != null)
        {
            try
            {
                zipfile.close();
            }
            catch (IOException ioexception) { }
        }
        Fabric.getLogger().v("Fabric", (new StringBuilder()).append("finish scanning in ").append(SystemClock.elapsedRealtime() - l).append(" reading:").append(i).toString());
        return hashmap;
    }

    protected ZipFile loadApkFile()
        throws IOException
    {
        return new ZipFile(apkFileName);
    }
}
