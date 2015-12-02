// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class due
{

    public static void a(Context context, String s)
    {
        ApplicationInfo applicationinfo;
        try
        {
            System.loadLibrary(s);
            return;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            applicationinfo = context.getApplicationInfo();
        }
        s = (new StringBuilder("lib")).append(s).append(".so").toString();
        String s1 = context.getFilesDir().toString();
        try
        {
            String s2 = (new StringBuilder()).append(s1).append(File.separator).append(s).toString();
            (new File(s2)).delete();
            a(applicationinfo.sourceDir, (new StringBuilder("lib/")).append(Build.CPU_ABI).append("/").append(s).toString(), s1);
            System.load(s2);
            return;
        }
        catch (IOException ioexception)
        {
            context = context.getExternalCacheDir().toString();
        }
        ioexception = (new StringBuilder()).append(context).append(File.separator).append(s).toString();
        (new File(ioexception)).delete();
        try
        {
            a(applicationinfo.sourceDir, (new StringBuilder("lib/")).append(Build.CPU_ABI).append("/").append(s).toString(), ((String) (context)));
            System.load(ioexception);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private static void a(String s, String s1, String s2)
    {
        ZipInputStream zipinputstream = new ZipInputStream(new FileInputStream(s));
        s = zipinputstream.getNextEntry();
        do
        {
label0:
            {
                if (s != null)
                {
                    if (s.isDirectory() || !s1.equals(s.getName()))
                    {
                        break label0;
                    }
                    s1 = s.getName();
                    int i = s1.lastIndexOf(File.separator);
                    s = s1;
                    if (i >= 0)
                    {
                        s = s1.substring(i + 1, s1.length());
                    }
                    a(zipinputstream, (new StringBuilder()).append(s2).append(File.separator).append(s).toString());
                }
                zipinputstream.close();
                return;
            }
            zipinputstream.closeEntry();
            s = zipinputstream.getNextEntry();
        } while (true);
    }

    private static void a(ZipInputStream zipinputstream, String s)
    {
        s = new BufferedOutputStream(new FileOutputStream(s));
        byte abyte0[] = new byte[4096];
        do
        {
            int i = zipinputstream.read(abyte0);
            if (i != -1)
            {
                s.write(abyte0, 0, i);
            } else
            {
                s.close();
                return;
            }
        } while (true);
    }
}
