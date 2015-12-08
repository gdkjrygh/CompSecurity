// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.reflect:
//            Reflection

public final class ClassPath
{
    public static final class ClassInfo extends ResourceInfo
    {

        private final String className;

        public String getName()
        {
            return className;
        }

        public String getPackageName()
        {
            return Reflection.getPackageName(className);
        }

        public String getSimpleName()
        {
            int i = className.lastIndexOf('$');
            if (i != -1)
            {
                String s = className.substring(i + 1);
                return CharMatcher.DIGIT.trimLeadingFrom(s);
            }
            String s1 = getPackageName();
            if (s1.isEmpty())
            {
                return className;
            } else
            {
                return className.substring(s1.length() + 1);
            }
        }

        public Class load()
        {
            Class class1;
            try
            {
                class1 = loader.loadClass(className);
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                throw new IllegalStateException(classnotfoundexception);
            }
            return class1;
        }

        public String toString()
        {
            return className;
        }


        ClassInfo(String s, ClassLoader classloader)
        {
            super(s, classloader);
            className = ClassPath.getClassName(s);
        }
    }

    public static class ResourceInfo
    {

        final ClassLoader loader;
        private final String resourceName;

        static ResourceInfo of(String s, ClassLoader classloader)
        {
            if (s.endsWith(".class"))
            {
                return new ClassInfo(s, classloader);
            } else
            {
                return new ResourceInfo(s, classloader);
            }
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof ResourceInfo)
            {
                obj = (ResourceInfo)obj;
                flag = flag1;
                if (resourceName.equals(((ResourceInfo) (obj)).resourceName))
                {
                    flag = flag1;
                    if (loader == ((ResourceInfo) (obj)).loader)
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public final String getResourceName()
        {
            return resourceName;
        }

        public int hashCode()
        {
            return resourceName.hashCode();
        }

        public String toString()
        {
            return resourceName;
        }

        public final URL url()
        {
            return (URL)Preconditions.checkNotNull(loader.getResource(resourceName), "Failed to load resource: %s", new Object[] {
                resourceName
            });
        }

        ResourceInfo(String s, ClassLoader classloader)
        {
            resourceName = (String)Preconditions.checkNotNull(s);
            loader = (ClassLoader)Preconditions.checkNotNull(classloader);
        }
    }

    static final class Scanner
    {

        private final com.google.common.collect.ImmutableSortedSet.Builder resources = new com.google.common.collect.ImmutableSortedSet.Builder(Ordering.usingToString());
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
            com.google.common.collect.ImmutableSet.Builder builder;
            if (manifest == null)
            {
                return ImmutableSet.of();
            }
            builder = ImmutableSet.builder();
            manifest = manifest.getMainAttributes().getValue(java.util.jar.Attributes.Name.CLASS_PATH.toString());
            if (manifest == null) goto _L2; else goto _L1
_L1:
            Iterator iterator = ClassPath.CLASS_PATH_ATTRIBUTE_SEPARATOR.split(manifest).iterator();
_L3:
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            manifest = (String)iterator.next();
            URI uri = getClassPathEntry(file, manifest);
            builder.add(uri);
            continue; /* Loop/switch isn't completed */
            URISyntaxException urisyntaxexception;
            urisyntaxexception;
            Logger logger1 = ClassPath.logger;
            manifest = String.valueOf(manifest);
            if (manifest.length() != 0)
            {
                manifest = "Invalid Class-Path entry: ".concat(manifest);
            } else
            {
                manifest = new String("Invalid Class-Path entry: ");
            }
            logger1.warning(manifest);
            if (true) goto _L3; else goto _L2
_L2:
            return builder.build();
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
                    classloader = ClassPath.logger;
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
                            resources.add(ResourceInfo.of(file, classloader));
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
                    resources.add(ResourceInfo.of(jarentry.getName(), classloader));
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

        Scanner()
        {
        }
    }


    private static final String CLASS_FILE_NAME_EXTENSION = ".class";
    private static final Splitter CLASS_PATH_ATTRIBUTE_SEPARATOR = Splitter.on(" ").omitEmptyStrings();
    private static final Predicate IS_TOP_LEVEL = new Predicate() {

        public boolean apply(ClassInfo classinfo)
        {
            return classinfo.className.indexOf('$') == -1;
        }

        public volatile boolean apply(Object obj)
        {
            return apply((ClassInfo)obj);
        }

    };
    private static final Logger logger = Logger.getLogger(com/google/common/reflect/ClassPath.getName());
    private final ImmutableSet resources;

    private ClassPath(ImmutableSet immutableset)
    {
        resources = immutableset;
    }

    public static ClassPath from(ClassLoader classloader)
        throws IOException
    {
        Scanner scanner = new Scanner();
        java.util.Map.Entry entry;
        for (classloader = getClassPathEntries(classloader).entrySet().iterator(); classloader.hasNext(); scanner.scan((URI)entry.getKey(), (ClassLoader)entry.getValue()))
        {
            entry = (java.util.Map.Entry)classloader.next();
        }

        return new ClassPath(scanner.getResources());
    }

    static String getClassName(String s)
    {
        return s.substring(0, s.length() - ".class".length()).replace('/', '.');
    }

    static ImmutableMap getClassPathEntries(ClassLoader classloader)
    {
        LinkedHashMap linkedhashmap = Maps.newLinkedHashMap();
        ClassLoader classloader1 = classloader.getParent();
        if (classloader1 != null)
        {
            linkedhashmap.putAll(getClassPathEntries(classloader1));
        }
        if (classloader instanceof URLClassLoader)
        {
            URL aurl[] = ((URLClassLoader)classloader).getURLs();
            int j = aurl.length;
            int i = 0;
            while (i < j) 
            {
                Object obj = aurl[i];
                try
                {
                    obj = ((URL) (obj)).toURI();
                }
                // Misplaced declaration of an exception variable
                catch (ClassLoader classloader)
                {
                    throw new IllegalArgumentException(classloader);
                }
                if (!linkedhashmap.containsKey(obj))
                {
                    linkedhashmap.put(obj, classloader);
                }
                i++;
            }
        }
        return ImmutableMap.copyOf(linkedhashmap);
    }

    public ImmutableSet getAllClasses()
    {
        return FluentIterable.from(resources).filter(com/google/common/reflect/ClassPath$ClassInfo).toSet();
    }

    public ImmutableSet getResources()
    {
        return resources;
    }

    public ImmutableSet getTopLevelClasses()
    {
        return FluentIterable.from(resources).filter(com/google/common/reflect/ClassPath$ClassInfo).filter(IS_TOP_LEVEL).toSet();
    }

    public ImmutableSet getTopLevelClasses(String s)
    {
        Preconditions.checkNotNull(s);
        com.google.common.collect.ImmutableSet.Builder builder = ImmutableSet.builder();
        Iterator iterator = getTopLevelClasses().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ClassInfo classinfo = (ClassInfo)iterator.next();
            if (classinfo.getPackageName().equals(s))
            {
                builder.add(classinfo);
            }
        } while (true);
        return builder.build();
    }

    public ImmutableSet getTopLevelClassesRecursive(String s)
    {
        Preconditions.checkNotNull(s);
        s = String.valueOf(String.valueOf(s));
        s = (new StringBuilder(s.length() + 1)).append(s).append(".").toString();
        com.google.common.collect.ImmutableSet.Builder builder = ImmutableSet.builder();
        Iterator iterator = getTopLevelClasses().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ClassInfo classinfo = (ClassInfo)iterator.next();
            if (classinfo.getName().startsWith(s))
            {
                builder.add(classinfo);
            }
        } while (true);
        return builder.build();
    }



}
