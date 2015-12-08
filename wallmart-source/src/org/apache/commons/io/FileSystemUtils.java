// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

// Referenced classes of package org.apache.commons.io:
//            FilenameUtils, IOExceptionWithCause, ThreadMonitor, IOUtils

public class FileSystemUtils
{

    private static final String DF;
    private static final int INIT_PROBLEM = -1;
    private static final FileSystemUtils INSTANCE;
    private static final int OS;
    private static final int OTHER = 0;
    private static final int POSIX_UNIX = 3;
    private static final int UNIX = 2;
    private static final int WINDOWS = 1;

    public FileSystemUtils()
    {
    }

    public static long freeSpace(String s)
        throws IOException
    {
        return INSTANCE.freeSpaceOS(s, OS, false, -1L);
    }

    public static long freeSpaceKb()
        throws IOException
    {
        return freeSpaceKb(-1L);
    }

    public static long freeSpaceKb(long l)
        throws IOException
    {
        return freeSpaceKb((new File(".")).getAbsolutePath(), l);
    }

    public static long freeSpaceKb(String s)
        throws IOException
    {
        return freeSpaceKb(s, -1L);
    }

    public static long freeSpaceKb(String s, long l)
        throws IOException
    {
        return INSTANCE.freeSpaceOS(s, OS, true, l);
    }

