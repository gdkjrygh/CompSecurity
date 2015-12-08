// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import com.vladium.logging.Logger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLConnection;

// Referenced classes of package com.vladium.emma.data:
//            IMergeable, CoverageData, MetaData, ISessionData, 
//            ICoverageData, IMetaData, CoverageOptions

public abstract class DataFactory
{
    private static final class RandomAccessFileInputStream extends BufferedInputStream
    {

        private long m_count;

        public void close()
        {
        }

        final long getCount()
        {
            return m_count;
        }

        public final int read()
            throws IOException
        {
            int i = super.read();
            if (i >= 0)
            {
                m_count = m_count + 1L;
            }
            return i;
        }

        public final int read(byte abyte0[])
            throws IOException
        {
            int i = super.read(abyte0);
            if (i >= 0)
            {
                m_count = m_count + (long)i;
            }
            return i;
        }

        public final int read(byte abyte0[], int i, int j)
            throws IOException
        {
            i = super.read(abyte0, i, j);
            if (i >= 0)
            {
                m_count = m_count + (long)i;
            }
            return i;
        }

        RandomAccessFileInputStream(RandomAccessFile randomaccessfile, int i)
            throws IOException
        {
            super(new UCFileInputStream(randomaccessfile.getFD()), i);
        }
    }

    private static final class RandomAccessFileOutputStream extends BufferedOutputStream
    {

        private long m_count;

        public void close()
        {
        }

        final long getCount()
        {
            return m_count;
        }

        public final void write(int i)
            throws IOException
        {
            super.write(i);
            m_count = m_count + 1L;
        }

        public final void write(byte abyte0[])
            throws IOException
        {
            super.write(abyte0);
            m_count = m_count + (long)abyte0.length;
        }

        public final void write(byte abyte0[], int i, int j)
            throws IOException
        {
            super.write(abyte0, i, j);
            m_count = m_count + (long)j;
        }

        RandomAccessFileOutputStream(RandomAccessFile randomaccessfile, int i)
            throws IOException
        {
            super(new UCFileOutputStream(randomaccessfile.getFD()), i);
        }
    }

    private static final class UCFileInputStream extends FileInputStream
    {

        public void close()
        {
        }

        UCFileInputStream(FileDescriptor filedescriptor)
        {
            super(filedescriptor);
        }
    }

    private static final class UCFileOutputStream extends FileOutputStream
    {

        public void close()
        {
        }

        UCFileOutputStream(FileDescriptor filedescriptor)
        {
            super(filedescriptor);
        }
    }


    private static final boolean DO_FSYNC = true;
    private static final int ENTRY_HEADER_LENGTH = 9;
    private static final int FILE_HEADER_LENGTH = 24;
    private static final int IO_BUF_SIZE = 32768;
    private static final int MAGIC = 0x454d4d41;
    private static final int NULL_ARRAY_LENGTH = -1;
    public static final byte TYPE_COVERAGEDATA = 1;
    public static final byte TYPE_METADATA = 0;
    private static final long UNKNOWN = 0L;

    private DataFactory()
    {
    }

    public static IMergeable[] load(File file)
        throws IOException
    {
        if (file == null)
        {
            throw new IllegalArgumentException("null input: file");
        } else
        {
            return mergeload(file);
        }
    }

