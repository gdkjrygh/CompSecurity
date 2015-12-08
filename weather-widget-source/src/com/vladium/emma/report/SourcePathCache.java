// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class SourcePathCache
{
    private static final class CacheEntry
    {

        final Set m_listings[];

        CacheEntry(int i)
        {
            m_listings = new Set[i];
        }
    }

    private static final class FileExtensionFilter
        implements FileFilter
    {

        private final String m_extension;

        private static String canonicalizeExtension(String s)
        {
            String s1 = s;
            if (s.charAt(0) != '.')
            {
                s1 = ".".concat(s);
            }
            return s1;
        }

        public boolean accept(File file)
        {
            if (!file.isDirectory())
            {
                file = file.getName();
                int i = file.lastIndexOf('.');
                if (i > 0)
                {
                    return m_extension.equals(file.substring(i));
                }
            }
            return false;
        }

        public String toString()
        {
            return (new StringBuilder()).append(super.toString()).append(", extension = [").append(m_extension).append("]").toString();
        }

        FileExtensionFilter(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("null input: extension");
            }
            String s1 = canonicalizeExtension(s);
            if (s.length() <= 1)
            {
                throw new IllegalArgumentException("empty input: extension");
            } else
            {
                m_extension = s1;
                return;
            }
        }
    }


    private static final FileExtensionFilter FILE_EXTENSION_FILTER = new FileExtensionFilter(".java");
    private final Map m_packageCache;
    private final File m_sourcepath[];

    public SourcePathCache(File afile[], boolean flag)
    {
        if (afile == null)
        {
            throw new IllegalArgumentException("null input: sourcepath");
        }
        ArrayList arraylist = new ArrayList(afile.length);
        for (int i = 0; i < afile.length; i++)
        {
            File file = afile[i];
            if (!flag || file.isDirectory() && file.exists())
            {
                arraylist.add(file);
            }
        }

        m_sourcepath = new File[arraylist.size()];
        arraylist.toArray(m_sourcepath);
        m_packageCache = new HashMap();
    }

    public SourcePathCache(String as[], boolean flag)
    {
        if (as == null)
        {
            throw new IllegalArgumentException("null input: sourcepath");
        }
        ArrayList arraylist = new ArrayList(as.length);
        for (int i = 0; i < as.length; i++)
        {
            File file = new File(as[i]);
            if (!flag || file.isDirectory() && file.exists())
            {
                arraylist.add(file);
            }
        }

        m_sourcepath = new File[arraylist.size()];
        arraylist.toArray(m_sourcepath);
        m_packageCache = new HashMap();
    }

    private Set faultListing(File file, String s)
    {
        File afile[] = (new File(file, s.replace('/', File.separatorChar))).listFiles(FILE_EXTENSION_FILTER);
        if (afile != null && afile.length != 0) goto _L2; else goto _L1
_L1:
        file = Collections.EMPTY_SET;
_L4:
        return file;
_L2:
        s = new HashSet(afile.length);
        int i = 0;
        do
        {
            file = s;
            if (i >= afile.length)
            {
                continue;
            }
            s.add(afile[i].getName());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public File find(String s, String s1)
    {
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        throw new IllegalArgumentException("null input: packageVMName");
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        throw new IllegalArgumentException("null input: name");
        int i = m_sourcepath.length;
        if (i != 0) goto _L2; else goto _L1
_L1:
        Object obj = obj1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((File) (obj));
_L2:
        CacheEntry cacheentry = (CacheEntry)m_packageCache.get(s);
        obj = cacheentry;
        if (cacheentry != null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        obj = new CacheEntry(m_sourcepath.length);
        m_packageCache.put(s, obj);
        Set aset[] = ((CacheEntry) (obj)).m_listings;
        i = 0;
_L6:
        obj = obj1;
        if (i >= aset.length) goto _L4; else goto _L3
_L3:
        Set set = aset[i];
        obj = set;
        if (set != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        obj = faultListing(m_sourcepath[i], s);
        aset[i] = ((Set) (obj));
label0:
        {
            if (!((Set) (obj)).contains(s1))
            {
                break label0;
            }
            s = new File(s.replace('/', File.separatorChar), s1);
            obj = (new File(m_sourcepath[i], s.getPath())).getAbsoluteFile();
        }
        if (true) goto _L4; else goto _L5
_L5:
        i++;
          goto _L6
    }

}
