// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.f;

import android.os.Environment;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class c
{

    public static int a(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = new byte[4096];
        int i = 0;
        do
        {
            int j = inputstream.read(abyte0);
            if (-1 != j)
            {
                outputstream.write(abyte0, 0, j);
                i += j;
            } else
            {
                return i;
            }
        } while (true);
    }

    public static File a()
    {
        File file = new File(Environment.getExternalStorageDirectory(), "GOWeatherEX");
        if (!file.exists())
        {
            file.mkdir();
        }
        if (!file.isDirectory())
        {
            File file1 = new File("/mnt/emmc/GOWeatherEX");
            file = file1;
            if (!file1.exists())
            {
                file1.mkdir();
                return file1;
            }
        }
        return file;
    }

    public static File a(String s, boolean flag)
    {
        s = new File(s);
        if (!flag && s.exists())
        {
            s.delete();
        }
        if (s.exists())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        File file;
        try
        {
            file = s.getParentFile();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return s;
        }
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (!file.exists())
        {
            file.mkdirs();
        }
        s.createNewFile();
        return s;
    }

    public static boolean a(byte abyte0[], String s)
    {
        try
        {
            s = new FileOutputStream(a(s, false));
            s.write(abyte0);
            s.flush();
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return false;
        }
        return true;
    }

    public static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        a(inputstream, ((OutputStream) (bytearrayoutputstream)));
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            s = null;
        } else
        {
            s = new File(s);
            if (!s.exists())
            {
                throw new FileNotFoundException();
            }
            FileInputStream fileinputstream = new FileInputStream(s);
            byte abyte0[] = a(((InputStream) (fileinputstream)));
            s = abyte0;
            if (fileinputstream != null)
            {
                fileinputstream.close();
                return abyte0;
            }
        }
        return s;
    }

    public static boolean b(String s)
    {
        boolean flag = false;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                flag = (new File(s)).exists();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
        }
        return flag;
    }

    public static boolean c(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ((s = new File(s)).exists())
            {
                return s.delete();
            }
        }
        return false;
    }
}
