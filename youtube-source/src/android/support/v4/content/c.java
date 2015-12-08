// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.content:
//            b

final class c
    implements b
{

    private final String a;
    private final HashMap b = new HashMap();

    public c(String s)
    {
        a = s;
    }

    public final Uri a(File file)
    {
        Object obj;
        String s;
        java.util.Map.Entry entry;
        Iterator iterator;
        String s1;
        try
        {
            s = file.getCanonicalPath();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder("Failed to resolve canonical path for ")).append(file).toString());
        }
        file = null;
        iterator = b.entrySet().iterator();
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)iterator.next();
        s1 = ((File)entry.getValue()).getPath();
        if (!s.startsWith(s1))
        {
            break MISSING_BLOCK_LABEL_271;
        }
        obj = entry;
        if (file != null)
        {
            if (s1.length() <= ((File)file.getValue()).getPath().length())
            {
                break MISSING_BLOCK_LABEL_271;
            }
            obj = entry;
        }
_L4:
        file = ((File) (obj));
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_22;
_L1:
        if (file == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Failed to find configured root that contains ")).append(s).toString());
        }
        obj = ((File)file.getValue()).getPath();
        if (((String) (obj)).endsWith("/"))
        {
            obj = s.substring(((String) (obj)).length());
        } else
        {
            obj = s.substring(((String) (obj)).length() + 1);
        }
        file = (new StringBuilder()).append(Uri.encode((String)file.getKey())).append('/').append(Uri.encode(((String) (obj)), "/")).toString();
        return (new android.net.Uri.Builder()).scheme("content").authority(a).encodedPath(file).build();
        obj = file;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final File a(Uri uri)
    {
        Object obj1 = uri.getEncodedPath();
        int i = ((String) (obj1)).indexOf('/', 1);
        Object obj = Uri.decode(((String) (obj1)).substring(1, i));
        obj1 = Uri.decode(((String) (obj1)).substring(i + 1));
        obj = (File)b.get(obj);
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Unable to find configured root for ")).append(uri).toString());
        }
        uri = new File(((File) (obj)), ((String) (obj1)));
        try
        {
            obj1 = uri.getCanonicalFile();
        }
        catch (IOException ioexception)
        {
            throw new IllegalArgumentException((new StringBuilder("Failed to resolve canonical path for ")).append(uri).toString());
        }
        if (!((File) (obj1)).getPath().startsWith(((File) (obj)).getPath()))
        {
            throw new SecurityException("Resolved path jumped beyond configured root");
        } else
        {
            return ((File) (obj1));
        }
    }

    public final void a(String s, File file)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Name must not be empty");
        }
        File file1;
        try
        {
            file1 = file.getCanonicalFile();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder("Failed to resolve canonical path for ")).append(file).toString(), s);
        }
        b.put(s, file1);
    }
}
