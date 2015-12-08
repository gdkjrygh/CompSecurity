// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.monitor;

import java.io.File;
import java.io.Serializable;

public class FileEntry
    implements Serializable
{

    static final FileEntry EMPTY_ENTRIES[] = new FileEntry[0];
    private FileEntry children[];
    private boolean directory;
    private boolean exists;
    private final File file;
    private long lastModified;
    private long length;
    private String name;
    private final FileEntry parent;

    public FileEntry(File file1)
    {
        this((FileEntry)null, file1);
    }

    public FileEntry(FileEntry fileentry, File file1)
    {
        if (file1 == null)
        {
            throw new IllegalArgumentException("File is missing");
        } else
        {
            file = file1;
            parent = fileentry;
            name = file1.getName();
            return;
        }
    }

    public FileEntry[] getChildren()
    {
        if (children != null)
        {
            return children;
        } else
        {
            return EMPTY_ENTRIES;
        }
    }

    public File getFile()
    {
        return file;
    }

    public long getLastModified()
    {
        return lastModified;
    }

    public long getLength()
    {
        return length;
    }

    public int getLevel()
    {
        if (parent == null)
        {
            return 0;
        } else
        {
            return parent.getLevel() + 1;
        }
    }

    public String getName()
    {
        return name;
    }

    public FileEntry getParent()
    {
        return parent;
    }

    public boolean isDirectory()
    {
        return directory;
    }

    public boolean isExists()
    {
        return exists;
    }

    public FileEntry newChildInstance(File file1)
    {
        return new FileEntry(this, file1);
    }

    public boolean refresh(File file1)
    {
label0:
        {
            long l1 = 0L;
            boolean flag1 = false;
            boolean flag2 = exists;
            long l2 = lastModified;
            boolean flag3 = directory;
            long l3 = length;
            name = file1.getName();
            exists = file1.exists();
            long l;
            boolean flag;
            if (exists)
            {
                flag = file1.isDirectory();
            } else
            {
                flag = false;
            }
            directory = flag;
            if (exists)
            {
                l = file1.lastModified();
            } else
            {
                l = 0L;
            }
            lastModified = l;
            l = l1;
            if (exists)
            {
                l = l1;
                if (!directory)
                {
                    l = file1.length();
                }
            }
            length = l;
            if (exists == flag2 && lastModified == l2 && directory == flag3)
            {
                flag = flag1;
                if (length == l3)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public void setChildren(FileEntry afileentry[])
    {
        children = afileentry;
    }

    public void setDirectory(boolean flag)
    {
        directory = flag;
    }

    public void setExists(boolean flag)
    {
        exists = flag;
    }

    public void setLastModified(long l)
    {
        lastModified = l;
    }

    public void setLength(long l)
    {
        length = l;
    }

    public void setName(String s)
    {
        name = s;
    }

}