    private static String makeAppVersion(int i, int j, int k)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(i);
        stringbuffer.append('.');
        stringbuffer.append(j);
        stringbuffer.append('.');
        stringbuffer.append(k);
        return stringbuffer.toString();
    }

    private static IMergeable[] mergeload(File file)
        throws IOException
    {
        IMergeable imergeable;
        Logger logger;
        IMergeable aimergeable[];
        long l;
        boolean flag;
        boolean flag1;
        logger = Logger.getLogger();
        flag = logger.atTRACE1();
        flag1 = logger.atTRACE2();
        l = 0L;
        if (flag)
        {
            l = System.currentTimeMillis();
        }
        aimergeable = new IMergeable[2];
        if (!file.exists())
        {
            throw new IOException((new StringBuilder()).append("input file does not exist: [").append(file.getAbsolutePath()).append("]").toString());
        }
        imergeable = null;
        Object obj = new RandomAccessFile(file, "r");
        long l3 = ((RandomAccessFile) (obj)).length();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        logger.trace1("mergeload", (new StringBuilder()).append("[").append(file).append("]: file length = ").append(l3).toString());
        if (l3 >= 24L) goto _L2; else goto _L1
_L1:
        throw new IOException((new StringBuilder()).append("file [").append(file.getAbsolutePath()).append("] is corrupt or was not created by ").append("EMMA").toString());
        file;
_L13:
        byte byte0;
        IMergeable imergeable1;
        long l1;
        long l2;
        long l4;
        if (obj != null)
        {
            try
            {
                ((RandomAccessFile) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw file;
_L2:
        if (l3 <= 24L) goto _L4; else goto _L3
_L3:
        ((RandomAccessFile) (obj)).seek(24L);
        l1 = 24L;
        l2 = 0L;
_L11:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        logger.trace2("mergeload", (new StringBuilder()).append("[").append(file).append("]: position ").append(((RandomAccessFile) (obj)).getFilePointer()).toString());
        if (l1 < l3) goto _L5; else goto _L4
_L4:
        if (obj != null)
        {
            try
            {
                ((RandomAccessFile) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (flag)
        {
            l1 = System.currentTimeMillis();
            logger.trace1("mergeload", (new StringBuilder()).append("[").append(file).append("]: file processed in ").append(l1 - l).append(" ms").toString());
        }
        return aimergeable;
_L5:
        if ((l4 = ((RandomAccessFile) (obj)).readLong()) <= 0L || l1 + l4 + 9L > l3) goto _L4; else goto _L6
_L6:
        byte0 = ((RandomAccessFile) (obj)).readByte();
        if (byte0 < 0) goto _L4; else goto _L7
_L7:
        if (byte0 >= aimergeable.length) goto _L4; else goto _L8
_L8:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_434;
        }
        logger.trace2("mergeload", (new StringBuilder()).append("[").append(file).append("]: found valid entry of size ").append(l4).append(" and type ").append(byte0).toString());
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_444;
        }
        l2 = System.currentTimeMillis();
        imergeable = readEntry(((RandomAccessFile) (obj)), byte0, l4);
        if (!flag1) goto _L10; else goto _L9
_L9:
        logger.trace2("mergeload", (new StringBuilder()).append("entry read in ").append(System.currentTimeMillis() - l2).append(" ms").toString());
          goto _L10
_L12:
        l1 += 9L + l4;
        ((RandomAccessFile) (obj)).seek(l1);
          goto _L11
_L15:
        aimergeable[byte0] = imergeable1.merge(imergeable);
          goto _L12
        file;
        obj = imergeable;
          goto _L13
_L10:
        imergeable1 = aimergeable[byte0];
        if (imergeable1 != null) goto _L15; else goto _L14
_L14:
        aimergeable[byte0] = imergeable;
          goto _L12
    }

    public static ICoverageData newCoverageData()
    {
        return new CoverageData();
    }

    public static IMetaData newMetaData(CoverageOptions coverageoptions)
    {
        return new MetaData(coverageoptions);
    }

    public static void persist(ICoverageData icoveragedata, File file, boolean flag)
        throws IOException
    {
        if (icoveragedata == null)
        {
            throw new IllegalArgumentException("null input: data");
        }
        if (file == null)
        {
            throw new IllegalArgumentException("null input: file");
        }
        if (!flag && file.exists() && !file.delete())
        {
            throw new IOException((new StringBuilder()).append("could not delete file [").append(file.getAbsolutePath()).append("]").toString());
        } else
        {
            persist(((IMergeable) (icoveragedata)), (byte)1, file);
            return;
        }
    }

    private static void persist(IMergeable imergeable, byte byte0, File file)
        throws IOException
    {
        Logger logger;
        int i;
        int j;
        long l1;
        boolean flag1;
        boolean flag2;
        logger = Logger.getLogger();
        flag1 = logger.atTRACE1();
        flag2 = logger.atTRACE2();
        l1 = 0L;
        if (flag1)
        {
            l1 = System.currentTimeMillis();
        }
        i = 0;
        j = 0;
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        if (!file.isFile())
        {
            throw new IOException((new StringBuilder()).append("can persist in normal files only: ").append(file.getAbsolutePath()).toString());
        }
          goto _L3
        imergeable;
        Object obj = null;
_L21:
        int k;
        int l;
        int i1;
        boolean flag;
        long l2;
        long l3;
        RandomAccessFile randomaccessfile;
        int j1;
        long l4;
        if (obj != null)
        {
            try
            {
                ((RandomAccessFile) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw imergeable;
_L3:
        randomaccessfile = new RandomAccessFile(file, "rw");
        obj = randomaccessfile;
        l3 = randomaccessfile.length();
        if (!flag1) goto _L5; else goto _L4
_L4:
        obj = randomaccessfile;
        logger.trace1("persist", (new StringBuilder()).append("[").append(file).append("]: existing file length = ").append(l3).toString());
          goto _L5
_L6:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        obj = randomaccessfile;
        randomaccessfile.seek(0L);
        obj = randomaccessfile;
        writeFileHeader(randomaccessfile);
        obj = randomaccessfile;
        writeEntry(logger, randomaccessfile, 24L, imergeable, byte0);
        if (randomaccessfile != null)
        {
            try
            {
                randomaccessfile.close();
            }
            // Misplaced declaration of an exception variable
            catch (IMergeable imergeable) { }
        }
        if (flag1)
        {
            l2 = System.currentTimeMillis();
            logger.trace1("persist", (new StringBuilder()).append("[").append(file).append("]: file processed in ").append(l2 - l1).append(" ms").toString());
        }
        return;
_L20:
        j = 0;
          goto _L6
_L18:
        obj = randomaccessfile;
        if (randomaccessfile.readInt() == 0x454d4d41) goto _L8; else goto _L7
_L7:
        obj = randomaccessfile;
        throw new IOException((new StringBuilder()).append("cannot overwrite [").append(file.getAbsolutePath()).append("]: not created by ").append("EMMA").toString());
_L23:
        obj = randomaccessfile;
        l2 = randomaccessfile.readLong();
        if (l2 == 32L) goto _L10; else goto _L9
_L9:
        j = 0;
        l = 0;
        flag = false;
        i1 = 0;
        i = l;
        obj = randomaccessfile;
        k = randomaccessfile.readInt();
        j = k;
        i = l;
        obj = randomaccessfile;
        l = randomaccessfile.readInt();
        j = k;
        i = l;
        obj = randomaccessfile;
        j1 = randomaccessfile.readInt();
        i = j1;
        flag = true;
        i1 = l;
        j = k;
        l = ((flag) ? 1 : 0);
        k = i;
_L16:
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_507;
        }
        obj = randomaccessfile;
        throw new IOException((new StringBuilder()).append("cannot merge new data into [").append(file.getAbsolutePath()).append("]: created by another ").append("EMMA").append(" version [").append(makeAppVersion(j, i1, k)).append("]").toString());
        obj = randomaccessfile;
        throw new IOException((new StringBuilder()).append("cannot merge new data into [").append(file.getAbsolutePath()).append("]: created by another ").append("EMMA").append(" version").toString());
_L10:
        obj = randomaccessfile;
        randomaccessfile.seek(24L);
        if (l3 != 24L) goto _L12; else goto _L11
_L11:
        obj = randomaccessfile;
        writeEntry(logger, randomaccessfile, 24L, imergeable, byte0);
          goto _L6
_L15:
        if (!flag2) goto _L14; else goto _L13
_L13:
        obj = randomaccessfile;
        logger.trace2("persist", (new StringBuilder()).append("[").append(file).append("]: position ").append(randomaccessfile.getFilePointer()).toString());
          goto _L14
_L24:
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_689;
        }
        obj = randomaccessfile;
        logger.trace2("persist", (new StringBuilder()).append("[").append(file).append("]: adding entry at position ").append(l2).toString());
        obj = randomaccessfile;
        writeEntry(logger, randomaccessfile, l2, imergeable, byte0);
          goto _L6
_L25:
        obj = randomaccessfile;
        l4 = randomaccessfile.readLong();
        if (l4 <= 0L || l2 + l4 + 9L > l3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_782;
        }
        obj = randomaccessfile;
        logger.trace2("persist", (new StringBuilder()).append("[").append(file).append("]: found valid entry of size ").append(l4).toString());
        l2 += 9L + l4;
        obj = randomaccessfile;
        randomaccessfile.seek(l2);
          goto _L15
_L2:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_843;
        }
        logger.trace1("persist", (new StringBuilder()).append("[").append(file).append("]: creating a new file").toString());
        obj = file.getParentFile();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_857;
        }
        ((File) (obj)).mkdirs();
        randomaccessfile = new RandomAccessFile(file, "rw");
        i = 1;
          goto _L6
        imergeable;
        k = ((flag) ? 1 : 0);
        l = i1;
        i1 = i;
          goto _L16
_L5:
        if (l3 >= 4L) goto _L18; else goto _L17
_L17:
        i = 1;
        if (l3 <= 0L) goto _L20; else goto _L19
_L19:
        j = 1;
          goto _L6
        imergeable;
          goto _L21
_L8:
        if (l3 >= 24L) goto _L23; else goto _L22
_L22:
        i = 1;
        j = 1;
          goto _L6
_L12:
        l2 = 24L;
          goto _L15
_L14:
        if (l2 < l3) goto _L25; else goto _L24
    }

    public static void persist(IMetaData imetadata, File file, boolean flag)
        throws IOException
    {
        if (imetadata == null)
        {
            throw new IllegalArgumentException("null input: data");
        }
        if (file == null)
        {
            throw new IllegalArgumentException("null input: file");
        }
        if (!flag && file.exists() && !file.delete())
        {
            throw new IOException((new StringBuilder()).append("could not delete file [").append(file.getAbsolutePath()).append("]").toString());
        } else
        {
            persist(((IMergeable) (imetadata)), (byte)0, file);
            return;
        }
    }

    public static void persist(ISessionData isessiondata, File file, boolean flag)
        throws IOException
    {
        if (isessiondata == null)
        {
            throw new IllegalArgumentException("null input: data");
        }
        if (file == null)
        {
            throw new IllegalArgumentException("null input: file");
        }
        if (!flag && file.exists() && !file.delete())
        {
            throw new IOException((new StringBuilder()).append("could not delete file [").append(file.getAbsolutePath()).append("]").toString());
        } else
        {
            persist(((IMergeable) (isessiondata.getMetaData())), (byte)0, file);
            persist(((IMergeable) (isessiondata.getCoverageData())), (byte)1, file);
            return;
        }
    }

    public static boolean[] readBooleanArray(DataInput datainput)
        throws IOException
    {
        int i = datainput.readInt();
        if (i != -1) goto _L2; else goto _L1
_L1:
        boolean aflag[] = null;
_L4:
        return aflag;
_L2:
        boolean aflag1[] = new boolean[i];
        do
        {
            i--;
            aflag = aflag1;
            if (i < 0)
            {
                continue;
            }
            aflag1[i] = datainput.readBoolean();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static ICoverageData readCoverageData(URL url)
        throws IOException, ClassNotFoundException
    {
        Object obj = null;
        url = new ObjectInputStream(new BufferedInputStream(url.openStream(), 32768));
        obj = (ICoverageData)url.readObject();
        if (url != null)
        {
            try
            {
                url.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                return ((ICoverageData) (obj));
            }
        }
        return ((ICoverageData) (obj));
        url;
_L2:
        if (obj != null)
        {
            try
            {
                ((ObjectInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw url;
        Exception exception;
        exception;
        obj = url;
        url = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static IMergeable readEntry(RandomAccessFile randomaccessfile, byte byte0, long l)
        throws IOException
    {
        randomaccessfile = new DataInputStream(new RandomAccessFileInputStream(randomaccessfile, 32768));
        byte0;
        JVM INSTR tableswitch 0 0: default 36
    //                   0 46;
           goto _L1 _L2
_L1:
        randomaccessfile = CoverageData.readExternal(randomaccessfile);
_L4:
        return (IMergeable)randomaccessfile;
_L2:
        randomaccessfile = MetaData.readExternal(randomaccessfile);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int[] readIntArray(DataInput datainput)
        throws IOException
    {
        int i = datainput.readInt();
        if (i != -1) goto _L2; else goto _L1
_L1:
        int ai[] = null;
_L4:
        return ai;
_L2:
        int ai1[] = new int[i];
        do
        {
            i--;
            ai = ai1;
            if (i < 0)
            {
                continue;
            }
            ai1[i] = datainput.readInt();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static IMetaData readMetaData(URL url)
        throws IOException, ClassNotFoundException
    {
        Object obj = null;
        url = new ObjectInputStream(new BufferedInputStream(url.openStream(), 32768));
        obj = (IMetaData)url.readObject();
        if (url != null)
        {
            try
            {
                url.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                return ((IMetaData) (obj));
            }
        }
        return ((IMetaData) (obj));
        url;
_L2:
        if (obj != null)
        {
            try
            {
                ((ObjectInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw url;
        Exception exception;
        exception;
        obj = url;
        url = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void writeBooleanArray(boolean aflag[], DataOutput dataoutput)
        throws IOException
    {
        if (aflag != null) goto _L2; else goto _L1
_L1:
        dataoutput.writeInt(-1);
_L4:
        return;
_L2:
        int i = aflag.length;
        dataoutput.writeInt(i);
        do
        {
            i--;
            if (i < 0)
            {
                continue;
            }
            dataoutput.writeBoolean(aflag[i]);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void writeCoverageData(ICoverageData icoveragedata, OutputStream outputstream)
        throws IOException
    {
        (new ObjectOutputStream(outputstream)).writeObject(icoveragedata);
    }

    private static void writeEntry(Logger logger, RandomAccessFile randomaccessfile, long l, IMergeable imergeable, byte byte0)
        throws IOException
    {
        RandomAccessFileOutputStream randomaccessfileoutputstream;
        DataOutputStream dataoutputstream;
        writeEntryHeader(randomaccessfile, byte0);
        randomaccessfileoutputstream = new RandomAccessFileOutputStream(randomaccessfile, 32768);
        dataoutputstream = new DataOutputStream(randomaccessfileoutputstream);
        byte0;
        JVM INSTR tableswitch 0 0: default 48
    //                   0 148;
           goto _L1 _L2
_L1:
        CoverageData.writeExternal((CoverageData)imergeable, dataoutputstream);
_L4:
        dataoutputstream.flush();
        randomaccessfile.setLength(randomaccessfile.getFilePointer());
        randomaccessfile.seek(l);
        randomaccessfile.writeLong(randomaccessfileoutputstream.getCount());
        randomaccessfile.getFD().sync();
        if (logger.atTRACE2())
        {
            logger.trace2("writeEntry", (new StringBuilder()).append("entry [").append(imergeable.getClass().getName()).append("] length: ").append(randomaccessfileoutputstream.getCount()).toString());
        }
        return;
_L2:
        MetaData.writeExternal((MetaData)imergeable, dataoutputstream);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void writeEntryHeader(DataOutput dataoutput, byte byte0)
        throws IOException
    {
        dataoutput.writeLong(0L);
        dataoutput.writeByte(byte0);
    }

    private static void writeFileHeader(DataOutput dataoutput)
        throws IOException
    {
        dataoutput.writeInt(0x454d4d41);
        dataoutput.writeLong(32L);
        dataoutput.writeInt(0);
        dataoutput.writeInt(0);
        dataoutput.writeInt(0);
    }

    public static void writeIntArray(int ai[], DataOutput dataoutput)
        throws IOException
    {
        if (ai != null) goto _L2; else goto _L1
_L1:
        dataoutput.writeInt(-1);
_L4:
        return;
_L2:
        int i = ai.length;
        dataoutput.writeInt(i);
        do
        {
            i--;
            if (i < 0)
            {
                continue;
            }
            dataoutput.writeInt(ai[i]);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void writeMetaData(IMetaData imetadata, OutputStream outputstream)
        throws IOException
    {
        (new ObjectOutputStream(outputstream)).writeObject(imetadata);
    }

    public static void writeMetaData(IMetaData imetadata, URL url)
        throws IOException
    {
        Object obj;
        obj = url.openConnection();
        ((URLConnection) (obj)).setDoOutput(true);
        url = null;
        obj = ((URLConnection) (obj)).getOutputStream();
        url = ((URL) (obj));
        writeMetaData(imetadata, ((OutputStream) (obj)));
        url = ((URL) (obj));
        ((OutputStream) (obj)).flush();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        ((OutputStream) (obj)).close();
        return;
        imetadata;
        if (url != null)
        {
            try
            {
                url.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url) { }
        }
        throw imetadata;
        imetadata;
    }
}