    long freeSpaceOS(String s, int i, boolean flag, long l)
        throws IOException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Path must not be empty");
        }
        switch (i)
        {
        default:
            throw new IllegalStateException("Exception caught when determining operating system");

        case 1: // '\001'
            if (flag)
            {
                return freeSpaceWindows(s, l) / 1024L;
            } else
            {
                return freeSpaceWindows(s, l);
            }

        case 2: // '\002'
            return freeSpaceUnix(s, flag, false, l);

        case 3: // '\003'
            return freeSpaceUnix(s, flag, true, l);

        case 0: // '\0'
            throw new IllegalStateException("Unsupported operating system");
        }
    }

    long freeSpaceUnix(String s, boolean flag, boolean flag1, long l)
        throws IOException
    {
        Object obj;
        Object obj1;
        if (s.length() == 0)
        {
            throw new IllegalArgumentException("Path must not be empty");
        }
        obj = "-";
        if (flag)
        {
            obj = (new StringBuilder()).append("-").append("k").toString();
        }
        obj1 = obj;
        if (flag1)
        {
            obj1 = (new StringBuilder()).append(((String) (obj))).append("P").toString();
        }
        String as[];
        if (((String) (obj1)).length() > 1)
        {
            as = new String[3];
            as[0] = DF;
            as[1] = ((String) (obj1));
            as[2] = s;
        } else
        {
            as = new String[2];
            as[0] = DF;
            as[1] = s;
        }
        obj1 = performCommand(as, 3, l);
        if (((List) (obj1)).size() < 2)
        {
            throw new IOException((new StringBuilder()).append("Command line '").append(DF).append("' did not return info as expected ").append("for path '").append(s).append("'- response was ").append(obj1).toString());
        }
        as = new StringTokenizer((String)((List) (obj1)).get(1), " ");
        if (as.countTokens() >= 4) goto _L2; else goto _L1
_L1:
        if (as.countTokens() != 1 || ((List) (obj1)).size() < 3) goto _L4; else goto _L3
_L3:
        as = new StringTokenizer((String)((List) (obj1)).get(2), " ");
_L6:
        as.nextToken();
        as.nextToken();
        return parseBytes(as.nextToken(), s);
_L4:
        throw new IOException((new StringBuilder()).append("Command line '").append(DF).append("' did not return data as expected ").append("for path '").append(s).append("'- check path is valid").toString());
_L2:
        as.nextToken();
        if (true) goto _L6; else goto _L5
_L5:
    }

    long freeSpaceWindows(String s, long l)
        throws IOException
    {
        Object obj = FilenameUtils.normalize(s, false);
        s = ((String) (obj));
        if (((String) (obj)).length() > 0)
        {
            s = ((String) (obj));
            if (((String) (obj)).charAt(0) != '"')
            {
                s = (new StringBuilder()).append("\"").append(((String) (obj))).append("\"").toString();
            }
        }
        obj = performCommand(new String[] {
            "cmd.exe", "/C", (new StringBuilder()).append("dir /a /-c ").append(s).toString()
        }, 0x7fffffff, l);
        for (int i = ((List) (obj)).size() - 1; i >= 0; i--)
        {
            String s1 = (String)((List) (obj)).get(i);
            if (s1.length() > 0)
            {
                return parseDir(s1, s);
            }
        }

        throw new IOException((new StringBuilder()).append("Command line 'dir /-c' did not return any info for path '").append(s).append("'").toString());
    }

    Process openProcess(String as[])
        throws IOException
    {
        return Runtime.getRuntime().exec(as);
    }

    long parseBytes(String s, String s1)
        throws IOException
    {
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IOExceptionWithCause((new StringBuilder()).append("Command line '").append(DF).append("' did not return numeric data as expected ").append("for path '").append(s1).append("'- check path is valid").toString(), s);
        }
        if (l >= 0L)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        throw new IOException((new StringBuilder()).append("Command line '").append(DF).append("' did not find free space in response ").append("for path '").append(s1).append("'- check path is valid").toString());
        return l;
    }

    long parseDir(String s, String s1)
        throws IOException
    {
        int i;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        i = s.length() - 1;
_L11:
        int k;
        int i1;
        k = ((flag1) ? 1 : 0);
        i1 = i;
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (!Character.isDigit(s.charAt(i))) goto _L4; else goto _L3
_L3:
        k = i + 1;
        i1 = i;
_L2:
        i = ((flag) ? 1 : 0);
        if (i1 < 0) goto _L6; else goto _L5
_L5:
        char c = s.charAt(i1);
        if (Character.isDigit(c) || c == ',' || c == '.') goto _L8; else goto _L7
_L7:
        i = i1 + 1;
_L6:
        if (i1 < 0)
        {
            throw new IOException((new StringBuilder()).append("Command line 'dir /-c' did not return valid info for path '").append(s1).append("'").toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        i--;
        continue; /* Loop/switch isn't completed */
_L8:
        i1--;
        if (true) goto _L2; else goto _L9
_L9:
        s = new StringBuilder(s.substring(i, k));
        int l;
        for (int j = 0; j < s.length(); j = l + 1)
        {
            if (s.charAt(j) != ',')
            {
                l = j;
                if (s.charAt(j) != '.')
                {
                    continue;
                }
            }
            s.deleteCharAt(j);
            l = j - 1;
        }

        return parseBytes(s.toString(), s1);
        if (true) goto _L11; else goto _L10
_L10:
    }

    List performCommand(String as[], int i, long l)
        throws IOException
    {
        Object obj;
        Process process;
        Object obj1;
        Object obj2;
        java.io.OutputStream outputstream;
        java.io.OutputStream outputstream1;
        java.io.InputStream inputstream;
        Process process1;
        Object obj3;
        Process process2;
        java.io.OutputStream outputstream2;
        java.io.InputStream inputstream1;
        java.io.InputStream inputstream2;
        BufferedReader bufferedreader;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        ArrayList arraylist;
        arraylist = new ArrayList(20);
        obj8 = null;
        process = null;
        obj7 = null;
        obj2 = null;
        obj6 = null;
        outputstream = null;
        obj5 = null;
        inputstream = null;
        bufferedreader = null;
        obj4 = null;
        obj = inputstream;
        obj1 = obj2;
        obj3 = bufferedreader;
        outputstream1 = outputstream;
        process1 = process;
        inputstream2 = obj5;
        inputstream1 = obj7;
        outputstream2 = obj6;
        process2 = obj8;
        Thread thread = ThreadMonitor.start(l);
        obj = inputstream;
        obj1 = obj2;
        obj3 = bufferedreader;
        outputstream1 = outputstream;
        process1 = process;
        inputstream2 = obj5;
        inputstream1 = obj7;
        outputstream2 = obj6;
        process2 = obj8;
        process = openProcess(as);
        obj = inputstream;
        obj1 = obj2;
        obj3 = bufferedreader;
        outputstream1 = outputstream;
        process1 = process;
        inputstream2 = obj5;
        inputstream1 = obj7;
        outputstream2 = obj6;
        process2 = process;
        obj2 = process.getInputStream();
        obj = inputstream;
        obj1 = obj2;
        obj3 = bufferedreader;
        outputstream1 = outputstream;
        process1 = process;
        inputstream2 = obj5;
        inputstream1 = ((java.io.InputStream) (obj2));
        outputstream2 = obj6;
        process2 = process;
        outputstream = process.getOutputStream();
        obj = inputstream;
        obj1 = obj2;
        obj3 = bufferedreader;
        outputstream1 = outputstream;
        process1 = process;
        inputstream2 = obj5;
        inputstream1 = ((java.io.InputStream) (obj2));
        outputstream2 = outputstream;
        process2 = process;
        inputstream = process.getErrorStream();
        obj = inputstream;
        obj1 = obj2;
        obj3 = bufferedreader;
        outputstream1 = outputstream;
        process1 = process;
        inputstream2 = inputstream;
        inputstream1 = ((java.io.InputStream) (obj2));
        outputstream2 = outputstream;
        process2 = process;
        bufferedreader = new BufferedReader(new InputStreamReader(((java.io.InputStream) (obj2))));
        obj = bufferedreader.readLine();
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        if (arraylist.size() >= i)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        arraylist.add(((String) (obj)).toLowerCase(Locale.ENGLISH).trim());
        obj = bufferedreader.readLine();
          goto _L1
        process.waitFor();
        ThreadMonitor.stop(thread);
        if (process.exitValue() != 0)
        {
            throw new IOException((new StringBuilder()).append("Command line returned OS error code '").append(process.exitValue()).append("' for command ").append(Arrays.asList(as)).toString());
        }
          goto _L2
_L6:
        outputstream1 = outputstream;
        process1 = process;
        throw new IOExceptionWithCause((new StringBuilder()).append("Command line threw an InterruptedException for command ").append(Arrays.asList(as)).append(" timeout=").append(l).toString(), ((Throwable) (obj2)));
        as;
        process = process1;
        outputstream = outputstream1;
_L4:
        IOUtils.closeQuietly(((java.io.InputStream) (obj1)));
        IOUtils.closeQuietly(outputstream);
        IOUtils.closeQuietly(((java.io.InputStream) (obj)));
        IOUtils.closeQuietly(((java.io.Reader) (obj3)));
        if (process != null)
        {
            process.destroy();
        }
        throw as;
_L2:
        try
        {
            if (arraylist.isEmpty())
            {
                throw new IOException((new StringBuilder()).append("Command line did not return any info for command ").append(Arrays.asList(as)).toString());
            }
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj3 = bufferedreader;
            obj1 = obj2;
            obj2 = obj;
            obj = inputstream;
        }
        finally
        {
            obj3 = bufferedreader;
            obj = inputstream;
            obj1 = obj2;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        IOUtils.closeQuietly(((java.io.InputStream) (obj2)));
        IOUtils.closeQuietly(outputstream);
        IOUtils.closeQuietly(inputstream);
        IOUtils.closeQuietly(bufferedreader);
        if (process != null)
        {
            process.destroy();
        }
        return arraylist;
        obj2;
        obj = inputstream2;
        obj1 = inputstream1;
        obj3 = obj4;
        outputstream = outputstream2;
        process = process2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        String s;
        INSTANCE = new FileSystemUtils();
        s = "df";
        Object obj = System.getProperty("os.name");
        if (obj != null) goto _L2; else goto _L1
_L1:
        int i;
        try
        {
            throw new IOException("os.name not found");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            i = -1;
        }
_L4:
        OS = i;
        DF = s;
        return;
_L2:
        obj = ((String) (obj)).toLowerCase(Locale.ENGLISH);
        if (((String) (obj)).indexOf("windows") != -1)
        {
            i = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (((String) (obj)).indexOf("linux") != -1 || ((String) (obj)).indexOf("mpe/ix") != -1 || ((String) (obj)).indexOf("freebsd") != -1 || ((String) (obj)).indexOf("irix") != -1 || ((String) (obj)).indexOf("digital unix") != -1 || ((String) (obj)).indexOf("unix") != -1 || ((String) (obj)).indexOf("mac os x") != -1)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        if (((String) (obj)).indexOf("sun os") != -1 || ((String) (obj)).indexOf("sunos") != -1 || ((String) (obj)).indexOf("solaris") != -1)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        if (((String) (obj)).indexOf("hp-ux") != -1)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        i = ((String) (obj)).indexOf("aix");
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        i = 3;
        continue; /* Loop/switch isn't completed */
        i = 0;
        continue; /* Loop/switch isn't completed */
        i = 2;
        continue; /* Loop/switch isn't completed */
        i = 3;
        s = "/usr/xpg4/bin/df";
        if (true) goto _L4; else goto _L3
_L3:
    }
}
