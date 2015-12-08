// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal:
//            Util, Platform

public final class DiskLruCache
    implements Closeable
{
    public final class Editor
    {

        private boolean committed;
        private final Entry entry;
        private boolean hasErrors;
        final DiskLruCache this$0;
        private final boolean written[];

        public void abort()
            throws IOException
        {
            synchronized (DiskLruCache.this)
            {
                completeEdit(this, false);
            }
            return;
            exception;
            disklrucache;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void abortUnlessCommitted()
        {
            DiskLruCache disklrucache = DiskLruCache.this;
            disklrucache;
            JVM INSTR monitorenter ;
            boolean flag = committed;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_25;
            }
            Exception exception;
            try
            {
                completeEdit(this, false);
            }
            catch (IOException ioexception) { }
            disklrucache;
            JVM INSTR monitorexit ;
            return;
            exception;
            disklrucache;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void commit()
            throws IOException
        {
            DiskLruCache disklrucache = DiskLruCache.this;
            disklrucache;
            JVM INSTR monitorenter ;
            if (!hasErrors)
            {
                break MISSING_BLOCK_LABEL_43;
            }
            completeEdit(this, false);
            removeEntry(entry);
_L2:
            committed = true;
            return;
            completeEdit(this, true);
            if (true) goto _L2; else goto _L1
_L1:
            Exception exception;
            exception;
            disklrucache;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public String getString(int i)
            throws IOException
        {
            Source source = newSource(i);
            if (source != null)
            {
                return DiskLruCache.sourceToString(source);
            } else
            {
                return null;
            }
        }

        public Sink newSink(int i)
            throws IOException
        {
            DiskLruCache disklrucache = DiskLruCache.this;
            disklrucache;
            JVM INSTR monitorenter ;
            if (entry.currentEditor != this)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_31;
            Object obj;
            obj;
            disklrucache;
            JVM INSTR monitorexit ;
            throw obj;
            File file;
            if (!entry.readable)
            {
                written[i] = true;
            }
            file = entry.dirtyFiles[i];
            Object obj1 = Okio.sink(file);
_L1:
            obj1 = new FaultHidingSink(((Sink) (obj1)));
            disklrucache;
            JVM INSTR monitorexit ;
            return ((Sink) (obj1));
            obj1;
            directory.mkdirs();
            obj1 = Okio.sink(file);
              goto _L1
            obj1;
            obj1 = DiskLruCache.NULL_SINK;
            disklrucache;
            JVM INSTR monitorexit ;
            return ((Sink) (obj1));
        }

        public Source newSource(int i)
            throws IOException
        {
            DiskLruCache disklrucache = DiskLruCache.this;
            disklrucache;
            JVM INSTR monitorenter ;
            if (entry.currentEditor != this)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_31;
            Object obj;
            obj;
            disklrucache;
            JVM INSTR monitorexit ;
            throw obj;
            if (entry.readable)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            disklrucache;
            JVM INSTR monitorexit ;
            return null;
            Source source = Okio.source(entry.cleanFiles[i]);
            disklrucache;
            JVM INSTR monitorexit ;
            return source;
            source;
            disklrucache;
            JVM INSTR monitorexit ;
            return null;
        }

        public void set(int i, String s)
            throws IOException
        {
            BufferedSink bufferedsink = Okio.buffer(newSink(i));
            bufferedsink.writeUtf8(s);
            bufferedsink.close();
        }




/*
        static boolean access$1702(Editor editor, boolean flag)
        {
            editor.hasErrors = flag;
            return flag;
        }

*/

        private Editor(Entry entry1)
        {
            this$0 = DiskLruCache.this;
            super();
            entry = entry1;
            if (entry1.readable)
            {
                disklrucache = null;
            } else
            {
                disklrucache = new boolean[valueCount];
            }
            written = DiskLruCache.this;
        }

    }

    private class Editor.FaultHidingSink extends ForwardingSink
    {

        final Editor this$1;

        public void close()
            throws IOException
        {
            try
            {
                super.close();
                return;
            }
            catch (IOException ioexception) { }
            synchronized (_fld0)
            {
                hasErrors = true;
            }
            return;
            exception;
            disklrucache;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void flush()
            throws IOException
        {
            try
            {
                super.flush();
                return;
            }
            catch (IOException ioexception) { }
            synchronized (_fld0)
            {
                hasErrors = true;
            }
            return;
            exception;
            disklrucache;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void write(Buffer buffer, long l)
            throws IOException
        {
            try
            {
                super.write(buffer, l);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Buffer buffer) { }
            synchronized (_fld0)
            {
                hasErrors = true;
            }
            return;
            exception;
            buffer;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Editor.FaultHidingSink(Sink sink)
        {
            this$1 = Editor.this;
            super(sink);
        }
    }

    private final class Entry
    {

        private final File cleanFiles[];
        private Editor currentEditor;
        private final File dirtyFiles[];
        private final String key;
        private final long lengths[];
        private boolean readable;
        private long sequenceNumber;
        final DiskLruCache this$0;

        private IOException invalidLengths(String as[])
            throws IOException
        {
            throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(Arrays.toString(as)).toString());
        }

        private void setLengths(String as[])
            throws IOException
        {
            if (as.length != valueCount)
            {
                throw invalidLengths(as);
            }
            int i = 0;
            do
            {
                try
                {
                    if (i >= as.length)
                    {
                        break;
                    }
                    lengths[i] = Long.parseLong(as[i]);
                }
                catch (NumberFormatException numberformatexception)
                {
                    throw invalidLengths(as);
                }
                i++;
            } while (true);
        }

        Snapshot snapshot()
        {
            if (!Thread.holdsLock(DiskLruCache.this))
            {
                throw new AssertionError();
            }
            Source asource[] = new Source[valueCount];
            int i = 0;
            do
            {
                Snapshot snapshot1;
                try
                {
                    if (i >= valueCount)
                    {
                        break;
                    }
                    asource[i] = Okio.source(cleanFiles[i]);
                }
                catch (FileNotFoundException filenotfoundexception)
                {
                    for (int j = 0; j < valueCount && asource[j] != null; j++)
                    {
                        Util.closeQuietly(asource[j]);
                    }

                    return null;
                }
                i++;
            } while (true);
            snapshot1 = new Snapshot(key, sequenceNumber, asource, lengths);
            return snapshot1;
        }

        void writeLengths(BufferedSink bufferedsink)
            throws IOException
        {
            long al[] = lengths;
            int j = al.length;
            for (int i = 0; i < j; i++)
            {
                long l = al[i];
                bufferedsink.writeByte(32).writeUtf8(Long.toString(l));
            }

        }







/*
        static long access$1402(Entry entry, long l)
        {
            entry.sequenceNumber = l;
            return l;
        }

*/



/*
        static boolean access$602(Entry entry, boolean flag)
        {
            entry.readable = flag;
            return flag;
        }

*/



/*
        static Editor access$702(Entry entry, Editor editor)
        {
            entry.currentEditor = editor;
            return editor;
        }

*/


        private Entry(String s)
        {
            this$0 = DiskLruCache.this;
            super();
            key = s;
            lengths = new long[valueCount];
            cleanFiles = new File[valueCount];
            dirtyFiles = new File[valueCount];
            s = (new StringBuilder(s)).append('.');
            int j = s.length();
            for (int i = 0; i < valueCount; i++)
            {
                s.append(i);
                cleanFiles[i] = new File(directory, s.toString());
                s.append(".tmp");
                dirtyFiles[i] = new File(directory, s.toString());
                s.setLength(j);
            }

        }

    }

    public final class Snapshot
        implements Closeable
    {

        private final String key;
        private final long lengths[];
        private final long sequenceNumber;
        private final Source sources[];
        final DiskLruCache this$0;

        public void close()
        {
            Source asource[] = sources;
            int j = asource.length;
            for (int i = 0; i < j; i++)
            {
                Util.closeQuietly(asource[i]);
            }

        }

        public Editor edit()
            throws IOException
        {
            return DiskLruCache.this.edit(key, sequenceNumber);
        }

        public long getLength(int i)
        {
            return lengths[i];
        }

        public Source getSource(int i)
        {
            return sources[i];
        }

        public String getString(int i)
            throws IOException
        {
            return DiskLruCache.sourceToString(getSource(i));
        }

        public String key()
        {
            return key;
        }


        private Snapshot(String s, long l, Source asource[], long al[])
        {
            this$0 = DiskLruCache.this;
            super();
            key = s;
            sequenceNumber = l;
            sources = asource;
            lengths = al;
        }

        Snapshot(String s, long l, Source asource[], long al[], _cls1 _pcls1)
        {
            this(s, l, asource, al);
        }
    }


    static final long ANY_SEQUENCE_NUMBER = -1L;
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    static final String JOURNAL_FILE = "journal";
    static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    static final String JOURNAL_FILE_TEMP = "journal.tmp";
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    static final String MAGIC = "libcore.io.DiskLruCache";
    private static final Sink NULL_SINK = new Sink() {

        public void close()
            throws IOException
        {
        }

        public void flush()
            throws IOException
        {
        }

        public Timeout timeout()
        {
            return Timeout.NONE;
        }

        public void write(Buffer buffer, long l)
            throws IOException
        {
        }

    };
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    static final String VERSION_1 = "1";
    private final int appVersion;
    private final Runnable cleanupRunnable = new Runnable() {

        final DiskLruCache this$0;

        public void run()
        {
label0:
            {
                synchronized (DiskLruCache.this)
                {
                    if (journalWriter != null)
                    {
                        break label0;
                    }
                }
                return;
            }
            trimToSize();
            if (journalRebuildRequired())
            {
                rebuildJournal();
                redundantOpCount = 0;
            }
            disklrucache;
            JVM INSTR monitorexit ;
            return;
            exception;
            disklrucache;
            JVM INSTR monitorexit ;
            throw exception;
            IOException ioexception;
            ioexception;
            throw new RuntimeException(ioexception);
        }

            
            {
                this$0 = DiskLruCache.this;
                super();
            }
    };
    private final File directory;
    private final Executor executor;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private BufferedSink journalWriter;
    private final LinkedHashMap lruEntries = new LinkedHashMap(0, 0.75F, true);
    private long maxSize;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    DiskLruCache(File file, int i, int j, long l, Executor executor1)
    {
        size = 0L;
        nextSequenceNumber = 0L;
        directory = file;
        appVersion = i;
        journalFile = new File(file, "journal");
        journalFileTmp = new File(file, "journal.tmp");
        journalFileBackup = new File(file, "journal.bkp");
        valueCount = j;
        maxSize = l;
        executor = executor1;
    }

    private void checkNotClosed()
    {
        if (journalWriter == null)
        {
            throw new IllegalStateException("cache is closed");
        } else
        {
            return;
        }
    }

    private void completeEdit(Editor editor, boolean flag)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        Entry entry;
        entry = editor.entry;
        if (entry.currentEditor != editor)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_28;
        editor;
        this;
        JVM INSTR monitorexit ;
        throw editor;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (entry.readable) goto _L2; else goto _L3
_L3:
        int i = 0;
_L7:
        if (i >= valueCount) goto _L2; else goto _L4
_L4:
        if (!editor.written[i])
        {
            editor.abort();
            throw new IllegalStateException((new StringBuilder()).append("Newly created entry didn't create value for index ").append(i).toString());
        }
        if (entry.dirtyFiles[i].exists()) goto _L6; else goto _L5
_L5:
        editor.abort();
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        i++;
          goto _L7
_L2:
        i = 0;
_L10:
        if (i >= valueCount)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        editor = entry.dirtyFiles[i];
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        if (editor.exists())
        {
            File file = entry.cleanFiles[i];
            editor.renameTo(file);
            long l = entry.lengths[i];
            long l2 = file.length();
            entry.lengths[i] = l2;
            size = (size - l) + l2;
        }
        break MISSING_BLOCK_LABEL_431;
        deleteIfExists(editor);
        break MISSING_BLOCK_LABEL_431;
        redundantOpCount = redundantOpCount + 1;
        entry.currentEditor = null;
        if (!(entry.readable | flag))
        {
            break MISSING_BLOCK_LABEL_371;
        }
        entry.readable = true;
        journalWriter.writeUtf8("CLEAN").writeByte(32);
        journalWriter.writeUtf8(entry.key);
        entry.writeLengths(journalWriter);
        journalWriter.writeByte(10);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        long l1 = nextSequenceNumber;
        nextSequenceNumber = 1L + l1;
        entry.sequenceNumber = l1;
_L9:
        journalWriter.flush();
        if (size > maxSize || journalRebuildRequired())
        {
            executor.execute(cleanupRunnable);
        }
          goto _L8
        lruEntries.remove(entry.key);
        journalWriter.writeUtf8("REMOVE").writeByte(32);
        journalWriter.writeUtf8(entry.key);
        journalWriter.writeByte(10);
          goto _L9
        i++;
          goto _L10
    }

    private static void deleteIfExists(File file)
        throws IOException
    {
        if (!file.delete() && file.exists())
        {
            throw new IOException((new StringBuilder()).append("failed to delete ").append(file).toString());
        } else
        {
            return;
        }
    }

    private Editor edit(String s, long l)
        throws IOException
    {
        Editor editor = null;
        this;
        JVM INSTR monitorenter ;
        Entry entry;
        checkNotClosed();
        validateKey(s);
        entry = (Entry)lruEntries.get(s);
        if (l == -1L) goto _L2; else goto _L1
_L1:
        Object obj = editor;
        if (entry == null) goto _L4; else goto _L3
_L3:
        long l1 = entry.sequenceNumber;
        if (l1 == l) goto _L2; else goto _L5
_L5:
        obj = editor;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((Editor) (obj));
_L2:
        if (entry != null) goto _L7; else goto _L6
_L6:
        obj = new Entry(s);
        lruEntries.put(s, obj);
_L9:
        editor = new Editor(((Entry) (obj)));
        obj.currentEditor = editor;
        journalWriter.writeUtf8("DIRTY").writeByte(32).writeUtf8(s).writeByte(10);
        journalWriter.flush();
        obj = editor;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L7:
        Editor editor1 = entry.currentEditor;
        obj = entry;
        if (editor1 == null) goto _L9; else goto _L8
_L8:
        obj = editor;
        if (true) goto _L4; else goto _L10
_L10:
    }

    private boolean journalRebuildRequired()
    {
        return redundantOpCount >= 2000 && redundantOpCount >= lruEntries.size();
    }

    public static DiskLruCache open(File file, int i, int j, long l)
        throws IOException
    {
        if (l <= 0L)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (j <= 0)
        {
            throw new IllegalArgumentException("valueCount <= 0");
        } else
        {
            file = new DiskLruCache(file, i, j, l, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
            file.initialize();
            return file;
        }
    }

    private void processJournal()
        throws IOException
    {
        deleteIfExists(journalFileTmp);
        for (Iterator iterator = lruEntries.values().iterator(); iterator.hasNext();)
        {
            Entry entry = (Entry)iterator.next();
            if (entry.currentEditor == null)
            {
                int i = 0;
                while (i < valueCount) 
                {
                    size = size + entry.lengths[i];
                    i++;
                }
            } else
            {
                entry.currentEditor = null;
                for (int j = 0; j < valueCount; j++)
                {
                    deleteIfExists(entry.cleanFiles[j]);
                    deleteIfExists(entry.dirtyFiles[j]);
                }

                iterator.remove();
            }
        }

    }

    private void readJournal()
        throws IOException
    {
        BufferedSource bufferedsource = Okio.buffer(Okio.source(journalFile));
        String s = bufferedsource.readUtf8LineStrict();
        String s1 = bufferedsource.readUtf8LineStrict();
        String s2 = bufferedsource.readUtf8LineStrict();
        String s3 = bufferedsource.readUtf8LineStrict();
        String s4 = bufferedsource.readUtf8LineStrict();
        if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s1) || !Integer.toString(appVersion).equals(s2) || !Integer.toString(valueCount).equals(s3) || !"".equals(s4))
        {
            throw new IOException((new StringBuilder()).append("unexpected journal header: [").append(s).append(", ").append(s1).append(", ").append(s3).append(", ").append(s4).append("]").toString());
        }
        break MISSING_BLOCK_LABEL_181;
        Object obj;
        obj;
        Util.closeQuietly(bufferedsource);
        throw obj;
        int i = 0;
_L2:
        readJournalLine(bufferedsource.readUtf8LineStrict());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        redundantOpCount = i - lruEntries.size();
        if (bufferedsource.exhausted())
        {
            break MISSING_BLOCK_LABEL_236;
        }
        rebuildJournal();
_L3:
        Util.closeQuietly(bufferedsource);
        return;
        journalWriter = Okio.buffer(Okio.appendingSink(journalFile));
          goto _L3
    }

    private void readJournalLine(String s)
        throws IOException
    {
        int i;
        int j;
        int k;
        i = s.indexOf(' ');
        if (i == -1)
        {
            throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(s).toString());
        }
        j = i + 1;
        k = s.indexOf(' ', j);
        if (k != -1) goto _L2; else goto _L1
_L1:
        String s1;
        String s2;
        s2 = s.substring(j);
        s1 = s2;
        if (i != "REMOVE".length()) goto _L4; else goto _L3
_L3:
        s1 = s2;
        if (!s.startsWith("REMOVE")) goto _L4; else goto _L5
_L5:
        lruEntries.remove(s2);
_L7:
        return;
_L2:
        s1 = s.substring(j, k);
_L4:
        Entry entry1 = (Entry)lruEntries.get(s1);
        Entry entry = entry1;
        if (entry1 == null)
        {
            entry = new Entry(s1);
            lruEntries.put(s1, entry);
        }
        if (k != -1 && i == "CLEAN".length() && s.startsWith("CLEAN"))
        {
            s = s.substring(k + 1).split(" ");
            entry.readable = true;
            entry.currentEditor = null;
            entry.setLengths(s);
            return;
        }
        if (k == -1 && i == "DIRTY".length() && s.startsWith("DIRTY"))
        {
            entry.currentEditor = new Editor(entry);
            return;
        }
        if (k != -1 || i != "READ".length() || !s.startsWith("READ"))
        {
            throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(s).toString());
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void rebuildJournal()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (journalWriter != null)
        {
            journalWriter.close();
        }
        obj = Okio.buffer(Okio.sink(journalFileTmp));
        Iterator iterator;
        ((BufferedSink) (obj)).writeUtf8("libcore.io.DiskLruCache").writeByte(10);
        ((BufferedSink) (obj)).writeUtf8("1").writeByte(10);
        ((BufferedSink) (obj)).writeUtf8(Integer.toString(appVersion)).writeByte(10);
        ((BufferedSink) (obj)).writeUtf8(Integer.toString(valueCount)).writeByte(10);
        ((BufferedSink) (obj)).writeByte(10);
        iterator = lruEntries.values().iterator();
_L1:
        Entry entry;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_248;
            }
            entry = (Entry)iterator.next();
            if (entry.currentEditor == null)
            {
                break MISSING_BLOCK_LABEL_204;
            }
            ((BufferedSink) (obj)).writeUtf8("DIRTY").writeByte(32);
            ((BufferedSink) (obj)).writeUtf8(entry.key);
            ((BufferedSink) (obj)).writeByte(10);
        } while (true);
        Exception exception;
        exception;
        ((BufferedSink) (obj)).close();
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ((BufferedSink) (obj)).writeUtf8("CLEAN").writeByte(32);
        ((BufferedSink) (obj)).writeUtf8(entry.key);
        entry.writeLengths(((BufferedSink) (obj)));
        ((BufferedSink) (obj)).writeByte(10);
          goto _L1
        ((BufferedSink) (obj)).close();
        if (journalFile.exists())
        {
            renameTo(journalFile, journalFileBackup, true);
        }
        renameTo(journalFileTmp, journalFile, false);
        journalFileBackup.delete();
        journalWriter = Okio.buffer(Okio.appendingSink(journalFile));
        this;
        JVM INSTR monitorexit ;
    }

    private boolean removeEntry(Entry entry)
        throws IOException
    {
        if (entry.currentEditor != null)
        {
            entry.currentEditor.hasErrors = true;
        }
        for (int i = 0; i < valueCount; i++)
        {
            deleteIfExists(entry.cleanFiles[i]);
            size = size - entry.lengths[i];
            entry.lengths[i] = 0L;
        }

        redundantOpCount = redundantOpCount + 1;
        journalWriter.writeUtf8("REMOVE").writeByte(32).writeUtf8(entry.key).writeByte(10);
        lruEntries.remove(entry.key);
        if (journalRebuildRequired())
        {
            executor.execute(cleanupRunnable);
        }
        return true;
    }

    private static void renameTo(File file, File file1, boolean flag)
        throws IOException
    {
        if (flag)
        {
            deleteIfExists(file1);
        }
        if (!file.renameTo(file1))
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    private static String sourceToString(Source source)
        throws IOException
    {
        String s = Okio.buffer(source).readUtf8();
        Util.closeQuietly(source);
        return s;
        Exception exception;
        exception;
        Util.closeQuietly(source);
        throw exception;
    }

    private void trimToSize()
        throws IOException
    {
        while (size > maxSize) 
        {
            removeEntry((Entry)lruEntries.values().iterator().next());
        }
    }

    private void validateKey(String s)
    {
        if (!LEGAL_KEY_PATTERN.matcher(s).matches())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("keys must match regex [a-z0-9_-]{1,120}: \"").append(s).append("\"").toString());
        } else
        {
            return;
        }
    }

    public void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        BufferedSink bufferedsink = journalWriter;
        if (bufferedsink != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Entry aentry[];
        int j;
        aentry = (Entry[])lruEntries.values().toArray(new Entry[lruEntries.size()]);
        j = aentry.length;
        Exception exception;
        Entry entry;
        for (int i = 0; i >= j; i++)
        {
            break MISSING_BLOCK_LABEL_73;
        }

        entry = aentry[i];
        if (entry.currentEditor != null)
        {
            entry.currentEditor.abort();
        }
        break MISSING_BLOCK_LABEL_99;
        trimToSize();
        journalWriter.close();
        journalWriter = null;
        if (true) goto _L1; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public void delete()
        throws IOException
    {
        close();
        Util.deleteContents(directory);
    }

    public Editor edit(String s)
        throws IOException
    {
        return edit(s, -1L);
    }

    public void evictAll()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        Entry aentry[];
        int j;
        aentry = (Entry[])lruEntries.values().toArray(new Entry[lruEntries.size()]);
        j = aentry.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        removeEntry(aentry[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void flush()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        checkNotClosed();
        trimToSize();
        journalWriter.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public Snapshot get(String s)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        checkNotClosed();
        validateKey(s);
        obj = (Entry)lruEntries.get(s);
        if (obj == null) goto _L2; else goto _L1
_L1:
        boolean flag = ((Entry) (obj)).readable;
        if (flag) goto _L3; else goto _L2
_L2:
        s = null;
_L5:
        this;
        JVM INSTR monitorexit ;
        return s;
_L3:
        obj = ((Entry) (obj)).snapshot();
        if (obj == null)
        {
            s = null;
            continue; /* Loop/switch isn't completed */
        }
        redundantOpCount = redundantOpCount + 1;
        journalWriter.writeUtf8("READ").writeByte(32).writeUtf8(s).writeByte(10);
        s = ((String) (obj));
        if (!journalRebuildRequired())
        {
            continue; /* Loop/switch isn't completed */
        }
        executor.execute(cleanupRunnable);
        s = ((String) (obj));
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

    public File getDirectory()
    {
        return directory;
    }

    public long getMaxSize()
    {
        this;
        JVM INSTR monitorenter ;
        long l = maxSize;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    void initialize()
        throws IOException
    {
        if (journalFileBackup.exists())
        {
            if (journalFile.exists())
            {
                journalFileBackup.delete();
            } else
            {
                renameTo(journalFileBackup, journalFile, false);
            }
        }
        if (journalFile.exists())
        {
            try
            {
                readJournal();
                processJournal();
                return;
            }
            catch (IOException ioexception)
            {
                Platform.get().logW((new StringBuilder()).append("DiskLruCache ").append(directory).append(" is corrupt: ").append(ioexception.getMessage()).append(", removing").toString());
            }
            delete();
        }
        directory.mkdirs();
        rebuildJournal();
    }

    public boolean isClosed()
    {
        return journalWriter == null;
    }

    public boolean remove(String s)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        checkNotClosed();
        validateKey(s);
        s = (Entry)lruEntries.get(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = removeEntry(s);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void setMaxSize(long l)
    {
        this;
        JVM INSTR monitorenter ;
        maxSize = l;
        executor.execute(cleanupRunnable);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long size()
    {
        this;
        JVM INSTR monitorenter ;
        long l = size;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public Iterator snapshots()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = new Iterator() {

            final Iterator _flddelegate;
            Snapshot nextSnapshot;
            Snapshot removeSnapshot;
            final DiskLruCache this$0;

            public boolean hasNext()
            {
label0:
                {
                    if (nextSnapshot != null)
                    {
                        return true;
                    }
                    synchronized (DiskLruCache.this)
                    {
                        if (!isClosed())
                        {
                            break label0;
                        }
                    }
                    return false;
                }
                Snapshot snapshot;
                do
                {
                    if (!_flddelegate.hasNext())
                    {
                        break MISSING_BLOCK_LABEL_76;
                    }
                    snapshot = ((Entry)_flddelegate.next()).snapshot();
                } while (snapshot == null);
                nextSnapshot = snapshot;
                disklrucache;
                JVM INSTR monitorexit ;
                return true;
                exception1;
                disklrucache;
                JVM INSTR monitorexit ;
                throw exception1;
                disklrucache;
                JVM INSTR monitorexit ;
                return false;
            }

            public Snapshot next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                } else
                {
                    removeSnapshot = nextSnapshot;
                    nextSnapshot = null;
                    return removeSnapshot;
                }
            }

            public volatile Object next()
            {
                return next();
            }

            public void remove()
            {
                Exception exception1;
                if (removeSnapshot == null)
                {
                    throw new IllegalStateException("remove() before next()");
                }
                try
                {
                    DiskLruCache.this.remove(removeSnapshot.key);
                }
                catch (IOException ioexception)
                {
                    removeSnapshot = null;
                    return;
                }
                finally
                {
                    removeSnapshot = null;
                }
                removeSnapshot = null;
                return;
                throw exception1;
            }

            
            {
                this$0 = DiskLruCache.this;
                super();
                _flddelegate = (new ArrayList(lruEntries.values())).iterator();
            }
        };
        this;
        JVM INSTR monitorexit ;
        return iterator;
        Exception exception;
        exception;
        throw exception;
    }















/*
    static int access$402(DiskLruCache disklrucache, int i)
    {
        disklrucache.redundantOpCount = i;
        return i;
    }

*/
}
