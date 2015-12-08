// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.reflect:
//            ClassPath

static final class 
{

    private final com.google.common.collect..Builder resources = new com.google.common.collect..Builder(Ordering.usingToString());
    private final Set scannedUris = Sets.newHashSet();

    static URI getClassPathEntry(File file, String s)
        throws URISyntaxException
    {
        URI uri = new URI(s);
        if (uri.isAbsolute())
        {
            return uri;
        } else
        {
            return (new File(file.getParentFile(), s.replace('/', File.separatorChar))).toURI();
        }
    }

    static ImmutableSet getClassPathFromManifest(File file, Manifest manifest)
    {
        com.google.common.collect.er er;
        if (manifest == null)
        {
            return ImmutableSet.of();
        }
        er = ImmutableSet.builder();
        manifest = manifest.getMainAttributes().getValue(java.util.jar.ASS_PATH.String());
        if (manifest == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = ClassPath.access$200().split(manifest).iterator();
_L3:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        manifest = (String)iterator.next();
        URI uri = getClassPathEntry(file, manifest);
        er.add(uri);
        continue; /* Loop/switch isn't completed */
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
        Logger logger = ClassPath.access$100();
        manifest = String.valueOf(manifest);
        if (manifest.length() != 0)
        {
            manifest = "Invalid Class-Path entry: ".concat(manifest);
        } else
        {
            manifest = new String("Invalid Class-Path entry: ");
        }
        logger.warning(manifest);
        if (true) goto _L3; else goto _L2
_L2:
        return er.build();
    }

    private void scanDirectory(File file, ClassLoader classloader)
        throws IOException
    {
        scanDirectory(file, classloader, "", ImmutableSet.of());
    }

    private void scanDirectory(File file, ClassLoader classloader, String s, ImmutableSet immutableset)
        throws IOException
    {
        File file1 = file.getCanonicalFile();
        if (!immutableset.contains(file1))
        {
            File afile[] = file.listFiles();
            if (afile == null)
            {
                classloader = ClassPath.access$100();
                file = String.valueOf(String.valueOf(file));
                classloader.warning((new StringBuilder(file.length() + 22)).append("Cannot read directory ").append(file).toString());
                return;
            }
            immutableset = ImmutableSet.builder().addAll(immutableset).add(file1).build();
            int j = afile.length;
            int i = 0;
            while (i < j) 
            {
                file = afile[i];
                String s1 = file.getName();
                if (file.isDirectory())
                {
                    String s2 = String.valueOf(String.valueOf(s));
                    s1 = String.valueOf(String.valueOf(s1));
                    scanDirectory(file, classloader, (new StringBuilder(s2.length() + 1 + s1.length())).append(s2).append(s1).append("/").toString(), immutableset);
                } else
                {
                    file = String.valueOf(s);
                    s1 = String.valueOf(s1);
                    if (s1.length() != 0)
                    {
                        file = file.concat(s1);
                    } else
                    {
                        file = new String(file);
                    }
                    if (!file.equals("META-INF/MANIFEST.MF"))
                    {
                        resources.add(Info.of(file, classloader));
                    }
                }
                i++;
            }
        }
    }

    private void scanJar(File file, ClassLoader classloader)
        throws IOException
    {
        JarFile jarfile;
        try
        {
            jarfile = new JarFile(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
        for (file = getClassPathFromManifest(file, jarfile.getManifest()).iterator(); file.hasNext(); scan((URI)file.next(), classloader)) { }
        break MISSING_BLOCK_LABEL_56;
        file;
        JarEntry jarentry;
        try
        {
            jarfile.close();
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader) { }
        throw file;
        file = jarfile.entries();
        do
        {
            if (!file.hasMoreElements())
            {
                break;
            }
            jarentry = (JarEntry)file.nextElement();
            if (!jarentry.isDirectory() && !jarentry.getName().equals("META-INF/MANIFEST.MF"))
            {
                resources.add(Info.of(jarentry.getName(), classloader));
            }
        } while (true);
        try
        {
            jarfile.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
    }

    ImmutableSortedSet getResources()
    {
        return resources.build();
    }

    void scan(URI uri, ClassLoader classloader)
        throws IOException
    {
        if (uri.getScheme().equals("file") && scannedUris.add(uri))
        {
            scanFrom(new File(uri), classloader);
        }
    }

    void scanFrom(File file, ClassLoader classloader)
        throws IOException
    {
        if (!file.exists())
        {
            return;
        }
        if (file.isDirectory())
        {
            scanDirectory(file, classloader);
            return;
        } else
        {
            scanJar(file, classloader);
            return;
        }
    }

    ()
    {
    }
}
