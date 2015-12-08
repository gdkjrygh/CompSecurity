// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.IOCase;

// Referenced classes of package org.apache.commons.io.filefilter:
//            IOFileFilter, AgeFileFilter, AndFileFilter, DelegateFileFilter, 
//            DirectoryFileFilter, FalseFileFilter, FileFileFilter, MagicNumberFileFilter, 
//            NameFileFilter, NotFileFilter, OrFileFilter, PrefixFileFilter, 
//            SizeFileFilter, SuffixFileFilter, TrueFileFilter

public class FileFilterUtils
{

    private static final IOFileFilter cvsFilter = notFileFilter(and(new IOFileFilter[] {
        directoryFileFilter(), nameFileFilter("CVS")
    }));
    private static final IOFileFilter svnFilter = notFileFilter(and(new IOFileFilter[] {
        directoryFileFilter(), nameFileFilter(".svn")
    }));

    public FileFilterUtils()
    {
    }

    public static IOFileFilter ageFileFilter(long l)
    {
        return new AgeFileFilter(l);
    }

    public static IOFileFilter ageFileFilter(long l, boolean flag)
    {
        return new AgeFileFilter(l, flag);
    }

    public static IOFileFilter ageFileFilter(File file)
    {
        return new AgeFileFilter(file);
    }

    public static IOFileFilter ageFileFilter(File file, boolean flag)
    {
        return new AgeFileFilter(file, flag);
    }

    public static IOFileFilter ageFileFilter(Date date)
    {
        return new AgeFileFilter(date);
    }

    public static IOFileFilter ageFileFilter(Date date, boolean flag)
    {
        return new AgeFileFilter(date, flag);
    }

    public static transient IOFileFilter and(IOFileFilter aiofilefilter[])
    {
        return new AndFileFilter(toList(aiofilefilter));
    }

    public static IOFileFilter andFileFilter(IOFileFilter iofilefilter, IOFileFilter iofilefilter1)
    {
        return new AndFileFilter(iofilefilter, iofilefilter1);
    }

    public static IOFileFilter asFileFilter(FileFilter filefilter)
    {
        return new DelegateFileFilter(filefilter);
    }

    public static IOFileFilter asFileFilter(FilenameFilter filenamefilter)
    {
        return new DelegateFileFilter(filenamefilter);
    }

    public static IOFileFilter directoryFileFilter()
    {
        return DirectoryFileFilter.DIRECTORY;
    }

    public static IOFileFilter falseFileFilter()
    {
        return FalseFileFilter.FALSE;
    }

    public static IOFileFilter fileFileFilter()
    {
        return FileFileFilter.FILE;
    }

    private static Collection filter(IOFileFilter iofilefilter, Iterable iterable, Collection collection)
    {
        if (iofilefilter == null)
        {
            throw new IllegalArgumentException("file filter is null");
        }
        if (iterable != null)
        {
            iterable = iterable.iterator();
            do
            {
                if (!iterable.hasNext())
                {
                    break;
                }
                File file = (File)iterable.next();
                if (file == null)
                {
                    throw new IllegalArgumentException("file collection contains null");
                }
                if (iofilefilter.accept(file))
                {
                    collection.add(file);
                }
            } while (true);
        }
        return collection;
    }

    public static File[] filter(IOFileFilter iofilefilter, Iterable iterable)
    {
        iofilefilter = filterList(iofilefilter, iterable);
        return (File[])iofilefilter.toArray(new File[iofilefilter.size()]);
    }

    public static transient File[] filter(IOFileFilter iofilefilter, File afile[])
    {
        if (iofilefilter == null)
        {
            throw new IllegalArgumentException("file filter is null");
        }
        if (afile == null)
        {
            return new File[0];
        }
        ArrayList arraylist = new ArrayList();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file = afile[i];
            if (file == null)
            {
                throw new IllegalArgumentException("file array contains null");
            }
            if (iofilefilter.accept(file))
            {
                arraylist.add(file);
            }
        }

