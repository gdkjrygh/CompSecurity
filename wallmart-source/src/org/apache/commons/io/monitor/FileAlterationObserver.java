// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.monitor;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.comparator.NameFileComparator;

// Referenced classes of package org.apache.commons.io.monitor:
//            FileEntry, FileAlterationListener

public class FileAlterationObserver
    implements Serializable
{

    private final Comparator comparator;
    private final FileFilter fileFilter;
    private final List listeners;
    private final FileEntry rootEntry;

    public FileAlterationObserver(File file)
    {
        this(file, (FileFilter)null);
    }

    public FileAlterationObserver(File file, FileFilter filefilter)
    {
        this(file, filefilter, (IOCase)null);
    }

    public FileAlterationObserver(File file, FileFilter filefilter, IOCase iocase)
    {
        this(new FileEntry(file), filefilter, iocase);
    }

    public FileAlterationObserver(String s)
    {
        this(new File(s));
    }

    public FileAlterationObserver(String s, FileFilter filefilter)
    {
        this(new File(s), filefilter);
    }

    public FileAlterationObserver(String s, FileFilter filefilter, IOCase iocase)
    {
        this(new File(s), filefilter, iocase);
    }

    protected FileAlterationObserver(FileEntry fileentry, FileFilter filefilter, IOCase iocase)
    {
        listeners = new CopyOnWriteArrayList();
        if (fileentry == null)
        {
            throw new IllegalArgumentException("Root entry is missing");
        }
        if (fileentry.getFile() == null)
        {
            throw new IllegalArgumentException("Root directory is missing");
        }
        rootEntry = fileentry;
        fileFilter = filefilter;
        if (iocase == null || iocase.equals(IOCase.SYSTEM))
        {
            comparator = NameFileComparator.NAME_SYSTEM_COMPARATOR;
            return;
        }
        if (iocase.equals(IOCase.INSENSITIVE))
        {
            comparator = NameFileComparator.NAME_INSENSITIVE_COMPARATOR;
            return;
        } else
        {
            comparator = NameFileComparator.NAME_COMPARATOR;
            return;
        }
    }

    private void checkAndNotify(FileEntry fileentry, FileEntry afileentry[], File afile[])
    {
        int i = 0;
        FileEntry afileentry1[];
        int j;
        int k;
        int l;
        if (afile.length > 0)
        {
            afileentry1 = new FileEntry[afile.length];
        } else
        {
            afileentry1 = FileEntry.EMPTY_ENTRIES;
        }
        l = afileentry.length;
        j = 0;
        do
        {
            k = i;
            if (j >= l)
            {
                break;
            }
            FileEntry fileentry1;
            for (fileentry1 = afileentry[j]; i < afile.length && comparator.compare(fileentry1.getFile(), afile[i]) > 0; i++)
            {
                afileentry1[i] = createFileEntry(fileentry, afile[i]);
                doCreate(afileentry1[i]);
            }

            if (i < afile.length && comparator.compare(fileentry1.getFile(), afile[i]) == 0)
            {
                doMatch(fileentry1, afile[i]);
                checkAndNotify(fileentry1, fileentry1.getChildren(), listFiles(afile[i]));
                afileentry1[i] = fileentry1;
                i++;
            } else
            {
                checkAndNotify(fileentry1, fileentry1.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
                doDelete(fileentry1);
            }
            j++;
        } while (true);
        for (; k < afile.length; k++)
        {
            afileentry1[k] = createFileEntry(fileentry, afile[k]);
            doCreate(afileentry1[k]);
        }

        fileentry.setChildren(afileentry1);
    }

    private FileEntry createFileEntry(FileEntry fileentry, File file)
    {
        FileEntry fileentry1 = fileentry.newChildInstance(file);
        fileentry1.refresh(file);
        file = listFiles(file);
        int i;
        if (file.length > 0)
        {
            fileentry = new FileEntry[file.length];
        } else
        {
            fileentry = FileEntry.EMPTY_ENTRIES;
        }
        for (i = 0; i < file.length; i++)
        {
            fileentry[i] = createFileEntry(fileentry1, file[i]);
        }

        fileentry1.setChildren(fileentry);
        return fileentry1;
    }

    private void doCreate(FileEntry fileentry)
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext();)
        {
            FileAlterationListener filealterationlistener = (FileAlterationListener)iterator.next();
            if (fileentry.isDirectory())
            {
                filealterationlistener.onDirectoryCreate(fileentry.getFile());
            } else
            {
                filealterationlistener.onFileCreate(fileentry.getFile());
            }
        }

        fileentry = fileentry.getChildren();
        int j = fileentry.length;
        for (int i = 0; i < j; i++)
        {
            doCreate(fileentry[i]);
        }

    }

    private void doDelete(FileEntry fileentry)
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext();)
        {
            FileAlterationListener filealterationlistener = (FileAlterationListener)iterator.next();
            if (fileentry.isDirectory())
            {
                filealterationlistener.onDirectoryDelete(fileentry.getFile());
            } else
            {
                filealterationlistener.onFileDelete(fileentry.getFile());
            }
        }

    }

    private void doMatch(FileEntry fileentry, File file)
    {
        if (fileentry.refresh(file))
        {
            for (Iterator iterator = listeners.iterator(); iterator.hasNext();)
            {
                FileAlterationListener filealterationlistener = (FileAlterationListener)iterator.next();
                if (fileentry.isDirectory())
                {
                    filealterationlistener.onDirectoryChange(file);
                } else
                {
                    filealterationlistener.onFileChange(file);
                }
            }

        }
    }

    private File[] listFiles(File file)
    {
        File afile[] = null;
        if (file.isDirectory())
        {
            if (fileFilter == null)
            {
                afile = file.listFiles();
            } else
            {
                afile = file.listFiles(fileFilter);
            }
        }
        file = afile;
        if (afile == null)
        {
            file = FileUtils.EMPTY_FILE_ARRAY;
        }
        if (comparator != null && file.length > 1)
        {
            Arrays.sort(file, comparator);
        }
        return file;
    }

    public void addListener(FileAlterationListener filealterationlistener)
    {
        if (filealterationlistener != null)
        {
            listeners.add(filealterationlistener);
        }
    }

    public void checkAndNotify()
    {
        File file;
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((FileAlterationListener)iterator.next()).onStart(this)) { }
        file = rootEntry.getFile();
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        checkAndNotify(rootEntry, rootEntry.getChildren(), listFiles(file));
_L4:
        for (Iterator iterator1 = listeners.iterator(); iterator1.hasNext(); ((FileAlterationListener)iterator1.next()).onStop(this)) { }
        break; /* Loop/switch isn't completed */
