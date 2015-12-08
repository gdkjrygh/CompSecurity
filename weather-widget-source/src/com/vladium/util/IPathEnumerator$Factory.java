// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import com.vladium.logging.Logger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

// Referenced classes of package com.vladium.util:
//            IPathEnumerator, Files

public static abstract class PathEnumerator.m_log
{
    private static final class PathEnumerator
        implements IPathEnumerator
    {

        private static final boolean IGNORE_INVALID_ENTRIES = true;
        private final boolean m_canonical;
        private File m_currentPathDir;
        private final IPathEnumerator.IPathHandler m_handler;
        private final Logger m_log = Logger.getLogger();
        private final ArrayList m_path;
        private int m_pathIndex;
        private final Set m_pathSet;
        private final boolean m_processManifest = true;
        private boolean m_trace1;
        private boolean m_verbose;

        private void enumeratePathArchive(String s)
            throws IOException
        {
            Object obj;
            Object obj2;
            File file;
            boolean flag;
            flag = m_trace1;
            file = new File(m_currentPathDir, s);
            obj2 = null;
            obj = null;
            Object obj1 = new JarInputStream(new BufferedInputStream(new FileInputStream(file), 32768));
            IPathEnumerator.IPathHandler ipathhandler;
            ipathhandler = m_handler;
            obj2 = ((JarInputStream) (obj1)).getManifest();
            obj = obj2;
            if (obj2 != null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            obj = readManifestViaJarFile(file);
            ipathhandler.handleArchiveStart(m_currentPathDir, new File(s), ((Manifest) (obj)));
_L3:
            s = ((JarInputStream) (obj1)).getNextEntry();
            if (s == null) goto _L2; else goto _L1
_L1:
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_147;
            }
            m_log.trace1("enumeratePathArchive", (new StringBuilder()).append("processing archive entry [").append(s.getName()).append("] ...").toString());
            ipathhandler.handleArchiveEntry(((JarInputStream) (obj1)), s);
            ((JarInputStream) (obj1)).closeEntry();
              goto _L3
            s;
_L20:
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_172;
            }
            ((JarInputStream) (obj1)).close();
            return;
_L2:
            if (!m_processManifest) goto _L5; else goto _L4
_L4:
            s = ((String) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_191;
            }
            s = ((JarInputStream) (obj1)).getManifest();
            if (s == null) goto _L5; else goto _L6
_L6:
            s = s.getMainAttributes();
            if (s == null) goto _L5; else goto _L7
_L7:
            s = s.getValue(java.util.jar.Attributes.Name.CLASS_PATH);
            if (s == null) goto _L5; else goto _L8
_L8:
            obj2 = new StringTokenizer(s);
            int i = 1;
_L15:
            if (!((StringTokenizer) (obj2)).hasMoreTokens()) goto _L5; else goto _L9
_L9:
            s = ((StringTokenizer) (obj2)).nextToken();
            obj = file.getParentFile();
            if (obj == null) goto _L11; else goto _L10
_L10:
            s = new File(((File) (obj)), s);
_L16:
            if (!m_canonical) goto _L13; else goto _L12
_L12:
            obj = Files.canonicalizePathname(s.getPath());
_L17:
            if (!m_pathSet.add(obj)) goto _L15; else goto _L14
_L14:
            int k;
            if (m_verbose)
            {
                m_log.verbose((new StringBuilder()).append("  added manifest Class-Path entry [").append(s).append("]").toString());
            }
            obj = m_path;
            k = m_pathIndex;
            int j = i + 1;
            ((ArrayList) (obj)).add(k + i, s);
            i = j;
              goto _L15
_L11:
            s = new File(s);
              goto _L16
            s;
_L18:
            if (obj1 != null)
            {
                try
                {
                    ((JarInputStream) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            throw s;
_L13:
            obj = s.getPath();
              goto _L17
_L5:
            if (obj1 != null)
            {
                try
                {
                    ((JarInputStream) (obj1)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return;
                }
            } else
            {
                return;
            }
            s;
            return;
            s;
            obj1 = obj2;
              goto _L18
            s;
            obj1 = obj;
            if (true) goto _L20; else goto _L19
_L19:
        }

        private void enumeratePathDir(String s)
            throws IOException
        {
            boolean flag = m_trace1;
            File file2 = m_currentPathDir;
            File file;
            String as[];
            IPathEnumerator.IPathHandler ipathhandler;
            int i;
            int j;
            if (s != null)
            {
                file = new File(file2, s);
            } else
            {
                file = file2;
            }
            as = file.list();
            ipathhandler = m_handler;
            i = 0;
            j = as.length;
            while (i < j) 
            {
                String s1 = as[i];
                File file1;
                if (s != null)
                {
                    file1 = new File(s, s1);
                } else
                {
                    file1 = new File(s1);
                }
                if ((new File(file, s1)).isDirectory())
                {
                    ipathhandler.handleDirStart(file2, file1);
                    if (flag)
                    {
                        m_log.trace1("enumeratePathDir", (new StringBuilder()).append("recursing into [").append(file1.getName()).append("] ...").toString());
                    }
                    enumeratePathDir(file1.getPath());
                    ipathhandler.handleDirEnd(file2, file1);
                } else
                {
                    if (flag)
                    {
                        m_log.trace1("enumeratePathDir", (new StringBuilder()).append("processing file [").append(file1.getName()).append("] ...").toString());
                    }
                    ipathhandler.handleFile(file2, file1);
                }
                i++;
            }
        }

        private static Manifest readManifestViaJarFile(File file)
        {
            Object obj;
            Manifest manifest;
            Object obj2;
            obj = null;
            manifest = null;
            obj2 = null;
            file = new JarFile(file, false);
            manifest = file.getManifest();
            obj = manifest;
            if (file == null)
            {
                break MISSING_BLOCK_LABEL_81;
            }
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return ((Manifest) (obj));
            }
_L2:
            return ((Manifest) (obj));
            file;
            file = obj2;
_L5:
            if (file == null) goto _L2; else goto _L1
_L1:
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return null;
            }
            return null;
            file;
            obj = manifest;
_L4:
            if (obj != null)
            {
                try
                {
                    ((JarFile) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            throw file;
            Object obj1;
            obj1;
            obj = file;
            file = ((File) (obj1));
            if (true) goto _L4; else goto _L3
_L3:
            obj1;
              goto _L5
              goto _L2
            return ((Manifest) (obj));
        }

        public void enumerate()
            throws IOException
        {
            IPathEnumerator.IPathHandler ipathhandler = m_handler;
            m_pathIndex = 0;
            while (m_pathIndex < m_path.size()) 
            {
                File file = (File)m_path.get(m_pathIndex);
                if (file.exists())
                {
                    if (file.isDirectory())
                    {
                        if (m_verbose)
                        {
                            m_log.verbose((new StringBuilder()).append("processing dir path entry [").append(file.getAbsolutePath()).append("] ...").toString());
                        }
                        m_currentPathDir = file;
                        enumeratePathDir(null);
                    } else
                    {
                        String s = file.getName();
                        String s1 = s.toLowerCase();
                        if (s1.endsWith(".zip") || s1.endsWith(".jar"))
                        {
                            if (m_verbose)
                            {
                                m_log.verbose((new StringBuilder()).append("processing archive path entry [").append(file.getAbsolutePath()).append("] ...").toString());
                            }
                            file = file.getParentFile();
                            File file1 = new File(s);
                            m_currentPathDir = file;
                            enumeratePathArchive(s);
                            ipathhandler.handleArchiveEnd(file, file1);
                        }
                    }
                }
                m_pathIndex = m_pathIndex + 1;
            }
        }

        PathEnumerator(File afile[], boolean flag, IPathEnumerator.IPathHandler ipathhandler)
        {
            m_path = new ArrayList(afile.length);
            for (int i = 0; i < afile.length; i++)
            {
                m_path.add(afile[i]);
            }

            m_canonical = flag;
            if (ipathhandler == null)
            {
                throw new IllegalArgumentException("null input: handler");
            }
            m_handler = ipathhandler;
            if (m_processManifest)
            {
                m_pathSet = new HashSet(afile.length);
                for (int j = 0; j < afile.length; j++)
                {
                    m_pathSet.add(afile[j].getPath());
                }

            } else
            {
                m_pathSet = null;
            }
            m_verbose = m_log.atVERBOSE();
            m_trace1 = m_log.atTRACE1();
        }
    }


    public static IPathEnumerator create(File afile[], boolean flag, dler dler)
    {
        return new PathEnumerator(afile, flag, dler);
    }

    public PathEnumerator.m_log()
    {
    }
}
