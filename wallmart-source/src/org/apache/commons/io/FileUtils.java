// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.io.output.NullOutputStream;

// Referenced classes of package org.apache.commons.io:
//            IOUtils, FilenameUtils, FileExistsException, Charsets, 
//            LineIterator

public class FileUtils
{

    public static final File EMPTY_FILE_ARRAY[] = new File[0];
    private static final long FILE_COPY_BUFFER_SIZE = 0x1e00000L;
    public static final long ONE_EB = 0x1000000000000000L;
    public static final BigInteger ONE_EB_BI;
    public static final long ONE_GB = 0x40000000L;
    public static final BigInteger ONE_GB_BI;
    public static final long ONE_KB = 1024L;
    public static final BigInteger ONE_KB_BI;
    public static final long ONE_MB = 0x100000L;
    public static final BigInteger ONE_MB_BI;
    public static final long ONE_PB = 0x4000000000000L;
    public static final BigInteger ONE_PB_BI;
    public static final long ONE_TB = 0x10000000000L;
    public static final BigInteger ONE_TB_BI;
    public static final BigInteger ONE_YB;
    public static final BigInteger ONE_ZB;
    private static final Charset UTF8 = Charset.forName("UTF-8");

    public FileUtils()
    {
    }

    public static String byteCountToDisplaySize(long l)
    {
        return byteCountToDisplaySize(BigInteger.valueOf(l));
    }

    public static String byteCountToDisplaySize(BigInteger biginteger)
    {
        if (biginteger.divide(ONE_EB_BI).compareTo(BigInteger.ZERO) > 0)
        {
            return (new StringBuilder()).append(String.valueOf(biginteger.divide(ONE_EB_BI))).append(" EB").toString();
        }
        if (biginteger.divide(ONE_PB_BI).compareTo(BigInteger.ZERO) > 0)
        {
            return (new StringBuilder()).append(String.valueOf(biginteger.divide(ONE_PB_BI))).append(" PB").toString();
        }
        if (biginteger.divide(ONE_TB_BI).compareTo(BigInteger.ZERO) > 0)
        {
            return (new StringBuilder()).append(String.valueOf(biginteger.divide(ONE_TB_BI))).append(" TB").toString();
        }
        if (biginteger.divide(ONE_GB_BI).compareTo(BigInteger.ZERO) > 0)
        {
            return (new StringBuilder()).append(String.valueOf(biginteger.divide(ONE_GB_BI))).append(" GB").toString();
        }
        if (biginteger.divide(ONE_MB_BI).compareTo(BigInteger.ZERO) > 0)
        {
            return (new StringBuilder()).append(String.valueOf(biginteger.divide(ONE_MB_BI))).append(" MB").toString();
        }
        if (biginteger.divide(ONE_KB_BI).compareTo(BigInteger.ZERO) > 0)
        {
            return (new StringBuilder()).append(String.valueOf(biginteger.divide(ONE_KB_BI))).append(" KB").toString();
        } else
        {
            return (new StringBuilder()).append(String.valueOf(biginteger)).append(" bytes").toString();
        }
    }

