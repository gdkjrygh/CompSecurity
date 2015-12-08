// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.a.a.a;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class d
{

    public static void a(File file, String s)
    {
        File file1 = new File(s);
        if (!file1.exists())
        {
            file1.mkdirs();
        }
        file = new ZipFile(file);
        Object obj;
        for (Enumeration enumeration = file.entries(); enumeration.hasMoreElements(); ((OutputStream) (obj)).close())
        {
            obj = (ZipEntry)enumeration.nextElement();
            InputStream inputstream = file.getInputStream(((ZipEntry) (obj)));
            obj = new File(new String((new StringBuilder()).append(s).append(File.separator).append(((ZipEntry) (obj)).getName()).toString().getBytes("8859_1"), "GB2312"));
            if (!((File) (obj)).exists())
            {
                File file2 = ((File) (obj)).getParentFile();
                if (!file2.exists())
                {
                    file2.mkdirs();
                }
                ((File) (obj)).createNewFile();
            }
            obj = new FileOutputStream(((File) (obj)));
            byte abyte0[] = new byte[0x100000];
            do
            {
                int i = inputstream.read(abyte0);
                if (i <= 0)
                {
                    break;
                }
                ((OutputStream) (obj)).write(abyte0, 0, i);
            } while (true);
            inputstream.close();
        }

    }

    private static void a(File file, ZipOutputStream zipoutputstream, String s)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(s);
        if (s.trim().length() == 0)
        {
            s = "";
        } else
        {
            s = File.separator;
        }
        s = new String(stringbuilder.append(s).append(file.getName()).toString().getBytes("8859_1"), "GB2312");
        if (file.isDirectory())
        {
            file = file.listFiles();
            int k = file.length;
            for (int i = 0; i < k; i++)
            {
                a(file[i], zipoutputstream, s);
            }

        } else
        {
            byte abyte0[] = new byte[0x100000];
            file = new BufferedInputStream(new FileInputStream(file), 0x100000);
            zipoutputstream.putNextEntry(new ZipEntry(s));
            do
            {
                int j = file.read(abyte0);
                if (j == -1)
                {
                    break;
                }
                zipoutputstream.write(abyte0, 0, j);
            } while (true);
            file.close();
            zipoutputstream.flush();
            zipoutputstream.closeEntry();
        }
    }

    public static void a(Collection collection, File file)
    {
        file = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 0x100000));
        for (collection = collection.iterator(); collection.hasNext(); a((File)collection.next(), ((ZipOutputStream) (file)), "")) { }
        file.close();
    }
}