        return (File[])arraylist.toArray(new File[arraylist.size()]);
    }

    public static List filterList(IOFileFilter iofilefilter, Iterable iterable)
    {
        return (List)filter(iofilefilter, iterable, new ArrayList());
    }

    public static transient List filterList(IOFileFilter iofilefilter, File afile[])
    {
        return Arrays.asList(filter(iofilefilter, afile));
    }

    public static Set filterSet(IOFileFilter iofilefilter, Iterable iterable)
    {
        return (Set)filter(iofilefilter, iterable, new HashSet());
    }

    public static transient Set filterSet(IOFileFilter iofilefilter, File afile[])
    {
        return new HashSet(Arrays.asList(filter(iofilefilter, afile)));
    }

    public static IOFileFilter magicNumberFileFilter(String s)
    {
        return new MagicNumberFileFilter(s);
    }

    public static IOFileFilter magicNumberFileFilter(String s, long l)
    {
        return new MagicNumberFileFilter(s, l);
    }

    public static IOFileFilter magicNumberFileFilter(byte abyte0[])
    {
        return new MagicNumberFileFilter(abyte0);
    }

    public static IOFileFilter magicNumberFileFilter(byte abyte0[], long l)
    {
        return new MagicNumberFileFilter(abyte0, l);
    }

    public static IOFileFilter makeCVSAware(IOFileFilter iofilefilter)
    {
        if (iofilefilter == null)
        {
            return cvsFilter;
        } else
        {
            return and(new IOFileFilter[] {
                iofilefilter, cvsFilter
            });
        }
    }

    public static IOFileFilter makeDirectoryOnly(IOFileFilter iofilefilter)
    {
        if (iofilefilter == null)
        {
            return DirectoryFileFilter.DIRECTORY;
        } else
        {
            return new AndFileFilter(DirectoryFileFilter.DIRECTORY, iofilefilter);
        }
    }

    public static IOFileFilter makeFileOnly(IOFileFilter iofilefilter)
    {
        if (iofilefilter == null)
        {
            return FileFileFilter.FILE;
        } else
        {
            return new AndFileFilter(FileFileFilter.FILE, iofilefilter);
        }
    }

    public static IOFileFilter makeSVNAware(IOFileFilter iofilefilter)
    {
        if (iofilefilter == null)
        {
            return svnFilter;
        } else
        {
            return and(new IOFileFilter[] {
                iofilefilter, svnFilter
            });
        }
    }

    public static IOFileFilter nameFileFilter(String s)
    {
        return new NameFileFilter(s);
    }

    public static IOFileFilter nameFileFilter(String s, IOCase iocase)
    {
        return new NameFileFilter(s, iocase);
    }

    public static IOFileFilter notFileFilter(IOFileFilter iofilefilter)
    {
        return new NotFileFilter(iofilefilter);
    }

    public static transient IOFileFilter or(IOFileFilter aiofilefilter[])
    {
        return new OrFileFilter(toList(aiofilefilter));
    }

    public static IOFileFilter orFileFilter(IOFileFilter iofilefilter, IOFileFilter iofilefilter1)
    {
        return new OrFileFilter(iofilefilter, iofilefilter1);
    }

    public static IOFileFilter prefixFileFilter(String s)
    {
        return new PrefixFileFilter(s);
    }

    public static IOFileFilter prefixFileFilter(String s, IOCase iocase)
    {
        return new PrefixFileFilter(s, iocase);
    }

    public static IOFileFilter sizeFileFilter(long l)
    {
        return new SizeFileFilter(l);
    }

    public static IOFileFilter sizeFileFilter(long l, boolean flag)
    {
        return new SizeFileFilter(l, flag);
    }

    public static IOFileFilter sizeRangeFileFilter(long l, long l1)
    {
        return new AndFileFilter(new SizeFileFilter(l, true), new SizeFileFilter(1L + l1, false));
    }

    public static IOFileFilter suffixFileFilter(String s)
    {
        return new SuffixFileFilter(s);
    }

    public static IOFileFilter suffixFileFilter(String s, IOCase iocase)
    {
        return new SuffixFileFilter(s, iocase);
    }

    public static transient List toList(IOFileFilter aiofilefilter[])
    {
        if (aiofilefilter == null)
        {
            throw new IllegalArgumentException("The filters must not be null");
        }
        ArrayList arraylist = new ArrayList(aiofilefilter.length);
        for (int i = 0; i < aiofilefilter.length; i++)
        {
            if (aiofilefilter[i] == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("The filter[").append(i).append("] is null").toString());
            }
            arraylist.add(aiofilefilter[i]);
        }

        return arraylist;
    }

    public static IOFileFilter trueFileFilter()
    {
        return TrueFileFilter.TRUE;
    }

}