_L2:
        if (rootEntry.isExists())
        {
            checkAndNotify(rootEntry, rootEntry.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void destroy()
        throws Exception
    {
    }

    public File getDirectory()
    {
        return rootEntry.getFile();
    }

    public FileFilter getFileFilter()
    {
        return fileFilter;
    }

    public Iterable getListeners()
    {
        return listeners;
    }

    public void initialize()
        throws Exception
    {
        rootEntry.refresh(rootEntry.getFile());
        File afile[] = listFiles(rootEntry.getFile());
        FileEntry afileentry[];
        int i;
        if (afile.length > 0)
        {
            afileentry = new FileEntry[afile.length];
        } else
        {
            afileentry = FileEntry.EMPTY_ENTRIES;
        }
        for (i = 0; i < afile.length; i++)
        {
            afileentry[i] = createFileEntry(rootEntry, afile[i]);
        }

        rootEntry.setChildren(afileentry);
    }

    public void removeListener(FileAlterationListener filealterationlistener)
    {
        if (filealterationlistener != null)
        {
            while (listeners.remove(filealterationlistener)) ;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName());
        stringbuilder.append("[file='");
        stringbuilder.append(getDirectory().getPath());
        stringbuilder.append('\'');
        if (fileFilter != null)
        {
            stringbuilder.append(", ");
            stringbuilder.append(fileFilter.toString());
        }
        stringbuilder.append(", listeners=");
        stringbuilder.append(listeners.size());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
