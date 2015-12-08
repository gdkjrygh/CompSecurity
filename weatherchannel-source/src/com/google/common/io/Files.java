// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.TreeTraverser;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.io:
//            ByteSink, ByteSource, FileWriteMode, CharSource, 
//            Closer, ByteStreams, CharSink, ByteProcessor, 
//            LineProcessor

public final class Files
{
    private static final class FileByteSink extends ByteSink
    {

        private final File file;
        private final ImmutableSet modes;

        public FileOutputStream openStream()
            throws IOException
        {
            return new FileOutputStream(file, modes.contains(FileWriteMode.APPEND));
        }

        public volatile OutputStream openStream()
            throws IOException
        {
            return openStream();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(file));
            String s1 = String.valueOf(String.valueOf(modes));
            return (new StringBuilder(s.length() + 20 + s1.length())).append("Files.asByteSink(").append(s).append(", ").append(s1).append(")").toString();
        }

        private transient FileByteSink(File file1, FileWriteMode afilewritemode[])
        {
            file = (File)Preconditions.checkNotNull(file1);
            modes = ImmutableSet.copyOf(afilewritemode);
        }

    }

    private static final class FileByteSource extends ByteSource
    {

        private final File file;

        public FileInputStream openStream()
            throws IOException
        {
            return new FileInputStream(file);
        }

        public volatile InputStream openStream()
            throws IOException
        {
            return openStream();
        }

        public byte[] read()
            throws IOException
        {
            Closer closer = Closer.create();
            byte abyte0[];
            FileInputStream fileinputstream = (FileInputStream)closer.register(openStream());
            abyte0 = Files.readFile(fileinputstream, fileinputstream.getChannel().size());
            closer.close();
            return abyte0;
            Object obj;
            obj;
            throw closer.rethrow(((Throwable) (obj)));
            obj;
            closer.close();
            throw obj;
        }

        public long size()
            throws IOException
        {
            if (!file.isFile())
            {
                throw new FileNotFoundException(file.toString());
            } else
            {
                return file.length();
            }
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(file));
            return (new StringBuilder(s.length() + 20)).append("Files.asByteSource(").append(s).append(")").toString();
        }

        private FileByteSource(File file1)
        {
            file = (File)Preconditions.checkNotNull(file1);
        }

    }

    private static abstract class FilePredicate extends Enum
        implements Predicate
    {

        private static final FilePredicate $VALUES[];
        public static final FilePredicate IS_DIRECTORY;
        public static final FilePredicate IS_FILE;

        public static FilePredicate valueOf(String s)
        {
            return (FilePredicate)Enum.valueOf(com/google/common/io/Files$FilePredicate, s);
        }

        public static FilePredicate[] values()
        {
            return (FilePredicate[])$VALUES.clone();
        }

        static 
        {
            IS_DIRECTORY = new FilePredicate("IS_DIRECTORY", 0) {

                public boolean apply(File file)
                {
                    return file.isDirectory();
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((File)obj);
                }

                public String toString()
                {
                    return "Files.isDirectory()";
                }

            };
            IS_FILE = new FilePredicate("IS_FILE", 1) {

                public boolean apply(File file)
                {
                    return file.isFile();
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((File)obj);
                }

                public String toString()
                {
                    return "Files.isFile()";
                }

            };
            $VALUES = (new FilePredicate[] {
                IS_DIRECTORY, IS_FILE
            });
        }

        private FilePredicate(String s, int i)
        {
            super(s, i);
        }

    }


    private static final TreeTraverser FILE_TREE_TRAVERSER = new TreeTraverser() {

        public Iterable children(File file)
        {
            if (file.isDirectory())
            {
                file = file.listFiles();
                if (file != null)
                {
                    return Collections.unmodifiableList(Arrays.asList(file));
                }
            }
            return Collections.emptyList();
        }

        public volatile Iterable children(Object obj)
        {
            return children((File)obj);
        }

        public String toString()
        {
            return "Files.fileTreeTraverser()";
        }

    };
    private static final int TEMP_DIR_ATTEMPTS = 10000;

    private Files()
    {
    }

    public static void append(CharSequence charsequence, File file, Charset charset)
        throws IOException
    {
        write(charsequence, file, charset, true);
    }

    public static transient ByteSink asByteSink(File file, FileWriteMode afilewritemode[])
    {
        return new FileByteSink(file, afilewritemode);
    }

    public static ByteSource asByteSource(File file)
    {
        return new FileByteSource(file);
    }

    public static transient CharSink asCharSink(File file, Charset charset, FileWriteMode afilewritemode[])
    {
        return asByteSink(file, afilewritemode).asCharSink(charset);
    }

    public static CharSource asCharSource(File file, Charset charset)
    {
        return asByteSource(file).asCharSource(charset);
    }

    public static void copy(File file, File file1)
        throws IOException
    {
        boolean flag;
        if (!file.equals(file1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Source %s and destination %s must be different", new Object[] {
            file, file1
        });
        asByteSource(file).copyTo(asByteSink(file1, new FileWriteMode[0]));
    }

    public static void copy(File file, OutputStream outputstream)
        throws IOException
    {
        asByteSource(file).copyTo(outputstream);
    }

    public static void copy(File file, Charset charset, Appendable appendable)
        throws IOException
    {
        asCharSource(file, charset).copyTo(appendable);
    }

    public static void createParentDirs(File file)
        throws IOException
    {
        Preconditions.checkNotNull(file);
        File file1 = file.getCanonicalFile().getParentFile();
        if (file1 != null)
        {
            file1.mkdirs();
            if (!file1.isDirectory())
            {
                file = String.valueOf(String.valueOf(file));
                throw new IOException((new StringBuilder(file.length() + 39)).append("Unable to create parent directories of ").append(file).toString());
            }
        }
    }

    public static File createTempDir()
    {
        Object obj = new File(System.getProperty("java.io.tmpdir"));
        long l = System.currentTimeMillis();
        String s = (new StringBuilder(21)).append(l).append("-").toString();
        for (int i = 0; i < 10000; i++)
        {
            Object obj1 = String.valueOf(String.valueOf(s));
            obj1 = new File(((File) (obj)), (new StringBuilder(((String) (obj1)).length() + 11)).append(((String) (obj1))).append(i).toString());
            if (((File) (obj1)).mkdir())
            {
                return ((File) (obj1));
            }
        }

        obj = String.valueOf(String.valueOf("Failed to create directory within 10000 attempts (tried "));
        String s1 = String.valueOf(String.valueOf(s));
        s = String.valueOf(String.valueOf(s));
        throw new IllegalStateException((new StringBuilder(((String) (obj)).length() + 17 + s1.length() + s.length())).append(((String) (obj))).append(s1).append("0 to ").append(s).append(9999).append(")").toString());
    }

    public static boolean equal(File file, File file1)
        throws IOException
    {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(file1);
        if (file == file1 || file.equals(file1))
        {
            return true;
        }
        long l = file.length();
        long l1 = file1.length();
        if (l != 0L && l1 != 0L && l != l1)
        {
            return false;
        } else
        {
            return asByteSource(file).contentEquals(asByteSource(file1));
        }
    }

    public static TreeTraverser fileTreeTraverser()
    {
        return FILE_TREE_TRAVERSER;
    }

    public static String getFileExtension(String s)
    {
        Preconditions.checkNotNull(s);
        s = (new File(s)).getName();
        int i = s.lastIndexOf('.');
        if (i == -1)
        {
            return "";
        } else
        {
            return s.substring(i + 1);
        }
    }

    public static String getNameWithoutExtension(String s)
    {
        Preconditions.checkNotNull(s);
        s = (new File(s)).getName();
        int i = s.lastIndexOf('.');
        if (i == -1)
        {
            return s;
        } else
        {
            return s.substring(0, i);
        }
    }

    public static HashCode hash(File file, HashFunction hashfunction)
        throws IOException
    {
        return asByteSource(file).hash(hashfunction);
    }

    public static Predicate isDirectory()
    {
        return FilePredicate.IS_DIRECTORY;
    }

    public static Predicate isFile()
    {
        return FilePredicate.IS_FILE;
    }

    public static MappedByteBuffer map(File file)
        throws IOException
    {
        Preconditions.checkNotNull(file);
        return map(file, java.nio.channels.FileChannel.MapMode.READ_ONLY);
    }

    public static MappedByteBuffer map(File file, java.nio.channels.FileChannel.MapMode mapmode)
        throws IOException
    {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(mapmode);
        if (!file.exists())
        {
            throw new FileNotFoundException(file.toString());
        } else
        {
            return map(file, mapmode, file.length());
        }
    }

    public static MappedByteBuffer map(File file, java.nio.channels.FileChannel.MapMode mapmode, long l)
        throws FileNotFoundException, IOException
    {
        Closer closer;
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(mapmode);
        closer = Closer.create();
        String s;
        if (mapmode == java.nio.channels.FileChannel.MapMode.READ_ONLY)
        {
            s = "r";
        } else
        {
            s = "rw";
        }
        file = map((RandomAccessFile)closer.register(new RandomAccessFile(file, s)), mapmode, l);
        closer.close();
        return file;
        file;
        throw closer.rethrow(file);
        file;
        closer.close();
        throw file;
    }

    private static MappedByteBuffer map(RandomAccessFile randomaccessfile, java.nio.channels.FileChannel.MapMode mapmode, long l)
        throws IOException
    {
        Closer closer = Closer.create();
        randomaccessfile = ((FileChannel)closer.register(randomaccessfile.getChannel())).map(mapmode, 0L, l);
        closer.close();
        return randomaccessfile;
        randomaccessfile;
        throw closer.rethrow(randomaccessfile);
        randomaccessfile;
        closer.close();
        throw randomaccessfile;
    }

    private static FileWriteMode[] modes(boolean flag)
    {
        if (flag)
        {
            return (new FileWriteMode[] {
                FileWriteMode.APPEND
            });
        } else
        {
            return new FileWriteMode[0];
        }
    }

    public static void move(File file, File file1)
        throws IOException
    {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(file1);
        boolean flag;
        if (!file.equals(file1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Source %s and destination %s must be different", new Object[] {
            file, file1
        });
        if (!file.renameTo(file1))
        {
            copy(file, file1);
            if (!file.delete())
            {
                if (!file1.delete())
                {
                    file = String.valueOf(String.valueOf(file1));
                    throw new IOException((new StringBuilder(file.length() + 17)).append("Unable to delete ").append(file).toString());
                } else
                {
                    file = String.valueOf(String.valueOf(file));
                    throw new IOException((new StringBuilder(file.length() + 17)).append("Unable to delete ").append(file).toString());
                }
            }
        }
    }

    public static BufferedReader newReader(File file, Charset charset)
        throws FileNotFoundException
    {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(charset);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static BufferedWriter newWriter(File file, Charset charset)
        throws FileNotFoundException
    {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(charset);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    public static Object readBytes(File file, ByteProcessor byteprocessor)
        throws IOException
    {
        return asByteSource(file).read(byteprocessor);
    }

    static byte[] readFile(InputStream inputstream, long l)
        throws IOException
    {
        if (l > 0x7fffffffL)
        {
            throw new OutOfMemoryError((new StringBuilder(68)).append("file is too large to fit in a byte array: ").append(l).append(" bytes").toString());
        }
        if (l == 0L)
        {
            return ByteStreams.toByteArray(inputstream);
        } else
        {
            return ByteStreams.toByteArray(inputstream, (int)l);
        }
    }

    public static String readFirstLine(File file, Charset charset)
        throws IOException
    {
        return asCharSource(file, charset).readFirstLine();
    }

    public static Object readLines(File file, Charset charset, LineProcessor lineprocessor)
        throws IOException
    {
        return asCharSource(file, charset).readLines(lineprocessor);
    }

    public static List readLines(File file, Charset charset)
        throws IOException
    {
        return (List)readLines(file, charset, new LineProcessor() {

            final List result = Lists.newArrayList();

            public volatile Object getResult()
            {
                return getResult();
            }

            public List getResult()
            {
                return result;
            }

            public boolean processLine(String s)
            {
                result.add(s);
                return true;
            }

        });
    }

    public static String simplifyPath(String s)
    {
        Preconditions.checkNotNull(s);
        if (s.length() == 0)
        {
            s = ".";
        } else
        {
            Object obj1 = Splitter.on('/').omitEmptyStrings().split(s);
            Object obj = new ArrayList();
            obj1 = ((Iterable) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                String s1 = (String)((Iterator) (obj1)).next();
                if (!s1.equals("."))
                {
                    if (s1.equals(".."))
                    {
                        if (((List) (obj)).size() > 0 && !((String)((List) (obj)).get(((List) (obj)).size() - 1)).equals(".."))
                        {
                            ((List) (obj)).remove(((List) (obj)).size() - 1);
                        } else
                        {
                            ((List) (obj)).add("..");
                        }
                    } else
                    {
                        ((List) (obj)).add(s1);
                    }
                }
            } while (true);
            obj1 = Joiner.on('/').join(((Iterable) (obj)));
            obj = obj1;
            if (s.charAt(0) == '/')
            {
                s = String.valueOf(obj1);
                if (s.length() != 0)
                {
                    obj = "/".concat(s);
                } else
                {
                    obj = new String("/");
                }
            }
            for (; ((String) (obj)).startsWith("/../"); obj = ((String) (obj)).substring(3)) { }
            if (((String) (obj)).equals("/.."))
            {
                return "/";
            }
            s = ((String) (obj));
            if ("".equals(obj))
            {
                return ".";
            }
        }
        return s;
    }

    public static byte[] toByteArray(File file)
        throws IOException
    {
        return asByteSource(file).read();
    }

    public static String toString(File file, Charset charset)
        throws IOException
    {
        return asCharSource(file, charset).read();
    }

    public static void touch(File file)
        throws IOException
    {
        Preconditions.checkNotNull(file);
        if (!file.createNewFile() && !file.setLastModified(System.currentTimeMillis()))
        {
            file = String.valueOf(String.valueOf(file));
            throw new IOException((new StringBuilder(file.length() + 38)).append("Unable to update modification time of ").append(file).toString());
        } else
        {
            return;
        }
    }

    public static void write(CharSequence charsequence, File file, Charset charset)
        throws IOException
    {
        asCharSink(file, charset, new FileWriteMode[0]).write(charsequence);
    }

    private static void write(CharSequence charsequence, File file, Charset charset, boolean flag)
        throws IOException
    {
        asCharSink(file, charset, modes(flag)).write(charsequence);
    }

    public static void write(byte abyte0[], File file)
        throws IOException
    {
        asByteSink(file, new FileWriteMode[0]).write(abyte0);
    }

}