    private static void checkDirectory(File file)
    {
        if (!file.exists())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(file).append(" does not exist").toString());
        }
        if (!file.isDirectory())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(file).append(" is not a directory").toString());
        } else
        {
            return;
        }
    }

    public static Checksum checksum(File file, Checksum checksum1)
        throws IOException
    {
        Object obj;
        if (file.isDirectory())
        {
            throw new IllegalArgumentException("Checksums can't be computed on directories");
        }
        obj = null;
        file = new CheckedInputStream(new FileInputStream(file), checksum1);
        IOUtils.copy(file, new NullOutputStream());
        IOUtils.closeQuietly(file);
        return checksum1;
        checksum1;
        file = obj;
_L2:
        IOUtils.closeQuietly(file);
        throw checksum1;
        checksum1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static long checksumCRC32(File file)
        throws IOException
    {
        CRC32 crc32 = new CRC32();
        checksum(file, crc32);
        return crc32.getValue();
    }

    public static void cleanDirectory(File file)
        throws IOException
    {
        if (!file.exists())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(file).append(" does not exist").toString());
        }
        if (!file.isDirectory())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(file).append(" is not a directory").toString());
        }
        File afile[] = file.listFiles();
        if (afile == null)
        {
            throw new IOException((new StringBuilder()).append("Failed to list contents of ").append(file).toString());
        }
        file = null;
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file1 = afile[i];
            try
            {
                forceDelete(file1);
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            i++;
        }
        if (file != null)
        {
            throw file;
        } else
        {
            return;
        }
    }

    private static void cleanDirectoryOnExit(File file)
        throws IOException
    {
        if (!file.exists())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(file).append(" does not exist").toString());
        }
        if (!file.isDirectory())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(file).append(" is not a directory").toString());
        }
        File afile[] = file.listFiles();
        if (afile == null)
        {
            throw new IOException((new StringBuilder()).append("Failed to list contents of ").append(file).toString());
        }
        file = null;
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file1 = afile[i];
            try
            {
                forceDeleteOnExit(file1);
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            i++;
        }
        if (file != null)
        {
            throw file;
        } else
        {
            return;
        }
    }

    public static boolean contentEquals(File file, File file1)
        throws IOException
    {
        boolean flag = file.exists();
        if (flag == file1.exists()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!flag)
        {
            return true;
        }
        if (file.isDirectory() || file1.isDirectory())
        {
            throw new IOException("Can't compare directories, only files");
        }
        if (file.length() != file1.length()) goto _L1; else goto _L3
_L3:
        Object obj;
        FileInputStream fileinputstream;
        if (file.getCanonicalFile().equals(file1.getCanonicalFile()))
        {
            return true;
        }
        fileinputstream = null;
        obj = null;
        file = new FileInputStream(file);
        fileinputstream = new FileInputStream(file1);
        flag = IOUtils.contentEquals(file, fileinputstream);
        IOUtils.closeQuietly(file);
        IOUtils.closeQuietly(fileinputstream);
        return flag;
        file1;
        file = fileinputstream;
_L5:
        IOUtils.closeQuietly(file);
        IOUtils.closeQuietly(((InputStream) (obj)));
        throw file1;
        file1;
        continue; /* Loop/switch isn't completed */
        file1;
        obj = fileinputstream;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean contentEqualsIgnoreEOL(File file, File file1, String s)
        throws IOException
    {
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = file.exists();
        if (flag2 == file1.exists()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!flag2) goto _L4; else goto _L3
_L3:
        if (file.isDirectory() || file1.isDirectory())
        {
            throw new IOException("Can't compare directories, only files");
        }
        flag = flag1;
        if (file.getCanonicalFile().equals(file1.getCanonicalFile())) goto _L4; else goto _L5
_L5:
        File file2;
        File file3;
        Object obj;
        file2 = null;
        obj = null;
        file3 = null;
        if (s != null) goto _L7; else goto _L6
_L6:
        s = new InputStreamReader(new FileInputStream(file));
        file = s;
        file1 = new InputStreamReader(new FileInputStream(file1));
        file = s;
_L9:
        file2 = file;
        file3 = file1;
        flag = IOUtils.contentEqualsIgnoreEOL(file, file1);
        IOUtils.closeQuietly(file);
        IOUtils.closeQuietly(file1);
        return flag;
_L7:
        InputStreamReader inputstreamreader = new InputStreamReader(new FileInputStream(file), s);
        file = inputstreamreader;
        file1 = new InputStreamReader(new FileInputStream(file1), s);
        file = inputstreamreader;
        if (true) goto _L9; else goto _L8
_L8:
        file;
_L11:
        IOUtils.closeQuietly(file2);
        IOUtils.closeQuietly(file3);
        throw file;
        file1;
        file2 = file;
        file3 = obj;
        file = file1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static File[] convertFileCollectionToFileArray(Collection collection)
    {
        return (File[])collection.toArray(new File[collection.size()]);
    }

    public static void copyDirectory(File file, File file1)
        throws IOException
    {
        copyDirectory(file, file1, true);
    }

    public static void copyDirectory(File file, File file1, FileFilter filefilter)
        throws IOException
    {
        copyDirectory(file, file1, filefilter, true);
    }

    public static void copyDirectory(File file, File file1, FileFilter filefilter, boolean flag)
        throws IOException
    {
        if (file == null)
        {
            throw new NullPointerException("Source must not be null");
        }
        if (file1 == null)
        {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists())
        {
            throw new FileNotFoundException((new StringBuilder()).append("Source '").append(file).append("' does not exist").toString());
        }
        if (!file.isDirectory())
        {
            throw new IOException((new StringBuilder()).append("Source '").append(file).append("' exists but is not a directory").toString());
        }
        if (file.getCanonicalPath().equals(file1.getCanonicalPath()))
        {
            throw new IOException((new StringBuilder()).append("Source '").append(file).append("' and destination '").append(file1).append("' are the same").toString());
        }
        Object obj = null;
        ArrayList arraylist = obj;
        if (file1.getCanonicalPath().startsWith(file.getCanonicalPath()))
        {
            File afile[];
            if (filefilter == null)
            {
                afile = file.listFiles();
            } else
            {
                afile = file.listFiles(filefilter);
            }
            arraylist = obj;
            if (afile != null)
            {
                arraylist = obj;
                if (afile.length > 0)
                {
                    ArrayList arraylist1 = new ArrayList(afile.length);
                    int j = afile.length;
                    int i = 0;
                    do
                    {
                        arraylist = arraylist1;
                        if (i >= j)
                        {
                            break;
                        }
                        arraylist1.add((new File(file1, afile[i].getName())).getCanonicalPath());
                        i++;
                    } while (true);
                }
            }
        }
        doCopyDirectory(file, file1, filefilter, flag, arraylist);
    }

    public static void copyDirectory(File file, File file1, boolean flag)
        throws IOException
    {
        copyDirectory(file, file1, null, flag);
    }

    public static void copyDirectoryToDirectory(File file, File file1)
        throws IOException
    {
        if (file == null)
        {
            throw new NullPointerException("Source must not be null");
        }
        if (file.exists() && !file.isDirectory())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Source '").append(file1).append("' is not a directory").toString());
        }
        if (file1 == null)
        {
            throw new NullPointerException("Destination must not be null");
        }
        if (file1.exists() && !file1.isDirectory())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Destination '").append(file1).append("' is not a directory").toString());
        } else
        {
            copyDirectory(file, new File(file1, file.getName()), true);
            return;
        }
    }

    public static long copyFile(File file, OutputStream outputstream)
        throws IOException
    {
        file = new FileInputStream(file);
        long l = IOUtils.copyLarge(file, outputstream);
        file.close();
        return l;
        outputstream;
        file.close();
        throw outputstream;
    }

    public static void copyFile(File file, File file1)
        throws IOException
    {
        copyFile(file, file1, true);
    }

    public static void copyFile(File file, File file1, boolean flag)
        throws IOException
    {
        if (file == null)
        {
            throw new NullPointerException("Source must not be null");
        }
        if (file1 == null)
        {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists())
        {
            throw new FileNotFoundException((new StringBuilder()).append("Source '").append(file).append("' does not exist").toString());
        }
        if (file.isDirectory())
        {
            throw new IOException((new StringBuilder()).append("Source '").append(file).append("' exists but is a directory").toString());
        }
        if (file.getCanonicalPath().equals(file1.getCanonicalPath()))
        {
            throw new IOException((new StringBuilder()).append("Source '").append(file).append("' and destination '").append(file1).append("' are the same").toString());
        }
        File file2 = file1.getParentFile();
        if (file2 != null && !file2.mkdirs() && !file2.isDirectory())
        {
            throw new IOException((new StringBuilder()).append("Destination '").append(file2).append("' directory cannot be created").toString());
        }
        if (file1.exists() && !file1.canWrite())
        {
            throw new IOException((new StringBuilder()).append("Destination '").append(file1).append("' exists but is read-only").toString());
        } else
        {
            doCopyFile(file, file1, flag);
            return;
        }
    }

    public static void copyFileToDirectory(File file, File file1)
        throws IOException
    {
        copyFileToDirectory(file, file1, true);
    }

    public static void copyFileToDirectory(File file, File file1, boolean flag)
        throws IOException
    {
        if (file1 == null)
        {
            throw new NullPointerException("Destination must not be null");
        }
        if (file1.exists() && !file1.isDirectory())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Destination '").append(file1).append("' is not a directory").toString());
        } else
        {
            copyFile(file, new File(file1, file.getName()), flag);
            return;
        }
    }

    public static void copyInputStreamToFile(InputStream inputstream, File file)
        throws IOException
    {
        file = openOutputStream(file);
        IOUtils.copy(inputstream, file);
        file.close();
        IOUtils.closeQuietly(file);
        IOUtils.closeQuietly(inputstream);
        return;
        Exception exception;
        exception;
        IOUtils.closeQuietly(file);
        throw exception;
        file;
        IOUtils.closeQuietly(inputstream);
        throw file;
    }

    public static void copyURLToFile(URL url, File file)
        throws IOException
    {
        copyInputStreamToFile(url.openStream(), file);
    }

    public static void copyURLToFile(URL url, File file, int i, int j)
        throws IOException
    {
        url = url.openConnection();
        url.setConnectTimeout(i);
        url.setReadTimeout(j);
        copyInputStreamToFile(url.getInputStream(), file);
    }

    static String decodeUrl(String s)
    {
        Object obj;
        Object obj1;
        int i;
        int l;
        obj = s;
        obj1 = obj;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        obj1 = obj;
        if (s.indexOf('%') < 0)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        l = s.length();
        obj = new StringBuffer();
        obj1 = ByteBuffer.allocate(l);
        i = 0;
_L4:
        int j;
        int k;
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (s.charAt(i) != '%')
        {
            break MISSING_BLOCK_LABEL_215;
        }
        k = i;
_L2:
        i = k;
        ((ByteBuffer) (obj1)).put((byte)Integer.parseInt(s.substring(k + 1, k + 3), 16));
        j = k + 3;
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        i = j;
        char c = s.charAt(j);
        k = j;
        if (c == '%') goto _L2; else goto _L1
_L1:
        i = j;
        if (((ByteBuffer) (obj1)).position() > 0)
        {
            ((ByteBuffer) (obj1)).flip();
            ((StringBuffer) (obj)).append(UTF8.decode(((ByteBuffer) (obj1))).toString());
            ((ByteBuffer) (obj1)).clear();
            i = j;
        }
        continue; /* Loop/switch isn't completed */
        RuntimeException runtimeexception;
        runtimeexception;
        j = i;
        if (((ByteBuffer) (obj1)).position() > 0)
        {
            ((ByteBuffer) (obj1)).flip();
            ((StringBuffer) (obj)).append(UTF8.decode(((ByteBuffer) (obj1))).toString());
            ((ByteBuffer) (obj1)).clear();
            j = i;
        }
        ((StringBuffer) (obj)).append(s.charAt(j));
        i = j + 1;
        if (true) goto _L4; else goto _L3
        s;
        if (((ByteBuffer) (obj1)).position() > 0)
        {
            ((ByteBuffer) (obj1)).flip();
            ((StringBuffer) (obj)).append(UTF8.decode(((ByteBuffer) (obj1))).toString());
            ((ByteBuffer) (obj1)).clear();
        }
        throw s;
_L3:
        obj1 = ((StringBuffer) (obj)).toString();
        return ((String) (obj1));
    }

    public static void deleteDirectory(File file)
        throws IOException
    {
        if (file.exists())
        {
            if (!isSymlink(file))
            {
                cleanDirectory(file);
            }
            if (!file.delete())
            {
                throw new IOException((new StringBuilder()).append("Unable to delete directory ").append(file).append(".").toString());
            }
        }
    }

    private static void deleteDirectoryOnExit(File file)
        throws IOException
    {
        if (file.exists())
        {
            file.deleteOnExit();
            if (!isSymlink(file))
            {
                cleanDirectoryOnExit(file);
                return;
            }
        }
    }

    public static boolean deleteQuietly(File file)
    {
        if (file == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            if (file.isDirectory())
            {
                cleanDirectory(file);
            }
        }
        catch (Exception exception) { }
        try
        {
            flag = file.delete();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        return flag;
    }

    public static boolean directoryContains(File file, File file1)
        throws IOException
    {
        if (file == null)
        {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (!file.isDirectory())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Not a directory: ").append(file).toString());
        }
        while (file1 == null || !file.exists() || !file1.exists()) 
        {
            return false;
        }
        return FilenameUtils.directoryContains(file.getCanonicalPath(), file1.getCanonicalPath());
    }

    private static void doCopyDirectory(File file, File file1, FileFilter filefilter, boolean flag, List list)
        throws IOException
    {
        File afile[];
        if (filefilter == null)
        {
            afile = file.listFiles();
        } else
        {
            afile = file.listFiles(filefilter);
        }
        if (afile == null)
        {
            throw new IOException((new StringBuilder()).append("Failed to list contents of ").append(file).toString());
        }
        if (file1.exists())
        {
            if (!file1.isDirectory())
            {
                throw new IOException((new StringBuilder()).append("Destination '").append(file1).append("' exists but is not a directory").toString());
            }
        } else
        if (!file1.mkdirs() && !file1.isDirectory())
        {
            throw new IOException((new StringBuilder()).append("Destination '").append(file1).append("' directory cannot be created").toString());
        }
        if (!file1.canWrite())
        {
            throw new IOException((new StringBuilder()).append("Destination '").append(file1).append("' cannot be written to").toString());
        }
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file2 = afile[i];
            File file3 = new File(file1, file2.getName());
            if (list == null || !list.contains(file2.getCanonicalPath()))
            {
                if (file2.isDirectory())
                {
                    doCopyDirectory(file2, file3, filefilter, flag, list);
                } else
                {
                    doCopyFile(file2, file3, flag);
                }
            }
            i++;
        }
        if (flag)
        {
            file1.setLastModified(file.lastModified());
        }
    }

    private static void doCopyFile(File file, File file1, boolean flag)
        throws IOException
    {
        FileChannel filechannel;
        FileChannel filechannel1;
        FileChannel filechannel2;
        FileOutputStream fileoutputstream;
        FileChannel filechannel3;
        Object obj1;
        if (file1.exists() && file1.isDirectory())
        {
            throw new IOException((new StringBuilder()).append("Destination '").append(file1).append("' exists but is a directory").toString());
        }
        fileoutputstream = null;
        filechannel2 = null;
        obj1 = null;
        filechannel1 = null;
        filechannel3 = null;
        filechannel = null;
        Object obj = new FileInputStream(file);
        fileoutputstream = new FileOutputStream(file1);
        filechannel = filechannel3;
        filechannel1 = obj1;
        filechannel2 = ((FileInputStream) (obj)).getChannel();
        filechannel = filechannel3;
        filechannel1 = filechannel2;
        filechannel3 = fileoutputstream.getChannel();
        filechannel = filechannel3;
        filechannel1 = filechannel2;
        long l2 = filechannel2.size();
        long l = 0L;
          goto _L1
_L8:
        filechannel = filechannel3;
        filechannel1 = filechannel2;
        long l1;
        l1 = filechannel3.transferFrom(filechannel2, l, l1);
        l += l1;
          goto _L1
_L6:
        l1 = l2 - l;
        continue; /* Loop/switch isn't completed */
        file1;
        obj = filechannel2;
        file = fileoutputstream;
_L2:
        IOUtils.closeQuietly(filechannel);
        IOUtils.closeQuietly(((OutputStream) (obj)));
        IOUtils.closeQuietly(filechannel1);
        IOUtils.closeQuietly(file);
        throw file1;
_L4:
        IOUtils.closeQuietly(filechannel3);
        IOUtils.closeQuietly(fileoutputstream);
        IOUtils.closeQuietly(filechannel2);
        IOUtils.closeQuietly(((InputStream) (obj)));
        if (file.length() != file1.length())
        {
            throw new IOException((new StringBuilder()).append("Failed to copy full contents from '").append(file).append("' to '").append(file1).append("'").toString());
        }
        if (flag)
        {
            file1.setLastModified(file.lastModified());
        }
        return;
        file1;
        file = ((File) (obj));
        obj = filechannel2;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        file1 = fileoutputstream;
        file = ((File) (obj));
        obj = file1;
        file1 = exception;
        if (true) goto _L2; else goto _L1
_L1:
        if (l >= l2) goto _L4; else goto _L3
_L3:
        if (l2 - l <= 0x1e00000L) goto _L6; else goto _L5
_L5:
        l1 = 0x1e00000L;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void forceDelete(File file)
        throws IOException
    {
        if (file.isDirectory())
        {
            deleteDirectory(file);
        } else
        {
            boolean flag = file.exists();
            if (!file.delete())
            {
                if (!flag)
                {
                    throw new FileNotFoundException((new StringBuilder()).append("File does not exist: ").append(file).toString());
                } else
                {
                    throw new IOException((new StringBuilder()).append("Unable to delete file: ").append(file).toString());
                }
            }
        }
    }

    public static void forceDeleteOnExit(File file)
        throws IOException
    {
        if (file.isDirectory())
        {
            deleteDirectoryOnExit(file);
            return;
        } else
        {
            file.deleteOnExit();
            return;
        }
    }

    public static void forceMkdir(File file)
        throws IOException
    {
        if (file.exists())
        {
            if (!file.isDirectory())
            {
                throw new IOException((new StringBuilder()).append("File ").append(file).append(" exists and is ").append("not a directory. Unable to create directory.").toString());
            }
        } else
        if (!file.mkdirs() && !file.isDirectory())
        {
            throw new IOException((new StringBuilder()).append("Unable to create directory ").append(file).toString());
        }
    }

    public static transient File getFile(File file, String as[])
    {
        if (file == null)
        {
            throw new NullPointerException("directorydirectory must not be null");
        }
        if (as == null)
        {
            throw new NullPointerException("names must not be null");
        }
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            file = new File(file, as[i]);
        }

        return file;
    }

    public static transient File getFile(String as[])
    {
        if (as == null)
        {
            throw new NullPointerException("names must not be null");
        }
        int j = as.length;
        int i = 0;
        File file = null;
        while (i < j) 
        {
            String s = as[i];
            if (file == null)
            {
                file = new File(s);
            } else
            {
                file = new File(file, s);
            }
            i++;
        }
        return file;
    }

    public static File getTempDirectory()
    {
        return new File(getTempDirectoryPath());
    }

    public static String getTempDirectoryPath()
    {
        return System.getProperty("java.io.tmpdir");
    }

    public static File getUserDirectory()
    {
        return new File(getUserDirectoryPath());
    }

    public static String getUserDirectoryPath()
    {
        return System.getProperty("user.home");
    }

    private static void innerListFiles(Collection collection, File file, IOFileFilter iofilefilter, boolean flag)
    {
        file = file.listFiles(iofilefilter);
        if (file != null)
        {
            int j = file.length;
            int i = 0;
            while (i < j) 
            {
                File file1 = file[i];
                if (file1.isDirectory())
                {
                    if (flag)
                    {
                        collection.add(file1);
                    }
                    innerListFiles(collection, file1, iofilefilter, flag);
                } else
                {
                    collection.add(file1);
                }
                i++;
            }
        }
    }

    public static boolean isFileNewer(File file, long l)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("No specified file");
        }
        while (!file.exists() || file.lastModified() <= l) 
        {
            return false;
        }
        return true;
    }

    public static boolean isFileNewer(File file, File file1)
    {
        if (file1 == null)
        {
            throw new IllegalArgumentException("No specified reference file");
        }
        if (!file1.exists())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("The reference file '").append(file1).append("' doesn't exist").toString());
        } else
        {
            return isFileNewer(file, file1.lastModified());
        }
    }

    public static boolean isFileNewer(File file, Date date)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("No specified date");
        } else
        {
            return isFileNewer(file, date.getTime());
        }
    }

    public static boolean isFileOlder(File file, long l)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("No specified file");
        }
        while (!file.exists() || file.lastModified() >= l) 
        {
            return false;
        }
        return true;
    }

    public static boolean isFileOlder(File file, File file1)
    {
        if (file1 == null)
        {
            throw new IllegalArgumentException("No specified reference file");
        }
        if (!file1.exists())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("The reference file '").append(file1).append("' doesn't exist").toString());
        } else
        {
            return isFileOlder(file, file1.lastModified());
        }
    }

    public static boolean isFileOlder(File file, Date date)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("No specified date");
        } else
        {
            return isFileOlder(file, date.getTime());
        }
    }

    public static boolean isSymlink(File file)
        throws IOException
    {
        if (file == null)
        {
            throw new NullPointerException("File must not be null");
        }
        if (!FilenameUtils.isSystemWindows())
        {
            if (file.getParent() != null)
            {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            if (!file.getCanonicalFile().equals(file.getAbsoluteFile()))
            {
                return true;
            }
        }
        return false;
    }

    public static Iterator iterateFiles(File file, IOFileFilter iofilefilter, IOFileFilter iofilefilter1)
    {
        return listFiles(file, iofilefilter, iofilefilter1).iterator();
    }

    public static Iterator iterateFiles(File file, String as[], boolean flag)
    {
        return listFiles(file, as, flag).iterator();
    }

    public static Iterator iterateFilesAndDirs(File file, IOFileFilter iofilefilter, IOFileFilter iofilefilter1)
    {
        return listFilesAndDirs(file, iofilefilter, iofilefilter1).iterator();
    }

    public static LineIterator lineIterator(File file)
        throws IOException
    {
        return lineIterator(file, null);
    }

    public static LineIterator lineIterator(File file, String s)
        throws IOException
    {
        File file2 = null;
        File file1 = null;
        try
        {
            file = openInputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            IOUtils.closeQuietly(file1);
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            IOUtils.closeQuietly(file2);
            throw file;
        }
        file1 = file;
        file2 = file;
        file = IOUtils.lineIterator(file, s);
        return file;
    }

    public static Collection listFiles(File file, IOFileFilter iofilefilter, IOFileFilter iofilefilter1)
    {
        validateListFilesParameters(file, iofilefilter);
        iofilefilter = setUpEffectiveFileFilter(iofilefilter);
        iofilefilter1 = setUpEffectiveDirFilter(iofilefilter1);
        LinkedList linkedlist = new LinkedList();
        innerListFiles(linkedlist, file, FileFilterUtils.or(new IOFileFilter[] {
            iofilefilter, iofilefilter1
        }), false);
        return linkedlist;
    }

    public static Collection listFiles(File file, String as[], boolean flag)
    {
        IOFileFilter iofilefilter;
        if (as == null)
        {
            as = TrueFileFilter.INSTANCE;
        } else
        {
            as = new SuffixFileFilter(toSuffixes(as));
        }
        if (flag)
        {
            iofilefilter = TrueFileFilter.INSTANCE;
        } else
        {
            iofilefilter = FalseFileFilter.INSTANCE;
        }
        return listFiles(file, ((IOFileFilter) (as)), iofilefilter);
    }

    public static Collection listFilesAndDirs(File file, IOFileFilter iofilefilter, IOFileFilter iofilefilter1)
    {
        validateListFilesParameters(file, iofilefilter);
        iofilefilter = setUpEffectiveFileFilter(iofilefilter);
        iofilefilter1 = setUpEffectiveDirFilter(iofilefilter1);
        LinkedList linkedlist = new LinkedList();
        if (file.isDirectory())
        {
            linkedlist.add(file);
        }
        innerListFiles(linkedlist, file, FileFilterUtils.or(new IOFileFilter[] {
            iofilefilter, iofilefilter1
        }), true);
        return linkedlist;
    }

    public static void moveDirectory(File file, File file1)
        throws IOException
    {
        if (file == null)
        {
            throw new NullPointerException("Source must not be null");
        }
        if (file1 == null)
        {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists())
        {
            throw new FileNotFoundException((new StringBuilder()).append("Source '").append(file).append("' does not exist").toString());
        }
        if (!file.isDirectory())
        {
            throw new IOException((new StringBuilder()).append("Source '").append(file).append("' is not a directory").toString());
        }
        if (file1.exists())
        {
            throw new FileExistsException((new StringBuilder()).append("Destination '").append(file1).append("' already exists").toString());
        }
        if (!file.renameTo(file1))
        {
            if (file1.getCanonicalPath().startsWith(file.getCanonicalPath()))
            {
                throw new IOException((new StringBuilder()).append("Cannot move directory: ").append(file).append(" to a subdirectory of itself: ").append(file1).toString());
            }
            copyDirectory(file, file1);
            deleteDirectory(file);
            if (file.exists())
            {
                throw new IOException((new StringBuilder()).append("Failed to delete original directory '").append(file).append("' after copy to '").append(file1).append("'").toString());
            }
        }
    }

    public static void moveDirectoryToDirectory(File file, File file1, boolean flag)
        throws IOException
    {
        if (file == null)
        {
            throw new NullPointerException("Source must not be null");
        }
        if (file1 == null)
        {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file1.exists() && flag)
        {
            file1.mkdirs();
        }
        if (!file1.exists())
        {
            throw new FileNotFoundException((new StringBuilder()).append("Destination directory '").append(file1).append("' does not exist [createDestDir=").append(flag).append("]").toString());
        }
        if (!file1.isDirectory())
        {
            throw new IOException((new StringBuilder()).append("Destination '").append(file1).append("' is not a directory").toString());
        } else
        {
            moveDirectory(file, new File(file1, file.getName()));
            return;
        }
    }

    public static void moveFile(File file, File file1)
        throws IOException
    {
        if (file == null)
        {
            throw new NullPointerException("Source must not be null");
        }
        if (file1 == null)
        {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists())
        {
            throw new FileNotFoundException((new StringBuilder()).append("Source '").append(file).append("' does not exist").toString());
        }
        if (file.isDirectory())
        {
            throw new IOException((new StringBuilder()).append("Source '").append(file).append("' is a directory").toString());
        }
        if (file1.exists())
        {
            throw new FileExistsException((new StringBuilder()).append("Destination '").append(file1).append("' already exists").toString());
        }
        if (file1.isDirectory())
        {
            throw new IOException((new StringBuilder()).append("Destination '").append(file1).append("' is a directory").toString());
        }
        if (!file.renameTo(file1))
        {
            copyFile(file, file1);
            if (!file.delete())
            {
                deleteQuietly(file1);
                throw new IOException((new StringBuilder()).append("Failed to delete original file '").append(file).append("' after copy to '").append(file1).append("'").toString());
            }
        }
    }

    public static void moveFileToDirectory(File file, File file1, boolean flag)
        throws IOException
    {
        if (file == null)
        {
            throw new NullPointerException("Source must not be null");
        }
        if (file1 == null)
        {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file1.exists() && flag)
        {
            file1.mkdirs();
        }
        if (!file1.exists())
        {
            throw new FileNotFoundException((new StringBuilder()).append("Destination directory '").append(file1).append("' does not exist [createDestDir=").append(flag).append("]").toString());
        }
        if (!file1.isDirectory())
        {
            throw new IOException((new StringBuilder()).append("Destination '").append(file1).append("' is not a directory").toString());
        } else
        {
            moveFile(file, new File(file1, file.getName()));
            return;
        }
    }

    public static void moveToDirectory(File file, File file1, boolean flag)
        throws IOException
    {
        if (file == null)
        {
            throw new NullPointerException("Source must not be null");
        }
        if (file1 == null)
        {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists())
        {
            throw new FileNotFoundException((new StringBuilder()).append("Source '").append(file).append("' does not exist").toString());
        }
        if (file.isDirectory())
        {
            moveDirectoryToDirectory(file, file1, flag);
            return;
        } else
        {
            moveFileToDirectory(file, file1, flag);
            return;
        }
    }

    public static FileInputStream openInputStream(File file)
        throws IOException
    {
        if (file.exists())
        {
            if (file.isDirectory())
            {
                throw new IOException((new StringBuilder()).append("File '").append(file).append("' exists but is a directory").toString());
            }
            if (!file.canRead())
            {
                throw new IOException((new StringBuilder()).append("File '").append(file).append("' cannot be read").toString());
            } else
            {
                return new FileInputStream(file);
            }
        } else
        {
            throw new FileNotFoundException((new StringBuilder()).append("File '").append(file).append("' does not exist").toString());
        }
    }

    public static FileOutputStream openOutputStream(File file)
        throws IOException
    {
        return openOutputStream(file, false);
    }

    public static FileOutputStream openOutputStream(File file, boolean flag)
        throws IOException
    {
        if (file.exists())
        {
            if (file.isDirectory())
            {
                throw new IOException((new StringBuilder()).append("File '").append(file).append("' exists but is a directory").toString());
            }
            if (!file.canWrite())
            {
                throw new IOException((new StringBuilder()).append("File '").append(file).append("' cannot be written to").toString());
            }
        } else
        {
            File file1 = file.getParentFile();
            if (file1 != null && !file1.mkdirs() && !file1.isDirectory())
            {
                throw new IOException((new StringBuilder()).append("Directory '").append(file1).append("' could not be created").toString());
            }
        }
        return new FileOutputStream(file, flag);
    }

    public static byte[] readFileToByteArray(File file)
        throws IOException
    {
        FileInputStream fileinputstream = null;
        FileInputStream fileinputstream1 = openInputStream(file);
        fileinputstream = fileinputstream1;
        file = IOUtils.toByteArray(fileinputstream1, file.length());
        IOUtils.closeQuietly(fileinputstream1);
        return file;
        file;
        IOUtils.closeQuietly(fileinputstream);
        throw file;
    }

    public static String readFileToString(File file)
        throws IOException
    {
        return readFileToString(file, Charset.defaultCharset());
    }

    public static String readFileToString(File file, String s)
        throws IOException
    {
        return readFileToString(file, Charsets.toCharset(s));
    }

    public static String readFileToString(File file, Charset charset)
        throws IOException
    {
        File file1 = null;
        file = openInputStream(file);
        file1 = file;
        charset = IOUtils.toString(file, Charsets.toCharset(charset));
        IOUtils.closeQuietly(file);
        return charset;
        file;
        IOUtils.closeQuietly(file1);
        throw file;
    }

    public static List readLines(File file)
        throws IOException
    {
        return readLines(file, Charset.defaultCharset());
    }

    public static List readLines(File file, String s)
        throws IOException
    {
        return readLines(file, Charsets.toCharset(s));
    }

    public static List readLines(File file, Charset charset)
        throws IOException
    {
        File file1 = null;
        file = openInputStream(file);
        file1 = file;
        charset = IOUtils.readLines(file, Charsets.toCharset(charset));
        IOUtils.closeQuietly(file);
        return charset;
        file;
        IOUtils.closeQuietly(file1);
        throw file;
    }

    private static IOFileFilter setUpEffectiveDirFilter(IOFileFilter iofilefilter)
    {
        if (iofilefilter == null)
        {
            return FalseFileFilter.INSTANCE;
        } else
        {
            return FileFilterUtils.and(new IOFileFilter[] {
                iofilefilter, DirectoryFileFilter.INSTANCE
            });
        }
    }

    private static IOFileFilter setUpEffectiveFileFilter(IOFileFilter iofilefilter)
    {
        return FileFilterUtils.and(new IOFileFilter[] {
            iofilefilter, FileFilterUtils.notFileFilter(DirectoryFileFilter.INSTANCE)
        });
    }

    public static long sizeOf(File file)
    {
        if (!file.exists())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(file).append(" does not exist").toString());
        }
        if (file.isDirectory())
        {
            return sizeOfDirectory(file);
        } else
        {
            return file.length();
        }
    }

    public static BigInteger sizeOfAsBigInteger(File file)
    {
        if (!file.exists())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(file).append(" does not exist").toString());
        }
        if (file.isDirectory())
        {
            return sizeOfDirectoryAsBigInteger(file);
        } else
        {
            return BigInteger.valueOf(file.length());
        }
    }

    public static long sizeOfDirectory(File file)
    {
        checkDirectory(file);
        file = file.listFiles();
        if (file != null) goto _L2; else goto _L1
_L1:
        long l1 = 0L;
_L4:
        return l1;
_L2:
        int i;
        int j;
        long l;
        l = 0L;
        j = file.length;
        i = 0;
_L6:
        l1 = l;
        if (i >= j) goto _L4; else goto _L3
_L3:
        File file1;
        file1 = file[i];
        l1 = l;
        if (isSymlink(file1))
        {
            break MISSING_BLOCK_LABEL_79;
        }
        l1 = sizeOf(file1);
        l += l1;
        l1 = l;
        if (l < 0L) goto _L4; else goto _L5
_L5:
        l1 = l;
_L7:
        i++;
        l = l1;
          goto _L6
        IOException ioexception;
        ioexception;
        l1 = l;
          goto _L7
    }

    public static BigInteger sizeOfDirectoryAsBigInteger(File file)
    {
        File afile[];
        checkDirectory(file);
        afile = file.listFiles();
        if (afile != null) goto _L2; else goto _L1
_L1:
        Object obj = BigInteger.ZERO;
_L4:
        return ((BigInteger) (obj));
_L2:
        file = BigInteger.ZERO;
        int j = afile.length;
        int i = 0;
        do
        {
            obj = file;
            if (i >= j)
            {
                continue;
            }
            File file1 = afile[i];
            obj = file;
            try
            {
                if (!isSymlink(file1))
                {
                    obj = file.add(BigInteger.valueOf(sizeOf(file1)));
                }
            }
            catch (IOException ioexception)
            {
                ioexception = file;
            }
            i++;
            file = ((File) (obj));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static File toFile(URL url)
    {
        if (url == null || !"file".equalsIgnoreCase(url.getProtocol()))
        {
            return null;
        } else
        {
            return new File(decodeUrl(url.getFile().replace('/', File.separatorChar)));
        }
    }

    public static File[] toFiles(URL aurl[])
    {
        if (aurl != null && aurl.length != 0) goto _L2; else goto _L1
_L1:
        File afile[] = EMPTY_FILE_ARRAY;
_L4:
        return afile;
_L2:
        File afile1[] = new File[aurl.length];
        int i = 0;
        do
        {
            afile = afile1;
            if (i >= aurl.length)
            {
                continue;
            }
            URL url = aurl[i];
            if (url != null)
            {
                if (!url.getProtocol().equals("file"))
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("URL could not be converted to a File: ").append(url).toString());
                }
                afile1[i] = toFile(url);
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String[] toSuffixes(String as[])
    {
        String as1[] = new String[as.length];
        for (int i = 0; i < as.length; i++)
        {
            as1[i] = (new StringBuilder()).append(".").append(as[i]).toString();
        }

        return as1;
    }

    public static URL[] toURLs(File afile[])
        throws IOException
    {
        URL aurl[] = new URL[afile.length];
        for (int i = 0; i < aurl.length; i++)
        {
            aurl[i] = afile[i].toURI().toURL();
        }

        return aurl;
    }

    public static void touch(File file)
        throws IOException
    {
        if (!file.exists())
        {
            IOUtils.closeQuietly(openOutputStream(file));
        }
        if (!file.setLastModified(System.currentTimeMillis()))
        {
            throw new IOException((new StringBuilder()).append("Unable to set the last modification time for ").append(file).toString());
        } else
        {
            return;
        }
    }

    private static void validateListFilesParameters(File file, IOFileFilter iofilefilter)
    {
        if (!file.isDirectory())
        {
            throw new IllegalArgumentException("Parameter 'directory' is not a directory");
        }
        if (iofilefilter == null)
        {
            throw new NullPointerException("Parameter 'fileFilter' is null");
        } else
        {
            return;
        }
    }

    public static boolean waitFor(File file, int i)
    {
        int k = 0;
        int j = 0;
        do
        {
            if (file.exists())
            {
                break;
            }
            if (j >= 10)
            {
                j = 0;
                if (k > i)
                {
                    return false;
                }
                k++;
            } else
            {
                j++;
            }
            try
            {
                Thread.sleep(100L);
                continue;
            }
            catch (InterruptedException interruptedexception)
            {
                continue;
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            break;
        } while (true);
        return true;
    }

    public static void write(File file, CharSequence charsequence)
        throws IOException
    {
        write(file, charsequence, Charset.defaultCharset(), false);
    }

    public static void write(File file, CharSequence charsequence, String s)
        throws IOException
    {
        write(file, charsequence, s, false);
    }

    public static void write(File file, CharSequence charsequence, String s, boolean flag)
        throws IOException
    {
        write(file, charsequence, Charsets.toCharset(s), flag);
    }

    public static void write(File file, CharSequence charsequence, Charset charset)
        throws IOException
    {
        write(file, charsequence, charset, false);
    }

    public static void write(File file, CharSequence charsequence, Charset charset, boolean flag)
        throws IOException
    {
        if (charsequence == null)
        {
            charsequence = null;
        } else
        {
            charsequence = charsequence.toString();
        }
        writeStringToFile(file, charsequence, charset, flag);
    }

    public static void write(File file, CharSequence charsequence, boolean flag)
        throws IOException
    {
        write(file, charsequence, Charset.defaultCharset(), flag);
    }

    public static void writeByteArrayToFile(File file, byte abyte0[])
        throws IOException
    {
        writeByteArrayToFile(file, abyte0, false);
    }

    public static void writeByteArrayToFile(File file, byte abyte0[], boolean flag)
        throws IOException
    {
        File file1 = null;
        file = openOutputStream(file, flag);
        file1 = file;
        file.write(abyte0);
        file1 = file;
        file.close();
        IOUtils.closeQuietly(file);
        return;
        file;
        IOUtils.closeQuietly(file1);
        throw file;
    }

    public static void writeLines(File file, String s, Collection collection)
        throws IOException
    {
        writeLines(file, s, collection, null, false);
    }

    public static void writeLines(File file, String s, Collection collection, String s1)
        throws IOException
    {
        writeLines(file, s, collection, s1, false);
    }

    public static void writeLines(File file, String s, Collection collection, String s1, boolean flag)
        throws IOException
    {
        File file1 = null;
        file = openOutputStream(file, flag);
        file1 = file;
        BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(file);
        file1 = file;
        IOUtils.writeLines(collection, s1, bufferedoutputstream, s);
        file1 = file;
        bufferedoutputstream.flush();
        file1 = file;
        file.close();
        IOUtils.closeQuietly(file);
        return;
        file;
        IOUtils.closeQuietly(file1);
        throw file;
    }

    public static void writeLines(File file, String s, Collection collection, boolean flag)
        throws IOException
    {
        writeLines(file, s, collection, null, flag);
    }

    public static void writeLines(File file, Collection collection)
        throws IOException
    {
        writeLines(file, null, collection, null, false);
    }

    public static void writeLines(File file, Collection collection, String s)
        throws IOException
    {
        writeLines(file, null, collection, s, false);
    }

    public static void writeLines(File file, Collection collection, String s, boolean flag)
        throws IOException
    {
        writeLines(file, null, collection, s, flag);
    }

    public static void writeLines(File file, Collection collection, boolean flag)
        throws IOException
    {
        writeLines(file, null, collection, null, flag);
    }

    public static void writeStringToFile(File file, String s)
        throws IOException
    {
        writeStringToFile(file, s, Charset.defaultCharset(), false);
    }

    public static void writeStringToFile(File file, String s, String s1)
        throws IOException
    {
        writeStringToFile(file, s, s1, false);
    }

    public static void writeStringToFile(File file, String s, String s1, boolean flag)
        throws IOException
    {
        writeStringToFile(file, s, Charsets.toCharset(s1), flag);
    }

    public static void writeStringToFile(File file, String s, Charset charset)
        throws IOException
    {
        writeStringToFile(file, s, charset, false);
    }

    public static void writeStringToFile(File file, String s, Charset charset, boolean flag)
        throws IOException
    {
        File file1 = null;
        file = openOutputStream(file, flag);
        file1 = file;
        IOUtils.write(s, file, charset);
        file1 = file;
        file.close();
        IOUtils.closeQuietly(file);
        return;
        file;
        IOUtils.closeQuietly(file1);
        throw file;
    }

    public static void writeStringToFile(File file, String s, boolean flag)
        throws IOException
    {
        writeStringToFile(file, s, Charset.defaultCharset(), flag);
    }

    static 
    {
        ONE_KB_BI = BigInteger.valueOf(1024L);
        ONE_MB_BI = ONE_KB_BI.multiply(ONE_KB_BI);
        ONE_GB_BI = ONE_KB_BI.multiply(ONE_MB_BI);
        ONE_TB_BI = ONE_KB_BI.multiply(ONE_GB_BI);
        ONE_PB_BI = ONE_KB_BI.multiply(ONE_TB_BI);
        ONE_EB_BI = ONE_KB_BI.multiply(ONE_PB_BI);
        ONE_ZB = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(0x1000000000000000L));
        ONE_YB = ONE_KB_BI.multiply(ONE_ZB);
    }
}
