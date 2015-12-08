// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook.internal:
//            Utility, Logger

public final class FileLruCache
{
    private static class BufferFile
    {

        private static final String FILE_NAME_PREFIX = "buffer";
        private static final FilenameFilter filterExcludeBufferFiles = new FilenameFilter() {

            public boolean accept(File file, String s)
            {
                return !s.startsWith("buffer");
            }

        };
        private static final FilenameFilter filterExcludeNonBufferFiles = new FilenameFilter() {

            public boolean accept(File file, String s)
            {
                return s.startsWith("buffer");
            }

        };

        static void deleteAll(File file)
        {
            file = file.listFiles(excludeNonBufferFiles());
            if (file == null) goto _L2; else goto _L1
_L1:
            int i;
            int j;
            j = file.length;
            i = 0;
_L5:
            if (i < j) goto _L3; else goto _L2
_L2:
            return;
_L3:
            file[i].delete();
            i++;
            if (true) goto _L5; else goto _L4
_L4:
        }

        static FilenameFilter excludeBufferFiles()
        {
            return filterExcludeBufferFiles;
        }

        static FilenameFilter excludeNonBufferFiles()
        {
            return filterExcludeNonBufferFiles;
        }

        static File newFile(File file)
        {
            return new File(file, (new StringBuilder("buffer")).append(Long.valueOf(FileLruCache.bufferIndex.incrementAndGet()).toString()).toString());
        }


        private BufferFile()
        {
        }
    }

    private static class CloseCallbackOutputStream extends OutputStream
    {

        final StreamCloseCallback callback;
        final OutputStream innerStream;

        public void close()
            throws IOException
        {
            innerStream.close();
            callback.onClose();
            return;
            Exception exception;
            exception;
            callback.onClose();
            throw exception;
        }

        public void flush()
            throws IOException
        {
            innerStream.flush();
        }

        public void write(int i)
            throws IOException
        {
            innerStream.write(i);
        }

        public void write(byte abyte0[])
            throws IOException
        {
            innerStream.write(abyte0);
        }

        public void write(byte abyte0[], int i, int j)
            throws IOException
        {
            innerStream.write(abyte0, i, j);
        }

        CloseCallbackOutputStream(OutputStream outputstream, StreamCloseCallback streamclosecallback)
        {
            innerStream = outputstream;
            callback = streamclosecallback;
        }
    }

    private static final class CopyingInputStream extends InputStream
    {

        final InputStream input;
        final OutputStream output;

        public int available()
            throws IOException
        {
            return input.available();
        }

        public void close()
            throws IOException
        {
            input.close();
            output.close();
            return;
            Exception exception;
            exception;
            output.close();
            throw exception;
        }

        public void mark(int i)
        {
            throw new UnsupportedOperationException();
        }

        public boolean markSupported()
        {
            return false;
        }

        public int read()
            throws IOException
        {
            int i = input.read();
            if (i >= 0)
            {
                output.write(i);
            }
            return i;
        }

        public int read(byte abyte0[])
            throws IOException
        {
            int i = input.read(abyte0);
            if (i > 0)
            {
                output.write(abyte0, 0, i);
            }
            return i;
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            j = input.read(abyte0, i, j);
            if (j > 0)
            {
                output.write(abyte0, i, j);
            }
            return j;
        }

        public void reset()
        {
            this;
            JVM INSTR monitorenter ;
            throw new UnsupportedOperationException();
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public long skip(long l)
            throws IOException
        {
            byte abyte0[];
            long l1;
            abyte0 = new byte[1024];
            l1 = 0L;
_L5:
            if (l1 < l) goto _L2; else goto _L1
_L1:
            int i;
            return l1;
_L2:
            if ((i = read(abyte0, 0, (int)Math.min(l - l1, abyte0.length))) < 0) goto _L1; else goto _L3
_L3:
            l1 += i;
            if (true) goto _L5; else goto _L4
_L4:
        }

        CopyingInputStream(InputStream inputstream, OutputStream outputstream)
        {
            input = inputstream;
            output = outputstream;
        }
    }

    public static final class Limits
    {

