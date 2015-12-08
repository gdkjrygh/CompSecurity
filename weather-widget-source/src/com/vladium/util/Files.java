// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

// Referenced classes of package com.vladium.util:
//            IConstants

public abstract class Files
{

    private Files()
    {
    }

    public static File canonicalizeFile(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("null input: file");
        }
        File file1;
        try
        {
            file1 = file.getCanonicalFile();
        }
        catch (Exception exception)
        {
            return file.getAbsoluteFile();
        }
        return file1;
    }

    public static String canonicalizePathname(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: pathname");
        }
        String s1;
        try
        {
            s1 = (new File(s)).getCanonicalPath();
        }
        catch (Exception exception)
        {
            return (new File(s)).getAbsolutePath();
        }
        return s1;
    }

    public static File createTempFile(File file, String s, String s1)
        throws IOException
    {
        if (file == null || !file.exists())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parent directory: [").append(file).append("]").toString());
        }
        if (s == null || s.length() < 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("null or less than 3 chars long: ").append(s).toString());
        }
        if (s1 != null) goto _L2; else goto _L1
_L1:
        String s2 = ".tmp";
_L4:
        return File.createTempFile(s, s2, file);
_L2:
        s2 = s1;
        if (s1.charAt(0) != '.')
        {
            s2 = ".".concat(s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String getFileExtension(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("null input: file");
        }
        file = file.getName();
        int i = file.lastIndexOf('.');
        if (i < 0)
        {
            return "";
        } else
        {
            return file.substring(i);
        }
    }

    public static String getFileName(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("null input: file");
        }
        file = file.getName();
        int i = file.lastIndexOf('.');
        if (i < 0)
        {
            return file;
        } else
        {
            return file.substring(0, i);
        }
    }

    public static File newFile(File file, File file1)
    {
        if (file1 == null)
        {
            throw new IllegalArgumentException("null input: file");
        }
        if (file == null || file1.isAbsolute())
        {
            return file1;
        } else
        {
            return new File(file, file1.getPath());
        }
    }

    public static File newFile(File file, String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: file");
        }
        File file1 = new File(s);
        if (file == null || file1.isAbsolute())
        {
            return file1;
        } else
        {
            return new File(file, s);
        }
    }

    public static File newFile(String s, String s1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("null input: file");
        }
        File file = new File(s1);
        if (s == null || file.isAbsolute())
        {
            return file;
        } else
        {
            return new File(s, s1);
        }
    }

    public static File[] pathToFiles(String as[], boolean flag)
    {
        if (as == null)
        {
            throw new IllegalArgumentException("null input: path");
        }
        if (as.length == 0)
        {
            return IConstants.EMPTY_FILE_ARRAY;
        }
        ArrayList arraylist = new ArrayList(as.length);
        HashSet hashset = new HashSet(as.length);
        String s3 = ",".concat(File.pathSeparator);
label0:
        for (int i = 0; i < as.length; i++)
        {
            String s = as[i];
            if (s == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("null input: path[").append(i).append("]").toString());
            }
            StringTokenizer stringtokenizer = new StringTokenizer(s, s3);
            do
            {
                if (!stringtokenizer.hasMoreTokens())
                {
                    continue label0;
                }
                String s2 = stringtokenizer.nextToken();
                String s1 = s2;
                if (flag)
                {
                    s1 = canonicalizePathname(s2);
                }
                if (hashset.add(s1))
                {
                    arraylist.add(new File(s1));
                }
            } while (true);
        }

        as = new File[arraylist.size()];
        arraylist.toArray(as);
        return as;
    }

    public static String[] readFileList(File file)
        throws IOException
    {
        Object obj;
        if (file == null)
        {
            throw new IllegalArgumentException("null input: atfile");
        }
        obj = null;
        file = new BufferedReader(new FileReader(file), 8192);
        obj = new LinkedList();
_L3:
        String s = file.readLine();
        if (s == null) goto _L2; else goto _L1
_L1:
        s = s.trim();
        if (s.length() != 0 && s.charAt(0) != '#')
        {
            ((List) (obj)).add(s);
        }
          goto _L3
        obj;
_L5:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw obj;
_L2:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (obj == null || ((List) (obj)).isEmpty())
        {
            return IConstants.EMPTY_STRING_ARRAY;
        } else
        {
            file = new String[((List) (obj)).size()];
            ((List) (obj)).toArray(file);
            return file;
        }
        Exception exception;
        exception;
        file = ((File) (obj));
        obj = exception;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean renameFile(File file, File file1, boolean flag)
    {
        boolean flag1;
        if (file == null || !file.exists())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid input source: [").append(file).append("]").toString());
        }
        if (file1 == null)
        {
            throw new IllegalArgumentException("null input: target");
        }
        flag1 = file1.exists();
        if (flag1 && !flag) goto _L2; else goto _L1
_L1:
        if (!flag1) goto _L4; else goto _L3
_L3:
        file1.delete();
_L5:
        return file.renameTo(file1);
_L4:
        File file2 = file1.getParentFile();
        if (file2 != null && !file2.equals(file.getParentFile()))
        {
            file2.mkdirs();
        }
        if (true) goto _L5; else goto _L2
_L2:
        return false;
    }
}