        private int byteCount;
        private int fileCount;

        int getByteCount()
        {
            return byteCount;
        }

        int getFileCount()
        {
            return fileCount;
        }

        void setByteCount(int i)
        {
            if (i < 0)
            {
                throw new InvalidParameterException("Cache byte-count limit must be >= 0");
            } else
            {
                byteCount = i;
                return;
            }
        }

        void setFileCount(int i)
        {
            if (i < 0)
            {
                throw new InvalidParameterException("Cache file count limit must be >= 0");
            } else
            {
                fileCount = i;
                return;
            }
        }

        public Limits()
        {
            fileCount = 1024;
            byteCount = 0x100000;
        }
    }

    private static final class ModifiedFile
        implements Comparable
    {

        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        private final File file;
        private final long modified;

        public int compareTo(ModifiedFile modifiedfile)
        {
            if (getModified() < modifiedfile.getModified())
            {
                return -1;
            }
            if (getModified() > modifiedfile.getModified())
            {
                return 1;
            } else
            {
                return getFile().compareTo(modifiedfile.getFile());
            }
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((ModifiedFile)obj);
        }

        public boolean equals(Object obj)
        {
            return (obj instanceof ModifiedFile) && compareTo((ModifiedFile)obj) == 0;
        }

        File getFile()
        {
            return file;
        }

        long getModified()
        {
            return modified;
        }

        public int hashCode()
        {
            return (file.hashCode() + 1073) * 37 + (int)(modified % 0x7fffffffL);
        }

        ModifiedFile(File file1)
        {
            file = file1;
            modified = file1.lastModified();
        }
    }

    private static interface StreamCloseCallback
    {

        public abstract void onClose();
    }

    private static final class StreamHeader
    {

        private static final int HEADER_VERSION = 0;

        static JSONObject readHeader(InputStream inputstream)
            throws IOException
        {
            int i;
            int j;
            if (inputstream.read() != 0)
            {
                return null;
            }
            j = 0;
            i = 0;
_L8:
            if (i < 3) goto _L2; else goto _L1
_L1:
            byte abyte0[];
            abyte0 = new byte[j];
            i = 0;
_L6:
            if (i < abyte0.length) goto _L4; else goto _L3
_L3:
            inputstream = new JSONTokener(new String(abyte0));
            inputstream = ((InputStream) (inputstream.nextValue()));
            if (inputstream instanceof JSONObject)
            {
                break; /* Loop/switch isn't completed */
            }
            Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, (new StringBuilder("readHeader: expected JSONObject, got ")).append(inputstream.getClass().getCanonicalName()).toString());
            return null;
_L2:
            int l = inputstream.read();
            if (l == -1)
            {
                Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read returned -1 while reading header size");
                return null;
            }
            j = (j << 8) + (l & 0xff);
            i++;
            continue; /* Loop/switch isn't completed */
_L4:
            int k = inputstream.read(abyte0, i, abyte0.length - i);
            if (k < 1)
            {
                Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, (new StringBuilder("readHeader: stream.read stopped at ")).append(Integer.valueOf(i)).append(" when expected ").append(abyte0.length).toString());
                return null;
            }
            i += k;
            if (true) goto _L6; else goto _L5
_L5:
            inputstream = (JSONObject)inputstream;
            return inputstream;
            inputstream;
            throw new IOException(inputstream.getMessage());
            if (true) goto _L8; else goto _L7
_L7:
        }

        static void writeHeader(OutputStream outputstream, JSONObject jsonobject)
            throws IOException
        {
            jsonobject = jsonobject.toString().getBytes();
            outputstream.write(0);
            outputstream.write(jsonobject.length >> 16 & 0xff);
            outputstream.write(jsonobject.length >> 8 & 0xff);
            outputstream.write(jsonobject.length >> 0 & 0xff);
            outputstream.write(jsonobject);
        }

        private StreamHeader()
        {
        }
    }


    private static final String HEADER_CACHEKEY_KEY = "key";
    private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
    static final String TAG = com/facebook/internal/FileLruCache.getSimpleName();
    private static final AtomicLong bufferIndex = new AtomicLong();
    private final File directory;
    private boolean isTrimInProgress;
    private boolean isTrimPending;
    private AtomicLong lastClearCacheTime;
    private final Limits limits;
    private final Object lock = new Object();
    private final String tag;

    public FileLruCache(String s, Limits limits1)
    {
        lastClearCacheTime = new AtomicLong(0L);
        tag = s;
        limits = limits1;
        directory = new File(FacebookSdk.getCacheDir(), s);
        if (directory.mkdirs() || directory.isDirectory())
        {
            BufferFile.deleteAll(directory);
        }
    }

    private void postTrim()
    {
        synchronized (lock)
        {
            if (!isTrimPending)
            {
                isTrimPending = true;
                FacebookSdk.getExecutor().execute(new Runnable() {

                    final FileLruCache this$0;

                    public void run()
                    {
                        trim();
                    }

            
            {
                this$0 = FileLruCache.this;
                super();
            }
                });
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void renameToTargetAndTrim(String s, File file)
    {
        if (!file.renameTo(new File(directory, Utility.md5hash(s))))
        {
            file.delete();
        }
        postTrim();
    }

    private void trim()
    {
        synchronized (lock)
        {
            isTrimPending = false;
            isTrimInProgress = true;
        }
        Logger.log(LoggingBehavior.CACHE, TAG, "trim started");
        obj = new PriorityQueue();
        long l2;
        long l3;
        l2 = 0L;
        l3 = 0L;
        obj1 = directory.listFiles(BufferFile.excludeBufferFiles());
        long l;
        long l1;
        l = l3;
        l1 = l2;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        int j = obj1.length;
        int i;
        i = 0;
        l = l3;
        l1 = l2;
          goto _L3
_L2:
        if (l1 > (long)limits.getByteCount()) goto _L5; else goto _L4
_L4:
        i = limits.getFileCount();
        if (l <= (long)i)
        {
            synchronized (lock)
            {
                isTrimInProgress = false;
                lock.notifyAll();
            }
            return;
        }
          goto _L5
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L6:
        File file1 = obj1[i];
        ModifiedFile modifiedfile = new ModifiedFile(file1);
        ((PriorityQueue) (obj)).add(modifiedfile);
        Logger.log(LoggingBehavior.CACHE, TAG, (new StringBuilder("  trim considering time=")).append(Long.valueOf(modifiedfile.getModified())).append(" name=").append(modifiedfile.getFile().getName()).toString());
        l1 += file1.length();
        l++;
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        File file;
        file = ((ModifiedFile)((PriorityQueue) (obj)).remove()).getFile();
        Logger.log(LoggingBehavior.CACHE, TAG, (new StringBuilder("  trim removing ")).append(file.getName()).toString());
        l1 -= file.length();
        l--;
        file.delete();
        break; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        synchronized (lock)
        {
            isTrimInProgress = false;
            lock.notifyAll();
        }
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        obj;
        JVM INSTR monitorexit ;
        throw exception2;
_L3:
        if (i < j) goto _L6; else goto _L2
    }

    public void clearCache()
    {
        final File filesToDelete[] = directory.listFiles(BufferFile.excludeBufferFiles());
        lastClearCacheTime.set(System.currentTimeMillis());
        if (filesToDelete != null)
        {
            FacebookSdk.getExecutor().execute(new Runnable() {

                final FileLruCache this$0;
                private final File val$filesToDelete[];

                public void run()
                {
                    File afile[] = filesToDelete;
                    int j = afile.length;
                    int i = 0;
                    do
                    {
                        if (i >= j)
                        {
                            return;
                        }
                        afile[i].delete();
                        i++;
                    } while (true);
                }

            
            {
                this$0 = FileLruCache.this;
                filesToDelete = afile;
                super();
            }
            });
        }
    }

    public InputStream get(String s)
        throws IOException
    {
        return get(s, null);
    }

    public InputStream get(String s, String s1)
        throws IOException
    {
        File file;
        Object obj;
        JSONObject jsonobject;
        file = new File(directory, Utility.md5hash(s));
        try
        {
            obj = new FileInputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        obj = new BufferedInputStream(((InputStream) (obj)), 8192);
        jsonobject = StreamHeader.readHeader(((InputStream) (obj)));
        if (jsonobject == null)
        {
            if (true)
            {
                ((BufferedInputStream) (obj)).close();
            }
            return null;
        }
        String s2 = jsonobject.optString("key");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        boolean flag = s2.equals(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        if (true)
        {
            ((BufferedInputStream) (obj)).close();
        }
        return null;
        s = jsonobject.optString("tag", null);
        if (s1 == null && s != null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        flag = s1.equals(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        if (true)
        {
            ((BufferedInputStream) (obj)).close();
        }
        return null;
        long l = (new Date()).getTime();
        Logger.log(LoggingBehavior.CACHE, TAG, (new StringBuilder("Setting lastModified to ")).append(Long.valueOf(l)).append(" for ").append(file.getName()).toString());
        file.setLastModified(l);
        if (false)
        {
            ((BufferedInputStream) (obj)).close();
        }
        return ((InputStream) (obj));
        s;
        if (true)
        {
            ((BufferedInputStream) (obj)).close();
        }
        throw s;
    }

    public String getLocation()
    {
        return directory.getPath();
    }

    public InputStream interceptAndPut(String s, InputStream inputstream)
        throws IOException
    {
        return new CopyingInputStream(inputstream, openPutStream(s));
    }

    public OutputStream openPutStream(String s)
        throws IOException
    {
        return openPutStream(s, null);
    }

    public OutputStream openPutStream(String s, String s1)
        throws IOException
    {
        Object obj;
        obj = BufferFile.newFile(directory);
        ((File) (obj)).delete();
        if (!((File) (obj)).createNewFile())
        {
            throw new IOException((new StringBuilder("Could not create file at ")).append(((File) (obj)).getAbsolutePath()).toString());
        }
        Object obj1;
        try
        {
            obj1 = new FileOutputStream(((File) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.log(LoggingBehavior.CACHE, 5, TAG, (new StringBuilder("Error creating buffer output stream: ")).append(s).toString());
            throw new IOException(s.getMessage());
        }
        obj = new BufferedOutputStream(new CloseCallbackOutputStream(((OutputStream) (obj1)), new StreamCloseCallback() {

            final FileLruCache this$0;
            private final File val$buffer;
            private final long val$bufferFileCreateTime;
            private final String val$key;

            public void onClose()
            {
                if (bufferFileCreateTime < lastClearCacheTime.get())
                {
                    buffer.delete();
                    return;
                } else
                {
                    renameToTargetAndTrim(key, buffer);
                    return;
                }
            }

            
            {
                this$0 = FileLruCache.this;
                bufferFileCreateTime = l;
                buffer = file;
                key = s;
                super();
            }
        }), 8192);
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("key", s);
        if (!Utility.isNullOrEmpty(s1))
        {
            ((JSONObject) (obj1)).put("tag", s1);
        }
        StreamHeader.writeHeader(((OutputStream) (obj)), ((JSONObject) (obj1)));
        if (false)
        {
            ((BufferedOutputStream) (obj)).close();
        }
        return ((OutputStream) (obj));
        s;
        Logger.log(LoggingBehavior.CACHE, 5, TAG, (new StringBuilder("Error creating JSON header for cache file: ")).append(s).toString());
        throw new IOException(s.getMessage());
        s;
        if (true)
        {
            ((BufferedOutputStream) (obj)).close();
        }
        throw s;
    }

    long sizeInBytesForTest()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
_L5:
        if (isTrimPending || isTrimInProgress) goto _L2; else goto _L1
_L1:
        long l;
        long l1;
        obj = directory.listFiles();
        l = 0L;
        l1 = l;
        if (obj == null) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = obj.length;
        i = 0;
_L6:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        l1 = l;
_L4:
        return l1;
_L2:
        Exception exception;
        try
        {
            lock.wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
          goto _L5
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        l += obj[i].length();
        i++;
          goto _L6
    }

    public String toString()
    {
        return (new StringBuilder("{FileLruCache: tag:")).append(tag).append(" file:").append(directory.getName()).append("}").toString();
    }





}
